package com.discord.chat.bridge.row

import Ja.f
import Q8.j
import Q8.m
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer

@f
public enum class LoadingActionType {
   LOAD_MORE_AFTER,
   LOAD_MORE_BEFORE   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private LoadingActionType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = j.a(m.k, new a());
   @JvmStatic
   public LoadingActionType.Companion Companion = new LoadingActionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<LoadingActionType> = $values();
      $VALUES = var0;
      $ENTRIES = Y8.a.a(var0);
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
