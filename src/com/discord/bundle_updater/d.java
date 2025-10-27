package com.discord.bundle_updater;

import android.net.Uri;
import java.io.File;

// $VF: synthetic class
public final class d implements Runnable {
   public final AssetStatus d;
   public final BundleUpdater e;
   public final String i;
   public final String s;
   public final File t;
   public final Uri u;
   public final AppManifest v;
   public final String w;
   public final BundleUpdater.Patch x;
   public final File y;

   @Override
   public final void run() {
      BundleUpdater.c(this.d, this.e, this.i, this.s, this.t, this.u, this.v, this.w, this.x, this.y);
   }
}
