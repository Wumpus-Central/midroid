package com.discord.notifications.renderer;

import android.content.Context;
import androidx.core.app.NotificationChannelCompat;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class h implements Function2 {
   public final NotificationChannels.Category j;
   public final Context k;

   public final Object invoke(Object var1, Object var2) {
      return NotificationChannels.a(this.j, this.k, (NotificationChannelCompat)var1, (NotificationChannelCompat.Builder)var2);
   }
}
