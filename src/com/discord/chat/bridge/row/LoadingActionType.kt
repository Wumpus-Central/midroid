package com.discord.chat.bridge.row

import kc.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import xa.l
import xa.o

@m
public enum class LoadingActionType {
   LOAD_MORE_AFTER,
   LOAD_MORE_BEFORE   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private LoadingActionType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.e, new a());
   @JvmStatic
   public LoadingActionType.Companion Companion = new LoadingActionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<LoadingActionType> = $values();
      $VALUES = var0;
      $ENTRIES = Da.a.a(var0);
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
