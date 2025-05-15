package com.discord.safearea

import android.app.Activity
import android.content.Context
import android.os.Build.VERSION
import android.view.View
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt
import com.th3rdwave.safeareacontext.EdgeInsets
import com.th3rdwave.safeareacontext.e
import kotlin.jvm.internal.q

internal data class SafeAreaEdgeInsets(topDp: Float = 0.0F, rightDp: Float = 0.0F, bottomDp: Float = 0.0F, leftDp: Float = 0.0F) {
   public final val bottomDp: Float
   public final val leftDp: Float
   public final val rightDp: Float
   public final val topDp: Float

   fun SafeAreaEdgeInsets() {
      this(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
   }

   init {
      this.topDp = var1;
      this.rightDp = var2;
      this.bottomDp = var3;
      this.leftDp = var4;
   }

   public constructor(edgeInsets: EdgeInsets) : q.h(var1, "edgeInsets") {
      this(
         SizeUtilsKt.getPxToDp((int)var1.d()), SizeUtilsKt.getPxToDp((int)var1.c()), SizeUtilsKt.getPxToDp((int)var1.a()), SizeUtilsKt.getPxToDp((int)var1.b())
      );
   }

   public operator fun component1(): Float {
      return this.topDp;
   }

   public operator fun component2(): Float {
      return this.rightDp;
   }

   public operator fun component3(): Float {
      return this.bottomDp;
   }

   public operator fun component4(): Float {
      return this.leftDp;
   }

   public fun copy(topDp: Float = var0.topDp, rightDp: Float = var0.rightDp, bottomDp: Float = var0.bottomDp, leftDp: Float = var0.leftDp): SafeAreaEdgeInsets {
      return new SafeAreaEdgeInsets(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SafeAreaEdgeInsets) {
         return false;
      } else {
         var1 = var1;
         if (java.lang.Float.compare(this.topDp, var1.topDp) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.rightDp, var1.rightDp) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.bottomDp, var1.bottomDp) != 0) {
            return false;
         } else {
            return java.lang.Float.compare(this.leftDp, var1.leftDp) == 0;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((java.lang.Float.hashCode(this.topDp) * 31 + java.lang.Float.hashCode(this.rightDp)) * 31 + java.lang.Float.hashCode(this.bottomDp)) * 31
         + java.lang.Float.hashCode(this.leftDp);
   }

   public override fun toString(): String {
      val var2: Float = this.topDp;
      val var3: Float = this.rightDp;
      val var1: Float = this.bottomDp;
      val var4: Float = this.leftDp;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SafeAreaEdgeInsets(topDp=");
      var5.append(var2);
      var5.append(", rightDp=");
      var5.append(var3);
      var5.append(", bottomDp=");
      var5.append(var1);
      var5.append(", leftDp=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      private fun Context.fromRootViewAsStableInsets(insets: WindowInsetsCompat, leftRight: Boolean = false): SafeAreaEdgeInsets {
         val var10: Insets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(var2, true);
         val var11: Insets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(var2, var1, true);
         var var7: Int = -1;
         val var12: SafeAreaEdgeInsets;
         if (VERSION.SDK_INT > 29) {
            val var4: Float = SizeUtilsKt.getPxToDp(Math.max(var10.b, var11.b));
            val var6: Float = SizeUtilsKt.getPxToDp(Math.max(var10.d, var11.d));
            val var16: Int;
            if (var3) {
               var16 = var11.a;
            } else {
               var16 = -1;
            }

            val var5: Float = SizeUtilsKt.getPxToDp(Math.max(var10.a, var16));
            if (var3) {
               var7 = var11.c;
            }

            var12 = new SafeAreaEdgeInsets(var4, SizeUtilsKt.getPxToDp(Math.max(var10.c, var7)), var6, var5);
         } else {
            val var13: Float = SizeUtilsKt.getPxToDp(Math.max(var10.b, var2.k()));
            val var14: Float = SizeUtilsKt.getPxToDp(Math.max(var10.d, var2.h()));
            val var18: Int;
            if (var3) {
               var18 = var2.i();
            } else {
               var18 = -1;
            }

            val var15: Float = SizeUtilsKt.getPxToDp(Math.max(var10.a, var18));
            if (var3) {
               var7 = var2.j();
            }

            var12 = new SafeAreaEdgeInsets(var13, SizeUtilsKt.getPxToDp(Math.max(var10.c, var7)), var14, var15);
         }

         return var12;
      }

      public fun fromRootView(activity: Activity?): SafeAreaEdgeInsets {
         if (var1 != null) {
            val var2: View = ActivityExtensionsKt.getRootView(var1);
            if (var2 != null) {
               val var3: EdgeInsets = e.e(var2);
               if (var3 != null) {
                  return new SafeAreaEdgeInsets(var3);
               }
            }
         }

         return new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
      }

      public fun fromRootViewAsStableInsets(activity: Activity?): SafeAreaEdgeInsets {
         if (var1 != null) {
            val var2: WindowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var1);
            if (var2 == null) {
               return new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
            }

            val var4: SafeAreaEdgeInsets = fromRootViewAsStableInsets$default(this, var1, var2, false, 2, null);
            if (var4 != null) {
               return var4;
            }
         }

         return new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
      }
   }
}
