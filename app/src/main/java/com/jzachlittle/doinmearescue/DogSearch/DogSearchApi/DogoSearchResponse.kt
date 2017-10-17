package com.jzachlittle.doinmearescue.DogSearch.DogSearchApi

import com.google.gson.annotations.SerializedName


class DogoSearchResponse(val data: DogoData) {
}

data class DogoData(
        @SerializedName("@encoding") var encoding: String = "",
        @SerializedName("@version") var version: String = "",
        @SerializedName("petfinder") var petfinder: Petfinder = Petfinder()
)

data class Petfinder(
        @SerializedName("@xmlns:xsi") var xmlnsxsi: String = "",
        @SerializedName("lastOffset") var lastOffset: LastOffset = LastOffset(),
        @SerializedName("pets") var pets: Pets = Pets(),
        @SerializedName("header") var header: Header = Header(),
        @SerializedName("@xsi:noNamespaceSchemaLocation") var xsinoNamespaceSchemaLocation: String = ""
)

data class LastOffset(
        @SerializedName("\$t") var t: String = ""
)

data class Pets(
        @SerializedName("pet") var pet: List<Pet> = listOf()
)

data class Pet(
        @SerializedName("options") var options: Options = Options(),
        @SerializedName("status") var status: Status = Status(),
        @SerializedName("contact") var contact: Contact = Contact(),
        @SerializedName("age") var age: Age = Age(),
        @SerializedName("size") var size: Size = Size(),
        @SerializedName("media") var media: Media = Media(),
        @SerializedName("id") var id: Id = Id(),
        @SerializedName("shelterPetId") var shelterPetId: ShelterPetId = ShelterPetId(),
        @SerializedName("breeds") var breeds: Breeds = Breeds(),
        @SerializedName("name") var name: Name = Name(),
        @SerializedName("sex") var sex: Sex = Sex(),
        @SerializedName("description") var description: Description = Description(),
        @SerializedName("mix") var mix: Mix = Mix(),
        @SerializedName("shelterId") var shelterId: ShelterId = ShelterId(),
        @SerializedName("lastUpdate") var lastUpdate: LastUpdate = LastUpdate(),
        @SerializedName("animal") var animal: Animal = Animal()
)

data class Breeds(
        @SerializedName("breed") var breed: List<Breed> = listOf()
)

data class Breed(
        @SerializedName("\$t") var t: String = ""
)

data class Id(
        @SerializedName("\$t") var t: String = ""
)

data class Size(
        @SerializedName("\$t") var t: String = ""
)

data class ShelterPetId(
        @SerializedName("\$t") var t: String = ""
)

data class Age(
        @SerializedName("\$t") var t: String = ""
)

data class Mix(
        @SerializedName("\$t") var t: String = ""
)

data class ShelterId(
        @SerializedName("\$t") var t: String = ""
)

data class Name(
        @SerializedName("\$t") var t: String = ""
)

data class Description(
        @SerializedName("\$t") var t: String = ""
)

data class LastUpdate(
        @SerializedName("\$t") var t: String = ""
)

data class Media(
        @SerializedName("photos") var photos: Photos = Photos()
)

data class Photos(
        @SerializedName("photo") var photo: List<Photo> = listOf()
)

data class Photo(
        @SerializedName("@size") var size: String = "",
        @SerializedName("\$t") var t: String = "",
        @SerializedName("@id") var id: String = ""
)

data class Sex(
        @SerializedName("\$t") var t: String = ""
)

data class Animal(
        @SerializedName("\$t") var t: String = ""
)

data class Contact(
        @SerializedName("phone") var phone: Phone = Phone(),
        @SerializedName("state") var state: State = State(),
        @SerializedName("address2") var address2: Address2 = Address2(),
        @SerializedName("email") var email: Email = Email(),
        @SerializedName("city") var city: City = City(),
        @SerializedName("zip") var zip: Zip = Zip(),
        @SerializedName("fax") var fax: Fax = Fax(),
        @SerializedName("address1") var address1: Address1 = Address1()
)

data class City(
        @SerializedName("\$t") var t: String = ""
)

data class Zip(
        @SerializedName("\$t") var t: String = ""
)

data class State(
        @SerializedName("\$t") var t: String = ""
)

data class Email(
        @SerializedName("\$t") var t: String = ""
)

data class Address1(
        @SerializedName("\$t") var t: String = ""
)

data class Address2(
        @SerializedName("\$t") var t: String = ""
)

data class Fax(
        @SerializedName("\$t") var t: String = ""
)

data class Phone(
        @SerializedName("\$t") var t: String = ""
)

data class Options(
        @SerializedName("\$t") var t: String = ""
)

data class Header(
        @SerializedName("timestamp") var timestamp: Timestamp = Timestamp(),
        @SerializedName("status") var status: Status = Status(),
        @SerializedName("version") var version: Version = Version()
)

data class Version(
        @SerializedName("\$t") var t: String = ""
)

data class Timestamp(
        @SerializedName("\$t") var t: String = ""
)

data class Status(
        @SerializedName("message") var message: Message = Message(),
        @SerializedName("code") var code: Code = Code()
)

data class Code(
        @SerializedName("\$t") var t: String = ""
)

data class Message(
        @SerializedName("\$t") var t: String = ""
)
