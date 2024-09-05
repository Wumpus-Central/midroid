package com.discord.media.utils

import android.content.Context
import android.net.Uri
import com.linkedin.android.litr.MediaTransformer
import java.util.LinkedHashMap
import kotlin.coroutines.jvm.internal.g
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlinx.coroutines.CancellableContinuation
import kotlinx.coroutines.e
import vj.r
import vj.s

internal object Transcoder {
   private final val cancelCallbacks: MutableMap<String, () -> Unit> = new LinkedHashMap()

   public fun cancel(requestId: String) {
      q.h(var1, "requestId");
      val var2: Function0 = cancelCallbacks.remove(var1);
      if (var2 != null) {
         var2.invoke();
      }
   }

   public suspend fun convertCompress(requestId: String, context: Context, mediaSource: DiscordVideoMediaSource, onProgress: (Float) -> Unit = ...): Uri {
      val var6: e = new e(bk.b.c(var5), 1);
      var6.F();
      val var8: MediaTransformer = new MediaTransformer(var2);
      access$getCancelCallbacks$p().put(var1, new Function0(var8, var1) {
         final java.lang.String $requestId;
         final MediaTransformer $transformer;

         {
            super(0);
            this.$transformer = var1;
            this.$requestId = var2;
         }

         public final void invoke() {
            this.$transformer.a(this.$requestId);
         }
      });
      var8.h(var1, var3.getInputUri(), var3.getOutputUri(), var3.getVideoFormat(), var3.getAudioFormat(), new mh.a(var4, var8, var1, var6, var3) {
         final CancellableContinuation $continuation;
         final DiscordVideoMediaSource $mediaSource;
         final Function1 $onProgress;
         final java.lang.String $requestId;
         final MediaTransformer $transformer;

         {
            this.$onProgress = var1;
            this.$transformer = var2;
            this.$requestId = var3;
            this.$continuation = var4;
            this.$mediaSource = var5;
         }

         public void onCancelled(java.lang.String var1, java.util.List<nh.a> var2) {
            q.h(var1, "id");
            this.$transformer.e();
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            if (this.$continuation.e()) {
               kotlinx.coroutines.CancellableContinuation.a.a(this.$continuation, null, 1, null);
            }
         }

         public void onCompleted(java.lang.String var1, java.util.List<nh.a> var2) {
            q.h(var1, "id");
            this.$transformer.e();
            this.$onProgress.invoke(1.0F);
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            val var4: vj.r.a = r.k;
            this.$continuation.resumeWith(r.b(this.$mediaSource.getOutputUri()));
         }

         public void onError(java.lang.String var1, java.lang.Throwable var2, java.util.List<nh.a> var3) {
            q.h(var1, "id");
            this.$transformer.e();
            Transcoder.access$getCancelCallbacks$p().remove(this.$requestId);
            val var4: vj.r.a = r.k;
            var var5: java.lang.Throwable = var2;
            if (var2 == null) {
               var5 = new java.lang.Throwable("Unknown transcoding error");
            }

            this.$continuation.resumeWith(r.b(s.a(var5)));
         }

         public void onProgress(java.lang.String var1, float var2) {
            q.h(var1, "id");
            this.$onProgress.invoke(var2);
         }

         public void onStarted(java.lang.String var1) {
            q.h(var1, "id");
            this.$onProgress.invoke(0.0F);
         }
      }, null);
      var6.c(new Function1(var1) {
         final java.lang.String $requestId;

         {
            super(1);
            this.$requestId = var1;
         }

         public final void invoke(java.lang.Throwable var1) {
            Transcoder.INSTANCE.cancel(this.$requestId);
         }
      });
      val var7: Any = var6.z();
      if (var7 === bk.b.f()) {
         g.c(var5);
      }

      return var7;
   }
}
