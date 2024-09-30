package com.discord.chat.bridge.voiceinviteembed

import cl.f
import cl.n
import dl.a
import fl.b2
import fl.g0
import fl.h
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

@f
public data class VoiceInviteEmbed(guildId: String,
   channelId: String,
   titleText: String,
   bodyText: String,
   joinText: String,
   joinIcon: String?,
   joinDisabled: Boolean,
   isInactive: Boolean
) {
   public final val bodyText: String
   public final val channelId: String
   public final val guildId: String
   public final val isInactive: Boolean
   public final val joinDisabled: Boolean
   public final val joinIcon: String?
   public final val joinText: String
   public final val titleText: String

   init {
      q.h(var1, "guildId");
      q.h(var2, "channelId");
      q.h(var3, "titleText");
      q.h(var4, "bodyText");
      q.h(var5, "joinText");
      super();
      this.guildId = var1;
      this.channelId = var2;
      this.titleText = var3;
      this.bodyText = var4;
      this.joinText = var5;
      this.joinIcon = var6;
      this.joinDisabled = var7;
      this.isInactive = var8;
   }

   public operator fun component1(): String {
      return this.guildId;
   }

   public operator fun component2(): String {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.titleText;
   }

   public operator fun component4(): String {
      return this.bodyText;
   }

   public operator fun component5(): String {
      return this.joinText;
   }

   public operator fun component6(): String? {
      return this.joinIcon;
   }

   public operator fun component7(): Boolean {
      return this.joinDisabled;
   }

   public operator fun component8(): Boolean {
      return this.isInactive;
   }

   public fun copy(
      guildId: String = var0.guildId,
      channelId: String = var0.channelId,
      titleText: String = var0.titleText,
      bodyText: String = var0.bodyText,
      joinText: String = var0.joinText,
      joinIcon: String? = var0.joinIcon,
      joinDisabled: Boolean = var0.joinDisabled,
      isInactive: Boolean = var0.isInactive
   ): VoiceInviteEmbed {
      q.h(var1, "guildId");
      q.h(var2, "channelId");
      q.h(var3, "titleText");
      q.h(var4, "bodyText");
      q.h(var5, "joinText");
      return new VoiceInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!q.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!q.c(this.joinText, var1.joinText)) {
            return false;
         } else if (!q.c(this.joinIcon, var1.joinIcon)) {
            return false;
         } else if (this.joinDisabled != var1.joinDisabled) {
            return false;
         } else {
            return this.isInactive == var1.isInactive;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.guildId.hashCode();
      val var2: Int = this.channelId.hashCode();
      val var6: Int = this.titleText.hashCode();
      val var4: Int = this.bodyText.hashCode();
      val var5: Int = this.joinText.hashCode();
      val var1: Int;
      if (this.joinIcon == null) {
         var1 = 0;
      } else {
         var1 = this.joinIcon.hashCode();
      }

      return ((((((var3 * 31 + var2) * 31 + var6) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.joinDisabled)) * 31
         + java.lang.Boolean.hashCode(this.isInactive);
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.guildId;
      val var3: java.lang.String = this.channelId;
      val var6: java.lang.String = this.titleText;
      val var5: java.lang.String = this.bodyText;
      val var8: java.lang.String = this.joinText;
      val var7: java.lang.String = this.joinIcon;
      val var2: Boolean = this.joinDisabled;
      val var1: Boolean = this.isInactive;
      val var9: StringBuilder = new StringBuilder();
      var9.append("VoiceInviteEmbed(guildId=");
      var9.append(var4);
      var9.append(", channelId=");
      var9.append(var3);
      var9.append(", titleText=");
      var9.append(var6);
      var9.append(", bodyText=");
      var9.append(var5);
      var9.append(", joinText=");
      var9.append(var8);
      var9.append(", joinIcon=");
      var9.append(var7);
      var9.append(", joinDisabled=");
      var9.append(var2);
      var9.append(", isInactive=");
      var9.append(var1);
      var9.append(")");
      return var9.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: VoiceInviteEmbed.$serializer = new VoiceInviteEmbed.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed", var0, 8);
         var1.l("guildId", false);
         var1.l("channelId", false);
         var1.l("titleText", false);
         var1.l("bodyText", false);
         var1.l("joinText", false);
         var1.l("joinIcon", false);
         var1.l("joinDisabled", false);
         var1.l("isInactive", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a, b2.a, a.u(b2.a), h.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): VoiceInviteEmbed {
         q.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.c(var13);
         var var3: Int;
         val var4: Int;
         var var6: Boolean;
         var var7: java.lang.String;
         var var8: java.lang.String;
         var var10: java.lang.String;
         var var11: java.lang.String;
         val var15: java.lang.String;
         var var20: java.lang.String;
         if (var14.y()) {
            var20 = var14.t(var13, 0);
            val var12: java.lang.String = var14.t(var13, 1);
            var11 = var14.t(var13, 2);
            var7 = var14.t(var13, 3);
            var8 = var14.t(var13, 4);
            var15 = var14.v(var13, 5, b2.a, null) as java.lang.String;
            val var2: Byte = var14.s(var13, 6);
            var6 = var14.s(var13, 7);
            var4 = 255;
            var10 = var20;
            var20 = var12;
            var3 = var2;
         } else {
            var var18: Boolean = true;
            var6 = false;
            var var17: Int = 0;
            var10 = null;
            var20 = null;
            var8 = null;
            var7 = null;
            var var16: java.lang.String = null;
            var11 = null;
            var3 = 0;

            while (var18) {
               val var5: Int = var14.x(var13);
               switch (var5) {
                  case -1:
                     var18 = false;
                     break;
                  case 0:
                     var10 = var14.t(var13, 0);
                     var17 |= 1;
                     break;
                  case 1:
                     var20 = var14.t(var13, 1);
                     var17 |= 2;
                     break;
                  case 2:
                     var8 = var14.t(var13, 2);
                     var17 |= 4;
                     break;
                  case 3:
                     var7 = var14.t(var13, 3);
                     var17 |= 8;
                     break;
                  case 4:
                     var16 = var14.t(var13, 4);
                     var17 |= 16;
                     break;
                  case 5:
                     var11 = var14.v(var13, 5, b2.a, var11) as java.lang.String;
                     var17 |= 32;
                     break;
                  case 6:
                     var3 = var14.s(var13, 6);
                     var17 |= 64;
                     break;
                  case 7:
                     var6 = var14.s(var13, 7);
                     var17 |= 128;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var8 = var16;
            var15 = var11;
            var11 = var8;
            var4 = var17;
         }

         var14.b(var13);
         return new VoiceInviteEmbed(var4, var10, var20, var11, var7, var8, var15, (boolean)var3, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: VoiceInviteEmbed) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         VoiceInviteEmbed.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceInviteEmbed> {
         return VoiceInviteEmbed.$serializer.INSTANCE;
      }
   }
}
