package com.discord.media.utils;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class a implements Function1 {
   public final Context d;
   public final ContentResolverMedia.QueryType e;
   public final int i;
   public final Integer m;

   public final Object invoke(Object var1) {
      return ContentResolverMedia.Companion.a(this.d, this.e, this.i, this.m, (Uri)var1);
   }
}
