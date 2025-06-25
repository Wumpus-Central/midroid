package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.databinding.MediaVisualPlaceholderViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManager
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.drawable.ScalingUtils$ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView

public class MediaVisualPlaceholderView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout, MosaicView {
   public final val binding: MediaVisualPlaceholderViewBinding
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaVisualPlaceholderView.TargetSize

   fun MediaVisualPlaceholderView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: MediaVisualPlaceholderViewBinding = MediaVisualPlaceholderViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
   }

   public override fun getSingleAspectRatio(): Float {
      var var2: MediaVisualPlaceholderView.TargetSize = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.q.y("targetSize");
         var2 = null;
      }

      val var1: Float = var2.getWidth();
      var2 = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.q.y("targetSize");
         var2 = null;
      }

      return var1 / var2.getHeight();
   }

   public fun setContent(state: VisualPlaceholderState, width: Int, height: Int, resizeMode: ResizeMode, radiusPx: Int) {
      kotlin.jvm.internal.q.h(var1, "state");
      kotlin.jvm.internal.q.h(var4, "resizeMode");
      this.targetSize = new MediaVisualPlaceholderView.TargetSize(var2, var3, var4);
      val var10: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      ViewClippingUtilsKt.clipToRoundedRectangle(var10, var5);
      this.binding.container.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      this.binding.imageInvalid.setVisibility(8);
      var2 = MediaVisualPlaceholderView.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               throw new z9.n();
            }

            this.binding.imageInvalid.setVisibility(0);
            (this.binding.imageInvalid.getHierarchy() as GenericDraweeHierarchy).u(ScalingUtils$ScaleType.e);
            this.binding.imageInvalid.clearColorFilter();
            val var11: SimpleDraweeView = this.binding.imageInvalid;
            kotlin.jvm.internal.q.g(this.binding.imageInvalid, "imageInvalid");
            val var6: ReactAsset;
            if (ThemeManager.INSTANCE.isThemeDark()) {
               var6 = ReactAsset.PoopDark;
            } else {
               var6 = ReactAsset.PoopLight;
            }

            ReactAssetUtilsKt.setReactAsset(var11, var6);
         } else {
            this.binding.imageInvalid.setVisibility(0);
            (this.binding.imageInvalid.getHierarchy() as GenericDraweeHierarchy).u(ScalingUtils$ScaleType.g);
            val var7: SimpleDraweeView = this.binding.imageInvalid;
            kotlin.jvm.internal.q.g(this.binding.imageInvalid, "imageInvalid");
            ColorUtilsKt.setTintColor(var7, ThemeManagerKt.getTheme().getBackgroundAccent());
            val var8: SimpleDraweeView = this.binding.imageInvalid;
            kotlin.jvm.internal.q.g(this.binding.imageInvalid, "imageInvalid");
            ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.BrokenImage);
         }
      }
   }

   public override fun setMosaicSize(width: Int, height: Int) {
      val var3: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      val var4: LayoutParams = var3.getLayoutParams();
      if (var4 != null) {
         var4.width = var1;
         var4.height = var2;
         var3.setLayoutParams(var4);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      }
   }

   public data class TargetSize(width: Int, height: Int, resizeMode: ResizeMode) {
      public final val width: Int
      public final val height: Int
      public final val resizeMode: ResizeMode

      init {
         kotlin.jvm.internal.q.h(var3, "resizeMode");
         super();
         this.width = var1;
         this.height = var2;
         this.resizeMode = var3;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public operator fun component3(): ResizeMode {
         return this.resizeMode;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height, resizeMode: ResizeMode = var0.resizeMode): com.discord.chat.presentation.message.view.MediaVisualPlaceholderView.TargetSize {
         kotlin.jvm.internal.q.h(var3, "resizeMode");
         return new MediaVisualPlaceholderView.TargetSize(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaVisualPlaceholderView.TargetSize) {
            return false;
         } else {
            var1 = var1;
            if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else {
               return this.resizeMode === var1.resizeMode;
            }
         }
      }

      public override fun hashCode(): Int {
         return (Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + this.resizeMode.hashCode();
      }

      public override fun toString(): String {
         val var1: Int = this.width;
         val var2: Int = this.height;
         val var3: MediaContainingViewResizer.ResizeMode = this.resizeMode;
         val var4: StringBuilder = new StringBuilder();
         var4.append("TargetSize(width=");
         var4.append(var1);
         var4.append(", height=");
         var4.append(var2);
         var4.append(", resizeMode=");
         var4.append(var3);
         var4.append(")");
         return var4.toString();
      }
   }
}
