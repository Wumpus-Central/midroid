package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.core.DCDButton;
import com.discord.reactions.AddReactionView;
import com.discord.reactions.ShortcutsFlexbox;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import x1.a;

public final class ForumPostActionBarViewBinding implements ViewBinding {
   @NonNull
   public final AddReactionView addReaction;
   @NonNull
   public final DCDButton followButton;
   @NonNull
   public final Barrier footerBarrier;
   @NonNull
   public final View footerDivider;
   @NonNull
   public final Barrier headerBarrier;
   @NonNull
   public final View headerDivider;
   @NonNull
   public final DCDButton otherReactionsCount;
   @NonNull
   public final ShortcutsFlexbox reactionsView;
   @NonNull
   private final View rootView;
   @NonNull
   public final DCDButton shareButton;
   @NonNull
   public final DCDButton sharePromptCloseButton;
   @NonNull
   public final ConstraintLayout sharePromptContainer;
   @NonNull
   public final DCDButton sharePromptCopyLinkButton;
   @NonNull
   public final SimpleDraweeView sharePromptIcon;
   @NonNull
   public final SimpleDraweeSpanTextView sharePromptSubtitle;
   @NonNull
   public final TextView sharePromptTitle;
   @NonNull
   public final Space spacer;
   @NonNull
   public final Space startSpacer;

   private ForumPostActionBarViewBinding(
      @NonNull View var1,
      @NonNull AddReactionView var2,
      @NonNull DCDButton var3,
      @NonNull Barrier var4,
      @NonNull View var5,
      @NonNull Barrier var6,
      @NonNull View var7,
      @NonNull DCDButton var8,
      @NonNull ShortcutsFlexbox var9,
      @NonNull DCDButton var10,
      @NonNull DCDButton var11,
      @NonNull ConstraintLayout var12,
      @NonNull DCDButton var13,
      @NonNull SimpleDraweeView var14,
      @NonNull SimpleDraweeSpanTextView var15,
      @NonNull TextView var16,
      @NonNull Space var17,
      @NonNull Space var18
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

   @NonNull
   public static ForumPostActionBarViewBinding bind(@NonNull View var0) {
      int var1 = R.id.add_reaction;
      AddReactionView var7 = (AddReactionView)a.a(var0, var1);
      if (var7 != null) {
         var1 = R.id.follow_button;
         DCDButton var13 = (DCDButton)a.a(var0, var1);
         if (var13 != null) {
            var1 = R.id.footer_barrier;
            Barrier var8 = (Barrier)a.a(var0, var1);
            if (var8 != null) {
               var1 = R.id.footer_divider;
               View var6 = a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.header_barrier;
                  Barrier var12 = (Barrier)a.a(var0, var1);
                  if (var12 != null) {
                     var1 = R.id.header_divider;
                     View var17 = a.a(var0, var1);
                     if (var17 != null) {
                        var1 = R.id.other_reactions_count;
                        DCDButton var11 = (DCDButton)a.a(var0, var1);
                        if (var11 != null) {
                           var1 = R.id.reactions_view;
                           ShortcutsFlexbox var9 = (ShortcutsFlexbox)a.a(var0, var1);
                           if (var9 != null) {
                              var1 = R.id.share_button;
                              DCDButton var3 = (DCDButton)a.a(var0, var1);
                              if (var3 != null) {
                                 var1 = R.id.share_prompt_close_button;
                                 DCDButton var10 = (DCDButton)a.a(var0, var1);
                                 if (var10 != null) {
                                    var1 = R.id.share_prompt_container;
                                    ConstraintLayout var16 = (ConstraintLayout)a.a(var0, var1);
                                    if (var16 != null) {
                                       var1 = R.id.share_prompt_copy_link_button;
                                       DCDButton var15 = (DCDButton)a.a(var0, var1);
                                       if (var15 != null) {
                                          var1 = R.id.share_prompt_icon;
                                          SimpleDraweeView var14 = (SimpleDraweeView)a.a(var0, var1);
                                          if (var14 != null) {
                                             var1 = R.id.share_prompt_subtitle;
                                             SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                             if (var5 != null) {
                                                var1 = R.id.share_prompt_title;
                                                TextView var18 = (TextView)a.a(var0, var1);
                                                if (var18 != null) {
                                                   var1 = R.id.spacer;
                                                   Space var4 = (Space)a.a(var0, var1);
                                                   if (var4 != null) {
                                                      var1 = R.id.start_spacer;
                                                      Space var2 = (Space)a.a(var0, var1);
                                                      if (var2 != null) {
                                                         return new ForumPostActionBarViewBinding(
                                                            var0,
                                                            var7,
                                                            var13,
                                                            var8,
                                                            var6,
                                                            var12,
                                                            var17,
                                                            var11,
                                                            var9,
                                                            var3,
                                                            var10,
                                                            var16,
                                                            var15,
                                                            var14,
                                                            var5,
                                                            var18,
                                                            var4,
                                                            var2
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

   @NonNull
   public static ForumPostActionBarViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.forum_post_action_bar_view, var1);
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
