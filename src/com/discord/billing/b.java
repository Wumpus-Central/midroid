package com.discord.billing;

import com.android.billingclient.api.BillingResult;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

public final class b implements t2.f {
   public final BillingManager a;
   public final Function1 b;
   public final Function0 c;

   public final void a(BillingResult var1, String var2) {
      BillingManager.e(this.a, this.b, this.c, var1, var2);
   }
}
