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
import eh.l
import eh.o
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
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
      this.draweeControllerBuilder = l4.c.g();
      this.binding$delegate = l.a(o.l, new Function0<MessageComponentContentInventoryViewBinding>(this) {
         final ContentInventoryComponentView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MessageComponentContentInventoryViewBinding invoke() {
            val var2: MessageComponentContentInventoryViewBinding = MessageComponentContentInventoryViewBinding.bind(this.this$0);
            var var4: TextView = var2.contentInventoryComponentUsername;
            r.g(var2.contentInventoryComponentUsername, "invoke$lambda$3$lambda$0");
            val var3: DiscordFont = DiscordFont.PrimarySemibold;
            DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
            SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
            val var1: Int = color.primary_160;
            var4.setTextColor(ColorUtilsKt.getColorCompat(var4, color.primary_160));
            var4 = var2.contentInventoryComponentTitle;
            r.g(var2.contentInventoryComponentTitle, "invoke$lambda$3$lambda$1");
            DiscordFontUtilsKt.setDiscordFont(var4, var3);
            SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
            var4.setTextColor(ColorUtilsKt.getColorCompat(var4, var1));
            val var5: TextView = var2.contentInventoryComponentSubtitle;
            r.g(var2.contentInventoryComponentSubtitle, "invoke$lambda$3$lambda$2");
            DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryNormal);
            SetTextSizeSpKt.setTextSizeSp(var5, 14.0F);
            var5.setTextColor(ColorUtilsKt.getColorCompat(var5, color.primary_200));
            return var2;
         }
      });
   }

   @JvmStatic
   fun `configure$lambda$13$lambda$11`(var0: ComponentContext, var1: ContentInventoryEntryComponent, var2: View) {
      r.h(var0, "$componentContext");
      r.h(var1, "$component");
      var0.getUserEventHandlers().getOnTapAvatar().invoke(UserId.box_impl(var1.getContentInventoryEntry().getAuthorId_re6GcUE()));
   }

   @JvmStatic
   fun `configure$lambda$13$lambda$12`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "avatar");
   }

   @JvmStatic
   fun `configure$lambda$15$lambda$14`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "media");
   }

   @JvmStatic
   fun `configure$lambda$17$lambda$16`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "platform");
   }

   @JvmStatic
   fun `configure$lambda$3$lambda$2`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "container");
   }

   @JvmStatic
   fun `configure$lambda$5$lambda$4`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "username");
   }

   @JvmStatic
   fun `configure$lambda$7$lambda$6`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "title");
   }

   @JvmStatic
   fun `configure$lambda$9$lambda$8`(var0: ContentInventoryEntry, var1: ComponentContext, var2: View) {
      r.h(var1, "$componentContext");
      var0.onTap(var1.getContentInventoryEventHandlers(), "subtitle");
   }

   public open fun configure(
      component: ContentInventoryEntryComponent,
      componentProvider: ComponentProvider,
      componentActionListener: ComponentActionListener,
      componentContext: ComponentContext
   ) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentActionListener");
      r.h(var4, "componentContext");
      val var5: ContentInventoryEntry = var1.getContentInventoryEntry();
      if (var5 == null) {
         this.getBinding().getRoot().setVisibility(8);
      } else {
         val var20: java.util.List = var5.getGradientColors();
         val var10: ArrayList = new ArrayList(kotlin.collections.h.t(var20, 10));
         val var21: java.util.Iterator = var20.iterator();

         while (var21.hasNext()) {
            var10.add(ContentInventoryEntryComponentKt.toColorInt(var21.next() as GradientColor));
         }

         val var11: IntArray = kotlin.collections.h.M0(var10);
         val var22: ContentInventoryComponentView = this.getBinding().getRoot();
         var22.setVisibility(0);
         r.g(var22, "configure$lambda$3");
         ViewBackgroundUtilsKt.setBackgroundRectangle$default(var22, var11, Orientation.TL_BR, SizeUtilsKt.getDpToPx(16), null, 0, 24, null);
         var22.setOnClickListener(new c(var5, var4));
         val var12: TextView = this.getBinding().contentInventoryComponentUsername;
         var12.setText(var5.getUserActionDescription());
         var12.setOnClickListener(new d(var5, var4));
         val var13: TextView = this.getBinding().contentInventoryComponentTitle;
         var13.setText(var5.getTitle());
         var13.setOnClickListener(new e(var5, var4));
         val var6: TextView = this.getBinding().contentInventoryComponentSubtitle;
         r.g(var6, "configure$lambda$9");
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
         r.g(var24, "configure$lambda$10");
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
         r.g(var8, "this");
         val var19: com.facebook.drawee.controller.a = ((var18.C(ContentInventoryComponentViewKt.getContentControllerListener(var8)) as PipelineDraweeControllerBuilder)
               .O(var5.getImageUrl())
               .F(var8.getController()) as PipelineDraweeControllerBuilder)
            .c();
         r.g(var19, "draweeControllerBuilder\n…                 .build()");
         var8.setController(var19);
         var8.setOnClickListener(new i(var5, var4));
         val var9: SimpleDraweeView = this.getBinding().contentInventoryComponentPlatformIcon;
         r.g(var9, "configure$lambda$17");
         ReactAssetUtilsKt.setOptionalReactImageUrl(var9, var5.getPlatformIconUrl());
         var9.setOnClickListener(new j(var5, var4));
      }
   }

   public override fun getComponentType(): KClass<ContentInventoryEntryComponent> {
      return h0.b(ContentInventoryEntryComponent.class);
   }

   public companion object {
      public fun inflateComponent(context: Context, root: ViewGroup): ContentInventoryComponentView {
         r.h(var1, "context");
         r.h(var2, "root");
         val var3: ContentInventoryComponentView = MessageComponentContentInventoryViewBinding.inflate(LayoutInflater.from(var1), var2, false).getRoot();
         r.g(var3, "inflate(\n               …false,\n            ).root");
         return var3;
      }
   }
}
