package com.alammanga.app

import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            layoutDirection = View.LAYOUT_DIRECTION_RTL
            setPadding(40, 60, 40, 40)
        }

        val title = TextView(this).apply {
            text = "عالم المانجا"
            textSize = 28f
            gravity = Gravity.START
        }

        val subtitle = TextView(this).apply {
            text = "المكتبة"
            textSize = 20f
            setPadding(0, 40, 0, 20)
            gravity = Gravity.START
        }

        val firstWork = TextView(this).apply {
            text = "Boruto: Two Blue Vortex"
            textSize = 18f
            setPadding(0, 20, 0, 20)
            gravity = Gravity.START
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(firstWork)

        val scroll = ScrollView(this)
        scroll.addView(layout)
        setContentView(scroll)
    }
}
