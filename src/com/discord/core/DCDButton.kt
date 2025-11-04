package com.discord.core

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.drawable.Drawable
import android.text.TextUtils.TruncateAt
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.view.View.OnTouchListener
import android.widget.FrameLayout
import android.widget.ProgressBar
import com.discord.core.databinding.DcdButtonBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.progress_dots.ProgressDots
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.google.android.material.button.MaterialButton
import kotlin.jvm.internal.SourceDebugExtension
import xi.k
import xi.k.b

@SourceDebugExtension(["SMAP\nDCDButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DCDButton.kt\ncom/discord/core/DCDButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n257#2,2:218\n257#2,2:220\n152#2,2:223\n1#3:222\n*S KotlinDebug\n*F\n+ 1 DCDButton.kt\ncom/discord/core/DCDButton\n*L\n84#1:218,2\n85#1:220,2\n164#1:223,2\n*E\n"])
public class DCDButton  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2) {
   private final val binding: DcdButtonBinding
   private final val button: MaterialButton
   private final val progress: ProgressBar
   private final val loadingDots: ProgressDots
   private final var text: CharSequence?

   fun DCDButton(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: DcdButtonBinding = DcdButtonBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      val var5: MaterialButton = var3.button;
      this.button = var5;
      val var4: ProgressBar = var3.progress;
      this.progress = var4;
      val var6: ProgressDots = var3.loadingDots;
      this.loadingDots = var6;
      var5.setStateListAnimator(null);
      var5.setMinimumHeight(var4.getHeight());
      var5.setMinHeight(var4.getHeight());
      var5.setMinimumWidth(var4.getWidth());
      var5.setMinWidth(var4.getWidth());
      var5.setInsetTop(0);
      var5.setInsetBottom(0);
      this.setTextSizeSp(14.0F);
      this.setDiscordFont(DiscordFont.PrimarySemibold);
      this.setButtonPadding();
   }

   private fun hasPadding(): Boolean {
      return this.getPaddingStart() > 0 || this.getPaddingEnd() > 0 || this.getPaddingTop() > 0 || this.getPaddingBottom() > 0;
   }

   private fun setButtonPadding() {
      if (this.hasPadding()) {
         this.button.setPaddingRelative(this.getPaddingStart(), this.getPaddingTop(), this.getPaddingEnd(), this.getPaddingBottom());
         this.setPadding(0, 0, 0, 0);
      }
   }

   private fun setProgressBarColor(colorStateList: ColorStateList) {
      this.progress.setIndeterminateTintList(var1);
   }

   public fun ellipsize(behavior: TruncateAt) {
      this.button.setEllipsize(var1);
   }

   protected open fun onFinishInflate() {
      super.onFinishInflate();
      this.setButtonPadding();
   }

   public open fun setBackgroundColor(colorInt: Int) {
      this.button.setBackgroundTintList(ColorStateList.valueOf(var1));
   }

   public fun setBackgroundColor(colorInt: Int?) {
      if (var1 != null) {
         this.setBackgroundColor(var1.intValue());
      }
   }

   public fun setBackgroundRectangle(color: Int, radiusPx: Int, strokeColor: Int? = null, strokeWidth: Int = 0) {
      this.setBackgroundColor(var1);
      val var5: MaterialButton = this.button;
      val var6: b = k.a();
      var6.o((float)var2);
      var5.setShapeAppearanceModel(var6.m());
      if (var3 != null) {
         this.button.setStrokeColor(ColorStateList.valueOf(var3));
         this.button.setStrokeWidth(var4);
      } else {
         this.button.setStrokeWidth(0);
      }
   }

   public fun setBorderColor(colorInt: Int?) {
      if (var1 != null) {
         this.button.setStrokeColor(ColorStateList.valueOf(var1.intValue()));
         this.button.setStrokeWidth(SizeUtilsKt.getDpToPx(1));
      } else {
         this.button.setStrokeColor(null);
         this.button.setStrokeWidth(0);
      }
   }

   public fun setCornerRadius(cornerRadius: Int) {
      this.button.setCornerRadius(var1);
   }

   public fun setDiscordFont(font: DiscordFont) {
      DiscordFontUtilsKt.setDiscordFont(this.button, var1);
   }

   public fun setDrawableBackground(drawable: Drawable) {
      this.button.setBackground(var1);
      this.button.setBackgroundTintList(null);
   }

   public open fun setEnabled(enabled: Boolean) {
      this.button.setEnabled(var1);
   }

   public fun setIcon(iconUrl: String, iconSize: Int) {
      ReactAssetUtilsKt.setReactIcon(this.button, var1, var2);
   }

   public fun setIconPadding(iconPadding: Int) {
      this.button.setIconPadding(var1);
   }

   public fun setLoading(isLoading: Boolean, useDots: Boolean = false) {
      val var6: Any;
      if (var1) {
         var6 = "";
      } else {
         var6 = this.text;
      }

      this.button.setText((java.lang.CharSequence)var6);
      this.setClickable(var1 xor true);
      var var3: Boolean;
      if (var1 && !var2) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      this.progress.setVisibility(var3);
      var var9: Boolean;
      if (var1 && var2) {
         var9 = 1;
      } else {
         var9 = 0;
      }

      if (var9) {
         var9 = 0;
      } else {
         var9 = 8;
      }

      this.loadingDots.setVisibility(var9);
   }

   public fun setMaxLines(maxLines: Int) {
      this.button.setMaxLines(var1);
   }

   public fun setOnClickButtonListener(onClickListener: OnClickListener?) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this.button, false, var1, 1, null);
   }

   public open fun setOnClickListener(l: OnClickListener?): Nothing {
      throw new IllegalAccessError("Use setButtonOnClickListener instead.");
   }

   public open fun setOnTouchListener(l: OnTouchListener?): Nothing {
      throw new IllegalAccessError("Use setButtonOnClickListener instead.");
   }

   public fun setText(text: CharSequence?) {
      this.button.setText(var1);
      this.text = var1;
   }

   public fun setTextColor(colorInt: Int?) {
      val var2: Int;
      if (var1 != null) {
         var2 = var1;
      } else {
         var2 = -1;
      }

      this.button.setTextColor(var2);
      this.button.setIconTint(ColorStateList.valueOf(var2));
      this.progress.setIndeterminateTintList(ColorStateList.valueOf(var2));
   }

   public fun setTextSizeSp(sp: Float) {
      this.button.setTextSize(2, var1);
   }
}
