package com.discord.billing;

import c3.j;
import com.android.billingclient.api.BillingResult;
import java.util.List;

// $VF: synthetic class
public final class e implements j {
   public final BillingManager j;

   @Override
   public final void onPurchasesUpdated(BillingResult var1, List var2) {
      BillingManager.d(this.j, var1, var2);
   }
}
