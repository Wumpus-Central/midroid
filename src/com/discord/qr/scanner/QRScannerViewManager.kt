package com.discord.qr.scanner

import com.discord.qr.scanner.events.OnQRCodeFoundEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.DCDQRScannerManagerDelegate
import com.facebook.react.viewmanagers.DCDQRScannerManagerInterface
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.g0
import kotlin.jvm.internal.q
import nh.w

@ReactModule(name = "DCDQRScanner")
public class QRScannerViewManager : ViewGroupManager<QRScanner>, DCDQRScannerManagerInterface<QRScanner> {
   private final val delegate: DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager>
   private final val reactEvents: ReactEvents = new ReactEvents(w.a("onQRCodeFound", g0.b(OnQRCodeFoundEvent.class)))

   protected open fun createViewInstance(reactContext: ThemedReactContext): QRScanner {
      q.h(var1, "reactContext");
      val var2: QRScanner = new QRScanner(var1, null, 0, 6, null);
      var2.setOnCodeFound(new Function1(this, var2) {
         final QRScanner $scanner;
         final QRScannerViewManager this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$scanner = var2;
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "code");
            QRScannerViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$scanner, new OnQRCodeFoundEvent("SUCCEEDED", var1));
         }
      });
      var2.setOnCodeNotFound(new Function0(this, var2) {
         final QRScanner $scanner;
         final QRScannerViewManager this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$scanner = var2;
         }

         public final void invoke() {
            QRScannerViewManager.access$getReactEvents$p(this.this$0).emitEvent(this.$scanner, new OnQRCodeFoundEvent("FAILED", null));
         }
      });
      return var2;
   }

   protected open fun getDelegate(): DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager> {
      return this.delegate;
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDQRScanner";
   }

   public companion object {
      public const val NAME: String
   }
}
