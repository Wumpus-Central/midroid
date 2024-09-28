package com.discord.chat.bridge.botuikit

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class Subtitle(badgeUrl: String? = null, text: String, ariaDescription: String? = null, clickable: ContentInventoryEntryClickable? = null) {
   public final val ariaDescription: String?
   public final val badgeUrl: String?
   public final val clickable: ContentInventoryEntryClickable?
   public final val text: String

   init {
      q.h(var2, "text");
      super();
      this.badgeUrl = var1;
      this.text = var2;
      this.ariaDescription = var3;
      this.clickable = var4;
   }

   public operator fun component1(): String? {
      return this.badgeUrl;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public operator fun component3(): String? {
      return this.ariaDescription;
   }

   public operator fun component4(): ContentInventoryEntryClickable? {
      return this.clickable;
   }

   public fun copy(
      badgeUrl: String? = var0.badgeUrl,
      text: String = var0.text,
      ariaDescription: String? = var0.ariaDescription,
      clickable: ContentInventoryEntryClickable? = var0.clickable
   ): Subtitle {
      q.h(var2, "text");
      return new Subtitle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Subtitle) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.badgeUrl, var1.badgeUrl)) {
            return false;
         } else if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.ariaDescription, var1.ariaDescription)) {
            return false;
         } else {
            return q.c(this.clickable, var1.clickable);
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.badgeUrl == null) {
         var1 = 0;
      } else {
         var1 = this.badgeUrl.hashCode();
      }

      val var4: Int = this.text.hashCode();
      val var2: Int;
      if (this.ariaDescription == null) {
         var2 = 0;
      } else {
         var2 = this.ariaDescription.hashCode();
      }

      if (this.clickable != null) {
         var3 = this.clickable.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.badgeUrl;
      val var5: java.lang.String = this.text;
      val var2: java.lang.String = this.ariaDescription;
      val var3: ContentInventoryEntryClickable = this.clickable;
      val var1: StringBuilder = new StringBuilder();
      var1.append("Subtitle(badgeUrl=");
      var1.append(var4);
      var1.append(", text=");
      var1.append(var5);
      var1.append(", ariaDescription=");
      var1.append(var2);
      var1.append(", clickable=");
      var1.append(var3);
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
         val var0: Subtitle.$serializer = new Subtitle.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.botuikit.Subtitle", var0, 4);
         var1.l("badgeUrl", true);
         var1.l("text", false);
         var1.l("ariaDescription", true);
         var1.l("clickable", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), var1, a.u(var1), a.u(ContentInventoryEntryClickable.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): Subtitle {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var5: Boolean = var11.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: java.lang.String;
         val var13: java.lang.String;
         if (var5) {
            val var12: b2 = b2.a;
            var8 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var7 = var11.t(var10, 1);
            var13 = var11.v(var10, 2, var12, null) as java.lang.String;
            var6 = var11.v(var10, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, null) as ContentInventoryEntryClickable;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var var14: Any = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var14 = var11.v(var10, 3, ContentInventoryEntryClickable.$serializer.INSTANCE, var14) as ContentInventoryEntryClickable;
                           var2 |= 8;
                        } else {
                           var6 = var11.v(var10, 2, b2.a, var6) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.v(var10, 0, b2.a, var8) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var14;
            var13 = (java.lang.String)var6;
         }

         var11.b(var10);
         return new Subtitle(var2, var8, var7, var13, (ContentInventoryEntryClickable)var6, null);
      }

      public open fun serialize(encoder: Encoder, value: Subtitle) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         Subtitle.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<Subtitle> {
         return Subtitle.$serializer.INSTANCE;
      }
   }
}
