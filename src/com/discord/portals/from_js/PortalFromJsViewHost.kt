package com.discord.portals.from_js

import Da.v
import android.content.Context
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.view.accessibility.AccessibilityEvent
import com.discord.crash_reporting.CrashReporting
import com.discord.portals.utils.StacktraceUtilsKt
import com.facebook.react.views.view.ReactViewGroup
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPortalFromJsViewHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PortalFromJsViewHost.kt\ncom/discord/portals/from_js/PortalFromJsViewHost\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,262:1\n295#2,2:263\n*S KotlinDebug\n*F\n+ 1 PortalFromJsViewHost.kt\ncom/discord/portals/from_js/PortalFromJsViewHost\n*L\n197#1:263,2\n*E\n"])
internal class PortalFromJsViewHost(context: Context) : ReactViewGroup(var1) {
   private final var portalId: String?
   private final var portalIdPrev: String?
   private final var childView: View?
   private final var otherViews: MutableMap<Int, View> = new LinkedHashMap()

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
         val var8: Pair = v.a("prevPortalId", var11);
         val var9: Pair = v.a("child", var1.toString());
         val var7: Pair = v.a("index", java.lang.String.valueOf(var2));
         val var12: java.lang.String;
         if (this.childView == null) {
            var12 = "true";
         } else {
            var12 = "false";
         }

         CrashReporting.addBreadcrumb$default(
            var17,
            var19,
            O.m(new Pair[]{var14, var8, var9, var7, v.a("childViewIsNull", var12), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
            "portal",
            null,
            8,
            null
         );
         this.otherViews.put(var2, var1);
      } else {
         if (this.childView == var1) {
            CrashReporting.addBreadcrumb$default(
               CrashReporting.INSTANCE,
               "Same child added again",
               O.m(
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
               O.m(
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
               O.m(
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
            var20, "About to crash from getChildAt", O.m(new Pair[]{var9, var19, var14, v.a("childViewIsNull", var4)}), "portal", null, 8, null
         );
         throw new IllegalArgumentException(var3);
      } else {
         if (var1 > 0) {
            val var8: CrashReporting = CrashReporting.INSTANCE;
            val var7: Pair = v.a("index", java.lang.String.valueOf(var1));
            var3 = this.portalId;
            if (this.portalId == null) {
               var3 = "";
            }

            val var15: Pair = v.a("portalId", var3);
            var3 = this.portalIdPrev;
            if (this.portalIdPrev == null) {
               var3 = "";
            }

            val var12: Pair = v.a("prevPortalId", var3);
            if (this.childView == null) {
               var4 = "true";
            }

            CrashReporting.addBreadcrumb$default(
               var8,
               "getChildAt of non-zero index",
               O.m(new Pair[]{var7, var15, var12, v.a("childViewIsNull", var4), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
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
            var13 = this.otherViews.get(var1);
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
         val var3: java.util.Iterator = this.otherViews.entrySet().iterator();

         while (true) {
            if (!var3.hasNext()) {
               var4 = null;
               break;
            }

            val var2: Any = var3.next();
            if ((var2 as Entry).getValue() == var1) {
               var4 = var2;
               break;
            }
         }

         val var5: Entry = var4 as Entry;
         if (var4 as Entry != null) {
            var1 = this.otherViews.remove(var5.getKey());
         }
      }
   }

   public open fun removeViewAt(index: Int) {
      if (var1 > 0) {
         val var5: CrashReporting = CrashReporting.INSTANCE;
         val var6: Pair = v.a("index", java.lang.String.valueOf(var1));
         var var2: java.lang.String = this.portalId;
         if (this.portalId == null) {
            var2 = "";
         }

         val var7: Pair = v.a("portalId", var2);
         var2 = this.portalIdPrev;
         if (this.portalIdPrev == null) {
            var2 = "";
         }

         val var16: Pair = v.a("prevPortalId", var2);
         if (this.childView == null) {
            var2 = "true";
         } else {
            var2 = "false";
         }

         CrashReporting.addBreadcrumb$default(
            var5,
            "removeViewAt of non-zero index",
            O.m(new Pair[]{var6, var7, var16, v.a("childViewIsNull", var2), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
            "portal",
            null,
            8,
            null
         );
      }

      if (var1 == 0) {
         if (!this.otherViews.isEmpty()) {
            val var19: CrashReporting = CrashReporting.INSTANCE;
            var var10: java.lang.String = this.portalId;
            if (this.portalId == null) {
               var10 = "";
            }

            val var18: Pair = v.a("portalId", var10);
            var10 = this.portalIdPrev;
            if (this.portalIdPrev == null) {
               var10 = "";
            }

            var var20: Pair;
            label39: {
               var20 = v.a("prevPortalId", var10);
               if (this.childView != null) {
                  val var14: java.lang.String = this.childView.toString();
                  var10 = var14;
                  if (var14 != null) {
                     break label39;
                  }
               }

               var10 = "null";
            }

            CrashReporting.addBreadcrumb$default(
               var19,
               "removeViewAt of index 0 even though children with index > 0 exist",
               O.m(new Pair[]{var18, var20, v.a("childView", var10), v.a("stacktrace", StacktraceUtilsKt.getCurrentStacktraceString())}),
               "portal",
               null,
               8,
               null
            );
         }

         this.removeChildView();
      } else {
         this.otherViews.remove(var1);
      }
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
