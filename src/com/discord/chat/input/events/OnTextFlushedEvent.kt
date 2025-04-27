package com.discord.chat.input.events

import Y9.f
import Y9.n
import ba.C0
import ba.G
import ba.G.a
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class OnTextFlushedEvent(text: String, requestId: String) : ReactEvent {
   public final val requestId: String
   public final val text: String

   init {
      q.h(var1, "text");
      q.h(var2, "requestId");
      super();
      this.text = var1;
      this.requestId = var2;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): String {
      return this.requestId;
   }

   public fun copy(text: String = var0.text, requestId: String = var0.requestId): OnTextFlushedEvent {
      q.h(var1, "text");
      q.h(var2, "requestId");
      return new OnTextFlushedEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnTextFlushedEvent) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else {
            return q.c(this.requestId, var1.requestId);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode() * 31 + this.requestId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.text;
      val var3: java.lang.String = this.requestId;
      val var1: StringBuilder = new StringBuilder();
      var1.append("OnTextFlushedEvent(text=");
      var1.append(var2);
      var1.append(", requestId=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnTextFlushedEvent.$serializer = new OnTextFlushedEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnTextFlushedEvent", var0, 2);
         var1.l("text", false);
         var1.l("requestId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a};
      }

      public open fun deserialize(decoder: Decoder): OnTextFlushedEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         var var2: Int;
         var var5: java.lang.String;
         var var8: java.lang.String;
         if (var7.y()) {
            var8 = var7.t(var6, 0);
            var5 = var7.t(var6, 1);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.t(var6, 1);
                     var2 |= 2;
                  } else {
                     var8 = var7.t(var6, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new OnTextFlushedEvent(var2, var8, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: OnTextFlushedEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         OnTextFlushedEvent.write$Self$chat_input_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnTextFlushedEvent> {
         return OnTextFlushedEvent.$serializer.INSTANCE;
      }
   }
}
