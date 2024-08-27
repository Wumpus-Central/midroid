package com.discord.blur

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.RecordingCanvas
import android.graphics.RenderNode
import android.graphics.Shader.TileMode
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.HashMap
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
internal class BlurViewTargetHardwareAccelerated(context: Context, blurTargetNativeId: String) : BlurViewTargetBase {
   private final var blurAmounts: MutableMap<Int, Float>
   private final val blurContentRenderNode: RenderNode
   private final val blurRectRenderNodes: MutableMap<Int, RenderNode>
   private final val blurRects: MutableMap<Int, com.discord.blur.BlurViewTargetHardwareAccelerated.BlurRect>
   private final var blurViewTargetHeight: Int
   private final var blurViewTargetLocation: IntArray
   private final var blurViewTargetWidth: Int
   private final var blurViewTargetWindowOffsetX: Int
   private final var blurViewTargetWindowOffsetY: Int

   init {
      r.h(var1, "context");
      r.h(var2, "blurTargetNativeId");
      super(var1, var2);
      this.blurViewTargetWidth = -1;
      this.blurViewTargetHeight = -1;
      this.blurViewTargetWindowOffsetX = -1;
      this.blurViewTargetWindowOffsetY = -1;
      this.blurViewTargetLocation = new int[2];
      this.blurAmounts = new HashMap<>();
      this.blurRects = new HashMap<>();
      this.blurRectRenderNodes = new HashMap<>();
      this.blurContentRenderNode = new RenderNode("content");
   }

   public override fun addBlurRect(rectId: Int, windowX: Int, windowY: Int, width: Int, height: Int) {
      var var9: BlurViewTargetHardwareAccelerated.BlurRect;
      label43: {
         var9 = this.blurRects.get(var1);
         if (var9 != null) {
            var var11: Boolean;
            if (var9.getWindowX() == var2 && var9.getWindowY() == var3) {
               var11 = true;
            } else {
               var11 = false;
            }

            val var7: Boolean;
            if (var9.getWidth() == var4 && var9.getHeight() == var5) {
               var7 = true;
            } else {
               var7 = false;
            }

            if (var11 && var7) {
               var11 = true;
            } else {
               var11 = false;
            }

            if (var11) {
               break label43;
            }
         }

         var9 = null;
      }

      if (var9 == null) {
         val var13: java.util.Map = this.blurRectRenderNodes;
         val var10: StringBuilder = new StringBuilder();
         var10.append("blur-");
         var10.append(var1);
         var13.putIfAbsent(var1, new RenderNode(var10.toString()));
         this.blurRects.put(var1, new BlurViewTargetHardwareAccelerated.BlurRect(var2, var3, var4, var5));
         this.invalidate();
      }
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      r.h(var1, "canvas");
      val var9: java.util.Map = this.blurRects;
      val var8: LinkedHashMap = new LinkedHashMap();
      val var15: java.util.Iterator = var9.entrySet().iterator();

      while (true) {
         if (!var15.hasNext()) {
            if (var8.isEmpty()) {
               super.dispatchDraw(var1);
               return;
            }

            a.a(this.blurContentRenderNode, 0, 0, this.blurViewTargetWidth, this.blurViewTargetHeight);
            super.dispatchDraw(f.a(this.blurContentRenderNode));
            d.a(this.blurContentRenderNode);
            e.a(var1, this.blurContentRenderNode);

            for (Entry var17 : this.blurRectRenderNodes.entrySet()) {
               val var13: Int = (var17.getKey() as java.lang.Number).intValue();
               val var12: RenderNode = var17.getValue() as RenderNode;
               val var19: BlurViewTargetHardwareAccelerated.BlurRect = var8.get(var13) as BlurViewTargetHardwareAccelerated.BlurRect;
               if (var19 != null) {
                  val var2: Float = this.blurAmounts.getOrDefault(var13, -1.0F).floatValue();
                  h.a(var12, g.a(Math.abs(var2), Math.abs(var2), TileMode.CLAMP));
                  a.a(var12, 0, 0, var19.getWidth(), var19.getHeight());
                  i.a(var12, (float)(var19.getWindowX() - this.blurViewTargetWindowOffsetX));
                  j.a(var12, (float)(var19.getWindowY() - this.blurViewTargetWindowOffsetY));
                  val var18: RecordingCanvas = f.a(var12);
                  b.a(
                     var18,
                     -((float)(var19.getWindowX() - this.blurViewTargetWindowOffsetX)),
                     -((float)(var19.getWindowY() - this.blurViewTargetWindowOffsetY))
                  );
                  c.a(var18, this.blurContentRenderNode);
                  d.a(var12);
                  e.a(var1, var12);
               }
            }

            return;
         }

         val var10: Entry = var15.next() as Entry;
         val var4: Int = (var10.getKey() as java.lang.Number).intValue();
         val var11: BlurViewTargetHardwareAccelerated.BlurRect = var10.getValue() as BlurViewTargetHardwareAccelerated.BlurRect;
         val var3: Boolean;
         if (var11.getWidth() != 0 && var11.getHeight() != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         val var14: Boolean;
         if (this.blurAmounts.getOrDefault(var4, -1.0F).floatValue() > 0.0F) {
            var14 = true;
         } else {
            var14 = false;
         }

         var var5: Boolean = false;
         if (var3) {
            var5 = false;
            if (var14) {
               var5 = true;
            }
         }

         if (var5) {
            var8.put(var10.getKey(), var10.getValue());
         }
      }
   }

   protected open fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
      super.onLayout(var1, var2, var3, var4, var5);
      this.getLocationInWindow(this.blurViewTargetLocation);
      this.blurViewTargetWidth = this.getWidth();
      this.blurViewTargetHeight = this.getHeight();
      val var6: IntArray = this.blurViewTargetLocation;
      this.blurViewTargetWindowOffsetX = this.blurViewTargetLocation[0];
      this.blurViewTargetWindowOffsetY = var6[1];
   }

   public override fun removeBlurRect(rectId: Int) {
      val var2: Boolean;
      if (this.blurRects.remove(var1) != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      val var3: Boolean;
      if (this.blurRectRenderNodes.remove(var1) != null) {
         var3 = true;
      } else {
         var3 = false;
      }

      val var6: Boolean;
      if (this.blurAmounts.remove(var1) != null) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (var2 || var3 || var6) {
         this.invalidate();
      }
   }

   public override fun setBlurAmount(rectId: Int, blurAmount: Float) {
      var2 = SizeUtilsKt.getDpToPx(BlurView.Companion.mapRadius$blur_release$default(BlurView.Companion, var2, 36.0F, 0.0F, 4, null));
      if (!r.b(this.blurAmounts.get(var1), var2)) {
         this.blurAmounts.put(var1, var2);
         this.invalidate();
      }
   }

   private data class BlurRect(windowX: Int, windowY: Int, width: Int, height: Int) {
      public final val height: Int
      public final val width: Int
      public final val windowX: Int
      public final val windowY: Int

      init {
         this.windowX = var1;
         this.windowY = var2;
         this.width = var3;
         this.height = var4;
      }

      public operator fun component1(): Int {
         return this.windowX;
      }

      public operator fun component2(): Int {
         return this.windowY;
      }

      public operator fun component3(): Int {
         return this.width;
      }

      public operator fun component4(): Int {
         return this.height;
      }

      public fun copy(windowX: Int = var0.windowX, windowY: Int = var0.windowY, width: Int = var0.width, height: Int = var0.height): com.discord.blur.BlurViewTargetHardwareAccelerated.BlurRect {
         return new BlurViewTargetHardwareAccelerated.BlurRect(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is BlurViewTargetHardwareAccelerated.BlurRect) {
            return false;
         } else {
            var1 = var1;
            if (this.windowX != var1.windowX) {
               return false;
            } else if (this.windowY != var1.windowY) {
               return false;
            } else if (this.width != var1.width) {
               return false;
            } else {
               return this.height == var1.height;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.windowX) * 31 + Integer.hashCode(this.windowY)) * 31 + Integer.hashCode(this.width)) * 31
            + Integer.hashCode(this.height);
      }

      public override fun toString(): String {
         val var1: Int = this.windowX;
         val var2: Int = this.windowY;
         val var3: Int = this.width;
         val var4: Int = this.height;
         val var5: StringBuilder = new StringBuilder();
         var5.append("BlurRect(windowX=");
         var5.append(var1);
         var5.append(", windowY=");
         var5.append(var2);
         var5.append(", width=");
         var5.append(var3);
         var5.append(", height=");
         var5.append(var4);
         var5.append(")");
         return var5.toString();
      }
   }
}
