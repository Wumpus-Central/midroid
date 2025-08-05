package com.discord.chat.bridge.forums

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class PostSharePrompt(title: String, subtitle: StructurableText, cta: String, icon: String, closeIcon: String) {
   public final val title: String
   public final val subtitle: StructurableText
   public final val cta: String
   public final val icon: String
   public final val closeIcon: String

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
      val var3: java.lang.String = this.title;
      val var5: StructurableText = this.subtitle;
      val var2: java.lang.String = this.cta;
      val var6: java.lang.String = this.icon;
      val var4: java.lang.String = this.closeIcon;
      val var1: StringBuilder = new StringBuilder();
      var1.append("PostSharePrompt(title=");
      var1.append(var3);
      var1.append(", subtitle=");
      var1.append(var5);
      var1.append(", cta=");
      var1.append(var2);
      var1.append(", icon=");
      var1.append(var6);
      var1.append(", closeIcon=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PostSharePrompt> {
         return PostSharePrompt.$serializer.INSTANCE;
      }
   }
}
