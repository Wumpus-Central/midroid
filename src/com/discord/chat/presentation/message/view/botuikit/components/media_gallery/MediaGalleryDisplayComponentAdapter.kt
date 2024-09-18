package com.discord.chat.presentation.message.view.botuikit.components.media_gallery

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ch.p
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class MediaGalleryDisplayComponentAdapter(context: Context,
      onItemClicked: (MediaGalleryDisplayComponent, MediaGalleryItem, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MediaGalleryDisplayComponent, MediaGalleryItem) -> Unit)?,
      onItemSpoilerClicked: (MediaGalleryItem) -> Unit,
      onAltText: (String) -> Unit
   )
   : RecyclerView.Adapter {
   private final val context: Context
   private final val onItemClicked: (MediaGalleryDisplayComponent, MediaGalleryItem, MessagePartViewHolder) -> Unit
   private final val onItemLongClicked: ((MediaGalleryDisplayComponent, MediaGalleryItem) -> Unit)?
   private final val onItemSpoilerClicked: (MediaGalleryItem) -> Unit
   private final val onAltText: (String) -> Unit
   public final var component: MediaGalleryDisplayComponent?
   public final var containerId: String
   public final val items: MutableList<MediaGalleryItem>

   init {
      q.h(var1, "context");
      q.h(var2, "onItemClicked");
      q.h(var4, "onItemSpoilerClicked");
      q.h(var5, "onAltText");
      super();
      this.context = var1;
      this.onItemClicked = var2;
      this.onItemLongClicked = var3;
      this.onItemSpoilerClicked = var4;
      this.onAltText = var5;
      this.containerId = "";
      this.items = new ArrayList<>();
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(
      var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: MessagePartViewHolder, var4: View
   ) {
      q.h(var0, "this$0");
      q.h(var1, "$component");
      q.h(var2, "$accessory");
      q.h(var3, "$holder");
      var0.onItemClicked.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$1`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: View): Boolean {
      q.h(var0, "this$0");
      q.h(var1, "$component");
      q.h(var2, "$accessory");
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1, var2);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(
      var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: MessagePartViewHolder, var4: View
   ) {
      q.h(var0, "this$0");
      q.h(var1, "$component");
      q.h(var2, "$accessory");
      q.h(var3, "$holder");
      var0.onItemClicked.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: View): Boolean {
      q.h(var0, "this$0");
      q.h(var1, "$component");
      q.h(var2, "$accessory");
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1, var2);
      }

      return false;
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemViewType(position: Int): Int {
      var1 = MediaGalleryDisplayComponentAdapter.WhenMappings.$EnumSwitchMapping$0[this.items.get(var1).getMediaType().ordinal()];
      val var4: Byte;
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               throw new p();
            }

            throw new IllegalArgumentException("Unknown bot component media type");
         }

         var4 = 50;
      } else {
         var4 = 49;
      }

      return var4;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      q.h(var1, "holder");
      if (var1 is MosaicItemMessageAttachmentImageViewHolder) {
         val var5: MediaGalleryItem = this.items.get(var2);
         val var7: MediaGalleryDisplayComponent = this.component;
         if (this.component == null) {
            return;
         }

         val var8: MosaicItemMessageAttachmentImageViewHolder = var1 as MosaicItemMessageAttachmentImageViewHolder;
         val var4: java.lang.String = this.component.getId();
         val var6: java.lang.String = this.containerId;
         val var3: Boolean;
         if (this.getItemCount() == 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         var8.bindGalleryItem(var4, var6, var5, var3, new a(this, var7, var5, var1), new b(this, var7, var5), new Function0(this, var5) {
            final MediaGalleryItem $accessory;
            final MediaGalleryDisplayComponentAdapter this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$accessory = var2;
            }

            public final void invoke() {
               MediaGalleryDisplayComponentAdapter.access$getOnItemSpoilerClicked$p(this.this$0).invoke(this.$accessory);
            }
         }, new Function1(this, var5) {
            final MediaGalleryItem $accessory;
            final MediaGalleryDisplayComponentAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$accessory = var2;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "it");
               val var3: Function1 = MediaGalleryDisplayComponentAdapter.access$getOnAltText$p(this.this$0);
               val var2: java.lang.String = this.$accessory.getDescription();
               var1 = var2;
               if (var2 == null) {
                  var1 = "";
               }

               var3.invoke(var1);
            }
         }, false);
      } else {
         if (var1 !is MosaicItemMessageAttachmentVideoViewHolder) {
            val var11: StringBuilder = new StringBuilder();
            var11.append("Invalid accessory holder type: ");
            var11.append(var1);
            throw new IllegalStateException(var11.toString().toString());
         }

         val var12: MediaGalleryItem = this.items.get(var2);
         val var14: MediaGalleryDisplayComponent = this.component;
         if (this.component == null) {
            return;
         }

         val var15: MosaicItemMessageAttachmentVideoViewHolder = var1 as MosaicItemMessageAttachmentVideoViewHolder;
         val var13: java.lang.String = this.component.getId();
         val var10: java.lang.String = this.containerId;
         val var9: Boolean;
         if (this.getItemCount() == 1) {
            var9 = true;
         } else {
            var9 = false;
         }

         var15.bindGalleryItem(var13, var10, var12, var9, new c(this, var14, var12, var1), new d(this, var14, var12), new Function0(this, var12) {
            final MediaGalleryItem $accessory;
            final MediaGalleryDisplayComponentAdapter this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$accessory = var2;
            }

            public final void invoke() {
               MediaGalleryDisplayComponentAdapter.access$getOnItemSpoilerClicked$p(this.this$0).invoke(this.$accessory);
            }
         }, new Function1(this, var12) {
            final MediaGalleryItem $accessory;
            final MediaGalleryDisplayComponentAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$accessory = var2;
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "it");
               val var3: Function1 = MediaGalleryDisplayComponentAdapter.access$getOnAltText$p(this.this$0);
               val var2: java.lang.String = this.$accessory.getDescription();
               var1 = var2;
               if (var2 == null) {
                  var1 = "";
               }

               var3.invoke(var1);
            }
         });
      }
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      q.h(var1, "parent");
      val var3: Any;
      if (var2 != 49) {
         if (var2 != 50) {
            val var4: StringBuilder = new StringBuilder();
            var4.append("Invalid accessory type: ");
            var4.append(var2);
            throw new IllegalStateException(var4.toString().toString());
         }

         var3 = new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(this.context, null, 2, null));
      } else {
         var3 = new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(this.context, null, 2, null));
      }

      return (MessagePartViewHolder)var3;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setMediaItems(containerId: String, component: MediaGalleryDisplayComponent) {
      q.h(var1, "containerId");
      q.h(var2, "component");
      this.containerId = var1;
      this.component = var2;
      this.items.clear();
      this.items.addAll(var2.getItems());
      this.notifyDataSetChanged();
   }
}
