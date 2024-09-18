package com.discord.image.fresco.config;

import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher;
import com.facebook.imagepipeline.backends.okhttp3.OkHttpNetworkFetcher.OkHttpNetworkFetchState;
import com.facebook.imagepipeline.producers.NetworkFetcher.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.fresco.ReactNetworkImageRequest;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.CacheControl.a;
import okhttp3.Request.Builder;

class ReactOkHttpNetworkFetcher extends OkHttpNetworkFetcher {
   private static final String TAG = "ReactOkHttpNetworkFetcher";
   private final Executor mCancellationExecutor;
   private final OkHttpClient mOkHttpClient;

   public ReactOkHttpNetworkFetcher(OkHttpClient var1) {
      super(var1);
      this.mOkHttpClient = var1;
      this.mCancellationExecutor = var1.p().d();
   }

   private Map<String, String> getHeaders(ReadableMap var1) {
      if (var1 == null) {
         return null;
      } else {
         ReadableMapKeySetIterator var3 = var1.keySetIterator();
         HashMap var2 = new HashMap();

         while (var3.hasNextKey()) {
            String var4 = var3.nextKey();
            var2.put(var4, var1.getString(var4));
         }

         return var2;
      }
   }

   public void fetch(OkHttpNetworkFetchState var1, Callback var2) {
      var1.f = SystemClock.elapsedRealtime();
      Uri var5 = var1.g();
      Map var3;
      if (var1.b().v() instanceof ReactNetworkImageRequest) {
         var3 = this.getHeaders(((ReactNetworkImageRequest)var1.b().v()).getHeaders());
      } else {
         var3 = null;
      }

      Map var4 = var3;
      if (var3 == null) {
         var4 = Collections.emptyMap();
      }

      this.fetchWithRequest(var1, var2, new Builder().c(new a().e().a()).l(var5.toString()).f(Headers.s(var4)).d().b());
   }
}
