package com.discord.image.fresco.config

import ac.j
import ac.w
import ac.y
import ac.z
import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.net.Uri.Builder
import com.discord.networking.ReactNetworking
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.react.bridge.BridgeReactContext
import com.facebook.react.modules.fresco.FrescoModule

private final val ATTACHMENT_CDN_HOSTS: Set<String> = b1.i(new java.lang.String[]{"cdn.discordapp.com", "media.discordapp.net", "images.discordapp.net"})
private final val SIGNED_QUERY_PARAMS: Set<String> = b1.i(new java.lang.String[]{"ex", "hm", "is"})

@JvmSynthetic
fun `access$getSIGNED_QUERY_PARAMS$p`(): java.util.Set {
   return SIGNED_QUERY_PARAMS;
}

@JvmSynthetic
fun `access$isSignedUrl`(var0: Uri): Boolean {
   return isSignedUrl(var0);
}

@SuppressLint(["VisibleForTests"])
internal fun Context.frescoConfig(): ImagePipelineConfig {
   var var2: ImagePipelineConfig.Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var1: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   var2 = var2.V(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Z(var1.newSmallDiskCache(var0))
      .R(new FrescoBitmapSupplier(var0))
      .W(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var3: w.a = w.n();
   val var5: z = j.a();
   val var4: ImagePipelineConfig.Builder = var2.X(new y(var3.n(new z(var5.b, var5.a * 2, var5.c)).m())).S(new DefaultCacheKeyFactory() {
      @Override
      protected Uri getCacheKeySourceUri(Uri var1) {
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var3: Builder = var1.buildUpon();
            var3.clearQuery();

            for (java.lang.String var4 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var4)) {
                  val var2: java.util.Iterator = var1.getQueryParameters(var4).iterator();

                  while (var2.hasNext()) {
                     var3.appendQueryParameter(var4, var2.next() as java.lang.String);
                  }
               }
            }

            var1 = var3.build();
            return var1;
         }
      }
   }).T(true);
   var4.b().g(true);
   return var4.a();
}

private fun isSignedUrl(uri: Uri): Boolean {
   val var1: java.lang.String = var0.getPath();
   if (var1 == null) {
      return false;
   } else {
      return (StringsKt.N(var1, "/attachments/", false, 2, null) || StringsKt.N(var1, "/ephemeral-attachments/", false, 2, null))
         && CollectionsKt.d0(ATTACHMENT_CDN_HOSTS, var0.getHost());
   }
}
