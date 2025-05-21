package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class c implements Function1 {
   public final NativePermissionManagerModule j;
   public final Promise k;

   public final Object invoke(Object var1) {
      return NativePermissionManagerModule.b(this.j, this.k, (Promise)var1);
   }
}
