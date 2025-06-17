package com.discord.chat.bridge.row

import kb.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class BlockedGroupButton(action: BlockedGroupButtonAction) {
   public final val action: BlockedGroupButtonAction

   init {
      q.h(var1, "action");
      super();
      this.action = var1;
   }

   public operator fun component1(): BlockedGroupButtonAction {
      return this.action;
   }

   public fun copy(action: BlockedGroupButtonAction = var0.action): BlockedGroupButton {
      q.h(var1, "action");
      return new BlockedGroupButton(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButton) {
         return false;
      } else {
         return q.c(this.action, (var1 as BlockedGroupButton).action);
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode();
   }

   public override fun toString(): String {
      val var1: BlockedGroupButtonAction = this.action;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupButton(action=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButton> {
         return BlockedGroupButton.$serializer.INSTANCE;
      }
   }
}
