package com.discord.chat.bridge.row

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import mb.f

@f
public data class LoadingAction(type: LoadingActionType) {
   public final val type: LoadingActionType

   init {
      q.h(var1, "type");
      super();
      this.type = var1;
   }

   public operator fun component1(): LoadingActionType {
      return this.type;
   }

   public fun copy(type: LoadingActionType = var0.type): LoadingAction {
      q.h(var1, "type");
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
      val var1: LoadingActionType = this.type;
      val var2: StringBuilder = new StringBuilder();
      var2.append("LoadingAction(type=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingAction> {
         return LoadingAction.$serializer.INSTANCE;
      }
   }
}
