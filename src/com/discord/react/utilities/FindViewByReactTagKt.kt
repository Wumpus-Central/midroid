package com.discord.react.utilities

import android.view.View
import com.facebook.react.bridge.ReactContext
import com.facebook.react.uimanager.IllegalViewOperationException
import com.facebook.react.uimanager.NativeViewHierarchyManager
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer
import com.facebook.react.uimanager.UIImplementation
import com.facebook.react.uimanager.UIManagerModule
import com.facebook.react.uimanager.UIViewOperationQueue
import java.lang.reflect.Field
import kotlin.jvm.internal.q

private const val REACT_UPDATED_ERROR: String =
   "\n        findViewByReactTag failed likely due to a changed React Native internal implementation\n        from a version bump, please inspect this method and update as needed.\n    "

private fun ReactContext.findViewByReactTag(tag: Int): View {
   val var3: UIManagerModule = var0.getNativeModule(UIManagerModule.class) as UIManagerModule;
   if (var3 != null) {
      var var2: UIImplementation = var3.getUIImplementation();
      if (var2 != null) {
         val var4: Class;
         if (var2.getClass().getSuperclass() === UIImplementation::class.java) {
            var4 = var2.getClass().getSuperclass();
         } else {
            var4 = var2.getClass();
         }

         val var5: Field = var4.getDeclaredField("mNativeViewHierarchyOptimizer");
         var5.setAccessible(true);
         var2 = (UIImplementation)var5.get(var2);
         if (var2 is NativeViewHierarchyOptimizer) {
            val var15: NativeViewHierarchyOptimizer = var2 as NativeViewHierarchyOptimizer;
            val var7: Class;
            if ((var2 as NativeViewHierarchyOptimizer).getClass().getSuperclass() === NativeViewHierarchyOptimizer::class.java) {
               var7 = var15.getClass().getSuperclass();
            } else {
               var7 = var15.getClass();
            }

            val var8: Field = var7.getDeclaredField("mUIViewOperationQueue");
            var8.setAccessible(true);
            var2 = (UIImplementation)var8.get(var15);
            if (var2 is UIViewOperationQueue) {
               val var17: UIViewOperationQueue = var2 as UIViewOperationQueue;
               val var10: Class;
               if ((var2 as UIViewOperationQueue).getClass().getSuperclass() === UIViewOperationQueue::class.java) {
                  var10 = var17.getClass().getSuperclass();
               } else {
                  var10 = var17.getClass();
               }

               val var11: Field = var10.getDeclaredField("mNativeViewHierarchyManager");
               var11.setAccessible(true);
               var var12: View = (View)var11.get(var17);
               if (var12 is NativeViewHierarchyManager) {
                  var12 = (var12 as NativeViewHierarchyManager).resolveView(var1);
                  q.g(var12, "resolveView(...)");
                  return var12;
               } else {
                  val var18: StringBuilder = new StringBuilder();
                  var18.append("Field ");
                  var18.append(var12);
                  var18.append(" not instance of ");
                  var18.append(NativeViewHierarchyManager::class.java);
                  var18.append(".");
                  throw new IllegalStateException(var18.toString().toString());
               }
            } else {
               val var9: StringBuilder = new StringBuilder();
               var9.append("Field ");
               var9.append(var2);
               var9.append(" not instance of ");
               var9.append(UIViewOperationQueue::class.java);
               var9.append(".");
               throw new IllegalStateException(var9.toString().toString());
            }
         } else {
            val var6: StringBuilder = new StringBuilder();
            var6.append("Field ");
            var6.append(var2);
            var6.append(" not instance of ");
            var6.append(NativeViewHierarchyOptimizer::class.java);
            var6.append(".");
            throw new IllegalStateException(var6.toString().toString());
         }
      } else {
         throw new IllegalStateException("Unable to resolve UIImplementation".toString());
      }
   } else {
      throw new IllegalStateException("Unable to resolve UIManagerModule".toString());
   }
}

public fun ReactContext.findViewByReactTag(tag: Int, onError: (Exception) -> Unit): View? {
   q.h(var0, "<this>");
   q.h(var2, "onError");

   try {
      var6 = findViewByReactTag(var0, var1);
   } catch (var3: IllegalViewOperationException) {
      var2.invoke(var3);
      var6 = null;
   } catch (var4: Exception) {
      throw new IllegalStateException(
         "\n        findViewByReactTag failed likely due to a changed React Native internal implementation\n        from a version bump, please inspect this method and update as needed.\n    ",
         var4
      );
   }

   return var6;
}

@JvmSynthetic
private inline fun <reified T : Any, reified V> Any.getPrivateField(name: String): Any {
   var var2: Class = var0.getClass().getSuperclass();
   q.m(4, "T");
   if (var2 === Object::class.java) {
      var2 = var0.getClass().getSuperclass();
   } else {
      var2 = var0.getClass();
   }

   val var4: Field = var2.getDeclaredField(var1);
   var4.setAccessible(true);
   var0 = var4.get(var0);
   q.m(3, "V");
   if (var0 is Any) {
      return (V)var0;
   } else {
      q.m(4, "V");
      val var5: StringBuilder = new StringBuilder();
      var5.append("Field ");
      var5.append(var0);
      var5.append(" not instance of ");
      var5.append(Object::class.java);
      var5.append(".");
      throw new IllegalStateException(var5.toString().toString());
   }
}
