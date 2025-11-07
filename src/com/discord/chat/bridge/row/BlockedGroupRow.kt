package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class BlockedGroupRow(index: Int,
   changeType: ChangeType,
   color: Int,
   borderColor: Int,
   backgroundColor: Int,
   text: String,
   revealed: Boolean,
   button: BlockedGroupButton,
   content: List<BlockedGroupContent>? = null
) : Row() {
   public open val index: Int
   public open val changeType: ChangeType
   public final val color: Int
   public final val borderColor: Int
   public final val backgroundColor: Int
   public final val text: String
   public final val revealed: Boolean
   public final val button: BlockedGroupButton
   public final val content: List<BlockedGroupContent>?

   init {
      this.index = var1;
      this.changeType = var2;
      this.color = var3;
      this.borderColor = var4;
      this.backgroundColor = var5;
      this.text = var6;
      this.revealed = var7;
      this.button = var8;
      this.content = var9;
   }

   public operator fun component1(): Int {
      return this.index;
   }

   public operator fun component2(): ChangeType {
      return this.changeType;
   }

   public operator fun component3(): Int {
      return this.color;
   }

   public operator fun component4(): Int {
      return this.borderColor;
   }

   public operator fun component5(): Int {
      return this.backgroundColor;
   }

   public operator fun component6(): String {
      return this.text;
   }

   public operator fun component7(): Boolean {
      return this.revealed;
   }

   public operator fun component8(): BlockedGroupButton {
      return this.button;
   }

   public operator fun component9(): List<BlockedGroupContent>? {
      return this.content;
   }

   public fun copy(
      index: Int = var0.index,
      changeType: ChangeType = var0.changeType,
      color: Int = var0.color,
      borderColor: Int = var0.borderColor,
      backgroundColor: Int = var0.backgroundColor,
      text: String = var0.text,
      revealed: Boolean = var0.revealed,
      button: BlockedGroupButton = var0.button,
      content: List<BlockedGroupContent>? = var0.content
   ): BlockedGroupRow {
      return new BlockedGroupRow(var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is BlockedGroupRow) {
         return false;
      } else {
         var1 = var1;
         if (this.index != var1.index) {
            return false;
         } else if (this.changeType != var1.changeType) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (this.borderColor != var1.borderColor) {
            return false;
         } else if (this.backgroundColor != var1.backgroundColor) {
            return false;
         } else if (!(this.text == var1.text)) {
            return false;
         } else if (this.revealed != var1.revealed) {
            return false;
         } else if (!(this.button == var1.button)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = Integer.hashCode(this.index);
      val var3: Int = this.changeType.hashCode();
      val var9: Int = Integer.hashCode(this.color);
      val var6: Int = Integer.hashCode(this.borderColor);
      val var4: Int = Integer.hashCode(this.backgroundColor);
      val var8: Int = this.text.hashCode();
      val var2: Int = java.lang.Boolean.hashCode(this.revealed);
      val var5: Int = this.button.hashCode();
      val var1: Int;
      if (this.content == null) {
         var1 = 0;
      } else {
         var1 = this.content.hashCode();
      }

      return (((((((var7 * 31 + var3) * 31 + var9) * 31 + var6) * 31 + var4) * 31 + var8) * 31 + var2) * 31 + var5) * 31 + var1;
   }

   public override fun toString(): String {
      val var3: Int = this.index;
      val var8: ChangeType = this.changeType;
      val var1: Int = this.color;
      val var4: Int = this.borderColor;
      val var2: Int = this.backgroundColor;
      val var6: java.lang.String = this.text;
      val var5: Boolean = this.revealed;
      val var7: BlockedGroupButton = this.button;
      val var10: java.util.List = this.content;
      val var9: StringBuilder = new StringBuilder();
      var9.append("BlockedGroupRow(index=");
      var9.append(var3);
      var9.append(", changeType=");
      var9.append(var8);
      var9.append(", color=");
      var9.append(var1);
      var9.append(", borderColor=");
      var9.append(var4);
      var9.append(", backgroundColor=");
      var9.append(var2);
      var9.append(", text=");
      var9.append(var6);
      var9.append(", revealed=");
      var9.append(var5);
      var9.append(", button=");
      var9.append(var7);
      var9.append(", content=");
      var9.append(var10);
      var9.append(")");
      return var9.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<BlockedGroupRow> {
         return BlockedGroupRow.$serializer.INSTANCE;
      }
   }
}
