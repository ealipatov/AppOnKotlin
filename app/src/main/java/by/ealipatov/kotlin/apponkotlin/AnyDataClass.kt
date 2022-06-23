package by.ealipatov.kotlin.apponkotlin

data class AnyDataClass(val name: String = "", val age: Int = 0) {
    override fun toString(): String {
        return "$name $age"
    }

    //Метод для вывода наименований свойств дата класса (по другому не придумал как)
    fun propertyName(): String {
        return "Name, Age"
    }

}