package com.jzachlittle.doinmearescue.DaggerModules;

import com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi;
import com.jzachlittle.doinmearescue.DogSearch.DogSearchFragment;
import com.jzachlittle.doinmearescue.DogSearch.DogSearchPresenter;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerAppComponent implements AppComponent {
  private Provider<OkHttpClient> provideHttpClientProvider;

  private Provider<DogSearchApi> provideDogFinderRetrofitProvider;

  private Provider<DogSearchPresenter> provideDogSearchPresenterProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static AppComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideHttpClientProvider =
        DoubleCheck.provider(
            DogFinderRetrofitModule_ProvideHttpClientFactory.create(
                builder.dogFinderRetrofitModule));

    this.provideDogFinderRetrofitProvider =
        DoubleCheck.provider(
            DogFinderRetrofitModule_ProvideDogFinderRetrofitFactory.create(
                builder.dogFinderRetrofitModule, provideHttpClientProvider));

    this.provideDogSearchPresenterProvider =
        DoubleCheck.provider(
            DogSearchModule_ProvideDogSearchPresenterFactory.create(
                builder.dogSearchModule, provideDogFinderRetrofitProvider));
  }

  @Override
  public void inject(DogSearchFragment arg0) {
    MembersInjectors.<DogSearchFragment>noOp().injectMembers(arg0);
  }

  @Override
  public void inject(DogSearchPresenter arg0) {
    MembersInjectors.<DogSearchPresenter>noOp().injectMembers(arg0);
  }

  @Override
  public DogSearchPresenter dogSearchPresenter() {
    return provideDogSearchPresenterProvider.get();
  }

  public static final class Builder {
    private DogFinderRetrofitModule dogFinderRetrofitModule;

    private DogSearchModule dogSearchModule;

    private Builder() {}

    public AppComponent build() {
      if (dogFinderRetrofitModule == null) {
        this.dogFinderRetrofitModule = new DogFinderRetrofitModule();
      }
      if (dogSearchModule == null) {
        this.dogSearchModule = new DogSearchModule();
      }
      return new DaggerAppComponent(this);
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://google.github.io/dagger/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder dogFinderRetrofitModule(DogFinderRetrofitModule dogFinderRetrofitModule) {
      this.dogFinderRetrofitModule = Preconditions.checkNotNull(dogFinderRetrofitModule);
      return this;
    }

    public Builder dogSearchModule(DogSearchModule dogSearchModule) {
      this.dogSearchModule = Preconditions.checkNotNull(dogSearchModule);
      return this;
    }
  }
}
