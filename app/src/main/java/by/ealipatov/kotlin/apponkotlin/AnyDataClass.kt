package by.ealipatov.kotlin.apponkotlin

data class AnyDataClass (val name : String = "", val age : Int = 0) {
    override fun toString(): String {
        return "$name $age"
    }

    fun propertyName(): String {
        return "Name, Age"
    }

}