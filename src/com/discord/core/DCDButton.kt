package com.discord.core

import android.content.Context
import android.content.res.ColorStateList
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
import kotlin.jvm.internal.q
import pc.k
import pc.k.b

public class DCDButton  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout {
   private final val binding: DcdButtonBinding
   private final val button: MaterialButton
   private final val loadingDots: ProgressDots
   private final val progress: ProgressBar
   private final var text: CharSequence?

   fun DCDButton(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var3: DcdButtonBinding = DcdButtonBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var3, "inflate(...)");
      this.binding = var3;
      val var4: MaterialButton = var3.button;
      q.g(var3.button, "button");
      this.button = var4;
      val var5: ProgressBar = var3.progress;
      q.g(var3.progress, "progress");
      this.progress = var5;
      val var6: ProgressDots = var3.loadingDots;
      q.g(var3.loadingDots, "loadingDots");
      this.loadingDots = var6;
      var4.setStateListAnimator(null);
      var4.setMinimumHeight(var5.getHeight());
      var4.setMinHeight(var5.getHeight());
      var4.setMinimumWidth(var5.getWidth());
      var4.setMinWidth(var5.getWidth());
      var4.setInsetTop(0);
      var4.setInsetBottom(0);
      this.setTextSizeSp(14.0F);
      this.setDiscordFont(DiscordFont.PrimarySemibold);
      this.setButtonPadding();
   }

   private fun hasPadding(): Boolean {
      val var1: Boolean;
      if (this.getPaddingStart() <= 0 && this.getPaddingEnd() <= 0 && this.getPaddingTop() <= 0 && this.getPaddingBottom() <= 0) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
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
      q.h(var1, "behavior");
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
      val var3: Unit;
      if (var1 != null) {
         this.button.setStrokeColor(ColorStateList.valueOf(var1.intValue()));
         this.button.setStrokeWidth(SizeUtilsKt.getDpToPx(1));
         var3 = Unit.a;
      } else {
         var3 = null;
      }

      if (var3 == null) {
         this.button.setStrokeColor(null);
         this.button.setStrokeWidth(0);
      }
   }

   public fun setCornerRadius(cornerRadius: Int) {
      this.button.setCornerRadius(var1);
   }

   public fun setDiscordFont(font: DiscordFont) {
      q.h(var1, "font");
      DiscordFontUtilsKt.setDiscordFont(this.button, var1);
   }

   public open fun setEnabled(enabled: Boolean) {
      this.button.setEnabled(var1);
   }

   public fun setIcon(iconUrl: String, iconSize: Int) {
      q.h(var1, "iconUrl");
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
