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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nRoleIconView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleIconView.kt\ncom/discord/chat/presentation/message/RoleIconView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,49:1\n1#2:50\n257#3,2:51\n*S KotlinDebug\n*F\n+ 1 RoleIconView.kt\ncom/discord/chat/presentation/message/RoleIconView\n*L\n27#1:51,2\n*E\n"])
public class RoleIconView(context: Context, attrs: AttributeSet) : FrameLayout(var1, var2) {
   private final val binding: RoleIconViewBinding

   init {
      val var3: RoleIconViewBinding = RoleIconViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
   }

   @JvmStatic
   fun `configureRoleIcon$lambda$3$lambda$2`(var0: ChatEventHandler, var1: RoleIcon, var2: RenderableEmoji, var3: View) {
      var0.onTapRoleIcon(var1.getName(), var2.getUrl(true, var1.getSize()));
   }

   public fun configureRoleIcon(roleIcon: RoleIcon, eventHandler: ChatEventHandler) {
      var var8: Any;
      label29: {
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
         var6.setDraweeSpanStringBuilder(
            RenderableEmojiKt.renderEmoji$default((RenderableEmoji)var8, var5, SizeUtilsKt.getSpToPx(var1.getSize()), true, 0, null, 48, null)
         );
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var6, false, new t1(var2, var1, (RenderableEmoji)var8), 1, null);
      }
   }
}
