package com.discord.chat.bridge.row

import cl.f
import cl.n
import com.discord.chat.bridge.ChangeType
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
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
      val var9: Int = Integer.hashCode(this.index);
      val var6: Int = this.changeType.hashCode();
      val var7: Int = Integer.hashCode(this.color);
      val var2: Int = Integer.hashCode(this.borderColor);
      val var4: Int = Integer.hashCode(this.backgroundColor);
      val var3: Int = this.text.hashCode();
      val var8: Int = java.lang.Boolean.hashCode(this.revealed);
      val var5: Int = this.button.hashCode();
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      return (((((((var9 * 31 + var6) * 31 + var7) * 31 + var2) * 31 + var4) * 31 + var3) * 31 + var8) * 31 + var5) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var6: ChangeType = this.changeType;
      val var4: Int = this.color;
      val var2: Int = this.borderColor;
      val var3: Int = this.backgroundColor;
      val var10: java.lang.String = this.text;
      val var5: Boolean = this.revealed;
      val var8: BlockedGroupButton = this.button;
      val var9: java.util.List = this.content;
      val var7: StringBuilder = new StringBuilder();
      var7.append("BlockedGroupRow(index=");
      var7.append(var1);
      var7.append(", changeType=");
      var7.append(var6);
      var7.append(", color=");
      var7.append(var4);
      var7.append(", borderColor=");
      var7.append(var2);
      var7.append(", backgroundColor=");
      var7.append(var3);
      var7.append(", text=");
      var7.append(var10);
      var7.append(", revealed=");
      var7.append(var5);
      var7.append(", button=");
      var7.append(var8);
      var7.append(", content=");
      var7.append(var9);
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
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.c(var15);
         val var14: Array<KSerializer> = BlockedGroupRow.access$get$childSerializers$cp();
         val var10: Boolean = var16.y();
         var var2: Int = 0;
         var var5: Int;
         var var6: Int;
         val var8: Int;
         var var9: Int;
         var var11: Any;
         var var12: Any;
         val var13: BlockedGroupButton;
         val var18: java.util.List;
         var var21: Int;
         var var23: Int;
         if (var10) {
            var21 = var16.k(var15, 0);
            var12 = var16.m(var15, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var8 = var16.k(var15, 2);
            var23 = var16.k(var15, 3);
            val var7: Int = var16.k(var15, 4);
            var11 = var16.t(var15, 5);
            val var20: Byte = var16.s(var15, 6);
            val var17: BlockedGroupButton = var16.m(var15, 7, BlockedGroupButton.$serializer.INSTANCE, null) as BlockedGroupButton;
            val var30: java.util.List = var16.v(var15, 8, var14[8], null) as java.util.List;
            var6 = 511;
            var9 = var21;
            var5 = var23;
            var23 = var7;
            var21 = var20;
            var13 = var17;
            var18 = var30;
         } else {
            var var26: Boolean = true;
            var var25: Int = 0;
            var5 = 0;
            var23 = 0;
            var21 = 0;
            var var29: java.util.List = null;
            var11 = null;
            var12 = null;
            var var19: Any = null;
            var6 = 0;

            while (var26) {
               var9 = var16.x(var15);
               switch (var9) {
                  case -1:
                     var26 = false;
                     break;
                  case 0:
                     var25 = var16.k(var15, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var12 = var16.m(var15, 1, ChangeType.Serializer.INSTANCE, var12) as ChangeType;
                     var2 |= 2;
                     break;
                  case 2:
                     var21 = var16.k(var15, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var5 = var16.k(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var23 = var16.k(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var19 = var16.t(var15, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var6 = var16.s(var15, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var11 = var16.m(var15, 7, BlockedGroupButton.$serializer.INSTANCE, var11) as BlockedGroupButton;
                     var2 |= 128;
                     break;
                  case 8:
                     var29 = var16.v(var15, 8, var14[8], var29) as java.util.List;
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var13 = (BlockedGroupButton)var11;
            var8 = var21;
            var11 = var19;
            var18 = var29;
            var21 = var6;
            var9 = var25;
            var6 = var2;
         }

         var16.b(var15);
         return new BlockedGroupRow(var6, var9, (ChangeType)var12, var8, var5, var23, (java.lang.String)var11, (boolean)var21, var13, var18, null);
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
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupRow> {
         return BlockedGroupRow.$serializer.INSTANCE;
      }
   }
}
