package com.discord.chat.presentation.message.view.mosaic

import android.content.Context
import android.util.AttributeSet
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import com.discord.primitives.MessageId
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

public class AttachmentMediaMosaicView  public constructor(context: Context, attrs: AttributeSet? = null) : MediaMosaicView<MessageAccessory> {
   private final lateinit var eventHandler: ChatEventHandler

   fun AttachmentMediaMosaicView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
   }

   private fun getAttachmentIndex(item: MosaicMediaItem<MessageAccessory>): Int {
      val var3: MessageAccessory = var1.getOriginalItem() as MessageAccessory;
      val var2: Int;
      if (var3 is ImageAttachmentMessageAccessory) {
         var2 = (var1.getOriginalItem() as ImageAttachmentMessageAccessory).getAttachmentIndex();
      } else {
         if (var3 !is VideoAttachmentMessageAccessory) {
            val var4: StringBuilder = new StringBuilder();
            var4.append("Invalid accessory type: ");
            var4.append(var1);
            throw new IllegalStateException(var4.toString().toString());
         }

         var2 = (var1.getOriginalItem() as VideoAttachmentMessageAccessory).getIndex();
      }

      return var2;
   }

   public override fun createItemHolder(item: MosaicMediaItem<MessageAccessory>): MessagePartViewHolder {
      r.h(var1, "item");
      val var5: MessageAccessory = var1.getOriginalItem() as MessageAccessory;
      val var8: Any;
      if (var5 is ImageAttachmentMessageAccessory) {
         val var6: Context = this.getContext();
         r.g(var6, "context");
         val var13: MediaImageView = new MediaImageView(var6, null, 2, null);
         var var7: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            r.y("eventHandler");
            var7 = null;
         }

         var8 = new MosaicItemMessageAttachmentImageViewHolder(var13, var7);
      } else {
         if (var5 !is VideoAttachmentMessageAccessory) {
            val var12: StringBuilder = new StringBuilder();
            var12.append("Invalid accessory type: ");
            var12.append(var1);
            throw new IllegalStateException(var12.toString().toString());
         }

         val var9: Context = this.getContext();
         r.g(var9, "context");
         val var11: MediaVideoView = new MediaVideoView(var9, null, 2, null);
         var var10: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            r.y("eventHandler");
            var10 = null;
         }

         var8 = new MosaicItemMessageAttachmentVideoViewHolder(var11, var10);
      }

      return (MessagePartViewHolder)var8;
   }

   public fun setAttachments(
      messageId: MessageId,
      attachments: List<MessageAccessory>,
      constrainedWidth: Int,
      eventHandler: ChatEventHandler,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean,
      shouldAutoPlayGif: Boolean
   ) {
      r.h(var1, "messageId");
      r.h(var2, "attachments");
      r.h(var4, "eventHandler");
      r.h(var5, "onAttachmentClicked");
      r.h(var7, "onAttachmentSpoilerClicked");
      this.eventHandler = var4;
      val var14: ArrayList = new ArrayList(h.t(var2, 10));

      for (MessageAccessory var12 : var2) {
         var14.add(new MosaicMediaItem<>(var12.getItemId(), var12));
      }

      val var15: Function2 = new Function2<MosaicMediaItem<MessageAccessory>, MessagePartViewHolder, Unit>(this, var5) {
         final Function3<Integer, MessageAccessory, MessagePartViewHolder, Unit> $onAttachmentClicked;
         final AttachmentMediaMosaicView this$0;

         {
            super(2);
            this.this$0 = var1;
            this.$onAttachmentClicked = var2;
         }

         public final void invoke(MosaicMediaItem<MessageAccessory> var1, MessagePartViewHolder var2) {
            r.h(var1, "item");
            r.h(var2, "view");
            this.$onAttachmentClicked.invoke(AttachmentMediaMosaicView.access$getAttachmentIndex(this.this$0, var1), var1.getOriginalItem(), var2);
         }
      };
      val var13: Function1;
      if (var6 != null) {
         var13 = new Function1<MosaicMediaItem<MessageAccessory>, java.lang.Boolean>(this, var6) {
            final Function1<Integer, Unit> $onLongClick;
            final AttachmentMediaMosaicView this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$onLongClick = var2;
            }

            public final java.lang.Boolean invoke(MosaicMediaItem<MessageAccessory> var1) {
               r.h(var1, "item");
               this.$onLongClick.invoke(AttachmentMediaMosaicView.access$getAttachmentIndex(this.this$0, var1));
               return java.lang.Boolean.TRUE;
            }
         };
      } else {
         var13 = null;
      }

      this.setItems(
         MessageId.toString-impl(var1), "AttachmentsMosaic", var14, var3, var15, var13, new Function1<MosaicMediaItem<MessageAccessory>, Unit>(var7) {
            final Function0<Unit> $onAttachmentSpoilerClicked;

            {
               super(1);
               this.$onAttachmentSpoilerClicked = var1;
            }

            public final void invoke(MosaicMediaItem<MessageAccessory> var1) {
               r.h(var1, "<anonymous parameter 0>");
               this.$onAttachmentSpoilerClicked.invoke();
            }
         }, var10, var8, var9
      );
   }
}
