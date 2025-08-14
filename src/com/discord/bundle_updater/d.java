package com.discord.bundle_updater;

import android.net.Uri;
import java.io.File;

// $VF: synthetic class
public final class d implements Runnable {
   public final AssetStatus d;
   public final BundleUpdater e;
   public final String i;
   public final String m;
   public final File n;
   public final Uri o;
   public final AppManifest p;
   public final String q;
   public final BundleUpdater.Patch r;
   public final File s;

   @Override
   public final void run() {
      BundleUpdater.c(this.d, this.e, this.i, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
   }
}
