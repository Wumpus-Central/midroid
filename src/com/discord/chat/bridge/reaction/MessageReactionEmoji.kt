package com.discord.chat.bridge.reaction

import com.discord.emoji.RenderableEmoji
import com.discord.reactions.ReactionView
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import tb.g

@g
public data class MessageReactionEmoji(name: String? = null, src: String, displayName: String, id: String? = null, animated: Boolean? = null) :
   ReactionView.Emoji {
   public open val name: String?
   public open val src: String
   public open val displayName: String
   public open val id: String?
   public open val animated: Boolean?

   init {
      r.h(var2, "src");
      r.h(var3, "displayName");
      super();
      this.name = var1;
      this.src = var2;
      this.displayName = var3;
      this.id = var4;
      this.animated = var5;
   }

   public operator fun component1(): String? {
      return this.name;
   }

   public operator fun component2(): String {
      return this.src;
   }

   public operator fun component3(): String {
      return this.displayName;
   }

   public operator fun component4(): String? {
      return this.id;
   }

   public operator fun component5(): Boolean? {
      return this.animated;
   }

   public fun copy(
      name: String? = var0.name,
      src: String = var0.src,
      displayName: String = var0.displayName,
      id: String? = var0.id,
      animated: Boolean? = var0.animated
   ): MessageReactionEmoji {
      r.h(var2, "src");
      r.h(var3, "displayName");
      return new MessageReactionEmoji(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageReactionEmoji) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else if (!r.c(this.src, var1.src)) {
            return false;
         } else if (!r.c(this.displayName, var1.displayName)) {
            return false;
         } else if (!r.c(this.id, var1.id)) {
            return false;
         } else {
            return r.c(this.animated, var1.animated);
         }
      }
   }

   override fun getEmojiId(): java.lang.String {
      return ReactionView.Emoji.DefaultImpls.getEmojiId(this);
   }

   override fun getShouldAnimate(): Boolean {
      return ReactionView.Emoji.DefaultImpls.getShouldAnimate(this);
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.name == null) {
         var1 = 0;
      } else {
         var1 = this.name.hashCode();
      }

      val var5: Int = this.src.hashCode();
      val var4: Int = this.displayName.hashCode();
      val var2: Int;
      if (this.id == null) {
         var2 = 0;
      } else {
         var2 = this.id.hashCode();
      }

      if (this.animated != null) {
         var3 = this.animated.hashCode();
      }

      return (((var1 * 31 + var5) * 31 + var4) * 31 + var2) * 31 + var3;
   }

   override fun renderable(): RenderableEmoji {
      return ReactionView.Emoji.DefaultImpls.renderable(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.name;
      val var6: java.lang.String = this.src;
      val var1: java.lang.String = this.displayName;
      val var4: java.lang.String = this.id;
      val var5: java.lang.Boolean = this.animated;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MessageReactionEmoji(name=");
      var2.append(var3);
      var2.append(", src=");
      var2.append(var6);
      var2.append(", displayName=");
      var2.append(var1);
      var2.append(", id=");
      var2.append(var4);
      var2.append(", animated=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MessageReactionEmoji> {
         return MessageReactionEmoji.$serializer.INSTANCE;
      }
   }
}
