package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.chat.databinding.RoleDotViewBinding
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt

public class RoleDotView(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: RoleDotViewBinding

   init {
      val var3: RoleDotViewBinding = RoleDotViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
   }

   public fun configure(roleColors: RoleColors, spSize: Int = 20) {
      val var4: FrameLayout = this.binding.roleDotViewBackground;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         var4, ThemeManagerKt.getTheme().getBackgroundSecondaryAlt(), SizeUtilsKt.getDpToPx(4), null, 0, 12, null
      );
      val var3: Int = ColorUtilsKt.getColorCompat(this, ThemeManagerKt.getTheme().getColorRes(R.color.black, R.color.white));
      val var5: Context = this.getContext();
      val var6: RoleDotDrawable = new RoleDotDrawable(var5, var3, var2);
      var6.setColors(var1);
      this.binding.roleDotViewDot.setImageDrawable(var6);
   }
}
