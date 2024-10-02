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
import o1.a;

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
      ClanTagChipletView var7 = (ClanTagChipletView)a.a(var0, var1);
      if (var7 != null) {
         var1 = R.id.thread_embed_icon;
         SimpleDraweeView var2 = (SimpleDraweeView)a.a(var0, var1);
         if (var2 != null) {
            var1 = R.id.thread_embed_messages_count;
            TextView var4 = (TextView)a.a(var0, var1);
            if (var4 != null) {
               var1 = R.id.thread_embed_most_recent_message_avatar;
               SimpleDraweeView var8 = (SimpleDraweeView)a.a(var0, var1);
               if (var8 != null) {
                  var1 = R.id.thread_embed_most_recent_message_content;
                  SimpleDraweeSpanTextView var9 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var9 != null) {
                     var1 = R.id.thread_embed_most_recent_message_header;
                     LinearLayout var3 = (LinearLayout)a.a(var0, var1);
                     if (var3 != null) {
                        var1 = R.id.thread_embed_most_recent_message_name;
                        TextView var6 = (TextView)a.a(var0, var1);
                        if (var6 != null) {
                           var1 = R.id.thread_embed_name;
                           TextView var5 = (TextView)a.a(var0, var1);
                           if (var5 != null) {
                              return new ThreadEmbedViewBinding(var0, var7, var2, var4, var8, var9, var3, var6, var5);
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
