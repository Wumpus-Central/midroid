package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import n1.a;

public final class ErrorMessageViewBinding implements ViewBinding {
   public final TextView errorLabel;
   public final TextView header;
   private final View rootView;

   private ErrorMessageViewBinding(View var1, TextView var2, TextView var3) {
      this.rootView = var1;
      this.errorLabel = var2;
      this.header = var3;
   }

   public static ErrorMessageViewBinding bind(View var0) {
      int var1 = R.id.error_label;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.header;
         TextView var2 = (TextView)a.a(var0, var1);
         if (var2 != null) {
            return new ErrorMessageViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ErrorMessageViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.error_message_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
