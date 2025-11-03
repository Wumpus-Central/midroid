package com.discord.bundle_updater;

import android.net.Uri;
import java.io.File;

// $VF: synthetic class
public final class d implements Runnable {
   public final AssetStatus d;
   public final BundleUpdater e;
   public final String i;
   public final String t;
   public final File u;
   public final Uri v;
   public final AppManifest w;
   public final String x;
   public final BundleUpdater.Patch y;
   public final File z;

   @Override
   public final void run() {
      BundleUpdater.c(this.d, this.e, this.i, this.t, this.u, this.v, this.w, this.x, this.y, this.z);
   }
}
