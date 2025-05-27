package com.discord.emoji_picker.react;

import android.view.View;
import com.facebook.react.uimanager.ThemedReactContext;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class i implements Function2 {
   public final EmojiPickerViewManager j;
   public final ThemedReactContext k;

   public final Object invoke(Object var1, Object var2) {
      return EmojiPickerViewManager.g(this.j, this.k, (View)var1, (Boolean)var2);
   }
}
