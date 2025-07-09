package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.flexbox.FlexboxLayout;
import z0.a;

public final class MessageComponentSectionViewBinding implements ViewBinding {
   private final View rootView;
   public final ComponentFailedLabelViewBinding sectionComponentViewGroupErrorRow;
   public final FlexboxLayout sectionLayoutBox;

   private MessageComponentSectionViewBinding(View var1, ComponentFailedLabelViewBinding var2, FlexboxLayout var3) {
      this.rootView = var1;
      this.sectionComponentViewGroupErrorRow = var2;
      this.sectionLayoutBox = var3;
   }

   public static MessageComponentSectionViewBinding bind(View var0) {
      int var1 = R.id.section_component_view_group_error_row;
      View var2 = a.a(var0, var1);
      if (var2 != null) {
         ComponentFailedLabelViewBinding var4 = ComponentFailedLabelViewBinding.bind(var2);
         var1 = R.id.section_layout_box;
         FlexboxLayout var3 = (FlexboxLayout)a.a(var0, var1);
         if (var3 != null) {
            return new MessageComponentSectionViewBinding(var0, var4, var3);
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static MessageComponentSectionViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_section_view, var1);
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
