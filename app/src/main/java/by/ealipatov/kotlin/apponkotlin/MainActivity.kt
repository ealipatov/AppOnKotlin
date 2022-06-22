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

        val text : TextView = findViewById(R.id.title_text)

        findViewById<AppCompatButton>(R.id.btn_test).setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                text.text = getString(R.string.btn_is_pressed)
            }
        })
    }
}