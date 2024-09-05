package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
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
import qn.b2
import qn.g0
import qn.g0.a

@f
public data class TapSafetyPolicyNoticeEmbed(classificationId: String) : ReactEvent {
   public final val classificationId: String

   init {
      q.h(var1, "classificationId");
      super();
      this.classificationId = var1;
   }

   public operator fun component1(): String {
      return this.classificationId;
   }

   public fun copy(classificationId: String = var0.classificationId): TapSafetyPolicyNoticeEmbed {
      q.h(var1, "classificationId");
      return new TapSafetyPolicyNoticeEmbed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSafetyPolicyNoticeEmbed) {
         return false;
      } else {
         return q.c(this.classificationId, (var1 as TapSafetyPolicyNoticeEmbed).classificationId);
      }
   }

   public override fun hashCode(): Int {
      return this.classificationId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.classificationId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapSafetyPolicyNoticeEmbed(classificationId=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapSafetyPolicyNoticeEmbed.$serializer = new TapSafetyPolicyNoticeEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSafetyPolicyNoticeEmbed", var0, 1);
         var1.c("classificationId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapSafetyPolicyNoticeEmbed {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.m(var6, 0);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapSafetyPolicyNoticeEmbed(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: TapSafetyPolicyNoticeEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapSafetyPolicyNoticeEmbed.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapSafetyPolicyNoticeEmbed> {
         return TapSafetyPolicyNoticeEmbed.$serializer.INSTANCE;
      }
   }
}
