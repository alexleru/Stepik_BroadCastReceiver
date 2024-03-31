package ru.reggarant.stepik_broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadCastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != null) {
            when (intent.action) {
                Intent.ACTION_AIRPLANE_MODE_CHANGED -> toastShow(context, "ACTION_AIRPLANE_MODE_CHANGED")
                Intent.ACTION_BATTERY_LOW -> toastShow(context, "ACTION_BATTERY_LOW")
            }
        }
    }

    private fun toastShow(context: Context, text: String){
        Toast.makeText(context, text, Toast.LENGTH_LONG).show()
    }
}