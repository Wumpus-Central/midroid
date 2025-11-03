package com.discord.mobile_voice_overlay

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.discord.codegen.NativeMobileVoiceOverlayModuleSpec
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.mobile_voice_overlay.utils.WindowUtils
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ActivityEventListener
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json

@SourceDebugExtension(["SMAP\nMobileVoiceOverlayModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileVoiceOverlayModule.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlayModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 4 NativeMapExtensions.kt\ncom/discord/react/utilities/NativeMapExtensionsKt\n+ 5 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,77:1\n29#2:78\n22#3,8:79\n22#3,8:89\n22#3,8:99\n137#4:87\n137#4:97\n123#5:88\n123#5:98\n*S KotlinDebug\n*F\n+ 1 MobileVoiceOverlayModule.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlayModule\n*L\n46#1:78\n54#1:79,8\n61#1:89,8\n68#1:99,8\n60#1:87\n67#1:97\n60#1:88\n67#1:98\n*E\n"])
public class MobileVoiceOverlayModule(reactContext: ReactApplicationContext) : NativeMobileVoiceOverlayModuleSpec(var1) {
   private final val mobileVoiceOverlay: MobileVoiceOverlay by ht.l.b(new s(this))
      private final get() {
         return this.mobileVoiceOverlay$delegate.getValue() as MobileVoiceOverlay;
      }


   @JvmStatic
   fun `mobileVoiceOverlay_delegate$lambda$2`(var0: MobileVoiceOverlayModule): MobileVoiceOverlay {
      val var1: ReactApplicationContext = var0.getReactApplicationContext();
      return new MobileVoiceOverlay(var1, new t(var0), new u(var0));
   }

   @JvmStatic
   fun `mobileVoiceOverlay_delegate$lambda$2$lambda$0`(var0: MobileVoiceOverlayModule): Unit {
      var0.emitOnLayoutTrashed();
      return Unit.a;
   }

   @JvmStatic
   fun `mobileVoiceOverlay_delegate$lambda$2$lambda$1`(var0: MobileVoiceOverlayModule, var1: java.lang.String): Unit {
      var0.emitOnChannelQueryUpdate(var1);
      return Unit.a;
   }

   public override fun enableOverlay(promise: Promise) {
      val var3: WindowUtils = WindowUtils.INSTANCE;
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      if (var3.canDrawOverlay(var2)) {
         var1.resolve(java.lang.Boolean.TRUE);
      } else {
         val var4: ActivityEventListener = new ActivityEventListener(this, var1) {
            final Promise $promise;
            final MobileVoiceOverlayModule this$0;

            {
               this.this$0 = var1;
               this.$promise = var2;
            }

            @Override
            public void onActivityResult(Activity var1, int var2, int var3, Intent var4) {
               if (var2 == 234780) {
                  MobileVoiceOverlayModule.access$getReactApplicationContext(this.this$0).removeActivityEventListener(this);
                  val var5: Promise = this.$promise;
                  val var6: WindowUtils = WindowUtils.INSTANCE;
                  val var7: ReactApplicationContext = MobileVoiceOverlayModule.access$getReactApplicationContext(this.this$0);
                  var5.resolve(var6.canDrawOverlay(var7));
               }
            }

            @Override
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

   public override fun hideOverlay() {
      if (ThreadUtilsKt.isOnMainThread()) {
         access$getMobileVoiceOverlay(this).hideOverlay$mobile_voice_overlay_release();
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(this) {
            final MobileVoiceOverlayModule this$0;

            {
               this.this$0 = var1;
            }

            @Override
            public final void run() {
               MobileVoiceOverlayModule.access$getMobileVoiceOverlay(this.this$0).hideOverlay$mobile_voice_overlay_release();
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
               return;
            }

            ThreadUtilsKt.getUiHandler().post(new Runnable(this, var4) {
               final MobileVoiceOverlayData $overlayData$inlined;
               final MobileVoiceOverlayModule this$0;

               {
                  this.this$0 = var1;
                  this.$overlayData$inlined = var2;
               }

               @Override
               public final void run() {
                  MobileVoiceOverlayModule.access$getMobileVoiceOverlay(this.this$0).setData$mobile_voice_overlay_release(this.$overlayData$inlined);
               }
            });
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
               return;
            }

            ThreadUtilsKt.getUiHandler().post(new Runnable(this, var4) {
               final MobileVoiceOverlayAssets $overlayAssets$inlined;
               final MobileVoiceOverlayModule this$0;

               {
                  this.this$0 = var1;
                  this.$overlayAssets$inlined = var2;
               }

               @Override
               public final void run() {
                  MobileVoiceOverlayModule.access$getMobileVoiceOverlay(this.this$0).showOverlay$mobile_voice_overlay_release(this.$overlayAssets$inlined);
               }
            });
         }
      }
   }

   public companion object {
      public const val OVERLAY_REQUEST_CODE: Int
   }
}
