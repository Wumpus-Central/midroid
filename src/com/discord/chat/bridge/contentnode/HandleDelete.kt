package com.discord.chat.bridge.contentnode

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
public data class HandleDelete(action: String, message: HandleDeleteMessage) {
   public final val action: String
   public final val message: HandleDeleteMessage

   init {
      r.h(var1, "action");
      r.h(var2, "message");
      super();
      this.action = var1;
      this.message = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: HandleDelete, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.y(var2, 1, HandleDeleteMessage.$serializer.INSTANCE, var0.message);
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): HandleDeleteMessage {
      return this.message;
   }

   public fun copy(action: String = var0.action, message: HandleDeleteMessage = var0.message): HandleDelete {
      r.h(var1, "action");
      r.h(var2, "message");
      return new HandleDelete(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleDelete) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else {
            return r.c(this.message, var1.message);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode() * 31 + this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var3: HandleDeleteMessage = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("HandleDelete(action=");
      var1.append(var2);
      var1.append(", message=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<HandleDelete> {
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
         return new KSerializer[]{a2.a, HandleDeleteMessage.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): HandleDelete {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.y(var6, 1, HandleDeleteMessage.$serializer.INSTANCE, null);
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

                     var5 = var7.y(var6, 1, HandleDeleteMessage.$serializer.INSTANCE, var5);
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
         return new HandleDelete(var2, var8, var5 as HandleDeleteMessage, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleDelete) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleDelete.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleDelete> {
         return HandleDelete.$serializer.INSTANCE;
      }
   }
}
