package com.discord.chat.bridge.row

import dn.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import lj.l
import lj.o
import sj.a

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
