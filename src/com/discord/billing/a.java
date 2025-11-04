package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import java.util.List;

// $VF: synthetic class
public final class a implements c2.k {
   public final BillingManager d;

   @Override
   public final void onPurchasesUpdated(BillingResult var1, List var2) {
      BillingManager.a(this.d, var1, var2);
   }
}
