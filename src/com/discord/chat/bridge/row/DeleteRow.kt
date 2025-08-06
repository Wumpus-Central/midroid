package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import ub.g

@g
public data class DeleteRow(index: Int, changeType: ChangeType = ChangeType.DELETE) : Row {
   public open val index: Int
   public open val changeType: ChangeType

   init {
      r.h(var2, "changeType");
      super(null);
      this.index = var1;
      this.changeType = var2;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public fun copy(index: Int = var0.index, changeType: ChangeType = var0.changeType): DeleteRow {
      r.h(var2, "changeType");
      return new DeleteRow(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeleteRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else {
            return this.changeType === var1.changeType;
         }
      }
   }

   public override fun hashCode(): Int {
      return Integer.hashCode(this.index) * 31 + this.changeType.hashCode();
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var3: ChangeType = this.changeType;
      val var2: StringBuilder = new StringBuilder();
      var2.append("DeleteRow(index=");
      var2.append(var1);
      var2.append(", changeType=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<DeleteRow> {
         return DeleteRow.$serializer.INSTANCE;
      }
   }
}
