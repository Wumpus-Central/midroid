package com.discord.chat.presentation.message.view.mosaic_recycler

import F1.a
import F1.b
import F1.c
import F1.d
import F1.e
import F1.f
import F1.g
import F1.h
import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import java.util.ArrayList
import kotlin.jvm.internal.q

public class AttachmentMediaMosaicAdapter(context: Context,
      onItemClicked: (MessageAttachmentAccessory, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MessageAttachmentAccessory) -> Unit)?,
      onItemSpoilerClicked: (MessageAttachmentAccessory) -> Unit,
      onItemObscureToggle: (Boolean) -> Unit
   )
   : RecyclerView.Adapter {
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
      q.h(var1, "context");
      q.h(var2, "onItemClicked");
      q.h(var4, "onItemSpoilerClicked");
      q.h(var5, "onItemObscureToggle");
      super();
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

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemViewType(position: Int): Int {
      val var2: MessageAttachmentAccessory = this.items.get(var1);
      val var3: Byte;
      if (var2 is ImageAttachmentMessageAccessory) {
         var3 = 49;
      } else {
         if (var2 !is VideoAttachmentMessageAccessory) {
            val var4: StringBuilder = new StringBuilder();
            var4.append("Invalid accessory type: ");
            var4.append(var1);
            throw new IllegalStateException(var4.toString().toString());
         }

         var3 = 50;
      }

      return var3;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      q.h(var1, "holder");
      val var5: ChatEventHandler = this.eventHandler;
      if (this.eventHandler != null) {
         if (var1 is MosaicItemMessageAttachmentImageViewHolder) {
            var var6: MosaicItemMessageAttachmentImageViewHolder = this.items.get(var2);
            q.f(var6, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory");
            val var7: ImageAttachmentMessageAccessory = var6 as ImageAttachmentMessageAccessory;
            var6 = var1 as MosaicItemMessageAttachmentImageViewHolder;
            val var3: Boolean;
            if (this.getItemCount() == 1) {
               var3 = true;
            } else {
               var3 = false;
            }

            val var9: a = new a(this, var7, var1);
            val var8: b = new b(this, var7);
            val var4: Boolean = this.shouldAutoPlayGifs;
            var6.bindAttachment(var5, var7, var3, var9, var8, new c(this, var7), new d(this), var4);
         } else {
            if (var1 !is MosaicItemMessageAttachmentVideoViewHolder) {
               val var12: Class = var1.getClass();
               val var10: StringBuilder = new StringBuilder();
               var10.append("Invalid view holder type ");
               var10.append(var12);
               throw new IllegalStateException(var10.toString().toString());
            }

            var var14: Any = this.items.get(var2);
            q.f(var14, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory");
            var14 = var14 as VideoAttachmentMessageAccessory;
            val var16: MosaicItemMessageAttachmentVideoViewHolder = var1 as MosaicItemMessageAttachmentVideoViewHolder;
            val var11: Boolean;
            if (this.getItemCount() == 1) {
               var11 = true;
            } else {
               var11 = false;
            }

            var16.bindAttachment(
               var5,
               (VideoAttachmentMessageAccessory)var14,
               var11,
               new e(this, (VideoAttachmentMessageAccessory)var14, var1),
               new f(this, (VideoAttachmentMessageAccessory)var14),
               new g(this, (VideoAttachmentMessageAccessory)var14),
               new h(this)
            );
         }
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

   public fun setChatEventHandler(eventHandler: ChatEventHandler) {
      q.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   public fun setConstrainedWidth(constrainedWidth: Int) {
      this.constrainedWidth = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setMediaItems(items: List<MessageAttachmentAccessory>, shouldAutoPlayGifs: Boolean) {
      q.h(var1, "items");
      this.items.clear();
      this.items.addAll(var1);
      this.shouldAutoPlayGifs = var2;
      this.notifyDataSetChanged();
   }
}
