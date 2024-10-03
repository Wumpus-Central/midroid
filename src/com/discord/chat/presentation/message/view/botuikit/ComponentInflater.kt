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
import java.util.ArrayList
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

public class ComponentInflater(context: Context) {
   public final val context: Context
   private final val viewCache: MutableMap<String, MutableList<ComponentView<out Component>>>

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.viewCache = new LinkedHashMap<>();
      val var4: Byte = 0;
      var var2: Int = 0;

      while (true) {
         var var3: Int = var4;
         if (var2 >= 20) {
            while (var3 < 10) {
               val var11: java.util.Map = this.viewCache;
               val var12: java.lang.String = ActionRowComponent.class.getSimpleName();
               q.g(var12, "getSimpleName(...)");
               val var10: Any = var11.get(var12);
               var var9: Any = var10;
               if (var10 == null) {
                  var9 = new ArrayList();
                  var11.put(var12, var9);
               }

               (var9 as java.util.List).add(ActionRowComponentView.Companion.inflateComponent(this.context));
               var3++;
            }

            return;
         }

         val var7: java.util.Map = this.viewCache;
         val var6: java.lang.String = ButtonComponent.class.getSimpleName();
         q.g(var6, "getSimpleName(...)");
         val var5: Any = var7.get(var6);
         var var8: Any = var5;
         if (var5 == null) {
            var8 = new ArrayList();
            var7.put(var6, var8);
         }

         (var8 as java.util.List).add(ButtonComponentView.Companion.inflateComponent(this.context));
         var2++;
      }
   }

   private fun <T : Component> inflateComponent(component: T, root: ViewGroup): ComponentView<T>? {
      val var5: Any;
      if (var1 is ActionRowComponent) {
         var5 = ActionRowComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ButtonComponent) {
         var5 = ButtonComponentView.Companion.inflateComponent(this.context);
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

   public fun <T : Component> getComponent(component: T, root: ViewGroup): ComponentView<T>? {
      q.h(var1, "component");
      q.h(var2, "root");
      val var4: java.util.List = this.viewCache.get(var1.getClass().getSimpleName());
      var var5: ComponentView = null;
      val var6: ComponentView;
      if (var4 != null) {
         var6 = i.G(var4) as ComponentView;
      } else {
         var6 = null;
      }

      if (var6 is ComponentView) {
         var5 = var6;
      }

      var var7: ComponentView = var5;
      if (var5 == null) {
         var7 = this.inflateComponent(var1, var2);
      }

      return var7;
   }

   public fun <T : Component> recycleComponent(componentView: ComponentView<T>) {
      q.h(var1, "componentView");
      val var5: java.lang.String = var1.getComponentType().i();
      if (var5 != null) {
         val var4: java.util.Map = this.viewCache;
         val var3: Any = this.viewCache.get(var5);
         var var2: Any = var3;
         if (var3 == null) {
            var2 = new ArrayList();
            var4.put(var5, var2);
         }

         (var2 as java.util.List).add(var1);
      }
   }
}
