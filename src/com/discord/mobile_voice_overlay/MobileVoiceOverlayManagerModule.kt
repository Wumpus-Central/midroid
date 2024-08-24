package com.discord.mobile_voice_overlay

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.discord.codegen.NativeMobileVoiceOverlaySpec
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableMap
import eh.l
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json

public class MobileVoiceOverlayManagerModule(reactContext: ReactApplicationContext) : NativeMobileVoiceOverlaySpec {
   private final val mobileVoiceOverlay: MobileVoiceOverlay
      private final get() {
         return this.mobileVoiceOverlay$delegate.getValue() as MobileVoiceOverlay;
      }


   init {
      r.h(var1, "reactContext");
      super(var1);
      this.mobileVoiceOverlay$delegate = l.b(new Function0<MobileVoiceOverlay>(this) {
         final MobileVoiceOverlayManagerModule this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MobileVoiceOverlay invoke() {
            val var1: ReactApplicationContext = MobileVoiceOverlayManagerModule.access$getReactApplicationContext(this.this$0);
            r.g(var1, "reactApplicationContext");
            return new MobileVoiceOverlay(var1);
         }
      });
   }

   public open fun enableOverlay(promise: Promise) {
      r.h(var1, "promise");
      val var2: WindowUtils = WindowUtils.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "reactApplicationContext");
      if (var2.canDrawOverlay(var3)) {
         var1.resolve(java.lang.Boolean.TRUE);
      } else {
         val var4: ActivityEventListener = new ActivityEventListener(this, var1) {
            final Promise $promise;
            final MobileVoiceOverlayManagerModule this$0;

            {
               this.this$0 = var1;
               this.$promise = var2;
            }

            public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
               if (var2 == 234780) {
                  MobileVoiceOverlayManagerModule.access$getReactApplicationContext(this.this$0).removeActivityEventListener(this);
                  val var7: Promise = this.$promise;
                  val var5: WindowUtils = WindowUtils.INSTANCE;
                  val var6: ReactApplicationContext = MobileVoiceOverlayManagerModule.access$getReactApplicationContext(this.this$0);
                  r.g(var6, "reactApplicationContext");
                  var7.resolve(var5.canDrawOverlay(var6));
               }
            }

            public void onNewIntent(Intent var1) {
            }
         };
         val var5: java.lang.String = this.getReactApplicationContext().getPackageName();
         val var7: StringBuilder = new StringBuilder();
         var7.append("package:");
         var7.append(var5);
         val var6: Intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(var7.toString()));
         this.getReactApplicationContext().addActivityEventListener(var4);
         this.getReactApplicationContext().startActivityForResult(var6, 234780, Bundle.EMPTY);
      }
   }

   public open fun getName(): String {
      return "RTNMobileVoiceOverlay";
   }

   public open fun hideOverlay() {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getMobileVoiceOverlay(this).hideOverlay$mobile_voice_overlay_release();
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(this) {
            final MobileVoiceOverlayManagerModule this$0;

            {
               this.this$0 = var1;
            }

            @Override
            public final void run() {
               MobileVoiceOverlayManagerModule.access$getMobileVoiceOverlay(this.this$0).hideOverlay$mobile_voice_overlay_release();
            }
         });
      }
   }

   public open fun setData(data: ReadableMap?) {
      if (var1 != null) {
         val var2: Json = NativeMapExtensionsKt.getJson();
         val var3: java.lang.String = NativeMapExtensionsKt.toJsonString(var1);
         var2.a();
         val var4: MobileVoiceOverlayData = var2.b(MobileVoiceOverlayData.Companion.serializer(), var3) as MobileVoiceOverlayData;
         if (var4 != null) {
            if (ThreadUtilsKt.isOnMainThread()) {
               access$getMobileVoiceOverlay(this).setData$mobile_voice_overlay_release(var4);
            } else {
               ThreadUtilsKt.getUiHandler().post(new Runnable(this, var4) {
                  final MobileVoiceOverlayData $overlayData$inlined;
                  final MobileVoiceOverlayManagerModule this$0;

                  {
                     this.this$0 = var1;
                     this.$overlayData$inlined = var2;
                  }

                  @Override
                  public final void run() {
                     MobileVoiceOverlayManagerModule.access$getMobileVoiceOverlay(this.this$0).setData$mobile_voice_overlay_release(this.$overlayData$inlined);
                  }
               });
            }
         }
      }
   }

   public open fun showOverlay(assets: ReadableMap?) {
      if (var1 != null) {
         val var2: Json = NativeMapExtensionsKt.getJson();
         val var3: java.lang.String = NativeMapExtensionsKt.toJsonString(var1);
         var2.a();
         val var4: MobileVoiceOverlayAssets = var2.b(MobileVoiceOverlayAssets.Companion.serializer(), var3) as MobileVoiceOverlayAssets;
         if (var4 != null) {
            if (ThreadUtilsKt.isOnMainThread()) {
               access$getMobileVoiceOverlay(this).showOverlay$mobile_voice_overlay_release(var4);
            } else {
               ThreadUtilsKt.getUiHandler()
                  .post(
                     new Runnable(this, var4) {
                        final MobileVoiceOverlayAssets $overlayAssets$inlined;
                        final MobileVoiceOverlayManagerModule this$0;

                        {
                           this.this$0 = var1;
                           this.$overlayAssets$inlined = var2;
                        }

                        @Override
                        public final void run() {
                           MobileVoiceOverlayManagerModule.access$getMobileVoiceOverlay(this.this$0)
                              .showOverlay$mobile_voice_overlay_release(this.$overlayAssets$inlined);
                        }
                     }
                  );
            }
         }
      }
   }

   public companion object {
      public const val NAME: String
      public const val OVERLAY_REQUEST_CODE: Int
   }
}
