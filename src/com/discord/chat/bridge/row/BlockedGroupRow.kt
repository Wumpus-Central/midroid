package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.h
import il.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class BlockedGroupRow(index: Int,
      changeType: ChangeType,
      color: Int,
      borderColor: Int,
      backgroundColor: Int,
      text: String,
      revealed: Boolean,
      button: BlockedGroupButton,
      content: List<BlockedGroupContent>? = null
   )
   : Row {
   public final val backgroundColor: Int
   public final val borderColor: Int
   public final val button: BlockedGroupButton
   public open val changeType: ChangeType
   public final val color: Int
   public final val content: List<BlockedGroupContent>?
   public open val index: Int
   public final val revealed: Boolean
   public final val text: String

   init {
      q.h(var2, "changeType");
      q.h(var6, "text");
      q.h(var8, "button");
      super(null);
      this.index = var1;
      this.changeType = var2;
      this.color = var3;
      this.borderColor = var4;
      this.backgroundColor = var5;
      this.text = var6;
      this.revealed = var7;
      this.button = var8;
      this.content = var9;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): Int {
      return this.color;
   }

   public operator fun component4(): Int {
      return this.borderColor;
   }

   public operator fun component5(): Int {
      return this.backgroundColor;
   }

   public operator fun component6(): String {
      return this.text;
   }

   public operator fun component7(): Boolean {
      return this.revealed;
   }

   public operator fun component8(): BlockedGroupButton {
      return this.button;
   }

   public operator fun component9(): List<BlockedGroupContent>? {
      return this.content;
   }

   public fun copy(
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
      color: Int = var0.color,
      borderColor: Int = var0.borderColor,
      backgroundColor: Int = var0.backgroundColor,
      text: String = var0.text,
      revealed: Boolean = var0.revealed,
      button: BlockedGroupButton = var0.button,
      content: List<BlockedGroupContent>? = var0.content
   ): BlockedGroupRow {
      q.h(var2, "changeType");
      q.h(var6, "text");
      q.h(var8, "button");
      return new BlockedGroupRow(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else if (this.revealed != var1.revealed) {
            return false;
         } else if (!q.c(this.button, var1.button)) {
            return false;
         } else {
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = Integer.hashCode(this.index);
      val var5: Int = this.changeType.hashCode();
      val var2: Int = Integer.hashCode(this.color);
      val var4: Int = Integer.hashCode(this.borderColor);
      val var9: Int = Integer.hashCode(this.backgroundColor);
      val var8: Int = this.text.hashCode();
      val var3: Int = java.lang.Boolean.hashCode(this.revealed);
      val var7: Int = this.button.hashCode();
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      return (((((((var6 * 31 + var5) * 31 + var2) * 31 + var4) * 31 + var9) * 31 + var8) * 31 + var3) * 31 + var7) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: Int = this.index;
      val var8: ChangeType = this.changeType;
      val var4: Int = this.color;
      val var2: Int = this.borderColor;
      val var1: Int = this.backgroundColor;
      val var9: java.lang.String = this.text;
      val var5: Boolean = this.revealed;
      val var6: BlockedGroupButton = this.button;
      val var10: java.util.List = this.content;
      val var7: StringBuilder = new StringBuilder();
      var7.append("BlockedGroupRow(index=");
      var7.append(var3);
      var7.append(", changeType=");
      var7.append(var8);
      var7.append(", color=");
      var7.append(var4);
      var7.append(", borderColor=");
      var7.append(var2);
      var7.append(", backgroundColor=");
      var7.append(var1);
      var7.append(", text=");
      var7.append(var9);
      var7.append(", revealed=");
      var7.append(var5);
      var7.append(", button=");
      var7.append(var6);
      var7.append(", content=");
      var7.append(var10);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: BlockedGroupRow.$serializer = new BlockedGroupRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("2", var0, 9);
         var1.l("index", false);
         var1.l("changeType", false);
         var1.l("color", false);
         var1.l("borderColor", false);
         var1.l("backgroundColor", false);
         var1.l("text", false);
         var1.l("revealed", false);
         var1.l("button", false);
         var1.l("content", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            n0.a,
            ChangeType.Serializer.INSTANCE,
            n0.a,
            n0.a,
            n0.a,
            b2.a,
            h.a,
            BlockedGroupButton.$serializer.INSTANCE,
            a.u(BlockedGroupRow.access$get$childSerializers$cp()[8])
         };
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupRow {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.c(var16);
         val var14: Array<KSerializer> = BlockedGroupRow.access$get$childSerializers$cp();
         val var10: Boolean = var17.y();
         var var2: Int = 0;
         var var3: Int;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         val var8: Int;
         val var11: java.util.List;
         var var12: Any;
         var var13: Any;
         val var18: BlockedGroupButton;
         if (var10) {
            var7 = var17.k(var16, 0);
            var12 = var17.m(var16, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var4 = var17.k(var16, 2);
            var5 = var17.k(var16, 3);
            var3 = var17.k(var16, 4);
            var13 = var17.t(var16, 5);
            val var20: Byte = var17.s(var16, 6);
            var18 = var17.m(var16, 7, BlockedGroupButton.$serializer.INSTANCE, null) as BlockedGroupButton;
            var11 = var17.v(var16, 8, var14[8], null) as java.util.List;
            var8 = 511;
            var6 = var20;
         } else {
            var var23: Boolean = true;
            var7 = 0;
            var5 = 0;
            var4 = 0;
            var3 = 0;
            var13 = null;
            var var25: BlockedGroupButton = null;
            var12 = null;
            var var19: Any = null;
            var6 = 0;

            while (var23) {
               val var9: Int = var17.x(var16);
               switch (var9) {
                  case -1:
                     var23 = false;
                     break;
                  case 0:
                     var7 = var17.k(var16, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var12 = var17.m(var16, 1, ChangeType.Serializer.INSTANCE, var12) as ChangeType;
                     var2 |= 2;
                     break;
                  case 2:
                     var3 = var17.k(var16, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var5 = var17.k(var16, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var4 = var17.k(var16, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var19 = var17.t(var16, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var6 = var17.s(var16, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var25 = var17.m(var16, 7, BlockedGroupButton.$serializer.INSTANCE, var25) as BlockedGroupButton;
                     var2 |= 128;
                     break;
                  case 8:
                     var13 = var17.v(var16, 8, var14[8], var13) as java.util.List;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var4 = var3;
            var11 = (java.util.List)var13;
            var18 = var25;
            var13 = var19;
            var3 = var4;
            var8 = var2;
         }

         var17.b(var16);
         return new BlockedGroupRow(var8, var7, (ChangeType)var12, var4, var5, var3, (java.lang.String)var13, (boolean)var6, var18, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         BlockedGroupRow.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupRow> {
         return BlockedGroupRow.$serializer.INSTANCE;
      }
   }
}
