package com.discord.chat.presentation.message

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.referencedmessage.LoadedReferencedMessage
import com.discord.chat.bridge.referencedmessage.ReferencedMessage
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.react_strings.RenderContext
import java.util.ArrayList

internal class MessageViewAccessibilityDelegate(message: Message, onClick: OnClickListener?, onLongClick: OnLongClickListener?) : androidx.core.view.a {
   private final val message: Message
   private final val onClick: OnClickListener?
   private final val onLongClick: OnLongClickListener?

   init {
      kotlin.jvm.internal.r.h(var1, "message");
      super();
      this.message = var1;
      this.onClick = var2;
      this.onLongClick = var3;
   }

   private fun getReferencedMessageLabel(context: Context, referencedMessage: ReferencedMessage?): CharSequence? {
      return if (var2 is LoadedReferencedMessage)
         I18nUtilsKt.i18nFormat(var1, I18nMessage.MOBILE_REPLYING_TO_A11Y_LABEL, new s0((var2 as LoadedReferencedMessage).getMessage().getUsername()))
         else
         null;
   }

   @JvmStatic
   fun `getReferencedMessageLabel$lambda$0`(var0: java.lang.String, var1: RenderContext): Unit {
      kotlin.jvm.internal.r.h(var1, "$this$i18nFormat");
      var1.getArgs().put("username", var0);
      return Unit.a;
   }

   public override fun onInitializeAccessibilityNodeInfo(host: View, info: AccessibilityNodeInfoCompat) {
      kotlin.jvm.internal.r.h(var1, "host");
      kotlin.jvm.internal.r.h(var2, "info");
      super.onInitializeAccessibilityNodeInfo(var1, var2);
      val var3: ArrayList = new ArrayList();
      if (this.message.getUsername() != null) {
         var3.add(this.message.getUsername());
      }

      if (this.message.getTimestamp() != null) {
         var3.add(this.message.getTimestamp());
      }

      val var4: Context = var1.getContext();
      kotlin.jvm.internal.r.g(var4, "getContext(...)");
      val var5: java.lang.CharSequence = this.getReferencedMessageLabel(var4, this.message.getReferencedMessage());
      if (var5 != null) {
         var3.add(var5);
      }

      var2.V0(kotlin.collections.i.o0(var3, ", ", null, null, 0, null, null, 62, null));
      var2.j0(AccessibilityNodeInfoCompat.a.i);
      var2.H0(15);
   }

   public override fun performAccessibilityAction(host: View, action: Int, args: Bundle?): Boolean {
      kotlin.jvm.internal.r.h(var1, "host");
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
