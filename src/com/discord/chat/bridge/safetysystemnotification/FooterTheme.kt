package com.discord.chat.bridge.safetysystemnotification

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class FooterTheme {
   DANGER,
   DEFAULT   @JvmStatic
   private FooterTheme[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public FooterTheme.Companion Companion = new FooterTheme.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<FooterTheme> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<FooterTheme>;
      }
   }
}
