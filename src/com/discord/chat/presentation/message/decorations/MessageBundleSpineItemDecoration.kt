package com.discord.chat.presentation.message.decorations

import android.content.Context
import android.graphics.Canvas
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView
import com.discord.chat.presentation.list.messagebundling.MessageBundleViewMoreView
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.misc.utilities.measure.NativeViewMeasuringWrapper
import com.discord.misc.utilities.size.SizeUtilsKt
import fh.p
import kotlin.jvm.internal.r

public class MessageBundleSpineItemDecoration(context: Context, contentStartPositionPx: Int) : ItemDecoration {
   public final var showThreadSpine: Boolean
      internal set

   private final val spineDrawer: SpineDrawer

   init {
      r.h(var1, "context");
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

   public open fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      r.h(var1, "canvas");
      r.h(var2, "parent");
      r.h(var3, "state");
      super.onDraw(var1, var2, var3);
      if (this.showThreadSpine) {
         var var11: View = var2.getChildAt(0);
         if (var11 != null) {
            var var15: View = var11;
            if (var11 !is NativeViewMeasuringWrapper) {
               var15 = null;
            }

            val var16: NativeViewMeasuringWrapper = var15 as NativeViewMeasuringWrapper;
            if (var15 as NativeViewMeasuringWrapper != null) {
               var11 = var16.getView();
               if (var11 != null) {
                  var var17: View = var11;
                  if (var11 !is SpineParentMessage) {
                     var17 = null;
                  }

                  val var18: SpineParentMessage = var17 as SpineParentMessage;
                  if (var17 as SpineParentMessage != null) {
                     val var12: View = var18.getSpineOriginView();
                     if (var12 != null) {
                        val var8: Int = var12.getLeft() + var12.getMeasuredWidth() / 2;
                        val var13: java.util.Iterator = new IntRange(0, var2.getChildCount()).iterator();
                        var var4: Int = -1;
                        var var5: Int = 0;

                        while (true) {
                           var var10: Boolean = var13.hasNext();
                           val var9: Boolean = true;
                           var var6: Boolean = true;
                           if (!var10) {
                              var5 = var2.getChildCount();

                              for (int var26 = 0; var26 < var5; var26++) {
                                 val var14: View = var2.getChildAt(var26);
                                 if (var14 != null) {
                                    var11 = (var14 as NativeViewMeasuringWrapper).getView();
                                    if (var11 is MessageBundleConversationView) {
                                       var10 = var9;
                                    } else {
                                       var10 = var11 is MessageBundleViewMoreView;
                                    }

                                    if (var10) {
                                       val var32: SpineDrawer = this.spineDrawer;
                                       var var22: View = var11;
                                       if (var11 !is SpineParentMessage) {
                                          var22 = null;
                                       }

                                       val var23: SpineParentMessage = var22 as SpineParentMessage;
                                       if (var22 as SpineParentMessage != null) {
                                          val var24: View = var23.getSpineOriginView();
                                          if (var24 != null) {
                                             var32.drawSpineCurve(var1, var2, var14, var24, var8);
                                             if (var26 != var4) {
                                                this.spineDrawer.drawSpinePiece(var1, var2, var14, var8, 0);
                                             }
                                          }
                                       }
                                    } else if (var11 is MessageView) {
                                       val var27: Int;
                                       if (var26 == 0) {
                                          var27 = var12.getTop() + var12.getHeight() + SizeUtilsKt.getDpToPx(2);
                                       } else {
                                          var27 = 0;
                                       }

                                       this.spineDrawer.drawSpinePiece(var1, var2, var14, var8, var27);
                                    } else {
                                       SpineDrawer.drawSpinePiece$default(this.spineDrawer, var1, var2, var14, var8, 0, 16, null);
                                    }
                                 }
                              }
                              break;
                           }

                           val var7: Int = (var13 as p).nextInt();
                           if (var5 < 0) {
                              h.s();
                           }

                           label84: {
                              var11 = var2.getChildAt(var7);
                              if (var11 != null) {
                                 var var19: View = var11;
                                 if (var11 !is NativeViewMeasuringWrapper) {
                                    var19 = null;
                                 }

                                 val var20: NativeViewMeasuringWrapper = var19 as NativeViewMeasuringWrapper;
                                 if (var19 as NativeViewMeasuringWrapper != null) {
                                    val var21: View = var20.getView();
                                    if (var21 != null && this.shouldDrawCurvedSpine(var21)) {
                                       break label84;
                                    }
                                 }
                              }

                              var6 = false;
                           }

                           if (var6) {
                              var4 = var5;
                           }

                           var5++;
                        }
                     }
                  }
               }
            }
         }
      }
   }
}
