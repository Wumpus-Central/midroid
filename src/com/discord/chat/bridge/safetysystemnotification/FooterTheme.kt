package com.discord.chat.bridge.safetysystemnotification

import fl.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import nh.l
import nh.o
import uh.a

@f
public enum class FooterTheme {
   DANGER,
   DEFAULT   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private FooterTheme[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public FooterTheme.Companion Companion = new FooterTheme.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<FooterTheme> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<FooterTheme> {
         return this.get$cachedSerializer();
      }
   }
}
