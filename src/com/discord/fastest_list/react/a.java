package com.discord.fastest_list.react;

import com.discord.fastest_list.android.FastestListSections;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref.IntRef;

// $VF: synthetic class
public final class a implements Function1 {
   public final List j;
   public final List k;
   public final IntRef l;

   public final Object invoke(Object var1) {
      return FastestListDeserializerSectionsKt.a(this.j, this.k, this.l, (FastestListSections.Entry)var1);
   }
}
