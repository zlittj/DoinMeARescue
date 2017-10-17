package com.jzachlittle.doinmearescue.DaggerModules;

import com.jzachlittle.doinmearescue.RescueApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideContextFactory implements Factory<RescueApplication> {
  private final AppModule module;

  public AppModule_ProvideContextFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public RescueApplication get() {
    return Preconditions.checkNotNull(
        module.provideContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<RescueApplication> create(AppModule module) {
    return new AppModule_ProvideContextFactory(module);
  }
}
