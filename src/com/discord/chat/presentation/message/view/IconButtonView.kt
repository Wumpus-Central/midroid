package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import com.discord.chat.databinding.IconButtonViewBinding
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.functions.Function0

public class IconButtonView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: IconButtonViewBinding

   fun IconButtonView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var4: IconButtonViewBinding = IconButtonViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      val var3: FrameLayout = var4.iconContainer;
      ViewClippingUtilsKt.clipToRoundedRectangle(var3, SizeUtilsKt.getDpToPx(8));
      (var4.iconButton.getHierarchy() as GenericDraweeHierarchy).w(0);
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: Function0, var1: View) {
      var0.invoke();
   }

   public fun configure(icon: ReactAsset, alt: I18nMessage, onClick: () -> Unit) {
      val var4: SimpleDraweeView = this.binding.iconButton;
      ReactAssetUtilsKt.setReactAsset(var4, var1);
      I18nUtilsKt.i18nContentDescription$default(var4, var2, null, 2, null);
      val var5: FrameLayout = this.binding.iconContainer;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, new l1(var3), 1, null);
   }
}
