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
   var var1: ImagePipelineConfig.Builder = FrescoModule.Companion.getDefaultConfigBuilder(new BridgeReactContext(var0));
   val var2: FrescoDiskCache = FrescoDiskCache.INSTANCE;
   var1 = var1.V(FrescoDiskCache.INSTANCE.newRegularDiskCache(var0))
      .Z(var2.newSmallDiskCache(var0))
      .R(new FrescoBitmapSupplier(var0))
      .W(ReactNetworking.INSTANCE.createReactOkHttpNetworkFetcher());
   val var6: a = C.n();
   val var3: F = o.a();
   val var4: ImagePipelineConfig.Builder = var1.X(new E(var6.n(new F(var3.b, var3.a * 2, var3.c)).m())).S(new DefaultCacheKeyFactory() {
      @Override
      protected Uri getCacheKeySourceUri(Uri var1) {
         q.h(var1, "sourceUri");
         if (!FrescoConfigKt.access$isSignedUrl(var1)) {
            return var1;
         } else {
            val var4: Builder = var1.buildUpon();
            var4.clearQuery();

            for (java.lang.String var5 : var1.getQueryParameterNames()) {
               if (!FrescoConfigKt.access$getSIGNED_QUERY_PARAMS$p().contains(var5)) {
                  val var3: java.util.Iterator = var1.getQueryParameters(var5).iterator();

                  while (var3.hasNext()) {
                     var4.appendQueryParameter(var5, var3.next() as java.lang.String);
                  }
               }
            }

            var1 = var4.build();
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
