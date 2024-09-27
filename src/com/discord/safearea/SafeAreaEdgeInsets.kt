package com.discord.safearea

import android.app.Activity
import android.os.Build.VERSION
import android.view.View
import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.misc.utilities.insets.WindowInsetsCompatExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
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
      val var1: Float = this.topDp;
      val var2: Float = this.rightDp;
      val var3: Float = this.bottomDp;
      val var4: Float = this.leftDp;
      val var5: StringBuilder = new StringBuilder();
      var5.append("SafeAreaEdgeInsets(topDp=");
      var5.append(var1);
      var5.append(", rightDp=");
      var5.append(var2);
      var5.append(", bottomDp=");
      var5.append(var3);
      var5.append(", leftDp=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
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
            val var6: WindowInsetsCompat = WindowInsetsCompatExtensionsKt.getWindowInsetsCompat(var1);
            if (var6 != null) {
               val var5: Insets = WindowInsetsCompatExtensionsKt.getDisplayCutoutInsets(var6, true);
               val var7: Insets = WindowInsetsCompatExtensionsKt.getSystemBarInsets(var6, true);
               val var8: SafeAreaEdgeInsets;
               if (VERSION.SDK_INT > 29) {
                  var8 = new SafeAreaEdgeInsets(
                     SizeUtilsKt.getPxToDp(Math.max(var5.b, var7.b)),
                     SizeUtilsKt.getPxToDp(var5.c),
                     SizeUtilsKt.getPxToDp(Math.max(var5.d, var7.d)),
                     SizeUtilsKt.getPxToDp(var5.a)
                  );
               } else {
                  var8 = new SafeAreaEdgeInsets(
                     SizeUtilsKt.getPxToDp(Math.max(var5.b, var6.i())),
                     SizeUtilsKt.getPxToDp(var5.c),
                     SizeUtilsKt.getPxToDp(Math.max(var5.d, var6.h())),
                     SizeUtilsKt.getPxToDp(var5.a)
                  );
               }

               return var8;
            }
         }

         return new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
      }
   }
}
