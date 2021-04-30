package com.example.ran.mybio

import android.content.Intent
import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlin.*

class Main2Activity : AppCompatActivity() {
    val random = Random()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Image = findViewById(R.id.imageView) as ImageView
        val text= findViewById<TextView>(R.id.textView2)
        val text2= findViewById<TextView>(R.id.textView)
        val draw_array =arrayOf<Int>(R.drawable.barack,R.drawable.amir,R.drawable.j,R.drawable.elif)
        val tab = resources.getStringArray(R.array.title_tab)
        val tab_bio = resources.getStringArray(R.array.bio_tab)
        var i=rand(0,3)

        val drawble = resources.getDrawable(draw_array[i],theme)
        Image.setImageDrawable(drawble)
        val string = tab_bio[i]
        text.setText(string)
        val string2 = tab[i]
        text2.setText(string2)




}
fun rand(from: Int, to: Int) : Int {
    return random.nextInt(to - from) + from
}
}
