package com.discord.chat.bridge.attachment

public enum class AttachmentType(indexLabel: String) {
   Audio("audioAttachmentIndex"),
   File("fileAttachmentIndex"),
   Image("imageAttachmentIndex"),
   Video("videoAttachmentIndex")
   public final val indexLabel: String
   @JvmStatic
   private AttachmentType[] $VALUES = $values();

   init {
      this.indexLabel = var3;
   }
}
