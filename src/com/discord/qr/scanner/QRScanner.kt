package com.discord.qr.scanner

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.webkit.URLUtil
import android.widget.FrameLayout
import com.budiyev.android.codescanner.CodeScanner
import com.budiyev.android.codescanner.CodeScannerView
import com.budiyev.android.codescanner.d
import com.budiyev.android.codescanner.h
import com.discord.crash_reporting.CrashReporting
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.qr.scanner.databinding.QrScannerBinding
import com.discord.theme.utils.ColorUtilsKt
import com.google.zxing.Result
import kotlin.jvm.internal.q

public class QRScanner  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : FrameLayout, d, h {
   private final val binding: QrScannerBinding
   private final val codeScanner: CodeScanner
   private final val runnable: Runnable
   public final var onCodeFound: (String) -> Unit
   public final var onCodeNotFound: () -> Unit

   fun QRScanner(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun QRScanner(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var4: QrScannerBinding = QrScannerBinding.inflate(LayoutInflater.from(var1), this);
      q.g(var4, "inflate(...)");
      this.binding = var4;
      val var5: CodeScanner = new CodeScanner(var1, var4.qrScanner);
      this.codeScanner = var5;
      this.runnable = new a(this);
      this.onCodeFound = <unrepresentable>.INSTANCE;
      this.onCodeNotFound = <unrepresentable>.INSTANCE;
      var4.getRoot().setBackgroundColor(-16777216);
      val var6: CodeScannerView = var4.qrScanner;
      q.g(var4.qrScanner, "qrScanner");
      var6.setVisibility(0);
      var4.qrScanner.setFrameColor(ColorUtilsKt.getColorCompat(var1, com.discord.theme.R.color.brand));
      var5.a0(-1);
      var5.f0(CodeScanner.K);
      var5.b0(this);
      var5.c0(this);
   }

   @JvmStatic
   fun `runnable$lambda$0`(var0: QRScanner) {
      q.h(var0, "this$0");
      ViewMeasureExtensionsKt.measureAndLayout(var0);
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.codeScanner.g0();
   }

   public override fun onDecoded(result: Result) {
      q.h(var1, "result");
      val var2: java.lang.String = var1.f();
      if (var2 != null && URLUtil.isValidUrl(var2)) {
         this.onCodeFound.invoke(var2);
      } else {
         this.onCodeNotFound.invoke();
      }
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.codeScanner.U();
   }

   public override fun onError(thrown: Throwable) {
      q.h(var1, "thrown");
      CrashReporting.captureException$default(CrashReporting.INSTANCE, var1, false, 2, null);
      this.onCodeNotFound.invoke();
   }

   public open fun requestLayout() {
      super.requestLayout();
      this.post(this.runnable);
   }
}
