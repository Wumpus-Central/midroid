package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.botuikit.ActionRowComponent
import com.discord.chat.bridge.botuikit.Component
import com.discord.chat.databinding.MessageComponentActionRowViewBinding
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsViewKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import com.google.android.flexbox.FlexboxLayout
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.reflect.KClass

@SourceDebugExtension(["SMAP\nActionRowComponentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActionRowComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n1567#2:83\n1598#2,4:84\n257#3,2:88\n257#3,2:90\n*S KotlinDebug\n*F\n+ 1 ActionRowComponentView.kt\ncom/discord/chat/presentation/message/view/botuikit/components/ActionRowComponentView\n*L\n51#1:83\n51#1:84,4\n61#1:88,2\n63#1:90,2\n*E\n"])
public class ActionRowComponentView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(var1, var2, var3),
   ComponentView<ActionRowComponent> {
   public final val binding: MessageComponentActionRowViewBinding

   fun ActionRowComponentView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun ActionRowComponentView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: MessageComponentActionRowViewBinding = MessageComponentActionRowViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var4;
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   public open fun configure(component: ActionRowComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      val var7: java.util.List = var1.getComponents();
      val var6: ArrayList = new ArrayList(CollectionsKt.v(var7, 10));
      val var20: java.util.Iterator = var7.iterator();

      for (int var4 = 0; var20.hasNext(); var4++) {
         var var8: Any = var20.next();
         if (var4 < 0) {
            CollectionsKt.u();
         }

         val var9: Component = var8 as Component;
         var8 = this.binding.actionRowComponentViewGroup;
         var6.add(var2.getConfiguredComponentView(var9, var3, (ViewGroup)var8, var4));
      }

      val var15: java.util.List = CollectionsKt.e0(var6);
      val var19: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      MessageComponentsViewKt.replaceViews$default(var19, var15, var2, 0, 0, 12, null);
      val var11: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      val var16: Byte;
      if (!var15.isEmpty()) {
         var16 = 0;
      } else {
         var16 = 8;
      }

      var11.setVisibility(var16);
      val var12: ConstraintLayout = this.binding.actionRowComponentViewGroupErrorRow.getRoot();
      var var17: Boolean;
      if (var1.getErrorText() != null) {
         var17 = 1;
      } else {
         var17 = 0;
      }

      if (var17) {
         var17 = 0;
      } else {
         var17 = 8;
      }

      var12.setVisibility(var17);
      val var10: java.lang.String = var1.getErrorText();
      if (var10 != null) {
         val var13: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         ReactAssetUtilsKt.setReactAsset(var13, ReactAsset.Warning);
         val var14: SimpleDraweeView = this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelIcon;
         ColorUtilsKt.setTintColor(var14, ThemeManagerKt.getTheme().getInfoDangerForeground());
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setText(var10);
         this.binding.actionRowComponentViewGroupErrorRow.viewInteractionFailedLabelMessage.setTextColor(ThemeManagerKt.getTheme().getInfoDangerForeground());
      }
   }

   public override fun getComponentType(): KClass<ActionRowComponent> {
      return ActionRowComponent::class;
   }

   public override fun onRecycle(componentProvider: ComponentProvider) {
      val var2: FlexboxLayout = this.binding.actionRowComponentViewGroup;
      MessageComponentsViewKt.recycleChildComponents(var2, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): ComponentView<ActionRowComponent> {
         return new ActionRowComponentView(var1, null, 0, 6, null);
      }
   }
}
