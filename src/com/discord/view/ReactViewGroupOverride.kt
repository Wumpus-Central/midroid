package com.discord.view

import android.annotation.SuppressLint
import android.view.View
import com.discord.R.id
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.views.view.ReactViewGroup

@SuppressLint(["ViewConstructor"])
public class ReactViewGroupOverride(context: ThemedReactContext) : ReactViewGroup(var1) {
   public override fun endViewTransition(view: View) {
      super.endViewTransition(var1);
      var1.setTag(id.view_is_transitioning, java.lang.Boolean.FALSE);
   }

   public open fun startViewTransition(view: View?) {
      super.startViewTransition(var1);
      if (var1 != null) {
         var1.setTag(id.view_is_transitioning, java.lang.Boolean.TRUE);
      }
   }
}
