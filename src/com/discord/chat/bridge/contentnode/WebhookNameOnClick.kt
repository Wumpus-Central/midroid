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
public data class WebhookNameOnClick(action: String, messageReference: MessageReference? = null) {
   public final val action: String
   public final val messageReference: MessageReference?

   init {
      r.h(var1, "action");
      super();
      this.action = var1;
      this.messageReference = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: WebhookNameOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean = false;
      var1.z(var2, 0, var0.action);
      if (var1.A(var2, 1) || var0.messageReference != null) {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 1, MessageReference.$serializer.INSTANCE, var0.messageReference);
      }
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): MessageReference? {
      return this.messageReference;
   }

   public fun copy(action: String = var0.action, messageReference: MessageReference? = var0.messageReference): WebhookNameOnClick {
      r.h(var1, "action");
      return new WebhookNameOnClick(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is WebhookNameOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else {
            return r.c(this.messageReference, var1.messageReference);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.action.hashCode();
      val var1: Int;
      if (this.messageReference == null) {
         var1 = 0;
      } else {
         var1 = this.messageReference.hashCode();
      }

      return var2 * 31 + var1;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var2: MessageReference = this.messageReference;
      val var3: StringBuilder = new StringBuilder();
      var3.append("WebhookNameOnClick(action=");
      var3.append(var1);
      var3.append(", messageReference=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<WebhookNameOnClick> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: WebhookNameOnClick.$serializer = new WebhookNameOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.WebhookNameOnClick", var0, 2);
         var1.l("action", false);
         var1.l("messageReference", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a.u(MessageReference.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): WebhookNameOnClick {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, MessageReference.$serializer.INSTANCE, null);
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

                     var5 = var7.n(var6, 1, MessageReference.$serializer.INSTANCE, var5);
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
         return new WebhookNameOnClick(var2, var8, var5 as MessageReference, null);
      }

      public open fun serialize(encoder: Encoder, value: WebhookNameOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         WebhookNameOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<WebhookNameOnClick> {
         return WebhookNameOnClick.$serializer.INSTANCE;
      }
   }
}
