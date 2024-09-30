package com.discord.chat.bridge.embed

import cl.f
import kh.l
import kh.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import rh.a

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
