package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import kotlinx.serialization.KSerializer
import mb.g

@g
public data class LoadingRow(index: Int, changeType: ChangeType, button: LoadMoreButton, isLoading: Boolean) : Row() {
   public open val index: Int
   public open val changeType: ChangeType
   public final val button: LoadMoreButton
   public final val isLoading: Boolean

   init {
      this.index = var1;
      this.changeType = var2;
      this.button = var3;
      this.isLoading = var4;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): LoadMoreButton {
      return this.button;
   }

   public operator fun component4(): Boolean {
      return this.isLoading;
   }

   public fun copy(index: Int = var0.index, changeType: ChangeType = var0.changeType, button: LoadMoreButton = var0.button, isLoading: Boolean = var0.isLoading): LoadingRow {
      return new LoadingRow(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadingRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (!(this.button == var1.button)) {
            return false;
         } else {
            return this.isLoading == var1.isLoading;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((Integer.hashCode(this.index) * 31 + this.changeType.hashCode()) * 31 + this.button.hashCode()) * 31 + java.lang.Boolean.hashCode(this.isLoading);
   }

   public override fun toString(): String {
      val var1: Int = this.index;
      val var3: ChangeType = this.changeType;
      val var4: LoadMoreButton = this.button;
      val var2: Boolean = this.isLoading;
      val var5: StringBuilder = new StringBuilder();
      var5.append("LoadingRow(index=");
      var5.append(var1);
      var5.append(", changeType=");
      var5.append(var3);
      var5.append(", button=");
      var5.append(var4);
      var5.append(", isLoading=");
      var5.append(var2);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingRow> {
         return LoadingRow.$serializer.INSTANCE;
      }
   }
}
