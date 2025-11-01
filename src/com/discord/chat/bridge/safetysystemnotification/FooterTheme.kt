package com.discord.chat.bridge.safetysystemnotification

import ht.l
import ht.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import xu.m

@m
public enum class FooterTheme {
   DANGER,
   DEFAULT   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private FooterTheme[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.e, new w7.a());
   @JvmStatic
   public FooterTheme.Companion Companion = new FooterTheme.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<FooterTheme> = $values();
      $VALUES = var0;
      $ENTRIES = pt.a.a(var0);
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
