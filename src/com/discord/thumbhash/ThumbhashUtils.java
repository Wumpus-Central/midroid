package com.discord.thumbhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Bitmap.Config;

final class ThumbhashUtils {
   public static float thumbHashToApproximateAspectRatio(byte[] var0) {
      byte var5 = var0[3];
      int var1 = var0[2];
      boolean var3 = false;
      boolean var2;
      if ((var1 & 128) != 0) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      if ((var0[4] & 128) != 0) {
         var3 = true;
      }

      byte var4 = 5;
      if (var3) {
         if (var2) {
            var1 = 5;
         } else {
            var1 = 7;
         }
      } else {
         var1 = var5 & 7;
      }

      if (var3) {
         var2 = var5 & 7;
      } else if (var2) {
         var2 = var4;
      } else {
         var2 = 7;
      }

      return (float)var1 / var2;
   }

   public static Bitmap thumbHashToRGBA(byte[] var0) {
      return thumbHashToRGBA(var0, 1, 1.1F);
   }

   public static Bitmap thumbHashToRGBA(byte[] var0, int var1, float var2) {
      int var12 = var0[0] & 255 | (var0[1] & 255) << 8 | (var0[2] & 255) << 16;
      int var17 = var0[3] & 255 | (var0[4] & 255) << 8;
      float var9 = (var12 & 63) / 63.0F;
      float var11 = (var12 >> 6 & 63) / 31.5F;
      float var10 = (var12 >> 12 & 63) / 31.5F;
      float var7 = (var12 >> 18 & 31) / 31.0F;
      boolean var18;
      if (var12 >> 23 != 0) {
         var18 = true;
      } else {
         var18 = false;
      }

      float var6 = (var17 >> 3 & 63) / 63.0F;
      float var5 = (var17 >> 9 & 63) / 63.0F;
      boolean var13;
      if (var17 >> 15 != 0) {
         var13 = 1;
      } else {
         var13 = 0;
      }

      int var16 = 7;
      int var15 = 5;
      if (var13) {
         if (var18) {
            var12 = 5;
         } else {
            var12 = 7;
         }
      } else {
         var12 = var17 & 7;
      }

      int var14 = Math.max(3, var12);
      if (var13) {
         var12 = var17 & 7;
      } else {
         var12 = var16;
         if (var18) {
            var12 = 5;
         }
      }

      var13 = Math.max(3, var12);
      float var3;
      if (var18) {
         var3 = (var0[5] & 15) / 15.0F;
      } else {
         var3 = 1.0F;
      }

      int var50 = var0[5];
      float var4 = 1.0F;
      float var8 = (var50 >> 4 & 15) / 15.0F;
      var50 = (byte)var15;
      if (var18) {
         var50 = (byte)6;
      }

      ThumbhashUtils.Channel var28 = new ThumbhashUtils.Channel(var14, var13);
      ThumbhashUtils.Channel var26 = new ThumbhashUtils.Channel(3, 3);
      ThumbhashUtils.Channel var27 = new ThumbhashUtils.Channel(3, 3);
      var15 = var27.decode(var0, var50, var26.decode(var0, var50, var28.decode(var0, var50, 0, var7), var6 * var2), var5 * var2);
      float[] var24 = null;
      ThumbhashUtils.Channel var25;
      if (var18) {
         var25 = new ThumbhashUtils.Channel(5, 5);
         var25.decode(var0, var50, var15, var8);
      } else {
         var25 = null;
      }

      float[] var74 = var28.ac;
      float[] var72 = var26.ac;
      float[] var73 = var27.ac;
      if (var18) {
         var24 = var25.ac;
      }

      var6 = thumbHashToApproximateAspectRatio(var0);
      float var75;
      var50 = (var75 = var6 - 1.0F) == 0.0F ? 0 : (var75 < 0.0F ? -1 : 1);
      var5 = 32.0F;
      if (var50 > 0) {
         var2 = 32.0F;
      } else {
         var2 = var6 * 32.0F;
      }

      int var21 = Math.round(var2);
      var2 = var5;
      if (var50 > 0) {
         var2 = 32.0F / var6;
      }

      int var22 = Math.round(var2);
      int[] var30 = new int[var21 * var22];
      byte var53;
      if (var18) {
         var53 = 5;
      } else {
         var53 = 3;
      }

      var16 = Math.max(var14, var53);
      if (var18) {
         var53 = (byte)5;
      } else {
         var53 = (byte)3;
      }

      int var23 = Math.max(var13, var53);
      float[] var29 = new float[var16];
      float[] var31 = new float[var23];
      var15 = 0;
      var53 = var16;
      float[] var71 = var73;

      for (float[] var32 = var72; var15 < var22; var15++) {
         for (var16 = 0; var16 < var21; var16++) {
            for (int var64 = 0; var64 < var53; var64++) {
               var29[var64] = (float)Math.cos(Math.PI / var21 * (var16 + 0.5F) * var64);
            }

            for (int var65 = 0; var65 < var23; var65++) {
               var31[var65] = (float)Math.cos(Math.PI / var22 * (var15 + 0.5F) * var65);
            }

            var2 = var9;
            int var20 = 0;

            for (int var61 = 0; var20 < var13; var20++) {
               var5 = var31[var20];
               if (var20 > 0) {
                  var17 = 0;
               } else {
                  var17 = 1;
               }

               while (var17 * var13 < var14 * (var13 - var20)) {
                  if (var17 <= var1 && var20 <= var1) {
                     var2 += var74[var61] * var29[var17] * (var5 * 2.0F);
                  }

                  var17++;
                  var61++;
               }
            }

            var7 = var11 - 1.0F;
            var6 = var10 - 1.0F;
            var17 = 0;

            for (int var69 = 0; var17 < 3; var17++) {
               var5 = var31[var17];
               if (var17 > 0) {
                  var16 = 0;
               } else {
                  var16 = 1;
               }

               while (var16 < 3 - var17) {
                  var8 = var29[var16] * (var5 * 2.0F);
                  var7 += var32[var69] * var8;
                  var6 += var71[var69] * var8;
                  var16++;
                  var69++;
               }
            }

            var5 = var3;
            var8 = var3;
            if (var18) {
               var16 = 0;
               var20 = 0;

               while (true) {
                  var8 = var5;
                  if (var16 >= 5) {
                     break;
                  }

                  var8 = var31[var16];
                  if (var16 > 0) {
                     var17 = 0;
                  } else {
                     var17 = 1;
                  }

                  while (var17 < 5 - var16) {
                     var5 += var24[var20] * var29[var17] * (var8 * 2.0F);
                     var17++;
                     var20++;
                  }

                  var16++;
               }
            }

            var5 = var2 - var7 * 0.6666667F;
            var2 = (var2 * 3.0F - var5 + var6) / 2.0F;
            var30[var21 * var15 + var16] = Color.argb(
               Math.max(0, Math.round(Math.min(var4, var8) * 255.0F)),
               Math.max(0, Math.round(Math.min(var4, var2) * 255.0F)),
               Math.max(0, Math.round(Math.min(var4, var2 - var6) * 255.0F)),
               Math.max(0, Math.round(Math.min(var4, var5) * 255.0F))
            );
         }
      }

      return Bitmap.createBitmap(var30, var21, var22, Config.ARGB_8888);
   }

   private static final class Channel {
      float[] ac;
      float dc;
      int nx;
      int ny;
      float scale;

      Channel(int var1, int var2) {
         this.nx = var1;
         this.ny = var2;
         int var4 = 0;

         int var5;
         for (var5 = 0; var4 < var2; var4++) {
            int var3;
            if (var4 > 0) {
               var3 = 0;
            } else {
               var3 = 1;
            }

            while (var3 * var2 < (var2 - var4) * var1) {
               var5++;
               var3++;
            }
         }

         this.ac = new float[var5];
      }

      int decode(byte[] var1, int var2, int var3, float var4) {
         int var5 = 0;

         while (true) {
            float[] var6 = this.ac;
            if (var5 >= var6.length) {
               return var3;
            }

            var6[var5] = ((var1[(var3 >> 1) + var2] >> ((var3 & 1) << 2) & 15) / 7.5F - 1.0F) * var4;
            var3++;
            var5++;
         }
      }
   }
}
