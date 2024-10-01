package com.discord.chat.presentation.textutils

import com.discord.fonts.DiscordFont
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.q

public data class LinkStyle(font: DiscordFont = DiscordFont.PrimaryNormal,
   linkColor: Int = ThemeManagerKt.getTheme().getTextLink(),
   backgroundStyle: LinkBackgroundStyle? = null,
   icon: ReactAsset? = null
) {
   public final val backgroundStyle: LinkBackgroundStyle?
   public final val font: DiscordFont
   public final val icon: ReactAsset?
   public final val linkColor: Int

   fun LinkStyle() {
      this(null, 0, null, null, 15, null);
   }

   init {
      q.h(var1, "font");
      super();
      this.font = var1;
      this.linkColor = var2;
      this.backgroundStyle = var3;
      this.icon = var4;
   }

   public operator fun component1(): DiscordFont {
      return this.font;
   }

   public operator fun component2(): Int {
      return this.linkColor;
   }

   public operator fun component3(): LinkBackgroundStyle? {
      return this.backgroundStyle;
   }

   public operator fun component4(): ReactAsset? {
      return this.icon;
   }

   public fun copy(
      font: DiscordFont = var0.font,
      linkColor: Int = var0.linkColor,
      backgroundStyle: LinkBackgroundStyle? = var0.backgroundStyle,
      icon: ReactAsset? = var0.icon
   ): LinkStyle {
      q.h(var1, "font");
      return new LinkStyle(var1, var2, var3, var4);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LinkStyle) {
         return false;
      } else {
         var1 = var1;
         if (this.font != var1.font) {
            return false;
         } else if (this.linkColor != var1.linkColor) {
            return false;
         } else if (!q.c(this.backgroundStyle, var1.backgroundStyle)) {
            return false;
         } else {
            return this.icon === var1.icon;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.font.hashCode();
      val var3: Int = Integer.hashCode(this.linkColor);
      var var2: Int = 0;
      val var1: Int;
      if (this.backgroundStyle == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundStyle.hashCode();
      }

      if (this.icon != null) {
         var2 = this.icon.hashCode();
      }

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: DiscordFont = this.font;
      val var1: Int = this.linkColor;
      val var5: LinkBackgroundStyle = this.backgroundStyle;
      val var3: ReactAsset = this.icon;
      val var4: StringBuilder = new StringBuilder();
      var4.append("LinkStyle(font=");
      var4.append(var2);
      var4.append(", linkColor=");
      var4.append(var1);
      var4.append(", backgroundStyle=");
      var4.append(var5);
      var4.append(", icon=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }
}
