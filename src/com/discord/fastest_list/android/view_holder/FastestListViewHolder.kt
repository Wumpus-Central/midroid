package com.discord.fastest_list.android.view_holder

import android.view.View
import android.view.ViewGroup
import android.view.View.OnLayoutChangeListener
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
import com.discord.fastest_list.android.FastestListSections
import com.discord.fastest_list.android.FastestListSections.Entry
import com.discord.fastest_list.android.placeholder.FastestListPlaceholder
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderConfig
import com.discord.fastest_list.android.placeholder.FastestListPlaceholderType
import com.discord.portals.from_js.PortalFromJsContext
import com.discord.portals.from_js.PortalFromJsContextManager
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

internal sealed class FastestListViewHolder protected constructor(view: View, onUnexpectedItemSize: (Entry, Int) -> Unit) : RecyclerView.ViewHolder(
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
      q.f(this.itemView, "null cannot be cast to non-null type android.widget.FrameLayout");
      this.view = var1 as FrameLayout;
      this.viewPortalSizeValidator = new FastestListViewHolder.ViewPortalSizeValidator(this, var2);
      this.itemView.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
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

   private fun ViewGroup.updatePlaceholder(placeholderType: FastestListPlaceholderType) {
      val var3: FastestListPlaceholder.Companion = FastestListPlaceholder.Companion;
      if (!q.c(this.viewPlaceholder, FastestListPlaceholder.Companion.get(var2))) {
         if (this.viewPlaceholder != null) {
            this.viewPlaceholder.onPlaceholderShouldUnbind(var1);
         }

         this.viewPlaceholder = var3.get(var2);
      }

      if (!this.viewPortalBound && this.viewPlaceholder != null) {
         var var5: FastestListSections.Entry = this.item;
         if (this.item == null) {
            q.y("item");
            var5 = null;
         }

         this.viewPlaceholder.onPlaceholderShouldBind(this.view, var5);
      }
   }

   public override fun getPortalViewIndex(portalView: View): Int {
      q.h(var1, "portalView");
      return this.view.indexOfChild(var1);
   }

   public open fun onBindViewHolder(item: Entry, horizontal: Boolean, placeholderConfig: FastestListPlaceholderConfig) {
      q.h(var1, "item");
      q.h(var3, "placeholderConfig");
      this.item = var1;
      this.horizontal = var2;
      this.viewPortalId = var1.getKey();
      this.updateLayoutParams(this.view, var1.getSize(), var2);
      this.updatePlaceholder(this.view, var3.getForEntry(var1));
      PortalFromJsContextManager.INSTANCE.addContext(var1.getKey(), this);
   }

   public override fun onPortalFromJsAdded(portalId: String, portalView: View) {
      q.h(var1, "portalId");
      q.h(var2, "portalView");
      if (q.c(this.viewPortalId, var1)) {
         this.viewPortalBound = true;
         if (this.viewPlaceholder != null) {
            this.viewPlaceholder.onPlaceholderShouldUnbind(this.view);
         }

         val var4: FrameLayout = this.view;
         var2.addOnLayoutChangeListener(this.viewPortalSizeValidator);
         var4.addView(var2);
      }
   }

   public override fun onPortalFromJsRemoved(portalId: String, portalView: View) {
      q.h(var1, "portalId");
      q.h(var2, "portalView");
      if (q.c(this.viewPortalId, var1)) {
         this.viewPortalBound = false;
         if (this.viewPlaceholder != null) {
            var var6: FastestListSections.Entry = this.item;
            if (this.item == null) {
               q.y("item");
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
         q.h(var2, "onUnexpectedItemSize");
         this.this$0 = var1;
         super();
         this.onUnexpectedItemSize = var2;
      }

      public open fun onLayoutChange(v: View, left: Int, top: Int, right: Int, bottom: Int, oldLeft: Int, oldTop: Int, oldRight: Int, oldBottom: Int) {
         q.h(var1, "v");
         var1.removeOnLayoutChangeListener(this);
         if (FastestListViewHolder.access$getHorizontal$p(this.this$0)) {
            var2 = var4 - var2;
         } else {
            var2 = var5 - var3;
         }

         var var11: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
         var var12: FastestListSections.Entry = var11;
         if (var11 == null) {
            q.y("item");
            var12 = null;
         }

         if (var2 < var12.getSize() - 1) {
            var11 = FastestListViewHolder.access$getItem$p(this.this$0);
            var var13: FastestListSections.Entry = var11;
            if (var11 == null) {
               q.y("item");
               var13 = null;
            }

            if (var2 > var13.getSize() + 1) {
               val var17: Function2 = this.onUnexpectedItemSize;
               var var14: FastestListSections.Entry = FastestListViewHolder.access$getItem$p(this.this$0);
               if (var14 == null) {
                  q.y("item");
                  var14 = null;
               }

               var17.invoke(var14, var2);
            }
         }
      }
   }
}
