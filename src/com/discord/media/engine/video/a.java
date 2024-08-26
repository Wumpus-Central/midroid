package com.discord.media.engine.video;

import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;

public final class a implements BiFunction {
   public final Function2 a;

   @Override
   public final Object apply(Object var1, Object var2) {
      return AttachedVideoSinks.a(this.a, var1, var2);
   }
}
