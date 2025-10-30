package com.discord.qr.scanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.budiyev.android.codescanner.CodeScannerView;
import com.discord.qr.scanner.R;
import e4.a;

public final class QrScannerBinding implements ViewBinding {
   @NonNull
   public final CodeScannerView qrScanner;
   @NonNull
   private final View rootView;

   private QrScannerBinding(@NonNull View var1, @NonNull CodeScannerView var2) {
      this.rootView = var1;
      this.qrScanner = var2;
   }

   @NonNull
   public static QrScannerBinding bind(@NonNull View var0) {
      int var1 = R.id.qr_scanner;
      CodeScannerView var2 = (CodeScannerView)a.a(var0, var1);
      if (var2 != null) {
         return new QrScannerBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static QrScannerBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.qr_scanner, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   public View getRoot() {
      return this.rootView;
   }
}
