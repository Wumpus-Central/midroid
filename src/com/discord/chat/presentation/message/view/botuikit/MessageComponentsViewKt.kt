@file:SourceDebugExtension(["SMAP\nMessageComponentsView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsViewKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n1872#2,2:132\n1874#2:142\n327#3,4:134\n327#3,4:138\n*S KotlinDebug\n*F\n+ 1 MessageComponentsView.kt\ncom/discord/chat/presentation/message/view/botuikit/MessageComponentsViewKt\n*L\n81#1:132,2\n81#1:142\n94#1:134,4\n98#1:138,4\n*E\n"])

package com.discord.chat.presentation.message.view.botuikit

import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import android.view.ViewGroup.MarginLayoutParams
import com.discord.chat.bridge.botuikit.Component
import kotlin.jvm.internal.SourceDebugExtension

public fun ViewGroup.recycleChildComponents(componentProvider: ComponentProvider?) {
   for (int var2 = var0.getChildCount() - 1; -1 < var2; var2--) {
      if (var1 != null) {
         val var3: View = var0.getChildAt(var2);
         var1.recycleComponentView(var3 as ComponentView<out Component>);
      }

      var0.removeViewAt(var2);
   }
}

public fun ViewGroup.replaceViews(
   views: List<ComponentView<out Component>>,
   componentProvider: ComponentProvider?,
   paddingBottom: Int = 0,
   paddingRight: Int = 0
) {
   val var8: java.util.Iterator = var1.iterator();

   for (int var5 = 0; var8.hasNext(); var5++) {
      var var6: Any = var8.next();
      if (var5 < 0) {
         CollectionsKt.v();
      }

      val var10: ComponentView = var6 as ComponentView;
      val var9: View = var10 as View;
      val var7: LayoutParams = (var10 as View).getLayoutParams();
      var6 = var7;
      if (var7 == null) {
         var6 = new MarginLayoutParams(-1, -2);
      }

      var9.setLayoutParams((LayoutParams)var6);
      if (var5 < var1.size() - 1) {
         var6 = var9.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
         }

         val var16: MarginLayoutParams = var6 as MarginLayoutParams;
         (var6 as MarginLayoutParams).setMargins(0, 0, var4, var3);
         var9.setLayoutParams(var16);
      } else {
         var6 = var9.getLayoutParams();
         if (var6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
         }

         val var18: MarginLayoutParams = var6 as MarginLayoutParams;
         (var6 as MarginLayoutParams).setMargins(0, 0, 0, 0);
         var9.setLayoutParams(var18);
      }

      if (var5 < var0.getChildCount()) {
         if (var0.getChildAt(var5) != var10) {
            if (var2 != null) {
               var6 = var0.getChildAt(var5);
               var2.recycleComponentView(var6 as ComponentView<out Component>);
            }

            var0.removeViewAt(var5);
            var0.addView(var9, var5);
         }
      } else {
         var0.addView(var9, var5);
      }
   }

   if (var1.size() < var0.getChildCount()) {
      var3 = var0.getChildCount() - 1;
      var4 = var1.size();
      if (var4 <= var3) {
         while (true) {
            if (var0.getChildAt(var3) != null) {
               val var11: View = var0.getChildAt(var3);
               if (var2 != null) {
                  var2.recycleComponentView(var11 as ComponentView<out Component>);
               }

               var0.removeViewAt(var3);
            }

            if (var3 == var4) {
               break;
            }

            var3--;
         }
      }
   }
}

@JvmSynthetic
fun `replaceViews$default`(var0: ViewGroup, var1: java.util.List, var2: ComponentProvider, var3: Int, var4: Int, var5: Int, var6: Any) {
   if ((var5 and 4) != 0) {
      var3 = 0;
   }

   if ((var5 and 8) != 0) {
      var4 = 0;
   }

   replaceViews(var0, var1, var2, var3, var4);
}
