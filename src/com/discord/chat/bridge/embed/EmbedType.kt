package com.discord.chat.bridge.embed

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

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
   private EmbedType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public EmbedType.Companion Companion = new EmbedType.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<EmbedType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<EmbedType>;
      }
   }
}
