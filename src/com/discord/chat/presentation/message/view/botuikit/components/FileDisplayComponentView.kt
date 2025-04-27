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
import kotlin.jvm.internal.E
import kotlin.jvm.internal.q
import kotlin.reflect.KClass

public class FileDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null)
   : FileAttachmentView,
   ComponentView<FileDisplayComponent> {
   fun FileDisplayComponentView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2);
      this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
   }

   public open fun configure(component: FileDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      q.h(var1, "component");
      q.h(var2, "componentProvider");
      q.h(var3, "componentContext");
      val var5: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var10: java.lang.String = var3.getContainerId();
      var var6: java.lang.String = var1.getId();
      val var7: StringBuilder = new StringBuilder();
      var7.append("FileDisplayComponent(");
      var7.append(var6);
      var7.append(")");
      val var14: SpoilerAttributes = var5.forGenericMedia(var1, var10, var7.toString(), var1.getFile().getUrl(), null);
      val var12: java.lang.String = var1.getName();
      var6 = var1.getSize();
      val var11: java.lang.String = var1.getFile().getUrl();
      val var4: Boolean = var1.isSpoiler();
      val var8: Function2 = var3.getGeneralEventHandlers().getOnLinkClicked();
      var var9: SpoilerConfig = null;
      if (var14 != null) {
         var9 = SpoilerAttributes.configure$default(var14, var3.getGeneralEventHandlers().getOnTapSpoiler(), null, 2, null);
      }

      this.setContent(var12, var6, var11, var8, var4, var9, null, null);
   }

   public override fun getComponentType(): KClass<FileDisplayComponent> {
      return E.b(FileDisplayComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): FileDisplayComponentView {
         q.h(var1, "context");
         return new FileDisplayComponentView(var1, null, 2, null);
      }
   }
}
