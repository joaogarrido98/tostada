package com.example.tostas

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast


object Tostas {
    @JvmStatic
    fun error(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_error, null)
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_success, null)
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_info, null)
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_warn, null)
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    fun custom(context: Context, message: String, time: Int, icon: Drawable){

    }
}