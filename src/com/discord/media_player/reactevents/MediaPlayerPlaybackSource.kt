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
import xk.x

@f
public data class MediaPlayerPlaybackSource(id: String?, assetUrl: String?, messageId: MessageId?, attachmentIndex: Int?, portal: Double?) : MediaPlayerPlaybackSource(
      var1, var2, var3, var4, var5
   ) {
   public final val assetUrl: String?
   public final val attachmentIndex: Int?
   public final val id: String?
   public final val messageId: MessageId?
   public final val portal: Double?

   fun MediaPlayerPlaybackSource(
      var1: Int,
      var2: java.lang.String,
      var3: java.lang.String,
      var4: java.lang.String,
      var5: Int,
      var6: java.lang.Double,
      var7: SerializationConstructorMarker
   ) {
      if (31 != (var1 and 31)) {
         n1.b(var1, 31, MediaPlayerPlaybackSource.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.assetUrl = var3;
      this.messageId = var4;
      this.attachmentIndex = var5;
      this.portal = var6;
   }

   fun MediaPlayerPlaybackSource(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: Int, var5: java.lang.Double) {
      super();
      this.id = var1;
      this.assetUrl = var2;
      this.messageId = var3;
      this.attachmentIndex = var4;
      this.portal = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaPlayerPlaybackSource, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      val var3: a2 = a2.a;
      var1.m(var2, 0, a2.a, var0.id);
      var1.m(var2, 1, var3, var0.assetUrl);
      val var6: MessageId;
      if (var0.messageId != null) {
         var6 = MessageId.box-impl(var0.messageId);
      } else {
         var6 = null;
      }

      var1.m(var2, 2, com.discord.primitives.MessageId..serializer.INSTANCE, var6);
      var1.m(var2, 3, m0.a, var0.attachmentIndex);
      var1.m(var2, 4, x.a, var0.portal);
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component2(): String? {
      return this.assetUrl;
   }

   public operator fun component3(): MessageId? {
      return this.messageId;
   }

   public operator fun component4(): Int? {
      return this.attachmentIndex;
   }

   public operator fun component5(): Double? {
      return this.portal;
   }

   public fun copy(id: String? = ..., assetUrl: String? = ..., messageId: MessageId? = ..., attachmentIndex: Int? = ..., portal: Double? = ...): MediaPlayerPlaybackSource {
      return new MediaPlayerPlaybackSource(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaPlayerPlaybackSource) {
         return false;
      } else {
         val var4: MediaPlayerPlaybackSource = var1 as MediaPlayerPlaybackSource;
         if (!r.c(this.id, (var1 as MediaPlayerPlaybackSource).id)) {
            return false;
         } else if (!r.c(this.assetUrl, var4.assetUrl)) {
            return false;
         } else {
            var var2: Boolean;
            label37: {
               if (this.messageId == null) {
                  if (var4.messageId == null) {
                     var2 = true;
                     break label37;
                  }
               } else if (var4.messageId != null) {
                  var2 = MessageId.equals-impl0(this.messageId, var4.messageId);
                  break label37;
               }

               var2 = false;
            }

            if (!var2) {
               return false;
            } else if (!r.c(this.attachmentIndex, var4.attachmentIndex)) {
               return false;
            } else {
               return r.c(this.portal, var4.portal);
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
      if (this.messageId == null) {
         var3 = 0;
      } else {
         var3 = MessageId.hashCode-impl(this.messageId);
      }

      val var4: Int;
      if (this.attachmentIndex == null) {
         var4 = 0;
      } else {
         var4 = this.attachmentIndex.hashCode();
      }

      if (this.portal != null) {
         var5 = this.portal.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.id;
      val var3: java.lang.String = this.assetUrl;
      val var7: java.lang.String;
      if (this.messageId == null) {
         var7 = "null";
      } else {
         var7 = MessageId.toString-impl(this.messageId);
      }

      val var4: Int = this.attachmentIndex;
      val var6: java.lang.Double = this.portal;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MediaPlayerPlaybackSource(id=");
      var5.append(var2);
      var5.append(", assetUrl=");
      var5.append(var3);
      var5.append(", messageId=");
      var5.append(var7);
      var5.append(", attachmentIndex=");
      var5.append(var4);
      var5.append(", portal=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
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
         var1.l("messageId", false);
         var1.l("attachmentIndex", false);
         var1.l("portal", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: a2 = a2.a;
         return new KSerializer[]{a.u(a2.a), a.u(var1), a.u(com.discord.primitives.MessageId..serializer.INSTANCE), a.u(m0.a), a.u(x.a)};
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
            val var8: Any = var12.n(var11, 0, a2.a, null);
            var5 = (MessageId)var12.n(var11, 1, (DeserializationStrategy)var14, null);
            var7 = var12.n(var11, 2, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var6 = var12.n(var11, 3, m0.a, null);
            var14 = var12.n(var11, 4, x.a, null);
            var2 = 31;
            var9 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = null;
            var var20: Any = null;
            var7 = null;
            var6 = null;
            var14 = null;

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

                              var7 = var12.n(var11, 4, x.a, var7);
                              var2 |= 16;
                           } else {
                              var20 = var12.n(var11, 3, m0.a, var20);
                              var2 |= 8;
                           }
                        } else {
                           var6 = var12.n(var11, 2, com.discord.primitives.MessageId..serializer.INSTANCE, var6);
                           var2 |= 4;
                        }
                     } else {
                        var5 = (MessageId)var12.n(var11, 1, a2.a, var5);
                        var2 |= 2;
                     }
                  } else {
                     var14 = var12.n(var11, 0, a2.a, var14);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var14;
            var7 = var6;
            var14 = var7;
            var6 = var20;
         }

         var12.c(var11);
         val var21: java.lang.String = var9 as java.lang.String;
         var9 = var5 as java.lang.String;
         var5 = var7 as MessageId;
         val var17: java.lang.String;
         if (var7 as MessageId != null) {
            var17 = var5.unbox-impl();
         } else {
            var17 = null;
         }

         return new MediaPlayerPlaybackSource(var2, var21, (java.lang.String)var9, var17, var6 as Integer, var14 as java.lang.Double, null, null);
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
         var var2: java.lang.String = var1.getMessageId-N_6c4I0();
         if (var2 == null) {
            var2 = "null";
         } else {
            var2 = MessageId.toString-impl(var2);
         }

         val var4: Int = var1.getIndex();
         val var5: java.lang.String = var1.getSourceUrl();
         val var3: StringBuilder = new StringBuilder();
         var3.append(var2);
         var3.append(".");
         var3.append(var4);
         var3.append(" ");
         var3.append(var5);
         return new MediaPlayerPlaybackSource(var3.toString(), var1.getSourceUrl(), var1.getMessageId-N_6c4I0(), var1.getIndex(), var1.getPortal(), null);
      }

      public fun serializer(): KSerializer<MediaPlayerPlaybackSource> {
         return MediaPlayerPlaybackSource.$serializer.INSTANCE;
      }
   }
}
