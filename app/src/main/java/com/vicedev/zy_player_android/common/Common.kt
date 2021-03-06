package com.vicedev.zy_player_android.common

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.view.View
import androidx.core.view.isVisible


/**
 * @author vicedev1001@gmail.com
 * @date 2020/6/8 18:14
 */

fun View?.visible() {
    this?.run {
        if (!isVisible) visibility = View.VISIBLE
    }
}

fun View?.invisible() {
    this?.run {
        if (isVisible) visibility = View.INVISIBLE
    }
}

fun View?.gone() {
    this?.run {
        if (isVisible) visibility = View.GONE
    }
}

fun String?.textOrDefault(default: String = ""): String {
    return if (isNullOrBlank()) default else this!!
}

fun View.getActivity(): Activity? {
    var context2: Context = context
    while (context2 is ContextWrapper) {
        if (context2 is Activity) {
            return context2
        }
        context2 = context2.baseContext
    }
    return null
}
