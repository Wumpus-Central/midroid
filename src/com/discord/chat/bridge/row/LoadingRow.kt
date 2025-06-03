package com.discord.chat.bridge.row

import Ka.f
import com.discord.chat.bridge.ChangeType
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class LoadingRow(index: Int, changeType: ChangeType, button: LoadMoreButton, isLoading: Boolean) : Row {
   public open val index: Int
   public open val changeType: ChangeType
   public final val button: LoadMoreButton
   public final val isLoading: Boolean

   init {
      q.h(var2, "changeType");
      q.h(var3, "button");
      super(null);
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
      q.h(var2, "changeType");
      q.h(var3, "button");
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
         } else if (!q.c(this.button, var1.button)) {
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
      val var5: ChangeType = this.changeType;
      val var4: LoadMoreButton = this.button;
      val var2: Boolean = this.isLoading;
      val var3: StringBuilder = new StringBuilder();
      var3.append("LoadingRow(index=");
      var3.append(var1);
      var3.append(", changeType=");
      var3.append(var5);
      var3.append(", button=");
      var3.append(var4);
      var3.append(", isLoading=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadingRow> {
         return LoadingRow.$serializer.INSTANCE;
      }
   }
}
