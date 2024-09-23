package com.discord.chat.bridge.embed

import fl.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import nh.l
import nh.o
import uh.a

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
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
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
