package com.discord.permissions;

import com.facebook.react.bridge.Callback;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class b implements Callback {
   public final Function0 a;

   public final void invoke(Object[] var1) {
      NativePermissionPromise.a(this.a, var1);
   }
}
