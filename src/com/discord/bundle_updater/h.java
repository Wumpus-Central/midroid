package com.discord.bundle_updater;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class h implements Runnable {
   public final Activity d;
   public final Function1 e;

   @Override
   public final void run() {
      BundleUpdaterManager.b(this.d, this.e);
   }
}
