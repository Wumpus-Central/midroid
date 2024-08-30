package com.discord.chat.bridge.forums

import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.structurabletext.StructurableTextSerializer
import dn.f
import dn.n
import gn.b2
import gn.g0
import gn.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
      val var2: java.lang.String = this.title;
      val var6: StructurableText = this.subtitle;
      val var4: java.lang.String = this.cta;
      val var5: java.lang.String = this.icon;
      val var3: java.lang.String = this.closeIcon;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PostSharePrompt(title=");
      var1.append(var2);
      var1.append(", subtitle=");
      var1.append(var6);
      var1.append(", cta=");
      var1.append(var4);
      var1.append(", icon=");
      var1.append(var5);
      var1.append(", closeIcon=");
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
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var9: java.lang.String = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: StructurableText;
         var var12: java.lang.String;
         if (var5) {
            var9 = var11.m(var10, 0);
            var8 = var11.y(var10, 1, StructurableTextSerializer.INSTANCE, null) as StructurableText;
            var7 = var11.m(var10, 2);
            var6 = var11.m(var10, 3);
            var12 = var11.m(var10, 4);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var12 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var12 = var11.m(var10, 4);
                              var2 |= 16;
                           } else {
                              var6 = var11.m(var10, 3);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var11.m(var10, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var11.y(var10, 1, StructurableTextSerializer.INSTANCE, var8) as StructurableText;
                        var2 |= 2;
                     }
                  } else {
                     var9 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var11.c(var10);
         return new PostSharePrompt(var2, var9, var8, var7, var6, var12, null);
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
