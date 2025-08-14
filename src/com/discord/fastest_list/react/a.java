package com.discord.fastest_list.react;

import com.discord.fastest_list.android.FastestListSections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.IntRef;

// $VF: synthetic class
public final class a implements Function1 {
   public final List d;
   public final List e;
   public final IntRef i;

   public final Object invoke(Object var1) {
      return FastestListDeserializerSectionsKt.a(this.d, this.e, this.i, (FastestListSections.Entry)var1);
   }
}
