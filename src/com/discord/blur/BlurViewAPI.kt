package com.discord.blur

import android.view.ViewGroup

internal interface BlurViewAPI : BlurViewAPIBase {
   public abstract fun setBlurTint(color: Int) {
   }

   public abstract fun setBlurTintIOSParityCompensation(color: Int) {
   }

   public interface Target : BlurViewAPIBase {
      public val viewRef: ViewGroup

      public abstract fun addBlurRect(rectId: Int, windowX: Int, windowY: Int, width: Int, height: Int) {
      }

      public abstract fun removeBlurRect(rectId: Int) {
      }
   }
}
