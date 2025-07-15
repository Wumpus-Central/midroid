package com.discord.chat.bridge.embed

import kb.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import r1.e
import r9.j
import r9.m
import z9.a

@f
public enum class EmbedType {
   ApplicationNews,
   Article,
   File,
   GIFV,
   HTML,
   Image,
   Link,
   PostPreview,
   Rich,
   SafetyPolicyNotice,
   SafetySystemNotification,
   Text,
   Tweet,
   Unknown,
   Video   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private EmbedType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.b(m.k, new e());
   @JvmStatic
   public EmbedType.Companion Companion = new EmbedType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<EmbedType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<EmbedType> {
         return this.get$cachedSerializer();
      }
   }
}
