package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0

@f
public data class LongPressLinkData(url: String?) : ReactEvent {
   public final val url: String?

   init {
      super();
      this.url = var1;
   }

   public operator fun component1(): String? {
      return this.url;
   }

   public fun copy(url: String? = var0.url): LongPressLinkData {
      return new LongPressLinkData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LongPressLinkData) {
         return false;
      } else {
         return q.c(this.url, (var1 as LongPressLinkData).url);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.url == null) {
         var1 = 0;
      } else {
         var1 = this.url.hashCode();
      }

      return var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.url;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LongPressLinkData(url=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LongPressLinkData.$serializer = new LongPressLinkData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.LongPressLinkData", var0, 1);
         var1.l("url", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): LongPressLinkData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.v(var6, 0, b2.a, null) as java.lang.String;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.v(var6, 0, b2.a, var8) as java.lang.String;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new LongPressLinkData(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: LongPressLinkData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LongPressLinkData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LongPressLinkData> {
         return LongPressLinkData.$serializer.INSTANCE;
      }
   }
}
