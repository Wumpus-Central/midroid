package com.discord.chat.presentation.message.view.botuikit.components.media_gallery

import A1.a
import A1.b
import A1.c
import A1.d
import A1.e
import A1.f
import A1.g
import A1.h
import A1.i
import A1.j
import B9.n
import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.bridge.botuikit.MediaGalleryItemType
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.MediaVisualPlaceholderView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemVisualPlaceholderViewHolder
import java.util.ArrayList
import kotlin.jvm.functions.Function1

public class MediaGalleryDisplayComponentAdapter(context: Context,
      onItemClicked: (MediaGalleryDisplayComponent, MediaGalleryItem, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MediaGalleryDisplayComponent, MediaGalleryItem) -> Unit)?,
      onItemSpoilerClicked: (MediaGalleryItem) -> Unit,
      onItemObscureToggle: (Boolean) -> Unit,
      onAltText: (String) -> Unit
   )
   : RecyclerView.Adapter {
   private final val context: Context
   private final val onItemClicked: (MediaGalleryDisplayComponent, MediaGalleryItem, MessagePartViewHolder) -> Unit
   private final val onItemLongClicked: ((MediaGalleryDisplayComponent, MediaGalleryItem) -> Unit)?
   private final val onItemSpoilerClicked: (MediaGalleryItem) -> Unit
   private final val onItemObscureToggle: (Boolean) -> Unit
   private final val onAltText: (String) -> Unit
   public final var containerId: String
   public final var component: MediaGalleryDisplayComponent?
   public final var componentContext: ComponentContext?
   public final val items: MutableList<MediaGalleryItem>

   init {
      this.context = var1;
      this.onItemClicked = var2;
      this.onItemLongClicked = var3;
      this.onItemSpoilerClicked = var4;
      this.onItemObscureToggle = var5;
      this.onAltText = var6;
      this.containerId = "";
      this.items = new ArrayList<>();
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(
      var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: MessagePartViewHolder, var4: View
   ) {
      var0.onItemClicked.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$1`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: View): Boolean {
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1, var2);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryItem): Unit {
      var0.onItemSpoilerClicked.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: MediaGalleryDisplayComponentAdapter, var1: Boolean): Unit {
      var0.onItemObscureToggle.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryItem, var2: java.lang.String): Unit {
      val var5: Function1 = var0.onAltText;
      val var4: java.lang.String = var1.getDescription();
      var var3: java.lang.String = var4;
      if (var4 == null) {
         var3 = "";
      }

      var5.invoke(var3);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$5`(
      var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: MessagePartViewHolder, var4: View
   ) {
      var0.onItemClicked.invoke(var1, var2, var3);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$6`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: View): Boolean {
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1, var2);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$7`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryItem): Unit {
      var0.onItemSpoilerClicked.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$8`(var0: MediaGalleryDisplayComponentAdapter, var1: Boolean): Unit {
      var0.onItemObscureToggle.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$9`(var0: MediaGalleryDisplayComponentAdapter, var1: MediaGalleryItem, var2: java.lang.String): Unit {
      val var5: Function1 = var0.onAltText;
      val var4: java.lang.String = var1.getDescription();
      var var3: java.lang.String = var4;
      if (var4 == null) {
         var3 = "";
      }

      var5.invoke(var3);
      return Unit.a;
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemViewType(position: Int): Int {
      val var2: Int = MediaGalleryDisplayComponentAdapter.WhenMappings.$EnumSwitchMapping$0[this.items.get(var1).getMediaType().ordinal()];
      val var5: Byte;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  throw new n();
               }

               val var4: MediaGalleryItemType = this.items.get(var1).getMediaType();
               val var6: StringBuilder = new StringBuilder();
               var6.append("Unknown bot component media type: ");
               var6.append(var4);
               throw new IllegalArgumentException(var6.toString());
            }

            var5 = 51;
         } else {
            var5 = 50;
         }
      } else {
         var5 = 49;
      }

      return var5;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      val var4: Boolean = var1 is MosaicItemMessageAttachmentImageViewHolder;
      var var3: Boolean = false;
      if (var4) {
         val var9: MediaGalleryItem = this.items.get(var2);
         val var10: MediaGalleryDisplayComponent = this.component;
         if (this.component == null) {
            return;
         }

         val var7: ComponentContext = this.componentContext;
         if (this.componentContext == null) {
            return;
         }

         val var5: MosaicItemMessageAttachmentImageViewHolder = var1 as MosaicItemMessageAttachmentImageViewHolder;
         val var8: java.lang.String = this.containerId;
         val var6: java.lang.String = this.component.getId();
         if (this.getItemCount() == 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         var5.bindGalleryItem(
            var8,
            var6,
            var9,
            var3,
            new a(this, var10, var9, var1),
            new b(this, var10, var9),
            new c(this, var9),
            new d(this),
            new e(this, var9),
            var7.getShouldAutoPlayGif()
         );
      } else if (var1 is MosaicItemMessageAttachmentVideoViewHolder) {
         val var20: MediaGalleryItem = this.items.get(var2);
         val var21: MediaGalleryDisplayComponent = this.component;
         if (this.component == null) {
            return;
         }

         val var22: MosaicItemMessageAttachmentVideoViewHolder = var1 as MosaicItemMessageAttachmentVideoViewHolder;
         val var16: java.lang.String = this.containerId;
         val var19: java.lang.String = this.component.getId();
         if (this.getItemCount() == 1) {
            var3 = true;
         } else {
            var3 = false;
         }

         var22.bindGalleryItem(
            var16, var19, var20, var3, new f(this, var21, var20, var1), new g(this, var21, var20), new h(this, var20), new i(this), new j(this, var20)
         );
      } else {
         if (var1 !is MosaicItemVisualPlaceholderViewHolder) {
            val var18: StringBuilder = new StringBuilder();
            var18.append("Invalid accessory holder type: ");
            var18.append(var1);
            throw new IllegalStateException(var18.toString().toString());
         }

         val var17: MediaGalleryItem = this.items.get(var2);
         val var12: MosaicItemVisualPlaceholderViewHolder = var1 as MosaicItemVisualPlaceholderViewHolder;
         if (this.getItemCount() == 1) {
            var3 = true;
         }

         var12.bindGalleryItem(var17, var3);
      }
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      var var4: Any;
      switch (var2) {
         case 49:
            var4 = new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(this.context, null, 2, null));
            break;
         case 50:
            var4 = new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(this.context, null, 2, null));
            break;
         case 51:
            var4 = new MosaicItemVisualPlaceholderViewHolder(new MediaVisualPlaceholderView(this.context, null, 2, null));
            break;
         default:
            val var3: StringBuilder = new StringBuilder();
            var3.append("Invalid accessory type: ");
            var3.append(var2);
            throw new IllegalStateException(var3.toString().toString());
      }

      return (MessagePartViewHolder)var4;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setMediaItems(containerId: String, component: MediaGalleryDisplayComponent, componentContext: ComponentContext) {
      this.containerId = var1;
      this.component = var2;
      this.componentContext = var3;
      this.items.clear();
      this.items.addAll(var2.getItems());
      this.notifyDataSetChanged();
   }
}
