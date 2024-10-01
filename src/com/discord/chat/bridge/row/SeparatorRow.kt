package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.summaries.Summary
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
public data class SeparatorRow(changeType: ChangeType,
      index: Int,
      text: String,
      id: String,
      color: Int,
      scrollTo: Boolean? = null,
      isBeforeContent: Boolean? = null,
      summary: Summary? = null
   )
   : Row {
   public open val changeType: ChangeType
   public final val color: Int
   public final val id: String
   public open val index: Int
   public final val isBeforeContent: Boolean?
   public final val scrollTo: Boolean?
   public final val summary: Summary?
   public final val text: String

   init {
      q.h(var1, "changeType");
      q.h(var3, "text");
      q.h(var4, "id");
      super(null);
      this.changeType = var1;
      this.index = var2;
      this.text = var3;
      this.id = var4;
      this.color = var5;
      this.scrollTo = var6;
      this.isBeforeContent = var7;
      this.summary = var8;
   }

   public operator fun component1(): ChangeType {
      return this.changeType;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): String {
      return this.text;
   }

   public operator fun component4(): String {
      return this.id;
   }

   public operator fun component5(): Int {
      return this.color;
   }

   public operator fun component6(): Boolean? {
      return this.scrollTo;
   }

   public operator fun component7(): Boolean? {
      return this.isBeforeContent;
   }

   public operator fun component8(): Summary? {
      return this.summary;
   }

   public fun copy(
      changeType: ChangeType = var0.changeType,
      index: Int = var0.index,
      text: String = var0.text,
      id: String = var0.id,
      color: Int = var0.color,
      scrollTo: Boolean? = var0.scrollTo,
      isBeforeContent: Boolean? = var0.isBeforeContent,
      summary: Summary? = var0.summary
   ): SeparatorRow {
      q.h(var1, "changeType");
      q.h(var3, "text");
      q.h(var4, "id");
      return new SeparatorRow(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorRow) {
         return false;
      } else {
         var1 = var1;
         if (this.changeType != var1.changeType) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!q.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!q.c(this.isBeforeContent, var1.isBeforeContent)) {
            return false;
         } else {
            return q.c(this.summary, var1.summary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = this.changeType.hashCode();
      val var6: Int = Integer.hashCode(this.index);
      val var5: Int = this.text.hashCode();
      val var7: Int = this.id.hashCode();
      val var4: Int = Integer.hashCode(this.color);
      var var3: Int = 0;
      val var1: Int;
      if (this.scrollTo == null) {
         var1 = 0;
      } else {
         var1 = this.scrollTo.hashCode();
      }

      val var2: Int;
      if (this.isBeforeContent == null) {
         var2 = 0;
      } else {
         var2 = this.isBeforeContent.hashCode();
      }

      if (this.summary != null) {
         var3 = this.summary.hashCode();
      }

      return ((((((var8 * 31 + var6) * 31 + var5) * 31 + var7) * 31 + var4) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var8: ChangeType = this.changeType;
      val var2: Int = this.index;
      val var7: java.lang.String = this.text;
      val var4: java.lang.String = this.id;
      val var1: Int = this.color;
      val var3: java.lang.Boolean = this.scrollTo;
      val var9: java.lang.Boolean = this.isBeforeContent;
      val var5: Summary = this.summary;
      val var6: StringBuilder = new StringBuilder();
      var6.append("SeparatorRow(changeType=");
      var6.append(var8);
      var6.append(", index=");
      var6.append(var2);
      var6.append(", text=");
      var6.append(var7);
      var6.append(", id=");
      var6.append(var4);
      var6.append(", color=");
      var6.append(var1);
      var6.append(", scrollTo=");
      var6.append(var3);
      var6.append(", isBeforeContent=");
      var6.append(var9);
      var6.append(", summary=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: SeparatorRow.$serializer = new SeparatorRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("0", var0, 8);
         var1.l("changeType", false);
         var1.l("index", false);
         var1.l("text", false);
         var1.l("id", false);
         var1.l("color", false);
         var1.l("scrollTo", true);
         var1.l("isBeforeContent", true);
         var1.l("summary", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: h = h.a;
         return new KSerializer[]{ChangeType.Serializer.INSTANCE, n0.a, b2.a, b2.a, n0.a, a.u(h.a), a.u(var1), a.u(Summary.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): SeparatorRow {
         q.h(var1, "decoder");
         val var16: SerialDescriptor = this.getDescriptor();
         val var17: c = var1.c(var16);
         val var8: Boolean = var17.y();
         var var6: Byte = 7;
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var10: Any;
         var var11: Any;
         var var13: Any;
         val var14: java.lang.Boolean;
         val var19: Summary;
         var var27: java.lang.Boolean;
         if (var8) {
            var10 = var17.m(var16, 0, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var5 = var17.k(var16, 1);
            var11 = var17.t(var16, 2);
            var13 = var17.t(var16, 3);
            val var2: Int = var17.k(var16, 4);
            val var18: h = h.a;
            var27 = var17.v(var16, 5, h.a, null) as java.lang.Boolean;
            val var9: java.lang.Boolean = var17.v(var16, 6, var18, null) as java.lang.Boolean;
            var19 = var17.v(var16, 7, Summary.$serializer.INSTANCE, null) as Summary;
            var4 = 255;
            var3 = var2;
            var14 = var27;
            var27 = var9;
         } else {
            var var24: Boolean = true;
            var4 = 0;
            var var21: Int = 0;
            var13 = null;
            var27 = null;
            var10 = null;
            var var25: Any = null;
            var var20: Any = null;
            var11 = null;
            var3 = 0;

            while (var24) {
               val var7: Int = var17.x(var16);
               switch (var7) {
                  case -1:
                     var24 = false;
                     break;
                  case 0:
                     var10 = var17.m(var16, 0, ChangeType.Serializer.INSTANCE, var10) as ChangeType;
                     var21 |= 1;
                     var6 = 7;
                     break;
                  case 1:
                     var3 = var17.k(var16, 1);
                     var21 |= 2;
                     break;
                  case 2:
                     var25 = var17.t(var16, 2);
                     var21 |= 4;
                     break;
                  case 3:
                     var20 = var17.t(var16, 3);
                     var21 |= 8;
                     break;
                  case 4:
                     var4 = var17.k(var16, 4);
                     var21 |= 16;
                     break;
                  case 5:
                     var11 = var17.v(var16, 5, h.a, var11) as java.lang.Boolean;
                     var21 |= 32;
                     break;
                  case 6:
                     var27 = var17.v(var16, 6, h.a, var27) as java.lang.Boolean;
                     var21 |= 64;
                     break;
                  case 7:
                     var13 = var17.v(var16, var6, Summary.$serializer.INSTANCE, var13) as Summary;
                     var21 |= 128;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var5 = var3;
            var19 = (Summary)var13;
            var14 = (java.lang.Boolean)var11;
            var3 = var4;
            var13 = var20;
            var11 = var25;
            var4 = var21;
         }

         var17.b(var16);
         return new SeparatorRow(var4, (ChangeType)var10, var5, (java.lang.String)var11, (java.lang.String)var13, var3, var14, var27, var19, null);
      }

      public open fun serialize(encoder: Encoder, value: SeparatorRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         SeparatorRow.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorRow> {
         return SeparatorRow.$serializer.INSTANCE;
      }
   }
}
