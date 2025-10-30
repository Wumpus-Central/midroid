package com.discord.permissions;

import com.facebook.react.bridge.Callback;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class t implements Callback {
   public final Function0 a;
   public final Function0 b;

   @Override
   public final void invoke(Object[] var1) {
      NativePermissionPromise.a(this.a, this.b, var1);
   }
}
