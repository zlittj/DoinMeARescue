package com.jzachlittle.doinmearescue.DaggerModules;

import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi;
import com.jzachlittle.doinmearescue.DogSearch.DogSearchPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DogSearchModule_ProvideDogSearchPresenterFactory
    implements Factory<DogSearchPresenter> {
  private final DogSearchModule module;

  private final Provider<DogSearchApi> arg0Provider;

  public DogSearchModule_ProvideDogSearchPresenterFactory(
      DogSearchModule module, Provider<DogSearchApi> arg0Provider) {
    assert module != null;
    this.module = module;
    assert arg0Provider != null;
    this.arg0Provider = arg0Provider;
  }

  @Override
  public DogSearchPresenter get() {
    return Preconditions.checkNotNull(
        module.provideDogSearchPresenter(arg0Provider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<DogSearchPresenter> create(
      DogSearchModule module, Provider<DogSearchApi> arg0Provider) {
    return new DogSearchModule_ProvideDogSearchPresenterFactory(module, arg0Provider);
  }
}
