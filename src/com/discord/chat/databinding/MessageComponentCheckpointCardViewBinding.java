package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.discord.chat.presentation.message.view.botuikit.components.CheckpointCardComponentView;
import com.facebook.drawee.view.SimpleDraweeView;

public final class MessageComponentCheckpointCardViewBinding implements ViewBinding {
   @NonNull
   public final SimpleDraweeView applicationImage;
   @NonNull
   public final TextView applicationName;
   @NonNull
   public final LinearLayout checkpoint;
   @NonNull
   public final TextView cta;
   @NonNull
   public final TextView emojiCount;
   @NonNull
   public final SimpleDraweeView emojiImage;
   @NonNull
   public final TextView emojiName;
   @NonNull
   public final ConstraintLayout footer;
   @NonNull
   public final SimpleDraweeView guildImage;
   @NonNull
   public final TextView guildName;
   @NonNull
   public final LinearLayout image;
   @NonNull
   public final SimpleDraweeView imageResource;
   @NonNull
   public final ImageView logo;
   @NonNull
   public final TextView messageCount;
   @NonNull
   public final LinearLayout powerBar;
   @NonNull
   public final LinearLayout powerContainer;
   @NonNull
   public final TextView powerLevelLvl;
   @NonNull
   public final TextView powerLevelNumber;
   @NonNull
   private final CheckpointCardComponentView rootView;
   @NonNull
   public final LinearLayout stats;
   @NonNull
   public final TextView title;
   @NonNull
   public final TextView unicodeEmojiImage;
   @NonNull
   public final TextView voiceMinutes;

   private MessageComponentCheckpointCardViewBinding(
      @NonNull CheckpointCardComponentView var1,
      @NonNull SimpleDraweeView var2,
      @NonNull TextView var3,
      @NonNull LinearLayout var4,
      @NonNull TextView var5,
      @NonNull TextView var6,
      @NonNull SimpleDraweeView var7,
      @NonNull TextView var8,
      @NonNull ConstraintLayout var9,
      @NonNull SimpleDraweeView var10,
      @NonNull TextView var11,
      @NonNull LinearLayout var12,
      @NonNull SimpleDraweeView var13,
      @NonNull ImageView var14,
      @NonNull TextView var15,
      @NonNull LinearLayout var16,
      @NonNull LinearLayout var17,
      @NonNull TextView var18,
      @NonNull TextView var19,
      @NonNull LinearLayout var20,
      @NonNull TextView var21,
      @NonNull TextView var22,
      @NonNull TextView var23
   ) {
      this.rootView = var1;
      this.applicationImage = var2;
      this.applicationName = var3;
      this.checkpoint = var4;
      this.cta = var5;
      this.emojiCount = var6;
      this.emojiImage = var7;
      this.emojiName = var8;
      this.footer = var9;
      this.guildImage = var10;
      this.guildName = var11;
      this.image = var12;
      this.imageResource = var13;
      this.logo = var14;
      this.messageCount = var15;
      this.powerBar = var16;
      this.powerContainer = var17;
      this.powerLevelLvl = var18;
      this.powerLevelNumber = var19;
      this.stats = var20;
      this.title = var21;
      this.unicodeEmojiImage = var22;
      this.voiceMinutes = var23;
   }

   @NonNull
   public static MessageComponentCheckpointCardViewBinding bind(@NonNull View var0) {
      int var1 = R.id.application_image;
      SimpleDraweeView var19 = (SimpleDraweeView)k5.a.a(var0, var1);
      if (var19 != null) {
         var1 = R.id.application_name;
         TextView var21 = (TextView)k5.a.a(var0, var1);
         if (var21 != null) {
            var1 = R.id.checkpoint;
            LinearLayout var14 = (LinearLayout)k5.a.a(var0, var1);
            if (var14 != null) {
               var1 = R.id.cta;
               TextView var12 = (TextView)k5.a.a(var0, var1);
               if (var12 != null) {
                  var1 = R.id.emoji_count;
                  TextView var5 = (TextView)k5.a.a(var0, var1);
                  if (var5 != null) {
                     var1 = R.id.emoji_image;
                     SimpleDraweeView var4 = (SimpleDraweeView)k5.a.a(var0, var1);
                     if (var4 != null) {
                        var1 = R.id.emoji_name;
                        TextView var16 = (TextView)k5.a.a(var0, var1);
                        if (var16 != null) {
                           var1 = R.id.footer;
                           ConstraintLayout var22 = (ConstraintLayout)k5.a.a(var0, var1);
                           if (var22 != null) {
                              var1 = R.id.guild_image;
                              SimpleDraweeView var3 = (SimpleDraweeView)k5.a.a(var0, var1);
                              if (var3 != null) {
                                 var1 = R.id.guild_name;
                                 TextView var7 = (TextView)k5.a.a(var0, var1);
                                 if (var7 != null) {
                                    var1 = R.id.image;
                                    LinearLayout var8 = (LinearLayout)k5.a.a(var0, var1);
                                    if (var8 != null) {
                                       var1 = R.id.image_resource;
                                       SimpleDraweeView var20 = (SimpleDraweeView)k5.a.a(var0, var1);
                                       if (var20 != null) {
                                          var1 = R.id.logo;
                                          ImageView var23 = (ImageView)k5.a.a(var0, var1);
                                          if (var23 != null) {
                                             var1 = R.id.message_count;
                                             TextView var2 = (TextView)k5.a.a(var0, var1);
                                             if (var2 != null) {
                                                var1 = R.id.power_bar;
                                                LinearLayout var11 = (LinearLayout)k5.a.a(var0, var1);
                                                if (var11 != null) {
                                                   var1 = R.id.power_container;
                                                   LinearLayout var13 = (LinearLayout)k5.a.a(var0, var1);
                                                   if (var13 != null) {
                                                      var1 = R.id.power_level_lvl;
                                                      TextView var6 = (TextView)k5.a.a(var0, var1);
                                                      if (var6 != null) {
                                                         var1 = R.id.power_level_number;
                                                         TextView var9 = (TextView)k5.a.a(var0, var1);
                                                         if (var9 != null) {
                                                            var1 = R.id.stats;
                                                            LinearLayout var15 = (LinearLayout)k5.a.a(var0, var1);
                                                            if (var15 != null) {
                                                               var1 = R.id.title;
                                                               TextView var18 = (TextView)k5.a.a(var0, var1);
                                                               if (var18 != null) {
                                                                  var1 = R.id.unicode_emoji_image;
                                                                  TextView var10 = (TextView)k5.a.a(var0, var1);
                                                                  if (var10 != null) {
                                                                     var1 = R.id.voice_minutes;
                                                                     TextView var17 = (TextView)k5.a.a(var0, var1);
                                                                     if (var17 != null) {
                                                                        return new MessageComponentCheckpointCardViewBinding(
                                                                           (CheckpointCardComponentView)var0,
                                                                           var19,
                                                                           var21,
                                                                           var14,
                                                                           var12,
                                                                           var5,
                                                                           var4,
                                                                           var16,
                                                                           var22,
                                                                           var3,
                                                                           var7,
                                                                           var8,
                                                                           var20,
                                                                           var23,
                                                                           var2,
                                                                           var11,
                                                                           var13,
                                                                           var6,
                                                                           var9,
                                                                           var15,
                                                                           var18,
                                                                           var10,
                                                                           var17
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

      throw new NullPointerException("Missing required view with ID: ".concat(var0.getResources().getResourceName(var1)));
   }

   @NonNull
   public static MessageComponentCheckpointCardViewBinding inflate(@NonNull LayoutInflater var0) {
      return inflate(var0, null, false);
   }

   @NonNull
   public static MessageComponentCheckpointCardViewBinding inflate(@NonNull LayoutInflater var0, ViewGroup var1, boolean var2) {
      View var3 = var0.inflate(R.layout.message_component_checkpoint_card_view, var1, false);
      if (var2) {
         var1.addView(var3);
      }

      return bind(var3);
   }

   @NonNull
   public CheckpointCardComponentView getRoot() {
      return this.rootView;
   }
}
