package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import y0.a;

public final class ConnectionsRoleTagViewBinding implements ViewBinding {
   @NonNull
   public final CardView connectionsRoleTagContainer;
   @NonNull
   public final TextView roleName;
   @NonNull
   private final View rootView;
   @NonNull
   public final ImageView verifiedCheckIcon;
   @NonNull
   public final ImageView verifiedCheckIconBackground;
   @NonNull
   public final FrameLayout verifiedCheckIconContainer;

   private ConnectionsRoleTagViewBinding(
      @NonNull View var1, @NonNull CardView var2, @NonNull TextView var3, @NonNull ImageView var4, @NonNull ImageView var5, @NonNull FrameLayout var6
   ) {
      this.rootView = var1;
      this.connectionsRoleTagContainer = var2;
      this.roleName = var3;
      this.verifiedCheckIcon = var4;
      this.verifiedCheckIconBackground = var5;
      this.verifiedCheckIconContainer = var6;
   }

   @NonNull
   public static ConnectionsRoleTagViewBinding bind(@NonNull View var0) {
      int var1 = R.id.connections_role_tag_container;
      CardView var4 = (CardView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.role_name;
         TextView var3 = (TextView)a.a(var0, var1);
         if (var3 != null) {
            var1 = R.id.verified_check_icon;
            ImageView var2 = (ImageView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.verified_check_icon_background;
               ImageView var5 = (ImageView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.verified_check_icon_container;
                  FrameLayout var6 = (FrameLayout)a.a(var0, var1);
                  if (var6 != null) {
                     return new ConnectionsRoleTagViewBinding(var0, var4, var3, var2, var5, var6);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ConnectionsRoleTagViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.connections_role_tag_view, var1);
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
