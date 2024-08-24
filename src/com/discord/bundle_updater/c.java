package com.discord.bundle_updater;

import android.app.Activity;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class c implements Runnable {
   public final Activity j;
   public final Function1 k;

   @Override
   public final void run() {
      BundleUpdaterManager.a(this.j, this.k);
   }
}
