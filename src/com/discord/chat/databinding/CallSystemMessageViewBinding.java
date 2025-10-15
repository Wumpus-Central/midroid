package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.overlapping_circles.OverlappingCirclesView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class CallSystemMessageViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView icon;
   @NonNull
   public final TextView info;
   @NonNull
   public final TextView message;
   @NonNull
   public final OverlappingCirclesView participants;
   @NonNull
   private final View rootView;

   private CallSystemMessageViewBinding(
      @NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull TextView var3, @NonNull TextView var4, @NonNull OverlappingCirclesView var5
   ) {
      this.rootView = var1;
      this.icon = var2;
      this.info = var3;
      this.message = var4;
      this.participants = var5;
   }

   @NonNull
   public static CallSystemMessageViewBinding bind(@NonNull View var0) {
      int var1 = R.id.icon;
      SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.info;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.message;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.participants;
               OverlappingCirclesView var5 = (OverlappingCirclesView)a.a(var0, var1);
               if (var5 != null) {
                  return new CallSystemMessageViewBinding(var0, var2, var3, var4, var5);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static CallSystemMessageViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.call_system_message_view, var1);
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
