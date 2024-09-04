package com.discord.chat.bridge.contentnode

import com.discord.primitives.UserId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.n1
import xk.f0.a

@f
public data class ActorHook(action: String, userId: UserId) : ActorHook(var1, var2) {
   public final val action: String
   public final val userId: UserId

   fun ActorHook(var1: Int, var2: java.lang.String, var3: UserId, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, ActorHook.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.action = var2;
      this.userId = var3.unbox-impl();
   }

   fun ActorHook(var1: java.lang.String, var2: Long) {
      super();
      this.action = var1;
      this.userId = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: ActorHook, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.y(var2, 1, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.userId));
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): UserId {
      return this.userId;
   }

   public fun copy(action: String = ..., userId: UserId = ...): ActorHook {
      r.h(var1, "action");
      return new ActorHook(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActorHook) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
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
      val var1: java.lang.String = this.action;
      val var3: java.lang.String = UserId.toString-impl(this.userId);
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActorHook(action=");
      var2.append(var1);
      var2.append(", userId=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<ActorHook> {
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
         return new KSerializer[]{a2.a, com.discord.primitives.UserId..serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): ActorHook {
         r.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         val var5: Boolean = var8.p();
         var var6: java.lang.String = null;
         var var2: Int;
         var var9: Any;
         if (var5) {
            var6 = var8.m(var7, 0);
            var9 = var8.y(var7, 1, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var9 = var8.y(var7, 1, com.discord.primitives.UserId..serializer.INSTANCE, var9);
                     var2 |= 2;
                  } else {
                     var6 = var8.m(var7, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.c(var7);
         return new ActorHook(var2, var6, var9 as UserId, null, null);
      }

      public open fun serialize(encoder: Encoder, value: ActorHook) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ActorHook.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ActorHook> {
         return ActorHook.$serializer.INSTANCE;
      }
   }
}
