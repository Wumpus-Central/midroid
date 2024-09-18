package com.discord.mobile_voice_overlay

import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.b2
import xk.g0

@f
public data class MobileVoiceOverlayAssets(useSpeaker: String,
   mute: String,
   disconnectFromVoice: String,
   getInvite: String,
   switchChannels: String,
   openDiscord: String,
   inviteLinkCopied: String,
   channelSelect: String,
   closeWindow: String,
   searchChannels: String,
   noResults: String
) {
   public final val channelSelect: String
   public final val closeWindow: String
   public final val disconnectFromVoice: String
   public final val getInvite: String
   public final val inviteLinkCopied: String
   public final val mute: String
   public final val noResults: String
   public final val openDiscord: String
   public final val searchChannels: String
   public final val switchChannels: String
   public final val useSpeaker: String

   init {
      q.h(var1, "useSpeaker");
      q.h(var2, "mute");
      q.h(var3, "disconnectFromVoice");
      q.h(var4, "getInvite");
      q.h(var5, "switchChannels");
      q.h(var6, "openDiscord");
      q.h(var7, "inviteLinkCopied");
      q.h(var8, "channelSelect");
      q.h(var9, "closeWindow");
      q.h(var10, "searchChannels");
      q.h(var11, "noResults");
      super();
      this.useSpeaker = var1;
      this.mute = var2;
      this.disconnectFromVoice = var3;
      this.getInvite = var4;
      this.switchChannels = var5;
      this.openDiscord = var6;
      this.inviteLinkCopied = var7;
      this.channelSelect = var8;
      this.closeWindow = var9;
      this.searchChannels = var10;
      this.noResults = var11;
   }

   public operator fun component1(): String {
      return this.useSpeaker;
   }

   public operator fun component10(): String {
      return this.searchChannels;
   }

   public operator fun component11(): String {
      return this.noResults;
   }

   public operator fun component2(): String {
      return this.mute;
   }

   public operator fun component3(): String {
      return this.disconnectFromVoice;
   }

   public operator fun component4(): String {
      return this.getInvite;
   }

   public operator fun component5(): String {
      return this.switchChannels;
   }

   public operator fun component6(): String {
      return this.openDiscord;
   }

   public operator fun component7(): String {
      return this.inviteLinkCopied;
   }

   public operator fun component8(): String {
      return this.channelSelect;
   }

   public operator fun component9(): String {
      return this.closeWindow;
   }

   public fun copy(
      useSpeaker: String = var0.useSpeaker,
      mute: String = var0.mute,
      disconnectFromVoice: String = var0.disconnectFromVoice,
      getInvite: String = var0.getInvite,
      switchChannels: String = var0.switchChannels,
      openDiscord: String = var0.openDiscord,
      inviteLinkCopied: String = var0.inviteLinkCopied,
      channelSelect: String = var0.channelSelect,
      closeWindow: String = var0.closeWindow,
      searchChannels: String = var0.searchChannels,
      noResults: String = var0.noResults
   ): MobileVoiceOverlayAssets {
      q.h(var1, "useSpeaker");
      q.h(var2, "mute");
      q.h(var3, "disconnectFromVoice");
      q.h(var4, "getInvite");
      q.h(var5, "switchChannels");
      q.h(var6, "openDiscord");
      q.h(var7, "inviteLinkCopied");
      q.h(var8, "channelSelect");
      q.h(var9, "closeWindow");
      q.h(var10, "searchChannels");
      q.h(var11, "noResults");
      return new MobileVoiceOverlayAssets(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayAssets) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.useSpeaker, var1.useSpeaker)) {
            return false;
         } else if (!q.c(this.mute, var1.mute)) {
            return false;
         } else if (!q.c(this.disconnectFromVoice, var1.disconnectFromVoice)) {
            return false;
         } else if (!q.c(this.getInvite, var1.getInvite)) {
            return false;
         } else if (!q.c(this.switchChannels, var1.switchChannels)) {
            return false;
         } else if (!q.c(this.openDiscord, var1.openDiscord)) {
            return false;
         } else if (!q.c(this.inviteLinkCopied, var1.inviteLinkCopied)) {
            return false;
         } else if (!q.c(this.channelSelect, var1.channelSelect)) {
            return false;
         } else if (!q.c(this.closeWindow, var1.closeWindow)) {
            return false;
         } else if (!q.c(this.searchChannels, var1.searchChannels)) {
            return false;
         } else {
            return q.c(this.noResults, var1.noResults);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (this.useSpeaker.hashCode() * 31 + this.mute.hashCode()) * 31
                                                                                 + this.disconnectFromVoice.hashCode()
                                                                           )
                                                                           * 31
                                                                        + this.getInvite.hashCode()
                                                                  )
                                                                  * 31
                                                               + this.switchChannels.hashCode()
                                                         )
                                                         * 31
                                                      + this.openDiscord.hashCode()
                                                )
                                                * 31
                                             + this.inviteLinkCopied.hashCode()
                                       )
                                       * 31
                                    + this.channelSelect.hashCode()
                              )
                              * 31
                           + this.closeWindow.hashCode()
                     )
                     * 31
                  + this.searchChannels.hashCode()
            )
            * 31
         + this.noResults.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.useSpeaker;
      val var6: java.lang.String = this.mute;
      val var5: java.lang.String = this.disconnectFromVoice;
      val var11: java.lang.String = this.getInvite;
      val var10: java.lang.String = this.switchChannels;
      val var12: java.lang.String = this.openDiscord;
      val var7: java.lang.String = this.inviteLinkCopied;
      val var1: java.lang.String = this.channelSelect;
      val var8: java.lang.String = this.closeWindow;
      val var4: java.lang.String = this.searchChannels;
      val var3: java.lang.String = this.noResults;
      val var9: StringBuilder = new StringBuilder();
      var9.append("MobileVoiceOverlayAssets(useSpeaker=");
      var9.append(var2);
      var9.append(", mute=");
      var9.append(var6);
      var9.append(", disconnectFromVoice=");
      var9.append(var5);
      var9.append(", getInvite=");
      var9.append(var11);
      var9.append(", switchChannels=");
      var9.append(var10);
      var9.append(", openDiscord=");
      var9.append(var12);
      var9.append(", inviteLinkCopied=");
      var9.append(var7);
      var9.append(", channelSelect=");
      var9.append(var1);
      var9.append(", closeWindow=");
      var9.append(var8);
      var9.append(", searchChannels=");
      var9.append(var4);
      var9.append(", noResults=");
      var9.append(var3);
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
         val var0: MobileVoiceOverlayAssets.$serializer = new MobileVoiceOverlayAssets.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets", var0, 11);
         var1.l("useSpeaker", false);
         var1.l("mute", false);
         var1.l("disconnectFromVoice", false);
         var1.l("getInvite", false);
         var1.l("switchChannels", false);
         var1.l("openDiscord", false);
         var1.l("inviteLinkCopied", false);
         var1.l("channelSelect", false);
         var1.l("closeWindow", false);
         var1.l("searchChannels", false);
         var1.l("noResults", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a, b2.a, b2.a, b2.a, b2.a, b2.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayAssets {
         q.h(var1, "decoder");
         val var19: SerialDescriptor = this.getDescriptor();
         val var20: c = var1.c(var19);
         val var5: Boolean = var20.y();
         var var2: Int = 0;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var10: java.lang.String;
         var var11: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         val var16: java.lang.String;
         val var21: java.lang.String;
         var var25: java.lang.String;
         if (var5) {
            var15 = var20.t(var19, 0);
            var16 = var20.t(var19, 1);
            var10 = var20.t(var19, 2);
            var12 = var20.t(var19, 3);
            var14 = var20.t(var19, 4);
            var11 = var20.t(var19, 5);
            var25 = var20.t(var19, 6);
            var7 = var20.t(var19, 7);
            val var9: java.lang.String = var20.t(var19, 8);
            var6 = var20.t(var19, 9);
            var21 = var20.t(var19, 10);
            var2 = 2047;
            var13 = var25;
            var25 = var9;
         } else {
            var15 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var10 = null;
            var var26: java.lang.String = null;
            var25 = null;
            var7 = null;
            var6 = null;
            var var22: java.lang.String = null;
            var var3: Boolean = true;

            while (var3) {
               val var4: Int = var20.x(var19);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var15 = var20.t(var19, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var22 = var20.t(var19, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var6 = var20.t(var19, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var26 = var20.t(var19, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var7 = var20.t(var19, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var10 = var20.t(var19, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var11 = var20.t(var19, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var12 = var20.t(var19, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var25 = var20.t(var19, 8);
                     var2 |= 256;
                     break;
                  case 9:
                     var13 = var20.t(var19, 9);
                     var2 |= 512;
                     break;
                  case 10:
                     var14 = var20.t(var19, 10);
                     var2 |= 1024;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var21 = var14;
            var6 = var13;
            var7 = var12;
            var13 = var11;
            var11 = var10;
            var14 = var7;
            var12 = var26;
            var10 = var6;
            var16 = var22;
         }

         var20.b(var19);
         return new MobileVoiceOverlayAssets(var2, var15, var16, var10, var12, var14, var11, var13, var7, var25, var6, var21, null);
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayAssets) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MobileVoiceOverlayAssets.write$Self$mobile_voice_overlay_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return xk.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayAssets> {
         return MobileVoiceOverlayAssets.$serializer.INSTANCE;
      }
   }
}
