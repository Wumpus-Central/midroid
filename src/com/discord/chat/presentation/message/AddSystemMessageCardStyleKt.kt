package com.discord.chat.presentation.message

import android.view.View
import com.discord.chat.presentation.message.view.GetEmbedBackgroundColorKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.theme.utils.ColorUtilsKt

public fun View.addSystemMessageCardStyle() {
   kotlin.jvm.internal.q.h(var0, "<this>");
   var0.setPaddingRelative(var0.getPaddingStart(), SizeUtilsKt.getDpToPx(8), var0.getPaddingEnd(), SizeUtilsKt.getDpToPx(8));
   ViewBackgroundUtilsKt.setBackgroundRectangle$default(
      var0, ColorUtilsKt.getColorCompat(var0, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
   );
}
