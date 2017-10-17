package com.jzachlittle.doinmearescue.DaggerModules;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DogFinderRetrofitModule_ProvideHttpClientFactory
    implements Factory<OkHttpClient> {
  private final DogFinderRetrofitModule module;

  public DogFinderRetrofitModule_ProvideHttpClientFactory(DogFinderRetrofitModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return Preconditions.checkNotNull(
        module.provideHttpClient(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient> create(DogFinderRetrofitModule module) {
    return new DogFinderRetrofitModule_ProvideHttpClientFactory(module);
  }
}
