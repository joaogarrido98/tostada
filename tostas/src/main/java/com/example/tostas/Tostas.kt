package com.example.tostas

import android.content.Context
import android.os.CountDownTimer
import android.os.Handler
import android.widget.Toast

object Tostas {
    @JvmStatic
    fun error(context: Context, message: String, time: Long) {
        val toast: Toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.show()
        Handler().postDelayed(Runnable { toast.cancel() }, time)
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Long) {
        val toast: Toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.show()
        Handler().postDelayed(Runnable { toast.cancel() }, time)
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Long) {
        val toast: Toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.show()
        Handler().postDelayed(Runnable { toast.cancel() }, time)
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Long) {
        val toast: Toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        toast.show()
        Handler().postDelayed(Runnable { toast.cancel() }, time)
    }
}