package com.example.ran.mybio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class Main2Activity : AppCompatActivity() {
    val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    var i=rand(0,3)
        if (i==0) {
            val Image = findViewById(R.id.imageView) as ImageView
            val drawble = resources.getDrawable(R.drawable.barack,theme)
            Image.setImageDrawable(drawble)
            val text= findViewById<TextView>(R.id.textView2)
            val string = resources.getString(R.string.text)
            text.setText(string)
            val text2= findViewById<TextView>(R.id.textView)
            val string2 = resources.getString(R.string.title)
            text2.setText(string2)
        }
        if (i==1) {
            val Image = findViewById(R.id.imageView) as ImageView
            val drawble = resources.getDrawable(R.drawable.amir,theme)
            Image.setImageDrawable(drawble)
            val text= findViewById<TextView>(R.id.textView2)
            val string = resources.getString(R.string.text2)
            text.setText(string)
            val text2= findViewById<TextView>(R.id.textView)
            val string2 = resources.getString(R.string.title2)
            text2.setText(string2)
        }
        if (i==2) {
            val Image = findViewById(R.id.imageView) as ImageView
            val drawble = resources.getDrawable(R.drawable.j,theme)
            Image.setImageDrawable(drawble)
            val text= findViewById<TextView>(R.id.textView2)
            val string = resources.getString(R.string.text3)
            text.setText(string)
            val text2= findViewById<TextView>(R.id.textView)
            val string2 = resources.getString(R.string.title3)
            text2.setText(string2)
        }
        if (i==3) {
            val Image = findViewById(R.id.imageView) as ImageView
            val drawble = resources.getDrawable(R.drawable.elif,theme)
            Image.setImageDrawable(drawble)
            val text= findViewById<TextView>(R.id.textView2)
            val string = resources.getString(R.string.text4)
            text.setText(string)
            val text2= findViewById<TextView>(R.id.textView)
            val string2 = resources.getString(R.string.title4)
            text2.setText(string2)
        }


}
fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}
}
