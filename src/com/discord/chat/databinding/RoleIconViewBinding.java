package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import v2.a;

public final class RoleIconViewBinding implements ViewBinding {
   public final SimpleDraweeSpanTextView roleIconViewUnicodeEmoji;
   private final View rootView;

   private RoleIconViewBinding(View var1, SimpleDraweeSpanTextView var2) {
      this.rootView = var1;
      this.roleIconViewUnicodeEmoji = var2;
   }

   public static RoleIconViewBinding bind(View var0) {
      int var1 = R.id.role_icon_view_unicode_emoji;
      SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
      if (var2 != null) {
         return new RoleIconViewBinding(var0, var2);
      } else {
         throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
      }
   }

   public static RoleIconViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.role_icon_view, var1);
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
