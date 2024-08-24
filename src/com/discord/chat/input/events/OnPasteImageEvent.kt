package com.discord.chat.input.events

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
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
public data class OnPasteImageEvent(url: String, type: String?) : ReactEvent {
   public final val type: String?
   public final val url: String

   init {
      r.h(var1, "url");
      super();
      this.url = var1;
      this.type = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: OnPasteImageEvent, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.url);
      var1.m(var2, 1, a2.a, var0.type);
   }

   public operator fun component1(): String {
      return this.url;
   }

   public operator fun component2(): String? {
      return this.type;
   }

   public fun copy(url: String = var0.url, type: String? = var0.type): OnPasteImageEvent {
      r.h(var1, "url");
      return new OnPasteImageEvent(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is OnPasteImageEvent) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.url, var1.url)) {
            return false;
         } else {
            return r.c(this.type, var1.type);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = this.url.hashCode();
      val var1: Int;
      if (this.type == null) {
         var1 = 0;
      } else {
         var1 = this.type.hashCode();
      }

      return var2 * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.url;
      val var1: java.lang.String = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("OnPasteImageEvent(url=");
      var2.append(var3);
      var2.append(", type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<OnPasteImageEvent> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: OnPasteImageEvent.$serializer = new OnPasteImageEvent.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.input.events.OnPasteImageEvent", var0, 2);
         var1.l("url", false);
         var1.l("type", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): OnPasteImageEvent {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: java.lang.String;
         if (var7.p()) {
            var8 = var7.m(var6, 0);
            var5 = var7.n(var6, 1, a2.a, null);
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

                     var5 = var7.n(var6, 1, a2.a, var5);
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
         return new OnPasteImageEvent(var2, var8, var5 as java.lang.String, null);
      }

      public open fun serialize(encoder: Encoder, value: OnPasteImageEvent) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         OnPasteImageEvent.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<OnPasteImageEvent> {
         return OnPasteImageEvent.$serializer.INSTANCE;
      }
   }
}
