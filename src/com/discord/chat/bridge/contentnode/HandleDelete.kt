package com.discord.chat.bridge.contentnode

import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class HandleDelete(action: String, message: HandleDeleteMessage) {
   public final val action: String
   public final val message: HandleDeleteMessage

   init {
      q.h(var1, "action");
      q.h(var2, "message");
      super();
      this.action = var1;
      this.message = var2;
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): HandleDeleteMessage {
      return this.message;
   }

   public fun copy(action: String = var0.action, message: HandleDeleteMessage = var0.message): HandleDelete {
      q.h(var1, "action");
      q.h(var2, "message");
      return new HandleDelete(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleDelete) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else {
            return q.c(this.message, var1.message);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode() * 31 + this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var3: HandleDeleteMessage = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("HandleDelete(action=");
      var2.append(var1);
      var2.append(", message=");
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
         val var0: HandleDelete.$serializer = new HandleDelete.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleDelete", var0, 2);
         var1.l("action", false);
         var1.l("message", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, HandleDeleteMessage.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): HandleDelete {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: HandleDeleteMessage;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.y(var6, 1, HandleDeleteMessage.$serializer.INSTANCE, null) as HandleDeleteMessage;
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

                     var5 = var7.y(var6, 1, HandleDeleteMessage.$serializer.INSTANCE, var5) as HandleDeleteMessage;
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
         return new HandleDelete(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleDelete) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleDelete.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleDelete> {
         return HandleDelete.$serializer.INSTANCE;
      }
   }
}
