package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import java.util.List;
import l4.j;

// $VF: synthetic class
public final class e implements j {
   public final BillingManager j;

   @Override
   public final void onPurchasesUpdated(BillingResult var1, List var2) {
      BillingManager.d(this.j, var1, var2);
   }
}
