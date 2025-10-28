package com.discord.media_player.reactevents

import com.discord.media_player.MediaSource
import com.discord.primitives.MessageId
import kotlinx.serialization.KSerializer
import wc.m

@m
public data class MediaPlayerPlaybackSource(id: String?, assetUrl: String?, channelId: String?, messageId: MessageId?, attachmentIndex: Int?) : MediaPlayerPlaybackSource(
      var1, var2, var3, var4, var5
   ) {
   public final val id: String?
   public final val assetUrl: String?
   public final val channelId: String?
   public final val messageId: MessageId?
   public final val attachmentIndex: Int?

   fun MediaPlayerPlaybackSource(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String, var5: Int) {
      super();
      this.id = var1;
      this.assetUrl = var2;
      this.channelId = var3;
      this.messageId = var4;
      this.attachmentIndex = var5;
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String? {
      return this.assetUrl;
   }

   public operator fun component3(): String? {
      return this.channelId;
   }

   public operator fun component4(): MessageId? {
      return this.messageId;
   }

   public operator fun component5(): Int? {
      return this.attachmentIndex;
   }

   public fun copy(id: String? = ..., assetUrl: String? = ..., channelId: String? = ..., messageId: MessageId? = ..., attachmentIndex: Int? = ...): MediaPlayerPlaybackSource {
      return new MediaPlayerPlaybackSource(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPlaybackSource) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.assetUrl == var1.assetUrl)) {
            return false;
         } else if (!(this.channelId == var1.channelId)) {
            return false;
         } else {
            var var2: Boolean;
            label37: {
               if (this.messageId == null) {
                  if (var1.messageId == null) {
                     var2 = true;
                     break label37;
                  }
               } else if (var1.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var1.messageId);
                  break label37;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else {
               return this.attachmentIndex == var1.attachmentIndex;
            }
         }
      }
   }

   public override fun hashCode(): Int {
      var var5: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var2: Int;
      if (this.assetUrl == null) {
         var2 = 0;
      } else {
         var2 = this.assetUrl.hashCode();
      }

      val var3: Int;
      if (this.channelId == null) {
         var3 = 0;
      } else {
         var3 = this.channelId.hashCode();
      }

      val var4: Int;
      if (this.messageId == null) {
         var4 = 0;
      } else {
         var4 = MessageId.hashCode-impl(this.messageId);
      }

      if (this.attachmentIndex != null) {
         var5 = this.attachmentIndex.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.id;
      val var3: java.lang.String = this.assetUrl;
      val var4: java.lang.String = this.channelId;
      val var7: java.lang.String;
      if (this.messageId == null) {
         var7 = "null";
      } else {
         var7 = MessageId.toString-impl(this.messageId);
      }

      val var5: Int = this.attachmentIndex;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaPlayerPlaybackSource(id=");
      var6.append(var2);
      var6.append(", assetUrl=");
      var6.append(var3);
      var6.append(", channelId=");
      var6.append(var4);
      var6.append(", messageId=");
      var6.append(var7);
      var6.append(", attachmentIndex=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun MediaSource.createId(): String {
         var var3: java.lang.String = var1.getMessageId-N_6c4I0();
         if (var3 == null) {
            var3 = "null";
         } else {
            var3 = MessageId.toString-impl(var3);
         }

         val var4: Int = var1.getIndex();
         val var5: java.lang.String = var1.getSourceUrl();
         val var2: Int;
         if (var5 != null) {
            var2 = var5.hashCode();
         } else {
            var2 = 0;
         }

         val var6: StringBuilder = new StringBuilder();
         var6.append(var3);
         var6.append(".");
         var6.append(var4);
         var6.append(":");
         var6.append(var2);
         return var6.toString();
      }

      public fun fromMediaSource(mediaSource: MediaSource): MediaPlayerPlaybackSource {
         return new MediaPlayerPlaybackSource(
            MediaPlayerPlaybackSource.Companion.createId(var1),
            var1.getSourceUrl(),
            java.lang.String.valueOf(var1.getChannelId-qMVnFVQ()),
            var1.getMessageId-N_6c4I0(),
            var1.getIndex(),
            null
         );
      }

      public fun serializer(): KSerializer<MediaPlayerPlaybackSource> {
         return MediaPlayerPlaybackSource.$serializer.INSTANCE;
      }
   }
}
