package by.ealipatov.kotlin.apponkotlin

import kotlin.collections.ArrayList

object Repository {

    private val dataList: ArrayList<AnyDataClass> = ArrayList()

    fun getDataList(): ArrayList<AnyDataClass> {
        return dataList
    }

    /* Пока не используем
    fun addDataList(objects: AnyDataClass) {
        dataList.add(objects)
    }
    */

    fun initDataList() {
        dataList.add(AnyDataClass("Иполит", 25))
        dataList.add(dataList[0].copy(name = "Федот"))

    }

}