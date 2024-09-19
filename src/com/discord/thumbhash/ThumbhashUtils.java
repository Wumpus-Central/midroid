package com.discord.thumbhash;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Bitmap.Config;

public final class ThumbhashUtils {
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
      int var11 = var0[0] & 255 | (var0[1] & 255) << 8 | (var0[2] & 255) << 16;
      int var15 = var0[3] & 255 | (var0[4] & 255) << 8;
      float var8 = (var11 & 63) / 63.0F;
      float var10 = (var11 >> 6 & 63) / 31.5F;
      float var9 = (var11 >> 12 & 63) / 31.5F;
      float var6 = (var11 >> 18 & 31) / 31.0F;
      boolean var48;
      if (var11 >> 23 != 0) {
         var48 = 1;
      } else {
         var48 = 0;
      }

      float var4 = (var15 >> 3 & 63) / 63.0F;
      float var5 = (var15 >> 9 & 63) / 63.0F;
      boolean var13;
      if (var15 >> 15 != 0) {
         var13 = 1;
      } else {
         var13 = 0;
      }

      int var14 = 7;
      int var12;
      if (var13) {
         if (var48) {
            var12 = 5;
         } else {
            var12 = 7;
         }
      } else {
         var12 = var15 & 7;
      }

      int var20 = Math.max(3, var12);
      if (var13) {
         var12 = var15 & 7;
      } else {
         var12 = var14;
         if (var48) {
            var12 = 5;
         }
      }

      int var16 = Math.max(3, var12);
      float var3;
      if (var48) {
         var3 = (var0[5] & 15) / 15.0F;
      } else {
         var3 = 1.0F;
      }

      float var7 = (var0[5] >> 4 & 15) / 15.0F;
      byte var53;
      if (var48) {
         var53 = 6;
      } else {
         var53 = 5;
      }

      ThumbhashUtils.Channel var26 = new ThumbhashUtils.Channel(var20, var16);
      ThumbhashUtils.Channel var25 = new ThumbhashUtils.Channel(3, 3);
      ThumbhashUtils.Channel var27 = new ThumbhashUtils.Channel(3, 3);
      var13 = var27.decode(var0, var53, var25.decode(var0, var53, var26.decode(var0, var53, 0, var6), var4 * var2), var5 * var2);
      float[] var23 = null;
      ThumbhashUtils.Channel var24;
      if (var48) {
         var24 = new ThumbhashUtils.Channel(5, 5);
         var24.decode(var0, var53, var13, var7);
      } else {
         var24 = null;
      }

      float[] var75 = var26.ac;
      float[] var74 = var25.ac;
      float[] var76 = var27.ac;
      if (var48) {
         var23 = var24.ac;
      }

      var5 = thumbHashToApproximateAspectRatio(var0);
      float var77;
      var53 = (var77 = var5 - 1.0F) == 0.0F ? 0 : (var77 < 0.0F ? -1 : 1);
      var4 = 32.0F;
      if (var53 > 0) {
         var2 = 32.0F;
      } else {
         var2 = var5 * 32.0F;
      }

      int var21 = Math.round(var2);
      var2 = var4;
      if (var53 > 0) {
         var2 = 32.0F / var5;
      }

      int var22 = Math.round(var2);
      int[] var30 = new int[var21 * var22];
      byte var55;
      if (var48) {
         var55 = 5;
      } else {
         var55 = 3;
      }

      var15 = Math.max(var20, var55);
      if (var48) {
         var55 = 5;
      } else {
         var55 = 3;
      }

      var14 = Math.max(var16, var55);
      float[] var28 = new float[var15];
      float[] var29 = new float[var14];
      var13 = 0;
      float[] var73 = var23;
      int[] var72 = var30;
      boolean var57 = (boolean)var48;
      float[] var31 = var74;

      while (var13 < var22) {
         int var17 = 0;
         var48 = var14;

         while (var17 < var21) {
            for (int var61 = 0; var61 < var15; var61++) {
               var28[var61] = (float)Math.cos(Math.PI / var21 * (var17 + 0.5F) * var61);
            }

            int var18 = 0;
            var14 = var48;

            for (int var50 = var18; var50 < var14; var50++) {
               var29[var50] = (float)Math.cos(Math.PI / var22 * (var13 + 0.5F) * var50);
            }

            var4 = var8;
            var18 = 0;
            int var19 = 0;

            for (var48 = var16; var18 < var48; var18++) {
               var5 = var29[var18];
               if (var18 > 0) {
                  var16 = 0;
               } else {
                  var16 = 1;
               }

               while (var16 * var48 < var20 * (var48 - var18)) {
                  var2 = var4;
                  if (var16 <= var1) {
                     if (var18 > var1) {
                        var2 = var4;
                     } else {
                        var2 = var4 + var75[var19] * var28[var16] * var5 * 2.0F;
                     }
                  }

                  var16++;
                  var19++;
                  var4 = var2;
               }
            }

            var6 = var10 - 1.0F;
            var5 = var9 - 1.0F;
            var18 = 0;

            for (int var70 = 0; var18 < 3; var18++) {
               var2 = var29[var18];
               if (var18 > 0) {
                  var16 = 0;
               } else {
                  var16 = 1;
               }

               while (var16 < 3 - var18) {
                  var7 = var28[var16] * var2 * 2.0F;
                  var6 += var31[var70] * var7;
                  var5 += var76[var70] * var7;
                  var16++;
                  var70++;
               }
            }

            var2 = var3;
            var7 = var3;
            if (var57) {
               var18 = 0;
               var19 = 0;

               while (true) {
                  var7 = var2;
                  if (var18 >= 5) {
                     break;
                  }

                  var7 = var29[var18];
                  if (var18 > 0) {
                     var16 = 0;
                  } else {
                     var16 = 1;
                  }

                  while (var16 < 5 - var18) {
                     var2 += var73[var19] * var28[var16] * var7 * 2.0F;
                     var16++;
                     var19++;
                  }

                  var18++;
               }
            }

            var2 = var4 - var6 * 0.6666667F;
            var4 = (var4 * 3.0F - var2 + var5) / 2.0F;
            var72[var21 * var13 + var17] = Color.argb(
               Math.max(0, Math.round(Math.min(1.0F, var7) * 255.0F)),
               Math.max(0, Math.round(Math.min(1.0F, var4) * 255.0F)),
               Math.max(0, Math.round(Math.min(1.0F, var4 - var5) * 255.0F)),
               Math.max(0, Math.round(Math.min(1.0F, var2) * 255.0F))
            );
            var17++;
            var16 = var48;
            var48 = var14;
         }

         var13++;
         var14 = var48;
      }

      return Bitmap.createBitmap(var72, var21, var22, Config.ARGB_8888);
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
         byte var6 = 0;
         int var5 = var3;
         var3 = var6;

         while (true) {
            float[] var7 = this.ac;
            if (var3 >= var7.length) {
               return var5;
            }

            var7[var3] = ((var1[(var5 >> 1) + var2] >> ((var5 & 1) << 2) & 15) / 7.5F - 1.0F) * var4;
            var5++;
            var3++;
         }
      }
   }
}
