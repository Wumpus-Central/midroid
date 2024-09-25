package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.g0
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class TapChannelData(guildId: String? = null, channelId: String? = null, messageId: String? = null) : ReactEvent {
   public final val channelId: String?
   public final val guildId: String?
   public final val messageId: String?

   fun TapChannelData() {
      this(null, null, null, 7, null);
   }

   init {
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
   }

   public operator fun component1(): String? {
      return this.guildId;
   }

   public operator fun component2(): String? {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.messageId;
   }

   public fun copy(guildId: String? = var0.guildId, channelId: String? = var0.channelId, messageId: String? = var0.messageId): TapChannelData {
      return new TapChannelData(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapChannelData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.messageId, var1.messageId);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      val var2: Int;
      if (this.channelId == null) {
         var2 = 0;
      } else {
         var2 = this.channelId.hashCode();
      }

      if (this.messageId != null) {
         var3 = this.messageId.hashCode();
      }

      return (var1 * 31 + var2) * 31 + var3;
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("data", NativeMapExtensionsKt.nativeMapOf(w.a("guildId", this.guildId), w.a("channelId", this.channelId), w.a("messageId", this.messageId)))
      );
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildId;
      val var1: java.lang.String = this.channelId;
      val var3: java.lang.String = this.messageId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapChannelData(guildId=");
      var4.append(var2);
      var4.append(", channelId=");
      var4.append(var1);
      var4.append(", messageId=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapChannelData.$serializer = new TapChannelData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapChannelData", var0, 3);
         var1.l("guildId", true);
         var1.l("channelId", true);
         var1.l("messageId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapChannelData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         val var5: Boolean = var9.y();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var11: java.lang.String;
         if (var5) {
            val var10: b2 = b2.a;
            var7 = var9.v(var8, 0, b2.a, null) as java.lang.String;
            var6 = var9.v(var8, 1, var10, null) as java.lang.String;
            var11 = var9.v(var8, 2, var10, null) as java.lang.String;
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var9.v(var8, 2, b2.a, var11) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var6 = var9.v(var8, 1, b2.a, var6) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.v(var8, 0, b2.a, var7) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.b(var8);
         return new TapChannelData(var2, var7, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapChannelData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapChannelData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelData> {
         return TapChannelData.$serializer.INSTANCE;
      }
   }
}
