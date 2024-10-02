package com.discord.billing;

import c3.i;
import com.android.billingclient.api.BillingResult;
import java.util.List;

// $VF: synthetic class
public final class e implements i {
   public final BillingManager j;

   @Override
   public final void onPurchasesUpdated(BillingResult var1, List var2) {
      BillingManager.c(this.j, var1, var2);
   }
}
