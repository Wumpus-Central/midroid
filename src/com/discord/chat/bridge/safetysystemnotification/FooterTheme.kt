package com.discord.chat.bridge.safetysystemnotification

import Xa.f
import e1.a
import e9.j
import e9.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer

@f
public enum class FooterTheme {
   DANGER,
   DEFAULT   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private FooterTheme[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.a(m.k, new a());
   @JvmStatic
   public FooterTheme.Companion Companion = new FooterTheme.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<FooterTheme> = $values();
      $VALUES = var0;
      $ENTRIES = m9.a.a(var0);
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
