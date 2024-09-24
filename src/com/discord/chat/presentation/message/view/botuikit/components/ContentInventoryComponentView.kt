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
import com.discord.chat.presentation.message.view.botuikit.ComponentActionListener
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
import kh.l
import kh.o
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class ContentInventoryComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : ConstraintLayout,
   ComponentView<ContentInventoryEntryComponent> {
   private final val binding: MessageComponentContentInventoryViewBinding
      private final get() {
         return this.binding$delegate.getValue() as MessageComponentContentInventoryViewBinding;
      }


   private final val draweeControllerBuilder: PipelineDraweeControllerBuilder

   fun ContentInventoryComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ContentInventoryComponentView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      this.draweeControllerBuilder = x4.c.g();
      this.binding$delegate = l.a(o.l, new Function0(this) {
         final ContentInventoryComponentView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageComponentContentInventoryViewBinding invoke() {
            val var1: MessageComponentContentInventoryViewBinding = MessageComponentContentInventoryViewBinding.bind(this.this$0);
            var var3: TextView = var1.contentInventoryComponentUsername;
            q.e(var1.contentInventoryComponentUsername);
            val var2: DiscordFont = DiscordFont.PrimarySemibold;
            DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
            SetTextSizeSpKt.setTextSizeSp(var3, 14.0F);
            var3.setTextColor(ColorUtilsKt.getColorCompat(var3, R.color.primary_160));
            var3 = var1.contentInventoryComponentTitle;
            q.e(var1.contentInventoryComponentTitle);
            DiscordFontUtilsKt.setDiscordFont(var3, var2);
            SetTextSizeSpKt.setTextSizeSp(var3, 16.0F);
            var3.setTextColor(ColorUtilsKt.getColorCompat(var3, R.color.primary_160));
            val var4: TextView = var1.contentInventoryComponentSubtitle;
            q.e(var1.contentInventoryComponentSubtitle);
            DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
            SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
            var4.setTextColor(ColorUtilsKt.getColorCompat(var4, R.color.primary_200));
            return var1;
         }
      });
   }

   public open fun configure(
      component: ContentInventoryEntryComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentActionListener");
      q.h(var4, "componentContext");
      val var29: ContentInventoryEntry = var1.getContentInventoryEntry();
      if (var29 == null) {
         this.getBinding().getRoot().setVisibility(8);
      } else {
         val var23: java.util.List = var29.getGradientColors();
         val var7: ArrayList = new ArrayList(i.v(var23, 10));
         val var24: java.util.Iterator = var23.iterator();

         while (var24.hasNext()) {
            var7.add(ContentInventoryEntryComponentKt.toColorInt(var24.next() as GradientColor));
         }

         val var8: IntArray = i.Q0(var7);
         val var25: ContentInventoryComponentView = this.getBinding().getRoot();
         var25.setVisibility(0);
         q.e(var25);
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(var25, var8, Orientation.TL_BR, SizeUtilsKt.getDpToPx(16), null, 0, 24, null);
         ContentInventoryComponentViewKt.access$applyClickable(var25, var4, var29, var29.getClickable(), "container");
         val var9: TextView = this.getBinding().contentInventoryComponentUsername;
         var9.setText(var29.getUserActionDescription());
         q.e(var9);
         ContentInventoryComponentViewKt.access$applyClickable(var9, var4, var29, var29.getUserClickable(), "username");
         val var10: TextView = this.getBinding().contentInventoryComponentTitle;
         var10.setText(var29.getTitle());
         q.e(var10);
         ContentInventoryComponentViewKt.access$applyClickable(var10, var4, var29, var29.getTitleClickable(), "title");
         val var5: TextView = this.getBinding().contentInventoryComponentSubtitle;
         q.e(var5);
         val var11: Subtitle = var29.getSubtitle();
         val var12: java.lang.String;
         if (var11 != null) {
            var12 = var11.getText();
         } else {
            var12 = null;
         }

         ViewUtilsKt.setOptionalText(var5, var12);
         val var13: Subtitle = var29.getSubtitle();
         val var14: java.lang.String;
         if (var13 != null) {
            var14 = var13.getAriaDescription();
         } else {
            var14 = null;
         }

         var5.setContentDescription(var14);
         val var15: Subtitle = var29.getSubtitle();
         val var16: ContentInventoryEntryClickable;
         if (var15 != null) {
            var16 = var15.getClickable();
         } else {
            var16 = null;
         }

         ContentInventoryComponentViewKt.access$applyClickable(var5, var4, var29, var16, "subtitle");
         val var30: SimpleDraweeView = this.getBinding().contentInventoryComponentBadgeIcon;
         q.e(var30);
         val var17: Subtitle = var29.getSubtitle();
         val var18: java.lang.String;
         if (var17 != null) {
            var18 = var17.getBadgeUrl();
         } else {
            var18 = null;
         }

         ReactAssetUtilsKt.setOptionalReactImageUrl(var30, var18);
         val var6: Subtitle = var29.getSubtitle();
         var var19: ContentInventoryEntryClickable = null;
         if (var6 != null) {
            var19 = var6.getClickable();
         }

         ContentInventoryComponentViewKt.access$applyClickable(var30, var4, var29, var19, "subtitle");
         val var20: SimpleDraweeView = this.getBinding().contentInventoryComponentAvatarImage;
         var20.setImageURI(var29.getAvatarUrl());
         q.e(var20);
         ContentInventoryComponentViewKt.access$applyClickable(var20, var4, var29, var29.getUserClickable(), "avatar");
         val var21: SimpleDraweeView = this.getBinding().contentInventoryComponentMediaImage;
         val var27: PipelineDraweeControllerBuilder = this.draweeControllerBuilder;
         q.e(var21);
         val var28: com.facebook.drawee.controller.a = ((var27.E(ContentInventoryComponentViewKt.getContentControllerListener(var21)) as PipelineDraweeControllerBuilder)
               .Q(var29.getImageUrl())
               .H(var21.getController()) as PipelineDraweeControllerBuilder)
            .d();
         q.g(var28, "build(...)");
         var21.setController(var28);
         ContentInventoryComponentViewKt.access$applyClickable(var21, var4, var29, var29.getImageClickable(), "media");
         val var22: SimpleDraweeView = this.getBinding().contentInventoryComponentPlatformIcon;
         q.e(var22);
         ReactAssetUtilsKt.setOptionalReactImageUrl(var22, var29.getPlatformIconUrl());
         ContentInventoryComponentViewKt.access$applyClickable(var22, var4, var29, var29.getPlatformClickable(), "platform");
      }
   }

   public override fun getComponentType(): KClass<ContentInventoryEntryComponent> {
      return g0.b(ContentInventoryEntryComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ContentInventoryComponentView {
         q.h(var1, "context");
         q.h(var2, "root");
         val var3: ContentInventoryComponentView = MessageComponentContentInventoryViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         q.g(var3, "getRoot(...)");
         return var3;
      }
   }
}
