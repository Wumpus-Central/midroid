package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.graphics.drawable.GradientDrawable.Orientation
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.botuikit.ContentInventoryEntry
import com.discord.chat.bridge.botuikit.ContentInventoryEntryClickable
import com.discord.chat.bridge.botuikit.ContentInventoryEntryComponent
import com.discord.chat.bridge.botuikit.ContentInventoryEntryComponentKt
import com.discord.chat.bridge.botuikit.GradientColor
import com.discord.chat.bridge.botuikit.Subtitle
import com.discord.chat.databinding.MessageComponentContentInventoryViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass
import z9.m

public class ContentInventoryComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<ContentInventoryEntryComponent> {
   private final val draweeControllerBuilder: PipelineDraweeControllerBuilder

   private final val binding: MessageComponentContentInventoryViewBinding
      private final get() {
         return this.binding$delegate.getValue() as MessageComponentContentInventoryViewBinding;
      }


   fun ContentInventoryComponentView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ContentInventoryComponentView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      this.draweeControllerBuilder = H2.d.g();
      this.binding$delegate = z9.j.b(m.l, new e(this));
   }

   @JvmStatic
   fun `binding_delegate$lambda$4`(var0: ContentInventoryComponentView): MessageComponentContentInventoryViewBinding {
      val var3: MessageComponentContentInventoryViewBinding = MessageComponentContentInventoryViewBinding.bind(var0);
      var var2: TextView = var3.contentInventoryComponentUsername;
      r.e(var3.contentInventoryComponentUsername);
      val var1: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
      SetTextSizeSpKt.setTextSizeSp(var2, 14.0F);
      var2.setTextColor(ColorUtilsKt.getColorCompat(var2, R.color.primary_160));
      var2 = var3.contentInventoryComponentTitle;
      r.e(var3.contentInventoryComponentTitle);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
      SetTextSizeSpKt.setTextSizeSp(var2, 16.0F);
      var2.setTextColor(ColorUtilsKt.getColorCompat(var2, R.color.primary_160));
      val var4: TextView = var3.contentInventoryComponentSubtitle;
      r.e(var3.contentInventoryComponentSubtitle);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      var4.setTextColor(ColorUtilsKt.getColorCompat(var4, R.color.primary_200));
      return var3;
   }

   public open fun configure(component: ContentInventoryEntryComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentContext");
      val var4: ContentInventoryEntry = var1.getContentInventoryEntry();
      if (var4 == null) {
         this.getBinding().getRoot().setVisibility(8);
      } else {
         val var23: java.util.List = var4.getGradientColors();
         val var7: ArrayList = new ArrayList(kotlin.collections.i.v(var23, 10));
         val var24: java.util.Iterator = var23.iterator();

         while (var24.hasNext()) {
            var7.add(ContentInventoryEntryComponentKt.toColorInt(var24.next() as GradientColor));
         }

         val var25: IntArray = kotlin.collections.i.T0(var7);
         val var8: ContentInventoryComponentView = this.getBinding().getRoot();
         var8.setVisibility(0);
         r.e(var8);
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(var8, var25, Orientation.TL_BR, SizeUtilsKt.getDpToPx(16), null, 0, 24, null);
         ContentInventoryComponentViewKt.access$applyClickable(var8, var3, var4, var4.getClickable(), "container");
         val var9: TextView = this.getBinding().contentInventoryComponentUsername;
         var9.setText(var4.getUserActionDescription());
         r.e(var9);
         ContentInventoryComponentViewKt.access$applyClickable(var9, var3, var4, var4.getUserClickable(), "username");
         val var10: TextView = this.getBinding().contentInventoryComponentTitle;
         var10.setText(var4.getTitle());
         r.e(var10);
         ContentInventoryComponentViewKt.access$applyClickable(var10, var3, var4, var4.getTitleClickable(), "title");
         val var5: TextView = this.getBinding().contentInventoryComponentSubtitle;
         r.e(var5);
         val var11: Subtitle = var4.getSubtitle();
         val var12: java.lang.String;
         if (var11 != null) {
            var12 = var11.getText();
         } else {
            var12 = null;
         }

         ViewUtilsKt.setOptionalText(var5, var12);
         val var13: Subtitle = var4.getSubtitle();
         val var14: java.lang.String;
         if (var13 != null) {
            var14 = var13.getAriaDescription();
         } else {
            var14 = null;
         }

         var5.setContentDescription(var14);
         val var15: Subtitle = var4.getSubtitle();
         val var16: ContentInventoryEntryClickable;
         if (var15 != null) {
            var16 = var15.getClickable();
         } else {
            var16 = null;
         }

         ContentInventoryComponentViewKt.access$applyClickable(var5, var3, var4, var16, "subtitle");
         val var29: SimpleDraweeView = this.getBinding().contentInventoryComponentBadgeIcon;
         r.e(var29);
         val var17: Subtitle = var4.getSubtitle();
         val var18: java.lang.String;
         if (var17 != null) {
            var18 = var17.getBadgeUrl();
         } else {
            var18 = null;
         }

         ReactAssetUtilsKt.setOptionalReactImageUrl(var29, var18);
         val var6: Subtitle = var4.getSubtitle();
         var var19: ContentInventoryEntryClickable = null;
         if (var6 != null) {
            var19 = var6.getClickable();
         }

         ContentInventoryComponentViewKt.access$applyClickable(var29, var3, var4, var19, "subtitle");
         val var20: SimpleDraweeView = this.getBinding().contentInventoryComponentAvatarImage;
         var20.setImageURI(var4.getAvatarUrl());
         r.e(var20);
         ContentInventoryComponentViewKt.access$applyClickable(var20, var3, var4, var4.getUserClickable(), "avatar");
         val var21: SimpleDraweeView = this.getBinding().contentInventoryComponentMediaImage;
         val var27: PipelineDraweeControllerBuilder = this.draweeControllerBuilder;
         r.e(var21);
         val var28: com.facebook.drawee.controller.a = ((var27.E(ContentInventoryComponentViewKt.getContentControllerListener(var21)) as PipelineDraweeControllerBuilder)
               .Q(var4.getImageUrl())
               .H(var21.getController()) as PipelineDraweeControllerBuilder)
            .d();
         r.g(var28, "build(...)");
         var21.setController(var28);
         ContentInventoryComponentViewKt.access$applyClickable(var21, var3, var4, var4.getImageClickable(), "media");
         val var22: SimpleDraweeView = this.getBinding().contentInventoryComponentPlatformIcon;
         r.e(var22);
         ReactAssetUtilsKt.setOptionalReactImageUrl(var22, var4.getPlatformIconUrl());
         ContentInventoryComponentViewKt.access$applyClickable(var22, var3, var4, var4.getPlatformClickable(), "platform");
      }
   }

   public override fun getComponentType(): KClass<ContentInventoryEntryComponent> {
      return H.b(ContentInventoryEntryComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ContentInventoryComponentView {
         r.h(var1, "context");
         r.h(var2, "root");
         val var3: ContentInventoryComponentView = MessageComponentContentInventoryViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         r.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
