package by.ealipatov.kotlin.apponkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namePropertyText : TextView = findViewById(R.id.name_property_text)
        val dataText : TextView = findViewById(R.id.data_text)

        val dataClass = AnyDataClass("Эполит", 25)
        val copyDataClass = dataClass.copy(name = "Федот")

        val listDataClass = ArrayList<AnyDataClass>()

        listDataClass.add(dataClass)
        listDataClass.add(copyDataClass)

        findViewById<AppCompatButton>(R.id.btn_test).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                namePropertyText.text = dataClass.propertyName()
                dataText.text = listDataClass.toString()

            }
        })
    }
}