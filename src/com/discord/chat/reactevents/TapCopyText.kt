package com.discord.chat.reactevents

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import java.lang.annotation.Annotation
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.c
import uk.f
import uk.n
import xk.f0
import xk.f0.a

@f
internal data class TapCopyText(text: CharSequence) : ReactEvent {
   public final val text: CharSequence

   init {
      r.h(var1, "text");
      super();
      this.text = var1;
   }

   @JvmStatic
   public fun `write$Self`(self: TapCopyText, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new c(h0.b(java.lang.CharSequence.class), new Annotation[0]), var0.text);
   }

   public operator fun component1(): CharSequence {
      return this.text;
   }

   public fun copy(text: CharSequence = var0.text): TapCopyText {
      r.h(var1, "text");
      return new TapCopyText(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapCopyText) {
         return false;
      } else {
         return r.c(this.text, (var1 as TapCopyText).text);
      }
   }

   public override fun hashCode(): Int {
      return this.text.hashCode();
   }

   public open fun serialize(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("text", this.text.toString())});
   }

   public override fun toString(): String {
      val var2: java.lang.CharSequence = this.text;
      val var1: StringBuilder = new StringBuilder();
      var1.append("TapCopyText(text=");
      var1.append((Object)var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<TapCopyText> {
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
         return new KSerializer[]{new c(h0.b(java.lang.CharSequence.class), new Annotation[0])};
      }

      public open fun deserialize(decoder: Decoder): TapCopyText {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: kotlinx.serialization.encoding.c = var1.b(var6);
         val var5: Boolean = var7.p();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Any;
         if (var5) {
            var8 = var7.y(var6, 0, new c(h0.b(java.lang.CharSequence.class), new Annotation[0]), null);
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.y(var6, 0, new c(h0.b(java.lang.CharSequence.class), new Annotation[0]), var8);
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new TapCopyText(var2, var8 as java.lang.CharSequence, null);
      }

      public open fun serialize(encoder: Encoder, value: TapCopyText) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapCopyText.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapCopyText> {
         return TapCopyText.$serializer.INSTANCE;
      }
   }
}
