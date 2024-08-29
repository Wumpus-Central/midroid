package com.discord.image.fresco.config

import android.content.Context
import android.net.Uri
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.discord.resource_usage.DeviceResourceUsageRecorder.Companion
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.imagepipeline.core.ImagePipelineConfig.Builder
import com.facebook.react.bridge.ReactContext
import com.facebook.react.modules.fresco.FrescoModule
import com.facebook.react.modules.network.OkHttpClientProvider
import kotlin.jvm.internal.q
import l7.c0
import l7.e0
import l7.f0
import l7.o
import l7.c0.a
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.Interceptor.Chain

private final val ATTACHMENT_CDN_HOSTS: Set<String> = w.i(new java.lang.String[]{"cdn.discordapp.com", "media.discordapp.net", "images.discordapp.net"})
private final val SIGNED_QUERY_PARAMS: Set<String> = w.i(new java.lang.String[]{"ex", "hm", "is"})

@JvmSynthetic
fun `access$getSIGNED_QUERY_PARAMS$p`(): java.util.Set {
   return SIGNED_QUERY_PARAMS;
}

@JvmSynthetic
fun `access$isSignedUrl`(var0: Uri): Boolean {
   return isSignedUrl(var0);
}

internal fun Context.frescoConfig(): ImagePipelineConfig {
   q.h(var0, "<this>");
   val var2: Builder = FrescoModule.getDefaultConfigBuilder(new ReactContext(var0));
   val var1: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   val var5: Builder = var2.U(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Y(var1.newSmallDiskCache(var0))
      .Q(new FrescoBitmapSupplier(var0))
      .V(new ReactOkHttpNetworkFetcher(OkHttpClientProvider.createClient().B().b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            q.h(var1, "chain");
            return this.$receiver$inlined.frescoInterceptor(var1);
         }
      }).c()));
   val var3: a = c0.n();
   val var6: f0 = o.a();
   val var4: Builder = var5.W(new e0(var3.n(new f0(var6.b, var6.a * 2, var6.c)).m())).R(new DefaultCacheKeyFactory() {
      protected Uri getCacheKeySourceUri(Uri var1) {
         q.h(var1, "sourceUri");
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var5: android.net.Uri.Builder = var1.buildUpon();
            var5.clearQuery();

            for (java.lang.String var2 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var2)) {
                  val var3: java.util.Iterator = var1.getQueryParameters(var2).iterator();

                  while (var3.hasNext()) {
                     var5.appendQueryParameter(var2, var3.next() as java.lang.String);
                  }
               }
            }

            var1 = var5.build();
            q.g(var1, "build(...)");
            return var1;
         }
      }
   }).S(true);
   var4.b().c(true);
   return var4.a();
}

private fun isSignedUrl(uri: Uri): Boolean {
   val var3: java.lang.String = var0.getPath();
   if (var3 == null) {
      return false;
   } else if (!h.H(var3, "/attachments/", false, 2, null) && !h.H(var3, "/ephemeral-attachments/", false, 2, null)) {
      return false;
   } else {
      var var1: Boolean = false;
      if (i.T(ATTACHMENT_CDN_HOSTS, var0.getHost())) {
         var1 = true;
      }

      return var1;
   }
}
