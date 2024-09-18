package com.discord.chat.bridge.forums

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
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
import yk.b2
import yk.g0
import yk.g0.a

@f
public data class PostSharePrompt(title: String, subtitle: StructurableText, cta: String, icon: String, closeIcon: String) {
   public final val closeIcon: String
   public final val cta: String
   public final val icon: String
   public final val subtitle: StructurableText
   public final val title: String

   init {
      q.h(var1, "title");
      q.h(var2, "subtitle");
      q.h(var3, "cta");
      q.h(var4, "icon");
      q.h(var5, "closeIcon");
      super();
      this.title = var1;
      this.subtitle = var2;
      this.cta = var3;
      this.icon = var4;
      this.closeIcon = var5;
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
      q.h(var1, "title");
      q.h(var2, "subtitle");
      q.h(var3, "cta");
      q.h(var4, "icon");
      q.h(var5, "closeIcon");
      return new PostSharePrompt(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostSharePrompt) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.title, var1.title)) {
            return false;
         } else if (!q.c(this.subtitle, var1.subtitle)) {
            return false;
         } else if (!q.c(this.cta, var1.cta)) {
            return false;
         } else if (!q.c(this.icon, var1.icon)) {
            return false;
         } else {
            return q.c(this.closeIcon, var1.closeIcon);
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.title.hashCode() * 31 + this.subtitle.hashCode()) * 31 + this.cta.hashCode()) * 31 + this.icon.hashCode()) * 31
         + this.closeIcon.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.title;
      val var1: StructurableText = this.subtitle;
      val var5: java.lang.String = this.cta;
      val var6: java.lang.String = this.icon;
      val var2: java.lang.String = this.closeIcon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PostSharePrompt(title=");
      var3.append(var4);
      var3.append(", subtitle=");
      var3.append(var1);
      var3.append(", cta=");
      var3.append(var5);
      var3.append(", icon=");
      var3.append(var6);
      var3.append(", closeIcon=");
      var3.append(var2);
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
         return new KSerializer[]{b2.a, StructurableTextSerializer.INSTANCE, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): PostSharePrompt {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         val var5: Boolean = var12.y();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var8: StructurableText;
         val var13: java.lang.String;
         var var16: java.lang.String;
         if (var5) {
            var16 = var12.t(var11, 0);
            var8 = var12.m(var11, 1, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            val var10: java.lang.String = var12.t(var11, 2);
            var13 = var12.t(var11, 3);
            var6 = var12.t(var11, 4);
            var2 = 31;
            var9 = var16;
            var16 = var10;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var16 = null;
            var6 = null;
            var var14: java.lang.String = null;

            while (var3) {
               val var4: Int = var12.x(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.t(var11, 4);
                              var2 |= 16;
                           } else {
                              var6 = var12.t(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var16 = var12.t(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.m(var11, 1, StructurableTextSerializer.INSTANCE, var8) as StructurableText;
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.t(var11, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var14;
            var13 = var6;
         }

         var12.b(var11);
         return new PostSharePrompt(var2, var9, var8, var16, var13, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: PostSharePrompt) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         PostSharePrompt.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<PostSharePrompt> {
         return PostSharePrompt.$serializer.INSTANCE;
      }
   }
}
