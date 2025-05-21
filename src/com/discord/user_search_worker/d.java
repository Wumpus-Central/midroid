package com.discord.user_search_worker;

import com.facebook.react.bridge.ReactApplicationContext;
import java.util.List;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class d implements Function3 {
   public final UserSearchWorkerManagerModule j;
   public final ReactApplicationContext k;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return UserSearchWorkerManagerModule.a(this.j, this.k, (List)var1, (String)var2, (String)var3);
   }
}
