package com.discord.chat.presentation.message.view.mosaic_recycler

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import j8.a
import j8.b
import java.util.ArrayList

public class AttachmentMediaMosaicAdapter(context: Context,
      onItemClicked: (MessageAttachmentAccessory, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MessageAttachmentAccessory) -> Unit)?,
      onItemSpoilerClicked: (MessageAttachmentAccessory) -> Unit,
      onItemObscureToggle: (Boolean) -> Unit
   )
   : Adapter {
   private final val context: Context
   private final val onItemClicked: (MessageAttachmentAccessory, MessagePartViewHolder) -> Unit
   private final val onItemLongClicked: ((MessageAttachmentAccessory) -> Unit)?
   private final val onItemSpoilerClicked: (MessageAttachmentAccessory) -> Unit
   private final val onItemObscureToggle: (Boolean) -> Unit
   private final var eventHandler: ChatEventHandler?
   private final var shouldAutoPlayGifs: Boolean
   private final var constrainedWidth: Int
   public final val items: MutableList<MessageAttachmentAccessory>

   init {
      this.context = var1;
      this.onItemClicked = var2;
      this.onItemLongClicked = var3;
      this.onItemSpoilerClicked = var4;
      this.onItemObscureToggle = var5;
      this.items = new ArrayList<>();
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(var0: AttachmentMediaMosaicAdapter, var1: ImageAttachmentMessageAccessory, var2: MessagePartViewHolder, var3: View) {
      var0.onItemClicked.invoke(var1, var2);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$1`(var0: AttachmentMediaMosaicAdapter, var1: ImageAttachmentMessageAccessory, var2: View): Boolean {
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(var0: AttachmentMediaMosaicAdapter, var1: ImageAttachmentMessageAccessory): Unit {
      var0.onItemSpoilerClicked.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: AttachmentMediaMosaicAdapter, var1: Boolean): Unit {
      var0.onItemObscureToggle.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4`(var0: AttachmentMediaMosaicAdapter, var1: VideoAttachmentMessageAccessory, var2: MessagePartViewHolder, var3: View) {
      var0.onItemClicked.invoke(var1, var2);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$5`(var0: AttachmentMediaMosaicAdapter, var1: VideoAttachmentMessageAccessory, var2: View): Boolean {
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$6`(var0: AttachmentMediaMosaicAdapter, var1: VideoAttachmentMessageAccessory): Unit {
      var0.onItemSpoilerClicked.invoke(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$7`(var0: AttachmentMediaMosaicAdapter, var1: Boolean): Unit {
      var0.onItemObscureToggle.invoke(var1);
      return Unit.a;
   }

   public open fun getItemCount(): Int {
      return this.items.size();
   }

   public open fun getItemViewType(position: Int): Int {
      val var2: MessageAttachmentAccessory = this.items.get(var1);
      if (var2 is ImageAttachmentMessageAccessory) {
         return 49;
      } else if (var2 is VideoAttachmentMessageAccessory) {
         return 50;
      } else {
         val var3: StringBuilder = new StringBuilder();
         var3.append("Invalid accessory type: ");
         var3.append(var1);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      val var5: ChatEventHandler = this.eventHandler;
      if (this.eventHandler != null) {
         if (var1 is MosaicItemMessageAttachmentImageViewHolder) {
            var var14: Any = this.items.get(var2);
            var14 = var14 as ImageAttachmentMessageAccessory;
            val var16: MosaicItemMessageAttachmentImageViewHolder = var1 as MosaicItemMessageAttachmentImageViewHolder;
            val var11: Boolean;
            if (this.getItemCount() == 1) {
               var11 = true;
            } else {
               var11 = false;
            }

            val var8: a = new a(this, (ImageAttachmentMessageAccessory)var14, var1);
            val var10: b = new b(this, (ImageAttachmentMessageAccessory)var14);
            val var4: Boolean = this.shouldAutoPlayGifs;
            var16.bindAttachment(
               var5, (ImageAttachmentMessageAccessory)var14, var11, var8, var10, new j8.c(this, (ImageAttachmentMessageAccessory)var14), new j8.d(this), var4
            );
         } else if (var1 is MosaicItemMessageAttachmentVideoViewHolder) {
            var var6: MosaicItemMessageAttachmentVideoViewHolder = this.items.get(var2);
            val var7: VideoAttachmentMessageAccessory = var6 as VideoAttachmentMessageAccessory;
            var6 = var1 as MosaicItemMessageAttachmentVideoViewHolder;
            val var3: Boolean;
            if (this.getItemCount() == 1) {
               var3 = true;
            } else {
               var3 = false;
            }

            var6.bindAttachment(var5, var7, var3, new j8.e(this, var7, var1), new j8.f(this, var7), new j8.g(this, var7), new j8.h(this));
         } else {
            val var9: Class = var1.getClass();
            val var12: StringBuilder = new StringBuilder();
            var12.append("Invalid view holder type ");
            var12.append(var9);
            throw new IllegalStateException(var12.toString().toString());
         }
      }
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      if (var2 != 49) {
         if (var2 == 50) {
            return new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(this.context, null, 2, null));
         } else {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Invalid accessory type: ");
            var3.append(var2);
            throw new IllegalStateException(var3.toString().toString());
         }
      } else {
         return new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(this.context, null, 2, null));
      }
   }

   public fun setChatEventHandler(eventHandler: ChatEventHandler) {
      this.eventHandler = var1;
   }

   public fun setConstrainedWidth(constrainedWidth: Int) {
      this.constrainedWidth = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setMediaItems(items: List<MessageAttachmentAccessory>, shouldAutoPlayGifs: Boolean) {
      this.items.clear();
      this.items.addAll(var1);
      this.shouldAutoPlayGifs = var2;
      this.notifyDataSetChanged();
   }
}
