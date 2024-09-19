package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import n1.a;

public final class ConnectionsRoleTagViewBinding implements ViewBinding {
   public final CardView connectionsRoleTagContainer;
   public final TextView roleName;
   private final View rootView;
   public final ImageView verifiedCheckIcon;
   public final ImageView verifiedCheckIconBackground;
   public final FrameLayout verifiedCheckIconContainer;

   private ConnectionsRoleTagViewBinding(View var1, CardView var2, TextView var3, ImageView var4, ImageView var5, FrameLayout var6) {
      this.rootView = var1;
      this.connectionsRoleTagContainer = var2;
      this.roleName = var3;
      this.verifiedCheckIcon = var4;
      this.verifiedCheckIconBackground = var5;
      this.verifiedCheckIconContainer = var6;
   }

   public static ConnectionsRoleTagViewBinding bind(View var0) {
      int var1 = R.id.connections_role_tag_container;
      CardView var6 = (CardView)a.a(var0, var1);
      if (var6 != null) {
         var1 = R.id.role_name;
         TextView var4 = (TextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.verified_check_icon;
            ImageView var5 = (ImageView)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.verified_check_icon_background;
               ImageView var2 = (ImageView)a.a(var0, var1);
               if (var2 != null) {
                  var1 = R.id.verified_check_icon_container;
                  FrameLayout var3 = (FrameLayout)a.a(var0, var1);
                  if (var3 != null) {
                     return new ConnectionsRoleTagViewBinding(var0, var6, var4, var5, var2, var3);
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ConnectionsRoleTagViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.connections_role_tag_view, var1);
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
