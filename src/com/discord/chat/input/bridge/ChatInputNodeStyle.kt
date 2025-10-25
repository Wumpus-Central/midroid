package com.discord.chat.input.bridge

import com.discord.span.utilities.common.BackgroundStyle
import kc.m
import kotlinx.serialization.KSerializer

@m
public data class ChatInputNodeStyle(fontSize: Int? = null, color: Int, backgroundStyle: BackgroundStyle?, fontWeight: ChatInputNodeFontWeight? = null) {
   public final val fontSize: Int?
   public final val color: Int
   public final val backgroundStyle: BackgroundStyle?
   public final val fontWeight: ChatInputNodeFontWeight?

   init {
      super();
      this.fontSize = var1;
      this.color = var2;
      this.backgroundStyle = var3;
      this.fontWeight = var4;
   }

   public operator fun component1(): Int? {
      return this.fontSize;
   }

   public operator fun component2(): Int {
      return this.color;
   }

   public operator fun component3(): BackgroundStyle? {
      return this.backgroundStyle;
   }

   public operator fun component4(): ChatInputNodeFontWeight? {
      return this.fontWeight;
   }

   public fun copy(
      fontSize: Int? = var0.fontSize,
      color: Int = var0.color,
      backgroundStyle: BackgroundStyle? = var0.backgroundStyle,
      fontWeight: ChatInputNodeFontWeight? = var0.fontWeight
   ): ChatInputNodeStyle {
      return new ChatInputNodeStyle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChatInputNodeStyle) {
         return false;
      } else {
         var1 = var1;
         if (!(this.fontSize == var1.fontSize)) {
            return false;
         } else if (this.color != var1.color) {
            return false;
         } else if (!(this.backgroundStyle == var1.backgroundStyle)) {
            return false;
         } else {
            return this.fontWeight === var1.fontWeight;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
      val var1: Int;
      if (this.fontSize == null) {
         var1 = 0;
      } else {
         var1 = this.fontSize.hashCode();
      }

      val var4: Int = Integer.hashCode(this.color);
      val var2: Int;
      if (this.backgroundStyle == null) {
         var2 = 0;
      } else {
         var2 = this.backgroundStyle.hashCode();
      }

      if (this.fontWeight != null) {
         var3 = this.fontWeight.hashCode();
      }

      return ((var1 * 31 + var4) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var2: Int = this.fontSize;
      val var1: Int = this.color;
      val var4: BackgroundStyle = this.backgroundStyle;
      val var5: ChatInputNodeFontWeight = this.fontWeight;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ChatInputNodeStyle(fontSize=");
      var3.append(var2);
      var3.append(", color=");
      var3.append(var1);
      var3.append(", backgroundStyle=");
      var3.append(var4);
      var3.append(", fontWeight=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ChatInputNodeStyle> {
         return ChatInputNodeStyle.$serializer.INSTANCE;
      }
   }
}
