package by.ealipatov.kotlin.apponkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Найдем нужные тектовые вьюхи
        val namePropertyText : TextView = findViewById(R.id.name_property_text)
        val dataText : TextView = findViewById(R.id.data_text)

        //Инициализируем список
        Repository.initDataList()

        //Повесим слушатель на кнопку и выведем нужную информацию на экран при нажатии
        findViewById<AppCompatButton>(R.id.btn_test).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                //Выведем наименование свойств
                namePropertyText.text = Repository.getDataList()[0].propertyName()
                //Выведем значения
                dataText.text = Repository.getDataList().toString()

            }
        })

        //Проверка работы разных циклов

        val number = listOf("zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine")

        Log.d("***", "Используем forEach")
        number.forEach {
            Log.d("***", it)
        }

        Log.d("***", "Используем repeat")
        repeat(number.size) {
            Log.d("***", number[it])
        }

        Log.d("***", "Используем for")
        for (num in number) {
            Log.d("***", num)
        }

        Log.d("***", "Используем for для интервала элементов 1..10")
        for (i in 1..10) {
            Log.d("***", "$i")
        }

        Log.d("***", "Используем for для обратной последовательности с шагом 2")
        for(i in 10 downTo 1 step 2) {
            Log.d("***", "$i")
        }

        Log.d("***","Проверяем работу until")
        for(i in 0 until number.size-1) {
            if(number[i] == "five") {
                Log.d("***", number[i])
            }
        }

        Log.d("***","Используем when")

        when(Numbers.Six){
            Numbers.Zero -> {Log.d("***","Ноль")}
            Numbers.One -> {Log.d("***","Один")}
            Numbers.Two -> {Log.d("***","Два")}
            Numbers.Three -> {Log.d("***","Три")}
            Numbers.Four -> {Log.d("***","Четыре")}
            Numbers.Five -> {Log.d("***","Пять")}
            Numbers.Six -> {Log.d("***","Шесть")}
            Numbers.Seven -> {Log.d("***","Семь")}
            Numbers.Eight -> {Log.d("***","Восемь")}
            Numbers.Nine -> {Log.d("***","Девять")}
        }


    }

    enum class Numbers {
        Zero,
        One,
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine
    }


}
