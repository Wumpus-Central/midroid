package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.types.VideoSink;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.BooleanRef;

// $VF: synthetic class
public final class a implements Function1 {
   public final BooleanRef d;
   public final VideoSink e;
   public final MediaEngine i;
   public final String t;

   public final Object invoke(Object var1) {
      return AttachedVideoSinks.c(this.d, this.e, this.i, this.t, (String)var1);
   }
}
