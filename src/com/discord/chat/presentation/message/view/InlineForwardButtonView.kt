package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function0

public class InlineForwardButtonView  public constructor(context: Context, attrs: AttributeSet? = null) : SimpleDraweeView {
   fun InlineForwardButtonView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this, ThemeManagerKt.getTheme().getRedesignButtonTertiaryBackground(), SizeUtilsKt.getDpToPx(16), null, 0, 12, null
      );
      val var3: Int = SizeUtilsKt.getDpToPx(7);
      this.setPadding(var3, var3, var3, var3);
      ColorUtilsKt.setTintColor(this, ThemeManagerKt.getTheme().getRedesignButtonTertiaryText());
      RippleUtilsKt.addRipple(this, true, SizeUtilsKt.getDpToPx(16));
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: Function0, var1: View) {
      kotlin.jvm.internal.r.h(var0, "$onClick");
      var0.invoke();
   }

   public fun configure(isEnabled: Boolean, onClick: () -> Unit, useOldIcon: Boolean) {
      kotlin.jvm.internal.r.h(var2, "onClick");
      this.setEnabled(var1);
      if (var3) {
         ReactAssetUtilsKt.setReactAsset(this, ReactAsset.ArrowAngleRightUpIcon);
      } else {
         ReactAssetUtilsKt.setReactAsset(this, ReactAsset.ChatArrowRightIcon);
      }

      val var4: Float;
      if (var1) {
         var4 = 1.0F;
      } else {
         var4 = 0.5F;
      }

      this.setAlpha(var4);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, new j0(var2), 1, null);
   }
}
