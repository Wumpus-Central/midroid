package com.discord.chat.reactevents

import al.b2
import al.g0
import al.g0.a
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
import xk.f
import xk.n

@f
public data class TapGameIconData(gameApplicationId: String, timestamp: String) : ReactEvent {
   public final val gameApplicationId: String
   public final val timestamp: String

   init {
      q.h(var1, "gameApplicationId");
      q.h(var2, "timestamp");
      super();
      this.gameApplicationId = var1;
      this.timestamp = var2;
   }

   public operator fun component1(): String {
      return this.gameApplicationId;
   }

   public operator fun component2(): String {
      return this.timestamp;
   }

   public fun copy(gameApplicationId: String = var0.gameApplicationId, timestamp: String = var0.timestamp): TapGameIconData {
      q.h(var1, "gameApplicationId");
      q.h(var2, "timestamp");
      return new TapGameIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapGameIconData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.gameApplicationId, var1.gameApplicationId)) {
            return false;
         } else {
            return q.c(this.timestamp, var1.timestamp);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.gameApplicationId.hashCode() * 31 + this.timestamp.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.gameApplicationId;
      val var2: java.lang.String = this.timestamp;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapGameIconData(gameApplicationId=");
      var3.append(var1);
      var3.append(", timestamp=");
      var3.append(var2);
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
         val var0: TapGameIconData.$serializer = new TapGameIconData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapGameIconData", var0, 2);
         var1.l("gameApplicationId", false);
         var1.l("timestamp", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapGameIconData {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.t(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.t(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapGameIconData(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: TapGameIconData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapGameIconData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapGameIconData> {
         return TapGameIconData.$serializer.INSTANCE;
      }
   }
}
