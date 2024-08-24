package com.discord.chat.presentation.message.view.mosaic

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.MessageState
import com.discord.chat.databinding.AttachmentMediaMosaicContainerViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.view.InlineForwardButtonView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public class AttachmentMediaMosaicContainerView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: AttachmentMediaMosaicContainerViewBinding

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
   }

   public fun setAttachments(
      messageId: MessageId,
      attachments: List<MessageAccessory>,
      constrainedWidth: Int,
      eventHandler: ChatEventHandler,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      onTapInlineForward: () -> Unit,
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean,
      messageState: MessageState,
      shouldAutoPlayGif: Boolean,
      useOldForwardIcon: Boolean
   ) {
      r.h(var1, "messageId");
      r.h(var2, "attachments");
      r.h(var4, "eventHandler");
      r.h(var5, "onAttachmentClicked");
      r.h(var7, "onAttachmentSpoilerClicked");
      r.h(var8, "onTapInlineForward");
      r.h(var11, "messageState");
      val var16: InlineForwardButtonView = this.binding.forward;
      r.g(this.binding.forward, "setAttachments_JJXpD5M$lambda$0");
      var var15: Boolean = false;
      val var14: Byte;
      if (var10) {
         var14 = 0;
      } else {
         var14 = 8;
      }

      var16.setVisibility(var14);
      if (var11 === MessageState.Sent) {
         var15 = true;
      }

      var16.configure(var15, var8, var13);
      this.binding.mosaic.setAttachments-a6FnO-k(var1, var2, var3, var4, var5, var6, var7, var9, var10, var12);
   }
}
