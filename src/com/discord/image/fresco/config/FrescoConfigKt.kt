package com.discord.image.fresco.config

import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import com.discord.networking.ReactNetworking
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
import com.facebook.imagepipeline.core.ImagePipelineConfig.Builder
import com.facebook.react.bridge.BridgeReactContext
import com.facebook.react.modules.fresco.FrescoModule
import y3.C
import y3.E
import y3.F
import y3.o
import y3.C.a

private final val ATTACHMENT_CDN_HOSTS: Set<String> = V.i(new java.lang.String[]{"cdn.discordapp.com", "media.discordapp.net", "images.discordapp.net"})
private final val SIGNED_QUERY_PARAMS: Set<String> = V.i(new java.lang.String[]{"ex", "hm", "is"})

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
   val var1: Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var2: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   val var6: Builder = var1.V(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Z(var2.newSmallDiskCache(var0))
      .R(new FrescoBitmapSupplier(var0))
      .W(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var3: a = C.n();
   val var5: F = o.a();
   val var4: Builder = var6.X(new E(var3.n(new F(var5.b, var5.a * 2, var5.c)).m())).S(new DefaultCacheKeyFactory() {
      protected Uri getCacheKeySourceUri(Uri var1) {
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var5: android.net.Uri.Builder = var1.buildUpon();
            var5.clearQuery();

            for (java.lang.String var3 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var3)) {
                  val var4: java.util.Iterator = var1.getQueryParameters(var3).iterator();

                  while (var4.hasNext()) {
                     var5.appendQueryParameter(var3, var4.next() as java.lang.String);
                  }
               }
            }

            var1 = var5.build();
            return var1;
         }
      }
   }).T(true);
   var4.b().g(true);
   return var4.a();
}

private fun isSignedUrl(uri: Uri): Boolean {
   val var3: java.lang.String = var0.getPath();
   if (var3 == null) {
      return false;
   } else if (!StringsKt.I(var3, "/attachments/", false, 2, null) && !StringsKt.I(var3, "/ephemeral-attachments/", false, 2, null)) {
      return false;
   } else {
      var var1: Boolean = false;
      if (CollectionsKt.X(ATTACHMENT_CDN_HOSTS, var0.getHost())) {
         var1 = true;
      }

      return var1;
   }
}
