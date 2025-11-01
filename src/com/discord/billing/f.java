package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import java.util.List;

// $VF: synthetic class
public final class f implements g7.j {
   public final BillingManager a;

   @Override
   public final void a(BillingResult var1, List var2) {
      BillingManager.access$handlePurchases(this.a, var1, var2);
   }
}
