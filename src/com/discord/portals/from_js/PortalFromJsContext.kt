package com.discord.portals.from_js

import android.view.View

public interface PortalFromJsContext {
   public abstract fun getPortalViewIndex(portalView: View): Int {
   }

   public abstract fun onPortalFromJsAdded(portalId: String, portalView: View) {
   }

   public abstract fun onPortalFromJsRemoved(portalId: String, portalView: View) {
   }
}
