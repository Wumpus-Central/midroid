package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import o1.a;

public final class MessageComponentButtonViewBinding implements ViewBinding {
   public final MaterialButton button;
   public final SimpleDraweeSpanTextView emoji;
   public final MaterialTextView label;
   public final LinearLayout labelContainer;
   public final SimpleDraweeView linkIcon;
   public final ViewStub loadingDotsStub;
   private final View rootView;

   private MessageComponentButtonViewBinding(
      View var1, MaterialButton var2, SimpleDraweeSpanTextView var3, MaterialTextView var4, LinearLayout var5, SimpleDraweeView var6, ViewStub var7
   ) {
      this.rootView = var1;
      this.button = var2;
      this.emoji = var3;
      this.label = var4;
      this.labelContainer = var5;
      this.linkIcon = var6;
      this.loadingDotsStub = var7;
   }

   public static MessageComponentButtonViewBinding bind(View var0) {
      int var1 = R.id.button;
      MaterialButton var2 = (MaterialButton)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.emoji;
         SimpleDraweeSpanTextView var4 = (SimpleDraweeSpanTextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.label;
            MaterialTextView var3 = (MaterialTextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.label_container;
               LinearLayout var5 = (LinearLayout)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.link_icon;
                  SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
                  if (var6 != null) {
                     var1 = R.id.loading_dots_stub;
                     ViewStub var7 = (ViewStub)a.a(var0, var1);
                     if (var7 != null) {
                        return new MessageComponentButtonViewBinding(var0, var2, var4, var3, var5, var6, var7);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentButtonViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_button_view, var1);
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
