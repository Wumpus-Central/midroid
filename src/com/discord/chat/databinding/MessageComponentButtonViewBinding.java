package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import y0.a;

public final class MessageComponentButtonViewBinding implements ViewBinding {
   @NonNull
   public final MaterialButton button;
   @NonNull
   public final SimpleDraweeSpanTextView emoji;
   @NonNull
   public final MaterialTextView label;
   @NonNull
   public final LinearLayout labelContainer;
   @NonNull
   public final SimpleDraweeView linkIcon;
   @NonNull
   public final ViewStub loadingDots;
   @NonNull
   private final View rootView;

   private MessageComponentButtonViewBinding(
      @NonNull View var1,
      @NonNull MaterialButton var2,
      @NonNull SimpleDraweeSpanTextView var3,
      @NonNull MaterialTextView var4,
      @NonNull LinearLayout var5,
      @NonNull SimpleDraweeView var6,
      @NonNull ViewStub var7
   ) {
      this.rootView = var1;
      this.button = var2;
      this.emoji = var3;
      this.label = var4;
      this.labelContainer = var5;
      this.linkIcon = var6;
      this.loadingDots = var7;
   }

   @NonNull
   public static MessageComponentButtonViewBinding bind(@NonNull View var0) {
      int var1 = R.id.button;
      MaterialButton var4 = (MaterialButton)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.emoji;
         SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.label;
            MaterialTextView var7 = (MaterialTextView)a.a(var0, var1);
            if (var7 != null) {
               var1 = R.id.label_container;
               LinearLayout var6 = (LinearLayout)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.link_icon;
                  SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.loading_dots;
                     ViewStub var3 = (ViewStub)a.a(var0, var1);
                     if (var3 != null) {
                        return new MessageComponentButtonViewBinding(var0, var4, var2, var7, var6, var5, var3);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageComponentButtonViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_button_view, var1);
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
