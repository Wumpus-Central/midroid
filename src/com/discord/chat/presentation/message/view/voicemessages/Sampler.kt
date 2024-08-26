package com.discord.chat.presentation.message.view.voicemessages

public object Sampler {
   public fun downSample(data: ByteArray, targetSize: Int): ByteArray {
      kotlin.jvm.internal.r.h(var1, "data");
      if (var2 == 0) {
         return new byte[0];
      } else if (var1.length == var2) {
         return var1;
      } else {
         var var4: Boolean;
         if (var1.length == 0) {
            var4 = 1;
         } else {
            var4 = 0;
         }

         if (var4) {
            return new byte[var2];
         } else if (var1.length < var2) {
            return kotlin.collections.b.o(var1, new byte[var2 - var1.length]);
         } else {
            val var3: Float = (float)var1.length / var2;
            val var11: ByteArray = new byte[var2];
            var var5: Int = 0;
            var4 = 0;

            while (var5 < var2) {
               val var9: Int = var5 + 1;
               val var8: Int = (int)((float)Math.rint((double)((float)(var5 + 1) * var3)));
               val var10: Int = Math.min(var8, var1.length);
               var var7: Int = 0;

               var var6: Int;
               for (var6 = 0; var4 < var10; var4++) {
                  var7 += SamplerKt.getAbs(var1[var4]);
                  var6++;
               }

               var11[var5] = (byte)(var7 / var6);
               var5 = var9;
               var4 = var8;
            }

            return var11;
         }
      }
   }
}
