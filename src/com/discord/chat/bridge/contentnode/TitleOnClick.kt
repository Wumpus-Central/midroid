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
public data class TitleOnClick(action: String, targetChannelId: String, targetMessageId: String) {
   public final val action: String
   public final val targetChannelId: String
   public final val targetMessageId: String

   init {
      r.h(var1, "action");
      r.h(var2, "targetChannelId");
      r.h(var3, "targetMessageId");
      super();
      this.action = var1;
      this.targetChannelId = var2;
      this.targetMessageId = var3;
   }

   @JvmStatic
   public fun `write$Self`(self: TitleOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.z(var2, 1, var0.targetChannelId);
      var1.z(var2, 2, var0.targetMessageId);
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): String {
      return this.targetChannelId;
   }

   public operator fun component3(): String {
      return this.targetMessageId;
   }

   public fun copy(action: String = var0.action, targetChannelId: String = var0.targetChannelId, targetMessageId: String = var0.targetMessageId): TitleOnClick {
      r.h(var1, "action");
      r.h(var2, "targetChannelId");
      r.h(var3, "targetMessageId");
      return new TitleOnClick(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TitleOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!r.c(this.targetChannelId, var1.targetChannelId)) {
            return false;
         } else {
            return r.c(this.targetMessageId, var1.targetMessageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.targetChannelId.hashCode()) * 31 + this.targetMessageId.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var4: java.lang.String = this.targetChannelId;
      val var3: java.lang.String = this.targetMessageId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TitleOnClick(action=");
      var1.append(var2);
      var1.append(", targetChannelId=");
      var1.append(var4);
      var1.append(", targetMessageId=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<TitleOnClick> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TitleOnClick.$serializer = new TitleOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.TitleOnClick", var0, 3);
         var1.l("action", false);
         var1.l("targetChannelId", false);
         var1.l("targetMessageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): TitleOnClick {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: java.lang.String;
         val var10: java.lang.String;
         var var12: java.lang.String;
         if (var9.p()) {
            var12 = var9.m(var8, 0);
            val var7: java.lang.String = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
            var6 = var12;
            var12 = var7;
         } else {
            var6 = null;
            var12 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var12 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var10 = var12;
            var12 = var11;
         }

         var9.c(var8);
         return new TitleOnClick(var2, var6, var12, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TitleOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TitleOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TitleOnClick> {
         return TitleOnClick.$serializer.INSTANCE;
      }
   }
}
