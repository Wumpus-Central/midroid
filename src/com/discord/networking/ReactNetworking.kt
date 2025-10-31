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
import kotlin.jvm.internal.SourceDebugExtension
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain
import okhttp3.OkHttpClient.Builder
import org.jetbrains.annotations.NotNull

@SourceDebugExtension(["SMAP\nReactNetworking.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNetworking.kt\ncom/discord/networking/ReactNetworking\n+ 2 OkHttpClient.kt\nokhttp3/OkHttpClient$Builder\n*L\n1#1,54:1\n578#2:55\n578#2:56\n*S KotlinDebug\n*F\n+ 1 ReactNetworking.kt\ncom/discord/networking/ReactNetworking\n*L\n35#1:55\n19#1:56\n*E\n"])
public object ReactNetworking {
   @JvmStatic
   fun `patchReactNetworking$lambda$0`(var0: Builder) {
      var0.b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         @NotNull
         public final Response intercept(@NotNull Chain var1) {
            return this.$receiver$inlined.clientXHRInterceptor(var1);
         }
      });
   }

   @JvmStatic
   fun `patchReactNetworking$lambda$1`(var0: Builder) {
      var0.i(new OkHttpDNSSelector(OkHttpDNSSelector.IPvMode.IPV4_FIRST));
   }

   public fun createReactOkHttpNetworkFetcher(): NetworkFetcher<*> {
      val var3: OkHttpClient = OkHttpClientProvider.createClient().F().b(new Interceptor(DeviceResourceUsageRecorder.Companion) {
         final DeviceResourceUsageRecorder.Companion $receiver$inlined;

         {
            this.$receiver$inlined = var1;
         }

         @NotNull
         public final Response intercept(@NotNull Chain var1) {
            return this.$receiver$inlined.frescoInterceptor(var1);
         }
      }).c();

      try {
         val var1: Int = ReactOkHttpNetworkFetcher.a;
         val var2: Constructor = ReactOkHttpNetworkFetcher.class.getDeclaredConstructor(OkHttpClient.class);
         var2.setAccessible(true);
         val var5: Any = var2.newInstance(var3);
         if (var5 is NetworkFetcher) {
            return var5 as NetworkFetcher;
         } else {
            val var7: StringBuilder = new StringBuilder();
            var7.append("Field ");
            var7.append(ReactOkHttpNetworkFetcher::class.java);
            var7.append(" not instance of ");
            var7.append(NetworkFetcher::class.java);
            var7.append(".");
            throw new IllegalStateException(var7.toString().toString());
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
