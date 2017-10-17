package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogSearchApi;", "", "breedList", "Lretrofit2/Call;", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/DogoSearchResponse;", "map", "", "", "", "app_debug"})
public abstract interface DogSearchApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/breed.list")
    public abstract retrofit2.Call<com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.DogoSearchResponse> breedList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.QueryMap()
    java.util.Map<java.lang.String, java.lang.Integer> map);
}