package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.ActionRowComponentView;
import com.google.android.flexbox.FlexboxLayout;
import n1.a;

public final class MessageComponentActionRowViewBinding implements ViewBinding {
   public final FlexboxLayout actionRowComponentViewGroup;
   public final ComponentFailedLabelViewBinding actionRowComponentViewGroupErrorRow;
   private final ActionRowComponentView rootView;

   private MessageComponentActionRowViewBinding(ActionRowComponentView var1, FlexboxLayout var2, ComponentFailedLabelViewBinding var3) {
      this.rootView = var1;
      this.actionRowComponentViewGroup = var2;
      this.actionRowComponentViewGroupErrorRow = var3;
   }

   public static MessageComponentActionRowViewBinding bind(View var0) {
      int var1 = R.id.action_row_component_view_group;
      FlexboxLayout var2 = (FlexboxLayout)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.action_row_component_view_group_error_row;
         View var3 = a.a(var0, var1);
         if (var3 != null) {
            ComponentFailedLabelViewBinding var4 = ComponentFailedLabelViewBinding.bind(var3);
            return new MessageComponentActionRowViewBinding((ActionRowComponentView)var0, var2, var4);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentActionRowViewBinding inflate(LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   public static MessageComponentActionRowViewBinding inflate(LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_action_row_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   public ActionRowComponentView getRoot() {
      return this.rootView;
   }
}
