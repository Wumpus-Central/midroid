package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import n1.a;

public final class EmbedFieldViewBinding implements ViewBinding {
   public final SimpleDraweeSpanTextView name;
   private final View rootView;
   public final SimpleDraweeSpanTextView value;

   private EmbedFieldViewBinding(View var1, SimpleDraweeSpanTextView var2, SimpleDraweeSpanTextView var3) {
      this.rootView = var1;
      this.name = var2;
      this.value = var3;
   }

   public static EmbedFieldViewBinding bind(View var0) {
      int var1 = R.id.name;
      SimpleDraweeSpanTextView var3 = (SimpleDraweeSpanTextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.value;
         SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
         if (var2 != null) {
            return new EmbedFieldViewBinding(var0, var3, var2);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static EmbedFieldViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.embed_field_view, var1);
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
