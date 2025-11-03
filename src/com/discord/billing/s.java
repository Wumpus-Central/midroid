package com.discord.billing;

import com.facebook.react.bridge.Promise;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s implements Function1 {
   public final Promise d;

   @Override
   public final Object invoke(Object var1) {
      return BillingManagerModule.l(this.d, (BillingManagerException)var1);
   }
}
