package com.discord.chat.presentation.message.view

import kotlin.enums.EnumEntries

public enum class VisualPlaceholderState {
   ERROR,
   LOADING,
   NOT_FOUND   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private VisualPlaceholderState[] $VALUES;

   @JvmStatic
   fun {
      val var0: Array<VisualPlaceholderState> = $values();
      $VALUES = var0;
      $ENTRIES = m8.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }
}
