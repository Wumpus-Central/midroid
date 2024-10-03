package com.discord.chat.presentation.message.view.botuikit

import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.q
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

   public open fun onRecycle(componentProvider: ComponentProvider) {
   }

   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun <T extends Component> onRecycle(var0: ComponentView<T>, var1: ComponentProvider) {
         q.h(var1, "componentProvider");
      }
   }
}
