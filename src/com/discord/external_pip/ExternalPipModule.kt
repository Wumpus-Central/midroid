package com.discord.external_pip

import android.app.Activity
import android.content.Intent
import com.discord.external_pip.react_events.OnPipModeChangedEvent
import com.discord.external_pip.react_events.OnPipModeWillChangeEvent
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.react_activities.ReactActivity
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.module.annotations.ReactModule
import eh.w
import fh.s
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

@ReactModule(name = "ExternalPip")
public class ExternalPipModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val manager: ExternalPipManager
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.manager = new ExternalPipManager();
      this.reactEvents = new ReactEvents(
         new Pair[]{w.a("onPipModeChanged", h0.b(OnPipModeChangedEvent.class)), w.a("onPipModeWillChange", h0.b(OnPipModeWillChangeEvent.class))}
      );
   }

   private fun enterPipMode(force: Boolean, onResult: (eh.r<Unit>) -> Unit) {
      if (this.manager.getEnabled(var1)) {
         ExternalPipTransitionView.Companion.tryShow(this.getCurrentActivity());
      }

      this.manager.enterPipMode(this.getReactApplicationContext().getCurrentActivity(), var1, var2);
   }

   private fun leavePipMode() {
      val var1: Activity = this.getCurrentActivity();
      if (var1 != null) {
         var1.startActivity(new Intent(this.getCurrentActivity(), ReactActivity.Registry.getMainActivity()).addFlags(131072));
      }
   }

   private fun onPipModeChanged(isInPipMode: Boolean) {
      val var2: ReactEvents = this.reactEvents;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "reactApplicationContext");
      var2.emitModuleEvent(var3, new OnPipModeChangedEvent(var1));
      ExternalPipTransitionView.Companion.tryHide(this.getCurrentActivity(), var1);
   }

   private fun onPipModeWillChange() {
      if (ExternalPipManager.getEnabled$default(this.manager, false, 1, null)) {
         val var2: ReactEvents = this.reactEvents;
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var1, "reactApplicationContext");
         var2.emitModuleEvent(var1, new OnPipModeWillChangeEvent());
      }
   }

   public open fun getConstants(): MutableMap<String, Boolean> {
      return s.m(w.a("isSupported", ExternalPipManager.Companion.isSupported()));
   }

   public open fun getName(): String {
      return "ExternalPip";
   }

   @ReactMethod
   public fun setActive(active: Boolean, onResultPromise: Promise) {
      r.h(var2, "onResultPromise");
      if (ThreadUtilsKt.isOnMainThread()) {
         if (var1) {
            access$enterPipMode(this, true, new Function1<eh.r<? extends Unit>, Unit>(var2) {
               final Promise $onResultPromise;

               {
                  super(1);
                  this.$onResultPromise = var1;
               }

               public final void invoke(Object var1) {
                  if (eh.r.h(var1)) {
                     this.$onResultPromise.resolve(java.lang.Boolean.TRUE);
                  } else {
                     this.$onResultPromise.reject(eh.r.e(var1));
                  }
               }
            });
         } else {
            access$leavePipMode(this);
         }
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(var1, this, var2) {
            final boolean $active$inlined;
            final Promise $onResultPromise$inlined;
            final ExternalPipModule this$0;

            {
               this.$active$inlined = var1;
               this.this$0 = var2;
               this.$onResultPromise$inlined = var3;
            }

            @Override
            public final void run() {
               if (this.$active$inlined) {
                  ExternalPipModule.access$enterPipMode(this.this$0, true, new Function1<eh.r<? extends Unit>, Unit>(this.$onResultPromise$inlined) {
                     final Promise $onResultPromise;

                     {
                        super(1);
                        this.$onResultPromise = var1;
                     }

                     public final void invoke(Object var1) {
                        if (eh.r.h(var1)) {
                           this.$onResultPromise.resolve(java.lang.Boolean.TRUE);
                        } else {
                           this.$onResultPromise.reject(eh.r.e(var1));
                        }
                     }
                  });
               } else {
                  ExternalPipModule.access$leavePipMode(this.this$0);
               }
            }
         });
      }
   }

   @ReactMethod
   public fun setEnabled(enabled: Boolean) {
      this.manager.setEnabled(var1);
   }

   @ReactMethod
   public fun setPipAspectRatio(numerator: Int, denominator: Int) {
      this.manager.setPipAspectRatio(this.getReactApplicationContext().getCurrentActivity(), var1, var2);
   }

   public companion object {
      internal const val NAME: String

      private fun ReactContext.getModule(): ExternalPipModule? {
         return var1.getNativeModule(ExternalPipModule.class) as ExternalPipModule;
      }

      public fun onPipModeChanged(reactContext: ReactContext?, isInPipMode: Boolean): Unit? {
         if (var1 != null) {
            val var3: ExternalPipModule = this.getModule(var1);
            if (var3 != null) {
               ExternalPipModule.access$onPipModeChanged(var3, var2);
               return Unit.a;
            }
         }

         return null;
      }

      public fun onUserLeaveHint(reactContext: ReactContext?) {
         if (var1 != null) {
            val var2: ExternalPipModule = this.getModule(var1);
            if (var2 != null) {
               ExternalPipModule.access$onPipModeWillChange(var2);
            }
         }

         if (var1 != null) {
            val var3: ExternalPipModule = this.getModule(var1);
            if (var3 != null) {
               ExternalPipModule.access$enterPipMode(var3, false, new Function1<eh.r<? extends Unit>, Unit>(var1) {
                  final ReactContext $reactContext;

                  {
                     super(1);
                     this.$reactContext = var1;
                  }

                  public final void invoke(Object var1) {
                     if (!eh.r.h(var1)) {
                        var1 = ExternalPipModule.Companion.access$getModule(ExternalPipModule.Companion, this.$reactContext);
                        if (var1 != null) {
                           ExternalPipModule.access$onPipModeChanged(var1, false);
                        }
                     }
                  }
               });
            }
         }
      }
   }
}
