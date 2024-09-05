package com.discord.chat.bridge.row

import ck.a
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import nn.f
import vj.l
import vj.o

@f
public enum class LoadingActionType {
   LOAD_MORE_AFTER,
   LOAD_MORE_BEFORE   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private LoadingActionType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public LoadingActionType.Companion Companion = new LoadingActionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<LoadingActionType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingActionType> {
         return this.get$cachedSerializer();
      }
   }
}
