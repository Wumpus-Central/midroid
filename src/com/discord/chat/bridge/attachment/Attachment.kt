package com.discord.chat.bridge.attachment

import android.net.UrlQuerySanitizer
import android.util.Base64
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.react_asset_fetcher.ReactAsset
import kb.f
import kotlin.Result.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import q1.b
import r9.j

@f
public data class Attachment(id: String? = null,
      url: String,
      videoUrl: String? = null,
      filename: String,
      size: String,
      sourceWidth: Int? = null,
      sourceHeight: Int? = null,
      isSpoiler: Boolean,
      spoiler: String? = null,
      description: String? = null,
      hint: String? = null,
      role: String? = null,
      showDescription: Boolean = false,
      progress: Int? = null,
      uploaderId: String? = null,
      uploaderItemId: String? = ...,
      placeholder: String? = ...,
      placeholderVersion: Int? = ...,
      backgroundColor: Int? = ...,
      attachmentTagText: String? = ...,
      attachmentTagBackgroundColor: Int? = ...,
      attachmentTagTextColor: Int? = ...,
      attachmentTagIconType: String? = ...,
      attachmentType: String? = ...,
      obscure: Boolean? = ...,
      obscureDescription: String? = ...,
      obscureAwaitingScan: Boolean? = ...,
      obscureHideControls: Boolean? = ...,
      obscureIsOpaque: Boolean? = ...,
      verifyAge: Boolean? = ...,
      durationSecs: Float? = ...,
      waveform: String? = null,
      isAnimated: Boolean = true,
      mediaViewerBufferForPlaybackMs: Int? = null,
      mediaViewerBufferForPlaybackAfterRebufferMs: Int? = null,
      mediaViewerMinBufferMs: Int? = null,
      mediaViewerMaxBufferMs: Int? = null,
      mediaViewerEnableDecoderFallback: Boolean? = java.lang.Boolean.FALSE,
      mediaViewerEnableAsyncBufferQueueing: Boolean? = java.lang.Boolean.TRUE,
      srcIsAnimated: Boolean? = java.lang.Boolean.FALSE
   ) :
   SpoilerableData {
   public final val id: String?
   public final val url: String
   public final val videoUrl: String?
   public final val filename: String
   public final val size: String
   private final val sourceWidth: Int?
   private final val sourceHeight: Int?
   public final val isSpoiler: Boolean
   public final val spoiler: String?
   public final val description: String?
   public final val hint: String?
   public final val role: String?
   public final val showDescription: Boolean
   public final val progress: Int?
   public final val uploaderId: String?
   public final val uploaderItemId: String?
   public final val placeholder: String?
   public final val placeholderVersion: Int?
   public final val backgroundColor: Int?
   public final val attachmentTagText: String?
   public final val attachmentTagBackgroundColor: Int?
   public final val attachmentTagTextColor: Int?
   private final val attachmentTagIconType: String?
   private final val attachmentType: String?
   public final val obscure: Boolean?
   public final val obscureDescription: String?
   public final val obscureAwaitingScan: Boolean?
   public final val obscureHideControls: Boolean?
   public final val obscureIsOpaque: Boolean?
   public final val verifyAge: Boolean?
   public final val durationSecs: Float?
   private final val waveform: String?
   public final val isAnimated: Boolean
   public final val mediaViewerBufferForPlaybackMs: Int?
   public final val mediaViewerBufferForPlaybackAfterRebufferMs: Int?
   public final val mediaViewerMinBufferMs: Int?
   public final val mediaViewerMaxBufferMs: Int?
   public final val mediaViewerEnableDecoderFallback: Boolean?
   public final val mediaViewerEnableAsyncBufferQueueing: Boolean?
   public final val srcIsAnimated: Boolean?

   public final val playerSettings: PlayerSettings
      public final get() {
         return this.playerSettings$delegate.getValue() as MediaPlayer.PlayerSettings;
      }


   public final val waveformByteArray: ByteArray?
   public open val spoilerOrNull: String?
   public open val obscureOrNull: String?
   private final val proxyWidth: Int?
   private final val proxyHeight: Int?

   public final val width: Int
      public final get() {
         var var2: Int = this.proxyWidth;
         if (this.proxyWidth == null) {
            var2 = this.sourceWidth;
            if (this.sourceWidth == null) {
               return 0;
            }
         }

         return var2;
      }


   public final val height: Int
      public final get() {
         var var2: Int = this.proxyHeight;
         if (this.proxyHeight == null) {
            var2 = this.sourceHeight;
            if (this.sourceHeight == null) {
               return 0;
            }
         }

         return var2;
      }


   init {
      label43: {
         q.h(var2, "url");
         q.h(var4, "filename");
         q.h(var5, "size");
         super();
         this.id = var1;
         this.url = var2;
         this.videoUrl = var3;
         this.filename = var4;
         this.size = var5;
         this.sourceWidth = var6;
         this.sourceHeight = var7;
         this.isSpoiler = var8;
         this.spoiler = var9;
         this.description = var10;
         this.hint = var11;
         this.role = var12;
         this.showDescription = var13;
         this.progress = var14;
         this.uploaderId = var15;
         this.uploaderItemId = var16;
         this.placeholder = var17;
         this.placeholderVersion = var18;
         this.backgroundColor = var19;
         this.attachmentTagText = var20;
         this.attachmentTagBackgroundColor = var21;
         this.attachmentTagTextColor = var22;
         this.attachmentTagIconType = var23;
         this.attachmentType = var24;
         this.obscure = var25;
         this.obscureDescription = var26;
         this.obscureAwaitingScan = var27;
         this.obscureHideControls = var28;
         this.obscureIsOpaque = var29;
         this.verifyAge = var30;
         this.durationSecs = var31;
         this.waveform = var32;
         this.isAnimated = var33;
         this.mediaViewerBufferForPlaybackMs = var34;
         this.mediaViewerBufferForPlaybackAfterRebufferMs = var35;
         this.mediaViewerMinBufferMs = var36;
         this.mediaViewerMaxBufferMs = var37;
         this.mediaViewerEnableDecoderFallback = var38;
         this.mediaViewerEnableAsyncBufferQueueing = var39;
         this.srcIsAnimated = var40;
         this.playerSettings$delegate = j.a(new b(this));
         if (var32 != null) {
            try {
               var44 = Base64.decode(var32, 0);
               break label43;
            } catch (var43: Exception) {
            }
         }

         var44 = null;
      }

      this.waveformByteArray = var44;
      var1 = this.spoiler;
      var var41: Boolean;
      if (this.spoiler != null && !h.c0(this.spoiler)) {
         var41 = false;
      } else {
         var41 = true;
      }

      if (var41) {
         var1 = null;
      }

      label31: {
         this.spoilerOrNull = var1;
         var3 = this.obscureDescription;
         if (this.obscureDescription != null) {
            var41 = false;
            if (!h.c0(this.obscureDescription)) {
               break label31;
            }
         }

         var41 = true;
      }

      var1 = null;
      if (!var41) {
         var1 = this.obscureDescription;
      }

      this.obscureOrNull = var1;
      this.proxyWidth = this.getProxyUrlQueryParam("width");
      this.proxyHeight = this.getProxyUrlQueryParam("height");
   }

   @JvmStatic
   fun `_init_$lambda$8`(var0: Attachment): MediaPlayer.PlayerSettings {
      val var1: Int;
      if (var0.mediaViewerMinBufferMs != null) {
         var1 = var0.mediaViewerMinBufferMs;
      } else {
         var1 = MediaPlayer.Factory.getDefaultSettings().getMinBufferMs();
      }

      val var2: Int;
      if (var0.mediaViewerMaxBufferMs != null) {
         var2 = var0.mediaViewerMaxBufferMs;
      } else {
         var2 = MediaPlayer.Factory.getDefaultSettings().getMaxBufferMs();
      }

      val var3: Int;
      if (var0.mediaViewerBufferForPlaybackMs != null) {
         var3 = var0.mediaViewerBufferForPlaybackMs;
      } else {
         var3 = MediaPlayer.Factory.getDefaultSettings().getBufferForPlaybackMs();
      }

      val var4: Int;
      if (var0.mediaViewerBufferForPlaybackAfterRebufferMs != null) {
         var4 = var0.mediaViewerBufferForPlaybackAfterRebufferMs;
      } else {
         var4 = MediaPlayer.Factory.getDefaultSettings().getBufferForPlaybackAfterRebufferMs();
      }

      val var5: Boolean;
      if (var0.mediaViewerEnableDecoderFallback != null) {
         var5 = var0.mediaViewerEnableDecoderFallback;
      } else {
         var5 = MediaPlayer.Factory.getDefaultSettings().getEnableDecoderFallback();
      }

      val var6: Boolean;
      if (var0.mediaViewerEnableAsyncBufferQueueing != null) {
         var6 = var0.mediaViewerEnableAsyncBufferQueueing;
      } else {
         var6 = MediaPlayer.Factory.getDefaultSettings().getEnableAsyncBufferQueueing();
      }

      return new MediaPlayer.PlayerSettings(var1, var2, var3, var4, var5, var6);
   }

   private operator fun component23(): String? {
      return this.attachmentTagIconType;
   }

   private operator fun component24(): String? {
      return this.attachmentType;
   }

   private operator fun component32(): String? {
      return this.waveform;
   }

   private operator fun component6(): Int? {
      return this.sourceWidth;
   }

   private operator fun component7(): Int? {
      return this.sourceHeight;
   }

   private fun getProxyUrlQueryParam(paramName: String): Int? {
      label38: {
         try {
            val var19: a = Result.k;
            var1 = new UrlQuerySanitizer(this.url).getValue(var1);
         } catch (var6: java.lang.Throwable) {
            val var3: a = Result.k;
            var16 = Result.b(c.a(var6));
            break label38;
         }

         val var18: Int;
         if (var1 != null) {
            try {
               var18 = h.m(var1);
            } catch (var5: java.lang.Throwable) {
               val var21: a = Result.k;
               var16 = Result.b(c.a(var5));
               break label38;
            }
         } else {
            var18 = null;
         }

         label26:
         try {
            var16 = Result.b(var18);
         } catch (var4: java.lang.Throwable) {
            val var22: a = Result.k;
            var16 = Result.b(c.a(var4));
            break label26;
         }
      }

      if (Result.g(var16)) {
         var16 = null;
      }

      return var16 as Int;
   }

   private fun hasDimensions(): Boolean {
      val var1: Boolean;
      if (this.getWidth() > 0 && this.getHeight() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   @JvmStatic
   fun `playerSettings_delegate$lambda$0`(var0: Attachment): MediaPlayer.PlayerSettings {
      val var1: Int;
      if (var0.mediaViewerMinBufferMs != null) {
         var1 = var0.mediaViewerMinBufferMs;
      } else {
         var1 = MediaPlayer.Factory.getDefaultSettings().getMinBufferMs();
      }

      val var2: Int;
      if (var0.mediaViewerMaxBufferMs != null) {
         var2 = var0.mediaViewerMaxBufferMs;
      } else {
         var2 = MediaPlayer.Factory.getDefaultSettings().getMaxBufferMs();
      }

      val var3: Int;
      if (var0.mediaViewerBufferForPlaybackMs != null) {
         var3 = var0.mediaViewerBufferForPlaybackMs;
      } else {
         var3 = MediaPlayer.Factory.getDefaultSettings().getBufferForPlaybackMs();
      }

      val var4: Int;
      if (var0.mediaViewerBufferForPlaybackAfterRebufferMs != null) {
         var4 = var0.mediaViewerBufferForPlaybackAfterRebufferMs;
      } else {
         var4 = MediaPlayer.Factory.getDefaultSettings().getBufferForPlaybackAfterRebufferMs();
      }

      val var5: Boolean;
      if (var0.mediaViewerEnableDecoderFallback != null) {
         var5 = var0.mediaViewerEnableDecoderFallback;
      } else {
         var5 = MediaPlayer.Factory.getDefaultSettings().getEnableDecoderFallback();
      }

      val var6: Boolean;
      if (var0.mediaViewerEnableAsyncBufferQueueing != null) {
         var6 = var0.mediaViewerEnableAsyncBufferQueueing;
      } else {
         var6 = MediaPlayer.Factory.getDefaultSettings().getEnableAsyncBufferQueueing();
      }

      return new MediaPlayer.PlayerSettings(var1, var2, var3, var4, var5, var6);
   }

   private fun shouldShowImages(): Boolean {
      var var1: Int;
      if (this.sourceWidth != null) {
         var1 = this.sourceWidth;
      } else {
         var1 = 0;
      }

      var var2: Boolean = false;
      if (var1 > 0) {
         if (this.sourceHeight != null) {
            var1 = this.sourceHeight;
         } else {
            var1 = 0;
         }

         var2 = false;
         if (var1 > 0) {
            var2 = true;
         }
      }

      return var2;
   }

   public operator fun component1(): String? {
      return this.id;
   }

   public operator fun component10(): String? {
      return this.description;
   }

   public operator fun component11(): String? {
      return this.hint;
   }

   public operator fun component12(): String? {
      return this.role;
   }

   public operator fun component13(): Boolean {
      return this.showDescription;
   }

   public operator fun component14(): Int? {
      return this.progress;
   }

   public operator fun component15(): String? {
      return this.uploaderId;
   }

   public operator fun component16(): String? {
      return this.uploaderItemId;
   }

   public operator fun component17(): String? {
      return this.placeholder;
   }

   public operator fun component18(): Int? {
      return this.placeholderVersion;
   }

   public operator fun component19(): Int? {
      return this.backgroundColor;
   }

   public operator fun component2(): String {
      return this.url;
   }

   public operator fun component20(): String? {
      return this.attachmentTagText;
   }

   public operator fun component21(): Int? {
      return this.attachmentTagBackgroundColor;
   }

   public operator fun component22(): Int? {
      return this.attachmentTagTextColor;
   }

   public operator fun component25(): Boolean? {
      return this.obscure;
   }

   public operator fun component26(): String? {
      return this.obscureDescription;
   }

   public operator fun component27(): Boolean? {
      return this.obscureAwaitingScan;
   }

   public operator fun component28(): Boolean? {
      return this.obscureHideControls;
   }

   public operator fun component29(): Boolean? {
      return this.obscureIsOpaque;
   }

   public operator fun component3(): String? {
      return this.videoUrl;
   }

   public operator fun component30(): Boolean? {
      return this.verifyAge;
   }

   public operator fun component31(): Float? {
      return this.durationSecs;
   }

   public operator fun component33(): Boolean {
      return this.isAnimated;
   }

   public operator fun component34(): Int? {
      return this.mediaViewerBufferForPlaybackMs;
   }

   public operator fun component35(): Int? {
      return this.mediaViewerBufferForPlaybackAfterRebufferMs;
   }

   public operator fun component36(): Int? {
      return this.mediaViewerMinBufferMs;
   }

   public operator fun component37(): Int? {
      return this.mediaViewerMaxBufferMs;
   }

   public operator fun component38(): Boolean? {
      return this.mediaViewerEnableDecoderFallback;
   }

   public operator fun component39(): Boolean? {
      return this.mediaViewerEnableAsyncBufferQueueing;
   }

   public operator fun component4(): String {
      return this.filename;
   }

   public operator fun component40(): Boolean? {
      return this.srcIsAnimated;
   }

   public operator fun component5(): String {
      return this.size;
   }

   public operator fun component8(): Boolean {
      return this.isSpoiler;
   }

   public operator fun component9(): String? {
      return this.spoiler;
   }

   public fun copy(
      id: String? = var0.id,
      url: String = var0.url,
      videoUrl: String? = var0.videoUrl,
      filename: String = var0.filename,
      size: String = var0.size,
      sourceWidth: Int? = var0.sourceWidth,
      sourceHeight: Int? = var0.sourceHeight,
      isSpoiler: Boolean = var0.isSpoiler,
      spoiler: String? = var0.spoiler,
      description: String? = var0.description,
      hint: String? = var0.hint,
      role: String? = var0.role,
      showDescription: Boolean = var0.showDescription,
      progress: Int? = var0.progress,
      uploaderId: String? = var0.uploaderId,
      uploaderItemId: String? = var0.uploaderItemId,
      placeholder: String? = var0.placeholder,
      placeholderVersion: Int? = var0.placeholderVersion,
      backgroundColor: Int? = var0.backgroundColor,
      attachmentTagText: String? = var0.attachmentTagText,
      attachmentTagBackgroundColor: Int? = var0.attachmentTagBackgroundColor,
      attachmentTagTextColor: Int? = var0.attachmentTagTextColor,
      attachmentTagIconType: String? = var0.attachmentTagIconType,
      attachmentType: String? = var0.attachmentType,
      obscure: Boolean? = var0.obscure,
      obscureDescription: String? = var0.obscureDescription,
      obscureAwaitingScan: Boolean? = var0.obscureAwaitingScan,
      obscureHideControls: Boolean? = var0.obscureHideControls,
      obscureIsOpaque: Boolean? = var0.obscureIsOpaque,
      verifyAge: Boolean? = var0.verifyAge,
      durationSecs: Float? = var0.durationSecs,
      waveform: String? = var0.waveform,
      isAnimated: Boolean = var0.isAnimated,
      mediaViewerBufferForPlaybackMs: Int? = var0.mediaViewerBufferForPlaybackMs,
      mediaViewerBufferForPlaybackAfterRebufferMs: Int? = var0.mediaViewerBufferForPlaybackAfterRebufferMs,
      mediaViewerMinBufferMs: Int? = var0.mediaViewerMinBufferMs,
      mediaViewerMaxBufferMs: Int? = var0.mediaViewerMaxBufferMs,
      mediaViewerEnableDecoderFallback: Boolean? = var0.mediaViewerEnableDecoderFallback,
      mediaViewerEnableAsyncBufferQueueing: Boolean? = var0.mediaViewerEnableAsyncBufferQueueing,
      srcIsAnimated: Boolean? = var0.srcIsAnimated
   ): Attachment {
      q.h(var2, "url");
      q.h(var4, "filename");
      q.h(var5, "size");
      return new Attachment(
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         var12,
         var13,
         var14,
         var15,
         var16,
         var17,
         var18,
         var19,
         var20,
         var21,
         var22,
         var23,
         var24,
         var25,
         var26,
         var27,
         var28,
         var29,
         var30,
         var31,
         var32,
         var33,
         var34,
         var35,
         var36,
         var37,
         var38,
         var39,
         var40
      );
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is Attachment) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.id, var1.id)) {
            return false;
         } else if (!q.c(this.url, var1.url)) {
            return false;
         } else if (!q.c(this.videoUrl, var1.videoUrl)) {
            return false;
         } else if (!q.c(this.filename, var1.filename)) {
            return false;
         } else if (!q.c(this.size, var1.size)) {
            return false;
         } else if (!q.c(this.sourceWidth, var1.sourceWidth)) {
            return false;
         } else if (!q.c(this.sourceHeight, var1.sourceHeight)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!q.c(this.spoiler, var1.spoiler)) {
            return false;
         } else if (!q.c(this.description, var1.description)) {
            return false;
         } else if (!q.c(this.hint, var1.hint)) {
            return false;
         } else if (!q.c(this.role, var1.role)) {
            return false;
         } else if (this.showDescription != var1.showDescription) {
            return false;
         } else if (!q.c(this.progress, var1.progress)) {
            return false;
         } else if (!q.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else if (!q.c(this.uploaderItemId, var1.uploaderItemId)) {
            return false;
         } else if (!q.c(this.placeholder, var1.placeholder)) {
            return false;
         } else if (!q.c(this.placeholderVersion, var1.placeholderVersion)) {
            return false;
         } else if (!q.c(this.backgroundColor, var1.backgroundColor)) {
            return false;
         } else if (!q.c(this.attachmentTagText, var1.attachmentTagText)) {
            return false;
         } else if (!q.c(this.attachmentTagBackgroundColor, var1.attachmentTagBackgroundColor)) {
            return false;
         } else if (!q.c(this.attachmentTagTextColor, var1.attachmentTagTextColor)) {
            return false;
         } else if (!q.c(this.attachmentTagIconType, var1.attachmentTagIconType)) {
            return false;
         } else if (!q.c(this.attachmentType, var1.attachmentType)) {
            return false;
         } else if (!q.c(this.obscure, var1.obscure)) {
            return false;
         } else if (!q.c(this.obscureDescription, var1.obscureDescription)) {
            return false;
         } else if (!q.c(this.obscureAwaitingScan, var1.obscureAwaitingScan)) {
            return false;
         } else if (!q.c(this.obscureHideControls, var1.obscureHideControls)) {
            return false;
         } else if (!q.c(this.obscureIsOpaque, var1.obscureIsOpaque)) {
            return false;
         } else if (!q.c(this.verifyAge, var1.verifyAge)) {
            return false;
         } else if (!q.c(this.durationSecs, var1.durationSecs)) {
            return false;
         } else if (!q.c(this.waveform, var1.waveform)) {
            return false;
         } else if (this.isAnimated != var1.isAnimated) {
            return false;
         } else if (!q.c(this.mediaViewerBufferForPlaybackMs, var1.mediaViewerBufferForPlaybackMs)) {
            return false;
         } else if (!q.c(this.mediaViewerBufferForPlaybackAfterRebufferMs, var1.mediaViewerBufferForPlaybackAfterRebufferMs)) {
            return false;
         } else if (!q.c(this.mediaViewerMinBufferMs, var1.mediaViewerMinBufferMs)) {
            return false;
         } else if (!q.c(this.mediaViewerMaxBufferMs, var1.mediaViewerMaxBufferMs)) {
            return false;
         } else if (!q.c(this.mediaViewerEnableDecoderFallback, var1.mediaViewerEnableDecoderFallback)) {
            return false;
         } else if (!q.c(this.mediaViewerEnableAsyncBufferQueueing, var1.mediaViewerEnableAsyncBufferQueueing)) {
            return false;
         } else {
            return q.c(this.srcIsAnimated, var1.srcIsAnimated);
         }
      }
   }

   public fun getAttachmentTagIcon(): ReactAsset? {
      val var1: ReactAsset;
      if (q.c(this.attachmentTagIconType, "clip")) {
         var1 = ReactAsset.Clip;
      } else {
         var1 = null;
      }

      return var1;
   }

   public override fun hashCode(): Int {
      var var34: Int = 0;
      val var1: Int;
      if (this.id == null) {
         var1 = 0;
      } else {
         var1 = this.id.hashCode();
      }

      val var35: Int = this.url.hashCode();
      val var2: Int;
      if (this.videoUrl == null) {
         var2 = 0;
      } else {
         var2 = this.videoUrl.hashCode();
      }

      val var36: Int = this.filename.hashCode();
      val var37: Int = this.size.hashCode();
      val var3: Int;
      if (this.sourceWidth == null) {
         var3 = 0;
      } else {
         var3 = this.sourceWidth.hashCode();
      }

      val var4: Int;
      if (this.sourceHeight == null) {
         var4 = 0;
      } else {
         var4 = this.sourceHeight.hashCode();
      }

      val var38: Int = java.lang.Boolean.hashCode(this.isSpoiler);
      val var5: Int;
      if (this.spoiler == null) {
         var5 = 0;
      } else {
         var5 = this.spoiler.hashCode();
      }

      val var6: Int;
      if (this.description == null) {
         var6 = 0;
      } else {
         var6 = this.description.hashCode();
      }

      val var7: Int;
      if (this.hint == null) {
         var7 = 0;
      } else {
         var7 = this.hint.hashCode();
      }

      val var8: Int;
      if (this.role == null) {
         var8 = 0;
      } else {
         var8 = this.role.hashCode();
      }

      val var39: Int = java.lang.Boolean.hashCode(this.showDescription);
      val var9: Int;
      if (this.progress == null) {
         var9 = 0;
      } else {
         var9 = this.progress.hashCode();
      }

      val var10: Int;
      if (this.uploaderId == null) {
         var10 = 0;
      } else {
         var10 = this.uploaderId.hashCode();
      }

      val var11: Int;
      if (this.uploaderItemId == null) {
         var11 = 0;
      } else {
         var11 = this.uploaderItemId.hashCode();
      }

      val var12: Int;
      if (this.placeholder == null) {
         var12 = 0;
      } else {
         var12 = this.placeholder.hashCode();
      }

      val var13: Int;
      if (this.placeholderVersion == null) {
         var13 = 0;
      } else {
         var13 = this.placeholderVersion.hashCode();
      }

      val var14: Int;
      if (this.backgroundColor == null) {
         var14 = 0;
      } else {
         var14 = this.backgroundColor.hashCode();
      }

      val var15: Int;
      if (this.attachmentTagText == null) {
         var15 = 0;
      } else {
         var15 = this.attachmentTagText.hashCode();
      }

      val var16: Int;
      if (this.attachmentTagBackgroundColor == null) {
         var16 = 0;
      } else {
         var16 = this.attachmentTagBackgroundColor.hashCode();
      }

      val var17: Int;
      if (this.attachmentTagTextColor == null) {
         var17 = 0;
      } else {
         var17 = this.attachmentTagTextColor.hashCode();
      }

      val var18: Int;
      if (this.attachmentTagIconType == null) {
         var18 = 0;
      } else {
         var18 = this.attachmentTagIconType.hashCode();
      }

      val var19: Int;
      if (this.attachmentType == null) {
         var19 = 0;
      } else {
         var19 = this.attachmentType.hashCode();
      }

      val var20: Int;
      if (this.obscure == null) {
         var20 = 0;
      } else {
         var20 = this.obscure.hashCode();
      }

      val var21: Int;
      if (this.obscureDescription == null) {
         var21 = 0;
      } else {
         var21 = this.obscureDescription.hashCode();
      }

      val var22: Int;
      if (this.obscureAwaitingScan == null) {
         var22 = 0;
      } else {
         var22 = this.obscureAwaitingScan.hashCode();
      }

      val var23: Int;
      if (this.obscureHideControls == null) {
         var23 = 0;
      } else {
         var23 = this.obscureHideControls.hashCode();
      }

      val var24: Int;
      if (this.obscureIsOpaque == null) {
         var24 = 0;
      } else {
         var24 = this.obscureIsOpaque.hashCode();
      }

      val var25: Int;
      if (this.verifyAge == null) {
         var25 = 0;
      } else {
         var25 = this.verifyAge.hashCode();
      }

      val var26: Int;
      if (this.durationSecs == null) {
         var26 = 0;
      } else {
         var26 = this.durationSecs.hashCode();
      }

      val var27: Int;
      if (this.waveform == null) {
         var27 = 0;
      } else {
         var27 = this.waveform.hashCode();
      }

      val var40: Int = java.lang.Boolean.hashCode(this.isAnimated);
      val var28: Int;
      if (this.mediaViewerBufferForPlaybackMs == null) {
         var28 = 0;
      } else {
         var28 = this.mediaViewerBufferForPlaybackMs.hashCode();
      }

      val var29: Int;
      if (this.mediaViewerBufferForPlaybackAfterRebufferMs == null) {
         var29 = 0;
      } else {
         var29 = this.mediaViewerBufferForPlaybackAfterRebufferMs.hashCode();
      }

      val var30: Int;
      if (this.mediaViewerMinBufferMs == null) {
         var30 = 0;
      } else {
         var30 = this.mediaViewerMinBufferMs.hashCode();
      }

      val var31: Int;
      if (this.mediaViewerMaxBufferMs == null) {
         var31 = 0;
      } else {
         var31 = this.mediaViewerMaxBufferMs.hashCode();
      }

      val var32: Int;
      if (this.mediaViewerEnableDecoderFallback == null) {
         var32 = 0;
      } else {
         var32 = this.mediaViewerEnableDecoderFallback.hashCode();
      }

      val var33: Int;
      if (this.mediaViewerEnableAsyncBufferQueueing == null) {
         var33 = 0;
      } else {
         var33 = this.mediaViewerEnableAsyncBufferQueueing.hashCode();
      }

      if (this.srcIsAnimated != null) {
         var34 = this.srcIsAnimated.hashCode();
      }

      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               (
                                                                                                                                                                        (
                                                                                                                                                                                 (
                                                                                                                                                                                          (
                                                                                                                                                                                                   (
                                                                                                                                                                                                            (
                                                                                                                                                                                                                     (
                                                                                                                                                                                                                              (
                                                                                                                                                                                                                                       (
                                                                                                                                                                                                                                                (
                                                                                                                                                                                                                                                         (
                                                                                                                                                                                                                                                                  (
                                                                                                                                                                                                                                                                           (
                                                                                                                                                                                                                                                                                    (
                                                                                                                                                                                                                                                                                             (
                                                                                                                                                                                                                                                                                                      (
                                                                                                                                                                                                                                                                                                               (
                                                                                                                                                                                                                                                                                                                        (
                                                                                                                                                                                                                                                                                                                                 (
                                                                                                                                                                                                                                                                                                                                          (
                                                                                                                                                                                                                                                                                                                                                   (
                                                                                                                                                                                                                                                                                                                                                            var1
                                                                                                                                                                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                                                                                                                                                                               + var35
                                                                                                                                                                                                                                                                                                                                                         )
                                                                                                                                                                                                                                                                                                                                                         * 31
                                                                                                                                                                                                                                                                                                                                                      + var2
                                                                                                                                                                                                                                                                                                                                                )
                                                                                                                                                                                                                                                                                                                                                * 31
                                                                                                                                                                                                                                                                                                                                             + var36
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var37
                                                                                                                                                                                                                                                                                                                              )
                                                                                                                                                                                                                                                                                                                              * 31
                                                                                                                                                                                                                                                                                                                           + var3
                                                                                                                                                                                                                                                                                                                     )
                                                                                                                                                                                                                                                                                                                     * 31
                                                                                                                                                                                                                                                                                                                  + var4
                                                                                                                                                                                                                                                                                                            )
                                                                                                                                                                                                                                                                                                            * 31
                                                                                                                                                                                                                                                                                                         + var38
                                                                                                                                                                                                                                                                                                   )
                                                                                                                                                                                                                                                                                                   * 31
                                                                                                                                                                                                                                                                                                + var5
                                                                                                                                                                                                                                                                                          )
                                                                                                                                                                                                                                                                                          * 31
                                                                                                                                                                                                                                                                                       + var6
                                                                                                                                                                                                                                                                                 )
                                                                                                                                                                                                                                                                                 * 31
                                                                                                                                                                                                                                                                              + var7
                                                                                                                                                                                                                                                                        )
                                                                                                                                                                                                                                                                        * 31
                                                                                                                                                                                                                                                                     + var8
                                                                                                                                                                                                                                                               )
                                                                                                                                                                                                                                                               * 31
                                                                                                                                                                                                                                                            + var39
                                                                                                                                                                                                                                                      )
                                                                                                                                                                                                                                                      * 31
                                                                                                                                                                                                                                                   + var9
                                                                                                                                                                                                                                             )
                                                                                                                                                                                                                                             * 31
                                                                                                                                                                                                                                          + var10
                                                                                                                                                                                                                                    )
                                                                                                                                                                                                                                    * 31
                                                                                                                                                                                                                                 + var11
                                                                                                                                                                                                                           )
                                                                                                                                                                                                                           * 31
                                                                                                                                                                                                                        + var12
                                                                                                                                                                                                                  )
                                                                                                                                                                                                                  * 31
                                                                                                                                                                                                               + var13
                                                                                                                                                                                                         )
                                                                                                                                                                                                         * 31
                                                                                                                                                                                                      + var14
                                                                                                                                                                                                )
                                                                                                                                                                                                * 31
                                                                                                                                                                                             + var15
                                                                                                                                                                                       )
                                                                                                                                                                                       * 31
                                                                                                                                                                                    + var16
                                                                                                                                                                              )
                                                                                                                                                                              * 31
                                                                                                                                                                           + var17
                                                                                                                                                                     )
                                                                                                                                                                     * 31
                                                                                                                                                                  + var18
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + var19
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + var20
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + var21
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + var22
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + var23
                                                                                                               )
                                                                                                               * 31
                                                                                                            + var24
                                                                                                      )
                                                                                                      * 31
                                                                                                   + var25
                                                                                             )
                                                                                             * 31
                                                                                          + var26
                                                                                    )
                                                                                    * 31
                                                                                 + var27
                                                                           )
                                                                           * 31
                                                                        + var40
                                                                  )
                                                                  * 31
                                                               + var28
                                                         )
                                                         * 31
                                                      + var29
                                                )
                                                * 31
                                             + var30
                                       )
                                       * 31
                                    + var31
                              )
                              * 31
                           + var32
                     )
                     * 31
                  + var33
            )
            * 31
         + var34;
   }

   public override fun toString(): String {
      val var33: java.lang.String = this.id;
      val var25: java.lang.String = this.url;
      val var26: java.lang.String = this.videoUrl;
      val var37: java.lang.String = this.filename;
      val var14: java.lang.String = this.size;
      val var11: Int = this.sourceWidth;
      val var18: Int = this.sourceHeight;
      val var1: Boolean = this.isSpoiler;
      val var19: java.lang.String = this.spoiler;
      val var15: java.lang.String = this.description;
      val var36: java.lang.String = this.hint;
      val var30: java.lang.String = this.role;
      val var2: Boolean = this.showDescription;
      val var38: Int = this.progress;
      val var31: java.lang.String = this.uploaderId;
      val var32: java.lang.String = this.uploaderItemId;
      val var8: java.lang.String = this.placeholder;
      val var20: Int = this.placeholderVersion;
      val var39: Int = this.backgroundColor;
      val var34: java.lang.String = this.attachmentTagText;
      val var28: Int = this.attachmentTagBackgroundColor;
      val var7: Int = this.attachmentTagTextColor;
      val var9: java.lang.String = this.attachmentTagIconType;
      val var12: java.lang.String = this.attachmentType;
      val var41: java.lang.Boolean = this.obscure;
      val var4: java.lang.String = this.obscureDescription;
      val var29: java.lang.Boolean = this.obscureAwaitingScan;
      val var16: java.lang.Boolean = this.obscureHideControls;
      val var35: java.lang.Boolean = this.obscureIsOpaque;
      val var6: java.lang.Boolean = this.verifyAge;
      val var10: java.lang.Float = this.durationSecs;
      val var27: java.lang.String = this.waveform;
      val var3: Boolean = this.isAnimated;
      val var21: Int = this.mediaViewerBufferForPlaybackMs;
      val var40: Int = this.mediaViewerBufferForPlaybackAfterRebufferMs;
      val var17: Int = this.mediaViewerMinBufferMs;
      val var13: Int = this.mediaViewerMaxBufferMs;
      val var5: java.lang.Boolean = this.mediaViewerEnableDecoderFallback;
      val var23: java.lang.Boolean = this.mediaViewerEnableAsyncBufferQueueing;
      val var24: java.lang.Boolean = this.srcIsAnimated;
      val var22: StringBuilder = new StringBuilder();
      var22.append("Attachment(id=");
      var22.append(var33);
      var22.append(", url=");
      var22.append(var25);
      var22.append(", videoUrl=");
      var22.append(var26);
      var22.append(", filename=");
      var22.append(var37);
      var22.append(", size=");
      var22.append(var14);
      var22.append(", sourceWidth=");
      var22.append(var11);
      var22.append(", sourceHeight=");
      var22.append(var18);
      var22.append(", isSpoiler=");
      var22.append(var1);
      var22.append(", spoiler=");
      var22.append(var19);
      var22.append(", description=");
      var22.append(var15);
      var22.append(", hint=");
      var22.append(var36);
      var22.append(", role=");
      var22.append(var30);
      var22.append(", showDescription=");
      var22.append(var2);
      var22.append(", progress=");
      var22.append(var38);
      var22.append(", uploaderId=");
      var22.append(var31);
      var22.append(", uploaderItemId=");
      var22.append(var32);
      var22.append(", placeholder=");
      var22.append(var8);
      var22.append(", placeholderVersion=");
      var22.append(var20);
      var22.append(", backgroundColor=");
      var22.append(var39);
      var22.append(", attachmentTagText=");
      var22.append(var34);
      var22.append(", attachmentTagBackgroundColor=");
      var22.append(var28);
      var22.append(", attachmentTagTextColor=");
      var22.append(var7);
      var22.append(", attachmentTagIconType=");
      var22.append(var9);
      var22.append(", attachmentType=");
      var22.append(var12);
      var22.append(", obscure=");
      var22.append(var41);
      var22.append(", obscureDescription=");
      var22.append(var4);
      var22.append(", obscureAwaitingScan=");
      var22.append(var29);
      var22.append(", obscureHideControls=");
      var22.append(var16);
      var22.append(", obscureIsOpaque=");
      var22.append(var35);
      var22.append(", verifyAge=");
      var22.append(var6);
      var22.append(", durationSecs=");
      var22.append(var10);
      var22.append(", waveform=");
      var22.append(var27);
      var22.append(", isAnimated=");
      var22.append(var3);
      var22.append(", mediaViewerBufferForPlaybackMs=");
      var22.append(var21);
      var22.append(", mediaViewerBufferForPlaybackAfterRebufferMs=");
      var22.append(var40);
      var22.append(", mediaViewerMinBufferMs=");
      var22.append(var17);
      var22.append(", mediaViewerMaxBufferMs=");
      var22.append(var13);
      var22.append(", mediaViewerEnableDecoderFallback=");
      var22.append(var5);
      var22.append(", mediaViewerEnableAsyncBufferQueueing=");
      var22.append(var23);
      var22.append(", srcIsAnimated=");
      var22.append(var24);
      var22.append(")");
      return var22.toString();
   }

   public fun type(): AttachmentType {
      val var1: AttachmentType;
      if (q.c(this.attachmentType, "audio")) {
         var1 = AttachmentType.Audio;
      } else if (!this.shouldShowImages()) {
         var1 = AttachmentType.File;
      } else if (q.c(this.attachmentType, "image") && this.hasDimensions()) {
         var1 = AttachmentType.Image;
      } else if (q.c(this.attachmentType, "video") && this.hasDimensions()) {
         var1 = AttachmentType.Video;
      } else {
         var1 = AttachmentType.File;
      }

      return var1;
   }

   public companion object {
      public fun serializer(): KSerializer<Attachment> {
         return Attachment.$serializer.INSTANCE;
      }
   }
}
