package com.example.torrada

import android.content.Context
import android.os.CountDownTimer
import android.widget.Toast

object Torrada {
    @JvmStatic
    fun error(context: Context, message: String, time: Long) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        val toastCountDown: CountDownTimer
        toastCountDown = object:CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished:Long) {
               toast.show()
            }
            override fun onFinish() {
                toast.cancel()
            }
        }
        toastCountDown.start()
    }

    @JvmStatic
    fun success(context: Context, message: String, time: Long) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        val toastCountDown: CountDownTimer
        toastCountDown = object:CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished:Long) {
                toast.show()
            }
            override fun onFinish() {
                toast.cancel()
            }
        }
        toastCountDown.start()
    }

    @JvmStatic
    fun info(context: Context, message: String, time: Long) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        val toastCountDown: CountDownTimer
        toastCountDown = object:CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished:Long) {
                toast.show()
            }
            override fun onFinish() {
                toast.cancel()
            }
        }
        toastCountDown.start()
    }

    @JvmStatic
    fun warn(context: Context, message: String, time: Long) {
        val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
        val toastCountDown: CountDownTimer
        toastCountDown = object:CountDownTimer(time, 1000) {
            override fun onTick(millisUntilFinished:Long) {
                toast.show()
            }
            override fun onFinish() {
                toast.cancel()
            }
        }
        toastCountDown.start()
    }
}