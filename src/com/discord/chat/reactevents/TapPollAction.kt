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
public data class TapPollAction(channelId: String, messageId: String, type: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val type: String

   init {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "type");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.type = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TapPollAction, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.channelId);
      var1.z(var2, 1, var0.messageId);
      var1.z(var2, 2, var0.type);
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.type;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, type: String = var0.type): TapPollAction {
      r.h(var1, "channelId");
      r.h(var2, "messageId");
      r.h(var3, "type");
      return new TapPollAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAction) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.type.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.channelId;
      val var4: java.lang.String = this.messageId;
      val var3: java.lang.String = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapPollAction(channelId=");
      var2.append(var1);
      var2.append(", messageId=");
      var2.append(var4);
      var2.append(", type=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapPollAction> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapPollAction.$serializer = new TapPollAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapPollAction", var0, 3);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TapPollAction {
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

            var10 = var12;
            var12 = var11;
         }

         var9.c(var8);
         return new TapPollAction(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapPollAction) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapPollAction.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAction> {
         return TapPollAction.$serializer.INSTANCE;
      }
   }
}
