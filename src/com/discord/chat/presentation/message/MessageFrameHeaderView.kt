package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import android.widget.FrameLayout.LayoutParams
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.bridge.messageframe.MessageFrameJump

public class MessageFrameHeaderView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout {
   fun MessageFrameHeaderView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MessageFrameHeaderView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
   }

   private fun configureMessageFrameJump(messageFrame: MessageFrameJump) {
      var var2: Any = this.getChildAt(0);
      if (var2 !is MessageFrameJumpHeaderView) {
         if (var2 != null) {
            this.removeViewAt(0);
         }

         val var3: Context = this.getContext();
         kotlin.jvm.internal.q.g(var3, "getContext(...)");
         var2 = new MessageFrameJumpHeaderView(var3, null, 0, 6, null);
         var2.setLayoutParams(new LayoutParams(-1, -2));
         this.addView((View)var2);
      }

      (var2 as MessageFrameJumpHeaderView).configure(var1);
   }

   public fun configure(messageFrame: MessageFrame) {
      kotlin.jvm.internal.q.h(var1, "messageFrame");
      if (this.getChildCount() <= 1) {
         if (var1 is MessageFrameJump) {
            this.configureMessageFrameJump(var1 as MessageFrameJump);
         }
      } else {
         throw new IllegalStateException("Should not have more than one child".toString());
      }
   }
}
