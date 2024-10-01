package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import com.discord.chat.presentation.media.MediaContainingViewResizer

public class EmbedViewResizingMediaView  public constructor(context: Context, attrs: AttributeSet? = null) : MediaView {
   public final lateinit var target: com.discord.chat.presentation.message.view.EmbedViewResizingMediaView.Target
      internal set

   fun EmbedViewResizingMediaView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, 0, 4, null);
   }

   public fun setTarget(width: Int, height: Int, maxHeightPx: Int, maxWidthPx: Int) {
      val var5: EmbedViewResizingMediaView.Target = new EmbedViewResizingMediaView.Target(var1, var2, var3, var4);
      if (this.target == null || !kotlin.jvm.internal.q.c(this.getTarget(), var5)) {
         this.setTarget(var5);
      }

      MediaContainingViewResizer.resizeLayoutParams$default(
         MediaContainingViewResizer.INSTANCE, this, this.getTarget().getWidth(), this.getTarget().getHeight(), var4, var3, null, 16, null
      );
   }

   public data class Target(width: Int, height: Int, maxHeightPx: Int, maxWidthPx: Int) {
      public final val height: Int
      public final val maxHeightPx: Int
      public final val maxWidthPx: Int
      public final val width: Int

      init {
         this.width = var1;
         this.height = var2;
         this.maxHeightPx = var3;
         this.maxWidthPx = var4;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public operator fun component3(): Int {
         return this.maxHeightPx;
      }

      public operator fun component4(): Int {
         return this.maxWidthPx;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height, maxHeightPx: Int = var0.maxHeightPx, maxWidthPx: Int = var0.maxWidthPx): com.discord.chat.presentation.message.view.EmbedViewResizingMediaView.Target {
         return new EmbedViewResizingMediaView.Target(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is EmbedViewResizingMediaView.Target) {
            return false;
         } else {
            var1 = var1;
            if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else if (this.maxHeightPx != var1.maxHeightPx) {
               return false;
            } else {
               return this.maxWidthPx == var1.maxWidthPx;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.maxHeightPx)) * 31
            + Integer.hashCode(this.maxWidthPx);
      }

      public override fun toString(): String {
         val var2: Int = this.width;
         val var3: Int = this.height;
         val var4: Int = this.maxHeightPx;
         val var1: Int = this.maxWidthPx;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Target(width=");
         var5.append(var2);
         var5.append(", height=");
         var5.append(var3);
         var5.append(", maxHeightPx=");
         var5.append(var4);
         var5.append(", maxWidthPx=");
         var5.append(var1);
         var5.append(")");
         return var5.toString();
      }
   }
}
