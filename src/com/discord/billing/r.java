package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class r implements Function1 {
   public final Promise j;

   public final Object invoke(Object var1) {
      return BillingManagerModule.l(this.j, (BillingManagerException)var1);
   }
}
