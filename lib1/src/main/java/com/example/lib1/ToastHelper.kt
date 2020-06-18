package com.example.lib1

import android.content.Context
import android.widget.Toast

object ToastHelper {
    fun displayMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}