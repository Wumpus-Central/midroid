package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ContentInventoryEntryComponent
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.SelectComponent
import com.discord.chat.bridge.botuikit.SeparatorDisplayComponent
import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SeparatorDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView
import kotlin.jvm.internal.r

public class ComponentInflater(context: Context) {
   public final val context: Context

   init {
      r.h(var1, "context");
      super();
      this.context = var1;
   }

   public fun <T : Component> inflateComponent(component: T, root: ViewGroup): ComponentView<T>? {
      r.h(var1, "component");
      r.h(var2, "root");
      val var5: Any;
      if (var1 is ActionRowComponent) {
         var5 = ActionRowComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is ButtonComponent) {
         var5 = ButtonComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is SelectComponent) {
         var5 = SelectComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is TextDisplayComponent) {
         var5 = TextDisplayComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is MediaGalleryDisplayComponent) {
         var5 = MediaGalleryDisplayComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is SeparatorDisplayComponent) {
         var5 = SeparatorDisplayComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is ContentInventoryEntryComponent) {
         var5 = ContentInventoryComponentView.Companion.inflateComponent(this.context, var2);
      } else {
         var5 = null;
      }

      var var6: Any = null;
      if (var5 is ComponentView) {
         var6 = var5;
      }

      return (ComponentView<T>)var6;
   }
}
