package com.discord.fastest_list.react

import android.graphics.RectF
import com.discord.fastest_list.android.FastestListView
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.yoga.e
import kotlin.jvm.internal.r

internal class FastestListShadowNode : LayoutShadowNode {
   private final var isDirty: Boolean
   private final var nextUpdateNeedsMeasureAndLayout: Boolean
   private final var padding: RectF = new RectF(0.0F, 0.0F, 0.0F, 0.0F)
   private final var paddingPrev: RectF = new RectF(0.0F, 0.0F, 0.0F, 0.0F)

   private fun flushChanges(view: FastestListView) {
      if (this.isDirty) {
         var1.setPadding((int)this.padding.left, (int)this.padding.top, (int)this.padding.right, (int)this.padding.bottom);
         if (!this.nextUpdateNeedsMeasureAndLayout) {
            this.nextUpdateNeedsMeasureAndLayout = true;
         } else {
            ViewMeasureExtensionsKt.measureAndLayout(var1);
         }

         this.isDirty = false;
      }
   }

   public open fun setDefaultPadding(spacingType: Int, padding: Float) {
      val var4: java.lang.String = FastestListShadowNode.class.getSimpleName();
      val var3: StringBuilder = new StringBuilder();
      var3.append(var4);
      var3.append(" does not support default padding");
      throw new IllegalStateException(var3.toString().toString());
   }

   public open fun setPadding(spacingType: Int, padding: Float) {
      super.setPadding(var1, var2);
      val var4: e = e.d(var1);
      val var3: Int;
      if (var4 == null) {
         var3 = -1;
      } else {
         var3 = FastestListShadowNode.WhenMappings.$EnumSwitchMapping$0[var4.ordinal()];
      }

      switch (var3) {
         case -1:
            val var7: StringBuilder = new StringBuilder();
            var7.append("Unknown spacing type ");
            var7.append(var1);
            throw new IllegalStateException(var7.toString().toString());
         case 0:
         default:
            break;
         case 1:
            val var6: RectF = this.padding;
            this.padding.left = var2;
            var6.right = var2;
            break;
         case 2:
            val var5: RectF = this.padding;
            this.padding.top = var2;
            var5.bottom = var2;
            break;
         case 3:
            this.padding.set(var2, var2, var2, var2);
            break;
         case 4:
            this.padding.left = var2;
            break;
         case 5:
            this.padding.top = var2;
            break;
         case 6:
            this.padding.right = var2;
            break;
         case 7:
            this.padding.bottom = var2;
            break;
         case 8:
            this.padding.left = var2;
            break;
         case 9:
            this.padding.right = var2;
      }

      if (!r.c(this.paddingPrev, this.padding)) {
         this.paddingPrev.set(this.padding);
         this.isDirty = true;
      }
   }

   public open fun setPaddingPercent(spacingType: Int, percent: Float): Nothing {
      val var4: java.lang.String = FastestListShadowNode.class.getSimpleName();
      val var3: StringBuilder = new StringBuilder();
      var3.append(var4);
      var3.append(" does not support percentage based padding");
      throw new IllegalStateException(var3.toString().toString());
   }

   public open fun setReactTag(reactTag: Int) {
      super.setReactTag(var1);
      activeShadowNodes.put(var1, this);
   }

   public companion object {
      private final val activeShadowNodes: MutableMap<Int, FastestListShadowNode>

      public fun FastestListView.dropShadowNode() {
         r.h(var1, "<this>");
         FastestListShadowNode.access$getActiveShadowNodes$cp().remove(var1.getId());
      }

      public fun FastestListView.updateFromShadowNode() {
         r.h(var1, "<this>");
         val var2: FastestListShadowNode = FastestListShadowNode.access$getActiveShadowNodes$cp().get(var1.getId()) as FastestListShadowNode;
         if (var2 != null) {
            FastestListShadowNode.access$flushChanges(var2, var1);
         }
      }
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var0: IntArray = new int[e.values().length];

         try {
            var0[e.q.ordinal()] = 1;
         } catch (var10: NoSuchFieldError) {
         }

         try {
            var0[e.r.ordinal()] = 2;
         } catch (var9: NoSuchFieldError) {
         }

         try {
            var0[e.s.ordinal()] = 3;
         } catch (var8: NoSuchFieldError) {
         }

         try {
            var0[e.k.ordinal()] = 4;
         } catch (var7: NoSuchFieldError) {
         }

         try {
            var0[e.l.ordinal()] = 5;
         } catch (var6: NoSuchFieldError) {
         }

         try {
            var0[e.m.ordinal()] = 6;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[e.n.ordinal()] = 7;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[e.o.ordinal()] = 8;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[e.p.ordinal()] = 9;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
