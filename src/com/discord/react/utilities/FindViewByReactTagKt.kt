@file:SourceDebugExtension(["SMAP\nFindViewByReactTag.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FindViewByReactTag.kt\ncom/discord/react/utilities/FindViewByReactTagKt\n*L\n1#1,84:1\n67#1,4:85\n66#1,16:89\n67#1,4:105\n66#1,16:109\n67#1,4:125\n66#1,16:129\n*S KotlinDebug\n*F\n+ 1 FindViewByReactTag.kt\ncom/discord/react/utilities/FindViewByReactTagKt\n*L\n50#1:85,4\n50#1:89,16\n54#1:105,4\n54#1:109,16\n58#1:125,4\n58#1:129,16\n*E\n"])

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
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

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
         var var6: Class = (Class)var5.get(var2);
         if (var6 is NativeViewHierarchyOptimizer) {
            val var15: NativeViewHierarchyOptimizer = var6 as NativeViewHierarchyOptimizer;
            if ((var6 as NativeViewHierarchyOptimizer).getClass().getSuperclass() === NativeViewHierarchyOptimizer::class.java) {
               var6 = var15.getClass().getSuperclass();
            } else {
               var6 = var15.getClass();
            }

            val var8: Field = var6.getDeclaredField("mUIViewOperationQueue");
            var8.setAccessible(true);
            var2 = (UIImplementation)var8.get(var15);
            if (var2 is UIViewOperationQueue) {
               val var17: UIViewOperationQueue = var2 as UIViewOperationQueue;
               if ((var2 as UIViewOperationQueue).getClass().getSuperclass() === UIViewOperationQueue::class.java) {
                  var6 = var17.getClass().getSuperclass();
               } else {
                  var6 = var17.getClass();
               }

               val var11: Field = var6.getDeclaredField("mNativeViewHierarchyManager");
               var11.setAccessible(true);
               var2 = (UIImplementation)var11.get(var17);
               if (var2 is NativeViewHierarchyManager) {
                  val var13: View = (var2 as NativeViewHierarchyManager).resolveView(var1);
                  return var13;
               } else {
                  val var12: StringBuilder = new StringBuilder();
                  var12.append("Field ");
                  var12.append(var2);
                  var12.append(" not instance of ");
                  var12.append(NativeViewHierarchyManager::class.java);
                  var12.append(".");
                  throw new IllegalStateException(var12.toString().toString());
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
            val var14: StringBuilder = new StringBuilder();
            var14.append("Field ");
            var14.append(var6);
            var14.append(" not instance of ");
            var14.append(NativeViewHierarchyOptimizer::class.java);
            var14.append(".");
            throw new IllegalStateException(var14.toString().toString());
         }
      } else {
         throw new IllegalStateException("Unable to resolve UIImplementation");
      }
   } else {
      throw new IllegalStateException("Unable to resolve UIManagerModule");
   }
}

public fun ReactContext.findViewByReactTag(tag: Int, onError: (Exception) -> Unit): View? {
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
   Intrinsics.reifiedOperationMarker(4, "T");
   if (var2 === Object::class.java) {
      var2 = var0.getClass().getSuperclass();
   } else {
      var2 = var0.getClass();
   }

   val var4: Field = var2.getDeclaredField(var1);
   var4.setAccessible(true);
   var0 = var4.get(var0);
   Intrinsics.reifiedOperationMarker(3, "V");
   if (var0 != null) {
      return (V)var0;
   } else {
      Intrinsics.reifiedOperationMarker(4, "V");
      val var5: StringBuilder = new StringBuilder();
      var5.append("Field ");
      var5.append(var0);
      var5.append(" not instance of ");
      var5.append(Object::class.java);
      var5.append(".");
      throw new IllegalStateException(var5.toString().toString());
   }
}
