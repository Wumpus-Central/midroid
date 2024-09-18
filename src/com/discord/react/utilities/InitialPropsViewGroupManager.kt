package com.discord.react.utilities

import android.view.View
import android.view.ViewGroup
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import java.util.HashMap
import java.util.LinkedHashSet
import kotlin.jvm.internal.q

public abstract class InitialPropsViewGroupManager<T extends ViewGroup> : ViewGroupManager<T> {
   private final val consumedInitialProps: MutableMap<Int, MutableSet<String>>
   private final var delegatedInitialProps: ReactStylesDiffMap = defaultInitialProps

   open fun InitialPropsViewGroupManager() {
      this.consumedInitialProps = new HashMap<>();
   }

   protected fun createViewInstance(reactTag: Int, reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap?, stateWrapper: StateWrapper?): Any {
      q.h(var2, "reactContext");
      val var5: ReactStylesDiffMap;
      if (var3 == null) {
         var5 = this.delegatedInitialProps;
      } else {
         var5 = var3;
      }

      this.delegatedInitialProps = var5;
      val var6: View = super.createViewInstance(var1, var2, var3, var4);
      q.g(var6, "createViewInstance(...)");
      return (T)var6;
   }

   protected fun createViewInstance(reactContext: ThemedReactContext): Any {
      q.h(var1, "reactContext");
      return this.createViewInstance(var1, this.delegatedInitialProps);
   }

   public abstract fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): Any {
   }

   protected fun Any.isInitialProp(propName: String): Boolean {
      q.h(var1, "<this>");
      q.h(var2, "propName");
      val var5: java.util.Map = this.consumedInitialProps;
      val var6: Int = var1.getId();
      val var4: Any = var5.get(var6);
      var var7: java.util.Set = (java.util.Set)var4;
      if (var4 == null) {
         var7 = new LinkedHashSet();
         var5.put(var6, var7);
      }

      var7 = var7;
      val var3: Boolean;
      if (!var7.contains(var2)) {
         var7.add(var2);
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public open fun onDropViewInstance(view: Any) {
      q.h(var1, "view");
      super.onDropViewInstance(var1);
      this.consumedInitialProps.remove(var1.getId());
   }

   public companion object {
      private final val defaultInitialProps: ReactStylesDiffMap
   }
}
