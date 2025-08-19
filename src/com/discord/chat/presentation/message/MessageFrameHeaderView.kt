package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.FrameLayout.LayoutParams
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameJump
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMessageFrameHeaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageFrameHeaderView.kt\ncom/discord/chat/presentation/message/MessageFrameHeaderView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,50:1\n33#1,15:52\n1#2:51\n*S KotlinDebug\n*F\n+ 1 MessageFrameHeaderView.kt\ncom/discord/chat/presentation/message/MessageFrameHeaderView\n*L\n29#1:52,15\n*E\n"])
public class MessageFrameHeaderView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout(var1, var2, var3) {
   fun MessageFrameHeaderView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun MessageFrameHeaderView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   private fun configureMessageFrameJump(messageFrame: MessageFrameJump) {
      var var2: Any = this.getChildAt(0);
      if (var2 !is MessageFrameJumpHeaderView) {
         if (var2 != null) {
            this.removeViewAt(0);
         }

         val var3: Context = this.getContext();
         var2 = new MessageFrameJumpHeaderView(var3, null, 0, 6, null);
         var2.setLayoutParams(new LayoutParams(-1, -2));
         this.addView((View)var2);
      }

      (var2 as MessageFrameJumpHeaderView).configure(var1);
   }

   public fun configure(messageFrame: MessageFrame) {
      if (this.getChildCount() <= 1) {
         if (var1 is MessageFrameJump) {
            this.configureMessageFrameJump(var1 as MessageFrameJump);
         }
      } else {
         throw new IllegalStateException("Should not have more than one child");
      }
   }
}
