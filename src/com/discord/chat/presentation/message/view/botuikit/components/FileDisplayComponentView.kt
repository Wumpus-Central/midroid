package com.discord.chat.presentation.message.view.botuikit.components

import android.content.Context
import android.util.AttributeSet
import com.discord.chat.bridge.botuikit.FileDisplayComponent
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.message.view.FileAttachmentView
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.ComponentView
import kotlin.jvm.functions.Function2
import kotlin.reflect.KClass

public class FileDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null) : FileAttachmentView(var1, var2),
   ComponentView<FileDisplayComponent> {
   fun FileDisplayComponentView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
   }

   public open fun configure(component: FileDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      val var5: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var7: java.lang.String = var3.getContainerId();
      val var10: java.lang.String = var1.getId();
      val var6: StringBuilder = new StringBuilder();
      var6.append("FileDisplayComponent(");
      var6.append(var10);
      var6.append(")");
      val var8: SpoilerAttributes = var5.forGenericMedia(var1, var7, var6.toString(), var1.getFile().getUrl(), null);
      val var12: java.lang.String = var1.getName();
      val var13: java.lang.String = var1.getSize();
      val var11: java.lang.String = var1.getFile().getUrl();
      val var4: Boolean = var1.isSpoiler();
      val var14: Function2 = var3.getGeneralEventHandlers().getOnLinkClicked();
      var var9: SpoilerConfig = null;
      if (var8 != null) {
         var9 = SpoilerAttributes.configure$default(var8, var3.getGeneralEventHandlers().getOnTapSpoiler(), null, 2, null);
      }

      this.setContent(var12, var13, var11, var14, var4, var9, null, null);
   }

   public override fun getComponentType(): KClass<FileDisplayComponent> {
      return FileDisplayComponent::class;
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): FileDisplayComponentView {
         return new FileDisplayComponentView(var1, null, 2, null);
      }
   }
}
