package com.discord.react.utilities

import android.view.ViewGroup
import com.facebook.react.uimanager.ReactStylesDiffMap
import com.facebook.react.uimanager.StateWrapper
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import java.util.HashMap
import java.util.LinkedHashSet
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nInitialPropsViewGroupManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitialPropsViewGroupManager.kt\ncom/discord/react/utilities/InitialPropsViewGroupManager\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,55:1\n381#2,7:56\n*S KotlinDebug\n*F\n+ 1 InitialPropsViewGroupManager.kt\ncom/discord/react/utilities/InitialPropsViewGroupManager\n*L\n41#1:56,7\n*E\n"])
public abstract class InitialPropsViewGroupManager<T extends ViewGroup> : ViewGroupManager<T> {
   private final var delegatedInitialProps: ReactStylesDiffMap = defaultInitialProps
   private final val consumedInitialProps: MutableMap<Int, MutableSet<String>>

   open fun InitialPropsViewGroupManager() {
      this.consumedInitialProps = new HashMap<>();
   }

   protected fun createViewInstance(reactTag: Int, reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap?, stateWrapper: StateWrapper?): Any {
      val var5: ReactStylesDiffMap;
      if (var3 == null) {
         var5 = this.delegatedInitialProps;
      } else {
         var5 = var3;
      }

      this.delegatedInitialProps = var5;
      return (T)super.createViewInstance(var1, var2, var3, var4);
   }

   protected fun createViewInstance(reactContext: ThemedReactContext): Any {
      return this.createViewInstance(var1, this.delegatedInitialProps);
   }

   public abstract fun createViewInstance(reactContext: ThemedReactContext, initialProps: ReactStylesDiffMap): Any {
   }

   protected fun Any.isInitialProp(propName: String): Boolean {
      val var4: java.util.Map = this.consumedInitialProps;
      val var5: Int = var1.getId();
      val var3: Any = var4.get(var5);
      var var6: java.util.Set = (java.util.Set)var3;
      if (var3 == null) {
         var6 = new LinkedHashSet();
         var4.put(var5, var6);
      }

      var6 = var6;
      if (!var6.contains(var2)) {
         var6.add(var2);
         return true;
      } else {
         return false;
      }
   }

   public open fun onDropViewInstance(view: Any) {
      super.onDropViewInstance((T)var1);
      this.consumedInitialProps.remove(var1.getId());
   }

   public companion object {
      private final val defaultInitialProps: ReactStylesDiffMap
   }
}
