package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.r

public data class BlockedGroupChatListItem(text: String,
      id: String,
      textColor: Int,
      backgroundColor: Int,
      borderColor: Int,
      isRevealed: Boolean,
      content: List<ChatListItem>
   )
   : ChatListItem {
   public final val backgroundColor: Int
   public final val borderColor: Int
   public final val content: List<ChatListItem>
   public open val id: String
   public final val isRevealed: Boolean
   public final val text: String
   public final val textColor: Int

   init {
      r.h(var1, "text");
      r.h(var2, "id");
      r.h(var7, "content");
      super(var2, null);
      this.text = var1;
      this.id = var2;
      this.textColor = var3;
      this.backgroundColor = var4;
      this.borderColor = var5;
      this.isRevealed = var6;
      this.content = var7;
   }

   public operator fun component1(): String {
      return this.text;
   }

   public operator fun component2(): String {
      return this.getId();
   }

   public operator fun component3(): Int {
      return this.textColor;
   }

   public operator fun component4(): Int {
      return this.backgroundColor;
   }

   public operator fun component5(): Int {
      return this.borderColor;
   }

   public operator fun component6(): Boolean {
      return this.isRevealed;
   }

   public operator fun component7(): List<ChatListItem> {
      return this.content;
   }

   public fun copy(
      text: String = var0.text,
      id: String = var0.getId(),
      textColor: Int = var0.textColor,
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      isRevealed: Boolean = var0.isRevealed,
      content: List<ChatListItem> = var0.content
   ): BlockedGroupChatListItem {
      r.h(var1, "text");
      r.h(var2, "id");
      r.h(var7, "content");
      return new BlockedGroupChatListItem(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.text, var1.text)) {
            return false;
         } else if (!r.c(this.getId(), var1.getId())) {
            return false;
         } else if (this.textColor != var1.textColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.isRevealed != var1.isRevealed) {
            return false;
         } else {
            return r.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.text.hashCode();
      val var4: Int = this.getId().hashCode();
      val var5: Int = Integer.hashCode(this.textColor);
      val var7: Int = Integer.hashCode(this.backgroundColor);
      val var3: Int = Integer.hashCode(this.borderColor);
      var var1: Byte = this.isRevealed;
      if (this.isRevealed != 0) {
         var1 = 1;
      }

      return (((((var6 * 31 + var4) * 31 + var5) * 31 + var7) * 31 + var3) * 31 + var1) * 31 + this.content.hashCode();
   }

   public override fun toString(): String {
      val var7: java.lang.String = this.text;
      val var6: java.lang.String = this.getId();
      val var1: Int = this.textColor;
      val var2: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var4: Boolean = this.isRevealed;
      val var8: java.util.List = this.content;
      val var5: StringBuilder = new StringBuilder();
      var5.append("BlockedGroupChatListItem(text=");
      var5.append(var7);
      var5.append(", id=");
      var5.append(var6);
      var5.append(", textColor=");
      var5.append(var1);
      var5.append(", backgroundColor=");
      var5.append(var2);
      var5.append(", borderColor=");
      var5.append(var3);
      var5.append(", isRevealed=");
      var5.append(var4);
      var5.append(", content=");
      var5.append(var8);
      var5.append(")");
      return var5.toString();
   }
}
