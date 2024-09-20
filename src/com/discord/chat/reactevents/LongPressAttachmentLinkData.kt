package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nh.w

@f
internal data class LongPressAttachmentLinkData(attachmentUrl: String? = null, attachmentName: String? = null) : ReactEvent {
   public final val attachmentName: String?
   public final val attachmentUrl: String?

   fun LongPressAttachmentLinkData() {
      this(null, null, 3, null);
   }

   init {
      this.attachmentUrl = var1;
      this.attachmentName = var2;
   }

   public operator fun component1(): String? {
      return this.attachmentUrl;
   }

   public operator fun component2(): String? {
      return this.attachmentName;
   }

   public fun copy(attachmentUrl: String? = var0.attachmentUrl, attachmentName: String? = var0.attachmentName): LongPressAttachmentLinkData {
      return new LongPressAttachmentLinkData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressAttachmentLinkData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.attachmentUrl, var1.attachmentUrl)) {
            return false;
         } else {
            return q.c(this.attachmentName, var1.attachmentName);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.attachmentUrl == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentUrl.hashCode();
      }

      if (this.attachmentName != null) {
         var2 = this.attachmentName.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("data", NativeMapExtensionsKt.nativeMapOf(w.a("attachmentUrl", this.attachmentUrl), w.a("attachmentName", this.attachmentName)))
      );
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.attachmentUrl;
      val var1: java.lang.String = this.attachmentName;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LongPressAttachmentLinkData(attachmentUrl=");
      var3.append(var2);
      var3.append(", attachmentName=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LongPressAttachmentLinkData.$serializer = new LongPressAttachmentLinkData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressAttachmentLinkData", var0, 2);
         var1.l("attachmentUrl", true);
         var1.l("attachmentName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): LongPressAttachmentLinkData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var9: java.lang.String;
         if (var7.y()) {
            val var8: b2 = b2.a;
            var5 = var7.v(var6, 0, b2.a, null) as java.lang.String;
            var9 = var7.v(var6, 1, var8, null) as java.lang.String;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var7.v(var6, 1, b2.a, var9) as java.lang.String;
                     var2 |= 2;
                  } else {
                     var5 = var7.v(var6, 0, b2.a, var5) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new LongPressAttachmentLinkData(var2, var5, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressAttachmentLinkData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LongPressAttachmentLinkData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressAttachmentLinkData> {
         return LongPressAttachmentLinkData.$serializer.INSTANCE;
      }
   }
}
