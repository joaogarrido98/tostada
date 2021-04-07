package com.example.tostas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast


object Tostas {
    @JvmStatic
    fun neutral(context: Context, message: String, time: Int) {
        Toast.makeText(context, message, time).show()
    }

    @JvmStatic
    fun error(context: Context, message: String, time: Int) {
        val layout = R.layout.toast_layout_error
        val textView = R.id.custom_error
        inflate(context,layout, textView, message,time)
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Int) {
        val layout = R.layout.toast_layout_success
        val textView = R.id.custom_success
        inflate(context,layout, textView, message,time)
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Int) {
        val layout = R.layout.toast_layout_info
        val textView = R.id.custom_info
        inflate(context,layout, textView, message,time)
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Int) {
        val layout = R.layout.toast_layout_warn
        val textView = R.id.custom_warn
        inflate(context,layout, textView, message,time)
    }

    private fun inflate(context: Context,layout: Int, textView: Int, message:String, time: Int){
        val view: View = LayoutInflater.from(context).inflate(layout, null)
        val toastTextView = view.findViewById(textView) as TextView
        toastTextView.text = message
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }
}