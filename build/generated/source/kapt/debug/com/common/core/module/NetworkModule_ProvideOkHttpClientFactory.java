package com.common.core.module;

import com.common.core.module.config.NetworkCommunicationConfig;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  private final Provider<NetworkCommunicationConfig> configProvider;

  public NetworkModule_ProvideOkHttpClientFactory(NetworkModule module,
      Provider<NetworkCommunicationConfig> configProvider) {
    this.module = module;
    this.configProvider = configProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(module, configProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(NetworkModule module,
      Provider<NetworkCommunicationConfig> configProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(module, configProvider);
  }

  public static OkHttpClient provideOkHttpClient(NetworkModule instance,
      NetworkCommunicationConfig config) {
    return Preconditions.checkNotNull(instance.provideOkHttpClient(config), "Cannot return null from a non-@Nullable @Provides method");
  }
}
