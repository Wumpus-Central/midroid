package com.discord.chat.presentation.uploadprogress

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.databinding.UploadProgressViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import j3.a
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

public class UploadProgressView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: UploadProgressViewBinding
   private final val interpolator: DecelerateInterpolator

   fun UploadProgressView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var4: UploadProgressViewBinding = UploadProgressViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(LayoutInflater.from(context), this)");
      this.binding = var4;
      this.interpolator = new DecelerateInterpolator();
      val var6: TextView = var4.progressText;
      r.g(var4.progressText, "it");
      SetTextSizeSpKt.setTextSizeSp(var6, 16.0F);
      var6.setTextColor(ThemeManagerKt.getTheme().getInteractiveActive());
      val var7: TextView = var4.progressSubtext;
      r.g(var4.progressSubtext, "it");
      SetTextSizeSpKt.setTextSizeSp(var7, 16.0F);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      val var8: View = var4.progressBar;
      var4.progressBar.setPivotX(0.0F);
      var8.setScaleX(0.0F);
      val var5: SimpleDraweeView = var4.progressCancel;
      r.g(var4.progressCancel, "it");
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.Close);
      ColorUtilsKt.setTintColor(var5, ThemeManagerKt.getTheme().getTextNormal());
      I18nUtilsKt.i18nContentDescription$default(var5, I18nMessage.CANCEL, null, 2, null);
      val var3: Int = SizeUtilsKt.getDpToPx(8);
      this.setPadding(var3, var3, var3, var3);
   }

   @JvmStatic
   fun `set$lambda$4`(var0: Function0, var1: View) {
      r.h(var0, "$onProgressCancel");
      var0.invoke();
   }

   public fun set(
      headerText: String,
      headerColor: Int,
      backgroundColor: Int,
      progressPercent: Int,
      progressBarColor: Int,
      progressTrackColor: Int,
      iconTintColor: Int,
      onProgressCancel: () -> Unit
   ) {
      r.h(var1, "headerText");
      r.h(var8, "onProgressCancel");
      this.setBackgroundColor(var3);
      var var12: SimpleDraweeView = this.binding.progressFileImage;
      r.g(this.binding.progressFileImage, "binding.progressFileImage");
      ReactAssetUtilsKt.setReactAsset(var12, ReactAsset.Upload);
      var12 = this.binding.progressFileImage;
      r.g(this.binding.progressFileImage, "binding.progressFileImage");
      ColorUtilsKt.setTintColor(var12, var7);
      this.binding.progressText.setText(var1);
      this.binding.progressText.setTextColor(var2);
      val var13: TextView = this.binding.progressText;
      r.g(this.binding.progressText, "binding.progressText");
      DiscordFontUtilsKt.setDiscordFont(var13, DiscordFont.PrimarySemibold);
      val var14: TextView = this.binding.progressSubtext;
      val var17: StringBuilder = new StringBuilder();
      var17.append("-- ");
      var17.append(var4);
      var17.append("%");
      var14.setText(var17.toString());
      this.binding.progressBg.setBackgroundColor(var6);
      this.binding.progressBar.setBackgroundColor(var5);
      val var9: Float = var4 / 100.0F;
      val var10: Long;
      if (this.binding.progressBar.getScaleX() < var4 / 100.0F) {
         var10 = 150L;
      } else {
         var10 = 0L;
      }

      this.binding.progressBar.animate().setInterpolator(this.interpolator).setDuration(var10).scaleX(var9).start();
      val var15: SimpleDraweeView = this.binding.progressCancel;
      r.g(this.binding.progressCancel, "binding.progressCancel");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var15, false, new a(var8), 1, null);
   }
}
