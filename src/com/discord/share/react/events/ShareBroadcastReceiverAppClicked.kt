package com.discord.share.react.events

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
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0

@f
internal data class ShareBroadcastReceiverAppClicked(app: String, location: String?) : ReactEvent {
   public final val app: String
   public final val location: String?

   init {
      q.h(var1, "app");
      super();
      this.app = var1;
      this.location = var2;
   }

   public operator fun component1(): String {
      return this.app;
   }

   public operator fun component2(): String? {
      return this.location;
   }

   public fun copy(app: String = var0.app, location: String? = var0.location): ShareBroadcastReceiverAppClicked {
      q.h(var1, "app");
      return new ShareBroadcastReceiverAppClicked(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ShareBroadcastReceiverAppClicked) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.app, var1.app)) {
            return false;
         } else {
            return q.c(this.location, var1.location);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.app.hashCode();
      val var1: Int;
      if (this.location == null) {
         var1 = 0;
      } else {
         var1 = this.location.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.app;
      val var3: java.lang.String = this.location;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ShareBroadcastReceiverAppClicked(app=");
      var2.append(var1);
      var2.append(", location=");
      var2.append(var3);
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
         val var0: ShareBroadcastReceiverAppClicked.$serializer = new ShareBroadcastReceiverAppClicked.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.share.react.events.ShareBroadcastReceiverAppClicked", var0, 2
         );
         var1.c("app", false);
         var1.c("location", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): ShareBroadcastReceiverAppClicked {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, b2.a, null) as java.lang.String;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.n(var6, 1, b2.a, var5) as java.lang.String;
                     var2 |= 2;
                  } else {
                     var8 = var7.m(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new ShareBroadcastReceiverAppClicked(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: ShareBroadcastReceiverAppClicked) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ShareBroadcastReceiverAppClicked.write$Self$share_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ShareBroadcastReceiverAppClicked> {
         return ShareBroadcastReceiverAppClicked.$serializer.INSTANCE;
      }
   }
}
