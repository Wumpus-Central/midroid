package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import fl.b2
import fl.g0
import fl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TitleOnClick(action: String, targetChannelId: String, targetMessageId: String) {
   public final val action: String
   public final val targetChannelId: String
   public final val targetMessageId: String

   init {
      q.h(var1, "action");
      q.h(var2, "targetChannelId");
      q.h(var3, "targetMessageId");
      super();
      this.action = var1;
      this.targetChannelId = var2;
      this.targetMessageId = var3;
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
      q.h(var1, "action");
      q.h(var2, "targetChannelId");
      q.h(var3, "targetMessageId");
      return new TitleOnClick(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TitleOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!q.c(this.targetChannelId, var1.targetChannelId)) {
            return false;
         } else {
            return q.c(this.targetMessageId, var1.targetMessageId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.action.hashCode() * 31 + this.targetChannelId.hashCode()) * 31 + this.targetMessageId.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var2: java.lang.String = this.targetChannelId;
      val var4: java.lang.String = this.targetMessageId;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TitleOnClick(action=");
      var3.append(var1);
      var3.append(", targetChannelId=");
      var3.append(var2);
      var3.append(", targetMessageId=");
      var3.append(var4);
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
         val var0: TitleOnClick.$serializer = new TitleOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.TitleOnClick", var0, 3);
         var1.l("action", false);
         var1.l("targetChannelId", false);
         var1.l("targetMessageId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TitleOnClick {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var2: Int;
         var var5: java.lang.String;
         var var6: java.lang.String;
         val var10: java.lang.String;
         if (var9.y()) {
            var6 = var9.t(var8, 0);
            var5 = var9.t(var8, 1);
            var10 = var9.t(var8, 2);
            var2 = 7;
         } else {
            var6 = null;
            var5 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.x(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var9.t(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.t(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.t(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var10 = var5;
            var5 = var11;
         }

         var9.b(var8);
         return new TitleOnClick(var2, var6, var5, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TitleOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TitleOnClick.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TitleOnClick> {
         return TitleOnClick.$serializer.INSTANCE;
      }
   }
}
