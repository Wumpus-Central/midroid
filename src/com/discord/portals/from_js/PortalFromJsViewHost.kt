package com.discord.portals.from_js

import android.content.Context
import android.graphics.Canvas
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.accessibility.AccessibilityEvent
import com.discord.crash_reporting.CrashReporting
import com.discord.crash_reporting.CrashReporting.ErrorLevel
import com.discord.portals.utils.StacktraceUtilsKt
import com.facebook.react.views.view.ReactViewGroup
import fm.v
import java.util.ArrayList
import kotlin.jvm.internal.TypeIntrinsics

internal class PortalFromJsViewHost(context: Context) : ReactViewGroup(var1) {
   private final var portalId: String?
   private final var portalIdPrev: String?
   private final var childView: View?
   private final var otherViews: ArrayList<View> = new ArrayList()

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
      val var1: View = this.childView;
      return this.childView != null && this.childView.isAttachedToWindow() && var1.getLayoutParams() != null;
   }

   private fun removeChildView(): Unit? {
      if (this.childView != null) {
         val var1: java.lang.String = this.portalId;
         this.childViewRemoved(var1);
         this.childView = null;
         return Unit.a;
      } else {
         return null;
      }
   }

   private fun replaceChildViewWithNextAvailableChild() {
      if (this.childView != null) {
         if (this.portalId == null) {
            return;
         }

         this.childViewRemoved(this.portalId);
      }

      this.addChildView(CollectionsKt.j0(this.otherViews) as View);
      this.otherViews.remove(0);
   }

   public open fun addChildrenForAccessibility(outChildren: ArrayList<View>) {
   }

   public open fun addView(child: View, index: Int, params: LayoutParams?) {
      var var4: java.lang.String = "";
      var var11: java.lang.String = this.portalIdPrev;
      if (this.portalIdPrev == null) {
         var11 = "";
      }

      if (this.portalId != null) {
         var4 = this.portalId;
      }

      if (var2 != 0) {
         val var17: CrashReporting = CrashReporting.INSTANCE;
         val var18: StringBuilder = new StringBuilder();
         var18.append("Non-zero index child added ");
         var18.append(var2);
         val var19: java.lang.String = var18.toString();
         val var14: Pair = v.a("portalId", var4);
         val var7: Pair = v.a("prevPortalId", var11);
         val var9: Pair = v.a("child", var1.toString());
         val var8: Pair = v.a("index", java.lang.String.valueOf(var2));
         val var12: java.lang.String;
         if (this.childView == null) {
            var12 = "true";
         } else {
            var12 = "false";
         }

         CrashReporting.addBreadcrumb$default(
            var17,
            var19,
            n0.m(new Pair[]{var14, var7, var9, var8, v.a("childViewIsNull", var12), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
            "portal",
            null,
            8,
            null
         );
         this.otherViews.add(var1);
      } else {
         if (this.childView == var1) {
            CrashReporting.addBreadcrumb$default(
               CrashReporting.INSTANCE,
               "Same child added again",
               n0.m(
                  new Pair[]{
                     v.a("portalId", var4),
                     v.a("prevPortalId", var11),
                     v.a("child", var1.toString()),
                     v.a("index", java.lang.String.valueOf(var2)),
                     v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())
                  }
               ),
               "portal",
               null,
               8,
               null
            );
         } else if (this.childView != null && !this.childViewValid()) {
            this.removeChildView();
            val var16: CrashReporting = CrashReporting.INSTANCE;
            val var6: StringBuilder = new StringBuilder();
            var6.append("childView not valid before addView ");
            var6.append(var4);
            CrashReporting.addBreadcrumb$default(
               var16,
               var6.toString(),
               n0.m(
                  new Pair[]{
                     v.a("portalId", var4),
                     v.a("prevPortalId", var11),
                     v.a("child", var1.toString()),
                     v.a("index", java.lang.String.valueOf(var2)),
                     v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())
                  }
               ),
               "portal",
               null,
               8,
               null
            );
         }

         if (this.childView != null) {
            CrashReporting.addBreadcrumb$default(
               CrashReporting.INSTANCE,
               "Attempting to add different child when one already exists",
               n0.m(
                  new Pair[]{
                     v.a("portalId", var4),
                     v.a("prevPortalId", var11),
                     v.a("existing", java.lang.String.valueOf(this.childView)),
                     v.a("new", var1.toString()),
                     v.a("index", java.lang.String.valueOf(var2)),
                     v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())
                  }
               ),
               "portal_error",
               null,
               8,
               null
            );
         }

         if (this.childView == null) {
            this.addChildView(var1);
         } else {
            var4 = this.portalId;
            val var10: StringBuilder = new StringBuilder();
            var10.append("Adding more than one child unsupported: ");
            var10.append(var4);
            var10.append(", previous: ");
            var10.append(var11);
            throw new IllegalArgumentException(var10.toString().toString());
         }
      }
   }

   protected override fun dispatchDraw(canvas: Canvas) {
      try {
         super.dispatchDraw(var1);
      } catch (var10: NullPointerException) {
         val var8: CrashReporting = CrashReporting.INSTANCE;
         val var7: Pair = v.a("context", "PortalFromJsViewHost.dispatchDraw");
         val var9: Pair = v.a("childCount", java.lang.String.valueOf(this.getChildCount()));
         val var2: Boolean;
         if (this.childView == null) {
            var2 = true;
         } else {
            var2 = false;
         }

         val var6: Pair = v.a("childViewIsNull", java.lang.String.valueOf(var2));
         var var11: java.lang.String = this.portalId;
         if (this.portalId == null) {
            var11 = "null";
         }

         val var13: Pair = v.a("portalId", var11);
         var var12: java.lang.String = this.portalIdPrev;
         if (this.portalIdPrev == null) {
            var12 = "null";
         }

         CrashReporting.addBreadcrumb$default(
            var8, "PortalFromJsViewHost.dispatchDraw NPE", n0.m(new Pair[]{var7, var9, var6, var13, v.a("prevPortalId", var12)}), null, null, 12, null
         );
         throw var10;
      }
   }

   public open fun dispatchPopulateAccessibilityEvent(event: AccessibilityEvent?): Boolean {
      return false;
   }

   public open fun getChildAt(index: Int): View {
      var var5: java.lang.String = "";
      var var3: java.lang.String;
      if (var1 == 0 && this.childView == null) {
         var3 = "Requesting portaled view when it's null.";
      } else if (var1 >= this.getChildCount()) {
         var3 = "Requesting invalid index.";
      } else {
         var3 = "";
      }

      val var2: Boolean = StringsKt.c0(var3);
      var var4: java.lang.String = "false";
      if (!var2) {
         val var20: CrashReporting = CrashReporting.INSTANCE;
         val var9: Pair = v.a("index", java.lang.String.valueOf(var1));
         var var16: java.lang.String = this.portalId;
         if (this.portalId == null) {
            var16 = "";
         }

         val var19: Pair = v.a("portalId", var16);
         if (this.portalIdPrev != null) {
            var5 = this.portalIdPrev;
         }

         val var14: Pair = v.a("prevPortalId", var5);
         if (this.childView == null) {
            var4 = "true";
         }

         CrashReporting.addBreadcrumb$default(
            var20, "About to crash from getChildAt", n0.m(new Pair[]{var9, var19, var14, v.a("childViewIsNull", var4)}), "portal", null, 8, null
         );
         throw new IllegalArgumentException(var3);
      } else {
         if (var1 > 0) {
            val var7: CrashReporting = CrashReporting.INSTANCE;
            val var8: Pair = v.a("index", java.lang.String.valueOf(var1));
            var3 = this.portalId;
            if (this.portalId == null) {
               var3 = "";
            }

            val var15: Pair = v.a("portalId", var3);
            if (this.portalIdPrev != null) {
               var5 = this.portalIdPrev;
            }

            val var12: Pair = v.a("prevPortalId", var5);
            if (this.childView == null) {
               var4 = "true";
            }

            CrashReporting.addBreadcrumb$default(
               var7,
               "getChildAt of non-zero index",
               n0.m(new Pair[]{var8, var15, var12, v.a("childViewIsNull", var4), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
               "portal",
               null,
               8,
               null
            );
         }

         val var13: View;
         if (var1 == 0) {
            var13 = this.childView;
         } else {
            var13 = this.otherViews.get(var1 - 1);
         }

         return var13;
      }
   }

   public open fun getChildCount(): Int {
      val var1: Byte;
      if (this.childView != null) {
         var1 = 1;
      } else {
         var1 = 0;
      }

      return var1 + this.otherViews.size();
   }

   public fun onAfterUpdateTransaction() {
      if (this.portalIdPrev != null) {
         this.childViewRemoved(this.portalIdPrev);
         val var3: View = this.childView;
         if (this.childView != null) {
            val var2: java.lang.String = this.portalId;
            this.childViewAdded(var2, var3);
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
      this.otherViews.clear();
      this.portalIdPrev = null;
      this.portalId = null;
   }

   public open fun removeAllViews() {
      this.otherViews.clear();
      this.removeChildView();
   }

   public open fun removeView(view: View?) {
      if (var1 == this.childView) {
         this.removeChildView();
      } else {
         TypeIntrinsics.asMutableCollection(this.otherViews).remove(var1);
      }
   }

   public open fun removeViewAt(index: Int) {
      var var2: java.lang.String = "";
      if (var1 > 0) {
         val var16: CrashReporting = CrashReporting.INSTANCE;
         val var17: Pair = v.a("index", java.lang.String.valueOf(var1));
         var var11: java.lang.String = this.portalId;
         if (this.portalId == null) {
            var11 = "";
         }

         val var15: Pair = v.a("portalId", var11);
         if (this.portalIdPrev != null) {
            var2 = this.portalIdPrev;
         }

         CrashReporting.addBreadcrumb$default(
            var16, "removeViewAt of non-zero index", n0.m(new Pair[]{var17, var15, v.a("prevPortalId", var2)}), null, null, 12, null
         );
         this.otherViews.remove(var1 - 1);
      } else if (var1 == 0 && !this.otherViews.isEmpty()) {
         val var5: CrashReporting = CrashReporting.INSTANCE;
         var var3: java.lang.String = this.portalId;
         if (this.portalId == null) {
            var3 = "";
         }

         val var13: Pair = v.a("portalId", var3);
         if (this.portalIdPrev != null) {
            var2 = this.portalIdPrev;
         }

         var var6: Pair;
         label32: {
            var6 = v.a("prevPortalId", var2);
            if (this.childView != null) {
               var3 = this.childView.toString();
               var2 = var3;
               if (var3 != null) {
                  break label32;
               }
            }

            var2 = "null";
         }

         CrashReporting.addBreadcrumb$default(
            var5,
            "removeViewAt of index 0 even though children with index > 0 exist. Switching to next available child (index 1).",
            n0.m(
               new Pair[]{
                  var13,
                  var6,
                  v.a("childView", var2),
                  v.a("otherViewsSize", java.lang.String.valueOf(this.otherViews.size())),
                  v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())
               }
            ),
            "portal_error",
            null,
            8,
            null
         );
         var5.captureMessage(
            "PortalFromJsViewHost",
            "removeViewAt of index 0 even though children with index > 0 exist. Switching to next available child (index 1).",
            ErrorLevel.WARNING
         );
         this.replaceChildViewWithNextAvailableChild();
      } else {
         this.removeChildView();
      }
   }

   public fun setPortalId(portalId: String) {
      if (this.portalId == null) {
         this.portalId = var1;
      } else {
         if (!(this.portalId == var1)) {
            this.portalIdPrev = this.portalId;
            this.portalId = var1;
         }
      }
   }
}
