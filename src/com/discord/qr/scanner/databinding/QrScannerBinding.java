package com.discord.qr.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.qr.scanner.R;
import n1.a;

public final class QrScannerBinding implements ViewBinding {
   public final CodeScannerView qrScanner;
   private final View rootView;

   private QrScannerBinding(View var1, CodeScannerView var2) {
      this.rootView = var1;
      this.qrScanner = var2;
   }

   public static QrScannerBinding bind(View var0) {
      int var1 = R.id.qr_scanner;
      CodeScannerView var2 = (CodeScannerView)a.a(var0, var1);
      if (var2 != null) {
         return new QrScannerBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static QrScannerBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.qr_scanner, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @Override
   public View getRoot() {
      return this.rootView;
   }
}
