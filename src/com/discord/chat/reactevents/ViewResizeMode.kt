package com.discord.chat.reactevents

import jh.a
import kotlin.enums.EnumEntries

public enum class ViewResizeMode(value: String) {
   Cover("cover"),
   Fill("fill")
   public final val value: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ViewResizeMode[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<ViewResizeMode> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.value = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
