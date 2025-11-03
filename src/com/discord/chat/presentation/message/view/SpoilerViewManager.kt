package com.discord.chat.presentation.message.view

import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.chat.bridge.spoiler.SpoilerConfig
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSpoilerViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpoilerViewManager.kt\ncom/discord/chat/presentation/message/view/SpoilerViewManager\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,72:1\n257#2,2:73\n257#2,2:75\n*S KotlinDebug\n*F\n+ 1 SpoilerViewManager.kt\ncom/discord/chat/presentation/message/view/SpoilerViewManager\n*L\n50#1:73,2\n58#1:75,2\n*E\n"])
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
      radiusPx: Int,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean
   ) {
      if (var1 != null || this.spoilerView != null) {
         if (this.spoilerView == null) {
            this.spoilerView = SpoilerView.Companion.createAndAttachSpoilerView(var3, var9);
         }

         val var12: SpoilerView = this.spoilerView;
         if (this.spoilerView != null) {
            this.spoilerView.configure(var1, var2);
            if (var8 && var12.isOverlayVisible()) {
               if (var5 != null) {
                  var5.setVisibility(0);
               }

               var12.setObscureLabelVisible(var6);
               var12.handleObscureAwaitingScan(var7);
               var12.setRevealButtonVisible(var10 xor true);
               var12.setOpaqueBackgroundVisible(var11);
               var4.setImportantForAccessibility(4);
               var4.clearFocus();
               return;
            }

            if (var5 != null) {
               var5.setVisibility(8);
            }

            var4.setImportantForAccessibility(0);
            if (var8) {
               var12.clearFocus();
               var4.requestFocus();
            }
         }
      }
   }
}
