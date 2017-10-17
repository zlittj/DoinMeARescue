package com.jzachlittle.doinmearescue.DaggerModules;

import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DogFinderRetrofitModule_ProvideDogFinderRetrofitFactory
    implements Factory<DogSearchApi> {
  private final DogFinderRetrofitModule module;

  private final Provider<OkHttpClient> arg0Provider;

  public DogFinderRetrofitModule_ProvideDogFinderRetrofitFactory(
      DogFinderRetrofitModule module, Provider<OkHttpClient> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public DogSearchApi get() {
    return Preconditions.checkNotNull(
        module.provideDogFinderRetrofit(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DogSearchApi> create(
      DogFinderRetrofitModule module, Provider<OkHttpClient> arg0Provider) {
    return new DogFinderRetrofitModule_ProvideDogFinderRetrofitFactory(module, arg0Provider);
  }
}
