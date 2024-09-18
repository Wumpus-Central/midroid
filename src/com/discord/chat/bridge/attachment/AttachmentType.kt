package com.discord.chat.bridge.attachment

import kotlin.enums.EnumEntries
import nh.a

public enum class AttachmentType(indexLabel: String) {
   Audio("audioAttachmentIndex"),
   File("fileAttachmentIndex"),
   Image("imageAttachmentIndex"),
   Video("videoAttachmentIndex")
   public final val indexLabel: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private AttachmentType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<AttachmentType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.indexLabel = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
