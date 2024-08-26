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
import xk.f0
import xk.m0
import xk.f0.a

@f
public data class DeleteRow(index: Int, changeType: ChangeType = ChangeType.DELETE) : Row {
   public open val changeType: ChangeType
   public open val index: Int

   init {
      r.h(var2, "changeType");
      super(null);
      this.index = var1;
      this.changeType = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: DeleteRow, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Int = var0.getIndex();
      var var3: Boolean = false;
      var1.w(var2, 0, var4);
      if (var1.A(var2, 1) || var0.getChangeType() != ChangeType.DELETE) {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 1, ChangeType.Serializer.INSTANCE, var0.getChangeType());
      }
   }

   public operator fun component1(): Int {
      return this.getIndex();
   }

   public operator fun component2(): ChangeType {
      return this.getChangeType();
   }

   public fun copy(index: Int = var0.getIndex(), changeType: ChangeType = var0.getChangeType()): DeleteRow {
      r.h(var2, "changeType");
      return new DeleteRow(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeleteRow) {
         return false;
      } else {
         var1 = var1;
         if (this.getIndex() != var1.getIndex()) {
            return false;
         } else {
            return this.getChangeType() === var1.getChangeType();
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.getIndex()) * 31 + this.getChangeType().hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.getIndex();
      val var2: ChangeType = this.getChangeType();
      val var3: StringBuilder = new StringBuilder();
      var3.append("DeleteRow(index=");
      var3.append(var1);
      var3.append(", changeType=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<DeleteRow> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: DeleteRow.$serializer = new DeleteRow.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("null", var0, 2);
         var1.l("index", false);
         var1.l("changeType", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{m0.a, ChangeType.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): DeleteRow {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var3: Int;
         var var8: Any;
         if (var7.p()) {
            var3 = var7.i(var6, 0);
            var8 = var7.y(var6, 1, ChangeType.Serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.o(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var8 = var7.y(var6, 1, ChangeType.Serializer.INSTANCE, var8);
                     var2 |= 2;
                  } else {
                     var3 = var7.i(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.c(var6);
         return new DeleteRow(var2, var3, var8 as ChangeType, null);
      }

      public open fun serialize(encoder: Encoder, value: DeleteRow) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DeleteRow.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<DeleteRow> {
         return DeleteRow.$serializer.INSTANCE;
      }
   }
}
