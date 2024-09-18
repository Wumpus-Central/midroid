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
public data class TapPollAction(channelId: String, messageId: String, type: String) : ReactEvent {
   public final val channelId: String
   public final val messageId: String
   public final val type: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "type");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.type = var3;
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
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "type");
      return new TapPollAction(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.type.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.channelId;
      val var3: java.lang.String = this.messageId;
      val var1: java.lang.String = this.type;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapPollAction(channelId=");
      var4.append(var2);
      var4.append(", messageId=");
      var4.append(var3);
      var4.append(", type=");
      var4.append(var1);
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
         val var0: TapPollAction.$serializer = new TapPollAction.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapPollAction", var0, 3);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapPollAction {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var5: java.lang.String;
         val var7: java.lang.String;
         val var10: java.lang.String;
         if (var9.y()) {
            var5 = var9.t(var8, 0);
            var7 = var9.t(var8, 1);
            var10 = var9.t(var8, 2);
            var2 = 7;
         } else {
            var var6: java.lang.String = null;
            var5 = null;
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

                        var5 = var9.t(var8, 2);
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

            var7 = var11;
            var10 = var5;
            var5 = var6;
         }

         var9.b(var8);
         return new TapPollAction(var2, var5, var7, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapPollAction) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapPollAction.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAction> {
         return TapPollAction.$serializer.INSTANCE;
      }
   }
}
