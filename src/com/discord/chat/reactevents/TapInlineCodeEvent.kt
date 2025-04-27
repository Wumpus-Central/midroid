package com.discord.chat.reactevents

import Y9.f
import Y9.n
import ba.C0
import ba.G
import ba.G.a
import com.discord.chat.bridge.contentnode.InlineCodeContentNode
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import f8.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class TapInlineCodeEvent(content: String) : ReactEvent {
   public final val content: String

   public constructor(node: InlineCodeContentNode) : q.h(var1, "node") {
      this(var1.getContent());
   }

   init {
      q.h(var1, "content");
      super();
      this.content = var1;
   }

   public operator fun component1(): String {
      return this.content;
   }

   public fun copy(content: String = var0.content): TapInlineCodeEvent {
      q.h(var1, "content");
      return new TapInlineCodeEvent(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapInlineCodeEvent) {
         return false;
      } else {
         return q.c(this.content, (var1 as TapInlineCodeEvent).content);
      }
   }

   public override fun hashCode(): Int {
      return this.content.hashCode();
   }

   public override fun serialize(): WritableMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("node", NativeMapExtensionsKt.nativeMapOf(w.a("content", this.content))));
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.content;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapInlineCodeEvent(content=");
      var1.append(var2);
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
         val var0: TapInlineCodeEvent.$serializer = new TapInlineCodeEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapInlineCodeEvent", var0, 1);
         var1.l("content", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a};
      }

      public open fun deserialize(decoder: Decoder): TapInlineCodeEvent {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Byte = 1;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.t(var6, 0);
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.t(var6, 0);
                  var2 = 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapInlineCodeEvent(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: TapInlineCodeEvent) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapInlineCodeEvent.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapInlineCodeEvent> {
         return TapInlineCodeEvent.$serializer.INSTANCE;
      }
   }
}
