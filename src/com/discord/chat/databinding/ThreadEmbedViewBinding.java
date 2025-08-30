package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.ClanTagChipletView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class ThreadEmbedViewBinding implements ViewBinding {
   @NonNull
   private final View rootView;
   @NonNull
   public final ClanTagChipletView tagChiplet;
   @NonNull
   public final SimpleDraweeView threadEmbedIcon;
   @NonNull
   public final TextView threadEmbedMessagesCount;
   @NonNull
   public final SimpleDraweeView threadEmbedMostRecentMessageAvatar;
   @NonNull
   public final SimpleDraweeSpanTextView threadEmbedMostRecentMessageContent;
   @NonNull
   public final LinearLayout threadEmbedMostRecentMessageHeader;
   @NonNull
   public final TextView threadEmbedMostRecentMessageName;
   @NonNull
   public final TextView threadEmbedName;

   private ThreadEmbedViewBinding(
      @NonNull View var1,
      @NonNull ClanTagChipletView var2,
      @NonNull SimpleDraweeView var3,
      @NonNull TextView var4,
      @NonNull SimpleDraweeView var5,
      @NonNull SimpleDraweeSpanTextView var6,
      @NonNull LinearLayout var7,
      @NonNull TextView var8,
      @NonNull TextView var9
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

   @NonNull
   public static ThreadEmbedViewBinding bind(@NonNull View var0) {
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
               SimpleDraweeView var6 = (SimpleDraweeView)a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.thread_embed_most_recent_message_content;
                  SimpleDraweeSpanTextView var3 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var3 != null) {
                     var1 = R.id.thread_embed_most_recent_message_header;
                     LinearLayout var5 = (LinearLayout)a.a(var0, var1);
                     if (var5 != null) {
                        var1 = R.id.thread_embed_most_recent_message_name;
                        TextView var7 = (TextView)a.a(var0, var1);
                        if (var7 != null) {
                           var1 = R.id.thread_embed_name;
                           TextView var4 = (TextView)a.a(var0, var1);
                           if (var4 != null) {
                              return new ThreadEmbedViewBinding(var0, var9, var8, var2, var6, var3, var5, var7, var4);
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

   @NonNull
   public static ThreadEmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.thread_embed_view, var1);
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
