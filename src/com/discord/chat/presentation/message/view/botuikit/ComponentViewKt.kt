package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import com.discord.chat.bridge.botuikit.ComponentEmoji
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.q

public fun ComponentEmoji.renderable(): RenderableEmoji {
   q.h(var0, "<this>");
   var var3: java.lang.String = var0.getId();
   if (var3 != null) {
      val var7: java.lang.Long = h.o(var3);
      if (var7 != null) {
         val var8: RenderableEmoji.CustomWithEmojiId = RenderableEmoji.Companion.customWithEmojiId(var7.longValue(), var0.getAnimated(), var0.getName());
         if (var8 != null) {
            return var8;
         }
      }
   }

   val var5: RenderableEmoji.Companion = RenderableEmoji.Companion;
   val var4: java.lang.String = var0.getSurrogates();
   var3 = var4;
   if (var4 == null) {
      var3 = var0.getName();
   }

   return var5.unicode(var3);
}

public fun SimpleDraweeSpanTextView.setEmojiOrHide(componentEmoji: ComponentEmoji?) {
   q.h(var0, "<this>");
   if (var1 == null) {
      var0.setVisibility(8);
   } else {
      var0.setVisibility(0);
      val var3: RenderableEmoji = renderable(var1);
      val var2: Context = var0.getContext();
      q.g(var2, "getContext(...)");
      var0.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(var3, var2, SizeUtilsKt.getDpToPx(20), var1.getAnimated(), 1, null, 32, null));
   }
}
