package com.example.moneymanager.view.customviews.textview

import android.content.Context
import android.graphics.Typeface
import android.util.AttributeSet
import android.widget.TextView


class SemiBoldText : TextView {

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context) : super(context) {
        init()
    }

    private fun init() {
        val typeface = Typeface.createFromAsset(context.assets, "font/LatoSemibold.ttf")
        this.typeface = typeface
    }
}