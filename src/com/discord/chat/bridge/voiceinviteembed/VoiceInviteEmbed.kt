package com.discord.chat.bridge.voiceinviteembed

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.h

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
      r.h(var1, "guildId");
      r.h(var2, "channelId");
      r.h(var3, "titleText");
      r.h(var4, "bodyText");
      r.h(var5, "joinText");
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

   @JvmStatic
   public fun `write$Self`(self: VoiceInviteEmbed, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.guildId);
      var1.z(var2, 1, var0.channelId);
      var1.z(var2, 2, var0.titleText);
      var1.z(var2, 3, var0.bodyText);
      var1.z(var2, 4, var0.joinText);
      var1.m(var2, 5, a2.a, var0.joinIcon);
      var1.x(var2, 6, var0.joinDisabled);
      var1.x(var2, 7, var0.isInactive);
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
      r.h(var1, "guildId");
      r.h(var2, "channelId");
      r.h(var3, "titleText");
      r.h(var4, "bodyText");
      r.h(var5, "joinText");
      return new VoiceInviteEmbed(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceInviteEmbed) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildId, var1.guildId)) {
            return false;
         } else if (!r.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.titleText, var1.titleText)) {
            return false;
         } else if (!r.c(this.bodyText, var1.bodyText)) {
            return false;
         } else if (!r.c(this.joinText, var1.joinText)) {
            return false;
         } else if (!r.c(this.joinIcon, var1.joinIcon)) {
            return false;
         } else if (this.joinDisabled != var1.joinDisabled) {
            return false;
         } else {
            return this.isInactive == var1.isInactive;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = this.guildId.hashCode();
      val var8: Int = this.channelId.hashCode();
      val var9: Int = this.titleText.hashCode();
      val var5: Int = this.bodyText.hashCode();
      val var6: Int = this.joinText.hashCode();
      val var1: Int;
      if (this.joinIcon == null) {
         var1 = 0;
      } else {
         var1 = this.joinIcon.hashCode();
      }

      var var3: Byte = 1;
      var var2: Byte = this.joinDisabled;
      if (this.joinDisabled != 0) {
         var2 = 1;
      }

      if (this.isInactive == 0) {
         var3 = this.isInactive;
      }

      return ((((((var7 * 31 + var8) * 31 + var9) * 31 + var5) * 31 + var6) * 31 + var1) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var8: java.lang.String = this.guildId;
      val var9: java.lang.String = this.channelId;
      val var7: java.lang.String = this.titleText;
      val var3: java.lang.String = this.bodyText;
      val var4: java.lang.String = this.joinText;
      val var5: java.lang.String = this.joinIcon;
      val var2: Boolean = this.joinDisabled;
      val var1: Boolean = this.isInactive;
      val var6: StringBuilder = new StringBuilder();
      var6.append("VoiceInviteEmbed(guildId=");
      var6.append(var8);
      var6.append(", channelId=");
      var6.append(var9);
      var6.append(", titleText=");
      var6.append(var7);
      var6.append(", bodyText=");
      var6.append(var3);
      var6.append(", joinText=");
      var6.append(var4);
      var6.append(", joinIcon=");
      var6.append(var5);
      var6.append(", joinDisabled=");
      var6.append(var2);
      var6.append(", isInactive=");
      var6.append(var1);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<VoiceInviteEmbed> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a, a2.a, a.u(a2.a), h.a, h.a};
      }

      public open fun deserialize(decoder: Decoder): VoiceInviteEmbed {
         r.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.b(var13);
         var var3: Int;
         val var4: Int;
         var var6: Boolean;
         var var7: java.lang.String;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var11: Any;
         var var15: java.lang.String;
         var var19: java.lang.String;
         if (var14.p()) {
            var19 = var14.m(var13, 0);
            var9 = var14.m(var13, 1);
            val var12: java.lang.String = var14.m(var13, 2);
            var7 = var14.m(var13, 3);
            var15 = var14.m(var13, 4);
            var11 = var14.n(var13, 5, a2.a, null);
            val var2: Byte = var14.C(var13, 6);
            var6 = var14.C(var13, 7);
            var3 = 255;
            var10 = var19;
            var19 = var12;
            var4 = var2;
         } else {
            var var18: Boolean = true;
            var6 = false;
            var var16: Int = 0;
            var10 = null;
            var9 = null;
            var19 = null;
            var7 = null;
            var15 = null;
            var11 = null;
            var3 = 0;

            while (var18) {
               val var5: Int = var14.o(var13);
               switch (var5) {
                  case -1:
                     var18 = false;
                     break;
                  case 0:
                     var10 = var14.m(var13, 0);
                     var16 |= 1;
                     break;
                  case 1:
                     var9 = var14.m(var13, 1);
                     var16 |= 2;
                     break;
                  case 2:
                     var19 = var14.m(var13, 2);
                     var16 |= 4;
                     break;
                  case 3:
                     var7 = var14.m(var13, 3);
                     var16 |= 8;
                     break;
                  case 4:
                     var15 = var14.m(var13, 4);
                     var16 |= 16;
                     break;
                  case 5:
                     var11 = var14.n(var13, 5, a2.a, var11);
                     var16 |= 32;
                     break;
                  case 6:
                     var3 = var14.C(var13, 6);
                     var16 |= 64;
                     break;
                  case 7:
                     var6 = var14.C(var13, 7);
                     var16 |= 128;
                     break;
                  default:
                     throw new n(var5);
               }
            }

            var4 = var3;
            var3 = var16;
         }

         var14.c(var13);
         return new VoiceInviteEmbed(var3, var10, var9, var19, var7, var15, var11 as java.lang.String, (boolean)var4, var6, null);
      }

      public open fun serialize(encoder: Encoder, value: VoiceInviteEmbed) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         VoiceInviteEmbed.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceInviteEmbed> {
         return VoiceInviteEmbed.$serializer.INSTANCE;
      }
   }
}
