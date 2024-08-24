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
import kotlin.jvm.internal.r
import okhttp3.Interceptor
import okhttp3.Response
import okhttp3.Interceptor.Chain
import x5.l
import x5.x
import x5.y
import x5.z
import x5.x.b

private final val ATTACHMENT_CDN_HOSTS: Set<String> = u.i(new java.lang.String[]{"cdn.discordapp.com", "media.discordapp.net", "images.discordapp.net"})
private final val SIGNED_QUERY_PARAMS: Set<String> = u.i(new java.lang.String[]{"ex", "hm", "is"})

@JvmSynthetic
fun `access$getSIGNED_QUERY_PARAMS$p`(): java.util.Set {
   return SIGNED_QUERY_PARAMS;
}

@JvmSynthetic
fun `access$isSignedUrl`(var0: Uri): Boolean {
   return isSignedUrl(var0);
}

internal fun Context.frescoConfig(): ImagePipelineConfig {
   r.h(var0, "<this>");
   val var1: Builder = FrescoModule.getDefaultConfigBuilder(new ReactContext(var0));
   val var2: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   val var3: Builder = var1.P(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .T(var2.newSmallDiskCache(var0))
      .M(new FrescoBitmapSupplier(var0))
      .Q(new ReactOkHttpNetworkFetcher(OkHttpClientProvider.createClient().B().b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            r.h(var1, "chain");
            return this.$receiver$inlined.frescoInterceptor(var1);
         }
      }).c()));
   val var5: b = x.n();
   val var6: z = l.a();
   val var4: ImagePipelineConfig = var3.R(new y(var5.n(new z(var6.b, var6.a * 2, var6.c)).m())).N(new DefaultCacheKeyFactory() {
      protected Uri getCacheKeySourceUri(Uri var1) {
         r.h(var1, "sourceUri");
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var4: android.net.Uri.Builder = var1.buildUpon();
            var4.clearQuery();

            for (java.lang.String var2 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var2)) {
                  val var5: java.util.Iterator = var1.getQueryParameters(var2).iterator();

                  while (var5.hasNext()) {
                     var4.appendQueryParameter(var2, var5.next() as java.lang.String);
                  }
               }
            }

            var1 = var4.build();
            r.g(var1, "cacheKeyBuilder.build()");
            return var1;
         }
      }
   }).O(true).L().t(true).K();
   r.g(var4, "getDefaultConfigBuilder(…ns(true)\n        .build()");
   return var4;
}

private fun isSignedUrl(uri: Uri): Boolean {
   val var3: java.lang.String = var0.getPath();
   if (var3 == null) {
      return false;
   } else if (!f.I(var3, "/attachments/", false, 2, null) && !f.I(var3, "/ephemeral-attachments/", false, 2, null)) {
      return false;
   } else {
      var var1: Boolean = false;
      if (h.Q(ATTACHMENT_CDN_HOSTS, var0.getHost())) {
         var1 = true;
      }

      return var1;
   }
}
