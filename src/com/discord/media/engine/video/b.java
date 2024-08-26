package com.discord.media.engine.video;

import java.util.function.Function;
import kotlin.jvm.functions.Function1;

public final class b implements Function {
   public final Function1 a;

   @Override
   public final Object apply(Object var1) {
      return AttachedVideoSinks.b(this.a, var1);
   }
}
