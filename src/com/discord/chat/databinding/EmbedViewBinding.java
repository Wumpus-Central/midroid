package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.EmbedViewResizingMediaView;
import com.discord.chat.presentation.message.view.SpoilerView;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import y0.a;

public final class EmbedViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView authorAvatar;
   @NonNull
   public final LinearLayout authorContainer;
   @NonNull
   public final TextView authorName;
   @NonNull
   public final View border;
   @NonNull
   public final SimpleDraweeSpanTextView description;
   @NonNull
   public final TextView error;
   @NonNull
   public final SimpleDraweeView errorIcon;
   @NonNull
   public final LinearLayout fieldsBottomWrap;
   @NonNull
   public final LinearLayout fieldsContainer;
   @NonNull
   public final LinearLayout fieldsTopWrap;
   @NonNull
   public final SimpleDraweeView footerAvatar;
   @NonNull
   public final LinearLayout footerContainer;
   @NonNull
   public final TextView footerText;
   @NonNull
   public final FrameLayout imageBlurBg;
   @NonNull
   public final ConstraintLayout inlineMediaContainer;
   @NonNull
   public final EmbedViewResizingMediaView inlineMediaView;
   @NonNull
   public final EmbedViewResizingMediaView inlineMediaView2;
   @NonNull
   public final EmbedViewResizingMediaView inlineMediaView3;
   @NonNull
   public final EmbedViewResizingMediaView inlineMediaView4;
   @NonNull
   public final EmbedViewResizingMediaView mediaView;
   @NonNull
   public final SimpleDraweeSpanTextView provider;
   @NonNull
   private final View rootView;
   @NonNull
   public final Space spacer;
   @NonNull
   public final SpoilerView spoiler;
   @NonNull
   public final SimpleDraweeView thumbnail;
   @NonNull
   public final SimpleDraweeSpanTextView title;

   private EmbedViewBinding(
      @NonNull View var1,
      @NonNull SimpleDraweeView var2,
      @NonNull LinearLayout var3,
      @NonNull TextView var4,
      @NonNull View var5,
      @NonNull SimpleDraweeSpanTextView var6,
      @NonNull TextView var7,
      @NonNull SimpleDraweeView var8,
      @NonNull LinearLayout var9,
      @NonNull LinearLayout var10,
      @NonNull LinearLayout var11,
      @NonNull SimpleDraweeView var12,
      @NonNull LinearLayout var13,
      @NonNull TextView var14,
      @NonNull FrameLayout var15,
      @NonNull ConstraintLayout var16,
      @NonNull EmbedViewResizingMediaView var17,
      @NonNull EmbedViewResizingMediaView var18,
      @NonNull EmbedViewResizingMediaView var19,
      @NonNull EmbedViewResizingMediaView var20,
      @NonNull EmbedViewResizingMediaView var21,
      @NonNull SimpleDraweeSpanTextView var22,
      @NonNull Space var23,
      @NonNull SpoilerView var24,
      @NonNull SimpleDraweeView var25,
      @NonNull SimpleDraweeSpanTextView var26
   ) {
      this.rootView = var1;
      this.authorAvatar = var2;
      this.authorContainer = var3;
      this.authorName = var4;
      this.border = var5;
      this.description = var6;
      this.error = var7;
      this.errorIcon = var8;
      this.fieldsBottomWrap = var9;
      this.fieldsContainer = var10;
      this.fieldsTopWrap = var11;
      this.footerAvatar = var12;
      this.footerContainer = var13;
      this.footerText = var14;
      this.imageBlurBg = var15;
      this.inlineMediaContainer = var16;
      this.inlineMediaView = var17;
      this.inlineMediaView2 = var18;
      this.inlineMediaView3 = var19;
      this.inlineMediaView4 = var20;
      this.mediaView = var21;
      this.provider = var22;
      this.spacer = var23;
      this.spoiler = var24;
      this.thumbnail = var25;
      this.title = var26;
   }

   @NonNull
   public static EmbedViewBinding bind(@NonNull View var0) {
      int var1 = R.id.author_avatar;
      SimpleDraweeView var12 = (SimpleDraweeView)a.a(var0, var1);
      if (var12 != null) {
         var1 = R.id.author_container;
         LinearLayout var19 = (LinearLayout)a.a(var0, var1);
         if (var19 != null) {
            var1 = R.id.author_name;
            TextView var2 = (TextView)a.a(var0, var1);
            if (var2 != null) {
               var1 = R.id.border;
               View var20 = a.a(var0, var1);
               if (var20 != null) {
                  var1 = R.id.description;
                  SimpleDraweeSpanTextView var8 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                  if (var8 != null) {
                     var1 = R.id.error;
                     TextView var4 = (TextView)a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.error_icon;
                        SimpleDraweeView var18 = (SimpleDraweeView)a.a(var0, var1);
                        if (var18 != null) {
                           var1 = R.id.fields_bottom_wrap;
                           LinearLayout var14 = (LinearLayout)a.a(var0, var1);
                           if (var14 != null) {
                              var1 = R.id.fields_container;
                              LinearLayout var5 = (LinearLayout)a.a(var0, var1);
                              if (var5 != null) {
                                 var1 = R.id.fields_top_wrap;
                                 LinearLayout var23 = (LinearLayout)a.a(var0, var1);
                                 if (var23 != null) {
                                    var1 = R.id.footer_avatar;
                                    SimpleDraweeView var13 = (SimpleDraweeView)a.a(var0, var1);
                                    if (var13 != null) {
                                       var1 = R.id.footer_container;
                                       LinearLayout var7 = (LinearLayout)a.a(var0, var1);
                                       if (var7 != null) {
                                          var1 = R.id.footer_text;
                                          TextView var16 = (TextView)a.a(var0, var1);
                                          if (var16 != null) {
                                             var1 = R.id.image_blur_bg;
                                             FrameLayout var9 = (FrameLayout)a.a(var0, var1);
                                             if (var9 != null) {
                                                var1 = R.id.inline_media_container;
                                                ConstraintLayout var24 = (ConstraintLayout)a.a(var0, var1);
                                                if (var24 != null) {
                                                   var1 = R.id.inline_media_view;
                                                   EmbedViewResizingMediaView var15 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                   if (var15 != null) {
                                                      var1 = R.id.inline_media_view2;
                                                      EmbedViewResizingMediaView var22 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                      if (var22 != null) {
                                                         var1 = R.id.inline_media_view3;
                                                         EmbedViewResizingMediaView var17 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                         if (var17 != null) {
                                                            var1 = R.id.inline_media_view4;
                                                            EmbedViewResizingMediaView var10 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                            if (var10 != null) {
                                                               var1 = R.id.media_view;
                                                               EmbedViewResizingMediaView var21 = (EmbedViewResizingMediaView)a.a(var0, var1);
                                                               if (var21 != null) {
                                                                  var1 = R.id.provider;
                                                                  SimpleDraweeSpanTextView var25 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                                                  if (var25 != null) {
                                                                     var1 = R.id.spacer;
                                                                     Space var26 = (Space)a.a(var0, var1);
                                                                     if (var26 != null) {
                                                                        var1 = R.id.spoiler;
                                                                        SpoilerView var11 = (SpoilerView)a.a(var0, var1);
                                                                        if (var11 != null) {
                                                                           var1 = R.id.thumbnail;
                                                                           SimpleDraweeView var3 = (SimpleDraweeView)a.a(var0, var1);
                                                                           if (var3 != null) {
                                                                              var1 = R.id.title;
                                                                              SimpleDraweeSpanTextView var6 = (SimpleDraweeSpanTextView)a.a(var0, var1);
                                                                              if (var6 != null) {
                                                                                 return new EmbedViewBinding(
                                                                                    var0,
                                                                                    var12,
                                                                                    var19,
                                                                                    var2,
                                                                                    var20,
                                                                                    var8,
                                                                                    var4,
                                                                                    var18,
                                                                                    var14,
                                                                                    var5,
                                                                                    var23,
                                                                                    var13,
                                                                                    var7,
                                                                                    var16,
                                                                                    var9,
                                                                                    var24,
                                                                                    var15,
                                                                                    var22,
                                                                                    var17,
                                                                                    var10,
                                                                                    var21,
                                                                                    var25,
                                                                                    var26,
                                                                                    var11,
                                                                                    var3,
                                                                                    var6
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static EmbedViewBinding inflate(@NonNull LayoutInflater var0, @NonNull ViewGroup var1) {
      if (var1 != null) {
         var0.inflate(R.layout.embed_view, var1);
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
