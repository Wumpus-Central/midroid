package com.discord.chat.bridge.row

import Xa.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class BlockedGroupButtonAction(type: String, context: String) {
   public final val type: String
   public final val context: String

   init {
      q.h(var1, "type");
      q.h(var2, "context");
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
      q.h(var1, "type");
      q.h(var2, "context");
      return new BlockedGroupButtonAction(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupButtonAction) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.type, var1.type)) {
            return false;
         } else {
            return q.c(this.context, var1.context);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.type.hashCode() * 31 + this.context.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.type;
      val var2: java.lang.String = this.context;
      val var1: StringBuilder = new StringBuilder();
      var1.append("BlockedGroupButtonAction(type=");
      var1.append(var3);
      var1.append(", context=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupButtonAction> {
         return BlockedGroupButtonAction.$serializer.INSTANCE;
      }
   }
}
