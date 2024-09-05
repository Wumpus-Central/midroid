package com.discord.chat.presentation.list.item

import kotlin.jvm.internal.q

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
      q.h(var1, "text");
      q.h(var2, "id");
      q.h(var7, "content");
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
      return this.id;
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
      id: String = var0.id,
      textColor: Int = var0.textColor,
      backgroundColor: Int = var0.backgroundColor,
      borderColor: Int = var0.borderColor,
      isRevealed: Boolean = var0.isRevealed,
      content: List<ChatListItem> = var0.content
   ): BlockedGroupChatListItem {
      q.h(var1, "text");
      q.h(var2, "id");
      q.h(var7, "content");
      return new BlockedGroupChatListItem(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupChatListItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.text, var1.text)) {
            return false;
         } else if (!q.c(this.id, var1.id)) {
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
            return q.c(this.content, var1.content);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((this.text.hashCode() * 31 + this.id.hashCode()) * 31 + Integer.hashCode(this.textColor)) * 31
                                    + Integer.hashCode(this.backgroundColor)
                              )
                              * 31
                           + Integer.hashCode(this.borderColor)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isRevealed)
            )
            * 31
         + this.content.hashCode();
   }

   public override fun toString(): String {
      val var6: java.lang.String = this.text;
      val var5: java.lang.String = this.id;
      val var2: Int = this.textColor;
      val var1: Int = this.backgroundColor;
      val var3: Int = this.borderColor;
      val var4: Boolean = this.isRevealed;
      val var7: java.util.List = this.content;
      val var8: StringBuilder = new StringBuilder();
      var8.append("BlockedGroupChatListItem(text=");
      var8.append(var6);
      var8.append(", id=");
      var8.append(var5);
      var8.append(", textColor=");
      var8.append(var2);
      var8.append(", backgroundColor=");
      var8.append(var1);
      var8.append(", borderColor=");
      var8.append(var3);
      var8.append(", isRevealed=");
      var8.append(var4);
      var8.append(", content=");
      var8.append(var7);
      var8.append(")");
      return var8.toString();
   }
}
