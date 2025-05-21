package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.types.VideoSink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.BooleanRef;

// $VF: synthetic class
public final class a implements Function1 {
   public final BooleanRef j;
   public final VideoSink k;
   public final MediaEngine l;
   public final String m;

   public final Object invoke(Object var1) {
      return AttachedVideoSinks.c(this.j, this.k, this.l, this.m, (String)var1);
   }
}
