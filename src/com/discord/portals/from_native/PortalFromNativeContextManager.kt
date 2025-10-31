package com.discord.portals.from_native

import android.view.View
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import java.lang.ref.WeakReference
import java.util.LinkedHashMap
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import mp.f0

public object PortalFromNativeContextManager {
   private final var portalContextMap: MutableMap<Double, PortalFromNativeContext> = new LinkedHashMap()
   private final var _portalContextIdsFlow: MutableStateFlow<com.discord.portals.from_native.PortalFromNativeContextManager.Event?>
   public final val portalContextIdsFlow: Flow<com.discord.portals.from_native.PortalFromNativeContextManager.Event?>

   @JvmStatic
   fun {
      val var0: MutableStateFlow = f0.a(null);
      _portalContextIdsFlow = var0;
      portalContextIdsFlow = var0;
   }

   @JvmStatic
   fun `addPortal$lambda$0`(var0: View): Unit {
      return Unit.a;
   }

   @JvmStatic
   fun `addPortal$lambda$1`(var0: View): Unit {
      return Unit.a;
   }

   public fun addPortal(
      portal: Double,
      view: View,
      removeViewFromParent: (View) -> Unit,
      onViewAddedToPortal: (View) -> Unit = new a(),
      onViewRemovedFromPortal: (View) -> Unit = new b(),
      returnViewToParent: (View) -> Unit
   ) {
      if (portalContextMap.get(var1) == null) {
         portalContextMap.put(var1, new PortalFromNativeContext(new WeakReference<>(var3), var4, var5, var6, var7));
      }
   }

   public fun getView(portal: Double): View? {
      val var3: PortalFromNativeContext = portalContextMap.get(var1);
      if (var3 != null) {
         val var4: WeakReference = var3.getView();
         if (var4 != null) {
            return var4.get() as View;
         }
      }

      return null;
   }

   public fun isMediaViewBeingPortaled(portal: Double?): Boolean? {
      return if (portalContextMap.isEmpty()) null else portalContextMap.containsKey(var1);
   }

   public fun registerView(portal: Double, portalView: PortalHolderViewGroup, onViewRegistered: (() -> Unit)? = null) {
      val var5: PortalFromNativeContext = portalContextMap.get(var1);
      if (var5 != null) {
         val var6: View = var5.getView().get();
         if (var6 != null && !(var6.getParent() == var3)) {
            var5.getRemoveViewFromParent().invoke(var6);
            var3.addView(var6);
            ViewMeasureExtensionsKt.measureAndLayout(var3);
            if (var4 != null) {
               var4.invoke();
            }

            var5.getOnViewAddedToPortal().invoke(var6);
            _portalContextIdsFlow.setValue(PortalFromNativeContextManager.Event.PortalRegistered.INSTANCE);
         }
      }
   }

   public fun unregisterView(portal: Double) {
      val var4: PortalFromNativeContext = portalContextMap.remove(var1);
      if (var4 != null) {
         _portalContextIdsFlow.setValue(null);
         val var3: View = var4.getView().get();
         if (var3 != null) {
            var4.getRemoveViewFromParent().invoke(var3);
            var4.getOnViewRemovedFromPortal().invoke(var3);
            var4.getReturnViewToParent().invoke(var3);
         }
      }
   }

   public sealed class Event protected constructor() {
      public object PortalRegistered : PortalFromNativeContextManager.Event()
   }
}
