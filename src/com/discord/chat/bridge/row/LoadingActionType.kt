package com.discord.chat.bridge.row

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class LoadingActionType {
   LOAD_MORE_AFTER,
   LOAD_MORE_BEFORE   @JvmStatic
   private LoadingActionType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public LoadingActionType.Companion Companion = new LoadingActionType.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<LoadingActionType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<LoadingActionType>;
      }
   }
}
