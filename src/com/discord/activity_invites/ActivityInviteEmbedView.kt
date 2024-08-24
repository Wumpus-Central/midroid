package com.discord.activity_invites

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.activity_invites.databinding.ActivityInviteEmbedViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.view.SimpleDraweeView
import com.facebook.imagepipeline.request.ImageRequestBuilder
import com.facebook.imagepipeline.request.Postprocessor
import e4.f
import eh.l
import eh.o
import java.util.ArrayList
import kotlin.jvm.internal.r
import l4.c

public class ActivityInviteEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ActivityInviteEmbedViewBinding

   private final val grayscalePostprocessor: Postprocessor
      private final get() {
         return this.grayscalePostprocessor$delegate.getValue() as Postprocessor;
      }


   fun ActivityInviteEmbedView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActivityInviteEmbedView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var5: ActivityInviteEmbedViewBinding = ActivityInviteEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      this.grayscalePostprocessor$delegate = l.a(o.l, <unrepresentable>.INSTANCE);
      this.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
      val var6: SimpleDraweeView = var5.startImage;
      r.g(var5.startImage, "binding.startImage");
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(8));
      val var7: TextView = var5.header;
      var5.header.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      r.g(var7, "_init_$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimaryBold);
      var var4: TextView = var5.bottomEndLabel;
      var5.bottomEndLabel.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var4, "_init_$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      val var8: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var5.heroText;
      var5.heroText.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      r.g(var4, "_init_$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var4, var8);
      val var9: TextView = var5.subtext;
      var5.subtext.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      r.g(var9, "_init_$lambda$3");
      DiscordFontUtilsKt.setDiscordFont(var9, DiscordFont.PrimaryMedium);
      var5.button.setBackgroundColor(ColorUtilsKt.getColorCompat(this, color.green_360));
      var5.bgGradient.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundSecondary()));
   }

   private fun buildImageConfig(imageUri: String?, listening: Boolean, joinable: Boolean): com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig {
      val var4: Any;
      if (var1 == null) {
         var4 = ActivityInviteEmbedView.ImageConfig.None.INSTANCE;
      } else if (var2 && var3) {
         var4 = new ActivityInviteEmbedView.ImageConfig.Start(var1);
      } else if (var2 && !var3) {
         var4 = new ActivityInviteEmbedView.ImageConfig.End(var1, false, false);
      } else if (!var2 && var3) {
         var4 = new ActivityInviteEmbedView.ImageConfig.End(var1, true, false);
      } else {
         if (var2 || var3) {
            throw new IllegalStateException("this can never happen.".toString());
         }

         var4 = new ActivityInviteEmbedView.ImageConfig.End(var1, true, true);
      }

      return (ActivityInviteEmbedView.ImageConfig)var4;
   }

   private fun configureImage(imageConfig: com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig) {
      if (var1 is ActivityInviteEmbedView.ImageConfig.None) {
         val var4: View = this.binding.bgGradient;
         r.g(this.binding.bgGradient, "binding.bgGradient");
         var4.setVisibility(8);
         val var5: SimpleDraweeView = this.binding.endImage;
         r.g(this.binding.endImage, "binding.endImage");
         var5.setVisibility(8);
         val var6: SimpleDraweeView = this.binding.startImage;
         r.g(this.binding.startImage, "binding.startImage");
         var6.setVisibility(8);
      } else if (var1 is ActivityInviteEmbedView.ImageConfig.Start) {
         val var3: View = this.binding.bgGradient;
         r.g(this.binding.bgGradient, "binding.bgGradient");
         var3.setVisibility(8);
         val var8: SimpleDraweeView = this.binding.startImage;
         r.g(this.binding.startImage, "binding.startImage");
         var8.setVisibility(0);
         val var9: SimpleDraweeView = this.binding.endImage;
         r.g(this.binding.endImage, "binding.endImage");
         var9.setVisibility(8);
         this.binding.startImage.setImageURI((var1 as ActivityInviteEmbedView.ImageConfig.Start).getUri());
      } else if (var1 is ActivityInviteEmbedView.ImageConfig.End) {
         val var10: View = this.binding.bgGradient;
         r.g(this.binding.bgGradient, "binding.bgGradient");
         val var7: ActivityInviteEmbedView.ImageConfig.End = var1 as ActivityInviteEmbedView.ImageConfig.End;
         val var2: Byte;
         if ((var1 as ActivityInviteEmbedView.ImageConfig.End).getFullSize()) {
            var2 = 0;
         } else {
            var2 = 8;
         }

         var10.setVisibility(var2);
         val var11: SimpleDraweeView = this.binding.startImage;
         r.g(this.binding.startImage, "binding.startImage");
         var11.setVisibility(8);
         val var12: SimpleDraweeView = this.binding.endImage;
         r.g(this.binding.endImage, "binding.endImage");
         var12.setVisibility(0);
         this.setEndImage(var7.getUri(), var7.getFullSize(), var7.getGrayscale());
      }
   }

   private fun setAvatars(avatars: List<String?>?) {
      var var3: java.util.List = var1;
      if (var1 == null) {
         var3 = h.i();
      }

      val var5: OverlappingCirclesView = this.binding.avatars;
      r.g(this.binding.avatars, "binding.avatars");
      val var2: Byte;
      if (var3.isEmpty() xor true) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var5.setVisibility(var2);
      val var4: OverlappingCirclesView = this.binding.avatars;
      val var6: ArrayList = new ArrayList(h.t(var3, 10));
      val var7: java.util.Iterator = var3.iterator();

      while (var7.hasNext()) {
         var6.add(new OverlappingItem(var7.next() as java.lang.String));
      }

      var4.setItems(var6);
   }

   private fun setBottomEndLabel(text: CharSequence?, color: Int) {
      val var3: TextView = this.binding.bottomEndLabel;
      r.g(this.binding.bottomEndLabel, "binding.bottomEndLabel");
      ViewUtilsKt.setOptionalText(var3, var1);
      this.binding.bottomEndLabel.setTextColor(var2);
   }

   private fun setButtonText(buttonText: String?) {
      this.binding.button.setText(var1);
   }

   private fun setEndImage(uri: String, fullSize: Boolean, grayscale: Boolean) {
      if (var2) {
         val var4: SimpleDraweeView = this.binding.endImage;
         r.g(this.binding.endImage, "binding.endImage");
         val var5: android.view.ViewGroup.LayoutParams = var4.getLayoutParams();
         if (var5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
         }

         val var8: ConstraintLayout.LayoutParams = var5 as ConstraintLayout.LayoutParams;
         (var5 as ConstraintLayout.LayoutParams).width = 0;
         var8.height = 0;
         var8.topMargin = 0;
         var8.bottomMargin = 0;
         var8.setMarginEnd(0);
         var4.setLayoutParams(var8);
      } else {
         val var7: SimpleDraweeView = this.binding.endImage;
         r.g(this.binding.endImage, "binding.endImage");
         val var9: android.view.ViewGroup.LayoutParams = var7.getLayoutParams();
         if (var9 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
         }

         val var10: ConstraintLayout.LayoutParams = var9 as ConstraintLayout.LayoutParams;
         (var9 as ConstraintLayout.LayoutParams).width = SizeUtilsKt.getDpToPx(64);
         var10.height = SizeUtilsKt.getDpToPx(64);
         var10.topMargin = SizeUtilsKt.getDpToPx(16);
         var10.bottomMargin = SizeUtilsKt.getDpToPx(16);
         var10.setMarginEnd(SizeUtilsKt.getDpToPx(8));
         var7.setLayoutParams(var10);
      }

      val var6: ImageRequestBuilder = ImageRequestBuilder.s(f.o(var1));
      if (var3) {
         var6.A(this.getGrayscalePostprocessor());
      }

      this.binding.endImage.setController((c.g().D(var6.a()) as PipelineDraweeControllerBuilder).c());
   }

   private fun setHeaderText(headerText: CharSequence?) {
      val var2: TextView = this.binding.header;
      r.g(this.binding.header, "binding.header");
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   private fun setHeroText(text: CharSequence?) {
      val var2: TextView = this.binding.heroText;
      r.g(this.binding.heroText, "binding.heroText");
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   private fun setSubtext(text: CharSequence?) {
      val var2: TextView = this.binding.subtext;
      r.g(this.binding.subtext, "binding.subtext");
      ViewUtilsKt.setOptionalText(var2, var1);
   }

   public fun setActivityInviteEmbed(
      imageUri: String?,
      isListening: Boolean,
      headerText: String,
      partyStatus: String,
      avatarsToRender: List<String?>?,
      maxPartySize: Int,
      name: String?,
      subtext: String?,
      joinable: Boolean,
      ctaText: String,
      onButtonClickListener: OnClickListener
   ) {
      r.h(var3, "headerText");
      r.h(var4, "partyStatus");
      r.h(var10, "ctaText");
      r.h(var11, "onButtonClickListener");
      this.setHeaderText(var3);
      this.setButtonText(var10);
      this.setAvatars(var5);
      this.setSubtext(var8);
      val var12: ActivityInviteEmbedView.ImageConfig = this.buildImageConfig(var1, var2, var9);
      var var15: Int = 1;
      if (var9) {
         this.setEnabled(true);
         this.setHeroText(var7);
         val var13: TextView = this.binding.bottomEndLabel;
         r.g(this.binding.bottomEndLabel, "binding.bottomEndLabel");
         var13.setVisibility(8);
         this.binding.button.setOnClickButtonListener(var11);
      } else {
         this.setEnabled(false);
         this.setHeroText(var4);
         if (var12 !is ActivityInviteEmbedView.ImageConfig.End
            || !(var12 as ActivityInviteEmbedView.ImageConfig.End).getFullSize()
            || !(var12 as ActivityInviteEmbedView.ImageConfig.End).getGrayscale()) {
            var15 = 0;
         }

         if (var15) {
            var15 = -1;
         } else {
            var15 = ThemeManagerKt.getTheme().getHeaderPrimary();
         }

         this.setBottomEndLabel(var7, var15);
         this.binding.button.setOnClickButtonListener(null);
      }

      this.configureImage(var12);
   }

   public open fun setEnabled(enabled: Boolean) {
      super.setEnabled(var1);
      this.binding.button.setClickable(var1);
      val var2: Float;
      if (var1) {
         var2 = 1.0F;
      } else {
         var2 = 0.5F;
      }

      this.binding.button.setAlpha(var2);
   }

   private sealed class ImageConfig protected constructor() {
      public data class End(uri: String, fullSize: Boolean, grayscale: Boolean) : ActivityInviteEmbedView.ImageConfig {
         public final val fullSize: Boolean
         public final val grayscale: Boolean
         public final val uri: String

         init {
            r.h(var1, "uri");
            super(null);
            this.uri = var1;
            this.fullSize = var2;
            this.grayscale = var3;
         }

         public operator fun component1(): String {
            return this.uri;
         }

         public operator fun component2(): Boolean {
            return this.fullSize;
         }

         public operator fun component3(): Boolean {
            return this.grayscale;
         }

         public fun copy(uri: String = var0.uri, fullSize: Boolean = var0.fullSize, grayscale: Boolean = var0.grayscale): com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig.End {
            r.h(var1, "uri");
            return new ActivityInviteEmbedView.ImageConfig.End(var1, var2, var3);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ActivityInviteEmbedView.ImageConfig.End) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.uri, var1.uri)) {
                  return false;
               } else if (this.fullSize != var1.fullSize) {
                  return false;
               } else {
                  return this.grayscale == var1.grayscale;
               }
            }
         }

         public override fun hashCode(): Int {
            val var4: Int = this.uri.hashCode();
            var var2: Byte = 1;
            var var1: Byte = this.fullSize;
            if (this.fullSize != 0) {
               var1 = 1;
            }

            if (this.grayscale == 0) {
               var2 = this.grayscale;
            }

            return (var4 * 31 + var1) * 31 + var2;
         }

         public override fun toString(): String {
            val var4: java.lang.String = this.uri;
            val var1: Boolean = this.fullSize;
            val var2: Boolean = this.grayscale;
            val var3: StringBuilder = new StringBuilder();
            var3.append("End(uri=");
            var3.append(var4);
            var3.append(", fullSize=");
            var3.append(var1);
            var3.append(", grayscale=");
            var3.append(var2);
            var3.append(")");
            return var3.toString();
         }
      }

      public object None : ActivityInviteEmbedView.ImageConfig()

      public data class Start(uri: String) : ActivityInviteEmbedView.ImageConfig {
         public final val uri: String

         init {
            r.h(var1, "uri");
            super(null);
            this.uri = var1;
         }

         public operator fun component1(): String {
            return this.uri;
         }

         public fun copy(uri: String = var0.uri): com.discord.activity_invites.ActivityInviteEmbedView.ImageConfig.Start {
            r.h(var1, "uri");
            return new ActivityInviteEmbedView.ImageConfig.Start(var1);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is ActivityInviteEmbedView.ImageConfig.Start) {
               return false;
            } else {
               return r.c(this.uri, (var1 as ActivityInviteEmbedView.ImageConfig.Start).uri);
            }
         }

         public override fun hashCode(): Int {
            return this.uri.hashCode();
         }

         public override fun toString(): String {
            val var1: java.lang.String = this.uri;
            val var2: StringBuilder = new StringBuilder();
            var2.append("Start(uri=");
            var2.append(var1);
            var2.append(")");
            return var2.toString();
         }
      }
   }
}
