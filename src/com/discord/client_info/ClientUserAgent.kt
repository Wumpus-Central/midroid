package com.discord.client_info

import android.content.Context
import com.facebook.react.modules.network.OkHttpClientProvider
import kotlin.jvm.internal.q
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.Interceptor.Chain

internal object ClientUserAgent {
   private fun createDispatcher(): Dispatcher {
      val var1: Dispatcher = new Dispatcher();
      var1.n(var1.i() * 2);
      var1.o(var1.i());
      return var1;
   }

   @JvmStatic
   fun `init$lambda$0`(var0: Context, var1: java.lang.String): OkHttpClient {
      q.h(var0, "$context");
      q.h(var1, "$userAgent");
      return OkHttpClientProvider.createClientBuilder(var0).h(INSTANCE.createDispatcher()).a(new ClientUserAgent.DiscordUserAgentInterceptor(var1)).c();
   }

   public fun init(context: Context, userAgent: String) {
      q.h(var1, "context");
      q.h(var2, "userAgent");
      OkHttpClientProvider.setOkHttpClientFactory(new a(var1, var2));
   }

   private class DiscordUserAgentInterceptor(userAgent: String) : Interceptor {
      private final val userAgent: String

      init {
         q.h(var1, "userAgent");
         super();
         this.userAgent = var1;
      }

      public open fun intercept(chain: Chain): Response {
         q.h(var1, "chain");
         return var1.a(var1.q().i().i("User-Agent").a("User-Agent", this.userAgent).b());
      }
   }
}
