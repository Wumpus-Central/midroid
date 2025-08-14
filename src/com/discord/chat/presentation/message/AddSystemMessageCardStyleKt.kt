@file:SourceDebugExtension(["SMAP\nAddSystemMessageCardStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddSystemMessageCardStyle.kt\ncom/discord/chat/presentation/message/AddSystemMessageCardStyleKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,23:1\n146#2,8:24\n*S KotlinDebug\n*F\n+ 1 AddSystemMessageCardStyle.kt\ncom/discord/chat/presentation/message/AddSystemMessageCardStyleKt\n*L\n11#1:24,8\n*E\n"])

package com.discord.chat.presentation.message

import android.view.View
import com.discord.chat.presentation.message.view.GetEmbedBackgroundColorKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.internal.SourceDebugExtension

public fun View.addSystemMessageCardStyle() {
   var0.setPaddingRelative(var0.getPaddingStart(), SizeUtilsKt.getDpToPx(8), var0.getPaddingEnd(), SizeUtilsKt.getDpToPx(8));
   ViewBackgroundUtilsKt.setBackgroundRectangle$default(
      var0, ColorUtilsKt.getColorCompat(var0, GetEmbedBackgroundColorKt.getEmbedBackgroundColor()), SizeUtilsKt.getDpToPx(8), null, 0, 12, null
   );
}
