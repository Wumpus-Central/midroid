package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.InlineForwardButtonView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import n1.a;

public final class EmbedViewBinding implements ViewBinding {
   public final SimpleDraweeView authorAvatar;
   public final LinearLayout authorContainer;
   public final TextView authorName;
   public final View border;
   public final SimpleDraweeSpanTextView description;
   public final FrameLayout embed;
   public final TextView error;
   public final SimpleDraweeView errorIcon;
   public final LinearLayout fieldsBottomWrap;
   public final LinearLayout fieldsContainer;
   public final LinearLayout fieldsTopWrap;
   public final SimpleDraweeView footerAvatar;
   public final LinearLayout footerContainer;
   public final TextView footerText;
   public final InlineForwardButtonView forward;
   public final FrameLayout imageBlurBg;
   public final ConstraintLayout inlineMediaContainer;
   public final EmbedViewResizingMediaView inlineMediaView;
   public final EmbedViewResizingMediaView inlineMediaView2;
   public final EmbedViewResizingMediaView inlineMediaView3;
   public final EmbedViewResizingMediaView inlineMediaView4;
   public final EmbedViewResizingMediaView mediaView;
   public final SimpleDraweeSpanTextView provider;
   private final View rootView;
   public final Space spacer;
   public final SpoilerView spoiler;
   public final SimpleDraweeView thumbnail;
   public final SimpleDraweeSpanTextView title;

   private EmbedViewBinding(
      View var1,
      SimpleDraweeView var2,
      LinearLayout var3,
      TextView var4,
      View var5,
      SimpleDraweeSpanTextView var6,
      FrameLayout var7,
      TextView var8,
      SimpleDraweeView var9,
      LinearLayout var10,
      LinearLayout var11,
      LinearLayout var12,
      SimpleDraweeView var13,
      LinearLayout var14,
      TextView var15,
      InlineForwardButtonView var16,
      FrameLayout var17,
      ConstraintLayout var18,
      EmbedViewResizingMediaView var19,
      EmbedViewResizingMediaView var20,
      EmbedViewResizingMediaView var21,
      EmbedViewResizingMediaView var22,
      EmbedViewResizingMediaView var23,
      SimpleDraweeSpanTextView var24,
      Space var25,
      SpoilerView var26,
      SimpleDraweeView var27,
      SimpleDraweeSpanTextView var28
   ) {
      this.rootView = var1;
      this.authorAvatar = var2;
      this.authorContainer = var3;
      this.authorName = var4;
      this.border = var5;
      this.description = var6;
      this.embed = var7;
      this.error = var8;
      this.errorIcon = var9;
      this.fieldsBottomWrap = var10;
      this.fieldsContainer = var11;
      this.fieldsTopWrap = var12;
      this.footerAvatar = var13;
      this.footerContainer = var14;
      this.footerText = var15;
      this.forward = var16;
      this.imageBlurBg = var17;
      this.inlineMediaContainer = var18;
      this.inlineMediaView = var19;
      this.inlineMediaView2 = var20;
      this.inlineMediaView3 = var21;
      this.inlineMediaView4 = var22;
      this.mediaView = var23;
      this.provider = var24;
      this.spacer = var25;
      this.spoiler = var26;
      this.thumbnail = var27;
      this.title = var28;
   }

   public static EmbedViewBinding bind(View var0) {
      int var1 = R.id.author_avatar;
      SimpleDraweeView var28 = (SimpleDraweeView)a.a(var0, var1);
      if (var28 != null) {
         var1 = R.id.author_container;
         LinearLayout var22 = (LinearLayout)a.a(var0, var1);
         if (var22 != null) {
            var1 = R.id.author_name;
            TextView var7 = (TextView)a.a(var0, var1);
            if (var7 != null) {
               var1 = R.id.border;
               View var6 = a.a(var0, var1);
               if (var6 != null) {
                  var1 = R.id.description;
                  SimpleDraweeSpanTextView var18 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var18 != null) {
                     var1 = R.id.embed;
                     FrameLayout var24 = (FrameLayout)a.a(var0, var1);
                     if (var24 != null) {
                        var1 = R.id.error;
                        TextView var25 = (TextView)a.a(var0, var1);
                        if (var25 != null) {
                           var1 = R.id.error_icon;
                           SimpleDraweeView var23 = (SimpleDraweeView)a.a(var0, var1);
                           if (var23 != null) {
                              var1 = R.id.fields_bottom_wrap;
                              LinearLayout var4 = (LinearLayout)a.a(var0, var1);
                              if (var4 != null) {
                                 var1 = R.id.fields_container;
                                 LinearLayout var14 = (LinearLayout)a.a(var0, var1);
                                 if (var14 != null) {
                                    var1 = R.id.fields_top_wrap;
                                    LinearLayout var2 = (LinearLayout)a.a(var0, var1);
                                    if (var2 != null) {
                                       var1 = R.id.footer_avatar;
                                       SimpleDraweeView var26 = (SimpleDraweeView)a.a(var0, var1);
                                       if (var26 != null) {
                                          var1 = R.id.footer_container;
                                          LinearLayout var13 = (LinearLayout)a.a(var0, var1);
                                          if (var13 != null) {
                                             var1 = R.id.footer_text;
                                             TextView var15 = (TextView)a.a(var0, var1);
                                             if (var15 != null) {
                                                var1 = R.id.forward;
                                                InlineForwardButtonView var10 = (InlineForwardButtonView)a.a(var0, var1);
                                                if (var10 != null) {
                                                   var1 = R.id.image_blur_bg;
                                                   FrameLayout var11 = (FrameLayout)a.a(var0, var1);
                                                   if (var11 != null) {
                                                      var1 = R.id.inline_media_container;
                                                      ConstraintLayout var12 = (ConstraintLayout)a.a(var0, var1);
                                                      if (var12 != null) {
                                                         var1 = R.id.inline_media_view;
                                                         EmbedViewResizingMediaView var3 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                         if (var3 != null) {
                                                            var1 = R.id.inline_media_view2;
                                                            EmbedViewResizingMediaView var19 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                            if (var19 != null) {
                                                               var1 = R.id.inline_media_view3;
                                                               EmbedViewResizingMediaView var8 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                               if (var8 != null) {
                                                                  var1 = R.id.inline_media_view4;
                                                                  EmbedViewResizingMediaView var16 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                                  if (var16 != null) {
                                                                     var1 = R.id.media_view;
                                                                     EmbedViewResizingMediaView var27 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                                     if (var27 != null) {
                                                                        var1 = R.id.provider;
                                                                        SimpleDraweeSpanTextView var20 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                                                        if (var20 != null) {
                                                                           var1 = R.id.spacer;
                                                                           Space var21 = (Space)a.a(var0, var1);
                                                                           if (var21 != null) {
                                                                              var1 = R.id.spoiler;
                                                                              SpoilerView var9 = (SpoilerView)a.a(var0, var1);
                                                                              if (var9 != null) {
                                                                                 var1 = R.id.thumbnail;
                                                                                 SimpleDraweeView var17 = (SimpleDraweeView)a.a(var0, var1);
                                                                                 if (var17 != null) {
                                                                                    var1 = R.id.title;
                                                                                    SimpleDraweeSpanTextView var5 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                                                                    if (var5 != null) {
                                                                                       return new EmbedViewBinding(
                                                                                          var0,
                                                                                          var28,
                                                                                          var22,
                                                                                          var7,
                                                                                          var6,
                                                                                          var18,
                                                                                          var24,
                                                                                          var25,
                                                                                          var23,
                                                                                          var4,
                                                                                          var14,
                                                                                          var2,
                                                                                          var26,
                                                                                          var13,
                                                                                          var15,
                                                                                          var10,
                                                                                          var11,
                                                                                          var12,
                                                                                          var3,
                                                                                          var19,
                                                                                          var8,
                                                                                          var16,
                                                                                          var27,
                                                                                          var20,
                                                                                          var21,
                                                                                          var9,
                                                                                          var17,
                                                                                          var5
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

   public static EmbedViewBinding inflate(LayoutInflater var0, ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.embed_view, var1);
         return bind(var1);
      } else {
         throw new NullPointerException("parent");
      }
   }

   public View getRoot() {
      return this.rootView;
   }
}
