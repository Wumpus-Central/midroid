package com.discord.chat.bridge.row

import kotlinx.serialization.KSerializer
import mb.g

@g
public data class LoadMoreButton(action: LoadingAction, text: String, backgroundColor: Int, cornerRadius: Int? = null, color: Int? = null) {
   public final val action: LoadingAction
   public final val text: String
   public final val backgroundColor: Int
   public final val cornerRadius: Int?
   public final val color: Int?

   init {
      super();
      this.action = var1;
      this.text = var2;
      this.backgroundColor = var3;
      this.cornerRadius = var4;
      this.color = var5;
   }

   public operator fun component1(): LoadingAction {
      return this.action;
   }

   public operator fun component2(): String {
      return this.text;
   }

   public operator fun component3(): Int {
      return this.backgroundColor;
   }

   public operator fun component4(): Int? {
      return this.cornerRadius;
   }

   public operator fun component5(): Int? {
      return this.color;
   }

   public fun copy(
      action: LoadingAction = var0.action,
      text: String = var0.text,
      backgroundColor: Int = var0.backgroundColor,
      cornerRadius: Int? = var0.cornerRadius,
      color: Int? = var0.color
   ): LoadMoreButton {
      return new LoadMoreButton(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LoadMoreButton) {
         return false;
      } else {
         var1 = var1;
         if (!(this.action == var1.action)) {
            return false;
         } else if (!(this.text == var1.text)) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!(this.cornerRadius == var1.cornerRadius)) {
            return false;
         } else {
            return this.color == var1.color;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.action.hashCode();
      val var5: Int = this.text.hashCode();
      val var3: Int = Integer.hashCode(this.backgroundColor);
      var var2: Int = 0;
      val var1: Int;
      if (this.cornerRadius == null) {
         var1 = 0;
      } else {
         var1 = this.cornerRadius.hashCode();
      }

      if (this.color != null) {
         var2 = this.color.hashCode();
      }

      return (((var4 * 31 + var5) * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: LoadingAction = this.action;
      val var6: java.lang.String = this.text;
      val var1: Int = this.backgroundColor;
      val var4: Int = this.cornerRadius;
      val var3: Int = this.color;
      val var5: StringBuilder = new StringBuilder();
      var5.append("LoadMoreButton(action=");
      var5.append(var2);
      var5.append(", text=");
      var5.append(var6);
      var5.append(", backgroundColor=");
      var5.append(var1);
      var5.append(", cornerRadius=");
      var5.append(var4);
      var5.append(", color=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<LoadMoreButton> {
         return LoadMoreButton.$serializer.INSTANCE;
      }
   }
}
