package com.discord.chat.bridge.contentnode

import dn.f
import dn.n
import en.a
import gn.b2
import gn.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class HandleMessage(action: String, message: HandleSurveyMessage, notificationType: String? = null) {
   public final val action: String
   public final val message: HandleSurveyMessage
   public final val notificationType: String?

   init {
      q.h(var1, "action");
      q.h(var2, "message");
      super();
      this.action = var1;
      this.message = var2;
      this.notificationType = var3;
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
      q.h(var1, "action");
      q.h(var2, "message");
      return new HandleMessage(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleMessage) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.notificationType, var1.notificationType);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.action.hashCode();
      val var2: Int = this.message.hashCode();
      val var1: Int;
      if (this.notificationType == null) {
         var1 = 0;
      } else {
         var1 = this.notificationType.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var1: HandleSurveyMessage = this.message;
      val var3: java.lang.String = this.notificationType;
      val var4: StringBuilder = new StringBuilder();
      var4.append("HandleMessage(action=");
      var4.append(var2);
      var4.append(", message=");
      var4.append(var1);
      var4.append(", notificationType=");
      var4.append(var3);
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
         val var0: HandleMessage.$serializer = new HandleMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleMessage", var0, 3);
         var1.l("action", false);
         var1.l("message", false);
         var1.l("notificationType", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, HandleSurveyMessage.$serializer.INSTANCE, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): HandleMessage {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         val var5: Boolean = var10.p();
         var var7: java.lang.String = null;
         var var2: Int;
         var var11: java.lang.String;
         var var12: HandleSurveyMessage;
         if (var5) {
            val var6: java.lang.String = var10.m(var9, 0);
            val var8: HandleSurveyMessage = var10.y(var9, 1, HandleSurveyMessage.$serializer.INSTANCE, null) as HandleSurveyMessage;
            var11 = var10.n(var9, 2, b2.a, null) as java.lang.String;
            var2 = 7;
            var7 = var6;
            var12 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var12 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var11 = var10.n(var9, 2, b2.a, var11) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var12 = var10.y(var9, 1, HandleSurveyMessage.$serializer.INSTANCE, var12) as HandleSurveyMessage;
                        var2 |= 2;
                     }
                  } else {
                     var7 = var10.m(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.c(var9);
         return new HandleMessage(var2, var7, var12, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleMessage.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return gn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleMessage> {
         return HandleMessage.$serializer.INSTANCE;
      }
   }
}
