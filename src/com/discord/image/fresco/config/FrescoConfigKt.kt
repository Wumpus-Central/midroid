package com.discord.image.fresco.config

import K2.C
import K2.E
import K2.F
import K2.o
import K2.C.a
import android.content.Context
import android.net.Uri
import com.discord.networking.ReactNetworking
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.imagepipeline.core.ImagePipelineConfig.Builder
import com.facebook.react.bridge.BridgeReactContext
import com.facebook.react.modules.fresco.FrescoModule
import kotlin.jvm.internal.q

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
   val var1: Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var2: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   val var3: Builder = var1.U(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Y(var2.newSmallDiskCache(var0))
      .Q(new FrescoBitmapSupplier(var0))
      .V(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var6: a = C.n();
   val var5: F = o.a();
   val var4: Builder = var3.W(new E(var6.n(new F(var5.b, var5.a * 2, var5.c)).m())).R(new DefaultCacheKeyFactory() {
      @Override
      protected Uri getCacheKeySourceUri(Uri var1) {
         q.h(var1, "sourceUri");
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var2: android.net.Uri.Builder = var1.buildUpon();
            var2.clearQuery();

            for (java.lang.String var3 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var3)) {
                  val var4: java.util.Iterator = var1.getQueryParameters(var3).iterator();

                  while (var4.hasNext()) {
                     var2.appendQueryParameter(var3, var4.next() as java.lang.String);
                  }
               }
            }

            var1 = var2.build();
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
   } else if (!h.J(var3, "/attachments/", false, 2, null) && !h.J(var3, "/ephemeral-attachments/", false, 2, null)) {
      return false;
   } else {
      var var1: Boolean = false;
      if (i.V(ATTACHMENT_CDN_HOSTS, var0.getHost())) {
         var1 = true;
      }

      return var1;
   }
}
