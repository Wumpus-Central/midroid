package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import y0.a;

public final class MessageComponentSelectViewBinding implements ViewBinding {
   @NonNull
   public final ViewStub loadingDots;
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView selectComponentChevron;
   @NonNull
   public final SimpleDraweeSpanTextView selectComponentSelectionIcon;
   @NonNull
   public final MaterialTextView selectComponentSelectionText;
   @NonNull
   public final FlexboxLayout selectComponentSelectionsRoot;

   private MessageComponentSelectViewBinding(
      @NonNull View var1,
      @NonNull ViewStub var2,
      @NonNull SimpleDraweeView var3,
      @NonNull SimpleDraweeSpanTextView var4,
      @NonNull MaterialTextView var5,
      @NonNull FlexboxLayout var6
   ) {
      this.rootView = var1;
      this.loadingDots = var2;
      this.selectComponentChevron = var3;
      this.selectComponentSelectionIcon = var4;
      this.selectComponentSelectionText = var5;
      this.selectComponentSelectionsRoot = var6;
   }

   @NonNull
   public static MessageComponentSelectViewBinding bind(@NonNull View var0) {
      int var1 = R.id.loading_dots;
      ViewStub var3 = (ViewStub)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.select_component_chevron;
         SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.select_component_selection_icon;
            SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.select_component_selection_text;
               MaterialTextView var6 = (MaterialTextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.select_component_selections_root;
                  FlexboxLayout var4 = (FlexboxLayout)a.a(var0, var1);
                  if (var4 != null) {
                     return new MessageComponentSelectViewBinding(var0, var3, var5, var2, var6, var4);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageComponentSelectViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_select_view, var1);
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
