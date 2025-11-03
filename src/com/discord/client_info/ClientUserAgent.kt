package com.discord.client_info

import android.content.Context
import com.facebook.react.modules.network.OkHttpClientProvider
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain

internal object ClientUserAgent {
   private fun createDispatcher(): Dispatcher {
      val var1: Dispatcher = new Dispatcher();
      var1.o(var1.j() * 2);
      var1.p(var1.j());
      return var1;
   }

   @JvmStatic
   fun `init$lambda$0`(var0: Context, var1: java.lang.String): OkHttpClient {
      return OkHttpClientProvider.createClientBuilder(var0).h(INSTANCE.createDispatcher()).a(new ClientUserAgent.DiscordUserAgentInterceptor(var1)).c();
   }

   public fun init(context: Context, userAgent: String) {
      OkHttpClientProvider.setOkHttpClientFactory(new b(var1, var2));
   }

   private class DiscordUserAgentInterceptor(userAgent: String) : Interceptor {
      private final val userAgent: String

      init {
         this.userAgent = var1;
      }

      public open fun intercept(chain: Chain): Response {
         return var1.a(var1.b().i().i("User-Agent").a("User-Agent", this.userAgent).b());
      }
   }
}
