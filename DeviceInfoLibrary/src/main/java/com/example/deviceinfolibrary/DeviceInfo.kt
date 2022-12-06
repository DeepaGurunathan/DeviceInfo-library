package com.example.deviceinfolibrary

import android.os.Build

object DeviceInfo {

    fun getSystemDetail() : String {

        return "Brand: ${Build.BRAND} \n" +
                "Model: ${Build.MODEL} \n" +
                "ID: ${Build.ID} \n"
    }
}