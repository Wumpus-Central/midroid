package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import fl.g0
import fl.g0.a
import kh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
internal data class TapCopyText(text: CharSequence) : ReactEvent {
   public final val text: CharSequence

   init {
      q.h(var1, "text");
      super();
      this.text = var1;
   }

   public operator fun component1(): CharSequence {
      return this.text;
   }

   public fun copy(text: CharSequence = var0.text): TapCopyText {
      q.h(var1, "text");
      return new TapCopyText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCopyText) {
         return false;
      } else {
         return q.c(this.text, (var1 as TapCopyText).text);
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(w.a("text", this.text.toString()));
   }

   public override fun toString(): String {
      val var1: java.lang.CharSequence = this.text;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapCopyText(text=");
      var2.append((Object)var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapCopyText.$serializer = new TapCopyText.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapCopyText", var0, 1);
         var1.l("text", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{TapCopyText.access$get$childSerializers$cp()[0]};
      }

      public open fun deserialize(decoder: Decoder): TapCopyText {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var8: Array<KSerializer> = TapCopyText.access$get$childSerializers$cp();
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var9: java.lang.CharSequence;
         if (var5) {
            var9 = var7.m(var6, 0, var8[0], null) as java.lang.CharSequence;
         } else {
            var2 = 0;
            var9 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var9 = var7.m(var6, 0, var8[0], var9) as java.lang.CharSequence;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new TapCopyText(var2, var9, null);
      }

      public open fun serialize(encoder: Encoder, value: TapCopyText) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapCopyText.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapCopyText> {
         return TapCopyText.$serializer.INSTANCE;
      }
   }
}
