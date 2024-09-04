package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ButtonComponentView;
import com.discord.progress_dots.ProgressDots;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import n1.a;

public final class MessageComponentButtonViewBinding implements ViewBinding {
   public final MaterialButton button;
   public final SimpleDraweeSpanTextView emoji;
   public final MaterialTextView label;
   public final SimpleDraweeView linkIcon;
   public final ProgressDots loadingDots;
   private final ButtonComponentView rootView;

   private MessageComponentButtonViewBinding(
      ButtonComponentView var1, MaterialButton var2, SimpleDraweeSpanTextView var3, MaterialTextView var4, SimpleDraweeView var5, ProgressDots var6
   ) {
      this.rootView = var1;
      this.button = var2;
      this.emoji = var3;
      this.label = var4;
      this.linkIcon = var5;
      this.loadingDots = var6;
   }

   public static MessageComponentButtonViewBinding bind(View var0) {
      int var1 = R.id.button;
      MaterialButton var2 = (MaterialButton)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.emoji;
         SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.label;
            MaterialTextView var3 = (MaterialTextView)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.link_icon;
               SimpleDraweeView var4 = (SimpleDraweeView)a.a(var0, var1);
               if (var4 != null) {
                  var1 = R.id.loading_dots;
                  ProgressDots var6 = (ProgressDots)a.a(var0, var1);
                  if (var6 != null) {
                     return new MessageComponentButtonViewBinding((ButtonComponentView)var0, var2, var5, var3, var4, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentButtonViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentButtonViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_button_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ButtonComponentView getRoot() {
      return this.rootView;
   }
}
