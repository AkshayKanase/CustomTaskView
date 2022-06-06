package com.example.customtaskview

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.TextView


@SuppressLint("AppCompatCustomView")
class TaskView(context: Context,attributes:AttributeSet): TextView(context,attributes) {
    private var paint=Paint()
    var taskstatus=false
    set(value) {
        field=value
        if (field){
            setTextColor(Color.GREEN)
        }
        else{
            setTextColor(Color.RED)
        }
    }
    var task:String = ""
    set(value) {
        field=value
    }

    init {

       setTextColor(Color.RED)


       setOnClickListener {
           taskstatus=!taskstatus
       }
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
             paint.strokeWidth=20f
            canvas?.drawLine(10f,0f,10f,height.toFloat(), paint)
            canvas?.drawLine(50f,0f,50f,height.toFloat(), paint)



    }
}