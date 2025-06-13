package com.discord.chat.bridge.safetysystemnotification

import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import mb.f
import t1.a
import t9.j
import t9.m

@f
public enum class FooterTheme {
   DANGER,
   DEFAULT   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private FooterTheme[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.b(m.k, new a());
   @JvmStatic
   public FooterTheme.Companion Companion = new FooterTheme.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<FooterTheme> = $values();
      $VALUES = var0;
      $ENTRIES = B9.a.a(var0);
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
