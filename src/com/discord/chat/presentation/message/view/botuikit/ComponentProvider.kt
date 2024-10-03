package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.q

public class ComponentProvider(context: Context) {
   public final val context: Context
   public final val inflater: ComponentInflater

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.inflater = new ComponentInflater(var1);
   }

   public fun recycleComponentView(componentView: ComponentView<out Component>) {
      q.h(var1, "componentView");
      var1.onRecycle(this);
      this.inflater.recycleComponent(var1);
   }
}
