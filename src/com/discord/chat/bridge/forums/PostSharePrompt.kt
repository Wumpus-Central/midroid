package com.discord.chat.bridge.forums

import com.discord.chat.bridge.structurabletext.StructurableText
import kotlinx.serialization.KSerializer
import nb.g

@g
public data class PostSharePrompt(title: String, subtitle: StructurableText, cta: String, icon: String, closeIcon: String) {
   public final val title: String
   public final val subtitle: StructurableText
   public final val cta: String
   public final val icon: String
   public final val closeIcon: String

   init {
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
      return new PostSharePrompt(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PostSharePrompt) {
         return false;
      } else {
         var1 = var1;
         if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.subtitle == var1.subtitle)) {
            return false;
         } else if (!(this.cta == var1.cta)) {
            return false;
         } else if (!(this.icon == var1.icon)) {
            return false;
         } else {
            return this.closeIcon == var1.closeIcon;
         }
      }
   }

   public override fun hashCode(): Int {
      return (((this.title.hashCode() * 31 + this.subtitle.hashCode()) * 31 + this.cta.hashCode()) * 31 + this.icon.hashCode()) * 31
         + this.closeIcon.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.title;
      val var1: StructurableText = this.subtitle;
      val var2: java.lang.String = this.cta;
      val var4: java.lang.String = this.icon;
      val var6: java.lang.String = this.closeIcon;
      val var5: StringBuilder = new StringBuilder();
      var5.append("PostSharePrompt(title=");
      var5.append(var3);
      var5.append(", subtitle=");
      var5.append(var1);
      var5.append(", cta=");
      var5.append(var2);
      var5.append(", icon=");
      var5.append(var4);
      var5.append(", closeIcon=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<PostSharePrompt> {
         return PostSharePrompt.$serializer.INSTANCE;
      }
   }
}
