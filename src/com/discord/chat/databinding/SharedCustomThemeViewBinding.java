package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.customthemes.ThemePreviewView;
import com.discord.core.DCDButton;
import com.google.android.flexbox.FlexboxLayout;
import y0.a;

public final class SharedCustomThemeViewBinding implements ViewBinding {
   @NonNull
   public final TextView createdBy;
   @NonNull
   public final FlexboxLayout createdByContainer;
   @NonNull
   public final FlexboxLayout heading;
   @NonNull
   public final DCDButton previewBtn;
   @NonNull
   public final TextView previewHeading;
   @NonNull
   private final View rootView;
   @NonNull
   public final ThemePreviewView themePreview;

   private SharedCustomThemeViewBinding(
      @NonNull View var1,
      @NonNull TextView var2,
      @NonNull FlexboxLayout var3,
      @NonNull FlexboxLayout var4,
      @NonNull DCDButton var5,
      @NonNull TextView var6,
      @NonNull ThemePreviewView var7
   ) {
      this.rootView = var1;
      this.createdBy = var2;
      this.createdByContainer = var3;
      this.heading = var4;
      this.previewBtn = var5;
      this.previewHeading = var6;
      this.themePreview = var7;
   }

   @NonNull
   public static SharedCustomThemeViewBinding bind(@NonNull View var0) {
      int var1 = R.id.createdBy;
      TextView var2 = (TextView)a.a(var0, var1);
      if (var2 != null) {
         var1 = R.id.createdByContainer;
         FlexboxLayout var7 = (FlexboxLayout)a.a(var0, var1);
         if (var7 != null) {
            var1 = R.id.heading;
            FlexboxLayout var3 = (FlexboxLayout)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.previewBtn;
               DCDButton var6 = (DCDButton)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.previewHeading;
                  TextView var5 = (TextView)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.themePreview;
                     ThemePreviewView var4 = (ThemePreviewView)a.a(var0, var1);
                     if (var4 != null) {
                        return new SharedCustomThemeViewBinding(var0, var2, var7, var3, var6, var5, var4);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static SharedCustomThemeViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.shared_custom_theme_view, var1);
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
