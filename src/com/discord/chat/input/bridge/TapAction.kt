package com.discord.chat.input.bridge

import bl.b2
import bl.g0
import bl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
public data class TapAction(action: String, channelId: String, optionName: String) {
   public final val action: String
   public final val channelId: String
   public final val optionName: String

   init {
      q.h(var1, "action");
      q.h(var2, "channelId");
      q.h(var3, "optionName");
      super();
      this.action = var1;
      this.channelId = var2;
      this.optionName = var3;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.optionName;
   }

   public fun copy(action: String = var0.action, channelId: String = var0.channelId, optionName: String = var0.optionName): TapAction {
      q.h(var1, "action");
      q.h(var2, "channelId");
      q.h(var3, "optionName");
      return new TapAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.optionName, var1.optionName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.optionName.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.action;
      val var1: java.lang.String = this.channelId;
      val var4: java.lang.String = this.optionName;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapAction(action=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var1);
      var2.append(", optionName=");
      var2.append(var4);
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
         val var0: TapAction.$serializer = new TapAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.bridge.TapAction", var0, 3);
         var1.l("action", false);
         var1.l("channelId", false);
         var1.l("optionName", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapAction {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         var var12: java.lang.String;
         if (var9.y()) {
            var12 = var9.t(var8, 0);
            val var7: java.lang.String = var9.t(var8, 1);
            var10 = var9.t(var8, 2);
            var2 = 7;
            var6 = var12;
            var12 = var7;
         } else {
            var6 = null;
            var12 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var9.t(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.t(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var12 = var11;
            var10 = var12;
         }

         var9.b(var8);
         return new TapAction(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapAction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapAction.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapAction> {
         return TapAction.$serializer.INSTANCE;
      }
   }
}
