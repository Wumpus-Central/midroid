package com.discord.media_player.reactevents

import cl.f
import cl.n
import com.discord.media_player.MediaSource
import com.discord.primitives.MessageId
import dl.a
import fl.b2
import fl.g0
import fl.n0
import fl.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class MediaPlayerPlaybackSource(id: String?, assetUrl: String?, channelId: String?, messageId: MessageId?, attachmentIndex: Int?) : MediaPlayerPlaybackSource(
      var1, var2, var3, var4, var5
   ) {
   public final val assetUrl: String?
   public final val attachmentIndex: Int?
   public final val channelId: String?
   public final val id: String?
   public final val messageId: MessageId?

   fun MediaPlayerPlaybackSource(
      var1: Int,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: java.lang.String,
      var6: Int,
      var7: SerializationConstructorMarker
   ) {
      if (31 != (var1 and 31)) {
         o1.b(var1, 31, MediaPlayerPlaybackSource.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.assetUrl = var3;
      this.channelId = var4;
      this.messageId = var5;
      this.attachmentIndex = var6;
   }

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
         val var3: MediaPlayerPlaybackSource = var1 as MediaPlayerPlaybackSource;
         if (!q.c(this.id, (var1 as MediaPlayerPlaybackSource).id)) {
            return false;
         } else if (!q.c(this.assetUrl, var3.assetUrl)) {
            return false;
         } else if (!q.c(this.channelId, var3.channelId)) {
            return false;
         } else if (if (this.messageId == null) var3.messageId == null else var3.messageId != null && MessageId.equals-impl0(this.messageId, var3.messageId)) {
            return q.c(this.attachmentIndex, var3.attachmentIndex);
         } else {
            return false;
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
      val var3: java.lang.String = this.id;
      val var2: java.lang.String = this.assetUrl;
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
      var6.append(var3);
      var6.append(", assetUrl=");
      var6.append(var2);
      var6.append(", channelId=");
      var6.append(var4);
      var6.append(", messageId=");
      var6.append(var7);
      var6.append(", attachmentIndex=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaPlayerPlaybackSource.$serializer = new MediaPlayerPlaybackSource.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.media_player.reactevents.MediaPlayerPlaybackSource", var0, 5
         );
         var1.l("id", false);
         var1.l("assetUrl", false);
         var1.l("channelId", false);
         var1.l("messageId", false);
         var1.l("attachmentIndex", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: b2 = b2.a;
         return new KSerializer[]{a.u(b2.a), a.u(var1), a.u(var1), a.u(MessageId.$serializer.INSTANCE), a.u(n0.a)};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackSource {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         var var2: Int;
         var var5: java.lang.String;
         var var7: java.lang.String;
         val var9: java.lang.String;
         var var18: Any;
         var var20: java.lang.String;
         if (var11.y()) {
            val var12: b2 = b2.a;
            var7 = var11.v(var10, 0, b2.a, null) as java.lang.String;
            var9 = var11.v(var10, 1, var12, null) as java.lang.String;
            var5 = var11.v(var10, 2, var12, null) as java.lang.String;
            val var13: MessageId = var11.v(var10, 3, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var14: java.lang.String;
            if (var13 != null) {
               var14 = var13.unbox-impl();
            } else {
               var14 = null;
            }

            val var8: Int = var11.v(var10, 4, n0.a, null) as Int;
            var2 = 31;
            var20 = var14;
            var18 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var20 = null;
            var18 = null;
            var5 = null;
            var var16: java.lang.String = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var18 = var11.v(var10, 4, n0.a, var18) as Int;
                              var2 |= 16;
                           } else {
                              val var21: MessageId;
                              if (var20 != null) {
                                 var21 = MessageId.box-impl(var20);
                              } else {
                                 var21 = null;
                              }

                              val var22: MessageId = var11.v(var10, 3, MessageId.$serializer.INSTANCE, var21) as MessageId;
                              if (var22 != null) {
                                 var20 = var22.unbox-impl();
                              } else {
                                 var20 = null;
                              }

                              var2 |= 8;
                           }
                        } else {
                           var7 = var11.v(var10, 2, b2.a, var7) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var5 = var11.v(var10, 1, b2.a, var5) as java.lang.String;
                        var2 |= 2;
                     }
                  } else {
                     var16 = var11.v(var10, 0, b2.a, var16) as java.lang.String;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var5;
            var5 = var7;
            var7 = var16;
         }

         var11.b(var10);
         return new MediaPlayerPlaybackSource(var2, var7, var9, var5, var20, (Integer)var18, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackSource) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaPlayerPlaybackSource.write$Self$media_player_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun MediaSource.createId(): String {
         q.h(var1, "<this>");
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
         q.h(var1, "mediaSource");
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
