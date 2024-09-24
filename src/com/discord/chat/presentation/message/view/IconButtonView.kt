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

public class IconButtonView  public constructor(context: Context, attributeSet: AttributeSet? = null) : FrameLayout {
   private final val binding: IconButtonViewBinding

   fun IconButtonView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: IconButtonViewBinding = IconButtonViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      val var4: FrameLayout = var3.iconContainer;
      kotlin.jvm.internal.q.g(var3.iconContainer, "iconContainer");
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(8));
      (var3.iconButton.getHierarchy() as GenericDraweeHierarchy).x(0);
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: Function0, var1: View) {
      kotlin.jvm.internal.q.h(var0, "$onClick");
      var0.invoke();
   }

   public fun configure(icon: ReactAsset, alt: I18nMessage, onClick: () -> Unit) {
      kotlin.jvm.internal.q.h(var1, "icon");
      kotlin.jvm.internal.q.h(var2, "alt");
      kotlin.jvm.internal.q.h(var3, "onClick");
      val var4: SimpleDraweeView = this.binding.iconButton;
      kotlin.jvm.internal.q.e(this.binding.iconButton);
      ReactAssetUtilsKt.setReactAsset(var4, var1);
      I18nUtilsKt.i18nContentDescription$default(var4, var2, null, 2, null);
      val var5: FrameLayout = this.binding.iconContainer;
      kotlin.jvm.internal.q.g(this.binding.iconContainer, "iconContainer");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var5, false, new h0(var3), 1, null);
   }
}
