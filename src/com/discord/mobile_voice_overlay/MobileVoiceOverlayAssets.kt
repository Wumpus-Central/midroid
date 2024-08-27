package com.discord.mobile_voice_overlay

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
import xk.a2
import xk.f0

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
      r.h(var1, "useSpeaker");
      r.h(var2, "mute");
      r.h(var3, "disconnectFromVoice");
      r.h(var4, "getInvite");
      r.h(var5, "switchChannels");
      r.h(var6, "openDiscord");
      r.h(var7, "inviteLinkCopied");
      r.h(var8, "channelSelect");
      r.h(var9, "closeWindow");
      r.h(var10, "searchChannels");
      r.h(var11, "noResults");
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

   @JvmStatic
   public fun `write$Self`(self: MobileVoiceOverlayAssets, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.useSpeaker);
      var1.z(var2, 1, var0.mute);
      var1.z(var2, 2, var0.disconnectFromVoice);
      var1.z(var2, 3, var0.getInvite);
      var1.z(var2, 4, var0.switchChannels);
      var1.z(var2, 5, var0.openDiscord);
      var1.z(var2, 6, var0.inviteLinkCopied);
      var1.z(var2, 7, var0.channelSelect);
      var1.z(var2, 8, var0.closeWindow);
      var1.z(var2, 9, var0.searchChannels);
      var1.z(var2, 10, var0.noResults);
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
      r.h(var1, "useSpeaker");
      r.h(var2, "mute");
      r.h(var3, "disconnectFromVoice");
      r.h(var4, "getInvite");
      r.h(var5, "switchChannels");
      r.h(var6, "openDiscord");
      r.h(var7, "inviteLinkCopied");
      r.h(var8, "channelSelect");
      r.h(var9, "closeWindow");
      r.h(var10, "searchChannels");
      r.h(var11, "noResults");
      return new MobileVoiceOverlayAssets(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayAssets) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.useSpeaker, var1.useSpeaker)) {
            return false;
         } else if (!r.c(this.mute, var1.mute)) {
            return false;
         } else if (!r.c(this.disconnectFromVoice, var1.disconnectFromVoice)) {
            return false;
         } else if (!r.c(this.getInvite, var1.getInvite)) {
            return false;
         } else if (!r.c(this.switchChannels, var1.switchChannels)) {
            return false;
         } else if (!r.c(this.openDiscord, var1.openDiscord)) {
            return false;
         } else if (!r.c(this.inviteLinkCopied, var1.inviteLinkCopied)) {
            return false;
         } else if (!r.c(this.channelSelect, var1.channelSelect)) {
            return false;
         } else if (!r.c(this.closeWindow, var1.closeWindow)) {
            return false;
         } else if (!r.c(this.searchChannels, var1.searchChannels)) {
            return false;
         } else {
            return r.c(this.noResults, var1.noResults);
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
      val var7: java.lang.String = this.useSpeaker;
      val var1: java.lang.String = this.mute;
      val var4: java.lang.String = this.disconnectFromVoice;
      val var5: java.lang.String = this.getInvite;
      val var2: java.lang.String = this.switchChannels;
      val var10: java.lang.String = this.openDiscord;
      val var9: java.lang.String = this.inviteLinkCopied;
      val var12: java.lang.String = this.channelSelect;
      val var11: java.lang.String = this.closeWindow;
      val var3: java.lang.String = this.searchChannels;
      val var6: java.lang.String = this.noResults;
      val var8: StringBuilder = new StringBuilder();
      var8.append("MobileVoiceOverlayAssets(useSpeaker=");
      var8.append(var7);
      var8.append(", mute=");
      var8.append(var1);
      var8.append(", disconnectFromVoice=");
      var8.append(var4);
      var8.append(", getInvite=");
      var8.append(var5);
      var8.append(", switchChannels=");
      var8.append(var2);
      var8.append(", openDiscord=");
      var8.append(var10);
      var8.append(", inviteLinkCopied=");
      var8.append(var9);
      var8.append(", channelSelect=");
      var8.append(var12);
      var8.append(", closeWindow=");
      var8.append(var11);
      var8.append(", searchChannels=");
      var8.append(var3);
      var8.append(", noResults=");
      var8.append(var6);
      var8.append(")");
      return var8.toString();
   }

   public object `$serializer` : f0<MobileVoiceOverlayAssets> {
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
         return new KSerializer[]{a2.a, a2.a, a2.a, a2.a, a2.a, a2.a, a2.a, a2.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayAssets {
         r.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.b(var20);
         val var5: Boolean = var21.p();
         var var2: Int = 0;
         var var6: java.lang.String;
         var var9: java.lang.String;
         var var10: java.lang.String;
         var var11: java.lang.String;
         var var12: java.lang.String;
         var var13: java.lang.String;
         var var14: java.lang.String;
         var var15: java.lang.String;
         val var16: java.lang.String;
         val var22: java.lang.String;
         var var26: java.lang.String;
         if (var5) {
            var14 = var21.m(var20, 0);
            var12 = var21.m(var20, 1);
            var11 = var21.m(var20, 2);
            var16 = var21.m(var20, 3);
            var10 = var21.m(var20, 4);
            var13 = var21.m(var20, 5);
            var26 = var21.m(var20, 6);
            val var7: java.lang.String = var21.m(var20, 7);
            var9 = var21.m(var20, 8);
            var6 = var21.m(var20, 9);
            var22 = var21.m(var20, 10);
            var2 = 2047;
            var15 = var26;
            var26 = var7;
         } else {
            var14 = null;
            var15 = null;
            var13 = null;
            var12 = null;
            var9 = null;
            var11 = null;
            var26 = null;
            var10 = null;
            var6 = null;
            var var23: java.lang.String = null;
            var var25: java.lang.String = null;
            var var3: Boolean = true;

            while (var3) {
               val var4: Int = var21.o(var20);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var14 = var21.m(var20, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var25 = var21.m(var20, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var23 = var21.m(var20, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var26 = var21.m(var20, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var6 = var21.m(var20, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var11 = var21.m(var20, 5);
                     var2 |= 32;
                     break;
                  case 6:
                     var9 = var21.m(var20, 6);
                     var2 |= 64;
                     break;
                  case 7:
                     var12 = var21.m(var20, 7);
                     var2 |= 128;
                     break;
                  case 8:
                     var10 = var21.m(var20, 8);
                     var2 |= 256;
                     break;
                  case 9:
                     var13 = var21.m(var20, 9);
                     var2 |= 512;
                     break;
                  case 10:
                     var15 = var21.m(var20, 10);
                     var2 |= 1024;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var22 = var15;
            var6 = var13;
            var9 = var10;
            var26 = var12;
            var15 = var9;
            var13 = var11;
            var10 = var6;
            var16 = var26;
            var11 = var23;
            var12 = var25;
         }

         var21.c(var20);
         return new MobileVoiceOverlayAssets(var2, var14, var12, var11, var16, var10, var13, var15, var26, var9, var6, var22, null);
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayAssets) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MobileVoiceOverlayAssets.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayAssets> {
         return MobileVoiceOverlayAssets.$serializer.INSTANCE;
      }
   }
}
