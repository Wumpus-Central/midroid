package com.discord.billing;

import Y0.i;
import com.android.billingclient.api.BillingResult;
import java.util.List;

// $VF: synthetic class
public final class b implements i {
   public final BillingManager j;

   @Override
   public final void onPurchasesUpdated(BillingResult var1, List var2) {
      BillingManager.b(this.j, var1, var2);
   }
}
