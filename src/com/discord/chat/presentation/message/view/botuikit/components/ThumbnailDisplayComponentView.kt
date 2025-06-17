package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.chat.R
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
import com.google.android.flexbox.FlexboxLayout.LayoutParams
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ThumbnailDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null)
   : MediaImageView,
   ComponentView<ThumbnailDisplayComponent> {
   private final val imageViewHolder: MediaImageViewHolder

   fun ThumbnailDisplayComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.imageViewHolder = new MediaImageViewHolder(this);
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
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      val var13: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var16: java.lang.String = var3.getContainerId();
      val var12: java.lang.String = var1.getId();
      val var11: StringBuilder = new StringBuilder();
      var11.append("ThumbnailDisplayComponent(");
      var11.append(var12);
      var11.append(")");
      val var17: SpoilerAttributes = var13.forGenericMedia(var1, var16, var11.toString(), var1.getMedia().getProxyUrl(), var1.getVerifyAge());
      val var20: UnfurledMediaItem = var1.getMedia();
      val var21: MediaImageViewHolder = this.imageViewHolder;
      val var6: Boolean = var1.isSpoiler();
      val var18: SpoilerConfig;
      if (var17 != null) {
         var18 = SpoilerAttributes.configure$default(var17, var3.getMediaItemEventHandlers().getOnMediaItemSpoilerClicked(), null, 2, null);
      } else {
         var18 = null;
      }

      val var8: Boolean = var1.isObscure();
      val var7: Boolean = var1.isObscureAwaitingScan();
      val var10: Boolean = var1.getObscureHideControls();
      val var9: Boolean = var1.getObscureIsOpaque();
      val var22: java.lang.String = var20.getProxyUrl();
      var var14: Int = var20.getWidth();
      var var4: Int;
      if (var14 != null) {
         var4 = var14;
      } else {
         var4 = 0;
      }

      var14 = var20.getHeight();
      val var5: Int;
      if (var14 != null) {
         var5 = var14;
      } else {
         var5 = 0;
      }

      var21.bind(
         var22,
         var4,
         var5,
         var20.getPlaceholder(),
         var20.getPlaceholderVersion(),
         var6,
         var18,
         var8,
         var7,
         var10,
         var9,
         false,
         var1.getDescription(),
         var1.getDescriptionHint(),
         false,
         null,
         this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius),
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

      val var15: LayoutParams = new LayoutParams(var4, var4);
      var15.b(0.0F);
      this.getBinding().getRoot().setLayoutParams(var15);
   }

   public override fun getComponentType(): KClass<ThumbnailDisplayComponent> {
      return G.b(ThumbnailDisplayComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ThumbnailDisplayComponentView {
         q.h(var1, "context");
         return new ThumbnailDisplayComponentView(var1, null, 2, null);
      }
   }
}
