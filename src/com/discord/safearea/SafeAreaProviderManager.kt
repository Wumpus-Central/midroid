package com.discord.safearea

import com.discord.reactevents.ReactEvents
import com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.SafeAreaViewManagerDelegate
import com.facebook.react.viewmanagers.SafeAreaViewManagerInterface
import com.th3rdwave.safeareacontext.EdgeInsets
import com.th3rdwave.safeareacontext.Rect
import com.th3rdwave.safeareacontext.SafeAreaProvider
import g9.s
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q

@ReactModule(name = "DCDSafeArea")
public class SafeAreaProviderManager : ViewGroupManager<SafeAreaProvider>, SafeAreaViewManagerInterface<SafeAreaProvider> {
   private final val delegate: SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> = new SafeAreaViewManagerDelegate(this)
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("onSafeAreaInsetsDidChange", G.b(OnSafeAreaInsetsDidChangeData.class)))
   private final var changeData: OnSafeAreaInsetsDidChangeData
   private final var changeDatastableInsets: OnSafeAreaInsetsDidChangeData
   private final var dimensions: com.discord.safearea.SafeAreaProviderManager.SafeAreaProviderDimensions?

   @JvmStatic
   fun {
      val var0: SafeAreaEdgeInsets = new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
      DEFAULT_SAFE_AREA_INSETS = var0;
      DEFAULT_CHANGE_DATA = new OnSafeAreaInsetsDidChangeData(var0.getTopDp(), var0.getBottomDp(), var0.getLeftDp(), var0.getRightDp());
   }

   @JvmStatic
   fun `addEventEmitters$lambda$0`(
      var0: SafeAreaProviderManager, var1: ThemedReactContext, var2: SafeAreaProvider, var3: SafeAreaProvider, var4: EdgeInsets, var5: Rect
   ): Unit {
      q.h(var3, "<unused var>");
      q.h(var4, "insets");
      q.h(var5, "<unused var>");
      var0.handleInsetsChanged(var1, new SafeAreaEdgeInsets(var4), var2);
      return Unit.a;
   }

   private fun handleInsetsChanged(reactContext: ThemedReactContext, safeAreaEdgeInsets: SafeAreaEdgeInsets, view: SafeAreaProvider) {
      val var5: OnSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(var2.getTopDp(), var2.getBottomDp(), var2.getLeftDp(), var2.getRightDp());
      val var6: SafeAreaProviderManager.SafeAreaProviderDimensions = new SafeAreaProviderManager.SafeAreaProviderDimensions(var3);
      val var4: Boolean;
      if (!q.c(this.dimensions, var6)) {
         this.changeData = this.changeDatastableInsets;
         this.dimensions = var6;
         var4 = true;
      } else {
         var4 = false;
      }

      val var7: OnSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(
         Math.max(var5.getTop(), this.changeData.getTop()),
         Math.max(var5.getBottom(), this.changeData.getBottom()),
         Math.max(var5.getLeft(), this.changeData.getLeft()),
         Math.max(var5.getRight(), this.changeData.getRight())
      );
      if (!q.c(this.changeData, var7) || var4) {
         this.changeData = var7;
         this.reactEvents.emitEvent(var1, var3, var7);
      }
   }

   protected open fun addEventEmitters(reactContext: ThemedReactContext, view: SafeAreaProvider) {
      q.h(var1, "reactContext");
      q.h(var2, "view");
      var2.setOnInsetsChangeHandler(new c(this, var1, var2));
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): SafeAreaProvider {
      q.h(var1, "reactContext");
      return new SafeAreaProvider(var1);
   }

   protected open fun getDelegate(): SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDSafeArea";
   }

   public companion object {
      public const val NAME: String
      private final val DEFAULT_SAFE_AREA_INSETS: SafeAreaEdgeInsets
      private final val DEFAULT_CHANGE_DATA: OnSafeAreaInsetsDidChangeData
   }

   private data class SafeAreaProviderDimensions(height: Int, width: Int) {
      public final val height: Int
      public final val width: Int

      init {
         this.height = var1;
         this.width = var2;
      }

      public constructor(safeAreaProvider: SafeAreaProvider) : q.h(var1, "safeAreaProvider") {
         this(var1.getRootView().getHeight(), var1.getRootView().getWidth());
      }

      public operator fun component1(): Int {
         return this.height;
      }

      public operator fun component2(): Int {
         return this.width;
      }

      public fun copy(height: Int = var0.height, width: Int = var0.width): com.discord.safearea.SafeAreaProviderManager.SafeAreaProviderDimensions {
         return new SafeAreaProviderManager.SafeAreaProviderDimensions(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is SafeAreaProviderManager.SafeAreaProviderDimensions) {
            return false;
         } else {
            var1 = var1;
            if (this.height != var1.height) {
               return false;
            } else {
               return this.width == var1.width;
            }
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.height) * 31 + Integer.hashCode(this.width);
      }

      public override fun toString(): String {
         val var1: Int = this.height;
         val var2: Int = this.width;
         val var3: StringBuilder = new StringBuilder();
         var3.append("SafeAreaProviderDimensions(height=");
         var3.append(var1);
         var3.append(", width=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
