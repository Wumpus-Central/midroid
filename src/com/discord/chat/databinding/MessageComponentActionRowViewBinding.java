package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.flexbox.FlexboxLayout;
import o1.a;

public final class MessageComponentActionRowViewBinding implements ViewBinding {
   public final FlexboxLayout actionRowComponentViewGroup;
   public final ComponentFailedLabelViewBinding actionRowComponentViewGroupErrorRow;
   private final View rootView;

   private MessageComponentActionRowViewBinding(View var1, FlexboxLayout var2, ComponentFailedLabelViewBinding var3) {
      this.rootView = var1;
      this.actionRowComponentViewGroup = var2;
      this.actionRowComponentViewGroupErrorRow = var3;
   }

   public static MessageComponentActionRowViewBinding bind(View var0) {
      int var1 = R.id.action_row_component_view_group;
      FlexboxLayout var3 = (FlexboxLayout)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.action_row_component_view_group_error_row;
         View var2 = a.a(var0, var1);
         if (var2 != null) {
            return new MessageComponentActionRowViewBinding(var0, var3, ComponentFailedLabelViewBinding.bind(var2));
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentActionRowViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_action_row_view, var1);
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
