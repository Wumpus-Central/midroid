package com.discord.media.engine.video;

import com.discord.media.engine.MediaEngine;
import com.discord.media.engine.types.VideoSink;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class c implements Function2 {
   public final VideoSink j;
   public final MediaEngine k;
   public final String l;

   public final Object invoke(Object var1, Object var2) {
      return AttachedVideoSinks.b(this.j, this.k, this.l, (String)var1, (AttachedVideoSinks.VideoOutputSinks)var2);
   }
}
