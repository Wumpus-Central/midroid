package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class d implements Function2 {
   public final NativePermissionManagerModule d;

   public final Object invoke(Object var1, Object var2) {
      return NativePermissionManagerModule.g(this.d, (String)var1, (Promise)var2);
   }
}
