package com.karim.bahi.insta_story_reply

import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var imContainer: FrameLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imContainer = findViewById(R.id.imContainer)
        makeViewFullWidth(imContainer)
    }

    private fun makeViewFullWidth(view: View) {

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            val point = resources.displayMetrics;
            val param = view.layoutParams
            param.width = point.widthPixels
            param.height = point.heightPixels
            view.layoutParams = param
        } else {
            val point = Point()
            // point will be populated with screen width and height
            this.windowManager.defaultDisplay?.getSize(point)
            val param = view.layoutParams
            param.width = point.x
            param.height = point.y
            view.layoutParams = param
        }
    }
}