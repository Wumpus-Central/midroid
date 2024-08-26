package com.discord.chat.bridge.forums

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
public data class PostSharePrompt(title: String, subtitle: StructurableText, cta: String, icon: String, closeIcon: String) {
   public final val closeIcon: String
   public final val cta: String
   public final val icon: String
   public final val subtitle: StructurableText
   public final val title: String

   init {
      r.h(var1, "title");
      r.h(var2, "subtitle");
      r.h(var3, "cta");
      r.h(var4, "icon");
      r.h(var5, "closeIcon");
      super();
      this.title = var1;
      this.subtitle = var2;
      this.cta = var3;
      this.icon = var4;
      this.closeIcon = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: PostSharePrompt, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.title);
      var1.y(var2, 1, StructurableTextSerializer.INSTANCE, var0.subtitle);
      var1.z(var2, 2, var0.cta);
      var1.z(var2, 3, var0.icon);
      var1.z(var2, 4, var0.closeIcon);
   }

   public operator fun component1(): String {
      return this.title;
   }

   public operator fun component2(): StructurableText {
      return this.subtitle;
   }

   public operator fun component3(): String {
      return this.cta;
   }

   public operator fun component4(): String {
      return this.icon;
   }

   public operator fun component5(): String {
      return this.closeIcon;
   }

   public fun copy(
      title: String = var0.title,
      subtitle: StructurableText = var0.subtitle,
      cta: String = var0.cta,
      icon: String = var0.icon,
      closeIcon: String = var0.closeIcon
   ): PostSharePrompt {
      r.h(var1, "title");
      r.h(var2, "subtitle");
      r.h(var3, "cta");
      r.h(var4, "icon");
      r.h(var5, "closeIcon");
      return new PostSharePrompt(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostSharePrompt) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.title, var1.title)) {
            return false;
         } else if (!r.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!r.c(this.cta, var1.cta)) {
            return false;
         } else if (!r.c(this.icon, var1.icon)) {
            return false;
         } else {
            return r.c(this.closeIcon, var1.closeIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.title.hashCode() * 31 + this.subtitle.hashCode()) * 31 + this.cta.hashCode()) * 31 + this.icon.hashCode()) * 31
         + this.closeIcon.hashCode();
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.title;
      val var1: StructurableText = this.subtitle;
      val var2: java.lang.String = this.cta;
      val var3: java.lang.String = this.icon;
      val var5: java.lang.String = this.closeIcon;
      val var4: StringBuilder = new StringBuilder();
      var4.append("PostSharePrompt(title=");
      var4.append(var6);
      var4.append(", subtitle=");
      var4.append(var1);
      var4.append(", cta=");
      var4.append(var2);
      var4.append(", icon=");
      var4.append(var3);
      var4.append(", closeIcon=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<PostSharePrompt> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: PostSharePrompt.$serializer = new PostSharePrompt.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.forums.PostSharePrompt", var0, 5);
         var1.l("title", false);
         var1.l("subtitle", false);
         var1.l("cta", false);
         var1.l("icon", false);
         var1.l("closeIcon", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, StructurableTextSerializer.INSTANCE, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): PostSharePrompt {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var8: Any;
         var var13: java.lang.String;
         var var14: java.lang.String;
         if (var5) {
            var14 = var12.m(var11, 0);
            var8 = var12.y(var11, 1, StructurableTextSerializer.INSTANCE, null);
            val var10: java.lang.String = var12.m(var11, 2);
            var6 = var12.m(var11, 3);
            var13 = var12.m(var11, 4);
            var2 = 31;
            var9 = var14;
            var14 = var10;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var14 = null;
            var6 = null;
            var13 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var13 = var12.m(var11, 4);
                              var2 |= 16;
                           } else {
                              var6 = var12.m(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var14 = var12.m(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.y(var11, 1, StructurableTextSerializer.INSTANCE, var8);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.m(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var12.c(var11);
         return new PostSharePrompt(var2, var9, var8 as StructurableText, var14, var6, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: PostSharePrompt) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PostSharePrompt.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostSharePrompt> {
         return PostSharePrompt.$serializer.INSTANCE;
      }
   }
}
