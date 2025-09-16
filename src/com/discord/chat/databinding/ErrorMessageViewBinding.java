package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import y0.a;

public final class ErrorMessageViewBinding implements ViewBinding {
   @NonNull
   public final TextView errorLabel;
   @NonNull
   public final TextView header;
   @NonNull
   private final View rootView;
   @NonNull
   public final TextView seeMoreButton;

   private ErrorMessageViewBinding(@NonNull View var1, @NonNull TextView var2, @NonNull TextView var3, @NonNull TextView var4) {
      this.rootView = var1;
      this.errorLabel = var2;
      this.header = var3;
      this.seeMoreButton = var4;
   }

   @NonNull
   public static ErrorMessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.error_label;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.header;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.see_more_button;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               return new ErrorMessageViewBinding(var0, var2, var3, var4);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ErrorMessageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.error_message_view, var1);
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
