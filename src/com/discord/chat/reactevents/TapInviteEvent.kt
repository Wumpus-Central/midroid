package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.g0
import fl.h
import fl.n0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapInviteEvent(messageId: String, index: Int, primary: Boolean?, secondary: Boolean?) : ReactEvent {
   public final val index: Int
   public final val messageId: String
   public final val primary: Boolean?
   public final val secondary: Boolean?

   init {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.index = var2;
      this.primary = var3;
      this.secondary = var4;
   }

   public operator fun component1(): String {
      return this.messageId;
   }

   public operator fun component2(): Int {
      return this.index;
   }

   public operator fun component3(): Boolean? {
      return this.primary;
   }

   public operator fun component4(): Boolean? {
      return this.secondary;
   }

   public fun copy(messageId: String = var0.messageId, index: Int = var0.index, primary: Boolean? = var0.primary, secondary: Boolean? = var0.secondary): TapInviteEvent {
      q.h(var1, "messageId");
      return new TapInviteEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.primary, var1.primary)) {
            return false;
         } else {
            return q.c(this.secondary, var1.secondary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.messageId.hashCode();
      val var3: Int = Integer.hashCode(this.index);
      var var2: Int = 0;
      val var1: Int;
      if (this.primary == null) {
         var1 = 0;
      } else {
         var1 = this.primary.hashCode();
      }

      if (this.secondary != null) {
         var2 = this.secondary.hashCode();
      }

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var5: java.lang.Boolean = this.primary;
      val var4: java.lang.Boolean = this.secondary;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapInviteEvent(messageId=");
      var3.append(var2);
      var3.append(", index=");
      var3.append(var1);
      var3.append(", primary=");
      var3.append(var5);
      var3.append(", secondary=");
      var3.append(var4);
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
         val var0: TapInviteEvent.$serializer = new TapInviteEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInviteEvent", var0, 4);
         var1.l("messageId", false);
         var1.l("index", false);
         var1.l("primary", false);
         var1.l("secondary", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: h = h.a;
         return new KSerializer[]{b2.a, n0.a, a.u(h.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapInviteEvent {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.Boolean;
         var var7: java.lang.String;
         var var11: java.lang.Boolean;
         if (var9.y()) {
            var7 = var9.t(var8, 0);
            var2 = var9.k(var8, 1);
            val var10: h = h.a;
            var6 = var9.v(var8, 2, h.a, null) as java.lang.Boolean;
            var11 = var9.v(var8, 3, var10, null) as java.lang.Boolean;
            var3 = 15;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var7 = null;
            var6 = null;
            var11 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var9.x(var8);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var11 = var9.v(var8, 3, h.a, var11) as java.lang.Boolean;
                           var2 |= 8;
                        } else {
                           var6 = var9.v(var8, 2, h.a, var6) as java.lang.Boolean;
                           var2 |= 4;
                        }
                     } else {
                        var3 = var9.k(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.t(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var3 = var2;
            var2 = var3;
         }

         var9.b(var8);
         return new TapInviteEvent(var3, var7, var2, var6, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInviteEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapInviteEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteEvent> {
         return TapInviteEvent.$serializer.INSTANCE;
      }
   }
}
