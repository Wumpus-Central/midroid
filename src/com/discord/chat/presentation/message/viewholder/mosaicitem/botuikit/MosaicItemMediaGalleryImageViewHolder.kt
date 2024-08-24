package com.discord.chat.presentation.message.viewholder.mosaicitem.botuikit

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.R
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.mosaic.MediaMosaicImageViewHolder
import com.discord.chat.presentation.message.view.mosaic.MosaicMediaItem
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder
import kotlin.jvm.internal.r

public class MosaicItemMediaGalleryImageViewHolder(view: MediaImageView)
   : MediaImageViewHolder,
   MediaMosaicImageViewHolder<Pair<? extends MediaGalleryItem, ? extends ComponentContext>> {
   init {
      r.h(var1, "view");
      super(var1);
   }

   public override fun bind(
      containerId: String,
      mosaicId: String,
      item: MosaicMediaItem<Pair<MediaGalleryItem, ComponentContext>>,
      maxWidthPx: Int,
      maxHeightPx: Int,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      r.h(var1, "containerId");
      r.h(var2, "mosaicId");
      r.h(var3, "item");
      r.h(var7, "onClicked");
      r.h(var9, "onTapSpoiler");
      val var15: MediaGalleryItem = (var3.getOriginalItem() as Pair).c() as MediaGalleryItem;
      val var22: ComponentContext = (var3.getOriginalItem() as Pair).d() as ComponentContext;
      val var18: UnfurledMediaItem = var15.getMedia();
      val var17: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MediaGalleryDisplayComponent(");
      var16.append(var2);
      var16.append(").item[image]");
      val var20: SpoilerAttributes = var17.forGenericMedia(var15, var1, var16.toString(), var15.getMedia().getProxyUrl());
      val var24: java.lang.String = var18.getProxyUrl();
      val var11: Int = var18.getWidth();
      val var13: Int = var18.getHeight();
      val var23: java.lang.String = var18.getPlaceholder();
      val var25: Int = var18.getPlaceholderVersion();
      val var12: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var19: MediaContainingViewResizer.ResizeMode;
      if (var6) {
         var19 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var19 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var14: Boolean = var15.isSpoiler();
      val var21: SpoilerConfig;
      if (var20 != null) {
         var21 = var20.configure(var9);
      } else {
         var21 = null;
      }

      super.bind(
         var24,
         var11,
         var13,
         var23,
         var25,
         var14,
         var21,
         var15.isObscure(),
         var15.isObscureAwaitingScan(),
         var15.getShowDescription(),
         var15.getDescription(),
         var15.getDescriptionHint(),
         var15.getShowDescription(),
         var22.getMediaItemEventHandlers().getOnMediaItemAltTextButtonClicked(),
         var4,
         var5,
         var12,
         var19,
         var6 xor true,
         var7,
         var8,
         null,
         var15.getAccessibilityRole(),
         var10,
         null
      );
   }
}
