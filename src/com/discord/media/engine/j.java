package com.discord.media.engine;

import com.discord.native.engine.NativeConnection.MLSKeyPackageCallback;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class j implements MLSKeyPackageCallback {
   public final Function1 a;

   public final void onMLSKeyPackage(String var1) {
      MediaEngine.p(this.a, var1);
   }
}
