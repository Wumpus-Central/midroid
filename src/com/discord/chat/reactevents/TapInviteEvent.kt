package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
import xk.h
import xk.m0

@f
public data class TapInviteEvent(messageId: String, index: Int, primary: Boolean?, secondary: Boolean?) : ReactEvent {
   public final val index: Int
   public final val messageId: String
   public final val primary: Boolean?
   public final val secondary: Boolean?

   init {
      r.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.index = var2;
      this.primary = var3;
      this.secondary = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapInviteEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.messageId);
      var1.w(var2, 1, var0.index);
      val var3: h = h.a;
      var1.m(var2, 2, h.a, var0.primary);
      var1.m(var2, 3, var3, var0.secondary);
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
      r.h(var1, "messageId");
      return new TapInviteEvent(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInviteEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!r.c(this.primary, var1.primary)) {
            return false;
         } else {
            return r.c(this.secondary, var1.secondary);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.messageId.hashCode();
      val var4: Int = Integer.hashCode(this.index);
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

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = this.messageId;
      val var1: Int = this.index;
      val var4: java.lang.Boolean = this.primary;
      val var2: java.lang.Boolean = this.secondary;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapInviteEvent(messageId=");
      var3.append(var5);
      var3.append(", index=");
      var3.append(var1);
      var3.append(", primary=");
      var3.append(var4);
      var3.append(", secondary=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<TapInviteEvent> {
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
         return new KSerializer[]{a2.a, m0.a, a.u(h.a), a.u(var1)};
      }

      public open fun deserialize(decoder: Decoder): TapInviteEvent {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var3: Int;
         var var6: java.lang.String;
         var var12: Any;
         var var15: Any;
         if (var11.p()) {
            var6 = var11.m(var10, 0);
            var3 = var11.i(var10, 1);
            var15 = h.a;
            var12 = var11.n(var10, 2, h.a, null);
            var15 = var11.n(var10, 3, (DeserializationStrategy)var15, null);
            var2 = 15;
         } else {
            var var4: Boolean = true;
            var3 = 0;
            var15 = null;
            var6 = null;
            var12 = null;
            var2 = 0;

            while (var4) {
               val var5: Int = var11.o(var10);
               if (var5 != -1) {
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           if (var5 != 3) {
                              throw new n(var5);
                           }

                           var12 = var11.n(var10, 3, h.a, var12);
                           var2 |= 8;
                        } else {
                           var6 = (java.lang.String)var11.n(var10, 2, h.a, var6);
                           var2 |= 4;
                        }
                     } else {
                        var3 = var11.i(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var15 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var4 = false;
               }
            }

            var6 = (java.lang.String)var15;
            var12 = var6;
            var15 = var12;
         }

         var11.c(var10);
         return new TapInviteEvent(var2, var6, var3, var12 as java.lang.Boolean, var15 as java.lang.Boolean, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInviteEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapInviteEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInviteEvent> {
         return TapInviteEvent.$serializer.INSTANCE;
      }
   }
}
