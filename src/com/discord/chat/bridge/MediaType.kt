package com.discord.chat.bridge

import kotlin.enums.EnumEntries
import mh.a

public enum class MediaType(type: String) {
   Attachment("attachment"),
   Component("component"),
   Embed("embed")
   public final val type: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MediaType[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<MediaType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.type = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
