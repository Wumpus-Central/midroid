package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import o1.a;

public final class DeserializationErrorViewBinding implements ViewBinding {
   public final TextView causeHeader;
   public final Button copyButton;
   public final TextView exception;
   public final TextView header;
   public final TextView json;
   public final TextView jsonHeader;
   private final View rootView;

   private DeserializationErrorViewBinding(View var1, TextView var2, Button var3, TextView var4, TextView var5, TextView var6, TextView var7) {
      this.rootView = var1;
      this.causeHeader = var2;
      this.copyButton = var3;
      this.exception = var4;
      this.header = var5;
      this.json = var6;
      this.jsonHeader = var7;
   }

   public static DeserializationErrorViewBinding bind(View var0) {
      int var1 = R.id.cause_header;
      TextView var5 = (TextView)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.copy_button;
         Button var7 = (Button)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.exception;
            TextView var3 = (TextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.header;
               TextView var6 = (TextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.json;
                  TextView var2 = (TextView)a.a(var0, var1);
                  if (var2 != null) {
                     var1 = R.id.json_header;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        return new DeserializationErrorViewBinding(var0, var5, var7, var3, var6, var2, var4);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static DeserializationErrorViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.deserialization_error_view, var1);
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
