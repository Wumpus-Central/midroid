package com.discord.chat.presentation.message

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.primitives.MessageFlag
import com.discord.primitives.MessageFlagKt

internal fun Attachment.createAttachmentAccessory(message: Message, index: Int, constrainedWidth: Int, radiusPx: Int): MessageAccessory {
   var var8: java.lang.String;
   var var10: SpoilerAttributes;
   label54: {
      kotlin.jvm.internal.r.h(var0, "<this>");
      kotlin.jvm.internal.r.h(var1, "message");
      var10 = SpoilerAttributes.Companion.forAttachment(var0, var1, var2);
      if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
         val var9: java.lang.String = var1.getNonce-N_6c4I0();
         var8 = var9;
         if (var9 != null) {
            break label54;
         }
      }

      var8 = var1.getId-3Eiw7ao();
   }

   val var5: Int = CreateAttachmentAccessoryKt.WhenMappings.$EnumSwitchMapping$0[var0.type().ordinal()];
   val var12: Any;
   if (var5 != 1) {
      if (var5 != 2) {
         if (var5 != 3) {
            if (var5 != 4) {
               throw new eh.p();
            }

            if (MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE)) {
               var12 = new AudioAttachmentMessageAccessory(
                  var8, var0, var2, var1.getAttachmentsOpacity(), var1.getAuthorId-wUX8bhU(), var1.getAudioAttachmentBackgroundColor(), null
               );
            } else {
               var12 = new FileAttachmentMessageAccessory(
                  var8, var0, var2, var1.getAttachmentsOpacity(), var10, var0.getUploaderId(), var0.getUploaderItemId(), null
               );
            }
         } else {
            var12 = new FileAttachmentMessageAccessory(
               var8, var0, var2, var1.getAttachmentsOpacity(), var10, var0.getUploaderId(), var0.getUploaderItemId(), null
            );
         }
      } else {
         var var19: java.lang.Boolean = var1.getUseAttachmentGridLayout();
         val var6: Boolean;
         if (var19 != null) {
            var6 = var19;
         } else {
            var6 = false;
         }

         var19 = var1.getUseAttachmentUploadPreview();
         var var7: Boolean;
         if (var19 != null) {
            var7 = var19;
         } else {
            var7 = false;
         }

         if (var7 && var0.getProgress() != null) {
            var7 = true;
         } else {
            var7 = false;
         }

         var12 = new VideoAttachmentMessageAccessory(var8, var2, var0, var1.getAttachmentsOpacity(), var3, var4, var10, var6, var7, null);
      }
   } else {
      val var21: java.lang.Boolean = var1.getUseAttachmentGridLayout();
      val var13: Boolean;
      if (var21 != null) {
         var13 = var21;
      } else {
         var13 = false;
      }

      var12 = new ImageAttachmentMessageAccessory(var8, var0, var2, var1.getAttachmentsOpacity(), var3, var4, var10, var13, null);
   }

   return (MessageAccessory)var12;
}
// $VF: Class flags could not be determined
@JvmSynthetic
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
