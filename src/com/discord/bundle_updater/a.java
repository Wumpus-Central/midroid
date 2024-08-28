package com.discord.bundle_updater;

import android.net.Uri;
import java.io.File;

// $VF: synthetic class
public final class a implements Runnable {
   public final AssetStatus j;
   public final BundleUpdater k;
   public final String l;
   public final String m;
   public final File n;
   public final Uri o;
   public final AppManifest p;
   public final String q;
   public final BundleUpdater.Patch r;
   public final File s;

   @Override
   public final void run() {
      BundleUpdater.b(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s);
   }
}
