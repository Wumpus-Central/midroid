package com.discord.mobile_voice_overlay

import kotlinx.serialization.KSerializer

@Ka.f
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
   public final val useSpeaker: String
   public final val mute: String
   public final val disconnectFromVoice: String
   public final val getInvite: String
   public final val switchChannels: String
   public final val openDiscord: String
   public final val inviteLinkCopied: String
   public final val channelSelect: String
   public final val closeWindow: String
   public final val searchChannels: String
   public final val noResults: String

   init {
      kotlin.jvm.internal.q.h(var1, "useSpeaker");
      kotlin.jvm.internal.q.h(var2, "mute");
      kotlin.jvm.internal.q.h(var3, "disconnectFromVoice");
      kotlin.jvm.internal.q.h(var4, "getInvite");
      kotlin.jvm.internal.q.h(var5, "switchChannels");
      kotlin.jvm.internal.q.h(var6, "openDiscord");
      kotlin.jvm.internal.q.h(var7, "inviteLinkCopied");
      kotlin.jvm.internal.q.h(var8, "channelSelect");
      kotlin.jvm.internal.q.h(var9, "closeWindow");
      kotlin.jvm.internal.q.h(var10, "searchChannels");
      kotlin.jvm.internal.q.h(var11, "noResults");
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
      kotlin.jvm.internal.q.h(var1, "useSpeaker");
      kotlin.jvm.internal.q.h(var2, "mute");
      kotlin.jvm.internal.q.h(var3, "disconnectFromVoice");
      kotlin.jvm.internal.q.h(var4, "getInvite");
      kotlin.jvm.internal.q.h(var5, "switchChannels");
      kotlin.jvm.internal.q.h(var6, "openDiscord");
      kotlin.jvm.internal.q.h(var7, "inviteLinkCopied");
      kotlin.jvm.internal.q.h(var8, "channelSelect");
      kotlin.jvm.internal.q.h(var9, "closeWindow");
      kotlin.jvm.internal.q.h(var10, "searchChannels");
      kotlin.jvm.internal.q.h(var11, "noResults");
      return new MobileVoiceOverlayAssets(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayAssets) {
         return false;
      } else {
         var1 = var1;
         if (!kotlin.jvm.internal.q.c(this.useSpeaker, var1.useSpeaker)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.mute, var1.mute)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.disconnectFromVoice, var1.disconnectFromVoice)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.getInvite, var1.getInvite)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.switchChannels, var1.switchChannels)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.openDiscord, var1.openDiscord)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.inviteLinkCopied, var1.inviteLinkCopied)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.channelSelect, var1.channelSelect)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.closeWindow, var1.closeWindow)) {
            return false;
         } else if (!kotlin.jvm.internal.q.c(this.searchChannels, var1.searchChannels)) {
            return false;
         } else {
            return kotlin.jvm.internal.q.c(this.noResults, var1.noResults);
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
      val var8: java.lang.String = this.useSpeaker;
      val var1: java.lang.String = this.mute;
      val var3: java.lang.String = this.disconnectFromVoice;
      val var4: java.lang.String = this.getInvite;
      val var9: java.lang.String = this.switchChannels;
      val var12: java.lang.String = this.openDiscord;
      val var11: java.lang.String = this.inviteLinkCopied;
      val var6: java.lang.String = this.channelSelect;
      val var10: java.lang.String = this.closeWindow;
      val var7: java.lang.String = this.searchChannels;
      val var5: java.lang.String = this.noResults;
      val var2: StringBuilder = new StringBuilder();
      var2.append("MobileVoiceOverlayAssets(useSpeaker=");
      var2.append(var8);
      var2.append(", mute=");
      var2.append(var1);
      var2.append(", disconnectFromVoice=");
      var2.append(var3);
      var2.append(", getInvite=");
      var2.append(var4);
      var2.append(", switchChannels=");
      var2.append(var9);
      var2.append(", openDiscord=");
      var2.append(var12);
      var2.append(", inviteLinkCopied=");
      var2.append(var11);
      var2.append(", channelSelect=");
      var2.append(var6);
      var2.append(", closeWindow=");
      var2.append(var10);
      var2.append(", searchChannels=");
      var2.append(var7);
      var2.append(", noResults=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayAssets> {
         return MobileVoiceOverlayAssets.$serializer.INSTANCE;
      }
   }
}
