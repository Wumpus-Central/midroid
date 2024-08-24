package com.discord.portals.from_js

import android.view.View
import com.discord.portals.utils.ViewRemoveFromParentKt
import java.lang.ref.WeakReference
import java.util.HashMap
import kotlin.jvm.internal.r

public object PortalFromJsContextManager {
   private final val portalContexts: MutableMap<String, WeakReference<PortalFromJsContext>> = new HashMap()
   private final val portals: MutableMap<String, View> = new HashMap()

   private fun MutableMap<String, View>.addToContext(portalId: String) {
      val var3: WeakReference = portalContexts.get(var2);
      if (var3 != null) {
         val var5: PortalFromJsContext = var3.get() as PortalFromJsContext;
         if (var5 != null) {
            val var4: View = var1.get(var2) as View;
            if (var4 == null) {
               return;
            }

            var5.onPortalFromJsAdded(var2, var4);
         }
      }
   }

   private fun MutableMap<String, View>.removeFromContext(portalId: String) {
      val var4: View = var1.get(var2) as View;
      if (var4 != null) {
         val var5: WeakReference = portalContexts.get(var2);
         val var6: PortalFromJsContext;
         if (var5 != null) {
            var6 = var5.get() as PortalFromJsContext;
         } else {
            var6 = null;
         }

         val var3: Int;
         if (var6 != null) {
            var3 = var6.getPortalViewIndex(var4);
         } else {
            var3 = -1;
         }

         if (var6 != null && var3 != -1) {
            var6.onPortalFromJsRemoved(var2, var4);
         } else {
            ViewRemoveFromParentKt.removeFromParent(var4);
         }
      }
   }

   public fun addContext(portalId: String, portalContext: PortalFromJsContext) {
      r.h(var1, "portalId");
      r.h(var2, "portalContext");
      val var3: java.util.Map = portals;
      this.removeFromContext(portals, var1);
      portalContexts.put(var1, new WeakReference<>(var2));
      this.addToContext(var3, var1);
   }

   internal fun portalDidMount(portalId: String, portalView: View) {
      r.h(var1, "portalId");
      r.h(var2, "portalView");
      val var3: java.util.Map = portals;
      this.removeFromContext(portals, var1);
      var3.put(var1, var2);
      this.addToContext(var3, var1);
   }

   internal fun portalDidUnmount(portalId: String) {
      r.h(var1, "portalId");
      val var2: java.util.Map = portals;
      this.removeFromContext(portals, var1);
      var2.remove(var1);
   }

   public fun removeContext(portalId: String) {
      r.h(var1, "portalId");
      this.removeFromContext(portals, var1);
      portalContexts.remove(var1);
   }
}
