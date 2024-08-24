package com.discord.client_info;

import android.content.Context;
import com.facebook.react.modules.network.OkHttpClientFactory;
import okhttp3.OkHttpClient;

// $VF: synthetic class
public final class a implements OkHttpClientFactory {
   public final Context a;
   public final String b;

   public final OkHttpClient createNewNetworkModuleClient() {
      return ClientUserAgent.a(this.a, this.b);
   }
}
