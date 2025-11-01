package com.discord.chat.bridge.row

import kotlinx.serialization.KSerializer
import xu.m

@m
public data class BlockedGroupButtonAction(type: String, context: String) {
   public final val type: String
   public final val context: String

   init {
      super();
      this.type = var1;
      this.context = var2;
   }

   public operator fun component1(): String {
      return this.type;
   }

   public operator fun component2(): String {
      return this.context;
   }

   public fun copy(type: String = var0.type, context: String = var0.context): BlockedGroupButtonAction {
      return new BlockedGroupButtonAction(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButtonAction) {
         return false;
      } else {
         var1 = var1;
         if (!(this.type == var1.type)) {
            return false;
         } else {
            return this.context == var1.context;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.context.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.type;
      val var1: java.lang.String = this.context;
      val var2: StringBuilder = new StringBuilder();
      var2.append("BlockedGroupButtonAction(type=");
      var2.append(var3);
      var2.append(", context=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButtonAction> {
         return BlockedGroupButtonAction.$serializer.INSTANCE;
      }
   }
}
