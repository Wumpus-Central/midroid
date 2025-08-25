package com.discord.permissions;

import com.facebook.react.bridge.Promise;
import java.util.List;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class a implements Function2 {
   public final NativePermissionManagerModule d;
   public final List e;

   public final Object invoke(Object var1, Object var2) {
      return NativePermissionManagerModule.d(this.d, this.e, (String)var1, (Promise)var2);
   }
}
