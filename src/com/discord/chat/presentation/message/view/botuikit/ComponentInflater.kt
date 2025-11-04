package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.ButtonComponent
import com.discord.chat.bridge.botuikit.CheckpointCardComponent
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
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ContainerComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ContentInventoryComponentView
import com.discord.chat.presentation.message.view.botuikit.components.FileDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SectionComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView
import com.discord.chat.presentation.message.view.botuikit.components.SeparatorDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.ThumbnailDisplayComponentView
import com.discord.chat.presentation.message.view.botuikit.components.UnknownComponentView
import com.discord.chat.presentation.message.view.botuikit.components.media_gallery.MediaGalleryDisplayComponentView
import java.util.ArrayList
import java.util.LinkedHashMap
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nComponentInflater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComponentInflater.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentInflater\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,97:1\n381#2,7:98\n381#2,7:105\n381#2,7:112\n*S KotlinDebug\n*F\n+ 1 ComponentInflater.kt\ncom/discord/chat/presentation/message/view/botuikit/ComponentInflater\n*L\n48#1:98,7\n57#1:105,7\n73#1:112,7\n*E\n"])
public class ComponentInflater(context: Context, preInflateRecycledViews: Boolean) {
   public final val context: Context
   private final val viewCache: MutableMap<String, MutableList<ComponentView<out Component>>>

   init {
      this.context = var1;
      this.viewCache = new LinkedHashMap<>();
      if (var2) {
         val var5: Byte = 0;
         var var4: Int = 0;

         while (true) {
            var var3: Int = var5;
            if (var4 >= 20) {
               while (var3 < 10) {
                  val var13: java.util.Map = this.viewCache;
                  val var12: java.lang.String = ActionRowComponent.class.getSimpleName();
                  val var11: Any = var13.get(var12);
                  var var10: Any = var11;
                  if (var11 == null) {
                     var10 = new ArrayList();
                     var13.put(var12, var10);
                  }

                  (var10 as java.util.List).add(ActionRowComponentView.Companion.inflateComponent(this.context));
                  var3++;
               }
               break;
            }

            val var8: java.util.Map = this.viewCache;
            val var7: java.lang.String = ButtonComponent.class.getSimpleName();
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
      val var3: Any;
      if (var1 is ActionRowComponent) {
         var3 = ActionRowComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ButtonComponent) {
         var3 = ButtonComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SelectComponent) {
         var3 = SelectComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SectionComponent) {
         var3 = SectionComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is TextDisplayComponent) {
         var3 = TextDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ThumbnailDisplayComponent) {
         var3 = ThumbnailDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is MediaGalleryDisplayComponent) {
         var3 = MediaGalleryDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is FileDisplayComponent) {
         var3 = FileDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is SeparatorDisplayComponent) {
         var3 = SeparatorDisplayComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is ContentInventoryEntryComponent) {
         var3 = ContentInventoryComponentView.Companion.inflateComponent(this.context, var2);
      } else if (var1 is ContainerComponent) {
         var3 = ContainerComponentView.Companion.inflateComponent(this.context);
      } else if (var1 is CheckpointCardComponent) {
         var3 = CheckpointCardComponentView.Companion.inflateComponent(this.context, var2);
      } else {
         var3 = UnknownComponentView.Companion.inflateComponent(this.context);
      }

      return (ComponentView<T>)(var3 ?: null);
   }

   public fun <T : Component> getComponent(component: T, root: ViewGroup): ComponentView<T>? {
      val var5: java.util.List = this.viewCache.get(var1.getClass().getSimpleName());
      var var4: ComponentView = null;
      val var6: ComponentView;
      if (var5 != null) {
         var6 = CollectionsKt.K(var5) as ComponentView;
      } else {
         var6 = null;
      }

      if (var6 != null) {
         var4 = var6;
      }

      return (ComponentView<T>)(if (var4 == null) this.inflateComponent(var1, var2) else var4);
   }

   public fun <T : Component> recycleComponent(componentView: ComponentView<T>) {
      val var5: java.lang.String = var1.getComponentType().getSimpleName();
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
