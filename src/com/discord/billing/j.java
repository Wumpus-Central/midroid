package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class j implements Function1 {
   public final Promise j;

   public final Object invoke(Object var1) {
      return BillingManagerModule.k(this.j, (BillingManagerException)var1);
   }
}
