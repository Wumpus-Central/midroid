package com.discord.chat.presentation.message.view.mosaic

import android.content.Context
import android.util.AttributeSet
import android.view.View
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.botuikit.MosaicItemMediaGalleryImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.botuikit.MosaicItemMediaGalleryVideoViewHolder
import com.discord.misc.utilities.ids.IdUtilsKt
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class MediaGalleryComponentMediaMosaicView  public constructor(context: Context, attrs: AttributeSet? = null)
   : MediaMosaicView<Pair<? extends MediaGalleryItem, ? extends ComponentContext>> {
   fun MediaGalleryComponentMediaMosaicView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
   }

   public override fun createItemHolder(item: MosaicMediaItem<Pair<MediaGalleryItem, ComponentContext>>): MessagePartViewHolder {
      r.h(var1, "item");
      val var2: Int = MediaGalleryComponentMediaMosaicView.WhenMappings.$EnumSwitchMapping$0[((var1.getOriginalItem() as Pair).c() as MediaGalleryItem)
         .getMediaType()
         .ordinal()];
      val var5: Any;
      if (var2 != 1) {
         if (var2 != 2) {
            val var7: StringBuilder = new StringBuilder();
            var7.append("Invalid accessory type: ");
            var7.append(var1);
            throw new IllegalStateException(var7.toString().toString());
         }

         val var4: Context = this.getContext();
         r.g(var4, "context");
         var5 = new MosaicItemMediaGalleryVideoViewHolder(new MediaVideoView(var4, null, 2, null));
      } else {
         val var6: Context = this.getContext();
         r.g(var6, "context");
         var5 = new MosaicItemMediaGalleryImageViewHolder(new MediaImageView(var6, null, 2, null));
      }

      return (MessagePartViewHolder)var5;
   }

   public fun setGalleryItems(
      containerId: String,
      componentId: String,
      items: List<MediaGalleryItem>,
      componentContext: ComponentContext,
      constrainedWidth: Int,
      onItemClicked: (View, MediaGalleryItem) -> Unit,
      onItemLongClicked: ((MediaGalleryItem) -> Unit)?,
      onItemSpoilerClicked: (MediaGalleryItem) -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      r.h(var1, "containerId");
      r.h(var2, "componentId");
      r.h(var3, "items");
      r.h(var4, "componentContext");
      r.h(var6, "onItemClicked");
      r.h(var8, "onItemSpoilerClicked");
      val var10: ArrayList = new ArrayList(h.t(var3, 10));

      for (MediaGalleryItem var12 : var3) {
         var10.add(new MosaicMediaItem<>(IdUtilsKt.convertToId(var12.getMedia().getProxyUrl()), new Pair(var12, var4)));
      }

      val var13: Function1;
      if (var7 != null) {
         var13 = new Function1<MosaicMediaItem<Pair<? extends MediaGalleryItem, ? extends ComponentContext>>, java.lang.Boolean>(var7) {
            final Function1<MediaGalleryItem, Unit> $onLongClick;

            {
               super(1);
               this.$onLongClick = var1;
            }

            public final java.lang.Boolean invoke(MosaicMediaItem<Pair<MediaGalleryItem, ComponentContext>> var1) {
               r.h(var1, "item");
               this.$onLongClick.invoke((var1.getOriginalItem() as Pair).c());
               return java.lang.Boolean.TRUE;
            }
         };
      } else {
         var13 = null;
      }

      this.setItems(
         var1,
         var2,
         var10,
         var5,
         new Function2<MosaicMediaItem<Pair<? extends MediaGalleryItem, ? extends ComponentContext>>, MessagePartViewHolder, Unit>(var6) {
            final Function2<View, MediaGalleryItem, Unit> $onItemClicked;

            {
               super(2);
               this.$onItemClicked = var1;
            }

            public final void invoke(MosaicMediaItem<Pair<MediaGalleryItem, ComponentContext>> var1, MessagePartViewHolder var2) {
               r.h(var1, "item");
               r.h(var2, "holder");
               val var3: Function2 = this.$onItemClicked;
               val var4: View = var2.itemView;
               r.g(var2.itemView, "holder.itemView");
               var3.invoke(var4, (var1.getOriginalItem() as Pair).c());
            }
         },
         var13,
         new Function1<MosaicMediaItem<Pair<? extends MediaGalleryItem, ? extends ComponentContext>>, Unit>(var8) {
            final Function1<MediaGalleryItem, Unit> $onItemSpoilerClicked;

            {
               super(1);
               this.$onItemSpoilerClicked = var1;
            }

            public final void invoke(MosaicMediaItem<Pair<MediaGalleryItem, ComponentContext>> var1) {
               r.h(var1, "item");
               this.$onItemSpoilerClicked.invoke((var1.getOriginalItem() as Pair).c());
            }
         },
         var9,
         false,
         false
      );
   }
}
