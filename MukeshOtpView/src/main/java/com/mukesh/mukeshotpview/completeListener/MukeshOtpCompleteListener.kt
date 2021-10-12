package com.mukesh.mukeshotpview.completeListener

import android.view.View

fun interface MukeshOtpCompleteListener {
    fun otpCompleteListener(view : View, otp: String?)
}