package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
import xk.a2
import xk.f0
import xk.f0.a

@f
public data class TapCancelUploadItemData(uploaderId: String, itemId: String) : ReactEvent {
   public final val itemId: String
   public final val uploaderId: String

   init {
      r.h(var1, "uploaderId");
      r.h(var2, "itemId");
      super();
      this.uploaderId = var1;
      this.itemId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: TapCancelUploadItemData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.uploaderId);
      var1.z(var2, 1, var0.itemId);
   }

   public operator fun component1(): String {
      return this.uploaderId;
   }

   public operator fun component2(): String {
      return this.itemId;
   }

   public fun copy(uploaderId: String = var0.uploaderId, itemId: String = var0.itemId): TapCancelUploadItemData {
      r.h(var1, "uploaderId");
      r.h(var2, "itemId");
      return new TapCancelUploadItemData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCancelUploadItemData) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else {
            return r.c(this.itemId, var1.itemId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.uploaderId.hashCode() * 31 + this.itemId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.uploaderId;
      val var3: java.lang.String = this.itemId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCancelUploadItemData(uploaderId=");
      var2.append(var1);
      var2.append(", itemId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapCancelUploadItemData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapCancelUploadItemData.$serializer = new TapCancelUploadItemData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapCancelUploadItemData", var0, 2);
         var1.l("uploaderId", false);
         var1.l("itemId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapCancelUploadItemData {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.m(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.m(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapCancelUploadItemData(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapCancelUploadItemData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapCancelUploadItemData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapCancelUploadItemData> {
         return TapCancelUploadItemData.$serializer.INSTANCE;
      }
   }
}
