package com.discord.qr.scanner

import B9.s
import com.discord.qr.scanner.events.OnQRCodeFoundEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.DCDQRScannerManagerDelegate
import com.facebook.react.viewmanagers.DCDQRScannerManagerInterface
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

@ReactModule(name = "DCDQRScanner")
public class QRScannerViewManager : ViewGroupManager<QRScanner>, DCDQRScannerManagerInterface<QRScanner> {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("onQRCodeFound", H.b(OnQRCodeFoundEvent.class)))
   private final val delegate: DCDQRScannerManagerDelegate<QRScanner, QRScannerViewManager>

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$0`(var0: QRScannerViewManager, var1: QRScanner, var2: java.lang.String): Unit {
      r.h(var2, "code");
      var0.reactEvents.emitEvent(var1, new OnQRCodeFoundEvent("SUCCEEDED", var2));
      return Unit.a;
   }

   @JvmStatic
   fun `createViewInstance$lambda$2$lambda$1`(var0: QRScannerViewManager, var1: QRScanner): Unit {
      var0.reactEvents.emitEvent(var1, new OnQRCodeFoundEvent("FAILED", null));
      return Unit.a;
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): QRScanner {
      r.h(var1, "reactContext");
      val var2: QRScanner = new QRScanner(var1, null, 0, 6, null);
      var2.setOnCodeFound(new d(this, var2));
      var2.setOnCodeNotFound(new e(this, var2));
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
