package com.discord.media.engine;

import com.facebook.react.bridge.Callback;
import java.util.Map;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class B implements Function2 {
   public final Callback j;

   public final Object invoke(Object var1, Object var2) {
      return MediaEngineModule.a(this.j, (String)var1, (Map)var2);
   }
}
