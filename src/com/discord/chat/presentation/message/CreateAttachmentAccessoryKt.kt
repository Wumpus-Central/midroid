package com.discord.chat.presentation.message

import android.content.Context
import com.discord.cache.CacheModule
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt
import com.facebook.react.bridge.ReactContext

internal fun Attachment.createAttachmentAccessory(message: Message, index: Int, constrainedWidth: Int, radiusPx: Int, context: Context): MessageAttachmentAccessory {
   var var11: java.lang.String;
   var var13: SpoilerAttributes;
   label67: {
      kotlin.jvm.internal.r.h(var0, "<this>");
      kotlin.jvm.internal.r.h(var1, "message");
      kotlin.jvm.internal.r.h(var5, "context");
      var13 = SpoilerAttributes.Companion.forAttachment(var0, var1, var2);
      if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
         val var12: java.lang.String = var1.getNonce_N_6c4I0();
         var11 = var12;
         if (var12 != null) {
            break label67;
         }
      }

      var11 = var1.getId_3Eiw7ao();
   }

   val var6: Int = CreateAttachmentAccessoryKt.WhenMappings.$EnumSwitchMapping$0[var0.type().ordinal()];
   var var7: Boolean = false;
   val var14: Any;
   if (var6 != 1) {
      if (var6 != 2) {
         if (var6 != 3) {
            if (var6 != 4) {
               throw new eh.p();
            }

            val var15: ReactContext;
            if (var5 is ReactContext) {
               var15 = var5 as ReactContext;
            } else {
               var15 = null;
            }

            if (var15 != null) {
               var7 = kotlin.jvm.internal.r.c(CacheModule.Companion.get(var15).getItem("MEDIA_BACKGROUNDING_PHASE_1"), "true");
            }

            val var8: Boolean = MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE);
            if (!var8 && !var7) {
               var14 = new FileAttachmentMessageAccessory(
                  var11, var0, var2, var1.getAttachmentsOpacity(), var13, var0.getUploaderId(), var0.getUploaderItemId(), null
               );
            } else {
               var14 = new AudioAttachmentMessageAccessory(
                  var1.getChannelId_o4g7jtM(),
                  var11,
                  var0,
                  var2,
                  var1.getAttachmentsOpacity(),
                  var1.getAuthorId_wUX8bhU(),
                  var1.getAudioAttachmentBackgroundColor(),
                  var8,
                  null
               );
            }
         } else {
            var14 = new FileAttachmentMessageAccessory(
               var11, var0, var2, var1.getAttachmentsOpacity(), var13, var0.getUploaderId(), var0.getUploaderItemId(), null
            );
         }
      } else {
         val var26: Long = var1.getChannelId_o4g7jtM();
         val var19: java.lang.Boolean = var1.getUseAttachmentGridLayout();
         if (var19 != null) {
            var7 = var19;
         } else {
            var7 = false;
         }

         val var20: java.lang.Boolean = var1.getUseAttachmentUploadPreview();
         var var24: Boolean;
         if (var20 != null) {
            var24 = var20;
         } else {
            var24 = false;
         }

         if (var24 && var0.getProgress() != null) {
            var24 = true;
         } else {
            var24 = false;
         }

         var14 = new VideoAttachmentMessageAccessory(var26, var11, var2, var0, var1.getAttachmentsOpacity(), var3, var4, var13, var7, var24, null);
      }
   } else {
      val var21: java.lang.Boolean = var1.getUseAttachmentGridLayout();
      if (var21 != null) {
         var7 = var21;
      } else {
         var7 = false;
      }

      var14 = new ImageAttachmentMessageAccessory(var11, var0, var2, var1.getAttachmentsOpacity(), var3, var4, var13, var7, null);
   }

   return (MessageAttachmentAccessory)var14;
}
// $VF: Class flags could not be determined
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[AttachmentType.values().length];

      try {
         var0[AttachmentType.Image.ordinal()] = 1;
      } catch (var5: NoSuchFieldError) {
      }

      try {
         var0[AttachmentType.Video.ordinal()] = 2;
      } catch (var4: NoSuchFieldError) {
      }

      try {
         var0[AttachmentType.File.ordinal()] = 3;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[AttachmentType.Audio.ordinal()] = 4;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
