package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import com.discord.chat.bridge.summaries.Summary
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
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
      r.h(var1, "changeType");
      r.h(var3, "text");
      r.h(var4, "id");
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

   @JvmStatic
   public fun `write$Self`(self: SeparatorRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      var1.w(var2, 1, var0.getIndex());
      var1.z(var2, 2, var0.text);
      var1.z(var2, 3, var0.id);
      var1.w(var2, 4, var0.color);
      var var3: Boolean;
      if (!var1.A(var2, 5) && var0.scrollTo == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 5, h.a, var0.scrollTo);
      }

      if (!var1.A(var2, 6) && var0.isBeforeContent == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 6, h.a, var0.isBeforeContent);
      }

      label32: {
         if (!var1.A(var2, 7)) {
            var3 = false;
            if (var0.summary == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 7, Summary.$serializer.INSTANCE, var0.summary);
      }
   }

   public operator fun component1(): ChangeType {
      return this.getChangeType();
   }

   public operator fun component2(): Int {
      return this.getIndex();
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
      changeType: ChangeType = var0.getChangeType(),
      index: Int = var0.getIndex(),
      text: String = var0.text,
      id: String = var0.id,
      color: Int = var0.color,
      scrollTo: Boolean? = var0.scrollTo,
      isBeforeContent: Boolean? = var0.isBeforeContent,
      summary: Summary? = var0.summary
   ): SeparatorRow {
      r.h(var1, "changeType");
      r.h(var3, "text");
      r.h(var4, "id");
      return new SeparatorRow(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SeparatorRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getChangeType() != var1.getChangeType()) {
            return false;
         } else if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!r.c(this.scrollTo, var1.scrollTo)) {
            return false;
         } else if (!r.c(this.isBeforeContent, var1.isBeforeContent)) {
            return false;
         } else {
            return r.c(this.summary, var1.summary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.getChangeType().hashCode();
      val var8: Int = Integer.hashCode(this.getIndex());
      val var7: Int = this.text.hashCode();
      val var4: Int = this.id.hashCode();
      val var5: Int = Integer.hashCode(this.color);
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

      return ((((((var6 * 31 + var8) * 31 + var7) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: ChangeType = this.getChangeType();
      val var2: Int = this.getIndex();
      val var3: java.lang.String = this.text;
      val var6: java.lang.String = this.id;
      val var1: Int = this.color;
      val var5: java.lang.Boolean = this.scrollTo;
      val var9: java.lang.Boolean = this.isBeforeContent;
      val var7: Summary = this.summary;
      val var8: StringBuilder = new StringBuilder();
      var8.append("SeparatorRow(changeType=");
      var8.append(var4);
      var8.append(", index=");
      var8.append(var2);
      var8.append(", text=");
      var8.append(var3);
      var8.append(", id=");
      var8.append(var6);
      var8.append(", color=");
      var8.append(var1);
      var8.append(", scrollTo=");
      var8.append(var5);
      var8.append(", isBeforeContent=");
      var8.append(var9);
      var8.append(", summary=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<SeparatorRow> {
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
         val var3: h = h.a;
         return new KSerializer[]{ChangeType.Serializer.INSTANCE, m0.a, a2.a, a2.a, m0.a, a.u(h.a), a.u(var3), a.u(Summary.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): SeparatorRow {
         r.h(var1, "decoder");
         val var15: SerialDescriptor = this.getDescriptor();
         val var16: c = var1.b(var15);
         val var8: Boolean = var16.p();
         var var6: Byte = 7;
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var9: Any;
         var var10: Any;
         var var11: Any;
         var var13: Any;
         var var17: Any;
         var var20: Any;
         if (var8) {
            var9 = var16.y(var15, 0, ChangeType.Serializer.INSTANCE, null);
            var3 = var16.i(var15, 1);
            var11 = var16.m(var15, 2);
            var17 = var16.m(var15, 3);
            var4 = var16.i(var15, 4);
            var20 = h.a;
            var10 = var16.n(var15, 5, h.a, null);
            var20 = var16.n(var15, 6, (DeserializationStrategy)var20, null);
            var13 = var16.n(var15, 7, Summary.$serializer.INSTANCE, null);
            var2 = 255;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var13 = null;
            var20 = null;
            var9 = null;
            var10 = null;
            var17 = null;
            var11 = null;
            var3 = 0;

            while (var5) {
               val var7: Int = var16.o(var15);
               switch (var7) {
                  case -1:
                     var5 = false;
                     break;
                  case 0:
                     var9 = var16.y(var15, 0, ChangeType.Serializer.INSTANCE, var9);
                     var2 |= 1;
                     var6 = 7;
                     break;
                  case 1:
                     var3 = var16.i(var15, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var10 = var16.m(var15, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var17 = var16.m(var15, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var4 = var16.i(var15, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var16.n(var15, 5, h.a, var11);
                     var2 |= 32;
                     break;
                  case 6:
                     var20 = var16.n(var15, 6, h.a, var20);
                     var2 |= 64;
                     break;
                  case 7:
                     var13 = var16.n(var15, var6, Summary.$serializer.INSTANCE, var13);
                     var2 |= 128;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var11 = var10;
            var10 = var11;
         }

         var16.c(var15);
         return new SeparatorRow(
            var2,
            var9 as ChangeType,
            var3,
            (java.lang.String)var11,
            (java.lang.String)var17,
            var4,
            var10 as java.lang.Boolean,
            var20 as java.lang.Boolean,
            var13 as Summary,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: SeparatorRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         SeparatorRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorRow> {
         return SeparatorRow.$serializer.INSTANCE;
      }
   }
}
