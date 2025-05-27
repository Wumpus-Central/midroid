package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final Context j;
   public final ContentResolverMedia.QueryType k;
   public final int l;
   public final Integer m;

   public final Object invoke(Object var1) {
      return ContentResolverMedia.Companion.a(this.j, this.k, this.l, this.m, (Uri)var1);
   }
}
