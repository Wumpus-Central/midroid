package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.overlapping_circles.OverlappingCirclesView;
import n1.a;

public final class ActivityInstanceEmbedViewBinding implements ViewBinding {
   public final DCDButton launchButton;
   public final OverlappingCirclesView participants;
   private final View rootView;
   public final TextView statusText;
   public final Barrier statusTextBarrier;

   private ActivityInstanceEmbedViewBinding(View var1, DCDButton var2, OverlappingCirclesView var3, TextView var4, Barrier var5) {
      this.rootView = var1;
      this.launchButton = var2;
      this.participants = var3;
      this.statusText = var4;
      this.statusTextBarrier = var5;
   }

   public static ActivityInstanceEmbedViewBinding bind(View var0) {
      int var1 = R.id.launch_button;
      DCDButton var5 = (DCDButton)a.a(var0, var1);
      if (var5 != null) {
         var1 = R.id.participants;
         OverlappingCirclesView var2 = (OverlappingCirclesView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.status_text;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.status_text_barrier;
               Barrier var3 = (Barrier)a.a(var0, var1);
               if (var3 != null) {
                  return new ActivityInstanceEmbedViewBinding(var0, var5, var2, var4, var3);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ActivityInstanceEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.activity_instance_embed_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
