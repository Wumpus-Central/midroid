package com.discord.chat.bridge

public enum class MediaType(type: String) {
   Attachment("attachment"),
   Component("component"),
   Embed("embed")
   public final val type: String
   @JvmStatic
   private MediaType[] $VALUES = $values();

   init {
      this.type = var3;
   }
}
