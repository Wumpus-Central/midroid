package com.discord.networking

import com.discord.logging.Log
import com.discord.networking.okhttp.OkHttpDNSSelector
import com.discord.resource_usage.DeviceResourceUsageRecorder
import com.facebook.imagepipeline.producers.NetworkFetcher
import com.facebook.react.modules.fresco.ReactOkHttpNetworkFetcher
import com.facebook.react.modules.network.NetworkingModule
import com.facebook.react.modules.network.OkHttpClientProvider
import com.facebook.react.modules.websocket.WebSocketModule
import java.lang.reflect.Constructor
import kotlin.jvm.internal.r
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder

public object ReactNetworking {
   @JvmStatic
   fun `patchReactNetworking$lambda$0`(var0: Builder) {
      var0.b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            r.h(var1, "chain");
            return this.$receiver$inlined.clientXHRInterceptor(var1);
         }
      });
   }

   @JvmStatic
   fun `patchReactNetworking$lambda$1`(var0: Builder) {
      var0.i(new OkHttpDNSSelector(OkHttpDNSSelector.IPvMode.IPV4_FIRST));
   }

   public fun createReactOkHttpNetworkFetcher(): NetworkFetcher<*> {
      val var3: OkHttpClient = OkHttpClientProvider.createClient().D().b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         public final Response intercept(Chain var1) {
            r.h(var1, "chain");
            return this.$receiver$inlined.frescoInterceptor(var1);
         }
      }).c();

      try {
         val var1: Int = ReactOkHttpNetworkFetcher.a;
         val var2: Constructor = ReactOkHttpNetworkFetcher.class.getDeclaredConstructor(OkHttpClient.class);
         var2.setAccessible(true);
         var var5: StringBuilder = (StringBuilder)var2.newInstance(var3);
         if (var5 is NetworkFetcher) {
            return var5 as NetworkFetcher;
         } else {
            var5 = new StringBuilder();
            var5.append("Field ");
            var5.append(ReactOkHttpNetworkFetcher::class.java);
            var5.append(" not instance of ");
            var5.append(NetworkFetcher::class.java);
            var5.append(".");
            throw new IllegalStateException(var5.toString().toString());
         }
      } catch (var4: Exception) {
         Log.INSTANCE.e("ReactNetworking", "Failed to instantiate com.facebook.react.modules.fresco.ReactOkHttpNetworkFetcher", var4);
         throw var4;
      }
   }

   public fun patchReactNetworking() {
      NetworkingModule.setCustomClientBuilder(new a());
      WebSocketModule.Companion.setCustomClientBuilder(new b());
   }
}
