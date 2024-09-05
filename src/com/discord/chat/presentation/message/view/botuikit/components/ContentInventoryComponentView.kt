package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.graphics.drawable.GradientDrawable.Orientation
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.botuikit.ContentInventoryEntry
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
import com.discord.primitives.UserId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import kotlin.reflect.KClass
import vj.l
import vj.o

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
      this.draweeControllerBuilder = g6.c.g();
      this.binding$delegate = l.b(o.l, new Function0(this) {
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
            var3.setTextColor(ColorUtilsKt.getColorCompat(var3, color.primary_160));
            var3 = var1.contentInventoryComponentTitle;
            q.e(var1.contentInventoryComponentTitle);
            DiscordFontUtilsKt.setDiscordFont(var3, var2);
            SetTextSizeSpKt.setTextSizeSp(var3, 16.0F);
            var3.setTextColor(ColorUtilsKt.getColorCompat(var3, color.primary_160));
            val var4: TextView = var1.contentInventoryComponentSubtitle;
            q.e(var1.contentInventoryComponentSubtitle);
            DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
            SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
            var4.setTextColor(ColorUtilsKt.getColorCompat(var4, color.primary_200));
            return var1;
         }
      });
   }

   @JvmStatic
   fun `configure$lambda$13$lambda$11`(var0: ComponentContext, var1: ContentInventoryEntryComponent, var2: View) {
      q.h(var0, "$componentContext");
      q.h(var1, "$component");
      var0.getUserEventHandlers().getOnTapAvatar().invoke(UserId.box-impl(var1.getContentInventoryEntry().getAuthorId-re6GcUE()));
   }

   @JvmStatic
   fun `configure$lambda$13$lambda$12`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "avatar");
   }

   @JvmStatic
   fun `configure$lambda$15$lambda$14`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "media");
   }

   @JvmStatic
   fun `configure$lambda$17$lambda$16`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "platform");
   }

   @JvmStatic
   fun `configure$lambda$3$lambda$2`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "container");
   }

   @JvmStatic
   fun `configure$lambda$5$lambda$4`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "username");
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$6`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "title");
   }

   @JvmStatic
   fun `configure$lambda$9$lambda$8`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      q.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "subtitle");
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
      val var5: ContentInventoryEntry = var1.getContentInventoryEntry();
      if (var5 == null) {
         this.getBinding().getRoot().setVisibility(8);
      } else {
         val var20: java.util.List = var5.getGradientColors();
         val var10: ArrayList = new ArrayList(kotlin.collections.i.u(var20, 10));
         val var21: java.util.Iterator = var20.iterator();

         while (var21.hasNext()) {
            var10.add(ContentInventoryEntryComponentKt.toColorInt(var21.next() as GradientColor));
         }

         val var22: IntArray = kotlin.collections.i.P0(var10);
         val var11: ContentInventoryComponentView = this.getBinding().getRoot();
         var11.setVisibility(0);
         q.e(var11);
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(var11, var22, Orientation.TL_BR, SizeUtilsKt.getDpToPx(16), null, 0, 24, null);
         var11.setOnClickListener(new c(var5, var4));
         val var12: TextView = this.getBinding().contentInventoryComponentUsername;
         var12.setText(var5.getUserActionDescription());
         var12.setOnClickListener(new d(var5, var4));
         val var13: TextView = this.getBinding().contentInventoryComponentTitle;
         var13.setText(var5.getTitle());
         var13.setOnClickListener(new e(var5, var4));
         val var6: TextView = this.getBinding().contentInventoryComponentSubtitle;
         q.e(var6);
         val var14: Subtitle = var5.getSubtitle();
         val var15: java.lang.String;
         if (var14 != null) {
            var15 = var14.getText();
         } else {
            var15 = null;
         }

         ViewUtilsKt.setOptionalText(var6, var15);
         var6.setOnClickListener(new f(var5, var4));
         val var24: SimpleDraweeView = this.getBinding().contentInventoryComponentBadgeIcon;
         q.e(var24);
         val var7: Subtitle = var5.getSubtitle();
         var var16: java.lang.String = null;
         if (var7 != null) {
            var16 = var7.getBadgeUrl();
         }

         ReactAssetUtilsKt.setOptionalReactImageUrl(var24, var16);
         val var17: SimpleDraweeView = this.getBinding().contentInventoryComponentAvatarImage;
         var17.setOnClickListener(new g(var4, var1));
         var17.setImageURI(var5.getAvatarUrl());
         var17.setOnClickListener(new h(var5, var4));
         val var8: SimpleDraweeView = this.getBinding().contentInventoryComponentMediaImage;
         val var18: PipelineDraweeControllerBuilder = this.draweeControllerBuilder;
         q.e(var8);
         val var19: com.facebook.drawee.controller.a = ((var18.E(ContentInventoryComponentViewKt.getContentControllerListener(var8)) as PipelineDraweeControllerBuilder)
               .Q(var5.getImageUrl())
               .H(var8.getController()) as PipelineDraweeControllerBuilder)
            .d();
         q.g(var19, "build(...)");
         var8.setController(var19);
         var8.setOnClickListener(new i(var5, var4));
         val var9: SimpleDraweeView = this.getBinding().contentInventoryComponentPlatformIcon;
         q.e(var9);
         ReactAssetUtilsKt.setOptionalReactImageUrl(var9, var5.getPlatformIconUrl());
         var9.setOnClickListener(new j(var5, var4));
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
