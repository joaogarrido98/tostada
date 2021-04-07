package com.example.tostas

import android.content.Context
import android.widget.Toast

object Tostas {
    @JvmStatic
    fun error(context: Context, message: String, time: Int) {
        Toast.makeText(context, message, time).show()
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Int) {
        Toast.makeText(context, message , time).show()
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Int) {
        Toast.makeText(context, message, time).show()
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Int) {
        Toast.makeText(context, message, time).show()
    }
}