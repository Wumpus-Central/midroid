package com.discord.chat.bridge.row

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class LoadingAction(type: LoadingActionType) {
   public final val type: LoadingActionType

   init {
      super();
      this.type = var1;
   }

   public operator fun component1(): LoadingActionType {
      return this.type;
   }

   public fun copy(type: LoadingActionType = var0.type): LoadingAction {
      return new LoadingAction(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingAction) {
         return false;
      } else {
         return this.type === (var1 as LoadingAction).type;
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode();
   }

   public override fun toString(): String {
      val var2: LoadingActionType = this.type;
      val var1: StringBuilder = new StringBuilder();
      var1.append("LoadingAction(type=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingAction> {
         return LoadingAction.$serializer.INSTANCE;
      }
   }
}
