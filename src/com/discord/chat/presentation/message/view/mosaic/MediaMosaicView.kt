package com.discord.chat.presentation.message.view.mosaic

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.GridLayout
import android.widget.GridLayout.LayoutParams
import com.discord.chat.R
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import java.util.ArrayList
import java.util.LinkedHashMap
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public abstract class MediaMosaicView<T> : GridLayout {
   private final val spacingPx: Int
   private final lateinit var containerId: String
   private final lateinit var mosaicId: String
   private final lateinit var itemHolders: MutableMap<Long, MessagePartViewHolder>
   private final var isSingleItemMosaic: Boolean
   private final var constrainedWidth: Int
   private final var shouldAutoPlayGif: Boolean
   private final lateinit var onItemClicked: (MosaicMediaItem<Any>, MessagePartViewHolder) -> Unit
   private final var onItemLongClicked: ((MosaicMediaItem<Any>) -> Boolean)?
   private final lateinit var onItemSpoilerClicked: (MosaicMediaItem<Any>) -> Unit

   open fun MediaMosaicView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   open fun MediaMosaicView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      super(var1, var2);
      this.spacingPx = var1.getResources().getDimensionPixelSize(R.dimen.message_media_grid_spacing);
      ViewClippingUtilsKt.clipToRoundedRectangle(this, var1.getResources().getDimensionPixelSize(R.dimen.message_media_radius));
   }

   private fun bindItemHolder(holder: MessagePartViewHolder, item: MosaicMediaItem<Any>, maxWidthPx: Int, maxHeightPx: Int) {
      if (var1 is MediaMosaicImageViewHolder) {
         val var8: MediaMosaicImageViewHolder = var1 as MediaMosaicImageViewHolder;
         var var6: java.lang.String = this.containerId;
         if (this.containerId == null) {
            r.y("containerId");
            var6 = null;
         }

         var var17: java.lang.String = this.mosaicId;
         if (this.mosaicId == null) {
            r.y("mosaicId");
            var17 = null;
         }

         val var5: Boolean = this.isSingleItemMosaic;
         val var9: a = new a(this, var2, var1);
         val var11: b;
         if (this.onItemLongClicked != null) {
            var11 = new b(new Function1<View, java.lang.Boolean>(this.onItemLongClicked, var2) {
               final MosaicMediaItem<T> $item;
               final Function1<MosaicMediaItem<T>, java.lang.Boolean> $onItemLongClicked;

               {
                  super(1);
                  this.$onItemLongClicked = var1;
                  this.$item = var2;
               }

               public final java.lang.Boolean invoke(View var1) {
                  return this.$onItemLongClicked.invoke(this.$item) as java.lang.Boolean;
               }
            });
         } else {
            var11 = null;
         }

         var8.bind(var6, var17, var2, var3, var4, var5, var9, var11, new Function0<Unit>(this, var2) {
            final MosaicMediaItem<T> $item;
            final MediaMosaicView<T> this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$item = var2;
            }

            public final void invoke() {
               val var2: Function1 = MediaMosaicView.access$getOnItemSpoilerClicked$p(this.this$0);
               var var1: Function1 = var2;
               if (var2 == null) {
                  r.y("onItemSpoilerClicked");
                  var1 = null;
               }

               var1.invoke(this.$item);
            }
         }, this.shouldAutoPlayGif);
      } else {
         if (var1 !is MediaMosaicVideoViewHolder) {
            val var14: StringBuilder = new StringBuilder();
            var14.append("Invalid accessory holder type: ");
            var14.append(var1);
            throw new IllegalStateException(var14.toString().toString());
         }

         val var20: MediaMosaicVideoViewHolder = var1 as MediaMosaicVideoViewHolder;
         var var16: java.lang.String = this.containerId;
         if (this.containerId == null) {
            r.y("containerId");
            var16 = null;
         }

         var var19: java.lang.String = this.mosaicId;
         if (this.mosaicId == null) {
            r.y("mosaicId");
            var19 = null;
         }

         val var15: Boolean = this.isSingleItemMosaic;
         val var21: c = new c(this, var2, var1);
         val var13: d;
         if (this.onItemLongClicked != null) {
            var13 = new d(new Function1<View, java.lang.Boolean>(this.onItemLongClicked, var2) {
               final MosaicMediaItem<T> $item;
               final Function1<MosaicMediaItem<T>, java.lang.Boolean> $onItemLongClicked;

               {
                  super(1);
                  this.$onItemLongClicked = var1;
                  this.$item = var2;
               }

               public final java.lang.Boolean invoke(View var1) {
                  return this.$onItemLongClicked.invoke(this.$item) as java.lang.Boolean;
               }
            });
         } else {
            var13 = null;
         }

         var20.bind(var16, var19, var2, var3, var4, var15, var21, var13, new Function0<Unit>(this, var2) {
            final MosaicMediaItem<T> $item;
            final MediaMosaicView<T> this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$item = var2;
            }

            public final void invoke() {
               val var2: Function1 = MediaMosaicView.access$getOnItemSpoilerClicked$p(this.this$0);
               var var1: Function1 = var2;
               if (var2 == null) {
                  r.y("onItemSpoilerClicked");
                  var1 = null;
               }

               var1.invoke(this.$item);
            }
         });
      }
   }

   @JvmStatic
   fun `bindItemHolder$lambda$1`(var0: MediaMosaicView, var1: MosaicMediaItem, var2: MessagePartViewHolder, var3: View) {
      r.h(var0, "this$0");
      r.h(var1, "$item");
      r.h(var2, "$holder");
      var var4: Function2 = var0.onItemClicked;
      if (var0.onItemClicked == null) {
         r.y("onItemClicked");
         var4 = null;
      }

      var4.invoke(var1, var2);
   }

   @JvmStatic
   fun `bindItemHolder$lambda$3`(var0: Function1, var1: View): Boolean {
      return var0.invoke(var1) as java.lang.Boolean;
   }

   @JvmStatic
   fun `bindItemHolder$lambda$4`(var0: MediaMosaicView, var1: MosaicMediaItem, var2: MessagePartViewHolder, var3: View) {
      r.h(var0, "this$0");
      r.h(var1, "$item");
      r.h(var2, "$holder");
      var var4: Function2 = var0.onItemClicked;
      if (var0.onItemClicked == null) {
         r.y("onItemClicked");
         var4 = null;
      }

      var4.invoke(var1, var2);
   }

   @JvmStatic
   fun `bindItemHolder$lambda$6`(var0: Function1, var1: View): Boolean {
      return var0.invoke(var1) as java.lang.Boolean;
   }

   private fun shouldOnlyUpdateBindings(items: List<MosaicMediaItem<Any>>): Boolean {
      val var2: ArrayList = new ArrayList(h.t(var1, 10));
      val var4: java.util.Iterator = var1.iterator();

      while (var4.hasNext()) {
         var2.add((var4.next() as MosaicMediaItem).getUniqueId());
      }

      val var3: java.util.Set = h.Q0(var2);
      var var5: java.util.Map = this.itemHolders;
      if (this.itemHolders == null) {
         r.y("itemHolders");
         var5 = null;
      }

      return var3.equals(h.Q0(var5.keySet()));
   }

   public abstract fun createItemHolder(item: MosaicMediaItem<Any>): MessagePartViewHolder {
   }

   protected fun setItems(
      containerId: String,
      mosaicId: String,
      items: List<MosaicMediaItem<Any>>,
      constrainedWidth: Int,
      onItemClicked: (MosaicMediaItem<Any>, MessagePartViewHolder) -> Unit,
      onItemLongClicked: ((MosaicMediaItem<Any>) -> Boolean)? = null,
      onItemSpoilerClicked: (MosaicMediaItem<Any>) -> Unit,
      shouldAutoPlayGif: Boolean,
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean
   ) {
      r.h(var1, "containerId");
      r.h(var2, "mosaicId");
      r.h(var3, "items");
      r.h(var5, "onItemClicked");
      r.h(var7, "onItemSpoilerClicked");
      this.containerId = var1;
      this.mosaicId = var2;
      val var22: Boolean;
      if (var3.size() == 1) {
         var22 = true;
      } else {
         var22 = false;
      }

      this.isSingleItemMosaic = var22;
      this.onItemClicked = var5;
      this.onItemLongClicked = var6;
      this.onItemSpoilerClicked = var7;
      this.shouldAutoPlayGif = var8;
      if (this.itemHolders != null && this.shouldOnlyUpdateBindings(var3) && this.constrainedWidth == var4) {
         for (MosaicMediaItem var37 : var3) {
            var var25: java.util.Map = this.itemHolders;
            if (this.itemHolders == null) {
               r.y("itemHolders");
               var25 = null;
            }

            val var26: MessagePartViewHolder = var25.get(var37.getUniqueId()) as MessagePartViewHolder;
            if (var26 != null) {
               this.bindItemHolder(var26, var37, var26.itemView.getWidth(), var26.itemView.getHeight());
            }
         }
      } else {
         this.getLayoutParams().width = -2;
         this.constrainedWidth = var4;
         this.itemHolders = new LinkedHashMap<>();
         this.removeAllViews();
         this.setColumnCount(6);
         val var21: Int = var3.size();
         val var20: Int = MessageAccessoriesView.Companion.getWidth(var4, var9, var10);
         val var15: Int = (var20 - this.spacingPx * 2) / 3;
         val var30: java.util.Iterator = var3.iterator();
         var var13: Int = 0;
         var var11: Int = 0;
         var var16: Int = 0;

         while (var30.hasNext()) {
            val var17: Int = var13 + 1;
            val var36: MosaicMediaItem = var30.next() as MosaicMediaItem;
            var var12: Int;
            if (var21 != 1) {
               if (var21 != 2 && var21 != 3 && var21 != 4) {
                  var12 = var21 % 3;
                  if (var13 >= var21 % 3) {
                     var12 = 3;
                  }
               } else {
                  var12 = 2;
               }
            } else {
               var12 = 1;
            }

            var var14: Int;
            label125: {
               if (var21 != 1) {
                  if (var21 == 3) {
                     if (var13 == 0) {
                        var14 = 4;
                     } else {
                        var14 = 2;
                     }
                     break label125;
                  }

                  var4 = 6 / var12;
               } else {
                  var4 = this.getColumnCount();
               }

               var14 = var4;
            }

            val var18: Byte;
            if (var21 == 3 && var13 == 0) {
               var18 = 2;
            } else {
               var18 = 1;
            }

            if (var21 != 1) {
               if (var21 != 3) {
                  var4 = (var20 - (var12 - 1) * this.spacingPx) / var12;
               } else if (var13 == 0) {
                  var4 = var15 * 2 + this.spacingPx;
               } else {
                  var4 = var15;
               }
            } else {
               var4 = var20;
            }

            var var19: Int;
            label113: {
               if (var21 != 1) {
                  if (var21 == 3) {
                     var19 = var4;
                     break label113;
                  }

                  if (var21 != 4 && var12 < 3) {
                     var12 = var15 * 2 + this.spacingPx;
                  } else {
                     var12 = var15;
                  }
               } else {
                  var12 = this.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
               }

               var19 = var12;
            }

            var12 = var11;
            if (var21 == 3) {
               var12 = var11;
               if (var13 == 2) {
                  var12 = var11 + 4;
               }
            }

            val var38: MessagePartViewHolder = this.createItemHolder(var36);
            this.bindItemHolder(var38, var36, var4, var19);
            if (!this.isSingleItemMosaic) {
               val var27: View = var38.itemView;
               val var23: LayoutParams = new LayoutParams();
               var23.width = var4;
               var23.height = var19;
               var23.columnSpec = GridLayout.spec(var12, var14);
               var23.rowSpec = GridLayout.spec(var16, var18);
               if (var12 > 0) {
                  var4 = this.spacingPx;
               } else {
                  var4 = 0;
               }

               var23.leftMargin = var4;
               if (var16 > 0) {
                  var4 = this.spacingPx;
               } else {
                  var4 = 0;
               }

               var23.topMargin = var4;
               var27.setLayoutParams(var23);
            }

            this.addView(var38.itemView);
            var var24: java.util.Map = this.itemHolders;
            if (this.itemHolders == null) {
               r.y("itemHolders");
               var24 = null;
            }

            var24.put(var36.getUniqueId(), var38);
            var11 = var12 + var14;
            if (var12 + var14 >= 6) {
               var16++;
               var13 = var17;
               var11 = 0;
            } else {
               var13 = var17;
            }
         }
      }
   }
}
