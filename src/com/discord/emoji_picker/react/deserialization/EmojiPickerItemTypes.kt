package com.discord.emoji_picker.react.deserialization

import kotlin.enums.EnumEntries
import mh.a

internal enum class EmojiPickerItemTypes(unsupported: String = Companion, noop: Boolean = false) {
   EMOJI_ROW("Unsupported; don't send full emoji rows to native.", false, 2, null),
   EMOJI_ROW_NSFW("Unsupported; can't render NSFW rows in native.", false, 2, null),
   EMOJI_ROW_SLIM(null, false, 3, null),
   FOOTER_UPSELL(null, false, 3, null),
   NATIVE_SECTION(null, false, 3, null),
   PLACEHOLDER(null, true, 1, null),
   PREMIUM_INLINE_ROADBLOCK("Unsupported; feature included in native section.", false, 2, null),
   TITLE(null, false, 3, null)
   public final val noop: Boolean
   public final val unsupported: String
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private EmojiPickerItemTypes[] $VALUES;
   @JvmStatic
   public EmojiPickerItemTypes.Companion Companion = new EmojiPickerItemTypes.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<EmojiPickerItemTypes> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.unsupported = var3;
      this.noop = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun create(value: Int): EmojiPickerItemTypes {
         val var2: Array<EmojiPickerItemTypes> = EmojiPickerItemTypes.values();
         if (var1 >= 0 && var1 <= c.L(var2)) {
            return var2[var1];
         } else {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Unknown emoji picker item type: ");
            var3.append(var1);
            throw new IllegalArgumentException(var3.toString());
         }
      }
   }
}
