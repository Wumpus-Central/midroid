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
import uk.f
import uk.n
import xk.b2
import xk.g0
import xk.g0.a

@f
public data class TapClanTagChipletData(guildId: String) : ReactEvent {
   public final val guildId: String

   init {
      q.h(var1, "guildId");
      super();
      this.guildId = var1;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public fun copy(guildId: String = var0.guildId): TapClanTagChipletData {
      q.h(var1, "guildId");
      return new TapClanTagChipletData(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapClanTagChipletData) {
         return false;
      } else {
         return q.c(this.guildId, (var1 as TapClanTagChipletData).guildId);
      }
   }

   public override fun hashCode(): Int {
      return this.guildId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.guildId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapClanTagChipletData(guildId=");
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
         val var0: TapClanTagChipletData.$serializer = new TapClanTagChipletData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapClanTagChipletData", var0, 1);
         var1.l("guildId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapClanTagChipletData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.t(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.t(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapClanTagChipletData(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: TapClanTagChipletData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapClanTagChipletData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapClanTagChipletData> {
         return TapClanTagChipletData.$serializer.INSTANCE;
      }
   }
}
