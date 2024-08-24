package com.discord.fastest_list.android.view_holder

import android.view.View
import android.view.ViewGroup
import android.view.View.OnLayoutChangeListener
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView.LayoutParams
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholder
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.portals.from_js.PortalFromJsContext
import com.discord.portals.from_js.PortalFromJsContextManager
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

internal sealed class FastestListViewHolder protected constructor(view: View, onUnexpectedItemSize: (Entry, Int) -> Unit) : ViewHolder(
         new FrameLayout(var1.getContext())
      ),
   PortalFromJsContext {
   protected final val view: FrameLayout
   private final var viewPlaceholder: FastestListPlaceholder?
   private final var viewPortalId: String?
   private final var viewPortalBound: Boolean
   private final val viewPortalSizeValidator: com.discord.fastest_list.android.view_holder.FastestListViewHolder.ViewPortalSizeValidator
   private final lateinit var item: Entry
   private final var horizontal: Boolean

   init {
      var1 = this.itemView;
      r.f(this.itemView, "null cannot be cast to non-null type android.widget.FrameLayout");
      this.view = var1 as FrameLayout;
      this.viewPortalSizeValidator = new FastestListViewHolder.ViewPortalSizeValidator(this, var2);
      this.itemView.setLayoutParams(new LayoutParams(-2, -2));
   }

   private fun View.updateLayoutParams(itemSize: Int, horizontal: Boolean) {
      val var5: android.view.ViewGroup.LayoutParams = var1.getLayoutParams();
      if (var5 != null) {
         val var6: LayoutParams = var5 as LayoutParams;
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

   private fun ViewGroup.updatePlaceholder(placeholderType: FastestListPlaceholderType) {
      val var3: FastestListPlaceholder.Companion = FastestListPlaceholder.Companion;
      if (!r.c(this.viewPlaceholder, FastestListPlaceholder.Companion.get(var2))) {
         if (this.viewPlaceholder != null) {
            this.viewPlaceholder.onPlaceholderShouldUnbind(var1);
         }

         this.viewPlaceholder = var3.get(var2);
      }

      if (!this.viewPortalBound && this.viewPlaceholder != null) {
         var var5: FastestListSections.Entry = this.item;
         if (this.item == null) {
            r.y("item");
            var5 = null;
         }

         this.viewPlaceholder.onPlaceholderShouldBind(this.view, var5);
      }
   }

   public open fun getPortalViewIndex(portalView: View): Int {
      r.h(var1, "portalView");
      return this.view.indexOfChild(var1);
   }

   public open fun onBindViewHolder(item: Entry, horizontal: Boolean, placeholderConfig: FastestListPlaceholderConfig) {
      r.h(var1, "item");
      r.h(var3, "placeholderConfig");
      this.item = var1;
      this.horizontal = var2;
      this.viewPortalId = var1.getKey();
      this.updateLayoutParams(this.view, var1.getSize(), var2);
      this.updatePlaceholder(this.view, var3.getForEntry(var1));
      PortalFromJsContextManager.INSTANCE.addContext(var1.getKey(), this);
   }

   public open fun onPortalFromJsAdded(portalId: String, portalView: View) {
      r.h(var1, "portalId");
      r.h(var2, "portalView");
      if (r.c(this.viewPortalId, var1)) {
         this.viewPortalBound = true;
         if (this.viewPlaceholder != null) {
            this.viewPlaceholder.onPlaceholderShouldUnbind(this.view);
         }

         val var4: FrameLayout = this.view;
         var2.addOnLayoutChangeListener(this.viewPortalSizeValidator);
         var4.addView(var2);
      }
   }

   public open fun onPortalFromJsRemoved(portalId: String, portalView: View) {
      r.h(var1, "portalId");
      r.h(var2, "portalView");
      if (r.c(this.viewPortalId, var1)) {
         this.viewPortalBound = false;
         if (this.viewPlaceholder != null) {
            var var6: FastestListSections.Entry = this.item;
            if (this.item == null) {
               r.y("item");
               var6 = null;
            }

            this.viewPlaceholder.onPlaceholderShouldBind(this.view, var6);
         }
      }

      val var7: FrameLayout = this.view;
      var2.removeOnLayoutChangeListener(this.viewPortalSizeValidator);
      var7.removeView(var2);
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
         r.h(var2, "onUnexpectedItemSize");
         this.this$0 = var1;
         super();
         this.onUnexpectedItemSize = var2;
      }

      public open fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
         r.h(var1, "v");
         var1.removeOnLayoutChangeListener(this);
         if (FastestListViewHolder.access$getHorizontal$p(this.this$0)) {
            var2 = var4 - var2;
         } else {
            var2 = var5 - var3;
         }

         var var11: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
         var var12: FastestListSections.Entry = var11;
         if (var11 == null) {
            r.y("item");
            var12 = null;
         }

         var5 = var12.getSize();
         var var16: Boolean = true;
         if (var2 < var5 - 1) {
            var11 = FastestListViewHolder.access$getItem$p(this.this$0);
            var var13: FastestListSections.Entry = var11;
            if (var11 == null) {
               r.y("item");
               var13 = null;
            }

            if (var2 <= var13.getSize() + 1) {
               var16 = true;
            } else {
               var16 = false;
            }
         }

         if (!var16) {
            val var20: Function2 = this.onUnexpectedItemSize;
            var var14: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
            if (var14 == null) {
               r.y("item");
               var14 = null;
            }

            var20.invoke(var14, var2);
         }
      }
   }
}
