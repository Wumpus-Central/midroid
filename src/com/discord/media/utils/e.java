package com.discord.media.utils;

import android.net.Uri;
import id.zelory.compressor.constraint.Compression;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class e implements Function1 {
   public final int j;
   public final boolean k;
   public final MediaResolver l;
   public final Uri m;

   public final Object invoke(Object var1) {
      return MediaResolver.a(this.j, this.k, this.l, this.m, (Compression)var1);
   }
}
