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
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import lj.l

public class MobileVoiceOverlayManagerModule(reactContext: ReactApplicationContext) : NativeMobileVoiceOverlaySpec {
   private final val mobileVoiceOverlay: MobileVoiceOverlay
      private final get() {
         return this.mobileVoiceOverlay$delegate.getValue() as MobileVoiceOverlay;
      }


   init {
      q.h(var1, "reactContext");
      super(var1);
      this.mobileVoiceOverlay$delegate = l.a(new Function0(this) {
         final MobileVoiceOverlayManagerModule this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final MobileVoiceOverlay invoke() {
            val var1: ReactApplicationContext = MobileVoiceOverlayManagerModule.access$getReactApplicationContext(this.this$0);
            q.g(var1, "access$getReactApplicationContext(...)");
            return new MobileVoiceOverlay(var1);
         }
      });
   }

   public override fun enableOverlay(promise: Promise) {
      q.h(var1, "promise");
      val var2: WindowUtils = WindowUtils.INSTANCE;
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
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
                  val var6: WindowUtils = WindowUtils.INSTANCE;
                  val var5: ReactApplicationContext = MobileVoiceOverlayManagerModule.access$getReactApplicationContext(this.this$0);
                  q.g(var5, "access$getReactApplicationContext(...)");
                  var7.resolve(var6.canDrawOverlay(var5));
               }
            }

            public void onNewIntent(Intent var1) {
            }
         };
         val var7: java.lang.String = this.getReactApplicationContext().getPackageName();
         val var5: StringBuilder = new StringBuilder();
         var5.append("package:");
         var5.append(var7);
         val var6: Intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(var5.toString()));
         this.getReactApplicationContext().addActivityEventListener(var4);
         this.getReactApplicationContext().startActivityForResult(var6, 234780, Bundle.EMPTY);
      }
   }

   public override fun getName(): String {
      return "RTNMobileVoiceOverlay";
   }

   public override fun hideOverlay() {
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

   public override fun setData(data: ReadableMap?) {
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

   public override fun showOverlay(assets: ReadableMap?) {
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
