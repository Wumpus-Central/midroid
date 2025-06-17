package com.discord.chat.presentation.message

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

internal fun Attachment.createAttachmentAccessory(message: Message, index: Int, constrainedWidth: Int, radiusPx: Int, verifyAge: Boolean?): MessageAttachmentAccessory {
   var var12: SpoilerAttributes;
   label50: {
      kotlin.jvm.internal.q.h(var0, "<this>");
      kotlin.jvm.internal.q.h(var1, "message");
      var12 = SpoilerAttributes.Companion.forAttachment(var0, var1, var2, var5);
      if (kotlin.jvm.internal.q.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
         val var11: java.lang.String = var1.getNonce-N_6c4I0();
         var15 = var11;
         if (var11 != null) {
            break label50;
         }
      }

      var15 = var1.getId-3Eiw7ao();
   }

   val var6: Int = CreateAttachmentAccessoryKt.WhenMappings.$EnumSwitchMapping$0[var0.type().ordinal()];
   val var14: Any;
   if (var6 != 1) {
      if (var6 != 2) {
         if (var6 != 3) {
            if (var6 != 4) {
               throw new r9.n();
            }

            var14 = new AudioAttachmentMessageAccessory(
               var1.getChannelId-o4g7jtM(),
               var15,
               var0,
               var2,
               var1.getAttachmentsOpacity(),
               var1.getAuthorId-wUX8bhU(),
               var1.getAudioAttachmentBackgroundColor(),
               MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE),
               null
            );
         } else {
            var14 = new FileAttachmentMessageAccessory(
               var15, var0, var2, var1.getAttachmentsOpacity(), var12, var0.getUploaderId(), var0.getUploaderItemId(), null
            );
         }
      } else {
         val var18: Long = var1.getChannelId-o4g7jtM();
         var var22: java.lang.Boolean = var1.getUseAttachmentGridLayout();
         val var7: Boolean;
         if (var22 != null) {
            var7 = var22;
         } else {
            var7 = false;
         }

         var22 = var1.getUseAttachmentUploadPreview();
         var var8: Boolean;
         if (var22 != null) {
            var8 = var22;
         } else {
            var8 = false;
         }

         if (var8 && var0.getProgress() != null) {
            var8 = true;
         } else {
            var8 = false;
         }

         var14 = new VideoAttachmentMessageAccessory(var18, var15, var2, var0, var1.getAttachmentsOpacity(), var3, var4, var12, var7, var8, null);
      }
   } else {
      val var24: java.lang.Boolean = var1.getUseAttachmentGridLayout();
      val var16: Boolean;
      if (var24 != null) {
         var16 = var24;
      } else {
         var16 = false;
      }

      var14 = new ImageAttachmentMessageAccessory(var15, var0, var2, var1.getAttachmentsOpacity(), var3, var4, var12, var16, null);
   }

   return (MessageAttachmentAccessory)var14;
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
