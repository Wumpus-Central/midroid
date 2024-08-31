package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerUtilsKt
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.media_player.MediaPlayer
import com.discord.primitives.UserId
import kotlin.jvm.functions.Function2

public class AudioPlayerViewHolder(view: AudioPlayerView) : MessagePartViewHolder {
   private final val view: AudioPlayerView

   init {
      kotlin.jvm.internal.q.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   @JvmStatic
   fun `bind$lambda$4$lambda$3$lambda$2`(var0: Function2, var1: AudioAttachmentMessageAccessory, var2: View): Boolean {
      kotlin.jvm.internal.q.h(var1, "$accessory");
      if (var0 != null) {
         val var3: java.lang.String = var1.getAttachment().getId();
         var var4: java.lang.String = var3;
         if (var3 == null) {
            var4 = "";
         }

         var0.invoke(var4, var1.getAttachmentIndex());
      }

      return true;
   }

   public fun bind(accessory: AudioAttachmentMessageAccessory, eventHandler: ChatEventHandler, onLongClicked: ((String, Int?) -> Unit)?) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      val var6: Attachment = var1.getAttachment();
      val var8: UploadItemProps = var1.getUploadItemProps(new Function2(var2) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            kotlin.jvm.internal.q.h(var1, "p0");
            kotlin.jvm.internal.q.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var7: AudioPlayerView = this.view;
      this.view.setSourceUrl(var1);
      val var4: ByteArray = var6.getWaveformByteArray();
      val var10: Unit;
      if (var4 != null) {
         var7.setSampleData(var4);
         var10 = Unit.a;
      } else {
         var10 = null;
      }

      if (var10 == null) {
         var7.setAudioFileDetails(var1.getAttachment());
      }

      val var9: java.lang.Float = var6.getDurationSecs();
      var var11: Unit = null;
      if (var9 != null) {
         var7.setDurationMs((long)(var9.floatValue() * (float)1000));
         var11 = Unit.a;
      }

      if (var11 == null) {
         var7.setUnknownDuration();
      }

      var7.setUploadProgress(var8);
      var7.setOnLongPress(new d(var3, var1));
      var7.shouldAnimate(var6.isAnimated());
      var7.setContainerBackgroundColor(var1.getColor());
      var7.setListener(new AudioPlayerView.Listener(var6, var2, var1) {
         final AudioAttachmentMessageAccessory $accessory;
         final ChatEventHandler $eventHandler;
         final Attachment $this_with;

         {
            this.$this_with = var1;
            this.$eventHandler = var2;
            this.$accessory = var3;
         }

         @Override
         public void mediaAttachmentPlaybackEnded(float var1, float var2) {
            val var7: java.lang.Float = this.$this_with.getDurationSecs();
            val var3: Float;
            if (var7 != null) {
               var3 = var7;
            } else {
               val var13: MediaPlayer = AudioPlayerManager.INSTANCE.getPlayer(AudioPlayerUtilsKt.toAudioSource(this.$accessory));
               val var4: Long;
               if (var13 != null) {
                  var4 = var13.durationMs();
               } else {
                  var4 = 0L;
               }

               var3 = (float)var4 * 1000.0F;
            }

            val var9: ChatEventHandler = this.$eventHandler;
            val var10: java.lang.String = this.$accessory.getMessageId-3Eiw7ao();
            val var14: UserId = this.$accessory.getAuthorId-wUX8bhU();
            if (var14 != null) {
               val var11: Long = var14.unbox-impl();
               val var6: Boolean = this.$accessory.isVoiceMessage();
               val var8: java.lang.String = this.$accessory.getAttachment().getId();
               var var15: java.lang.String = var8;
               if (var8 == null) {
                  var15 = "";
               }

               var9.mediaAttachmentPlaybackEnded-O97gnAM(var10, var3, var1, var11, var2, var6, var15);
            }
         }

         @Override
         public void mediaAttachmentPlaybackStarted(float var1) {
            val var6: java.lang.Float = this.$this_with.getDurationSecs();
            val var2: Float;
            if (var6 != null) {
               var2 = var6;
            } else {
               val var12: MediaPlayer = AudioPlayerManager.INSTANCE.getPlayer(AudioPlayerUtilsKt.toAudioSource(this.$accessory));
               val var3: Long;
               if (var12 != null) {
                  var3 = var12.durationMs();
               } else {
                  var3 = 0L;
               }

               var2 = (float)var3 * 1000.0F;
            }

            val var8: ChatEventHandler = this.$eventHandler;
            val var9: java.lang.String = this.$accessory.getMessageId-3Eiw7ao();
            val var13: UserId = this.$accessory.getAuthorId-wUX8bhU();
            if (var13 != null) {
               val var10: Long = var13.unbox-impl();
               val var5: Boolean = this.$accessory.isVoiceMessage();
               val var7: java.lang.String = this.$accessory.getAttachment().getId();
               var var14: java.lang.String = var7;
               if (var7 == null) {
                  var14 = "";
               }

               var8.mediaAttachmentPlaybackStarted-jd4C3YQ(var9, var2, var1, var10, var5, var14);
            }
         }

         @Override
         public void voiceMessagePlaybackFailed(java.lang.String var1) {
            if (this.$accessory.isVoiceMessage()) {
               this.$eventHandler.voiceMessagePlaybackFailed-ntcYbpo(this.$accessory.getMessageId-3Eiw7ao(), var1);
            }
         }
      });
   }
}
