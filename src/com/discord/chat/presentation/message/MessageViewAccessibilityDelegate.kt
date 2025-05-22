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
         I18nUtilsKt.i18nFormat(var1, I18nMessage.MOBILE_REPLYING_TO_A11Y_LABEL, new u0((var2 as LoadedReferencedMessage).getMessage().getUsername()))
         else
         null;
   }

   @JvmStatic
   fun `getReferencedMessageLabel$lambda$0`(var0: java.lang.String, var1: RenderContext): Unit {
      kotlin.jvm.internal.q.h(var1, "$this$i18nFormat");
      var1.getArgs().put("username", var0);
      return Unit.a;
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      var var11: Any;
      label47: {
         kotlin.jvm.internal.q.h(var1, "host");
         kotlin.jvm.internal.q.h(var2, "info");
         super.onInitializeAccessibilityNodeInfo(var1, var2);
         if (this.contentView != null) {
            val var6: java.lang.CharSequence = this.contentView.getText();
            var11 = var6;
            if (var6 != null) {
               break label47;
            }
         }

         var11 = "";
      }

      var11 = new SpannableStringBuilder(var11);
      var var13: java.util.Iterator = kotlin.jvm.internal.b.a(var11.getSpans(0, var11.length(), SpoilerSpan.class));

      while (var13.hasNext()) {
         val var7: SpoilerSpan = var13.next() as SpoilerSpan;
         if (!var7.isRevealed()) {
            val var4: Int = var11.getSpanStart(var7);
            val var3: Int = var11.getSpanEnd(var7);
            val var17: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var17, "getContext(...)");
            var11.replace(var4, var3, I18nUtilsKt.i18nFormat$default(var17, I18nMessage.SPOILER_HIDDEN_A11Y_LABEL, null, 2, null));
         }
      }

      var13 = kotlin.jvm.internal.b.a(var11.getSpans(0, var11.length(), EmojiAccessibilitySpan.class));

      while (var13.hasNext()) {
         val var18: EmojiAccessibilitySpan = var13.next() as EmojiAccessibilitySpan;
         var11.replace(var11.getSpanStart(var18), var11.getSpanEnd(var18), var18.getName());
      }

      val var15: ArrayList = new ArrayList();
      if (this.message.getUsername() != null) {
         var15.add(this.message.getUsername());
      }

      if (this.message.getTimestamp() != null) {
         var15.add(this.message.getTimestamp());
      }

      val var8: Context = var1.getContext();
      kotlin.jvm.internal.q.g(var8, "getContext(...)");
      val var9: java.lang.CharSequence = this.getReferencedMessageLabel(var8, this.message.getReferencedMessage());
      if (var9 != null) {
         var15.add(var9);
      }

      if (!var15.isEmpty()) {
         val var16: java.lang.String = kotlin.collections.i.o0(var15, ", ", null, null, 0, null, null, 62, null);
         val var10: StringBuilder = new StringBuilder();
         var10.append(var16);
         var10.append(", ");
         var11.replace(0, 0, var10.toString());
      }

      var2.U0(var11);
      var2.j0(AccessibilityNodeInfoCompat.a.i);
      var2.G0(15);
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
