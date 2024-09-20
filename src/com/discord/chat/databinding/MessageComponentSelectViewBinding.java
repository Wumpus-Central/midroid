package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.SelectComponentView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textview.MaterialTextView;
import n1.a;

public final class MessageComponentSelectViewBinding implements ViewBinding {
   private final SelectComponentView rootView;
   public final SimpleDraweeView selectComponentChevron;
   public final ProgressBar selectComponentLoading;
   public final SimpleDraweeSpanTextView selectComponentSelectionIcon;
   public final MaterialTextView selectComponentSelectionText;
   public final FlexboxLayout selectComponentSelectionsRoot;

   private MessageComponentSelectViewBinding(
      SelectComponentView var1, SimpleDraweeView var2, ProgressBar var3, SimpleDraweeSpanTextView var4, MaterialTextView var5, FlexboxLayout var6
   ) {
      this.rootView = var1;
      this.selectComponentChevron = var2;
      this.selectComponentLoading = var3;
      this.selectComponentSelectionIcon = var4;
      this.selectComponentSelectionText = var5;
      this.selectComponentSelectionsRoot = var6;
   }

   public static MessageComponentSelectViewBinding bind(View var0) {
      int var1 = R.id.select_component_chevron;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.select_component_loading;
         ProgressBar var4 = (ProgressBar)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.select_component_selection_icon;
            SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.select_component_selection_text;
               MaterialTextView var2 = (MaterialTextView)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.select_component_selections_root;
                  FlexboxLayout var6 = (FlexboxLayout)a.a(var0, var1);
                  if (var6 != null) {
                     return new MessageComponentSelectViewBinding((SelectComponentView)var0, var3, var4, var5, var2, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentSelectViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentSelectViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_select_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public SelectComponentView getRoot() {
      return this.rootView;
   }
}
