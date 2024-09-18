package com.discord.chat.bridge.botuikit

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.f
import vk.n
import wk.a
import yk.b2
import yk.g0

@f
public data class ContentInventoryEntryClickable(ariaDescription: String? = null) {
   public final val ariaDescription: String?

   fun ContentInventoryEntryClickable() {
      this(null, 1, null);
   }

   init {
      this.ariaDescription = var1;
   }

   public operator fun component1(): String? {
      return this.ariaDescription;
   }

   public fun copy(ariaDescription: String? = var0.ariaDescription): ContentInventoryEntryClickable {
      return new ContentInventoryEntryClickable(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContentInventoryEntryClickable) {
         return false;
      } else {
         return q.c(this.ariaDescription, (var1 as ContentInventoryEntryClickable).ariaDescription);
      }
   }

   public override fun hashCode(): Int {
      val var1: Int;
      if (this.ariaDescription == null) {
         var1 = 0;
      } else {
         var1 = this.ariaDescription.hashCode();
      }

      return var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.ariaDescription;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ContentInventoryEntryClickable(ariaDescription=");
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
         val var0: ContentInventoryEntryClickable.$serializer = new ContentInventoryEntryClickable.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.bridge.botuikit.ContentInventoryEntryClickable", var0, 1
         );
         var1.l("ariaDescription", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): ContentInventoryEntryClickable {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: java.lang.String;
         if (var5) {
            var8 = var7.v(var6, 0, b2.a, null) as java.lang.String;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.v(var6, 0, b2.a, var8) as java.lang.String;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new ContentInventoryEntryClickable(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: ContentInventoryEntryClickable) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContentInventoryEntryClickable.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContentInventoryEntryClickable> {
         return ContentInventoryEntryClickable.$serializer.INSTANCE;
      }
   }
}
