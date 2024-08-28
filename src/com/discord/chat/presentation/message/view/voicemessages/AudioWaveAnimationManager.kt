package com.discord.chat.presentation.message.view.voicemessages

public class AudioWaveAnimationManager {
   private final var audioChunkAnimationStarts: Array<Long?>

   public final var data: ByteArray = new byte[0]
      internal final set(value) {
         kotlin.jvm.internal.q.h(var1, "value");
         this.audioChunkAnimationStarts = new java.lang.Long[var1.length];
         this.data = var1;
      }


   private fun animateAdditionalHeight(progress: Float): Float {
      val var4: Float = 1.5F * (1.0F - var1) * (1.0F - var1);
      if (var1 <= 0.5F) {
         var1 = 4 * var1 * 2.0F * (var4 + 1.0F);
      } else {
         var1 = 4 + -4 * (var1 - 0.5F) * 2.0F * (var4 + 1.0F);
      }

      return var1;
   }

   private fun getCurrentValue(index: Int, percentage: Float): Float {
      if (var1 >= this.data.length) {
         return 0.0F;
      } else {
         if (this.audioChunkAnimationStarts[var1] == null) {
            this.audioChunkAnimationStarts[var1] = System.currentTimeMillis() - (long)(var2 * (float)500);
         }

         var var3: Long = System.currentTimeMillis();
         val var7: java.lang.Long = this.audioChunkAnimationStarts[var1];
         kotlin.jvm.internal.q.e(this.audioChunkAnimationStarts[var1]);
         var3 = var3 - var7;
         return if (var3 > 500L) 1.0F else (float)var3 / 500.0F;
      }
   }

   public fun getAnimationValues(index: Int, percentage: Float, originalHeight: Float): Float {
      if (var2 < 0.0F) {
         var2 = 0.0F;
      } else {
         var2 = var3 + this.animateAdditionalHeight(this.getCurrentValue(var1, var2));
      }

      return var2;
   }

   public fun reset() {
      this.audioChunkAnimationStarts = new java.lang.Long[this.data.length];
   }

   public fun resetIndex(index: Int) {
      this.audioChunkAnimationStarts[var1] = null;
   }

   public companion object {
      private const val FIXED_ANIMATED_HEIGHT: Int
   }
}
