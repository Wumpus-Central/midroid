package com.discord.notifications.renderer;

import android.content.Context;
import androidx.core.app.NotificationChannelCompat;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class h implements Function2 {
   public final NotificationChannels.Category d;
   public final Context e;

   public final Object invoke(Object var1, Object var2) {
      return NotificationChannels.a(this.d, this.e, (NotificationChannelCompat)var1, (NotificationChannelCompat.Builder)var2);
   }
}
