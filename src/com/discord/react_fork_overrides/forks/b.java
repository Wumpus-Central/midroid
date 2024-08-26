package com.discord.react_fork_overrides.forks;

import androidx.arch.core.util.Function;
import com.facebook.react.views.text.CreateTypefaceObject;

public final class b implements Function {
   public final Object apply(Object var1) {
      return CustomFontFamilyOverride.a((CreateTypefaceObject)var1);
   }
}
