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
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.g0.a

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
      val var1: java.lang.String = this.title;
      val var3: StructurableText = this.subtitle;
      val var2: java.lang.String = this.cta;
      val var6: java.lang.String = this.icon;
      val var4: java.lang.String = this.closeIcon;
      val var5: StringBuilder = new StringBuilder();
      var5.append("PostSharePrompt(title=");
      var5.append(var1);
      var5.append(", subtitle=");
      var5.append(var3);
      var5.append(", cta=");
      var5.append(var2);
      var5.append(", icon=");
      var5.append(var6);
      var5.append(", closeIcon=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
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
         var1.c("title", false);
         var1.c("subtitle", false);
         var1.c("cta", false);
         var1.c("icon", false);
         var1.c("closeIcon", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, StructurableTextSerializer.INSTANCE, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): PostSharePrompt {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: StructurableText;
         val var10: java.lang.String;
         var var13: java.lang.String;
         if (var5) {
            var7 = var12.m(var11, 0);
            var8 = var12.y(var11, 1, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var10 = var12.m(var11, 2);
            var6 = var12.m(var11, 3);
            var13 = var12.m(var11, 4);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
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
                           var7 = var12.m(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.y(var11, 1, StructurableTextSerializer.INSTANCE, var8) as StructurableText;
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

            var10 = var7;
            var7 = var9;
         }

         var12.c(var11);
         return new PostSharePrompt(var2, var7, var8, var10, var6, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: PostSharePrompt) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         PostSharePrompt.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
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
