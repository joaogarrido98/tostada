package com.example.tostas

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources


object Tostas {

    const val fast: Int = Toast.LENGTH_SHORT
    const val slow: Int = Toast.LENGTH_LONG

    @JvmStatic
    fun neutral(context: Context, message: String, time: Int) {
        Toast.makeText(context, message, time).show()
    }

    @JvmStatic
    fun error(context: Context, message: String, time: Int) {
        val d = AppCompatResources.getDrawable(context, R.drawable.error)
        inflate(context,message,time, "#f44336", d!!)
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Int) {
        val d = AppCompatResources.getDrawable(context, R.drawable.success)
        inflate(context,message,time, "#4caf50", d!!)
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Int) {
        val d = AppCompatResources.getDrawable(context, R.drawable.info_circle)
        inflate(context,message,time, "#2196f3", d!!)
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Int) {
        val d = AppCompatResources.getDrawable(context, R.drawable.warn)
        inflate(context,message,time, "#ff9800", d!!)
    }

    @JvmStatic
    fun custom(context: Context, message: String, time: Int, drawable: Drawable, backgroundColor: String) {
        inflate(context, message, time, backgroundColor, drawable)
    }

    private fun inflate(context: Context, message: String, time: Int, backgroundColor: String, drawable: Drawable) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_custom, null)
        view.background.setTint(Color.parseColor(backgroundColor))
        val toastTextView = view.findViewById(R.id.custom_message) as TextView
        toastTextView.text = message
        val toastDrawable = view.findViewById(R.id.custom_toast_image) as ImageView
        toastDrawable.setImageDrawable(drawable)
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }
}