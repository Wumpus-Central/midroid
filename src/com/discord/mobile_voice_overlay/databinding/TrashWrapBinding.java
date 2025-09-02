package com.discord.mobile_voice_overlay.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.mobile_voice_overlay.R;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class TrashWrapBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final SimpleDraweeView trashWrapIcon;
   @NonNull
   public final FrameLayout trashWrapTargetContainer;
   @NonNull
   public final FrameLayout trashWrapTargetZone;

   private TrashWrapBinding(@NonNull View var1, @NonNull SimpleDraweeView var2, @NonNull FrameLayout var3, @NonNull FrameLayout var4) {
      this.rootView = var1;
      this.trashWrapIcon = var2;
      this.trashWrapTargetContainer = var3;
      this.trashWrapTargetZone = var4;
   }

   @NonNull
   public static TrashWrapBinding bind(@NonNull View var0) {
      int var1 = R.id.trash_wrap_icon;
      SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.trash_wrap_target_container;
         FrameLayout var4 = (FrameLayout)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.trash_wrap_target_zone;
            FrameLayout var2 = (FrameLayout)a.a(var0, var1);
            if (var2 != null) {
               return new TrashWrapBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static TrashWrapBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.trash_wrap, var1);
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
