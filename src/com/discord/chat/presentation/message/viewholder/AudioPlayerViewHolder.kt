package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.view.View
import android.view.View.OnAttachStateChangeListener
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerUtilsKt
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayerManagerModule
import com.discord.media_player.MediaSource
import com.discord.primitives.UserId
import com.facebook.react.uimanager.ThemedReactContext
import kotlin.jvm.functions.Function2

public class AudioPlayerViewHolder(view: AudioPlayerView) : MessagePartViewHolder {
   private final val view: AudioPlayerView
   private final val mediaPlayerManagerModule: MediaPlayerManagerModule?
   private final var onAttachStateChangeListener: OnAttachStateChangeListener

   init {
      kotlin.jvm.internal.q.h(var1, "view");
      super(var1, null);
      this.view = var1;
      val var3: Context = var1.getContext();
      kotlin.jvm.internal.q.g(var3, "getContext(...)");
      var var4: Context = var3;
      if (var3 !is ThemedReactContext) {
         var4 = null;
      }

      val var6: ThemedReactContext = var4 as ThemedReactContext;
      var var5: MediaPlayerManagerModule = null;
      if (var6 != null) {
         var5 = var6.getNativeModule(MediaPlayerManagerModule.class) as MediaPlayerManagerModule;
      }

      this.mediaPlayerManagerModule = var5;
      this.onAttachStateChangeListener = new OnAttachStateChangeListener() {
         public void onViewAttachedToWindow(View var1) {
            kotlin.jvm.internal.q.h(var1, "view");
         }

         public void onViewDetachedFromWindow(View var1) {
            kotlin.jvm.internal.q.h(var1, "view");
         }
      };
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

   private fun configureVisibilityObservers(accessory: AudioAttachmentMessageAccessory, mediaSource: MediaSource) {
      this.onAttachStateChangeListener.onViewDetachedFromWindow(this.view);
      this.view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
      val var3: OnAttachStateChangeListener = new OnAttachStateChangeListener(this, var1, var2) {
         final AudioAttachmentMessageAccessory $accessory;
         final MediaSource $mediaSource;
         final AudioPlayerViewHolder this$0;

         {
            this.this$0 = var1;
            this.$accessory = var2;
            this.$mediaSource = var3;
         }

         public void onViewAttachedToWindow(View var1) {
            kotlin.jvm.internal.q.h(var1, "view");
            val var2: MediaPlayerManagerModule = AudioPlayerViewHolder.access$getMediaPlayerManagerModule$p(this.this$0);
            if (var2 != null) {
               var2.onMediaPlayerViewWillAppear-LJLSWy8(this.$accessory.getChannelId-o4g7jtM(), this.$mediaSource);
            }
         }

         public void onViewDetachedFromWindow(View var1) {
            kotlin.jvm.internal.q.h(var1, "view");
            val var2: MediaPlayerManagerModule = AudioPlayerViewHolder.access$getMediaPlayerManagerModule$p(this.this$0);
            if (var2 != null) {
               var2.onMediaPlayerViewDetached-LJLSWy8(this.$accessory.getChannelId-o4g7jtM(), this.$mediaSource);
            }
         }
      };
      this.onAttachStateChangeListener = var3;
      this.view.addOnAttachStateChangeListener(var3);
      this.onAttachStateChangeListener.onViewAttachedToWindow(this.view);
   }

   public fun bind(accessory: AudioAttachmentMessageAccessory, eventHandler: ChatEventHandler, onLongClicked: ((String, Int?) -> Unit)?) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      val var7: AudioPlayerManager.AudioSource = AudioPlayerUtilsKt.toAudioSource(var1);
      this.configureVisibilityObservers(var1, AudioPlayerUtilsKt.toMediaSource$default(var7, null, 1, null));
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
      val var9: AudioPlayerView = this.view;
      this.view.setSourceUrl(var1);
      val var4: ByteArray = var6.getWaveformByteArray();
      val var11: Unit;
      if (var4 != null) {
         var9.setSampleData(var4);
         var11 = Unit.a;
      } else {
         var11 = null;
      }

      if (var11 == null) {
         var9.setAudioFileDetails(var1.getAttachment());
      }

      val var10: java.lang.Float = var6.getDurationSecs();
      var var12: Unit = null;
      if (var10 != null) {
         var9.setDurationMs((long)(var10.floatValue() * (float)1000));
         var12 = Unit.a;
      }

      if (var12 == null) {
         var9.setUnknownDuration();
      }

      var9.setUploadProgress(var8);
      var9.setOnLongPress(new d(var3, var1));
      var9.shouldAnimate(var6.isAnimated());
      var9.setContainerBackgroundColor(var1.getColor());
      var9.setListener(new AudioPlayerView.Listener(var6, var2, var1, var7) {
         final AudioAttachmentMessageAccessory $accessory;
         final AudioPlayerManager.AudioSource $audioSource;
         final ChatEventHandler $eventHandler;
         final Attachment $this_with;

         {
            this.$this_with = var1;
            this.$eventHandler = var2;
            this.$accessory = var3;
            this.$audioSource = var4;
         }

         @Override
         public void mediaAttachmentPlaybackEnded(float var1, float var2) {
            val var7: java.lang.Float = this.$this_with.getDurationSecs();
            val var3: Float;
            if (var7 != null) {
               var3 = var7;
            } else {
               val var13: MediaPlayer = AudioPlayerManager.INSTANCE.getPlayer(this.$audioSource);
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
               val var12: MediaPlayer = AudioPlayerManager.INSTANCE.getPlayer(this.$audioSource);
               val var3: Long;
               if (var12 != null) {
                  var3 = var12.durationMs();
               } else {
                  var3 = 0L;
               }

               var2 = (float)var3 * 1000.0F;
            }

            val var9: ChatEventHandler = this.$eventHandler;
            val var8: java.lang.String = this.$accessory.getMessageId-3Eiw7ao();
            val var13: UserId = this.$accessory.getAuthorId-wUX8bhU();
            if (var13 != null) {
               val var10: Long = var13.unbox-impl();
               val var5: Boolean = this.$accessory.isVoiceMessage();
               val var7: java.lang.String = this.$accessory.getAttachment().getId();
               var var14: java.lang.String = var7;
               if (var7 == null) {
                  var14 = "";
               }

               var9.mediaAttachmentPlaybackStarted-jd4C3YQ(var8, var2, var1, var10, var5, var14);
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

   public fun onViewRecycled() {
      this.view.removeOnAttachStateChangeListener(this.onAttachStateChangeListener);
      this.onAttachStateChangeListener.onViewDetachedFromWindow(this.view);
   }
}
