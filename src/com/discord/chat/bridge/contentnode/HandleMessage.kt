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
import vk.a
import xk.a2
import xk.f0

@f
public data class HandleMessage(action: String, message: HandleSurveyMessage, notificationType: String? = null) {
   public final val action: String
   public final val message: HandleSurveyMessage
   public final val notificationType: String?

   init {
      r.h(var1, "action");
      r.h(var2, "message");
      super();
      this.action = var1;
      this.message = var2;
      this.notificationType = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: HandleMessage, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.action);
      var1.y(var2, 1, HandleSurveyMessage.$serializer.INSTANCE, var0.message);
      if (var1.A(var2, 2) || var0.notificationType != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, a2.a, var0.notificationType);
      }
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): HandleSurveyMessage {
      return this.message;
   }

   public operator fun component3(): String? {
      return this.notificationType;
   }

   public fun copy(action: String = var0.action, message: HandleSurveyMessage = var0.message, notificationType: String? = var0.notificationType): HandleMessage {
      r.h(var1, "action");
      r.h(var2, "message");
      return new HandleMessage(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleMessage) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.message, var1.message)) {
            return false;
         } else {
            return r.c(this.notificationType, var1.notificationType);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.action.hashCode();
      val var3: Int = this.message.hashCode();
      val var1: Int;
      if (this.notificationType == null) {
         var1 = 0;
      } else {
         var1 = this.notificationType.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var3: HandleSurveyMessage = this.message;
      val var4: java.lang.String = this.notificationType;
      val var2: StringBuilder = new StringBuilder();
      var2.append("HandleMessage(action=");
      var2.append(var1);
      var2.append(", message=");
      var2.append(var3);
      var2.append(", notificationType=");
      var2.append(var4);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<HandleMessage> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: HandleMessage.$serializer = new HandleMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleMessage", var0, 3);
         var1.l("action", false);
         var1.l("message", false);
         var1.l("notificationType", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, HandleSurveyMessage.$serializer.INSTANCE, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): HandleMessage {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         val var5: Boolean = var9.p();
         var var7: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var10: Any;
         if (var5) {
            var7 = var9.m(var8, 0);
            var6 = var9.y(var8, 1, HandleSurveyMessage.$serializer.INSTANCE, null);
            var10 = var9.n(var8, 2, a2.a, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var6 = null;
            var10 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var10 = var9.n(var8, 2, a2.a, var10);
                        var2 |= 4;
                     } else {
                        var6 = var9.y(var8, 1, HandleSurveyMessage.$serializer.INSTANCE, var6);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         return new HandleMessage(var2, var7, var6 as HandleSurveyMessage, var10 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleMessage) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleMessage.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleMessage> {
         return HandleMessage.$serializer.INSTANCE;
      }
   }
}
