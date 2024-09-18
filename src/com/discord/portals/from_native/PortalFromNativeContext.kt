package com.discord.portals.from_native

import android.view.View
import java.lang.ref.WeakReference
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

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
      q.h(var1, "view");
      q.h(var2, "removeViewFromParent");
      q.h(var3, "onViewAddedToPortal");
      q.h(var4, "onViewRemovedFromPortal");
      q.h(var5, "returnViewToParent");
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
      q.h(var1, "view");
      q.h(var2, "removeViewFromParent");
      q.h(var3, "onViewAddedToPortal");
      q.h(var4, "onViewRemovedFromPortal");
      q.h(var5, "returnViewToParent");
      return new PortalFromNativeContext(var1, var2, var3, var4, var5);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is PortalFromNativeContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.view, var1.view)) {
            return false;
         } else if (!q.c(this.removeViewFromParent, var1.removeViewFromParent)) {
            return false;
         } else if (!q.c(this.onViewAddedToPortal, var1.onViewAddedToPortal)) {
            return false;
         } else if (!q.c(this.onViewRemovedFromPortal, var1.onViewRemovedFromPortal)) {
            return false;
         } else {
            return q.c(this.returnViewToParent, var1.returnViewToParent);
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
      val var5: WeakReference = this.view;
      val var4: Function1 = this.removeViewFromParent;
      val var1: Function1 = this.onViewAddedToPortal;
      val var2: Function1 = this.onViewRemovedFromPortal;
      val var3: Function1 = this.returnViewToParent;
      val var6: StringBuilder = new StringBuilder();
      var6.append("PortalFromNativeContext(view=");
      var6.append(var5);
      var6.append(", removeViewFromParent=");
      var6.append(var4);
      var6.append(", onViewAddedToPortal=");
      var6.append(var1);
      var6.append(", onViewRemovedFromPortal=");
      var6.append(var2);
      var6.append(", returnViewToParent=");
      var6.append(var3);
      var6.append(")");
      return var6.toString();
   }
}
