package com.discord.react_fork_overrides

import com.discord.react_fork_overrides.forks.CustomFontFamilyOverride
import com.discord.react_fork_overrides.forks.CustomLineHeightSpanOverride
import com.discord.react_fork_overrides.forks.ImageSourceOverride
import com.facebook.react.views.scroll.ReactScrollViewOverride

public object ReactForkOverrides {
   public fun init() {
      CustomLineHeightSpanOverride.INSTANCE.override();
      ImageSourceOverride.INSTANCE.override();
      ReactScrollViewOverride.INSTANCE.override();
      CustomFontFamilyOverride.INSTANCE.override();
   }
}
