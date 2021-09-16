package com.common.core.module;

import com.common.core.module.config.NetworkCommunicationConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> clientProvider;

  private final Provider<NetworkCommunicationConfig> configProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<NetworkCommunicationConfig> configProvider) {
    this.module = module;
    this.clientProvider = clientProvider;
    this.configProvider = configProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, clientProvider.get(), configProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<OkHttpClient> clientProvider, Provider<NetworkCommunicationConfig> configProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, clientProvider, configProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, OkHttpClient client,
      NetworkCommunicationConfig config) {
    return Preconditions.checkNotNull(instance.provideRetrofit(client, config), "Cannot return null from a non-@Nullable @Provides method");
  }
}
