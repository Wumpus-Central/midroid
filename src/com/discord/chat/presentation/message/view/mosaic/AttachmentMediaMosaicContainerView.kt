package com.discord.chat.presentation.message.view.mosaic

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.discord.chat.R
import com.discord.chat.bridge.MessageState
import com.discord.chat.databinding.AttachmentMediaMosaicContainerViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.AccessoriesViewPool
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.InlineForwardButtonView
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.r

public class AttachmentMediaMosaicContainerView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: AttachmentMediaMosaicContainerViewBinding
   private final val attachmentAdapter: AttachmentMediaMosaicAdapter
   private final var onAttachmentClicked: ((Int, MessageAccessory, MessagePartViewHolder) -> Unit)?
   private final var onAttachmentLongClicked: ((Int) -> Unit)?
   private final var onAttachmentSpoilerClicked: (() -> Unit)?

   fun AttachmentMediaMosaicContainerView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var3: AttachmentMediaMosaicContainerViewBinding = AttachmentMediaMosaicContainerViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      val var5: AttachmentMediaMosaicAdapter = new AttachmentMediaMosaicAdapter(
         var1, new Function2<MessageAttachmentAccessory, MessagePartViewHolder, Unit>(this) {
            final AttachmentMediaMosaicContainerView this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(MessageAttachmentAccessory var1, MessagePartViewHolder var2) {
               r.h(var1, "item");
               r.h(var2, "viewHolder");
               val var3: Function3 = AttachmentMediaMosaicContainerView.access$getOnAttachmentClicked$p(this.this$0);
               if (var3 != null) {
                  var3.invoke(AttachmentMediaMosaicContainerView.access$getAttachmentIndex(this.this$0, var1), var1, var2);
               }
            }
         }, new Function1<MessageAttachmentAccessory, Unit>(this) {
            final AttachmentMediaMosaicContainerView this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(MessageAttachmentAccessory var1) {
               r.h(var1, "item");
               val var2: Function1 = AttachmentMediaMosaicContainerView.access$getOnAttachmentLongClicked$p(this.this$0);
               if (var2 != null) {
                  var2.invoke(AttachmentMediaMosaicContainerView.access$getAttachmentIndex(this.this$0, var1));
               }
            }
         }, new Function1<MessageAttachmentAccessory, Unit>(this) {
            final AttachmentMediaMosaicContainerView this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(MessageAttachmentAccessory var1) {
               r.h(var1, "<anonymous parameter 0>");
               val var2: Function0 = AttachmentMediaMosaicContainerView.access$getOnAttachmentSpoilerClicked$p(this.this$0);
               if (var2 != null) {
                  var2.invoke();
               }
            }
         }
      );
      this.attachmentAdapter = var5;
      val var6: RecyclerView = var3.mosaic;
      r.g(var3.mosaic, "_init_$lambda$1");
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, var1.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
      var6.setRecycledViewPool(new AccessoriesViewPool());
      val var4: MosaicLayoutManager = new MosaicLayoutManager(var1);
      var4.setRecycleChildrenOnDetach(false);
      var6.setLayoutManager(var4);
      var6.setAdapter(var5);
   }

   private fun getAttachmentIndex(item: MessageAttachmentAccessory): Int {
      val var2: Int;
      if (var1 is ImageAttachmentMessageAccessory) {
         var2 = var1.getAttachmentIndex();
      } else {
         if (var1 !is VideoAttachmentMessageAccessory) {
            val var3: StringBuilder = new StringBuilder();
            var3.append("Invalid accessory type: ");
            var3.append(var1);
            throw new IllegalStateException(var3.toString().toString());
         }

         var2 = (var1 as VideoAttachmentMessageAccessory).getIndex();
      }

      return var2;
   }

   public fun setAttachments(
      attachments: List<MessageAttachmentAccessory>,
      eventHandler: ChatEventHandler,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      onTapInlineForward: () -> Unit,
      isShowingInlineForward: Boolean,
      isForwardedContent: Boolean,
      constrainedWidth: Int,
      messageState: MessageState,
      shouldAutoPlayGif: Boolean,
      useOldForwardIcon: Boolean
   ) {
      r.h(var1, "attachments");
      r.h(var2, "eventHandler");
      r.h(var3, "onAttachmentClicked");
      r.h(var5, "onAttachmentSpoilerClicked");
      r.h(var6, "onTapInlineForward");
      r.h(var10, "messageState");
      val var15: InlineForwardButtonView = this.binding.forward;
      r.g(this.binding.forward, "setAttachments$lambda$2");
      var var14: Boolean = false;
      val var13: Byte;
      if (var7) {
         var13 = 0;
      } else {
         var13 = 8;
      }

      var15.setVisibility(var13);
      if (var10 === MessageState.Sent) {
         var14 = true;
      }

      var15.configure(var14, var6, var12);
      val var16: LayoutManager = this.binding.mosaic.getLayoutManager();
      r.f(var16, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager");
      val var17: MosaicLayoutManager = var16 as MosaicLayoutManager;
      (var16 as MosaicLayoutManager).setConstrainedWidth(var9);
      var17.setIsForwardedContent(var8);
      var17.setIsShowingInlineForward(var7);
      this.onAttachmentClicked = var3;
      this.onAttachmentLongClicked = var4;
      this.onAttachmentSpoilerClicked = var5;
      this.attachmentAdapter.setChatEventHandler(var2);
      this.attachmentAdapter.setMediaItems(var1, var11);
   }
}
