package com.discord.portals.from_native

import android.app.Activity
import cb.I
import cb.K
import cb.f
import com.discord.codegen.NativePortalFromNativeModuleSpec
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDPortalViewManagerDelegate
import com.facebook.react.viewmanagers.DCDPortalViewManagerInterface
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineScope

internal class PortalFromNativeModule(reactContext: ReactApplicationContext) : NativePortalFromNativeModuleSpec(var1) {
   @JvmStatic
   fun `unregisterView$lambda$0`(var0: Double) {
      PortalFromNativeContextManager.INSTANCE.unregisterView(var0);
   }

   public override fun unregisterView(portal: Double) {
      val var3: Activity = this.getReactApplicationContext().getCurrentActivity();
      if (var3 != null) {
         var3.runOnUiThread(new c(var1));
      }
   }

   @ReactModule(name = "DCDPortalView")
   public class ViewManager : ViewGroupManager<PortalHolderViewGroup>, DCDPortalViewManagerInterface<PortalHolderViewGroup> {
      private final val delegate: DCDPortalViewManagerDelegate<PortalHolderViewGroup, com.discord.portals.from_native.PortalFromNativeModule.ViewManager> =
         new DCDPortalViewManagerDelegate(this)

      protected open fun createViewInstance(reactContext: ThemedReactContext): PortalHolderViewGroup {
         return new PortalHolderViewGroup(var1);
      }

      protected open fun getDelegate(): DCDPortalViewManagerDelegate<PortalHolderViewGroup, com.discord.portals.from_native.PortalFromNativeModule.ViewManager> {
         return this.delegate;
      }

      public open fun getName(): String {
         return "DCDPortalView";
      }

      @ReactProp(name = "portal")
      public open fun setPortal(portalView: PortalHolderViewGroup, portal: Double) {
         f.d(CoroutineViewUtilsKt.getAttachedScope(var1), null, null, new Function2<CoroutineScope, Continuation, Object>(var2, var1, null) {
            final double $portal;
            final PortalHolderViewGroup $portalView;
            int label;

            {
               super(2, var4);
               this.$portal = var1;
               this.$portalView = var3;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$portal, this.$portalView, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = F9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  var1 = K.a();
                  val var4: Function2 = new Function2<CoroutineScope, Continuation, Object>(null) {
                     int label;

                     {
                        super(2, var1);
                     }

                     public final Continuation create(Object var1, Continuation var2) {
                        return new <anonymous constructor>(var2);
                     }

                     public final Object invoke(CoroutineScope var1, Continuation var2x) {
                        return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                     }

                     public final Object invokeSuspend(Object var1) {
                        val var3: Any = F9.b.e();
                        if (this.label != 0) {
                           if (this.label != 1) {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }

                           kotlin.c.b(var1);
                        } else {
                           kotlin.c.b(var1);
                           this.label = 1;
                           if (I.a(50L, this) === var3) {
                              return var3;
                           }
                        }

                        return Unit.a;
                     }
                  };
                  this.label = 1;
                  if (f.g(var1, var4, this) === var3) {
                     return var3;
                  }
               }

               PortalFromNativeContextManager.INSTANCE.registerView(this.$portal, this.$portalView);
               return Unit.a;
            }
         }, 3, null);
      }

      public companion object {
         public const val NAME: String
      }
   }
}
