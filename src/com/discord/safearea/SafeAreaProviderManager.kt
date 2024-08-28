package com.discord.safearea

import androidx.core.graphics.Insets
import androidx.core.view.WindowInsetsCompat
import com.discord.misc.utilities.insets.WindowInsetsCompatExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.reactevents.ReactEvents
import com.discord.safearea.extensions.ImmersiveMode
import com.discord.safearea.react.events.OnSafeAreaInsetsDidChangeData
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.SafeAreaViewManagerDelegate
import com.facebook.react.viewmanagers.SafeAreaViewManagerInterface
import com.th3rdwave.safeareacontext.EdgeInsets
import com.th3rdwave.safeareacontext.Rect
import com.th3rdwave.safeareacontext.SafeAreaProvider
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function3
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import lj.w

@ReactModule(name = "DCDSafeArea")
public class SafeAreaProviderManager : ViewGroupManager<SafeAreaProvider>, SafeAreaViewManagerInterface<SafeAreaProvider> {
   private final var changeData: OnSafeAreaInsetsDidChangeData
   private final val delegate: SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> = new SafeAreaViewManagerDelegate(this)
   private final var dimensions: com.discord.safearea.SafeAreaProviderManager.SafeAreaProviderDimensions?
   private final var imeInsets: Insets?
   private final val reactEvents: ReactEvents = new ReactEvents(w.a("onSafeAreaInsetsDidChange", g0.b(OnSafeAreaInsetsDidChangeData.class)))
   private final var safeAreaEdgeInsets: SafeAreaEdgeInsets

   @JvmStatic
   fun {
      val var0: SafeAreaEdgeInsets = new SafeAreaEdgeInsets(0.0F, 0.0F, 0.0F, 0.0F, 15, null);
      DEFAULT_SAFE_AREA_INSETS = var0;
      DEFAULT_CHANGE_DATA = new OnSafeAreaInsetsDidChangeData(var0.getTopDp(), var0.getBottomDp(), var0.getLeftDp(), var0.getRightDp(), 0.0F);
   }

   private fun handleInsetsChanged(reactContext: ThemedReactContext, safeAreaEdgeInsets: SafeAreaEdgeInsets, imeInsets: Insets?, view: SafeAreaProvider) {
      val var7: Float = var2.getTopDp();
      val var8: Float = var2.getBottomDp();
      val var9: Float = var2.getLeftDp();
      val var6: Float = var2.getRightDp();
      val var5: Float;
      if (var3 != null) {
         var5 = SizeUtilsKt.getPxToDp(var3.d);
      } else {
         var5 = 0.0F;
      }

      val var12: OnSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(var7, var8, var9, var6, var5);
      val var10: SafeAreaProviderManager.SafeAreaProviderDimensions = new SafeAreaProviderManager.SafeAreaProviderDimensions(var4);
      if (!q.c(this.dimensions, var10)) {
         this.changeData = DEFAULT_CHANGE_DATA;
         this.dimensions = var10;
      }

      val var11: OnSafeAreaInsetsDidChangeData = new OnSafeAreaInsetsDidChangeData(
         Math.max(var12.getTop(), this.changeData.getTop()),
         Math.max(var12.getBottom(), this.changeData.getBottom()),
         Math.max(var12.getLeft(), this.changeData.getLeft()),
         Math.max(var12.getRight(), this.changeData.getRight()),
         var12.getImeInsetsBottom()
      );
      this.changeData = var11;
      this.reactEvents.emitEvent(var1, var4, var11);
   }

   protected open fun addEventEmitters(reactContext: ThemedReactContext, view: SafeAreaProvider) {
      q.h(var1, "reactContext");
      q.h(var2, "view");
      var2.setOnInsetsChangeHandler(
         new Function3(this, var1, var2) {
            final ThemedReactContext $reactContext;
            final SafeAreaProvider $view;
            final SafeAreaProviderManager this$0;

            {
               super(3);
               this.this$0 = var1;
               this.$reactContext = var2;
               this.$view = var3;
            }

            public final void invoke(SafeAreaProvider var1, EdgeInsets var2, Rect var3) {
               q.h(var1, "<anonymous parameter 0>");
               q.h(var2, "insets");
               q.h(var3, "<anonymous parameter 2>");
               SafeAreaProviderManager.access$handleInsetsChanged(
                  this.this$0, this.$reactContext, new SafeAreaEdgeInsets(var2), SafeAreaProviderManager.access$getImeInsets$p(this.this$0), this.$view
               );
            }
         }
      );
      ImmersiveMode.INSTANCE
         .addRootViewInsetUpdateCallback$safe_area_release(
            new Function1(this, var1, var2) {
               final ThemedReactContext $reactContext;
               final SafeAreaProvider $view;
               final SafeAreaProviderManager this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$reactContext = var2;
                  this.$view = var3;
               }

               public final void invoke(WindowInsetsCompat var1) {
                  q.h(var1, "insets");
                  SafeAreaProviderManager.access$setImeInsets$p(this.this$0, WindowInsetsCompatExtensionsKt.getImeInsets$default(var1, false, 1, null));
                  SafeAreaProviderManager.access$handleInsetsChanged(
                     this.this$0,
                     this.$reactContext,
                     SafeAreaProviderManager.access$getSafeAreaEdgeInsets$p(this.this$0),
                     SafeAreaProviderManager.access$getImeInsets$p(this.this$0),
                     this.$view
                  );
               }
            }
         );
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): SafeAreaProvider {
      q.h(var1, "reactContext");
      return new SafeAreaProvider(var1);
   }

   protected open fun getDelegate(): SafeAreaViewManagerDelegate<SafeAreaProvider, SafeAreaProviderManager> {
      return this.delegate;
   }

   public override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public override fun getName(): String {
      return "DCDSafeArea";
   }

   public companion object {
      private final val DEFAULT_CHANGE_DATA: OnSafeAreaInsetsDidChangeData
      private const val DEFAULT_IME_INSETS_BOTTOM: Float
      private final val DEFAULT_SAFE_AREA_INSETS: SafeAreaEdgeInsets
      public const val NAME: String
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
