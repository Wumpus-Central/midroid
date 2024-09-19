package com.discord.chat.bridge.contentnode

import al.b2
import al.g0
import al.o1
import al.g0.a
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import xk.f
import xk.n

@f
public data class ActorHook(action: String, userId: UserId) : ActorHook(var1, var2) {
   public final val action: String
   public final val userId: UserId

   fun ActorHook(var1: Int, var2: java.lang.String, var3: UserId, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, ActorHook.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.action = var2;
      this.userId = var3.unbox-impl();
   }

   fun ActorHook(var1: java.lang.String, var2: Long) {
      q.h(var1, "action");
      super();
      this.action = var1;
      this.userId = var2;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): UserId {
      return this.userId;
   }

   public fun copy(action: String = ..., userId: UserId = ...): ActorHook {
      q.h(var1, "action");
      return new ActorHook(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActorHook) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else {
            return UserId.equals-impl0(this.userId, var1.userId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode() * 31 + UserId.hashCode-impl(this.userId);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var1: java.lang.String = UserId.toString-impl(this.userId);
      val var3: StringBuilder = new StringBuilder();
      var3.append("ActorHook(action=");
      var3.append(var2);
      var3.append(", userId=");
      var3.append(var1);
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
         val var0: ActorHook.$serializer = new ActorHook.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.ActorHook", var0, 2);
         var1.l("action", false);
         var1.l("userId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, UserId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): ActorHook {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         val var5: Boolean = var8.y();
         var var6: java.lang.String = null;
         var var2: Int;
         var var9: UserId;
         if (var5) {
            var6 = var8.t(var7, 0);
            var9 = var8.m(var7, 1, UserId.$serializer.INSTANCE, null) as UserId;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var8.x(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var8.m(var7, 1, UserId.$serializer.INSTANCE, var9) as UserId;
                     var2 |= 2;
                  } else {
                     var6 = var8.t(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.b(var7);
         return new ActorHook(var2, var6, var9, null, null);
      }

      public open fun serialize(encoder: Encoder, value: ActorHook) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ActorHook.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActorHook> {
         return ActorHook.$serializer.INSTANCE;
      }
   }
}
