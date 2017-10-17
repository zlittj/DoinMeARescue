package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi;

@kotlin.Metadata(mv = {1, 1, 7}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BU\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0007H\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\t\u00107\u001a\u00020\u000bH\u00c6\u0003J\t\u00108\u001a\u00020\rH\u00c6\u0003J\t\u00109\u001a\u00020\u000fH\u00c6\u0003J\t\u0010:\u001a\u00020\u0011H\u00c6\u0003JY\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010?\u001a\u00020@H\u00d6\u0001J\t\u0010A\u001a\u00020BH\u00d6\u0001R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006C"}, d2 = {"Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Contact;", "", "phone", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Phone;", "state", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/State;", "address2", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address2;", "email", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Email;", "city", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/City;", "zip", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Zip;", "fax", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Fax;", "address1", "Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address1;", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Phone;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/State;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address2;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Email;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/City;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Zip;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Fax;Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address1;)V", "getAddress1", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address1;", "setAddress1", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address1;)V", "getAddress2", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address2;", "setAddress2", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Address2;)V", "getCity", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/City;", "setCity", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/City;)V", "getEmail", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Email;", "setEmail", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Email;)V", "getFax", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Fax;", "setFax", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Fax;)V", "getPhone", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Phone;", "setPhone", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Phone;)V", "getState", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/State;", "setState", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/State;)V", "getZip", "()Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Zip;", "setZip", "(Lcom/jzachlittle/doinmearescue/DogSearch/DogSearchApi/Zip;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class Contact {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "phone")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone phone;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "state")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State state;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address2")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 address2;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "email")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email email;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "city")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City city;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "zip")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip zip;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "fax")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax fax;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "address1")
    private com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 address1;
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State getState() {
        return null;
    }
    
    public final void setState(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 getAddress2() {
        return null;
    }
    
    public final void setAddress2(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip getZip() {
        return null;
    }
    
    public final void setZip(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax getFax() {
        return null;
    }
    
    public final void setFax(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 getAddress1() {
        return null;
    }
    
    public final void setAddress1(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 p0) {
    }
    
    public Contact(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone phone, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State state, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 address2, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email email, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City city, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip zip, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax fax, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 address1) {
        super();
    }
    
    public Contact() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Contact copy(@org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Phone phone, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.State state, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address2 address2, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Email email, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.City city, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Zip zip, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Fax fax, @org.jetbrains.annotations.NotNull()
    com.jzachlittle.doinmearescue.DogSearch.DogSearchApi.Address1 address1) {
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