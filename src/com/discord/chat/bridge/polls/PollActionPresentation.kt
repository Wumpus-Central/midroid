package com.discord.chat.bridge.polls

import Ca.l
import Ca.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import pc.m
import q2.a

@m
public enum class PollActionPresentation {
   BUTTON,
   SECONDARY_BUTTON,
   TEXT,
   TEXT_BUTTON   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private PollActionPresentation[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.e, new a());
   @JvmStatic
   public PollActionPresentation.Companion Companion = new PollActionPresentation.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollActionPresentation> = $values();
      $VALUES = var0;
      $ENTRIES = Ia.a.a(var0);
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
