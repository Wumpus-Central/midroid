package com.discord.notifications.api

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.g0
import xk.g0.a

@f
public data class Poll(question: PollMedia) {
   public final val question: PollMedia

   init {
      q.h(var1, "question");
      super();
      this.question = var1;
   }

   public operator fun component1(): PollMedia {
      return this.question;
   }

   public fun copy(question: PollMedia = var0.question): Poll {
      q.h(var1, "question");
      return new Poll(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Poll) {
         return false;
      } else {
         return q.c(this.question, (var1 as Poll).question);
      }
   }

   public override fun hashCode(): Int {
      return this.question.hashCode();
   }

   public override fun toString(): String {
      val var2: PollMedia = this.question;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Poll(question=");
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
         val var0: Poll.$serializer = new Poll.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.notifications.api.Poll", var0, 1);
         var1.l("question", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{PollMedia.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): Poll {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: PollMedia;
         if (var5) {
            var8 = var7.m(var6, 0, PollMedia.$serializer.INSTANCE, null) as PollMedia;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0, PollMedia.$serializer.INSTANCE, var8) as PollMedia;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new Poll(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: Poll) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Poll.write$Self$notification_api_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Poll> {
         return Poll.$serializer.INSTANCE;
      }
   }
}
