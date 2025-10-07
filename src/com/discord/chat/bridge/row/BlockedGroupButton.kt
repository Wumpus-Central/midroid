package com.discord.chat.bridge.row

import kotlinx.serialization.KSerializer
import nb.g

@g
public data class BlockedGroupButton(action: BlockedGroupButtonAction) {
   public final val action: BlockedGroupButtonAction

   init {
      super();
      this.action = var1;
   }

   public operator fun component1(): BlockedGroupButtonAction {
      return this.action;
   }

   public fun copy(action: BlockedGroupButtonAction = var0.action): BlockedGroupButton {
      return new BlockedGroupButton(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButton) {
         return false;
      } else {
         return this.action == (var1 as BlockedGroupButton).action;
      }
   }

   public override fun hashCode(): Int {
      return this.action.hashCode();
   }

   public override fun toString(): String {
      val var2: BlockedGroupButtonAction = this.action;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupButton(action=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButton> {
         return BlockedGroupButton.$serializer.INSTANCE;
      }
   }
}
