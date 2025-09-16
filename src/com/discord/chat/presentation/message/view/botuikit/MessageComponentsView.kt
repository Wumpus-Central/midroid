package com.discord.chat.presentation.message.view.botuikit

import android.content.Context
import android.util.AttributeSet
import android.view.View.MeasureSpec
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import com.discord.chat.bridge.botuikit.Component
import com.discord.misc.utilities.size.SizeUtilsKt
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMessageComponentsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1567#2:132\n1598#2,4:133\n*S KotlinDebug\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsView\n*L\n58#1:132\n58#1:133,4\n*E\n"])
public class MessageComponentsView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(var1, var2, var3) {
   public final var componentContext: ComponentContext?
      internal set

   fun MessageComponentsView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun MessageComponentsView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      this.setOrientation(1);
      this.setLayoutParams(new LayoutParams(-1, -2));
   }

   protected open fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
      val var3: ComponentContext = this.componentContext;
      if (this.componentContext == null) {
         super.onMeasure(var1, var2);
      } else if (!this.componentContext.getWidthInfo().getShouldRestrictTopLevelWidth()) {
         super.onMeasure(var1, var2);
      } else {
         super.onMeasure(MeasureSpec.makeMeasureSpec(var3.getWidthInfo().getTopLevelMaxWidth(), Integer.MIN_VALUE), var2);
      }
   }

   public fun setComponents(components: List<Component>, componentProvider: ComponentProvider?, componentContext: ComponentContext) {
      this.componentContext = var3;
      val var5: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
      val var6: java.util.Iterator = var1.iterator();

      for (int var4 = 0; var6.hasNext(); var4++) {
         var var7: Any = var6.next();
         if (var4 < 0) {
            CollectionsKt.u();
         }

         var7 = var7 as Component;
         if (var2 != null) {
            var7 = var2.getConfiguredComponentView((Component)var7, var3, this, var4);
         } else {
            var7 = null;
         }

         var5.add(var7);
      }

      MessageComponentsViewKt.replaceViews$default(this, CollectionsKt.e0(var5), var2, SizeUtilsKt.getDpToPx(8), 0, 8, null);
   }
}
