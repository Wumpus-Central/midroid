package com.discord.chat.bridge.polls

import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import r1.a
import sb.g
import z9.j
import z9.m

@g
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
      $ENTRIES = H9.a.a(var0);
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
