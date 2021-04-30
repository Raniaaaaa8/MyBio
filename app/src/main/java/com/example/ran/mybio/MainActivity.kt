package com.example.ran.mybio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button = findViewById<Button>(R.id.button2)
        button.setOnClickListener{

            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
/*    val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Image = findViewById(R.id.imageView) as ImageView
        val drawble = resources.getDrawable(R.drawable.logo,theme)
        Image.setImageDrawable(drawble)
        val text= findViewById<TextView>(R.id.textView2)
        val string = resources.getString(R.string.text)
        text.setText(string)
        val text2= findViewById<TextView>(R.id.textView)
        val string2 = resources.getString(R.string.text2)
        text2.setText(string2)

    }
    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
}*/