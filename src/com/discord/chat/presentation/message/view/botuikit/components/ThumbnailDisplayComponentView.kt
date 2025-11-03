package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.chat.R.dimen
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder
import com.google.android.flexbox.FlexboxLayout
import kotlin.jvm.functions.Function2
import kotlin.reflect.KClass

public class ThumbnailDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null) : MediaImageView(var1, var2),
   ComponentView<ThumbnailDisplayComponent> {
   private final val imageViewHolder: MediaImageViewHolder = new MediaImageViewHolder(this)

   fun ThumbnailDisplayComponentView(var1: Context) {
      this(var1, null, 2, null);
   }

   @JvmStatic
   fun `configure$lambda$0`(var0: ComponentContext, var1: ThumbnailDisplayComponentView, var2: ThumbnailDisplayComponent, var3: View) {
      var0.getMediaItemEventHandlers().getOnMediaItemClicked().invoke(var1, var2.getId(), 0, null);
   }

   @JvmStatic
   fun `configure$lambda$1`(var0: ComponentContext, var1: ThumbnailDisplayComponent, var2: View): Boolean {
      val var3: Function2 = var0.getMediaItemEventHandlers().getOnMediaItemLongClicked();
      if (var3 != null) {
         var3.invoke(var1.getId(), 0);
      }

      return false;
   }

   public open fun configure(component: ThumbnailDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      val var13: com.discord.chat.bridge.spoiler.SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var16: java.lang.String = var3.getContainerId();
      val var12: java.lang.String = var1.getId();
      val var11: StringBuilder = new StringBuilder();
      var11.append("ThumbnailDisplayComponent(");
      var11.append(var12);
      var11.append(")");
      val var21: SpoilerAttributes = var13.forGenericMedia(var1, var16, var11.toString(), var1.getMedia().getProxyUrl(), var1.getVerifyAge());
      val var20: UnfurledMediaItem = var1.getMedia();
      val var19: MediaImageViewHolder = this.imageViewHolder;
      val var9: Boolean = var1.isSpoiler();
      var var17: SpoilerConfig = null;
      if (var21 != null) {
         var17 = SpoilerAttributes.configure$default(var21, var3.getMediaItemEventHandlers().getOnMediaItemSpoilerClicked(), null, 2, null);
      }

      val var8: Boolean = var1.isObscure();
      val var7: Boolean = var1.isObscureAwaitingScan();
      val var6: Boolean = var1.getObscureHideControls();
      val var10: Boolean = var1.getObscureIsOpaque();
      val var22: java.lang.String = var20.getProxyUrl();
      var var14: Int = var20.getWidth();
      var var5: Int = 0;
      var var4: Int;
      if (var14 != null) {
         var4 = var14;
      } else {
         var4 = 0;
      }

      var14 = var20.getHeight();
      if (var14 != null) {
         var5 = var14;
      }

      var19.bind(
         var22,
         var4,
         var5,
         var20.getPlaceholder(),
         var20.getPlaceholderVersion(),
         var9,
         var17,
         var8,
         var7,
         var6,
         var10,
         false,
         var1.getDescription(),
         var1.getDescriptionHint(),
         false,
         null,
         this.getContext().getResources().getDimensionPixelSize(dimen.message_media_non_mosaic_radius),
         MediaContainingViewResizer.ResizeMode.Cover,
         false,
         new k(var3, this, var1),
         new l(var3, var1),
         null,
         var1.getAccessibilityRole(),
         var3.getShouldAutoPlayGif(),
         null,
         var1.getMedia().getSrcIsAnimated()
      );
      if (var3.getWidthInfo().isLargeWidthRenderingMode()) {
         var4 = ThumbnailDisplayComponentViewKt.getTHUMBNAIL_BIG_MODE_SIZE();
      } else {
         var4 = ThumbnailDisplayComponentViewKt.getTHUMBNAIL_NORMAL_SIZE();
      }

      val var15: FlexboxLayout.LayoutParams = new FlexboxLayout.LayoutParams(var4, var4);
      var15.b(0.0F);
      this.getBinding().getRoot().setLayoutParams(var15);
   }

   public override fun getComponentType(): KClass<ThumbnailDisplayComponent> {
      return ThumbnailDisplayComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ThumbnailDisplayComponentView {
         return new ThumbnailDisplayComponentView(var1, null, 2, null);
      }
   }
}
