package com.discord.chat.presentation.message.viewholder.mosaicitem.botuikit

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.R
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.mosaic.MediaMosaicVideoViewHolder
import com.discord.chat.presentation.message.view.mosaic.MosaicMediaItem
import com.discord.chat.presentation.message.viewholder.MediaVideoViewHolder
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import kotlin.jvm.internal.r

public class MosaicItemMediaGalleryVideoViewHolder(view: MediaVideoView)
   : MediaVideoViewHolder,
   MediaMosaicVideoViewHolder<Pair<? extends MediaGalleryItem, ? extends ComponentContext>> {
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
      onTapSpoiler: () -> Unit
   ) {
      r.h(var1, "containerId");
      r.h(var2, "mosaicId");
      r.h(var3, "item");
      r.h(var7, "onClicked");
      r.h(var9, "onTapSpoiler");
      val var18: MediaGalleryItem = (var3.getOriginalItem() as Pair).c() as MediaGalleryItem;
      val var30: ComponentContext = (var3.getOriginalItem() as Pair).d() as ComponentContext;
      val var19: UnfurledMediaItem = var18.getMedia();
      val var21: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var20: StringBuilder = new StringBuilder();
      var20.append("MediaGalleryDisplayComponent(");
      var20.append(var2);
      var20.append(").item[video]");
      val var26: SpoilerAttributes = var21.forGenericMedia(var18, var1, var20.toString(), var18.getMedia().getProxyUrl());
      var2 = var19.getProxyUrl();
      val var22: java.lang.String = var18.getVideoPreviewUrl();
      r.e(var22);
      val var37: java.lang.String = var19.getPlaceholder();
      val var35: Int = var19.getPlaceholderVersion();
      var var23: java.lang.String = var19.getProxyUrl();
      val var24: StringBuilder = new StringBuilder();
      var24.append("video attachment: ");
      var24.append(var23);
      var23 = var24.toString();
      val var25: MediaType = MediaType.VIDEO;
      val var39: java.lang.Double = var18.getPortalId();
      r.e(var39);
      val var29: MediaSource = new MediaSource(var2, var22, var37, var35, var23, var25, false, null, null, var39, 448, null);
      val var11: Int = var19.getWidth();
      val var10: Int = var19.getHeight();
      val var12: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var17: Boolean = var18.isSpoiler();
      val var27: SpoilerConfig;
      if (var26 != null) {
         var27 = var26.configure(var9);
      } else {
         var27 = null;
      }

      super.bind(
         var29,
         var10,
         var11,
         var17,
         var27,
         var18.isObscure(),
         var18.isObscureAwaitingScan(),
         var18.getShowDescription(),
         var18.getDescription(),
         var18.getDescriptionHint(),
         var18.getShowDescription(),
         var30.getMediaItemEventHandlers().getOnMediaItemAltTextButtonClicked(),
         var4,
         var5,
         var12,
         var6 xor true,
         null,
         var6,
         false,
         null,
         null,
         null,
         null,
         var18.getAccessibilityRole(),
         var7,
         var8,
         <unrepresentable>.INSTANCE,
         MediaPlayer.Factory.getDefaultSettings()
      );
   }
}
