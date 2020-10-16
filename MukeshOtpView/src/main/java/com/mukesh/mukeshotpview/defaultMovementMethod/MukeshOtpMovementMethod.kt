package com.mukesh.mukeshotpview.defaultMovementMethod

import android.text.Selection
import android.text.Spannable
import android.text.method.MovementMethod
import android.view.KeyEvent
import android.view.MotionEvent
import android.widget.TextView


/**
 * Used to disable arrow key
 *
 * @author Mukesh
 * All copy write are reserved
 *
 * you can use for disable a arrow key
 * and set default movement methods
 * and move into next index when enter
 * a character in a particular otp
 * view positions.
 */

internal class MukeshOtpMovementMethod internal constructor() : MovementMethod {


    /**
     * Initialize a otp view and
     * set into index 0 or first
     * position of otp view.
     * */
    override fun initialize(widget: TextView, text: Spannable) {
        Selection.setSelection(text, 0)
    }


    override fun onKeyDown(
        widget: TextView,
        text: Spannable,
        keyCode: Int,
        event: KeyEvent
    ): Boolean {
        return false
    }


    override fun onKeyUp(
        widget: TextView,
        text: Spannable,
        keyCode: Int,
        event: KeyEvent
    ): Boolean {
        return false
    }


    override fun onKeyOther(
        view: TextView,
        text: Spannable,
        event: KeyEvent
    ): Boolean {
        return false
    }


    override fun onTakeFocus(
        widget: TextView,
        text: Spannable,
        direction: Int
    ) {
        //Intentionally Empty
    }


    override fun onTrackballEvent(
        widget: TextView,
        text: Spannable,
        event: MotionEvent
    ): Boolean {
        return false
    }


    override fun onTouchEvent(
        widget: TextView,
        text: Spannable,
        event: MotionEvent
    ): Boolean {
        return false
    }


    override fun onGenericMotionEvent(
        widget: TextView,
        text: Spannable,
        event: MotionEvent
    ): Boolean {
        return false
    }


    override fun canSelectArbitrarily(): Boolean {
        return false
    }



    /**
     * Companion object for create
     * a instance of a class for
     * default movements of cursor
     * */
    companion object {
        private var sInstance: MukeshOtpMovementMethod? = null
        val instance: MovementMethod?
            get() {
                if (sInstance == null) {
                    sInstance = MukeshOtpMovementMethod()
                }
                return sInstance
            }
    }

}