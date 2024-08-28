package com.discord.media_player.reactevents

import com.discord.media_player.MediaSource
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.m0
import xk.n1

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
         n1.b(var1, 31, MediaPlayerPlaybackSource.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPlaybackSource, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: a2 = a2.a;
      var1.m(var2, 0, a2.a, var0.id);
      var1.m(var2, 1, var3, var0.assetUrl);
      var1.m(var2, 2, var3, var0.channelId);
      val var6: MessageId;
      if (var0.messageId != null) {
         var6 = MessageId.box-impl(var0.messageId);
      } else {
         var6 = null;
      }

      var1.m(var2, 3, com.discord.primitives.MessageId..serializer.INSTANCE, var6);
      var1.m(var2, 4, m0.a, var0.attachmentIndex);
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
         if (!r.c(this.id, var1.id)) {
            return false;
         } else if (!r.c(this.assetUrl, var1.assetUrl)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else {
            var var2: Boolean;
            label36: {
               if (this.messageId == null) {
                  if (var1.messageId == null) {
                     var2 = true;
                     break label36;
                  }
               } else if (var1.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var1.messageId);
                  break label36;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else {
               return r.c(this.attachmentIndex, var1.attachmentIndex);
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

   public object `$serializer` : f0<MediaPlayerPlaybackSource> {
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
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(var1), a.u(com.discord.primitives.MessageId..serializer.INSTANCE), a.u(m0.a)};
      }

      public open fun deserialize(decoder: Decoder): MediaPlayerPlaybackSource {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Int;
         var var5: Any;
         var var6: Any;
         var var7: Any;
         var var9: Any;
         var var14: Any;
         if (var12.p()) {
            var14 = a2.a;
            var9 = var12.n(var11, 0, a2.a, null);
            var7 = var12.n(var11, 1, (DeserializationStrategy)var14, null);
            var14 = (MessageId)var12.n(var11, 2, (DeserializationStrategy)var14, null);
            var6 = var12.n(var11, 3, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var5 = var12.n(var11, 4, m0.a, null);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var14 = null;
            var var8: Any = null;
            var7 = null;
            var5 = null;
            var6 = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var7 = var12.n(var11, 4, m0.a, var7);
                              var2 |= 16;
                           } else {
                              var8 = var12.n(var11, 3, com.discord.primitives.MessageId..serializer.INSTANCE, var8);
                              var2 |= 8;
                           }
                        } else {
                           var14 = (MessageId)var12.n(var11, 2, a2.a, var14);
                           var2 |= 4;
                        }
                     } else {
                        var5 = var12.n(var11, 1, a2.a, var5);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var12.n(var11, 0, a2.a, var6);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var5;
            var9 = var6;
            var5 = var7;
            var6 = var8;
         }

         var12.c(var11);
         val var21: java.lang.String = var9 as java.lang.String;
         var7 = var7 as java.lang.String;
         var9 = var14 as java.lang.String;
         var14 = var6 as MessageId;
         val var16: java.lang.String;
         if (var6 as MessageId != null) {
            var16 = var14.unbox-impl();
         } else {
            var16 = null;
         }

         return new MediaPlayerPlaybackSource(var2, var21, (java.lang.String)var7, (java.lang.String)var9, var16, var5 as Int, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaPlayerPlaybackSource) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaPlayerPlaybackSource.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun fromMediaSource(mediaSource: MediaSource): MediaPlayerPlaybackSource {
         r.h(var1, "mediaSource");
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

         val var7: StringBuilder = new StringBuilder();
         var7.append(var3);
         var7.append("[");
         var7.append(var4);
         var7.append("]:");
         var7.append(var2);
         return new MediaPlayerPlaybackSource(
            var7.toString(), var1.getSourceUrl(), java.lang.String.valueOf(var1.getChannelId-qMVnFVQ()), var1.getMessageId-N_6c4I0(), var1.getIndex(), null
         );
      }

      public fun serializer(): KSerializer<MediaPlayerPlaybackSource> {
         return MediaPlayerPlaybackSource.$serializer.INSTANCE;
      }
   }
}
