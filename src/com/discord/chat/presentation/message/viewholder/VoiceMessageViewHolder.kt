package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.primitives.UserId
import kotlin.jvm.functions.Function2

public class VoiceMessageViewHolder(view: AudioPlayerView) : MessagePartViewHolder {
   private final val view: AudioPlayerView

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(accessory: AudioAttachmentMessageAccessory, eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      val var4: Attachment = var1.getAttachment();
      val var5: ByteArray = var4.getWaveformByteArray();
      if (var5 != null) {
         val var6: java.lang.Float = var4.getDurationSecs();
         if (var6 != null) {
            val var3: Float = var6;
            val var7: UploadItemProps = var1.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(var2) {
               {
                  super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
               }

               public final void invoke(java.lang.String var1, java.lang.String var2) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
               }
            });
            val var8: AudioPlayerView = this.view;
            this.view.setSourceUrl-ntcYbpo(var1.getMessageId-3Eiw7ao(), var1.getAttachment().getUrl());
            var8.setSampleData(var5);
            var8.setDurationMs((long)((float)1000 * var3));
            var8.setUploadProgress(var7);
            var8.shouldAnimate(var4.isAnimated());
            var8.setContainerBackgroundColor(var1.getColor());
            var8.setListener(new AudioPlayerView.Listener(var2, var1, var3) {
               final AudioAttachmentMessageAccessory $accessory;
               final float $durationSecs;
               final ChatEventHandler $eventHandler;

               {
                  this.$eventHandler = var1;
                  this.$accessory = var2;
                  this.$durationSecs = var3;
               }

               @Override
               public void voiceMessagePlaybackEnded(float var1, float var2) {
                  val var4: ChatEventHandler = this.$eventHandler;
                  val var5: java.lang.String = this.$accessory.getMessageId-3Eiw7ao();
                  val var3: Float = this.$durationSecs;
                  val var6: UserId = this.$accessory.getAuthorId-wUX8bhU();
                  if (var6 != null) {
                     var4.voiceMessagePlaybackEnded-HuwN0RY(var5, var3, var1, var6.unbox-impl(), var2);
                  }
               }

               @Override
               public void voiceMessagePlaybackFailed(java.lang.String var1) {
                  this.$eventHandler.voiceMessagePlaybackFailed-ntcYbpo(this.$accessory.getMessageId-3Eiw7ao(), var1);
               }

               @Override
               public void voiceMessagePlaybackStarted(float var1) {
                  val var5: ChatEventHandler = this.$eventHandler;
                  val var4: java.lang.String = this.$accessory.getMessageId-3Eiw7ao();
                  val var2: Float = this.$durationSecs;
                  val var3: UserId = this.$accessory.getAuthorId-wUX8bhU();
                  if (var3 != null) {
                     var5.voiceMessagePlaybackStarted-OuNwOLg(var4, var2, var1, var3.unbox-impl());
                  }
               }
            });
         }
      }
   }
}
