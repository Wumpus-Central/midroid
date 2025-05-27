package com.discord.chat.presentation.message.view.mosaic

import F1.b
import F1.c
import F1.d
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.R
import com.discord.chat.databinding.AttachmentMediaMosaicContainerViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.AccessoriesViewPool
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.mosaic_recycler.AttachmentMediaMosaicAdapter
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import kotlin.jvm.internal.q

public class AttachmentMediaMosaicContainerView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: AttachmentMediaMosaicContainerViewBinding
   private final val mosaicLayoutManager: MosaicLayoutManager
   private final val attachmentAdapter: AttachmentMediaMosaicAdapter
   private final var onAttachmentClicked: ((Int, MessageAccessory, MessagePartViewHolder) -> Unit)?
   private final var onAttachmentLongClicked: ((Int) -> Unit)?
   private final var onAttachmentSpoilerClicked: (() -> Unit)?
   private final var onAttachmentObscureToggle: ((Boolean) -> Unit)?

   fun AttachmentMediaMosaicContainerView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      val var4: AttachmentMediaMosaicContainerViewBinding = AttachmentMediaMosaicContainerViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      val var5: MosaicLayoutManager = new MosaicLayoutManager(var1);
      this.mosaicLayoutManager = var5;
      val var3: AttachmentMediaMosaicAdapter = new AttachmentMediaMosaicAdapter(var1, new F1.a(this), new b(this), new c(this), new d(this));
      this.attachmentAdapter = var3;
      val var6: RecyclerView = var4.mosaic;
      q.e(var4.mosaic);
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, var1.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
      var6.setRecycledViewPool(new AccessoriesViewPool());
      var6.setLayoutManager(var5);
      var6.setAdapter(var3);
   }

   @JvmStatic
   fun `attachmentAdapter$lambda$0`(var0: AttachmentMediaMosaicContainerView, var1: MessageAttachmentAccessory, var2: MessagePartViewHolder): Unit {
      q.h(var1, "item");
      q.h(var2, "viewHolder");
      if (var0.onAttachmentClicked != null) {
         var0.onAttachmentClicked.invoke(var0.getAttachmentIndex(var1), var1, var2);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `attachmentAdapter$lambda$1`(var0: AttachmentMediaMosaicContainerView, var1: MessageAttachmentAccessory): Unit {
      q.h(var1, "item");
      if (var0.onAttachmentLongClicked != null) {
         var0.onAttachmentLongClicked.invoke(var0.getAttachmentIndex(var1));
      }

      return Unit.a;
   }

   @JvmStatic
   fun `attachmentAdapter$lambda$2`(var0: AttachmentMediaMosaicContainerView, var1: MessageAttachmentAccessory): Unit {
      q.h(var1, "<unused var>");
      if (var0.onAttachmentSpoilerClicked != null) {
         var0.onAttachmentSpoilerClicked.invoke();
      }

      return Unit.a;
   }

   @JvmStatic
   fun `attachmentAdapter$lambda$3`(var0: AttachmentMediaMosaicContainerView, var1: Boolean): Unit {
      if (var0.onAttachmentObscureToggle != null) {
         var0.onAttachmentObscureToggle.invoke(var1);
      }

      return Unit.a;
   }

   private fun getAttachmentIndex(item: MessageAttachmentAccessory): Int {
      val var2: Int;
      if (var1 is ImageAttachmentMessageAccessory) {
         var2 = (var1 as ImageAttachmentMessageAccessory).getAttachmentIndex();
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
      onAttachmentObscureToggle: (Boolean) -> Unit,
      isForwardedContent: Boolean,
      constrainedWidth: Int,
      shouldAutoPlayGif: Boolean
   ) {
      q.h(var1, "attachments");
      q.h(var2, "eventHandler");
      q.h(var3, "onAttachmentClicked");
      q.h(var5, "onAttachmentSpoilerClicked");
      q.h(var6, "onAttachmentObscureToggle");
      val var10: RecyclerView.LayoutManager = this.binding.mosaic.getLayoutManager();
      q.f(var10, "null cannot be cast to non-null type com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager");
      (var10 as MosaicLayoutManager).setAvailableWidth(Math.min(MessageAccessoriesView.Companion.getWidth(var8, var7), SizeUtilsKt.getDpToPx(550)));
      this.onAttachmentClicked = var3;
      this.onAttachmentLongClicked = var4;
      this.onAttachmentSpoilerClicked = var5;
      this.onAttachmentObscureToggle = var6;
      this.attachmentAdapter.setChatEventHandler(var2);
      this.attachmentAdapter.setMediaItems(var1, var9);
   }
}
