package com.discord.notifications.renderer.utils;

import com.discord.notifications.api.NotificationData;
import com.discord.react_strings.RenderContext;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s implements Function1 {
   public final NotificationData d;

   public final Object invoke(Object var1) {
      return NotificationDataUtilsKt.p(this.d, (RenderContext)var1);
   }
}
