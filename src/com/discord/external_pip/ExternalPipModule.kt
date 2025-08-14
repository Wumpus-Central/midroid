package com.discord.external_pip

import B9.s
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
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "ExternalPip")
@SourceDebugExtension(["SMAP\nExternalPipModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalPipModule.kt\ncom/discord/external_pip/ExternalPipModule\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n*L\n1#1,124:1\n22#2,8:125\n*S KotlinDebug\n*F\n+ 1 ExternalPipModule.kt\ncom/discord/external_pip/ExternalPipModule\n*L\n37#1:125,8\n*E\n"])
public class ExternalPipModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val manager: ExternalPipManager = new ExternalPipManager()
   private final val reactEvents: ReactEvents =
      new ReactEvents(s.a("onPipModeChanged", OnPipModeChangedEvent::class), s.a("onPipModeWillChange", OnPipModeWillChangeEvent::class))

   private fun enterPipMode(force: Boolean, onResult: (Result<Unit>) -> Unit) {
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
      val var3: ReactEvents = this.reactEvents;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      var3.emitModuleEvent(var2, new OnPipModeChangedEvent(var1));
      ExternalPipTransitionView.Companion.tryHide(this.getCurrentActivity(), var1);
   }

   private fun onPipModeWillChange() {
      if (ExternalPipManager.getEnabled$default(this.manager, false, 1, null)) {
         val var2: ReactEvents = this.reactEvents;
         val var1: ReactApplicationContext = this.getReactApplicationContext();
         var2.emitModuleEvent(var1, new OnPipModeWillChangeEvent());
      }
   }

   public open fun getConstants(): MutableMap<String, Boolean> {
      return L.m(new Pair[]{s.a("isSupported", ExternalPipManager.Companion.isSupported())});
   }

   public open fun getName(): String {
      return "ExternalPip";
   }

   @ReactMethod
   public fun setActive(active: Boolean, onResultPromise: Promise) {
      if (ThreadUtilsKt.isOnMainThread()) {
         if (var1) {
            access$enterPipMode(this, true, new Function1<Result, Unit>(this, var2) {
               final Promise $onResultPromise;
               final ExternalPipModule this$0;

               {
                  this.this$0 = var1;
                  this.$onResultPromise = var2;
               }

               public final void invoke(Object var1) {
                  var1 = Result.e(var1);
                  if (var1 != null) {
                     this.$onResultPromise.reject(var1);
                  } else {
                     this.$onResultPromise.resolve(java.lang.Boolean.TRUE);
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
                  ExternalPipModule.access$enterPipMode(this.this$0, true, new Function1<Result, Unit>(this.this$0, this.$onResultPromise$inlined) {
                     final Promise $onResultPromise;
                     final ExternalPipModule this$0;

                     {
                        this.this$0 = var1;
                        this.$onResultPromise = var2;
                     }

                     public final void invoke(Object var1) {
                        var1 = Result.e(var1);
                        if (var1 != null) {
                           this.$onResultPromise.reject(var1);
                        } else {
                           this.$onResultPromise.resolve(java.lang.Boolean.TRUE);
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

      @JvmStatic
      fun `onUserLeaveHint$lambda$0`(var0: ReactContext, var1: Result): Unit {
         if (!Result.h(var1.j())) {
            val var2: ExternalPipModule = ExternalPipModule.Companion.getModule(var0);
            if (var2 != null) {
               ExternalPipModule.access$onPipModeChanged(var2, false);
            }
         }

         return Unit.a;
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
               ExternalPipModule.access$enterPipMode(var3, false, new h(var1));
            }
         }
      }
   }
}
