package com.example.newtest

import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Shader
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

class GradientTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    private lateinit var linearGradient: LinearGradient

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        linearGradient = LinearGradient(
            0f, 0f, w.toFloat(), h.toFloat(),
            intArrayOf(
                resources.getColor(R.color.gradient_start, context.theme),
                resources.getColor(R.color.gradient_end, context.theme)
            ),
            null,
            Shader.TileMode.CLAMP
        )
        paint.shader = linearGradient
    }
}