package com.enesinky.demo.audiotranscription

import android.Manifest
import android.os.Build
import java.util.*

object Constants {


    val MANUFACTURER_BRAND = Build.MANUFACTURER.toUpperCase(Locale.ROOT)

    /*
        Audio Transcription Constants
     */
    val AT_PERMISSION_LIST = arrayOf(
        Manifest.permission.READ_EXTERNAL_STORAGE
    )

}