package com.discord.chat.input.bridge

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
public data class TapAction(action: String, channelId: String, optionName: String) {
   public final val action: String
   public final val channelId: String
   public final val optionName: String

   init {
      r.h(var1, "action");
      r.h(var2, "channelId");
      r.h(var3, "optionName");
      super();
      this.action = var1;
      this.channelId = var2;
      this.optionName = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TapAction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.z(var2, 1, var0.channelId);
      var1.z(var2, 2, var0.optionName);
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
      r.h(var1, "action");
      r.h(var2, "channelId");
      r.h(var3, "optionName");
      return new TapAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            return r.c(this.optionName, var1.optionName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.channelId.hashCode()) * 31 + this.optionName.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.action;
      val var2: java.lang.String = this.channelId;
      val var1: java.lang.String = this.optionName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapAction(action=");
      var4.append(var3);
      var4.append(", channelId=");
      var4.append(var2);
      var4.append(", optionName=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<TapAction> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapAction {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         var var12: java.lang.String;
         if (var9.p()) {
            var12 = var9.m(var8, 0);
            val var7: java.lang.String = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
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
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var12 = var11;
            var10 = var12;
         }

         var9.c(var8);
         return new TapAction(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapAction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapAction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapAction> {
         return TapAction.$serializer.INSTANCE;
      }
   }
}
