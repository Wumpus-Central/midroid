package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class DeserializationErrorViewBinding implements ViewBinding {
   @NonNull
   public final TextView causeHeader;
   @NonNull
   public final Button copyButton;
   @NonNull
   public final TextView exception;
   @NonNull
   public final TextView header;
   @NonNull
   public final TextView json;
   @NonNull
   public final TextView jsonHeader;
   @NonNull
   private final View rootView;

   private DeserializationErrorViewBinding(
      @NonNull View var1,
      @NonNull TextView var2,
      @NonNull Button var3,
      @NonNull TextView var4,
      @NonNull TextView var5,
      @NonNull TextView var6,
      @NonNull TextView var7
   ) {
      this.rootView = var1;
      this.causeHeader = var2;
      this.copyButton = var3;
      this.exception = var4;
      this.header = var5;
      this.json = var6;
      this.jsonHeader = var7;
   }

   @NonNull
   public static DeserializationErrorViewBinding bind(@NonNull View var0) {
      int var1 = R.id.cause_header;
      TextView var2 = (TextView)k5.a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.copy_button;
         Button var4 = (Button)k5.a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.exception;
            TextView var3 = (TextView)k5.a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.header;
               TextView var5 = (TextView)k5.a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.json;
                  TextView var7 = (TextView)k5.a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.json_header;
                     TextView var6 = (TextView)k5.a.a(var0, var1);
                     if (var6 != null) {
                        return new DeserializationErrorViewBinding(var0, var2, var4, var3, var5, var7, var6);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static DeserializationErrorViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.deserialization_error_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   @NonNull
   @Override
   public View getRoot() {
      return this.rootView;
   }
}
