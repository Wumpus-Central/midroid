package com.discord.chat.presentation.message.decorations

import android.view.View

@JvmSynthetic
fun `access$getTranslatedBottom`(var0: View): Float {
   return getTranslatedBottom(var0);
}

@JvmSynthetic
fun `access$getTranslatedLeft`(var0: View): Float {
   return getTranslatedLeft(var0);
}

@JvmSynthetic
fun `access$getTranslatedRight`(var0: View): Float {
   return getTranslatedRight(var0);
}

@JvmSynthetic
fun `access$getTranslatedTop`(var0: View): Float {
   return getTranslatedTop(var0);
}

private fun View.getTranslatedBottom(): Float {
   return var0.getBottom() + var0.getTranslationY();
}

private fun View.getTranslatedLeft(): Float {
   return var0.getLeft() + var0.getTranslationX();
}

private fun View.getTranslatedRight(): Float {
   return var0.getRight();
}

private fun View.getTranslatedTop(): Float {
   return var0.getTop() + var0.getTranslationY();
}
