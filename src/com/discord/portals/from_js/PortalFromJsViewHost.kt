package com.discord.portals.from_js

import B9.s
import android.content.Context
import android.graphics.Canvas
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.accessibility.AccessibilityEvent
import com.discord.crash_reporting.CrashReporting
import com.facebook.react.views.view.ReactViewGroup
import java.util.ArrayList

internal class PortalFromJsViewHost(context: Context) : ReactViewGroup(var1) {
   private final var portalId: String?
   private final var portalIdPrev: String?
   private final var childView: View?

   private fun addChildView(child: View) {
      this.childView = var1;
      val var2: java.lang.String = this.portalId;
      this.childViewAdded(var2, var1);
   }

   private fun childViewAdded(portalId: String, child: View) {
      PortalFromJsContextManager.INSTANCE.portalDidMount$portals_release(var1, var2);
   }

   private fun childViewRemoved(portalId: String) {
      PortalFromJsContextManager.INSTANCE.portalDidUnmount$portals_release(var1);
   }

   private fun childViewValid(): Boolean {
      val var3: View = this.childView;
      var var1: Boolean = false;
      if (this.childView != null) {
         var1 = false;
         if (this.childView.isAttachedToWindow()) {
            var1 = false;
            if (var3.getLayoutParams() != null) {
               var1 = true;
            }
         }
      }

      return var1;
   }

   private fun removeChildView(): Unit? {
      var var1: Unit = null;
      if (this.childView != null) {
         val var3: java.lang.String = this.portalId;
         this.childViewRemoved(var3);
         this.childView = null;
         var1 = Unit.a;
      }

      return var1;
   }

   public open fun addChildrenForAccessibility(outChildren: ArrayList<View>?) {
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      var var4: java.lang.String = "";
      var var7: java.lang.String = this.portalIdPrev;
      if (this.portalIdPrev == null) {
         var7 = "";
      }

      if (this.portalId != null) {
         var4 = this.portalId;
      }

      if (this.childView == var1) {
         CrashReporting.INSTANCE
            .addBreadcrumb(
               "Same child added again",
               L.l(new Pair[]{s.a("portalId", var4), s.a("prevPortalId", var7), s.a("child", var1.toString()), s.a("index", java.lang.String.valueOf(var2))}),
               "portal"
            );
      } else if (!this.childViewValid()) {
         this.removeChildView();
         CrashReporting.INSTANCE
            .addBreadcrumb(
               "childView not valid before addView",
               L.l(new Pair[]{s.a("portalId", var4), s.a("prevPortalId", var7), s.a("child", var1.toString()), s.a("index", java.lang.String.valueOf(var2))}),
               "portal"
            );
      }

      if (this.childView != null) {
         CrashReporting.INSTANCE
            .addBreadcrumb(
               "Attempting to add different child when one already exists",
               L.l(
                  new Pair[]{
                     s.a("portalId", var4),
                     s.a("prevPortalId", var7),
                     s.a("existing", java.lang.String.valueOf(this.childView)),
                     s.a("new", var1.toString()),
                     s.a("index", java.lang.String.valueOf(var2))
                  }
               ),
               "portal_error"
            );
      }

      if (this.childView == null) {
         this.addChildView(var1);
      } else {
         val var6: java.lang.String = this.portalId;
         val var8: StringBuilder = new StringBuilder();
         var8.append("Adding more than one child unsupported: ");
         var8.append(var6);
         throw new IllegalArgumentException(var8.toString().toString());
      }
   }

   protected open fun dispatchDraw(canvas: Canvas) {
      if (!this.childViewValid()) {
         CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "childView not valid before dispatchDraw", null, "portal", 2, null);
      }

      super.dispatchDraw(var1);
   }

   public open fun dispatchPopulateAccessibilityEvent(event: AccessibilityEvent?): Boolean {
      return false;
   }

   public open fun getChildAt(index: Int): View {
      val var2: View = this.childView;
      if (this.childView != null && var1 == 0) {
         return this.childView;
      } else {
         val var3: java.lang.String = this.portalId;
         val var4: StringBuilder = new StringBuilder();
         var4.append("Requesting non-existent child or invalid index: ");
         var4.append(var1);
         var4.append(", ");
         var4.append(var3);
         var4.append(", ");
         var4.append(var2);
         var4.append(".");
         throw new IllegalArgumentException(var4.toString().toString());
      }
   }

   public open fun getChildCount(): Int {
      return this.childViewValid();
   }

   public fun onAfterUpdateTransaction() {
      if (this.portalIdPrev != null) {
         this.childViewRemoved(this.portalIdPrev);
         val var2: View = this.childView;
         if (this.childView != null) {
            val var3: java.lang.String = this.portalId;
            this.childViewAdded(var3, var2);
         }

         this.portalIdPrev = null;
      }
   }

   public fun onDropViewInstance() {
      var var1: java.lang.String = this.portalIdPrev;
      if (this.portalIdPrev != null) {
         this.childViewRemoved(var1);
      } else {
         var1 = this.portalId;
         if (this.portalId != null) {
            this.childViewRemoved(var1);
         }
      }

      this.childView = null;
      this.portalIdPrev = null;
      this.portalId = null;
   }

   public open fun removeAllViews() {
      this.removeChildView();
   }

   public open fun removeView(view: View?) {
      this.removeChildView();
   }

   public open fun removeViewAt(index: Int) {
      this.removeChildView();
   }

   public fun setPortalId(portalId: String) {
      if (this.portalId == null) {
         this.portalId = var1;
      } else if (!(this.portalId == var1)) {
         this.portalIdPrev = this.portalId;
         this.portalId = var1;
      }
   }
}
