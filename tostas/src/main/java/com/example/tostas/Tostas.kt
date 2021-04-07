package com.example.tostas

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import android.widget.Toast


object Tostas {
    @JvmStatic
    fun error(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_error, null)
        val toastTextView = view.findViewById(R.id.custom_error) as TextView
        toastTextView.text = message
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_success, null)
        val toastTextView = view.findViewById(R.id.custom_success) as TextView
        toastTextView.text = message
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_info, null)
        val toastTextView = view.findViewById(R.id.custom_info) as TextView
        toastTextView.text = message
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Int) {
        val view: View = LayoutInflater.from(context).inflate(R.layout.toast_layout_warn, null)
        val toastTextView = view.findViewById(R.id.custom_warn) as TextView
        toastTextView.text = message
        val toast = Toast.makeText(context, message, time)
        toast.duration = time
        toast.view = view
        toast.show()
    }
}