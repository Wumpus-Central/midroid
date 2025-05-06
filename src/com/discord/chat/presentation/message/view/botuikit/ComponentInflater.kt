package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ContainerComponent
import com.discord.chat.bridge.botuikit.ContentInventoryEntryComponent
import com.discord.chat.bridge.botuikit.FileDisplayComponent
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.SectionComponent
import com.discord.chat.bridge.botuikit.SelectComponent
import com.discord.chat.bridge.botuikit.SeparatorDisplayComponent
import com.discord.chat.bridge.botuikit.TextDisplayComponent
import com.discord.chat.bridge.botuikit.ThumbnailDisplayComponent
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ContainerComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView
import com.discord.chat.presentation.message.view.botuikit.components.FileDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SectionComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SeparatorDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ThumbnailDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView
import java.util.ArrayList
import java.util.LinkedHashMap
import kotlin.jvm.internal.q

public class ComponentInflater(context: Context, preInflateRecycledViews: Boolean) {
   public final val context: Context
   private final val viewCache: MutableMap<String, MutableList<ComponentView<out Component>>>

   init {
      q.h(var1, "context");
      super();
      this.context = var1;
      this.viewCache = new LinkedHashMap<>();
      if (var2) {
         val var5: Byte = 0;
         var var4: Int = 0;

         while (true) {
            var var3: Int = var5;
            if (var4 >= 20) {
               while (var3 < 10) {
                  val var12: java.util.Map = this.viewCache;
                  val var13: java.lang.String = ActionRowComponent.class.getSimpleName();
                  q.g(var13, "getSimpleName(...)");
                  val var11: Any = var12.get(var13);
                  var var10: Any = var11;
                  if (var11 == null) {
                     var10 = new ArrayList();
                     var12.put(var13, var10);
                  }

                  (var10 as java.util.List).add(ActionRowComponentView.Companion.inflateComponent(this.context));
                  var3++;
               }
               break;
            }

            val var8: java.util.Map = this.viewCache;
            val var7: java.lang.String = ButtonComponent.class.getSimpleName();
            q.g(var7, "getSimpleName(...)");
            val var6: Any = var8.get(var7);
            var var9: Any = var6;
            if (var6 == null) {
               var9 = new ArrayList();
               var8.put(var7, var9);
            }

            (var9 as java.util.List).add(ButtonComponentView.Companion.inflateComponent(this.context));
            var4++;
         }
      }
   }

   private fun <T : Component> inflateComponent(component: T, root: ViewGroup): ComponentView<T>? {
      val var5: Any;
      if (var1 is ActionRowComponent) {
         var5 = ActionRowComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ButtonComponent) {
         var5 = ButtonComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SelectComponent) {
         var5 = SelectComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SectionComponent) {
         var5 = SectionComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is TextDisplayComponent) {
         var5 = TextDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ThumbnailDisplayComponent) {
         var5 = ThumbnailDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is MediaGalleryDisplayComponent) {
         var5 = MediaGalleryDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is FileDisplayComponent) {
         var5 = FileDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SeparatorDisplayComponent) {
         var5 = SeparatorDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ContentInventoryEntryComponent) {
         var5 = ContentInventoryComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is ContainerComponent) {
         var5 = ContainerComponentView.Companion.inflateComponent(this.context);
      } else {
         var5 = null;
      }

      var var6: Any = null;
      if (var5 != null) {
         var6 = var5;
      }

      return (ComponentView<T>)var6;
   }

   public fun <T : Component> getComponent(component: T, root: ViewGroup): ComponentView<T>? {
      q.h(var1, "component");
      q.h(var2, "root");
      val var5: java.util.List = this.viewCache.get(var1.getClass().getSimpleName());
      var var4: ComponentView = null;
      val var6: ComponentView;
      if (var5 != null) {
         var6 = i.G(var5) as ComponentView;
      } else {
         var6 = null;
      }

      if (var6 != null) {
         var4 = var6;
      }

      var var7: ComponentView = var4;
      if (var4 == null) {
         var7 = this.inflateComponent(var1, var2);
      }

      return var7;
   }

   public fun <T : Component> recycleComponent(componentView: ComponentView<T>) {
      q.h(var1, "componentView");
      val var4: java.lang.String = var1.getComponentType().h();
      if (var4 != null) {
         val var5: java.util.Map = this.viewCache;
         val var3: Any = this.viewCache.get(var4);
         var var2: Any = var3;
         if (var3 == null) {
            var2 = new ArrayList();
            var5.put(var4, var2);
         }

         (var2 as java.util.List).add(var1);
      }
   }
}
