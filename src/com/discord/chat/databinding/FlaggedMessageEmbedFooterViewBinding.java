package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import v2.a;

public final class FlaggedMessageEmbedFooterViewBinding implements ViewBinding {
   public final TextView flaggedMessageKeyword;
   public final TextView flaggedMessageRuleName;
   private final View rootView;
   public final ImageView separatorDot;

   private FlaggedMessageEmbedFooterViewBinding(View var1, TextView var2, TextView var3, ImageView var4) {
      this.rootView = var1;
      this.flaggedMessageKeyword = var2;
      this.flaggedMessageRuleName = var3;
      this.separatorDot = var4;
   }

   public static FlaggedMessageEmbedFooterViewBinding bind(View var0) {
      int var1 = R.id.flagged_message_keyword;
      TextView var3 = (TextView)a.a(var0, var1);
      if (var3 != null) {
         var1 = R.id.flagged_message_rule_name;
         TextView var4 = (TextView)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.separator_dot;
            ImageView var2 = (ImageView)a.a(var0, var1);
            if (var2 != null) {
               return new FlaggedMessageEmbedFooterViewBinding(var0, var3, var4, var2);
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static FlaggedMessageEmbedFooterViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.flagged_message_embed_footer_view, var1);
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
