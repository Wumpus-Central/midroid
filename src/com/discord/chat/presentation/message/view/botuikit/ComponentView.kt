package com.discord.chat.presentation.message.view.botuikit

import com.discord.chat.bridge.botuikit.Component
import kotlin.reflect.KClass

public interface ComponentView<T extends Component> {
   public abstract fun configure(
      component: Any,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
   }

   public abstract fun getComponentType(): KClass<Any> {
   }
}
