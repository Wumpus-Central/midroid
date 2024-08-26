package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
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

@f
internal data class TapAttachmentLinkData(attachmentUrl: String? = null) : ReactEvent {
   public final val attachmentUrl: String?

   fun TapAttachmentLinkData() {
      this(null, 1, null);
   }

   init {
      super();
      this.attachmentUrl = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: TapAttachmentLinkData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var4: Boolean = var1.A(var2, 0);
      var var3: Boolean = true;
      if (!var4 && var0.attachmentUrl == null) {
         var3 = false;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.attachmentUrl);
      }
   }

   public operator fun component1(): String? {
      return this.attachmentUrl;
   }

   public fun copy(attachmentUrl: String? = var0.attachmentUrl): TapAttachmentLinkData {
      return new TapAttachmentLinkData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAttachmentLinkData) {
         return false;
      } else {
         return r.c(this.attachmentUrl, (var1 as TapAttachmentLinkData).attachmentUrl);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.attachmentUrl == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentUrl.hashCode();
      }

      return var1;
   }

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("data", NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("attachmentUrl", this.attachmentUrl)}))});
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.attachmentUrl;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapAttachmentLinkData(attachmentUrl=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapAttachmentLinkData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapAttachmentLinkData.$serializer = new TapAttachmentLinkData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapAttachmentLinkData", var0, 1);
         var1.l("attachmentUrl", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): TapAttachmentLinkData {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.n(var6, 0, a2.a, null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.n(var6, 0, a2.a, var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapAttachmentLinkData(var2, var8 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: TapAttachmentLinkData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapAttachmentLinkData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapAttachmentLinkData> {
         return TapAttachmentLinkData.$serializer.INSTANCE;
      }
   }
}
