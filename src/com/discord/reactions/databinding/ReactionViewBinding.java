package com.discord.reactions.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextSwitcher;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.reactions.R;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import n1.a;

public final class ReactionViewBinding implements ViewBinding {
   public final TextView reactionCount1;
   public final TextView reactionCount2;
   public final TextSwitcher reactionCountSwitcher;
   public final SimpleDraweeSpanTextView reactionEmoji;
   private final View rootView;

   private ReactionViewBinding(View var1, TextView var2, TextView var3, TextSwitcher var4, SimpleDraweeSpanTextView var5) {
      this.rootView = var1;
      this.reactionCount1 = var2;
      this.reactionCount2 = var3;
      this.reactionCountSwitcher = var4;
      this.reactionEmoji = var5;
   }

   public static ReactionViewBinding bind(View var0) {
      int var1 = R.id.reaction_count_1;
      TextView var4 = (TextView)a.a(var0, var1);
      if (var4 != null) {
         var1 = R.id.reaction_count_2;
         TextView var5 = (TextView)a.a(var0, var1);
         if (var5 != null) {
            var1 = R.id.reaction_count_switcher;
            TextSwitcher var3 = (TextSwitcher)a.a(var0, var1);
            if (var3 != null) {
               var1 = R.id.reaction_emoji;
               SimpleDraweeSpanTextView var2 = (SimpleDraweeSpanTextView)a.a(var0, var1);
               if (var2 != null) {
                  return new ReactionViewBinding(var0, var4, var5, var3, var2);
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ReactionViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.reaction_view, var1);
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
