package com.discord.media.utils;

import android.net.Uri;
import id.zelory.compressor.constraint.Compression;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final int d;
   public final boolean e;
   public final MediaResolver i;
   public final Uri t;

   public final Object invoke(Object var1) {
      return MediaResolver.a(this.d, this.e, this.i, this.t, (Compression)var1);
   }
}
