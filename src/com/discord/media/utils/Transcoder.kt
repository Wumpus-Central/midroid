package com.discord.media.utils

import android.content.Context
import android.media.MediaFormat
import android.net.Uri
import com.linkedin.android.litr.MediaTransformer
import java.nio.ByteBuffer
import java.util.LinkedHashMap
import java.util.concurrent.CancellationException
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CancellableContinuation

@SourceDebugExtension(["SMAP\nTranscoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transcoder.kt\ncom/discord/media/utils/Transcoder\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,114:1\n314#2,9:115\n323#2,2:125\n1#3:124\n*S KotlinDebug\n*F\n+ 1 Transcoder.kt\ncom/discord/media/utils/Transcoder\n*L\n29#1:115,9\n29#1:125,2\n*E\n"])
internal object Transcoder {
   private final val cancelCallbacks: MutableMap<String, () -> Unit> = new LinkedHashMap()

   @JvmStatic
   fun `convertCompress$lambda$0`(var0: Float): Unit {
      return Unit.a;
   }

   public fun cancel(requestId: String) {
      val var2: Function0 = cancelCallbacks.remove(var1);
      if (var2 != null) {
         var2.invoke();
      }
   }

   public suspend fun convertCompress(
      requestId: String,
      context: Context,
      mediaSource: DiscordVideoMediaSource,
      outputUri: Uri,
      encodingConfig: EncodingConfig,
      onProgress: (Float) -> Unit = ...
   ): Uri {
      val var8: kotlinx.coroutines.e = new kotlinx.coroutines.e(F9.b.c(var7), 1);
      var8.C();
      val var9: MediaTransformer = new MediaTransformer(var2);
      access$getCancelCallbacks$p().put(var1, new Function0<Unit>(var9, var1) {
         final java.lang.String $requestId;
         final MediaTransformer $transformer;

         {
            this.$transformer = var1;
            this.$requestId = var2;
         }

         public final void invoke() {
            this.$transformer.a(this.$requestId);
         }
      });
      val var13: MediaFormat = new MediaFormat();
      if (var5.getUseHEVC()) {
         var13.setString("mime", "video/hevc");
         if (var5.getCreateHDR()) {
            var13.setInteger("profile", 4096);
         } else {
            var13.setInteger("profile", 1);
         }
      } else {
         var13.setString("mime", "video/avc");
      }

      var13.setInteger("width", var5.getTargetWidth());
      var13.setInteger("height", var5.getTargetHeight());
      var13.setInteger("bitrate", var5.getTargetBitrate().intValue());
      var13.setFloat("frame-rate", var5.getFrameRate().floatValue());
      var13.setFloat("operating-rate", var5.getFrameRate().floatValue());
      var13.setFloat("i-frame-interval", var5.getKeyFrameIntervalSeconds().floatValue());
      var13.setInteger("rotation-degrees", var5.getRotationDegrees().intValue());
      var13.setInteger("priority", 1);
      val var10: DiscordVideoMediaSource.ColorFormatSettings = var3.getColorFormatSettings();
      if (var10 != null) {
         var var11: Int = var10.getColorTransfer();
         if (var11 != null) {
            var13.setInteger("color-transfer", var11.intValue());
         }

         var11 = var10.getColorStandard();
         if (var11 != null) {
            var13.setInteger("color-standard", var11.intValue());
         }

         var11 = var10.getColorRange();
         if (var11 != null) {
            var13.setInteger("color-range", var11.intValue());
         }

         val var15: ByteBuffer = var10.getHdrStaticInfo();
         if (var15 != null) {
            var13.setByteBuffer("hdr-static-info", var15);
         }
      }

      val var14: com.linkedin.android.litr.d = new com.linkedin.android.litr.d.b().c(true).b(var5.getProgressUpdateGranularity()).a();
      var9.h(var1, var3.getInputUri(), var4, var13, var3.getAudioFormat(), new g8.a(var6, var9, var1, var8, var4) {
         final CancellableContinuation $continuation;
         final Function1<java.lang.Float, Unit> $onProgress;
         final Uri $outputUri;
         final java.lang.String $requestId;
         final MediaTransformer $transformer;

         {
            this.$onProgress = var1;
            this.$transformer = var2;
            this.$requestId = var3;
            this.$continuation = var4;
            this.$outputUri = var5;
         }

         public void onCancelled(java.lang.String var1, java.util.List<h8.a> var2) {
            this.$transformer.e();
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            if (this.$continuation.c()) {
               val var3: kotlin.Result.a = Result.e;
               this.$continuation.resumeWith(Result.b(kotlin.c.a(new CancellationException("Video transcoding was cancelled"))));
            }
         }

         public void onCompleted(java.lang.String var1, java.util.List<h8.a> var2) {
            this.$transformer.e();
            this.$onProgress.invoke(1.0F);
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            val var4: kotlin.Result.a = Result.e;
            this.$continuation.resumeWith(Result.b(this.$outputUri));
         }

         public void onError(java.lang.String var1, java.lang.Throwable var2, java.util.List<h8.a> var3) {
            this.$transformer.e();
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            val var4: kotlin.Result.a = Result.e;
            var var5: java.lang.Throwable = var2;
            if (var2 == null) {
               var5 = new java.lang.Throwable("Unknown transcoding error");
            }

            this.$continuation.resumeWith(Result.b(kotlin.c.a(var5)));
         }

         public void onProgress(java.lang.String var1, float var2) {
            this.$onProgress.invoke(var2);
         }

         public void onStarted(java.lang.String var1) {
            this.$onProgress.invoke(0.0F);
         }
      }, var14);
      var8.e(new Function1<java.lang.Throwable, Unit>(var1) {
         final java.lang.String $requestId;

         {
            this.$requestId = var1;
         }

         public final void invoke(java.lang.Throwable var1) {
            Transcoder.INSTANCE.cancel(this.$requestId);
         }
      });
      val var12: Any = var8.z();
      if (var12 === F9.b.e()) {
         kotlin.coroutines.jvm.internal.g.c(var7);
      }

      return var12;
   }
}
