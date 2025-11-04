@file:SourceDebugExtension(["SMAP\nComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentViewKt\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n257#2,2:175\n257#2,2:177\n1#3:179\n*S KotlinDebug\n*F\n+ 1 ComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentViewKt\n*L\n154#1:175,2\n157#1:177,2\n*E\n"])

package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import com.discord.chat.bridge.botuikit.ComponentEmoji
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import kotlin.jvm.internal.SourceDebugExtension

public fun ComponentEmoji.renderable(): RenderableEmoji {
   var var3: java.lang.String = var0.getId();
   if (var3 != null) {
      val var6: java.lang.Long = StringsKt.s(var3);
      if (var6 != null) {
         val var7: RenderableEmoji.CustomWithEmojiId = RenderableEmoji.Companion.customWithEmojiId(var6.longValue(), var0.getAnimated(), var0.getName());
         if (var7 != null) {
            return var7;
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
   if (var1 == null) {
      var0.setVisibility(8);
   } else {
      var0.setVisibility(0);
      val var3: RenderableEmoji = renderable(var1);
      val var2: Context = var0.getContext();
      var0.setDraweeSpanStringBuilder(RenderableEmojiKt.renderEmoji$default(var3, var2, SizeUtilsKt.getDpToPx(20), var1.getAnimated(), 1, null, 32, null));
   }
}
