package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ReactionsView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class ForumPostActionBarViewBinding implements ViewBinding {
   public final AddReactionView addReaction;
   public final DCDButton followButton;
   public final Barrier footerBarrier;
   public final View footerDivider;
   public final Barrier headerBarrier;
   public final View headerDivider;
   public final DCDButton otherReactionsCount;
   public final ReactionsView reactionsView;
   private final View rootView;
   public final DCDButton shareButton;
   public final DCDButton sharePromptCloseButton;
   public final ConstraintLayout sharePromptContainer;
   public final DCDButton sharePromptCopyLinkButton;
   public final SimpleDraweeView sharePromptIcon;
   public final SimpleDraweeSpanTextView sharePromptSubtitle;
   public final TextView sharePromptTitle;
   public final Space spacer;
   public final Space startSpacer;

   private ForumPostActionBarViewBinding(
      View var1,
      AddReactionView var2,
      DCDButton var3,
      Barrier var4,
      View var5,
      Barrier var6,
      View var7,
      DCDButton var8,
      ReactionsView var9,
      DCDButton var10,
      DCDButton var11,
      ConstraintLayout var12,
      DCDButton var13,
      SimpleDraweeView var14,
      SimpleDraweeSpanTextView var15,
      TextView var16,
      Space var17,
      Space var18
   ) {
      this.rootView = var1;
      this.addReaction = var2;
      this.followButton = var3;
      this.footerBarrier = var4;
      this.footerDivider = var5;
      this.headerBarrier = var6;
      this.headerDivider = var7;
      this.otherReactionsCount = var8;
      this.reactionsView = var9;
      this.shareButton = var10;
      this.sharePromptCloseButton = var11;
      this.sharePromptContainer = var12;
      this.sharePromptCopyLinkButton = var13;
      this.sharePromptIcon = var14;
      this.sharePromptSubtitle = var15;
      this.sharePromptTitle = var16;
      this.spacer = var17;
      this.startSpacer = var18;
   }

   public static ForumPostActionBarViewBinding bind(View var0) {
      int var1 = R.id.add_reaction;
      AddReactionView var18 = (AddReactionView)a.a(var0, var1);
      if (var18 != null) {
         var1 = R.id.follow_button;
         DCDButton var4 = (DCDButton)a.a(var0, var1);
         if (var4 != null) {
            var1 = R.id.footer_barrier;
            Barrier var2 = (Barrier)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.footer_divider;
               View var14 = a.a(var0, var1);
               if (var14 != null) {
                  var1 = R.id.header_barrier;
                  Barrier var5 = (Barrier)a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.header_divider;
                     View var16 = a.a(var0, var1);
                     if (var16 != null) {
                        var1 = R.id.other_reactions_count;
                        DCDButton var17 = (DCDButton)a.a(var0, var1);
                        if (var17 != null) {
                           var1 = R.id.reactions_view;
                           ReactionsView var11 = (ReactionsView)a.a(var0, var1);
                           if (var11 != null) {
                              var1 = R.id.share_button;
                              DCDButton var7 = (DCDButton)a.a(var0, var1);
                              if (var7 != null) {
                                 var1 = R.id.share_prompt_close_button;
                                 DCDButton var12 = (DCDButton)a.a(var0, var1);
                                 if (var12 != null) {
                                    var1 = R.id.share_prompt_container;
                                    ConstraintLayout var9 = (ConstraintLayout)a.a(var0, var1);
                                    if (var9 != null) {
                                       var1 = R.id.share_prompt_copy_link_button;
                                       DCDButton var3 = (DCDButton)a.a(var0, var1);
                                       if (var3 != null) {
                                          var1 = R.id.share_prompt_icon;
                                          SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
                                          if (var13 != null) {
                                             var1 = R.id.share_prompt_subtitle;
                                             SimpleDraweeSpanTextView var6 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                             if (var6 != null) {
                                                var1 = R.id.share_prompt_title;
                                                TextView var8 = (TextView)a.a(var0, var1);
                                                if (var8 != null) {
                                                   var1 = R.id.spacer;
                                                   Space var10 = (Space)a.a(var0, var1);
                                                   if (var10 != null) {
                                                      var1 = R.id.start_spacer;
                                                      Space var15 = (Space)a.a(var0, var1);
                                                      if (var15 != null) {
                                                         return new ForumPostActionBarViewBinding(
                                                            var0,
                                                            var18,
                                                            var4,
                                                            var2,
                                                            var14,
                                                            var5,
                                                            var16,
                                                            var17,
                                                            var11,
                                                            var7,
                                                            var12,
                                                            var9,
                                                            var3,
                                                            var13,
                                                            var6,
                                                            var8,
                                                            var10,
                                                            var15
                                                         );
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
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

   public static ForumPostActionBarViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forum_post_action_bar_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
