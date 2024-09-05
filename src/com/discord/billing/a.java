package com.discord.billing;

import android.app.Activity;
import com.android.billingclient.api.BillingResult;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.BooleanRef;

// $VF: synthetic class
public final class a implements l4.g {
   public final BillingManager a;
   public final Function1 b;
   public final String c;
   public final String d;
   public final String e;
   public final String f;
   public final String g;
   public final Activity h;
   public final Function0 i;
   public final BooleanRef j;

   @Override
   public final void a(BillingResult var1, List var2) {
      BillingManager.c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, var1, var2);
   }
}
