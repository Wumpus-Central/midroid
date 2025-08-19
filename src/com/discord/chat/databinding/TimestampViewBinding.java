package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class TimestampViewBinding implements ViewBinding {
   @NonNull
   private final TextView rootView;

   private TimestampViewBinding(@NonNull TextView var1) {
      this.rootView = var1;
   }

   @NonNull
   public static TimestampViewBinding bind(@NonNull View var0) {
      if (var0 != null) {
         return new TimestampViewBinding((TextView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   @NonNull
   public static TimestampViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static TimestampViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.timestamp_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public TextView getRoot() {
      return this.rootView;
   }
}
