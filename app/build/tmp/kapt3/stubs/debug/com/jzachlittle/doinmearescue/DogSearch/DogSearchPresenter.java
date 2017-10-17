package com.jzachlittle.doinmearescue.DogSearch;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0016J\'\u0010\u0018\u001a\u0004\u0018\u00010\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0016H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\t\u00a8\u0006\u001c"}, d2 = {"Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchPresenter;", "Lcom/hannesdorfmann/mosby3/mvp/MvpPresenter;", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchView;", "()V", "dogSearchApi", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogSearchApi;", "getDogSearchApi", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogSearchApi;", "setDogSearchApi", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogSearchApi;)V", "tag", "", "attachView", "", "view", "detachView", "retainInstance", "", "getDogData", "Lretrofit2/Call;", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogoSearchResponse;", "queryMap", "", "", "getResponse", "(Ljava/util/Map;Lkotlin/coroutines/experimental/Continuation;)Ljava/lang/Object;", "startQuery", "", "app_debug"})
public final class DogSearchPresenter implements com.hannesdorfmann.mosby3.mvp.MvpPresenter<com.jzachlittle.doinmearescue.DogSearch.DogSearchView> {
    @org.jetbrains.annotations.NotNull()
    @kotlin.reflect.jvm.internal.impl.javax.inject.Inject()
    public com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi dogSearchApi;
    private final java.lang.String tag = "DogSearchPresenter";
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi getDogSearchApi() {
        return null;
    }
    
    public final void setDogSearchApi(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogSearchApi p0) {
    }
    
    @java.lang.Override()
    public void attachView(@org.jetbrains.annotations.Nullable()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchView view) {
    }
    
    @java.lang.Override()
    public void detachView(boolean retainInstance) {
    }
    
    private final java.lang.Object startQuery(java.util.Map<java.lang.String, java.lang.Integer> queryMap) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getResponse(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> queryMap, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.experimental.Continuation<? super com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogoSearchResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Call<com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogoSearchResponse> getDogData(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Integer> queryMap) {
        return null;
    }
    
    public DogSearchPresenter() {
        super();
    }
}