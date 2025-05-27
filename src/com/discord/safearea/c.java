package com.discord.safearea;

import com.facebook.react.uimanager.ThemedReactContext;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.Rect;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class c implements Function3 {
   public final SafeAreaProviderManager j;
   public final ThemedReactContext k;
   public final SafeAreaProvider l;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return SafeAreaProviderManager.a(this.j, this.k, this.l, (SafeAreaProvider)var1, (EdgeInsets)var2, (Rect)var3);
   }
}
