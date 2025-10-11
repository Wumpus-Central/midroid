package com.discord.portals.from_native

import B9.s
import android.app.Activity
import com.discord.codegen.NativePortalFromNativeModuleSpec
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.uimanager.annotations.ReactProp
import com.facebook.react.viewmanagers.DCDPortalViewManagerDelegate
import com.facebook.react.viewmanagers.DCDPortalViewManagerInterface
import db.I
import db.K
import db.f
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.serialization.KSerializer
import nb.g

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

   @g
   internal data class OnPortalViewLoadedEvent(portal: Double) : ReactEvent {
      public final val portal: Double

      init {
         this.portal = var1;
      }

      public operator fun component1(): Double {
         return this.portal;
      }

      public fun copy(portal: Double = var0.portal): com.discord.portals.from_native.PortalFromNativeModule.OnPortalViewLoadedEvent {
         return new PortalFromNativeModule.OnPortalViewLoadedEvent(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is PortalFromNativeModule.OnPortalViewLoadedEvent) {
            return false;
         } else {
            return java.lang.Double.compare(this.portal, (var1 as PortalFromNativeModule.OnPortalViewLoadedEvent).portal) == 0;
         }
      }

      public override fun hashCode(): Int {
         return java.lang.Double.hashCode(this.portal);
      }

      override fun serialize(): WritableMap {
         return ReactEvent.DefaultImpls.serialize(this);
      }

      public override fun toString(): String {
         val var1: Double = this.portal;
         val var3: StringBuilder = new StringBuilder();
         var3.append("OnPortalViewLoadedEvent(portal=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
      }

      public companion object {
         public fun serializer(): KSerializer<com.discord.portals.from_native.PortalFromNativeModule.OnPortalViewLoadedEvent> {
            return PortalFromNativeModule.OnPortalViewLoadedEvent.$serializer.INSTANCE;
         }
      }
   }

   @ReactModule(name = "DCDPortalView")
   public class ViewManager : ViewGroupManager<PortalHolderViewGroup>, DCDPortalViewManagerInterface<PortalHolderViewGroup> {
      private final val delegate: DCDPortalViewManagerDelegate<PortalHolderViewGroup, com.discord.portals.from_native.PortalFromNativeModule.ViewManager> =
         new DCDPortalViewManagerDelegate(this)
         private final val reactEvents: ReactEvents = new ReactEvents(s.a("onPortalViewLoaded", PortalFromNativeModule.OnPortalViewLoadedEvent::class))

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
         f.d(CoroutineViewUtilsKt.getAttachedScope(var1), null, null, new Function2<CoroutineScope, Continuation, Object>(var2, var1, this, null) {
            final double $portal;
            final PortalHolderViewGroup $portalView;
            int label;
            final PortalFromNativeModule.ViewManager this$0;

            {
               super(2, var5);
               this.$portal = var1;
               this.$portalView = var3;
               this.this$0 = var4;
            }

            private static final Unit invokeSuspend$lambda$0(PortalFromNativeModule.ViewManager var0, PortalHolderViewGroup var1x, double var2x) {
               PortalFromNativeModule.ViewManager.access$getReactEvents$p(var0).emitEvent(var1x, new PortalFromNativeModule.OnPortalViewLoadedEvent(var2x));
               return Unit.a;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$portal, this.$portalView, this.this$0, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var5: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  val var6: CoroutineDispatcher = K.a();
                  var1 = new Function2<CoroutineScope, Continuation, Object>(null) {
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
                        val var3: Any = G9.b.e();
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
                  if (f.g(var6, var1, this) === var5) {
                     return var5;
                  }
               }

               PortalFromNativeContextManager.INSTANCE.registerView(this.$portal, this.$portalView, new d(this.this$0, this.$portalView, this.$portal));
               return Unit.a;
            }
         }, 3, null);
      }

      public companion object {
         public const val NAME: String
      }
   }
}
