## 核心组件使用说明

### 本组件是一个项目的基础架构，详细请查看每个包下的 **PackageInfo** 文件说明。

#### [Hilt官方接入指南](https://developer.android.google.cn/training/dependency-injection/hilt-android)
#### 其他项目在使用Hilt依赖注入时，需要注意：每个使用hilt的module都需要单独正常依赖，否则无法正常运行。可以参考 [官方文档](https://developer.android.google.cn/training/dependency-injection/hilt-multi-module) 说明

#### 其他项目在使用本Module时，需要按以下配置方式进行使用：
- 在项目自定义的Application中，添加如下注解，示例代码：
```
@HiltAndroidApp // 一定不能忘记，否则不发正常运行 @link https://developer.android.google.cn/training/dependency-injection/hilt-android
class App : BasicApp() {
}
```
- 需要提供网络模块部分的相关配置，示例代码如下：
```
/**
 * Describe:应用级别的 model
 * Created by lyons on 2020/12/04.
 */
@Module
@InstallIn(ApplicationComponent::class) // 绑定到应用的生命周期上，这样的话，对象的生命周期就是跟随应用的生命周期
class CoroutineAppModule {

    @Provides
    fun provideNetworkConfig() : NetworkCommunicationConfig {
        val configure = NetworkCommunicationConfig.Configure()
        configure.domain = "http://api.think.yingshe.com"
        // config common params
        configure.commonRequestParams.putAll(mapOf(
            "source" to "default",
            "device" to "2",
            "version" to "1.0.4",
            "imei" to "864630039776801",
            "oaid" to "",
            "androidid" to "fb6ade292cf37e24",
            "mac" to "94:65:2d:68:bc:3f",
            "uid" to "23"
        ))
        return configure.config()
    }

    /**
     * the business server api
     */
    @Provides
    @Singleton
    fun provideCoroutineRemoteApi(retrofit : Retrofit) : CoroutineRemoteApi {
        return retrofit.create(CoroutineRemoteApi::class.java)
    }

    /**
     * provide the CoroutineRemoteDataSource
     */
    @Provides
    @Singleton
    fun provideCoroutineRemoteDataSource(coroutineRemoteApi : CoroutineRemoteApi) : CoroutineRemoteDataSource {
        return CoroutineRemoteDataSource(coroutineRemoteApi)
    }
}
```
- 在View层级上需要添加配置注解，比如Activity上：
```
@AndroidEntryPoint // 描述一定不能忘记，否则不发正常运行
class MainActivity : BasicActivity() {
}
```