package com.discord.image.fresco.config

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import ca.j
import ca.w
import ca.y
import ca.z
import ca.w.a
import com.discord.networking.ReactNetworking
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.imagepipeline.core.ImagePipelineConfig.Builder
import com.facebook.react.bridge.BridgeReactContext
import com.facebook.react.modules.fresco.FrescoModule

private final val ATTACHMENT_CDN_HOSTS: Set<String> = w0.i(new java.lang.String[]{"cdn.discordapp.com", "media.discordapp.net", "images.discordapp.net"})
private final val SIGNED_QUERY_PARAMS: Set<String> = w0.i(new java.lang.String[]{"ex", "hm", "is"})

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
   val var2: Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var1: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   val var3: Builder = var2.V(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Z(var1.newSmallDiskCache(var0))
      .R(new FrescoBitmapSupplier(var0))
      .W(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var5: a = w.n();
   val var6: z = j.a();
   val var4: Builder = var3.X(new y(var5.n(new z(var6.b, var6.a * 2, var6.c)).m())).S(new DefaultCacheKeyFactory() {
      protected Uri getCacheKeySourceUri(Uri var1) {
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var3: android.net.Uri.Builder = var1.buildUpon();
            var3.clearQuery();

            for (java.lang.String var2 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var2)) {
                  val var5: java.util.Iterator = var1.getQueryParameters(var2).iterator();

                  while (var5.hasNext()) {
                     var3.appendQueryParameter(var2, var5.next() as java.lang.String);
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
      return (StringsKt.I(var1, "/attachments/", false, 2, null) || StringsKt.I(var1, "/ephemeral-attachments/", false, 2, null))
         && CollectionsKt.Z(ATTACHMENT_CDN_HOSTS, var0.getHost());
   }
}
