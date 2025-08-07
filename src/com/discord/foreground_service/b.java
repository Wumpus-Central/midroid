package com.discord.foreground_service;

import com.discord.foreground_service.service.ServiceNotificationConfiguration;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class b implements Function0 {
   public final ServiceNotificationConfiguration.Type j;
   public final ReactApplicationContext k;

   public final Object invoke() {
      return ForegroundServiceManager.a(this.j, this.k);
   }
}
