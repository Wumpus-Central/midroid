package com.discord.chat.presentation.message

import android.content.Context
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage
import com.discord.chat.bridge.referencedmessage.ReferencedMessage
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.react_strings.RenderContext
import com.discord.span.utilities.spannable.EmojiAccessibilitySpan
import com.discord.span.utilities.spannable.SpoilerSpan
import java.util.ArrayList
import kotlin.jvm.functions.Function1

internal class MessageViewAccessibilityDelegate(message: Message, contentView: MessageContentView?, onClick: OnClickListener?, onLongClick: OnLongClickListener?)
   : androidx.core.view.a {
   private final val message: Message
   private final val contentView: MessageContentView?
   private final val onClick: OnClickListener?
   private final val onLongClick: OnLongClickListener?

   init {
      kotlin.jvm.internal.q.h(var1, "message");
      super();
      this.message = var1;
      this.contentView = var2;
      this.onClick = var3;
      this.onLongClick = var4;
   }

   private fun getReferencedMessageLabel(context: Context, referencedMessage: ReferencedMessage?): CharSequence? {
      return if (var2 is LoadedReferencedMessage)
         I18nUtilsKt.i18nFormat(var1, I18nMessage.MOBILE_REPLYING_TO_A11Y_LABEL, new Function1((var2 as LoadedReferencedMessage).getMessage().getUsername()) {
            final java.lang.String $username;

            {
               super(1);
               this.$username = var1;
            }

            public final void invoke(RenderContext var1) {
               kotlin.jvm.internal.q.h(var1, "$this$i18nFormat");
               var1.getArgs().put("username", this.$username);
            }
         })
         else
         null;
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      kotlin.jvm.internal.q.h(var1, "host");
      kotlin.jvm.internal.q.h(var2, "info");
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      val var15: java.lang.CharSequence;
      if (this.contentView != null) {
         var15 = this.contentView.getText();
      } else {
         var15 = null;
      }

      var var8: java.util.List = var15;
      if (var15 == null) {
         var8 = "";
      }

      val var16: SpannableStringBuilder = new SpannableStringBuilder(var8);
      var8 = var16.getSpans(0, var16.length(), SpoilerSpan.class);
      kotlin.jvm.internal.q.g(var8, "getSpans(...)");
      val var18: Array<SpoilerSpan> = var8 as Array<SpoilerSpan>;
      var var4: Int = (var8 as Array<SpoilerSpan>).length;

      for (int var3 = 0; var3 < var4; var3++) {
         val var9: SpoilerSpan = var18[var3];
         if (!var18[var3].isRevealed()) {
            val var5: Int = var16.getSpanStart(var9);
            val var6: Int = var16.getSpanEnd(var9);
            val var23: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var23, "getContext(...)");
            var16.replace(var5, var6, I18nUtilsKt.i18nFormat$default(var23, I18nMessage.SPOILER_HIDDEN_A11Y_LABEL, null, 2, null));
         }
      }

      var8 = var16.getSpans(0, var16.length(), EmojiAccessibilitySpan.class);
      kotlin.jvm.internal.q.g(var8, "getSpans(...)");
      val var24: Array<EmojiAccessibilitySpan> = var8 as Array<EmojiAccessibilitySpan>;
      var4 = (var8 as Array<EmojiAccessibilitySpan>).length;

      for (int var13 = 0; var13 < var4; var13++) {
         var16.replace(var16.getSpanStart(var24[var13]), var16.getSpanEnd(var24[var13]), var24[var13].getName());
      }

      var8 = new ArrayList();
      if (this.message.getUsername() != null) {
         var8.add(this.message.getUsername());
      }

      if (this.message.getTimestamp() != null) {
         var8.add(this.message.getTimestamp());
      }

      val var10: Context = var1.getContext();
      kotlin.jvm.internal.q.g(var10, "getContext(...)");
      val var11: java.lang.CharSequence = this.getReferencedMessageLabel(var10, this.message.getReferencedMessage());
      if (var11 != null) {
         var8.add(var11);
      }

      if (var8.isEmpty() xor true) {
         val var12: java.lang.String = kotlin.collections.i.n0(var8, ", ", null, null, 0, null, null, 62, null);
         val var22: StringBuilder = new StringBuilder();
         var22.append(var12);
         var22.append(", ");
         var16.replace(0, 0, var22.toString());
      }

      var2.T0(var16);
      var2.i0(AccessibilityNodeInfoCompat.a.i);
      var2.F0(15);
   }

   public override fun performAccessibilityAction(host: View, action: Int, args: Bundle?): Boolean {
      kotlin.jvm.internal.q.h(var1, "host");
      if (var2 != 16) {
         if (var2 == 32 && this.onLongClick != null) {
            this.onLongClick.onLongClick(var1);
         }
      } else if (this.onClick != null) {
         this.onClick.onClick(var1);
      }

      return super.performAccessibilityAction(var1, var2, var3);
   }
}
