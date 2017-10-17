package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bS\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00a5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0002\u0010 \u001a\u00020!\u00a2\u0006\u0002\u0010\"J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0015H\u00c6\u0003J\t\u0010e\u001a\u00020\u0017H\u00c6\u0003J\t\u0010f\u001a\u00020\u0019H\u00c6\u0003J\t\u0010g\u001a\u00020\u001bH\u00c6\u0003J\t\u0010h\u001a\u00020\u001dH\u00c6\u0003J\t\u0010i\u001a\u00020\u001fH\u00c6\u0003J\t\u0010j\u001a\u00020!H\u00c6\u0003J\t\u0010k\u001a\u00020\u0005H\u00c6\u0003J\t\u0010l\u001a\u00020\u0007H\u00c6\u0003J\t\u0010m\u001a\u00020\tH\u00c6\u0003J\t\u0010n\u001a\u00020\u000bH\u00c6\u0003J\t\u0010o\u001a\u00020\rH\u00c6\u0003J\t\u0010p\u001a\u00020\u000fH\u00c6\u0003J\t\u0010q\u001a\u00020\u0011H\u00c6\u0003J\t\u0010r\u001a\u00020\u0013H\u00c6\u0003J\u00a9\u0001\u0010s\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020!H\u00c6\u0001J\u0013\u0010t\u001a\u00020u2\b\u0010v\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010w\u001a\u00020xH\u00d6\u0001J\t\u0010y\u001a\u00020zH\u00d6\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010 \u001a\u00020!8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001e\u0010\u001e\u001a\u00020\u001f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001e\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010`\"\u0004\ba\u0010b\u00a8\u0006{"}, d2 = {"Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Pet;", "", "options", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Options;", "status", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Status;", "contact", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Contact;", "age", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Age;", "size", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Size;", "media", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Media;", "id", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Id;", "shelterPetId", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterPetId;", "breeds", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Breeds;", "name", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Name;", "sex", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Sex;", "description", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Description;", "mix", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Mix;", "shelterId", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterId;", "lastUpdate", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/LastUpdate;", "animal", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Animal;", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Options;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Status;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Contact;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Age;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Size;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Media;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Id;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterPetId;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Breeds;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Name;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Sex;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Description;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Mix;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterId;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/LastUpdate;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Animal;)V", "getAge", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Age;", "setAge", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Age;)V", "getAnimal", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Animal;", "setAnimal", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Animal;)V", "getBreeds", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Breeds;", "setBreeds", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Breeds;)V", "getContact", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Contact;", "setContact", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Contact;)V", "getDescription", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Description;", "setDescription", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Description;)V", "getId", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Id;", "setId", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Id;)V", "getLastUpdate", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/LastUpdate;", "setLastUpdate", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/LastUpdate;)V", "getMedia", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Media;", "setMedia", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Media;)V", "getMix", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Mix;", "setMix", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Mix;)V", "getName", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Name;", "setName", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Name;)V", "getOptions", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Options;", "setOptions", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Options;)V", "getSex", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Sex;", "setSex", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Sex;)V", "getShelterId", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterId;", "setShelterId", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterId;)V", "getShelterPetId", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterPetId;", "setShelterPetId", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/ShelterPetId;)V", "getSize", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Size;", "setSize", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Size;)V", "getStatus", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Status;", "setStatus", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Status;)V", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Pet {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "options")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options options;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "status")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status status;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "contact")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact contact;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "age")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age age;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "size")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size size;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "media")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media media;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "id")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id id;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shelterPetId")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId shelterPetId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "breeds")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds breeds;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "name")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name name;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "sex")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex sex;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "description")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description description;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "mix")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix mix;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "shelterId")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId shelterId;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "lastUpdate")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate lastUpdate;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "animal")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal animal;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options getOptions() {
        return null;
    }
    
    public final void setOptions(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact getContact() {
        return null;
    }
    
    public final void setContact(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age getAge() {
        return null;
    }
    
    public final void setAge(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size getSize() {
        return null;
    }
    
    public final void setSize(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media getMedia() {
        return null;
    }
    
    public final void setMedia(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId getShelterPetId() {
        return null;
    }
    
    public final void setShelterPetId(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds getBreeds() {
        return null;
    }
    
    public final void setBreeds(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex getSex() {
        return null;
    }
    
    public final void setSex(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix getMix() {
        return null;
    }
    
    public final void setMix(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId getShelterId() {
        return null;
    }
    
    public final void setShelterId(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate getLastUpdate() {
        return null;
    }
    
    public final void setLastUpdate(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal getAnimal() {
        return null;
    }
    
    public final void setAnimal(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal p0) {
    }
    
    public Pet(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options options, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status status, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact contact, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age age, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size size, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media media, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id id, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId shelterPetId, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds breeds, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name name, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex sex, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description description, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix mix, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId shelterId, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate lastUpdate, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal animal) {
        super();
    }
    
    public Pet() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Pet copy(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Options options, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Status status, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact contact, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Age age, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Size size, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Media media, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Id id, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterPetId shelterPetId, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Breeds breeds, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Name name, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Sex sex, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Description description, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Mix mix, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.ShelterId shelterId, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.LastUpdate lastUpdate, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Animal animal) {
        return null;
    }
    
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(java.lang.Object p0) {
        return false;
    }
}