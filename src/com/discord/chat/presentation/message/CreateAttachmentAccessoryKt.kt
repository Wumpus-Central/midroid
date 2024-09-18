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
   label64: {
      kotlin.jvm.internal.q.h(var0, "<this>");
      kotlin.jvm.internal.q.h(var1, "message");
      kotlin.jvm.internal.q.h(var5, "context");
      var13 = SpoilerAttributes.Companion.forAttachment(var0, var1, var2);
      if (kotlin.jvm.internal.q.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
         val var12: java.lang.String = var1.getNonce-N_6c4I0();
         var11 = var12;
         if (var12 != null) {
            break label64;
         }
      }

      var11 = var1.getId-3Eiw7ao();
   }

   val var6: Int = CreateAttachmentAccessoryKt.WhenMappings.$EnumSwitchMapping$0[var0.type().ordinal()];
   var var9: Boolean = false;
   val var14: Any;
   if (var6 != 1) {
      if (var6 != 2) {
         if (var6 != 3) {
            if (var6 != 4) {
               throw new dh.p();
            }

            val var15: ReactContext;
            if (var5 is ReactContext) {
               var15 = var5 as ReactContext;
            } else {
               var15 = null;
            }

            if (var15 != null) {
               var9 = kotlin.jvm.internal.q.c(CacheModule.Companion.get(var15).getItem("MEDIA_BACKGROUNDING_PHASE_1"), "true");
            }

            val var10: Boolean = MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE);
            if (!var10 && !var9) {
               var14 = new FileAttachmentMessageAccessory(
                  var11, var0, var2, var1.getAttachmentsOpacity(), var13, var0.getUploaderId(), var0.getUploaderItemId(), null
               );
            } else {
               var14 = new AudioAttachmentMessageAccessory(
                  var1.getChannelId-o4g7jtM(),
                  var11,
                  var0,
                  var2,
                  var1.getAttachmentsOpacity(),
                  var1.getAuthorId-wUX8bhU(),
                  var1.getAudioAttachmentBackgroundColor(),
                  var10,
                  null
               );
            }
         } else {
            var14 = new FileAttachmentMessageAccessory(
               var11, var0, var2, var1.getAttachmentsOpacity(), var13, var0.getUploaderId(), var0.getUploaderItemId(), null
            );
         }
      } else {
         val var22: Long = var1.getChannelId-o4g7jtM();
         val var19: java.lang.Boolean = var1.getUseAttachmentGridLayout();
         if (var19 != null) {
            var9 = var19;
         } else {
            var9 = false;
         }

         val var20: java.lang.Boolean = var1.getUseAttachmentUploadPreview();
         val var25: Boolean;
         if (var20 != null && var20 && var0.getProgress() != null) {
            var25 = true;
         } else {
            var25 = false;
         }

         var14 = new VideoAttachmentMessageAccessory(var22, var11, var2, var0, var1.getAttachmentsOpacity(), var3, var4, var13, var9, var25, null);
      }
   } else {
      val var21: java.lang.Boolean = var1.getUseAttachmentGridLayout();
      if (var21 != null) {
         var9 = var21;
      } else {
         var9 = false;
      }

      var14 = new ImageAttachmentMessageAccessory(var11, var0, var2, var1.getAttachmentsOpacity(), var3, var4, var13, var9, null);
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
