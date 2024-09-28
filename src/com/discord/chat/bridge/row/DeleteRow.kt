package com.discord.chat.bridge.row

import cl.f
import cl.n
import com.discord.chat.bridge.ChangeType
import fl.g0
import fl.n0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class DeleteRow(index: Int, changeType: ChangeType = ChangeType.DELETE) : Row {
   public open val changeType: ChangeType
   public open val index: Int

   init {
      q.h(var2, "changeType");
      super(null);
      this.index = var1;
      this.changeType = var2;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public fun copy(index: Int = var0.index, changeType: ChangeType = var0.changeType): DeleteRow {
      q.h(var2, "changeType");
      return new DeleteRow(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeleteRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else {
            return this.changeType === var1.changeType;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.index) * 31 + this.changeType.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var3: ChangeType = this.changeType;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DeleteRow(index=");
      var2.append(var1);
      var2.append(", changeType=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{n0.a, ChangeType.Serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): DeleteRow {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var3: Int;
         var var8: ChangeType;
         if (var7.y()) {
            var3 = var7.k(var6, 0);
            var8 = var7.m(var6, 1, ChangeType.Serializer.INSTANCE, null) as ChangeType;
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.x(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var8 = var7.m(var6, 1, ChangeType.Serializer.INSTANCE, var8) as ChangeType;
                     var2 |= 2;
                  } else {
                     var3 = var7.k(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.b(var6);
         return new DeleteRow(var2, var3, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: DeleteRow) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         DeleteRow.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<DeleteRow> {
         return DeleteRow.$serializer.INSTANCE;
      }
   }
}
