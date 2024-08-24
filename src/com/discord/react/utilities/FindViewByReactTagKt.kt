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
import kotlin.jvm.internal.r

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
            var var9: Class = (Class)var8.get(var15);
            if (var9 is UIViewOperationQueue) {
               val var17: UIViewOperationQueue = var9 as UIViewOperationQueue;
               if ((var9 as UIViewOperationQueue).getClass().getSuperclass() === UIViewOperationQueue::class.java) {
                  var9 = var17.getClass().getSuperclass();
               } else {
                  var9 = var17.getClass();
               }

               val var11: Field = var9.getDeclaredField("mNativeViewHierarchyManager");
               var11.setAccessible(true);
               var9 = (Class)var11.get(var17);
               if (var9 is NativeViewHierarchyManager) {
                  val var13: View = (var9 as NativeViewHierarchyManager).resolveView(var1);
                  r.g(var13, "nativeViewHierarchyManager.resolveView(tag)");
                  return var13;
               } else {
                  val var18: StringBuilder = new StringBuilder();
                  var18.append("Field ");
                  var18.append(var9);
                  var18.append(" not instance of ");
                  var18.append(NativeViewHierarchyManager::class.java);
                  var18.append(".");
                  throw new IllegalStateException(var18.toString().toString());
               }
            } else {
               val var16: StringBuilder = new StringBuilder();
               var16.append("Field ");
               var16.append(var9);
               var16.append(" not instance of ");
               var16.append(UIViewOperationQueue::class.java);
               var16.append(".");
               throw new IllegalStateException(var16.toString().toString());
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
   r.h(var0, "<this>");
   r.h(var2, "onError");

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
   r.m(4, "T");
   if (var2 === Object::class.java) {
      var2 = var0.getClass().getSuperclass();
   } else {
      var2 = var0.getClass();
   }

   val var4: Field = var2.getDeclaredField(var1);
   var4.setAccessible(true);
   val var5: Any = var4.get(var0);
   r.m(3, "V");
   if (var5 is Object) {
      return (V)var5;
   } else {
      r.m(4, "V");
      var0 = new StringBuilder();
      var0.append("Field ");
      var0.append(var5);
      var0.append(" not instance of ");
      var0.append(Object::class.java);
      var0.append(".");
      throw new IllegalStateException(var0.toString().toString());
   }
}
