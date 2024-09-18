package com.discord.chat.presentation.message.view

import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.spoiler.SpoilerConfig

public class SpoilerViewManager {
   public final var spoilerView: SpoilerView?
      internal set

   public fun configureSpoiler(
      spoilerConfig: SpoilerConfig?,
      parentView: ViewGroup,
      containerView: ConstraintLayout,
      viewToHide: View,
      blurView: View? = null,
      obscureLabelVisible: Boolean,
      isObscureAwaitingScan: Boolean,
      showSpoiler: Boolean,
      radiusPx: Int
   ) {
      kotlin.jvm.internal.q.h(var2, "parentView");
      kotlin.jvm.internal.q.h(var3, "containerView");
      kotlin.jvm.internal.q.h(var4, "viewToHide");
      if (var1 != null || this.spoilerView != null) {
         if (this.spoilerView == null) {
            this.spoilerView = SpoilerView.Companion.createAndAttachSpoilerView(var3, var9);
         }

         val var10: SpoilerView = this.spoilerView;
         if (this.spoilerView != null) {
            this.spoilerView.configure(var1, var2);
            if (var8 && var10.isOverlayVisible()) {
               if (var5 != null) {
                  var5.setVisibility(0);
               }

               var10.setObscureLabelVisible(var6);
               var10.handleObscureAwaitingScan(var7);
               var4.setImportantForAccessibility(4);
               var4.clearFocus();
            } else {
               if (var5 != null) {
                  var5.setVisibility(8);
               }

               var4.setImportantForAccessibility(0);
               if (var8) {
                  var10.clearFocus();
                  var4.requestFocus();
               }
            }
         }
      }
   }
}
