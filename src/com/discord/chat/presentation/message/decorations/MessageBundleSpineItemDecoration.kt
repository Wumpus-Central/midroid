package com.discord.chat.presentation.message.decorations

import R8.n
import android.content.Context
import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView
import com.discord.chat.presentation.list.messagebundling.MessageBundleViewMoreView
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.misc.utilities.measure.NativeViewMeasuringWrapper
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.q

public class MessageBundleSpineItemDecoration(context: Context, contentStartPositionPx: Int) : RecyclerView.ItemDecoration {
   private final val spineDrawer: SpineDrawer

   public final var showThreadSpine: Boolean
      internal set

   init {
      q.h(var1, "context");
      super();
      this.spineDrawer = new SpineDrawer(var1, var2);
      this.showThreadSpine = true;
   }

   private fun View.shouldDrawCurvedSpine(): Boolean {
      val var2: Boolean;
      if (var1 !is MessageBundleConversationView && var1 !is MessageBundleViewMoreView) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public override fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      q.h(var1, "canvas");
      q.h(var2, "parent");
      q.h(var3, "state");
      super.onDraw(var1, var2, var3);
      if (this.showThreadSpine) {
         var var9: View = var2.getChildAt(0);
         if (var9 != null) {
            var var13: View = var9;
            if (var9 !is NativeViewMeasuringWrapper) {
               var13 = null;
            }

            val var14: NativeViewMeasuringWrapper = var13 as NativeViewMeasuringWrapper;
            if (var13 as NativeViewMeasuringWrapper != null) {
               var9 = var14.getView();
               if (var9 != null) {
                  var var15: View = var9;
                  if (var9 !is SpineParentMessage) {
                     var15 = null;
                  }

                  val var16: SpineParentMessage = var15 as SpineParentMessage;
                  if (var15 as SpineParentMessage != null) {
                     val var10: View = var16.getSpineOriginView();
                     if (var10 != null) {
                        val var8: Int = var10.getLeft() + var10.getMeasuredWidth() / 2;
                        val var11: java.util.Iterator = new IntRange(0, var2.getChildCount()).iterator();
                        var var4: Int = -1;
                        var var5: Int = 0;

                        while (var11.hasNext()) {
                           var var6: Int = (var11 as n).a();
                           if (var5 < 0) {
                              i.u();
                           }

                           var9 = var2.getChildAt(var6);
                           var6 = var4;
                           if (var9 != null) {
                              var var17: View = var9;
                              if (var9 !is NativeViewMeasuringWrapper) {
                                 var17 = null;
                              }

                              val var18: NativeViewMeasuringWrapper = var17 as NativeViewMeasuringWrapper;
                              var6 = var4;
                              if (var18 != null) {
                                 val var19: View = var18.getView();
                                 var6 = var4;
                                 if (var19 != null) {
                                    var6 = var4;
                                    if (this.shouldDrawCurvedSpine(var19)) {
                                       var6 = var5;
                                    }
                                 }
                              }
                           }

                           var5++;
                           var4 = var6;
                        }

                        var var7: Int = var2.getChildCount();
                        var var26: Int = 0;
                        var5 = var4;

                        for (int var23 = var7; var26 < var23; var26++) {
                           val var31: View = var2.getChildAt(var26);
                           if (var31 != null) {
                              var9 = (var31 as NativeViewMeasuringWrapper).getView();
                              if (var9 is MessageBundleConversationView || var9 is MessageBundleViewMoreView) {
                                 val var12: SpineDrawer = this.spineDrawer;
                                 var var20: View = var9;
                                 if (var9 !is SpineParentMessage) {
                                    var20 = null;
                                 }

                                 val var21: SpineParentMessage = var20 as SpineParentMessage;
                                 if (var20 as SpineParentMessage != null) {
                                    val var22: View = var21.getSpineOriginView();
                                    if (var22 != null) {
                                       var12.drawSpineCurve(var1, var2, var31, var22, var8);
                                       if (var26 != var5) {
                                          this.spineDrawer.drawSpinePiece(var1, var2, var31, var8, 0);
                                       }
                                    }
                                 }
                              } else if (var9 is MessageView) {
                                 if (var26 == 0) {
                                    var7 = var10.getTop() + var10.getHeight() + SizeUtilsKt.getDpToPx(2);
                                 } else {
                                    var7 = 0;
                                 }

                                 this.spineDrawer.drawSpinePiece(var1, var2, var31, var8, var7);
                              } else {
                                 SpineDrawer.drawSpinePiece$default(this.spineDrawer, var1, var2, var31, var8, 0, 16, null);
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
