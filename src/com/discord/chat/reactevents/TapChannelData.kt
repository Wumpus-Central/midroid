package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
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

@f
internal data class TapChannelData(guildId: String? = null, channelId: String? = null, messageId: String? = null) : ReactEvent {
   public final val channelId: String?
   public final val guildId: String?
   public final val messageId: String?

   fun TapChannelData() {
      this(null, null, null, 7, null);
   }

   init {
      super();
      this.guildId = var1;
      this.channelId = var2;
      this.messageId = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TapChannelData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.guildId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 0, a2.a, var0.guildId);
      }

      if (!var1.A(var2, 1) && var0.channelId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, a2.a, var0.channelId);
      }

      label32: {
         if (!var1.A(var2, 2)) {
            var3 = false;
            if (var0.messageId == null) {
               break label32;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.messageId);
      }
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
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.messageId, var1.messageId);
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

   public open fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a(
               "data",
               NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("guildId", this.guildId), w.a("channelId", this.channelId), w.a("messageId", this.messageId)})
            )
         }
      );
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.guildId;
      val var3: java.lang.String = this.channelId;
      val var1: java.lang.String = this.messageId;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapChannelData(guildId=");
      var2.append(var4);
      var2.append(", channelId=");
      var2.append(var3);
      var2.append(", messageId=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapChannelData> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapChannelData {
         r.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: Any = null;
         var var2: Int;
         var var6: Any;
         var var11: Any;
         if (var5) {
            var7 = a2.a;
            var11 = var10.n(var9, 0, a2.a, null);
            var6 = var10.n(var9, 1, (DeserializationStrategy)var7, null);
            var7 = var10.n(var9, 2, (DeserializationStrategy)var7, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var10.n(var9, 2, a2.a, var11);
                        var2 |= 4;
                     } else {
                        var6 = var10.n(var9, 1, a2.a, var6);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.n(var9, 0, a2.a, var7);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var11 = var7;
            var7 = var11;
         }

         var10.c(var9);
         return new TapChannelData(var2, var11 as java.lang.String, var6 as java.lang.String, var7 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: TapChannelData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapChannelData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapChannelData> {
         return TapChannelData.$serializer.INSTANCE;
      }
   }
}
