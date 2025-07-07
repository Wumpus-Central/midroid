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
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlin.reflect.KClass

public class FileDisplayComponentView  public constructor(context: Context, attrs: AttributeSet? = null)
   : FileAttachmentView,
   ComponentView<FileDisplayComponent> {
   fun FileDisplayComponentView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      this.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
   }

   public open fun configure(component: FileDisplayComponent, componentProvider: ComponentProvider, componentContext: ComponentContext) {
      r.h(var1, "component");
      r.h(var2, "componentProvider");
      r.h(var3, "componentContext");
      val var5: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var7: java.lang.String = var3.getContainerId();
      var var6: java.lang.String = var1.getId();
      val var10: StringBuilder = new StringBuilder();
      var10.append("FileDisplayComponent(");
      var10.append(var6);
      var10.append(")");
      val var8: SpoilerAttributes = var5.forGenericMedia(var1, var7, var10.toString(), var1.getFile().getUrl(), null);
      var6 = var1.getName();
      val var11: java.lang.String = var1.getSize();
      val var12: java.lang.String = var1.getFile().getUrl();
      val var4: Boolean = var1.isSpoiler();
      val var14: Function2 = var3.getGeneralEventHandlers().getOnLinkClicked();
      var var9: SpoilerConfig = null;
      if (var8 != null) {
         var9 = SpoilerAttributes.configure$default(var8, var3.getGeneralEventHandlers().getOnTapSpoiler(), null, 2, null);
      }

      this.setContent(var6, var11, var12, var14, var4, var9, null, null);
   }

   public override fun getComponentType(): KClass<FileDisplayComponent> {
      return H.b(FileDisplayComponent.class);
   }

   override fun onRecycle(var1: ComponentProvider) {
      ComponentView.DefaultImpls.onRecycle(this, var1);
   }

   public companion object {
      public fun inflateComponent(context: Context): FileDisplayComponentView {
         r.h(var1, "context");
         return new FileDisplayComponentView(var1, null, 2, null);
      }
   }
}
