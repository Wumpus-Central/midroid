package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;

public final class TimestampViewBinding implements ViewBinding {
   private final TextView rootView;

   private TimestampViewBinding(TextView var1) {
      this.rootView = var1;
   }

   public static TimestampViewBinding bind(View var0) {
      if (var0 != null) {
         return new TimestampViewBinding((TextView)var0);
      } else {
         throw new NullPointerException("rootView");
      }
   }

   public static TimestampViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static TimestampViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.timestamp_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public TextView getRoot() {
      return this.rootView;
   }
}
