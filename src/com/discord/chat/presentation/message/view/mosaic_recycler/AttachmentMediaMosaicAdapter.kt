package com.discord.chat.presentation.message.view.mosaic_recycler

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
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class AttachmentMediaMosaicAdapter(context: Context,
      onItemClicked: (MessageAttachmentAccessory, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MessageAttachmentAccessory) -> Unit)?,
      onItemSpoilerClicked: (MessageAttachmentAccessory) -> Unit
   )
   : RecyclerView.Adapter {
   private final val context: Context
   private final val onItemClicked: (MessageAttachmentAccessory, MessagePartViewHolder) -> Unit
   private final val onItemLongClicked: ((MessageAttachmentAccessory) -> Unit)?
   private final val onItemSpoilerClicked: (MessageAttachmentAccessory) -> Unit
   private final var eventHandler: ChatEventHandler?
   private final var shouldAutoPlayGifs: Boolean
   private final var constrainedWidth: Int
   public final val items: MutableList<MessageAttachmentAccessory>

   init {
      q.h(var1, "context");
      q.h(var2, "onItemClicked");
      q.h(var4, "onItemSpoilerClicked");
      super();
      this.context = var1;
      this.onItemClicked = var2;
      this.onItemLongClicked = var3;
      this.onItemSpoilerClicked = var4;
      this.items = new ArrayList<>();
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(var0: AttachmentMediaMosaicAdapter, var1: ImageAttachmentMessageAccessory, var2: MessagePartViewHolder, var3: View) {
      q.h(var0, "this$0");
      q.h(var1, "$accessory");
      q.h(var2, "$holder");
      var0.onItemClicked.invoke(var1, var2);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$1`(var0: AttachmentMediaMosaicAdapter, var1: ImageAttachmentMessageAccessory, var2: View): Boolean {
      q.h(var0, "this$0");
      q.h(var1, "$accessory");
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1);
      }

      return false;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(var0: AttachmentMediaMosaicAdapter, var1: VideoAttachmentMessageAccessory, var2: MessagePartViewHolder, var3: View) {
      q.h(var0, "this$0");
      q.h(var1, "$accessory");
      q.h(var2, "$holder");
      var0.onItemClicked.invoke(var1, var2);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: AttachmentMediaMosaicAdapter, var1: VideoAttachmentMessageAccessory, var2: View): Boolean {
      q.h(var0, "this$0");
      q.h(var1, "$accessory");
      if (var0.onItemLongClicked != null) {
         var0.onItemLongClicked.invoke(var1);
      }

      return false;
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
      val var4: ChatEventHandler = this.eventHandler;
      if (this.eventHandler != null) {
         if (var1 is MosaicItemMessageAttachmentImageViewHolder) {
            var var5: Any = this.items.get(var2);
            q.f(var5, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory");
            var5 = var5 as ImageAttachmentMessageAccessory;
            val var6: MosaicItemMessageAttachmentImageViewHolder = var1 as MosaicItemMessageAttachmentImageViewHolder;
            val var3: Boolean;
            if (this.getItemCount() == 1) {
               var3 = true;
            } else {
               var3 = false;
            }

            var6.bindAttachment(
               var4,
               (ImageAttachmentMessageAccessory)var5,
               var3,
               new a(this, (ImageAttachmentMessageAccessory)var5, var1),
               new b(this, (ImageAttachmentMessageAccessory)var5),
               new Function0(this, (ImageAttachmentMessageAccessory)var5) {
                  final ImageAttachmentMessageAccessory $accessory;
                  final AttachmentMediaMosaicAdapter this$0;

                  {
                     super(0);
                     this.this$0 = var1;
                     this.$accessory = var2;
                  }

                  public final void invoke() {
                     AttachmentMediaMosaicAdapter.access$getOnItemSpoilerClicked$p(this.this$0).invoke(this.$accessory);
                  }
               },
               this.shouldAutoPlayGifs
            );
         } else {
            if (var1 !is MosaicItemMessageAttachmentVideoViewHolder) {
               val var7: Class = var1.getClass();
               val var9: StringBuilder = new StringBuilder();
               var9.append("Invalid view holder type ");
               var9.append(var7);
               throw new IllegalStateException(var9.toString().toString());
            }

            var var11: MosaicItemMessageAttachmentVideoViewHolder = this.items.get(var2);
            q.f(var11, "null cannot be cast to non-null type com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory");
            val var13: VideoAttachmentMessageAccessory = var11 as VideoAttachmentMessageAccessory;
            var11 = var1 as MosaicItemMessageAttachmentVideoViewHolder;
            val var8: Boolean;
            if (this.getItemCount() == 1) {
               var8 = true;
            } else {
               var8 = false;
            }

            var11.bindAttachment(var4, var13, var8, new c(this, var13, var1), new d(this, var13), new Function0(this, var13) {
               final VideoAttachmentMessageAccessory $accessory;
               final AttachmentMediaMosaicAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$accessory = var2;
               }

               public final void invoke() {
                  AttachmentMediaMosaicAdapter.access$getOnItemSpoilerClicked$p(this.this$0).invoke(this.$accessory);
               }
            });
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
