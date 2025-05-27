package com.discord.chat.bridge.polls

import Za.f
import g9.j
import g9.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import t1.a

@f
public enum class PollActionPresentation {
   BUTTON,
   SECONDARY_BUTTON,
   TEXT,
   TEXT_BUTTON   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private PollActionPresentation[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.a(m.k, new a());
   @JvmStatic
   public PollActionPresentation.Companion Companion = new PollActionPresentation.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollActionPresentation> = $values();
      $VALUES = var0;
      $ENTRIES = o9.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<PollActionPresentation> {
         return this.get$cachedSerializer();
      }
   }
}
