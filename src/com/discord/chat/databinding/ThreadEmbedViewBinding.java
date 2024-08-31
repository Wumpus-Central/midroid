package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import v2.a;

public final class ThreadEmbedViewBinding implements ViewBinding {
   private final View rootView;
   public final ClanTagChipletView tagChiplet;
   public final SimpleDraweeView threadEmbedIcon;
   public final TextView threadEmbedMessagesCount;
   public final SimpleDraweeView threadEmbedMostRecentMessageAvatar;
   public final SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent;
   public final LinearLayout threadEmbedMostRecentMessageHeader;
   public final TextView threadEmbedMostRecentMessageName;
   public final TextView threadEmbedName;

   private ThreadEmbedViewBinding(
      View var1,
      ClanTagChipletView var2,
      SimpleDraweeView var3,
      TextView var4,
      SimpleDraweeView var5,
      SimpleDraweeSpanTextView var6,
      LinearLayout var7,
      TextView var8,
      TextView var9
   ) {
      this.rootView = var1;
      this.tagChiplet = var2;
      this.threadEmbedIcon = var3;
      this.threadEmbedMessagesCount = var4;
      this.threadEmbedMostRecentMessageAvatar = var5;
      this.threadEmbedMostRecentMessageContent = var6;
      this.threadEmbedMostRecentMessageHeader = var7;
      this.threadEmbedMostRecentMessageName = var8;
      this.threadEmbedName = var9;
   }

   public static ThreadEmbedViewBinding bind(View var0) {
      int var1 = R.id.tag_chiplet;
      ClanTagChipletView var9 = (ClanTagChipletView)a.a(var0, var1);
      if (var9 != null) {
         var1 = R.id.thread_embed_icon;
         SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
         if (var8 != null) {
            var1 = R.id.thread_embed_messages_count;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.thread_embed_most_recent_message_avatar;
               SimpleDraweeView var5 = (SimpleDraweeView)a.a(var0, var1);
               if (var5 != null) {
                  var1 = R.id.thread_embed_most_recent_message_content;
                  SimpleDraweeSpanTextView var4 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var4 != null) {
                     var1 = R.id.thread_embed_most_recent_message_header;
                     LinearLayout var6 = (LinearLayout)a.a(var0, var1);
                     if (var6 != null) {
                        var1 = R.id.thread_embed_most_recent_message_name;
                        TextView var3 = (TextView)a.a(var0, var1);
                        if (var3 != null) {
                           var1 = R.id.thread_embed_name;
                           TextView var7 = (TextView)a.a(var0, var1);
                           if (var7 != null) {
                              return new ThreadEmbedViewBinding(var0, var9, var8, var2, var5, var4, var6, var3, var7);
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   public static ThreadEmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.thread_embed_view, var1);
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
