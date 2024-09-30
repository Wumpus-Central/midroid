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
import kotlin.jvm.internal.q

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
      q.h(var1, "context");
      q.h(var2, "blurTargetNativeId");
      super(var1, var2);
      this.blurViewTargetWidth = -1;
      this.blurViewTargetHeight = -1;
      this.blurViewTargetWindowOffsetX = -1;
      this.blurViewTargetWindowOffsetY = -1;
      this.blurViewTargetLocation = new int[2];
      this.blurAmounts = new HashMap<>();
      this.blurRects = new HashMap<>();
      this.blurRectRenderNodes = new HashMap<>();
      this.blurContentRenderNode = c.a("content");
   }

   public override fun addBlurRect(rectId: Int, windowX: Int, windowY: Int, width: Int, height: Int) {
      var var9: BlurViewTargetHardwareAccelerated.BlurRect;
      label33: {
         var9 = this.blurRects.get(var1);
         if (var9 != null) {
            val var11: Boolean;
            if (var9.getWindowX() == var2 && var9.getWindowY() == var3) {
               var11 = true;
            } else {
               var11 = false;
            }

            var var7: Boolean = false;
            if (var9.getWidth() == var4) {
               var7 = false;
               if (var9.getHeight() == var5) {
                  var7 = true;
               }
            }

            if (var11 && var7) {
               break label33;
            }
         }

         var9 = null;
      }

      if (var9 == null) {
         val var10: java.util.Map = this.blurRectRenderNodes;
         d.a();
         val var12: StringBuilder = new StringBuilder();
         var12.append("blur-");
         var12.append(var1);
         var10.putIfAbsent(var1, c.a(var12.toString()));
         this.blurRects.put(var1, new BlurViewTargetHardwareAccelerated.BlurRect(var2, var3, var4, var5));
         this.invalidate();
      }
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      q.h(var1, "canvas");
      val var8: java.util.Map = this.blurRects;
      val var7: LinkedHashMap = new LinkedHashMap();
      val var13: java.util.Iterator = var8.entrySet().iterator();

      while (true) {
         val var6: Boolean = var13.hasNext();
         var var4: Boolean = false;
         if (!var6) {
            if (var7.isEmpty()) {
               super.dispatchDraw(var1);
               return;
            }

            a.a(this.blurContentRenderNode, 0, 0, this.blurViewTargetWidth, this.blurViewTargetHeight);
            super.dispatchDraw(e.a(this.blurContentRenderNode));
            h.a(this.blurContentRenderNode);
            i.a(var1, this.blurContentRenderNode);

            for (Entry var15 : this.blurRectRenderNodes.entrySet()) {
               val var12: Int = (var15.getKey() as java.lang.Number).intValue();
               val var17: RenderNode = j.a(var15.getValue());
               val var11: BlurViewTargetHardwareAccelerated.BlurRect = var7.get(var12) as BlurViewTargetHardwareAccelerated.BlurRect;
               if (var11 != null) {
                  val var2: Float = this.blurAmounts.getOrDefault(var12, -1.0F).floatValue();
                  l.a(var17, k.a(Math.abs(var2), Math.abs(var2), TileMode.CLAMP));
                  a.a(var17, 0, 0, var11.getWidth(), var11.getHeight());
                  m.a(var17, (float)(var11.getWindowX() - this.blurViewTargetWindowOffsetX));
                  b.a(var17, (float)(var11.getWindowY() - this.blurViewTargetWindowOffsetY));
                  val var16: RecordingCanvas = e.a(var17);
                  f.a(
                     var16,
                     -((float)(var11.getWindowX() - this.blurViewTargetWindowOffsetX)),
                     -((float)(var11.getWindowY() - this.blurViewTargetWindowOffsetY))
                  );
                  g.a(var16, this.blurContentRenderNode);
                  h.a(var17);
                  i.a(var1, var17);
               }
            }

            return;
         }

         val var9: Entry = var13.next() as Entry;
         val var5: Int = (var9.getKey() as java.lang.Number).intValue();
         val var10: BlurViewTargetHardwareAccelerated.BlurRect = var9.getValue() as BlurViewTargetHardwareAccelerated.BlurRect;
         val var3: Boolean;
         if (var10.getWidth() != 0 && var10.getHeight() != 0) {
            var3 = true;
         } else {
            var3 = false;
         }

         if (this.blurAmounts.getOrDefault(var5, -1.0F).floatValue() > 0.0F) {
            var4 = true;
         }

         if (var3 && var4) {
            var7.put(var9.getKey(), var9.getValue());
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
      val var5: Any = this.blurRects.remove(var1);
      var var4: Boolean = false;
      val var2: Boolean;
      if (var5 != null) {
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

      if (this.blurAmounts.remove(var1) != null) {
         var4 = true;
      }

      if (var2 || var3 || var4) {
         this.invalidate();
      }
   }

   public override fun setBlurAmount(rectId: Int, blurAmount: Float) {
      var2 = SizeUtilsKt.getDpToPx(BlurView.Companion.mapRadius$blur_release$default(BlurView.Companion, var2, 36.0F, 0.0F, 4, null));
      if (!q.b(this.blurAmounts.get(var1), var2)) {
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
         val var3: Int = this.windowY;
         val var4: Int = this.width;
         val var2: Int = this.height;
         val var5: StringBuilder = new StringBuilder();
         var5.append("BlurRect(windowX=");
         var5.append(var1);
         var5.append(", windowY=");
         var5.append(var3);
         var5.append(", width=");
         var5.append(var4);
         var5.append(", height=");
         var5.append(var2);
         var5.append(")");
         return var5.toString();
      }
   }
}
