package com.discord.chat.databinding;

import E1.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;

public final class RoleIconViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;
   @NonNull
   private final View rootView;

   private RoleIconViewBinding(@NonNull View var1, @NonNull SimpleDraweeSpanTextView var2) {
      this.rootView = var1;
      this.roleIconViewUnicodeEmoji = var2;
   }

   @NonNull
   public static RoleIconViewBinding bind(@NonNull View var0) {
      int var1 = R.id.role_icon_view_unicode_emoji;
      SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
      if (var2 != null) {
         return new RoleIconViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   @NonNull
   public static RoleIconViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_icon_view, var1);
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
