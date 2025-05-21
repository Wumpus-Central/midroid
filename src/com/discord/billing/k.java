package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class k implements Function1 {
   public final Promise j;

   public final Object invoke(Object var1) {
      return BillingManagerModule.g(this.j, (BillingManagerException)var1);
   }
}
