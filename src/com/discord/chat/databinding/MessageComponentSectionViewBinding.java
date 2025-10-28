package com.discord.chat.databinding;

import E1.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.google.android.flexbox.FlexboxLayout;

public final class MessageComponentSectionViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final ComponentFailedLabelViewBinding sectionComponentViewGroupErrorRow;
   @NonNull
   public final FlexboxLayout sectionLayoutBox;

   private MessageComponentSectionViewBinding(@NonNull View var1, @NonNull ComponentFailedLabelViewBinding var2, @NonNull FlexboxLayout var3) {
      this.rootView = var1;
      this.sectionComponentViewGroupErrorRow = var2;
      this.sectionLayoutBox = var3;
   }

   @NonNull
   public static MessageComponentSectionViewBinding bind(@NonNull View var0) {
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

   @NonNull
   public static MessageComponentSectionViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.message_component_section_view, var1);
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
