package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.discord.chat.bridge.roleicons.RoleIcon
import com.discord.chat.databinding.RoleIconViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.emoji.RenderableEmoji
import com.discord.emoji.RenderableEmojiKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.facebook.drawee.span.SimpleDraweeSpanTextView

public class RoleIconView(context: Context, attrs: AttributeSet) : FrameLayout {
   private final val binding: RoleIconViewBinding

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      kotlin.jvm.internal.r.h(var2, "attrs");
      super(var1, var2);
      val var3: RoleIconViewBinding = RoleIconViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
   }

   @JvmStatic
   fun `configureRoleIcon$lambda$3$lambda$2`(var0: ChatEventHandler, var1: RoleIcon, var2: RenderableEmoji, var3: View) {
      kotlin.jvm.internal.r.h(var0, "$eventHandler");
      kotlin.jvm.internal.r.h(var1, "$roleIcon");
      var0.onTapRoleIcon(var1.getName(), var2.getUrl(true, var1.getSize()));
   }

   public fun configureRoleIcon(roleIcon: RoleIcon, eventHandler: ChatEventHandler) {
      var var8: Any;
      label29: {
         kotlin.jvm.internal.r.h(var1, "roleIcon");
         kotlin.jvm.internal.r.h(var2, "eventHandler");
         var8 = var1.getSource();
         if (var8 != null) {
            var8 = RenderableEmoji.Companion.customWithUrl((java.lang.String)var8, var1.getAlt());
            if (var8 != null) {
               break label29;
            }
         }

         var8 = var1.getUnicodeEmoji();
         if (var8 != null) {
            var8 = RenderableEmoji.Companion.unicode((java.lang.String)var8);
         } else {
            var8 = null;
         }
      }

      var var3: Boolean;
      if (var8 != null) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      this.setVisibility(var3);
      if (var8 != null) {
         val var6: SimpleDraweeSpanTextView = this.binding.roleIconViewUnicodeEmoji;
         val var5: Context = this.binding.roleIconViewUnicodeEmoji.getContext();
         kotlin.jvm.internal.r.g(var5, "context");
         var6.setDraweeSpanStringBuilder(
            RenderableEmojiKt.renderEmoji$default((RenderableEmoji)var8, var5, SizeUtilsKt.getSpToPx(var1.getSize()), true, 0, null, 48, null)
         );
         kotlin.jvm.internal.r.g(var6, "configureRoleIcon$lambda$3");
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var6, false, new x(var2, var1, (RenderableEmoji)var8), 1, null);
      }
   }
}
