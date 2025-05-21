package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class d implements Function1 {
   public final NativePermissionManagerModule j;
   public final Promise k;

   public final Object invoke(Object var1) {
      return NativePermissionManagerModule.a(this.j, this.k, (Promise)var1);
   }
}
