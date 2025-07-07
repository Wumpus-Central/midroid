package com.discord.image.fresco.config

import A3.C
import A3.E
import A3.F
import A3.o
import A3.C.a
import android.annotation.SuppressLint
import android.content.Context
import android.net.Uri
import android.net.Uri.Builder
import com.discord.networking.ReactNetworking
import com.facebook.imagepipeline.cache.DefaultCacheKeyFactory
import com.facebook.imagepipeline.core.ImagePipelineConfig
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

@SuppressLint(["VisibleForTests"])
internal fun Context.frescoConfig(): ImagePipelineConfig {
   q.h(var0, "<this>");
   var var2: ImagePipelineConfig.Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var1: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   var2 = var2.V(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Z(var1.newSmallDiskCache(var0))
      .R(new FrescoBitmapSupplier(var0))
      .W(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var3: a = C.n();
   val var5: F = o.a();
   val var4: ImagePipelineConfig.Builder = var2.X(new E(var3.n(new F(var5.b, var5.a * 2, var5.c)).m())).S(new DefaultCacheKeyFactory() {
      @Override
      protected Uri getCacheKeySourceUri(Uri var1) {
         q.h(var1, "sourceUri");
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var2: Builder = var1.buildUpon();
            var2.clearQuery();

            for (java.lang.String var4 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var4)) {
                  val var3: java.util.Iterator = var1.getQueryParameters(var4).iterator();

                  while (var3.hasNext()) {
                     var2.appendQueryParameter(var4, var3.next() as java.lang.String);
                  }
               }
            }

            var1 = var2.build();
            q.g(var1, "build(...)");
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
   } else if (!h.I(var3, "/attachments/", false, 2, null) && !h.I(var3, "/ephemeral-attachments/", false, 2, null)) {
      return false;
   } else {
      var var1: Boolean = false;
      if (i.V(ATTACHMENT_CDN_HOSTS, var0.getHost())) {
         var1 = true;
      }

      return var1;
   }
}
