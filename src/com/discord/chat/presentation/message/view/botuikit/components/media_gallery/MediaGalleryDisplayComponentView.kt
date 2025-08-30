package com.discord.chat.presentation.message.view.botuikit.components.media_gallery

import A1.k
import A1.l
import A1.m
import A1.n
import A1.o
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.R
import com.discord.chat.bridge.botuikit.MediaGalleryDisplayComponent
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.databinding.MessageComponentMediaGalleryDisplayViewBinding
import com.discord.chat.presentation.list.AccessoriesViewPool
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.MediaItemEventHandlers
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicLayoutManager
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function4
import kotlin.reflect.KClass

public class MediaGalleryDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(
         var1, var2, var3
      ),
   ComponentView<MediaGalleryDisplayComponent> {
   public final val binding: MessageComponentMediaGalleryDisplayViewBinding
   public final val mosaicLayoutManager: MosaicLayoutManager
   private final val mediaGalleryAdapter: MediaGalleryDisplayComponentAdapter
   private final var eventHandler: MediaItemEventHandlers?

   fun MediaGalleryDisplayComponentView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun MediaGalleryDisplayComponentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var5: MessageComponentMediaGalleryDisplayViewBinding = MessageComponentMediaGalleryDisplayViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      val var4: MosaicLayoutManager = new MosaicLayoutManager(var1);
      this.mosaicLayoutManager = var4;
      val var6: MediaGalleryDisplayComponentAdapter = new MediaGalleryDisplayComponentAdapter(
         var1, new k(this), new l(this), new m(this), new n(this), new o(this)
      );
      this.mediaGalleryAdapter = var6;
      val var7: RecyclerView = var5.mosaic;
      ViewClippingUtilsKt.clipToRoundedRectangle(var7, var1.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
      var7.setLayoutManager(var4);
      var7.setAdapter(var6);
      var7.setRecycledViewPool(new AccessoriesViewPool());
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: MediaGalleryDisplayComponentView, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem, var3: MessagePartViewHolder): Unit {
      if (var0.eventHandler != null) {
         val var5: Function4 = var0.eventHandler.getOnMediaItemClicked();
         if (var5 != null) {
            val var6: View = var3.itemView;
            var5.invoke(var6, var1.getId(), var1.getItems().indexOf(var2), var2.getPortalId());
         }
      }

      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: MediaGalleryDisplayComponentView, var1: MediaGalleryDisplayComponent, var2: MediaGalleryItem): Unit {
      if (var0.eventHandler != null) {
         val var4: Function2 = var0.eventHandler.getOnMediaItemLongClicked();
         if (var4 != null) {
            var4.invoke(var1.getId(), var1.getItems().indexOf(var2));
         }
      }

      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: MediaGalleryDisplayComponentView, var1: MediaGalleryItem): Unit {
      if (var0.eventHandler != null) {
         val var3: Function0 = var0.eventHandler.getOnMediaItemSpoilerClicked();
         if (var3 != null) {
            var3.invoke();
         }
      }

      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$3`(var0: MediaGalleryDisplayComponentView, var1: Boolean): Unit {
      if (var0.eventHandler != null) {
         val var3: Function1 = var0.eventHandler.getOnMediaItemObscureToggle();
         if (var3 != null) {
            var3.invoke(var1);
         }
      }

      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$4`(var0: MediaGalleryDisplayComponentView, var1: java.lang.String): Unit {
      if (var0.eventHandler != null) {
         val var3: Function1 = var0.eventHandler.getOnMediaItemAltTextButtonClicked();
         if (var3 != null) {
            var3.invoke(var1);
         }
      }

      return Unit.a;
   }

   public open fun configure(component: MediaGalleryDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      this.eventHandler = var3.getMediaItemEventHandlers();
      val var4: RecyclerView.LayoutManager = this.binding.mosaic.getLayoutManager();
      (var4 as MosaicLayoutManager).setAvailableWidth(var3.getWidthInfo().getAvailableWidth());
      this.mediaGalleryAdapter.setMediaItems(var3.getContainerId(), var1, var3);
   }

   public override fun getComponentType(): KClass<MediaGalleryDisplayComponent> {
      return MediaGalleryDisplayComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): MediaGalleryDisplayComponentView {
         return new MediaGalleryDisplayComponentView(var1, null, 0, 6, null);
      }
   }
}
