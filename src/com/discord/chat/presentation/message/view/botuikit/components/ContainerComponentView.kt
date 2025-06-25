package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.FrameLayout.LayoutParams
import com.discord.chat.R
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.bridge.botuikit.ContainerComponent
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.MessageComponentContainerViewBinding
import com.discord.chat.presentation.message.view.SpoilerView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.theme.ThemeManagerKt
import java.util.ArrayList
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ContainerComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : FrameLayout,
   ComponentView<ContainerComponent> {
   public final val binding: MessageComponentContainerViewBinding
   private final var componentProvider: ComponentProvider?

   fun ContainerComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ContainerComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: MessageComponentContainerViewBinding = MessageComponentContainerViewBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      this.setLayoutParams(new LayoutParams(-1, -2));
      ViewClippingUtilsKt.clipToRoundedRectangle(this, var1.getResources().getDimensionPixelSize(R.dimen.message_media_non_mosaic_radius));
   }

   private fun configureSpoiler(component: ContainerComponent, componentContext: ComponentContext) {
      val var3: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var4: java.lang.String = var2.getContainerId();
      val var5: java.lang.String = var1.getId();
      val var6: StringBuilder = new StringBuilder();
      var6.append("ContainerComponent(");
      var6.append(var5);
      var6.append(")");
      val var9: SpoilerAttributes = var3.forGenericMedia(var1, var4, var6.toString(), "content", null);
      val var7: SpoilerConfig;
      if (var9 != null) {
         var7 = SpoilerAttributes.configure$default(var9, new d(var2, this), null, 2, null);
      } else {
         var7 = null;
      }

      this.binding.spoiler.configure(var7, this);
      if (var1.isSpoiler()) {
         val var8: SpoilerView = this.binding.spoiler;
         q.g(this.binding.spoiler, "spoiler");
         if (var8.getVisibility() == 0) {
            this.setContentDescription(var1.getSpoilerDescription());
            this.binding.childrenViews.setImportantForAccessibility(4);
            return;
         }
      }

      this.setContentDescription(null);
      this.binding.childrenViews.setImportantForAccessibility(0);
   }

   @JvmStatic
   fun `configureSpoiler$lambda$1`(var0: ComponentContext, var1: ContainerComponentView): Unit {
      var0.getGeneralEventHandlers().getOnTapSpoiler().invoke();
      var1.binding.childrenViews.setImportantForAccessibility(0);
      return Unit.a;
   }

   public open fun configure(component: ContainerComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      this.componentProvider = var2;
      val var5: Int = var1.getThemedBackgroundColor();
      val var4: Int;
      if (var5 != null) {
         var4 = var5;
      } else {
         var4 = ThemeManagerKt.getTheme().getEmbedBackground();
      }

      this.setBackgroundColor(var4);
      if (var1.getAccentColor() != null) {
         this.binding.accentBorder.setBackgroundColor(var1.getAccentColor());
         val var10: View = this.binding.accentBorder;
         q.g(this.binding.accentBorder, "accentBorder");
         var10.setVisibility(0);
      } else {
         val var11: View = this.binding.accentBorder;
         q.g(this.binding.accentBorder, "accentBorder");
         var11.setVisibility(8);
      }

      val var6: ComponentContext = ComponentContext.copy$default(var3, null, null, null, null, null, null, null, false, false, true, 511, null)
         .reduceAvailableWidth(this.binding.childrenViews.getPaddingLeft() + this.binding.childrenViews.getPaddingRight());
      val var7: java.util.List = var1.getComponents();
      val var12: ArrayList = new ArrayList(kotlin.collections.i.v(var7, 10));
      val var15: java.util.Iterator = var7.iterator();

      for (int var9 = 0; var15.hasNext(); var9++) {
         val var8: Any = var15.next();
         if (var9 < 0) {
            kotlin.collections.i.u();
         }

         var12.add(var2.getConfiguredComponentView(var8 as Component, var6, this, var9));
      }

      val var14: java.util.List = kotlin.collections.i.e0(var12);
      val var13: LinearLayout = this.binding.childrenViews;
      q.g(this.binding.childrenViews, "childrenViews");
      MessageComponentsViewKt.replaceViews$default(var13, var14, var2, SizeUtilsKt.getDpToPx(8), 0, 8, null);
      this.configureSpoiler(var1, var3);
   }

   public override fun getComponentType(): KClass<ContainerComponent> {
      return G.b(ContainerComponent.class);
   }

   public override fun onRecycle(componentProvider: ComponentProvider) {
      q.h(var1, "componentProvider");
      val var2: LinearLayout = this.binding.childrenViews;
      q.g(this.binding.childrenViews, "childrenViews");
      MessageComponentsViewKt.recycleChildComponents(var2, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ContainerComponentView {
         q.h(var1, "context");
         return new ContainerComponentView(var1, null, 0, 6, null);
      }
   }
}
