package com.discord.permissions;

import com.facebook.react.bridge.Callback;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class u implements Callback {
   public final Function0 a;

   @Override
   public final void invoke(Object[] var1) {
      NativePermissionPromise.b(this.a, var1);
   }
}
