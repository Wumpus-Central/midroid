package com.discord.chat.bridge.polls

import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import lb.f
import s1.a
import s9.j
import s9.m

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
   private Lazy $cachedSerializer$delegate = j.b(m.k, new a());
   @JvmStatic
   public PollActionPresentation.Companion Companion = new PollActionPresentation.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollActionPresentation> = $values();
      $VALUES = var0;
      $ENTRIES = A9.a.a(var0);
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
