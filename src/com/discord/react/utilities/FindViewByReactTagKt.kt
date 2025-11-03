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
   val var3: UIManagerModule = var0.getNativeModule(UIManagerModule.class);
   if (var3 != null) {
      val var2: UIImplementation = var3.getUIImplementation();
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
            var6 = (Class)var8.get(var15);
            if (var6 is UIViewOperationQueue) {
               val var17: UIViewOperationQueue = var6 as UIViewOperationQueue;
               if ((var6 as UIViewOperationQueue).getClass().getSuperclass() === UIViewOperationQueue::class.java) {
                  var6 = var17.getClass().getSuperclass();
               } else {
                  var6 = var17.getClass();
               }

               val var11: Field = var6.getDeclaredField("mNativeViewHierarchyManager");
               var11.setAccessible(true);
               var6 = (Class)var11.get(var17);
               if (var6 is NativeViewHierarchyManager) {
                  val var13: View = (var6 as NativeViewHierarchyManager).resolveView(var1);
                  return var13;
               } else {
                  val var18: StringBuilder = new StringBuilder();
                  var18.append("Field ");
                  var18.append(var6);
                  var18.append(" not instance of ");
                  var18.append(NativeViewHierarchyManager::class.java);
                  var18.append(".");
                  throw new IllegalStateException(var18.toString().toString());
               }
            } else {
               val var16: StringBuilder = new StringBuilder();
               var16.append("Field ");
               var16.append(var6);
               var16.append(" not instance of ");
               var16.append(UIViewOperationQueue::class.java);
               var16.append(".");
               throw new IllegalStateException(var16.toString().toString());
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
      return findViewByReactTag(var0, var1);
   } catch (var3: IllegalViewOperationException) {
      var2.invoke(var3);
      return null;
   } catch (var4: Exception) {
      throw new IllegalStateException(
         "\n        findViewByReactTag failed likely due to a changed React Native internal implementation\n        from a version bump, please inspect this method and update as needed.\n    ",
         var4
      );
   }
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
   val var5: Any = var4.get(var0);
   Intrinsics.reifiedOperationMarker(3, "V");
   if (var5 != null) {
      return (V)var5;
   } else {
      Intrinsics.reifiedOperationMarker(4, "V");
      var0 = new StringBuilder();
      var0.append("Field ");
      var0.append(var5);
      var0.append(" not instance of ");
      var0.append(Object::class.java);
      var0.append(".");
      throw new IllegalStateException(var0.toString().toString());
   }
}
