package com.discord.fastest_list.android.view_holder

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.View.OnLayoutChangeListener
import android.view.ViewGroup.LayoutParams
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholder
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.portals.from_js.PortalFromJsContext
import com.discord.portals.from_js.PortalFromJsContextManager
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nFastestListViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastestListViewHolder.kt\ncom/discord/fastest_list/android/view_holder/FastestListViewHolder\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,161:1\n327#2,4:162\n*S KotlinDebug\n*F\n+ 1 FastestListViewHolder.kt\ncom/discord/fastest_list/android/view_holder/FastestListViewHolder\n*L\n117#1:162,4\n*E\n"])
internal sealed class FastestListViewHolder protected constructor(view: View, onUnexpectedItemSize: (Entry, Int) -> Unit)
   : RecyclerView.ViewHolder,
   PortalFromJsContext {
   protected final val view: FastestListViewHolderView
   private final var viewTransitioning: Boolean
   private final var viewPlaceholder: FastestListPlaceholder?
   private final var viewPortalId: String?
   private final var viewPortalBound: Boolean
   private final val viewPortalSizeValidator: com.discord.fastest_list.android.view_holder.FastestListViewHolder.ViewPortalSizeValidator
   private final lateinit var item: Entry
   private final var horizontal: Boolean

   init {
      val var3: Context = var1.getContext();
      super(new FastestListViewHolderView(var3));
      var1 = this.itemView;
      val var5: FastestListViewHolderView = var1 as FastestListViewHolderView;
      this.view = var1 as FastestListViewHolderView;
      this.viewPortalSizeValidator = new FastestListViewHolder.ViewPortalSizeValidator(this, var2);
      this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
      var5.setOnViewTransitioning(new a(this));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: FastestListViewHolder, var1: Boolean): Unit {
      var0.viewTransitioning = var1;
      updatePlaceholder$default(var0, var0.view, null, 1, null);
      return Unit.a;
   }

   private fun View.updateLayoutParams(itemSize: Int, horizontal: Boolean) {
      val var5: LayoutParams = var1.getLayoutParams();
      if (var5 != null) {
         val var6: RecyclerView.LayoutParams = var5 as RecyclerView.LayoutParams;
         val var4: Int;
         if (var3) {
            var4 = var2;
         } else {
            var4 = -1;
         }

         var6.width = var4;
         if (var3) {
            var2 = -1;
         }

         var6.height = var2;
         var1.setLayoutParams(var6);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
      }
   }

   private fun ViewGroup.updatePlaceholder(placeholderType: FastestListPlaceholderType? = null) {
      if (!this.viewTransitioning) {
         if (var2 != null) {
            val var3: FastestListPlaceholder.Companion = FastestListPlaceholder.Companion;
            if (!(this.viewPlaceholder == FastestListPlaceholder.Companion.get(var2))) {
               if (this.viewPlaceholder != null) {
                  this.viewPlaceholder.onPlaceholderShouldUnbind(var1);
               }

               this.viewPlaceholder = var3.get(var2);
            }
         }

         if (!this.viewPortalBound) {
            if (this.item == null) {
               return;
            }

            if (this.viewPlaceholder != null) {
               var var5: FastestListSections.Entry = this.item;
               if (this.item == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("item");
                  var5 = null;
               }

               this.viewPlaceholder.onPlaceholderShouldBind(this.view, var5);
            }
         } else if (this.viewPlaceholder != null) {
            this.viewPlaceholder.onPlaceholderShouldUnbind(this.view);
         }
      }
   }

   public open fun getPortalViewIndex(portalView: View): Int {
      return this.view.indexOfChild(var1);
   }

   public open fun onBindViewHolder(item: Entry, horizontal: Boolean, placeholderConfig: FastestListPlaceholderConfig) {
      this.item = var1;
      this.horizontal = var2;
      this.viewPortalId = var1.getKey();
      this.updateLayoutParams(this.view, var1.getSize(), var2);
      this.updatePlaceholder(this.view, var3.getForEntry(var1));
      PortalFromJsContextManager.INSTANCE.addContext(var1.getKey(), this);
   }

   public open fun onPortalFromJsAdded(portalId: String, portalView: View) {
      if (this.viewPortalId == var1) {
         this.viewPortalBound = true;
         updatePlaceholder$default(this, this.view, null, 1, null);
         val var3: FastestListViewHolderView = this.view;
         var2.addOnLayoutChangeListener(this.viewPortalSizeValidator);
         var3.addView(var2);
      }
   }

   public open fun onPortalFromJsRemoved(portalId: String, portalView: View) {
      if (this.viewPortalId == var1) {
         this.viewPortalBound = false;
      }

      updatePlaceholder$default(this, this.view, null, 1, null);
      val var3: FastestListViewHolderView = this.view;
      var2.removeOnLayoutChangeListener(this.viewPortalSizeValidator);
      var3.removeView(var2);
   }

   public open fun onViewRecycled() {
      if (this.viewPortalId != null) {
         PortalFromJsContextManager.INSTANCE.removeContext(this.viewPortalId, this);
      }

      this.viewPortalId = null;
   }

   private inner class ViewPortalSizeValidator(onUnexpectedItemSize: (Entry, Int) -> Unit) : OnLayoutChangeListener {
      private final val onUnexpectedItemSize: (Entry, Int) -> Unit

      init {
         this.this$0 = var1;
         this.onUnexpectedItemSize = var2;
      }

      public open fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
         var1.removeOnLayoutChangeListener(this);
         if (FastestListViewHolder.access$getHorizontal$p(this.this$0)) {
            var2 = var4 - var2;
         } else {
            var2 = var5 - var3;
         }

         var var11: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
         var var12: FastestListSections.Entry = var11;
         if (var11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("item");
            var12 = null;
         }

         if (var2 < var12.getSize() - 1) {
            var11 = FastestListViewHolder.access$getItem$p(this.this$0);
            var var13: FastestListSections.Entry = var11;
            if (var11 == null) {
               Intrinsics.throwUninitializedPropertyAccessException("item");
               var13 = null;
            }

            if (var2 > var13.getSize() + 1) {
               val var17: Function2 = this.onUnexpectedItemSize;
               var var14: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
               if (var14 == null) {
                  Intrinsics.throwUninitializedPropertyAccessException("item");
                  var14 = null;
               }

               var17.invoke(var14, var2);
            }
         }
      }
   }
}
