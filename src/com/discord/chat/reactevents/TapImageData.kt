package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kh.w
import kotlin.jvm.internal.q

public data class TapImageData(id: String,
      index: Int,
      type: String,
      layout: com.discord.chat.reactevents.TapImageData.Layout,
      portal: Double?,
      embedIndex: Int?,
      componentId: String?,
      componentMediaIndex: Int?
   ) :
   ReactEvent {
   public final val componentId: String?
   public final val componentMediaIndex: Int?
   public final val embedIndex: Int?
   public final val id: String
   public final val index: Int
   public final val layout: com.discord.chat.reactevents.TapImageData.Layout
   public final val portal: Double?
   public final val type: String

   init {
      q.h(var1, "id");
      q.h(var3, "type");
      q.h(var4, "layout");
      super();
      this.id = var1;
      this.index = var2;
      this.type = var3;
      this.layout = var4;
      this.portal = var5;
      this.embedIndex = var6;
      this.componentId = var7;
      this.componentMediaIndex = var8;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): String {
      return this.type;
   }

   public operator fun component4(): com.discord.chat.reactevents.TapImageData.Layout {
      return this.layout;
   }

   public operator fun component5(): Double? {
      return this.portal;
   }

   public operator fun component6(): Int? {
      return this.embedIndex;
   }

   public operator fun component7(): String? {
      return this.componentId;
   }

   public operator fun component8(): Int? {
      return this.componentMediaIndex;
   }

   public fun copy(
      id: String = var0.id,
      index: Int = var0.index,
      type: String = var0.type,
      layout: com.discord.chat.reactevents.TapImageData.Layout = var0.layout,
      portal: Double? = var0.portal,
      embedIndex: Int? = var0.embedIndex,
      componentId: String? = var0.componentId,
      componentMediaIndex: Int? = var0.componentMediaIndex
   ): TapImageData {
      q.h(var1, "id");
      q.h(var3, "type");
      q.h(var4, "layout");
      return new TapImageData(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapImageData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.type, var1.type)) {
            return false;
         } else if (!q.c(this.layout, var1.layout)) {
            return false;
         } else if (!q.c(this.portal, var1.portal)) {
            return false;
         } else if (!q.c(this.embedIndex, var1.embedIndex)) {
            return false;
         } else if (!q.c(this.componentId, var1.componentId)) {
            return false;
         } else {
            return q.c(this.componentMediaIndex, var1.componentMediaIndex);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = this.id.hashCode();
      val var7: Int = Integer.hashCode(this.index);
      val var8: Int = this.type.hashCode();
      val var6: Int = this.layout.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.portal == null) {
         var1 = 0;
      } else {
         var1 = this.portal.hashCode();
      }

      val var2: Int;
      if (this.embedIndex == null) {
         var2 = 0;
      } else {
         var2 = this.embedIndex.hashCode();
      }

      val var3: Int;
      if (this.componentId == null) {
         var3 = 0;
      } else {
         var3 = this.componentId.hashCode();
      }

      if (this.componentMediaIndex != null) {
         var4 = this.componentMediaIndex.hashCode();
      }

      return ((((((var5 * 31 + var7) * 31 + var8) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("id", this.id),
         w.a("index", this.index),
         w.a("type", this.type),
         w.a("layout", this.layout.serialize()),
         w.a("portal", this.portal),
         w.a("embedIndex", this.embedIndex),
         w.a("componentId", this.componentId),
         w.a("componentMediaIndex", this.componentMediaIndex)
      );
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.id;
      val var1: Int = this.index;
      val var7: java.lang.String = this.type;
      val var6: TapImageData.Layout = this.layout;
      val var3: java.lang.Double = this.portal;
      val var9: Int = this.embedIndex;
      val var4: java.lang.String = this.componentId;
      val var8: Int = this.componentMediaIndex;
      val var5: StringBuilder = new StringBuilder();
      var5.append("TapImageData(id=");
      var5.append(var2);
      var5.append(", index=");
      var5.append(var1);
      var5.append(", type=");
      var5.append(var7);
      var5.append(", layout=");
      var5.append(var6);
      var5.append(", portal=");
      var5.append(var3);
      var5.append(", embedIndex=");
      var5.append(var9);
      var5.append(", componentId=");
      var5.append(var4);
      var5.append(", componentMediaIndex=");
      var5.append(var8);
      var5.append(")");
      return var5.toString();
   }

   public data class Layout(width: Int, height: Int, x: Int, y: Int, resizeMode: ViewResizeMode) {
      public final val height: Int
      public final val resizeMode: ViewResizeMode
      public final val width: Int
      public final val x: Int
      public final val y: Int

      init {
         q.h(var5, "resizeMode");
         super();
         this.width = var1;
         this.height = var2;
         this.x = var3;
         this.y = var4;
         this.resizeMode = var5;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public operator fun component3(): Int {
         return this.x;
      }

      public operator fun component4(): Int {
         return this.y;
      }

      public operator fun component5(): ViewResizeMode {
         return this.resizeMode;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height, x: Int = var0.x, y: Int = var0.y, resizeMode: ViewResizeMode = var0.resizeMode): com.discord.chat.reactevents.TapImageData.Layout {
         q.h(var5, "resizeMode");
         return new TapImageData.Layout(var1, var2, var3, var4, var5);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is TapImageData.Layout) {
            return false;
         } else {
            var1 = var1;
            if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else if (this.x != var1.x) {
               return false;
            } else if (this.y != var1.y) {
               return false;
            } else {
               return this.resizeMode === var1.resizeMode;
            }
         }
      }

      public override fun hashCode(): Int {
         return (((Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.x)) * 31 + Integer.hashCode(this.y)) * 31
            + this.resizeMode.hashCode();
      }

      public fun serialize(): WritableMap {
         return NativeMapExtensionsKt.nativeMapOf(
            w.a("width", this.width), w.a("height", this.height), w.a("x", this.x), w.a("y", this.y), w.a("resizeMode", this.resizeMode.getValue())
         );
      }

      public override fun toString(): String {
         val var2: Int = this.width;
         val var4: Int = this.height;
         val var3: Int = this.x;
         val var1: Int = this.y;
         val var5: ViewResizeMode = this.resizeMode;
         val var6: StringBuilder = new StringBuilder();
         var6.append("Layout(width=");
         var6.append(var2);
         var6.append(", height=");
         var6.append(var4);
         var6.append(", x=");
         var6.append(var3);
         var6.append(", y=");
         var6.append(var1);
         var6.append(", resizeMode=");
         var6.append(var5);
         var6.append(")");
         return var6.toString();
      }
   }
}
