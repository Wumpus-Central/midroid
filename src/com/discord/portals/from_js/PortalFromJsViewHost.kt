package com.discord.portals.from_js

import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.accessibility.AccessibilityEvent
import com.facebook.react.views.view.ReactViewGroup
import java.util.ArrayList
import kotlin.jvm.internal.r

internal class PortalFromJsViewHost(context: Context) : ReactViewGroup {
   private final var childView: View?
   internal final lateinit var portalId: String
   private final var portalIdPrev: String?

   init {
      r.h(var1, "context");
      super(var1);
   }

   private fun addChildView(child: View) {
      this.childView = var1;
      this.childViewAdded(this.getPortalId$portals_release(), var1);
   }

   private fun childViewAdded(portalId: String, child: View) {
      PortalFromJsContextManager.INSTANCE.portalDidMount$portals_release(var1, var2);
   }

   private fun childViewRemoved(portalId: String) {
      PortalFromJsContextManager.INSTANCE.portalDidUnmount$portals_release(var1);
   }

   private fun removeChildView(): Unit? {
      var var1: Unit = null;
      if (this.childView != null) {
         this.childViewRemoved(this.getPortalId$portals_release());
         this.childView = null;
         var1 = Unit.a;
      }

      return var1;
   }

   public open fun addChildrenForAccessibility(outChildren: ArrayList<View>?) {
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      r.h(var1, "child");
      val var5: Boolean;
      if (this.childView == null) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         this.addChildView(var1);
      } else {
         val var4: java.lang.String = this.getPortalId$portals_release();
         val var6: StringBuilder = new StringBuilder();
         var6.append("Adding more than one child unsupported: ");
         var6.append(var4);
         throw new IllegalArgumentException(var6.toString().toString());
      }
   }

   public open fun dispatchPopulateAccessibilityEvent(event: AccessibilityEvent?): Boolean {
      return false;
   }

   public open fun getChildAt(index: Int): View {
      val var5: View = this.childView;
      val var2: Boolean;
      if (this.childView != null && var1 == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2) {
         return this.childView;
      } else {
         val var4: java.lang.String = this.getPortalId$portals_release();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Requesting non-existent child or invalid index: ");
         var3.append(var1);
         var3.append(", ");
         var3.append(var4);
         var3.append(", ");
         var3.append(var5);
         var3.append(".");
         throw new IllegalArgumentException(var3.toString().toString());
      }
   }

   public open fun getChildCount(): Int {
      val var1: Byte;
      if (this.childView != null) {
         var1 = 1;
      } else {
         var1 = 0;
      }

      return var1;
   }

   public fun onAfterUpdateTransaction() {
      if (this.portalIdPrev != null) {
         this.childViewRemoved(this.portalIdPrev);
         val var2: java.lang.String = this.getPortalId$portals_release();
         val var3: View = this.childView;
         r.e(this.childView);
         this.childViewAdded(var2, var3);
         this.portalIdPrev = null;
      }
   }

   public open fun removeAllViews() {
      this.removeChildView();
   }

   public open fun removeViewAt(index: Int) {
      this.removeChildView();
   }

   public fun setPortalId(portalId: String) {
      r.h(var1, "portalId");
      if (this.portalId == null) {
         this.setPortalId$portals_release(var1);
      } else if (!r.c(this.getPortalId$portals_release(), var1)) {
         this.portalIdPrev = this.getPortalId$portals_release();
         this.setPortalId$portals_release(var1);
      }
   }
}
