package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fa.f
import fa.n
import ia.C0
import ia.G
import ia.N
import ia.G.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapInviteAcceptEvent(messageId: String, index: Int) : ReactEvent {
   public final val index: Int
   public final val messageId: String

   init {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.index = var2;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public fun copy(messageId: String = var0.messageId, index: Int = var0.index): TapInviteAcceptEvent {
      q.h(var1, "messageId");
      return new TapInviteAcceptEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteAcceptEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return this.index == var1.index;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.messageId.hashCode() * 31 + Integer.hashCode(this.index);
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapInviteAcceptEvent(messageId=");
      var2.append(var3);
      var2.append(", index=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapInviteAcceptEvent.$serializer = new TapInviteAcceptEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInviteAcceptEvent", var0, 2);
         var1.l("messageId", false);
         var1.l("index", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, N.a};
      }

      public open fun deserialize(decoder: Decoder): TapInviteAcceptEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var3: Int;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var3 = var7.k(var6, 1);
            var2 = 3;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var2 = 0;
            var8 = null;

            while (var4) {
               val var5: Int = var7.x(var6);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        throw new n(var5);
                     }

                     var3 = var7.k(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }
         }

         var7.b(var6);
         return new TapInviteAcceptEvent(var2, var8, var3, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInviteAcceptEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapInviteAcceptEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteAcceptEvent> {
         return TapInviteAcceptEvent.$serializer.INSTANCE;
      }
   }
}
