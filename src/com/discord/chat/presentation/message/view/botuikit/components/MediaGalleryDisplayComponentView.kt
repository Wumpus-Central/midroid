package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.databinding.MessageComponentMediaGalleryDisplayViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.mosaic.MediaGalleryComponentMediaMosaicView
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

public class MediaGalleryDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<MediaGalleryDisplayComponent> {
   fun MediaGalleryDisplayComponentView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun MediaGalleryDisplayComponentView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
   }

   public open fun configure(
      component: MediaGalleryDisplayComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentActionListener");
      r.h(var4, "componentContext");
      val var11: MessageComponentMediaGalleryDisplayViewBinding = MessageComponentMediaGalleryDisplayViewBinding.bind(this);
      r.g(var11, "bind(this)");
      val var7: MediaGalleryComponentMediaMosaicView = var11.mosaic;
      val var12: java.lang.String = var4.getContainerId();
      val var6: java.lang.String = var1.getId();
      val var8: java.util.List = var1.getItems();
      val var5: Int = var4.getConstrainedWidth();
      val var13: Function2 = new Function2<View, MediaGalleryItem, Unit>(var1, var4) {
         final MediaGalleryDisplayComponent $component;
         final ComponentContext $componentContext;

         {
            super(2);
            this.$component = var1;
            this.$componentContext = var2;
         }

         public final void invoke(View var1, MediaGalleryItem var2) {
            r.h(var1, "view");
            r.h(var2, "item");
            this.$componentContext
               .getMediaItemEventHandlers()
               .getOnMediaItemClicked()
               .invoke(var1, this.$component.getId(), this.$component.getItems().indexOf(var2), var2.getPortalId());
         }
      };
      val var9: Function2 = var4.getMediaItemEventHandlers().getOnMediaItemLongClicked();
      val var10: Function1;
      if (var9 != null) {
         var10 = new Function1<MediaGalleryItem, Unit>(var1, var9) {
            final MediaGalleryDisplayComponent $component;
            final Function2<java.lang.String, Integer, Unit> $onLongClick;

            {
               super(1);
               this.$component = var1;
               this.$onLongClick = var2;
            }

            public final void invoke(MediaGalleryItem var1) {
               r.h(var1, "item");
               this.$onLongClick.invoke(this.$component.getId(), this.$component.getItems().indexOf(var1));
            }
         };
      } else {
         var10 = null;
      }

      var7.setGalleryItems(var12, var6, var8, var4, var5, var13, var10, new Function1<MediaGalleryItem, Unit>(var4) {
         final ComponentContext $componentContext;

         {
            super(1);
            this.$componentContext = var1;
         }

         public final void invoke(MediaGalleryItem var1) {
            r.h(var1, "<anonymous parameter 0>");
            this.$componentContext.getMediaItemEventHandlers().getOnMediaItemSpoilerClicked().invoke();
         }
      }, var4.getShouldAutoPlayGif());
   }

   public override fun getComponentType(): KClass<MediaGalleryDisplayComponent> {
      return h0.b(MediaGalleryDisplayComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): MediaGalleryDisplayComponentView {
         r.h(var1, "context");
         r.h(var2, "root");
         val var3: MediaGalleryDisplayComponentView = MessageComponentMediaGalleryDisplayViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         r.g(var3, "inflate(\n               …false,\n            ).root");
         return var3;
      }
   }
}
