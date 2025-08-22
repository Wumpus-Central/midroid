package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import y0.a;

public final class ReactionViewBinding implements ViewBinding {
   @NonNull
   public final TextView reactionCount1;
   @NonNull
   public final TextView reactionCount2;
   @NonNull
   public final TextSwitcher reactionCountSwitcher;
   @NonNull
   public final SimpleDraweeSpanTextView reactionEmoji;
   @NonNull
   public final TextView reactionLabelLeft;
   @NonNull
   public final TextView reactionLabelRight;
   @NonNull
   private final View rootView;

   private ReactionViewBinding(
      @NonNull View var1,
      @NonNull TextView var2,
      @NonNull TextView var3,
      @NonNull TextSwitcher var4,
      @NonNull SimpleDraweeSpanTextView var5,
      @NonNull TextView var6,
      @NonNull TextView var7
   ) {
      this.rootView = var1;
      this.reactionCount1 = var2;
      this.reactionCount2 = var3;
      this.reactionCountSwitcher = var4;
      this.reactionEmoji = var5;
      this.reactionLabelLeft = var6;
      this.reactionLabelRight = var7;
   }

   @NonNull
   public static ReactionViewBinding bind(@NonNull View var0) {
      int var1 = R.id.reaction_count_1;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.reaction_count_2;
         TextView var4 = (TextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.reaction_count_switcher;
            TextSwitcher var5 = (TextSwitcher)a.a(var0, var1);
            if (var5 != null) {
               var1 = R.id.reaction_emoji;
               SimpleDraweeSpanTextView var6 = (SimpleDraweeSpanTextView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.reaction_label_left;
                  TextView var7 = (TextView)a.a(var0, var1);
                  if (var7 != null) {
                     var1 = R.id.reaction_label_right;
                     TextView var2 = (TextView)a.a(var0, var1);
                     if (var2 != null) {
                        return new ReactionViewBinding(var0, var3, var4, var5, var6, var7, var2);
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static ReactionViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.reaction_view, var1);
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
