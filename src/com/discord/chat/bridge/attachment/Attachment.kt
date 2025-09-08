package com.discord.chat.bridge.attachment

import A9.j
import android.net.UrlQuerySanitizer
import android.util.Base64
import com.discord.chat.bridge.spoiler.SpoilerableData
import com.discord.media_player.MediaPlayer
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.react_asset_fetcher.ReactAsset
import kotlin.Result.a
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import mb.g
import o1.b

@g
@SourceDebugExtension(["SMAP\nAttachment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attachment.kt\ncom/discord/chat/bridge/attachment/Attachment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,129:1\n1#2:130\n*E\n"])
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
         this.playerSettings$delegate = j.b(new b(this));
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
      if (this.spoiler != null && !StringsKt.c0(this.spoiler)) {
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
            if (!StringsKt.c0(this.obscureDescription)) {
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
            val var3: a = Result.e;
            var1 = new UrlQuerySanitizer(this.url).getValue(var1);
         } catch (var6: java.lang.Throwable) {
            val var16: a = Result.e;
            var17 = Result.b(c.a(var6));
            break label38;
         }

         val var20: Int;
         if (var1 != null) {
            try {
               var20 = StringsKt.toIntOrNull(var1);
            } catch (var5: java.lang.Throwable) {
               val var19: a = Result.e;
               var17 = Result.b(c.a(var5));
               break label38;
            }
         } else {
            var20 = null;
         }

         label26:
         try {
            var17 = Result.b(var20);
         } catch (var4: java.lang.Throwable) {
            val var21: a = Result.e;
            var17 = Result.b(c.a(var4));
            break label26;
         }
      }

      if (Result.g(var17)) {
         var17 = null;
      }

      return var17 as Int;
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
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.url == var1.url)) {
            return false;
         } else if (!(this.videoUrl == var1.videoUrl)) {
            return false;
         } else if (!(this.filename == var1.filename)) {
            return false;
         } else if (!(this.size == var1.size)) {
            return false;
         } else if (!(this.sourceWidth == var1.sourceWidth)) {
            return false;
         } else if (!(this.sourceHeight == var1.sourceHeight)) {
            return false;
         } else if (this.isSpoiler != var1.isSpoiler) {
            return false;
         } else if (!(this.spoiler == var1.spoiler)) {
            return false;
         } else if (!(this.description == var1.description)) {
            return false;
         } else if (!(this.hint == var1.hint)) {
            return false;
         } else if (!(this.role == var1.role)) {
            return false;
         } else if (this.showDescription != var1.showDescription) {
            return false;
         } else if (!(this.progress == var1.progress)) {
            return false;
         } else if (!(this.uploaderId == var1.uploaderId)) {
            return false;
         } else if (!(this.uploaderItemId == var1.uploaderItemId)) {
            return false;
         } else if (!(this.placeholder == var1.placeholder)) {
            return false;
         } else if (!(this.placeholderVersion == var1.placeholderVersion)) {
            return false;
         } else if (!(this.backgroundColor == var1.backgroundColor)) {
            return false;
         } else if (!(this.attachmentTagText == var1.attachmentTagText)) {
            return false;
         } else if (!(this.attachmentTagBackgroundColor == var1.attachmentTagBackgroundColor)) {
            return false;
         } else if (!(this.attachmentTagTextColor == var1.attachmentTagTextColor)) {
            return false;
         } else if (!(this.attachmentTagIconType == var1.attachmentTagIconType)) {
            return false;
         } else if (!(this.attachmentType == var1.attachmentType)) {
            return false;
         } else if (!(this.obscure == var1.obscure)) {
            return false;
         } else if (!(this.obscureDescription == var1.obscureDescription)) {
            return false;
         } else if (!(this.obscureAwaitingScan == var1.obscureAwaitingScan)) {
            return false;
         } else if (!(this.obscureHideControls == var1.obscureHideControls)) {
            return false;
         } else if (!(this.obscureIsOpaque == var1.obscureIsOpaque)) {
            return false;
         } else if (!(this.verifyAge == var1.verifyAge)) {
            return false;
         } else if (!(this.durationSecs == var1.durationSecs)) {
            return false;
         } else if (!(this.waveform == var1.waveform)) {
            return false;
         } else if (this.isAnimated != var1.isAnimated) {
            return false;
         } else if (!(this.mediaViewerBufferForPlaybackMs == var1.mediaViewerBufferForPlaybackMs)) {
            return false;
         } else if (!(this.mediaViewerBufferForPlaybackAfterRebufferMs == var1.mediaViewerBufferForPlaybackAfterRebufferMs)) {
            return false;
         } else if (!(this.mediaViewerMinBufferMs == var1.mediaViewerMinBufferMs)) {
            return false;
         } else if (!(this.mediaViewerMaxBufferMs == var1.mediaViewerMaxBufferMs)) {
            return false;
         } else if (!(this.mediaViewerEnableDecoderFallback == var1.mediaViewerEnableDecoderFallback)) {
            return false;
         } else if (!(this.mediaViewerEnableAsyncBufferQueueing == var1.mediaViewerEnableAsyncBufferQueueing)) {
            return false;
         } else {
            return this.srcIsAnimated == var1.srcIsAnimated;
         }
      }
   }

   public fun getAttachmentTagIcon(): ReactAsset? {
      val var1: ReactAsset;
      if (this.attachmentTagIconType == "clip") {
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

      val var37: Int = this.filename.hashCode();
      val var36: Int = this.size.hashCode();
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
                                                                                                                                                                                                                                                                                                                                             + var37
                                                                                                                                                                                                                                                                                                                                       )
                                                                                                                                                                                                                                                                                                                                       * 31
                                                                                                                                                                                                                                                                                                                                    + var36
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
      val var26: java.lang.String = this.id;
      val var9: java.lang.String = this.url;
      val var24: java.lang.String = this.videoUrl;
      val var14: java.lang.String = this.filename;
      val var13: java.lang.String = this.size;
      val var29: Int = this.sourceWidth;
      val var7: Int = this.sourceHeight;
      val var1: Boolean = this.isSpoiler;
      val var21: java.lang.String = this.spoiler;
      val var36: java.lang.String = this.description;
      val var38: java.lang.String = this.hint;
      val var41: java.lang.String = this.role;
      val var3: Boolean = this.showDescription;
      val var15: Int = this.progress;
      val var12: java.lang.String = this.uploaderId;
      val var17: java.lang.String = this.uploaderItemId;
      val var8: java.lang.String = this.placeholder;
      val var10: Int = this.placeholderVersion;
      val var18: Int = this.backgroundColor;
      val var27: java.lang.String = this.attachmentTagText;
      val var30: Int = this.attachmentTagBackgroundColor;
      val var40: Int = this.attachmentTagTextColor;
      val var32: java.lang.String = this.attachmentTagIconType;
      val var23: java.lang.String = this.attachmentType;
      val var5: java.lang.Boolean = this.obscure;
      val var33: java.lang.String = this.obscureDescription;
      val var35: java.lang.Boolean = this.obscureAwaitingScan;
      val var6: java.lang.Boolean = this.obscureHideControls;
      val var19: java.lang.Boolean = this.obscureIsOpaque;
      val var37: java.lang.Boolean = this.verifyAge;
      val var34: java.lang.Float = this.durationSecs;
      val var4: java.lang.String = this.waveform;
      val var2: Boolean = this.isAnimated;
      val var16: Int = this.mediaViewerBufferForPlaybackMs;
      val var11: Int = this.mediaViewerBufferForPlaybackAfterRebufferMs;
      val var39: Int = this.mediaViewerMinBufferMs;
      val var25: Int = this.mediaViewerMaxBufferMs;
      val var20: java.lang.Boolean = this.mediaViewerEnableDecoderFallback;
      val var22: java.lang.Boolean = this.mediaViewerEnableAsyncBufferQueueing;
      val var31: java.lang.Boolean = this.srcIsAnimated;
      val var28: StringBuilder = new StringBuilder();
      var28.append("Attachment(id=");
      var28.append(var26);
      var28.append(", url=");
      var28.append(var9);
      var28.append(", videoUrl=");
      var28.append(var24);
      var28.append(", filename=");
      var28.append(var14);
      var28.append(", size=");
      var28.append(var13);
      var28.append(", sourceWidth=");
      var28.append(var29);
      var28.append(", sourceHeight=");
      var28.append(var7);
      var28.append(", isSpoiler=");
      var28.append(var1);
      var28.append(", spoiler=");
      var28.append(var21);
      var28.append(", description=");
      var28.append(var36);
      var28.append(", hint=");
      var28.append(var38);
      var28.append(", role=");
      var28.append(var41);
      var28.append(", showDescription=");
      var28.append(var3);
      var28.append(", progress=");
      var28.append(var15);
      var28.append(", uploaderId=");
      var28.append(var12);
      var28.append(", uploaderItemId=");
      var28.append(var17);
      var28.append(", placeholder=");
      var28.append(var8);
      var28.append(", placeholderVersion=");
      var28.append(var10);
      var28.append(", backgroundColor=");
      var28.append(var18);
      var28.append(", attachmentTagText=");
      var28.append(var27);
      var28.append(", attachmentTagBackgroundColor=");
      var28.append(var30);
      var28.append(", attachmentTagTextColor=");
      var28.append(var40);
      var28.append(", attachmentTagIconType=");
      var28.append(var32);
      var28.append(", attachmentType=");
      var28.append(var23);
      var28.append(", obscure=");
      var28.append(var5);
      var28.append(", obscureDescription=");
      var28.append(var33);
      var28.append(", obscureAwaitingScan=");
      var28.append(var35);
      var28.append(", obscureHideControls=");
      var28.append(var6);
      var28.append(", obscureIsOpaque=");
      var28.append(var19);
      var28.append(", verifyAge=");
      var28.append(var37);
      var28.append(", durationSecs=");
      var28.append(var34);
      var28.append(", waveform=");
      var28.append(var4);
      var28.append(", isAnimated=");
      var28.append(var2);
      var28.append(", mediaViewerBufferForPlaybackMs=");
      var28.append(var16);
      var28.append(", mediaViewerBufferForPlaybackAfterRebufferMs=");
      var28.append(var11);
      var28.append(", mediaViewerMinBufferMs=");
      var28.append(var39);
      var28.append(", mediaViewerMaxBufferMs=");
      var28.append(var25);
      var28.append(", mediaViewerEnableDecoderFallback=");
      var28.append(var20);
      var28.append(", mediaViewerEnableAsyncBufferQueueing=");
      var28.append(var22);
      var28.append(", srcIsAnimated=");
      var28.append(var31);
      var28.append(")");
      return var28.toString();
   }

   public fun type(): AttachmentType {
      val var1: AttachmentType;
      if (this.attachmentType == "audio") {
         var1 = AttachmentType.Audio;
      } else if (!this.shouldShowImages()) {
         var1 = AttachmentType.File;
      } else if (this.attachmentType == "image" && this.hasDimensions()) {
         var1 = AttachmentType.Image;
      } else if (this.attachmentType == "video" && this.hasDimensions()) {
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
