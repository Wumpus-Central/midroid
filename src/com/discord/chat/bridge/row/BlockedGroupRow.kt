package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h
import xk.m0

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
      r.h(var2, "changeType");
      r.h(var6, "text");
      r.h(var8, "button");
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

   @JvmStatic
   public fun `write$Self`(self: BlockedGroupRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Int = var0.getIndex();
      var var3: Boolean = false;
      var1.w(var2, 0, var4);
      var1.y(var2, 1, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      var1.w(var2, 2, var0.color);
      var1.w(var2, 3, var0.borderColor);
      var1.w(var2, 4, var0.backgroundColor);
      var1.z(var2, 5, var0.text);
      var1.x(var2, 6, var0.revealed);
      var1.y(var2, 7, BlockedGroupButton.$serializer.INSTANCE, var0.button);
      if (var1.A(var2, 8) || var0.content != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 8, new xk.f(BlockedGroupContent.$serializer.INSTANCE), var0.content);
      }
   }

   public operator fun component1(): Int {
      return this.getIndex();
   }

   public operator fun component2(): ChangeType {
      return this.getChangeType();
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
      index: Int = var0.getIndex(),
      changeType: ChangeType = var0.getChangeType(),
      color: Int = var0.color,
      borderColor: Int = var0.borderColor,
      backgroundColor: Int = var0.backgroundColor,
      text: String = var0.text,
      revealed: Boolean = var0.revealed,
      button: BlockedGroupButton = var0.button,
      content: List<BlockedGroupContent>? = var0.content
   ): BlockedGroupRow {
      r.h(var2, "changeType");
      r.h(var6, "text");
      r.h(var8, "button");
      return new BlockedGroupRow(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (this.getChangeType() != var1.getChangeType()) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!r.c(this.text, var1.text)) {
            return false;
         } else if (this.revealed != var1.revealed) {
            return false;
         } else if (!r.c(this.button, var1.button)) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = Integer.hashCode(this.getIndex());
      val var5: Int = this.getChangeType().hashCode();
      val var6: Int = Integer.hashCode(this.color);
      val var7: Int = Integer.hashCode(this.borderColor);
      val var3: Int = Integer.hashCode(this.backgroundColor);
      val var8: Int = this.text.hashCode();
      var var1: Byte = this.revealed;
      if (this.revealed != 0) {
         var1 = 1;
      }

      val var9: Int = this.button.hashCode();
      val var11: Int;
      if (this.content == null) {
         var11 = 0;
      } else {
         var11 = this.content.hashCode();
      }

      return (((((((var4 * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var3) * 31 + var8) * 31 + var1) * 31 + var9) * 31 + var11;
   }

   public override fun toString(): String {
      val var1: Int = this.getIndex();
      val var7: ChangeType = this.getChangeType();
      val var4: Int = this.color;
      val var2: Int = this.borderColor;
      val var3: Int = this.backgroundColor;
      val var8: java.lang.String = this.text;
      val var5: Boolean = this.revealed;
      val var10: BlockedGroupButton = this.button;
      val var6: java.util.List = this.content;
      val var9: StringBuilder = new StringBuilder();
      var9.append("BlockedGroupRow(index=");
      var9.append(var1);
      var9.append(", changeType=");
      var9.append(var7);
      var9.append(", color=");
      var9.append(var4);
      var9.append(", borderColor=");
      var9.append(var2);
      var9.append(", backgroundColor=");
      var9.append(var3);
      var9.append(", text=");
      var9.append(var8);
      var9.append(", revealed=");
      var9.append(var5);
      var9.append(", button=");
      var9.append(var10);
      var9.append(", content=");
      var9.append(var6);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : f0<BlockedGroupRow> {
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
            m0.a,
            ChangeType.Serializer.INSTANCE,
            m0.a,
            m0.a,
            m0.a,
            a2.a,
            h.a,
            BlockedGroupButton.$serializer.INSTANCE,
            a.u(new xk.f(BlockedGroupContent.$serializer.INSTANCE))
         };
      }

      public open fun deserialize(decoder: Decoder): BlockedGroupRow {
         r.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         val var10: Boolean = var16.p();
         var var2: Int = 0;
         var var4: Int;
         var var5: Int;
         var var6: Int;
         var var7: Int;
         val var8: Int;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var17: Any;
         var var20: Int;
         if (var10) {
            var7 = var16.i(var15, 0);
            var17 = var16.y(var15, 1, ChangeType.Serializer.INSTANCE, null);
            var5 = var16.i(var15, 2);
            var20 = var16.i(var15, 3);
            var4 = var16.i(var15, 4);
            var11 = var16.m(var15, 5);
            val var19: Byte = var16.C(var15, 6);
            var12 = var16.y(var15, 7, BlockedGroupButton.$serializer.INSTANCE, null);
            var13 = var16.n(var15, 8, new xk.f(BlockedGroupContent.$serializer.INSTANCE), null);
            var8 = 511;
            var6 = var20;
            var20 = var19;
         } else {
            var var24: Boolean = true;
            var7 = 0;
            var4 = 0;
            var20 = 0;
            var5 = 0;
            var13 = null;
            var12 = null;
            var11 = null;
            var17 = null;
            var6 = 0;

            while (var24) {
               val var9: Int = var16.o(var15);
               switch (var9) {
                  case -1:
                     var24 = false;
                     break;
                  case 0:
                     var7 = var16.i(var15, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var11 = var16.y(var15, 1, ChangeType.Serializer.INSTANCE, var11);
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var16.i(var15, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var4 = var16.i(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var20 = var16.i(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var17 = var16.m(var15, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var6 = var16.C(var15, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var12 = var16.y(var15, 7, BlockedGroupButton.$serializer.INSTANCE, var12);
                     var2 |= 128;
                     break;
                  case 8:
                     var13 = var16.n(var15, 8, new xk.f(BlockedGroupContent.$serializer.INSTANCE), var13);
                     var2 |= 256;
                     break;
                  default:
                     throw new n(var9);
               }
            }

            var6 = var4;
            var4 = var20;
            var20 = var6;
            var11 = var17;
            var17 = var11;
            var8 = var2;
         }

         var16.c(var15);
         return new BlockedGroupRow(
            var8,
            var7,
            var17 as ChangeType,
            var5,
            var6,
            var4,
            (java.lang.String)var11,
            (boolean)var20,
            var12 as BlockedGroupButton,
            var13 as java.util.List,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: BlockedGroupRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         BlockedGroupRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupRow> {
         return BlockedGroupRow.$serializer.INSTANCE;
      }
   }
}
