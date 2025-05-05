package com.discord.chat.reactevents

import aa.f
import aa.n
import ba.a
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import da.C0
import da.G
import da.p0
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
public data class TapSoundmojiData(soundId: String, channelId: String, guildId: String? = ..., messageId: MessageId? = ...) : TapSoundmojiData(
         var1, var2, var3, var4
      ),
   ReactEvent {
   public final val channelId: String
   public final val guildId: String?
   public final val messageId: MessageId?
   public final val soundId: String

   fun TapSoundmojiData(
      var1: Int, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String, var5: java.lang.String, var6: SerializationConstructorMarker
   ) {
      if (3 != (var1 and 3)) {
         p0.b(var1, 3, TapSoundmojiData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.soundId = var2;
      this.channelId = var3;
      if ((var1 and 4) == 0) {
         this.guildId = null;
      } else {
         this.guildId = var4;
      }

      if ((var1 and 8) == 0) {
         this.messageId = null;
      } else {
         this.messageId = var5;
      }
   }

   fun TapSoundmojiData(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String) {
      q.h(var1, "soundId");
      q.h(var2, "channelId");
      super();
      this.soundId = var1;
      this.channelId = var2;
      this.guildId = var3;
      this.messageId = var4;
   }

   public operator fun component1(): String {
      return this.soundId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.guildId;
   }

   public operator fun component4(): MessageId? {
      return this.messageId;
   }

   public fun copy(soundId: String = ..., channelId: String = ..., guildId: String? = ..., messageId: MessageId? = ...): TapSoundmojiData {
      q.h(var1, "soundId");
      q.h(var2, "channelId");
      return new TapSoundmojiData(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapSoundmojiData) {
         return false;
      } else {
         val var3: TapSoundmojiData = var1 as TapSoundmojiData;
         if (!q.c(this.soundId, (var1 as TapSoundmojiData).soundId)) {
            return false;
         } else if (!q.c(this.channelId, var3.channelId)) {
            return false;
         } else if (!q.c(this.guildId, var3.guildId)) {
            return false;
         } else {
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  return true;
               }
            } else if (var3.messageId != null) {
               return MessageId.equals-impl0(this.messageId, var3.messageId);
            }

            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.soundId.hashCode();
      val var3: Int = this.channelId.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.guildId == null) {
         var1 = 0;
      } else {
         var1 = this.guildId.hashCode();
      }

      if (this.messageId != null) {
         var2 = MessageId.hashCode-impl(this.messageId);
      }

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.soundId;
      val var2: java.lang.String = this.channelId;
      val var4: java.lang.String = this.guildId;
      val var6: java.lang.String;
      if (this.messageId == null) {
         var6 = "null";
      } else {
         var6 = MessageId.toString-impl(this.messageId);
      }

      val var5: StringBuilder = new StringBuilder();
      var5.append("TapSoundmojiData(soundId=");
      var5.append(var3);
      var5.append(", channelId=");
      var5.append(var2);
      var5.append(", guildId=");
      var5.append(var4);
      var5.append(", messageId=");
      var5.append(var6);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapSoundmojiData.$serializer = new TapSoundmojiData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapSoundmojiData", var0, 4);
         var1.l("soundId", false);
         var1.l("channelId", false);
         var1.l("guildId", true);
         var1.l("messageId", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{C0.a, C0.a, a.u(C0.a), a.u(MessageId.$serializer.INSTANCE)};
      }

      public open fun deserialize(decoder: Decoder): TapSoundmojiData {
         q.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.c(var10);
         val var5: Boolean = var11.y();
         var var12: java.lang.String = null;
         var var2: Int;
         var var7: java.lang.String;
         var var8: java.lang.String;
         val var19: java.lang.String;
         if (var5) {
            var7 = var11.t(var10, 0);
            var8 = var11.t(var10, 1);
            val var6: java.lang.String = var11.v(var10, 2, C0.a, null) as java.lang.String;
            val var9: MessageId = var11.v(var10, 3, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var9 != null) {
               var12 = var9.unbox-impl();
            }

            var2 = 15;
            var19 = var6;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var var14: java.lang.String = null;
            var var13: java.lang.String = null;
            var8 = null;

            while (var3) {
               val var4: Int = var11.x(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           val var17: MessageId;
                           if (var8 != null) {
                              var17 = MessageId.box-impl(var8);
                           } else {
                              var17 = null;
                           }

                           val var18: MessageId = var11.v(var10, 3, MessageId.$serializer.INSTANCE, var17) as MessageId;
                           if (var18 != null) {
                              var8 = var18.unbox-impl();
                           } else {
                              var8 = null;
                           }

                           var2 |= 8;
                        } else {
                           var14 = var11.v(var10, 2, C0.a, var14) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var13 = var11.t(var10, 1);
                        var2 |= 2;
                     }
                  } else {
                     var7 = var11.t(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var19 = var14;
            var12 = var8;
            var8 = var13;
         }

         var11.b(var10);
         return new TapSoundmojiData(var2, var7, var8, var19, var12, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapSoundmojiData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         TapSoundmojiData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapSoundmojiData> {
         return TapSoundmojiData.$serializer.INSTANCE;
      }
   }
}
