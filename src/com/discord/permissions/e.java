package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class e implements Function1 {
   public final NativePermissionManagerModule d;
   public final Promise e;

   public final Object invoke(Object var1) {
      return NativePermissionManagerModule.c(this.d, this.e, (Promise)var1);
   }
}
