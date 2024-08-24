package com.discord.chat.presentation.message.decorations

import android.content.Context
import android.graphics.Canvas
import android.view.View
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.r

public class ThreadSpineItemDecoration(context: Context, contentStartPositionPx: Int) : ItemDecoration {
   public final var showThreadSpine: Boolean
      internal set

   private final val spineDrawer: SpineDrawer

   init {
      r.h(var1, "context");
      super();
      this.spineDrawer = new SpineDrawer(var1, var2);
      this.showThreadSpine = true;
   }

   public open fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      r.h(var1, "canvas");
      r.h(var2, "parent");
      r.h(var3, "state");
      super.onDraw(var1, var2, var3);
      if (this.showThreadSpine) {
         val var8: ViewParent = var2.getParent();
         val var9: SpineParentMessage;
         if (var8 is SpineParentMessage) {
            var9 = var8 as SpineParentMessage;
         } else {
            var9 = null;
         }

         if (var9 != null) {
            val var10: View = var9.getSpineOriginView();
            if (var10 != null) {
               val var6: Int = var10.getLeft() + var10.getMeasuredWidth() / 2;
               val var7: Int = var2.getChildCount();

               for (int var4 = 0; var4 < var7; var4++) {
                  val var11: View = var2.getChildAt(var4);
                  if (var11 != null) {
                     if (var11 is ThreadEmbedView) {
                        this.spineDrawer.drawSpineCurve(var1, var2, var11, var11, var6);
                     } else if (var11 is MessageContentView) {
                        val var5: Int;
                        if (var4 == 0) {
                           var5 = (var11 as MessageContentView).getLineHeight() + SizeUtilsKt.getDpToPx(2);
                        } else {
                           var5 = 0;
                        }

                        this.spineDrawer.drawSpinePiece(var1, var2, var11, var6, var5);
                     } else {
                        SpineDrawer.drawSpinePiece$default(this.spineDrawer, var1, var2, var11, var6, 0, 16, null);
                     }
                  }
               }
            }
         }
      }
   }
}
