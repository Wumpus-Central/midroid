package com.discord.portals.from_native

import android.view.View
import java.lang.ref.WeakReference
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r

internal data class PortalFromNativeContext(view: WeakReference<View>,
   removeViewFromParent: (View) -> Unit,
   onViewAddedToPortal: (View) -> Unit,
   onViewRemovedFromPortal: (View) -> Unit,
   returnViewToParent: (View) -> Unit
) {
   public final val onViewAddedToPortal: (View) -> Unit
   public final val onViewRemovedFromPortal: (View) -> Unit
   public final val removeViewFromParent: (View) -> Unit
   public final val returnViewToParent: (View) -> Unit
   public final val view: WeakReference<View>

   init {
      r.h(var1, "view");
      r.h(var2, "removeViewFromParent");
      r.h(var3, "onViewAddedToPortal");
      r.h(var4, "onViewRemovedFromPortal");
      r.h(var5, "returnViewToParent");
      super();
      this.view = var1;
      this.removeViewFromParent = var2;
      this.onViewAddedToPortal = var3;
      this.onViewRemovedFromPortal = var4;
      this.returnViewToParent = var5;
   }

   public operator fun component1(): WeakReference<View> {
      return this.view;
   }

   public operator fun component2(): (View) -> Unit {
      return this.removeViewFromParent;
   }

   public operator fun component3(): (View) -> Unit {
      return this.onViewAddedToPortal;
   }

   public operator fun component4(): (View) -> Unit {
      return this.onViewRemovedFromPortal;
   }

   public operator fun component5(): (View) -> Unit {
      return this.returnViewToParent;
   }

   public fun copy(
      view: WeakReference<View> = var0.view,
      removeViewFromParent: (View) -> Unit = var0.removeViewFromParent,
      onViewAddedToPortal: (View) -> Unit = var0.onViewAddedToPortal,
      onViewRemovedFromPortal: (View) -> Unit = var0.onViewRemovedFromPortal,
      returnViewToParent: (View) -> Unit = var0.returnViewToParent
   ): PortalFromNativeContext {
      r.h(var1, "view");
      r.h(var2, "removeViewFromParent");
      r.h(var3, "onViewAddedToPortal");
      r.h(var4, "onViewRemovedFromPortal");
      r.h(var5, "returnViewToParent");
      return new PortalFromNativeContext(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalFromNativeContext) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.view, var1.view)) {
            return false;
         } else if (!r.c(this.removeViewFromParent, var1.removeViewFromParent)) {
            return false;
         } else if (!r.c(this.onViewAddedToPortal, var1.onViewAddedToPortal)) {
            return false;
         } else if (!r.c(this.onViewRemovedFromPortal, var1.onViewRemovedFromPortal)) {
            return false;
         } else {
            return r.c(this.returnViewToParent, var1.returnViewToParent);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               ((this.view.hashCode() * 31 + this.removeViewFromParent.hashCode()) * 31 + this.onViewAddedToPortal.hashCode()) * 31
                  + this.onViewRemovedFromPortal.hashCode()
            )
            * 31
         + this.returnViewToParent.hashCode();
   }

   public override fun toString(): String {
      val var4: WeakReference = this.view;
      val var2: Function1 = this.removeViewFromParent;
      val var1: Function1 = this.onViewAddedToPortal;
      val var5: Function1 = this.onViewRemovedFromPortal;
      val var6: Function1 = this.returnViewToParent;
      val var3: StringBuilder = new StringBuilder();
      var3.append("PortalFromNativeContext(view=");
      var3.append(var4);
      var3.append(", removeViewFromParent=");
      var3.append(var2);
      var3.append(", onViewAddedToPortal=");
      var3.append(var1);
      var3.append(", onViewRemovedFromPortal=");
      var3.append(var5);
      var3.append(", returnViewToParent=");
      var3.append(var6);
      var3.append(")");
      return var3.toString();
   }
}
