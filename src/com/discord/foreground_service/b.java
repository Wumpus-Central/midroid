package com.discord.foreground_service;

import android.content.Context;
import com.facebook.react.bridge.Callback;
import java.util.List;

// $VF: synthetic class
public final class b implements Callback {
   public final ForegroundServiceManager a;
   public final Context b;
   public final List c;

   public final void invoke(Object[] var1) {
      ForegroundServiceManager.b(this.a, this.b, this.c, var1);
   }
}
