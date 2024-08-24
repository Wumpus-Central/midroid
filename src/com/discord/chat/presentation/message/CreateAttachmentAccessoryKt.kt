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
   var var9: java.lang.String;
   var var11: SpoilerAttributes;
   label66: {
      kotlin.jvm.internal.r.h(var0, "<this>");
      kotlin.jvm.internal.r.h(var1, "message");
      kotlin.jvm.internal.r.h(var5, "context");
      var11 = SpoilerAttributes.Companion.forAttachment(var0, var1, var2);
      if (kotlin.jvm.internal.r.c(var1.isCurrentUserMessageAuthor(), java.lang.Boolean.TRUE)) {
         val var10: java.lang.String = var1.getNonce-N_6c4I0();
         var9 = var10;
         if (var10 != null) {
            break label66;
         }
      }

      var9 = var1.getId-3Eiw7ao();
   }

   val var6: Int = CreateAttachmentAccessoryKt.WhenMappings.$EnumSwitchMapping$0[var0.type().ordinal()];
   var var7: Boolean = false;
   val var12: Any;
   if (var6 != 1) {
      if (var6 != 2) {
         if (var6 != 3) {
            if (var6 != 4) {
               throw new eh.p();
            }

            val var13: ReactContext;
            if (var5 is ReactContext) {
               var13 = var5 as ReactContext;
            } else {
               var13 = null;
            }

            var7 = false;
            if (var13 != null) {
               var7 = kotlin.jvm.internal.r.c(CacheModule.Companion.get(var13).getItem("MEDIA_BACKGROUNDING_PHASE_1"), "true");
            }

            val var22: Boolean = MessageFlagKt.hasMessageFlag(var1.getFlags(), MessageFlag.IS_VOICE_MESSAGE);
            if (!var22 && !var7) {
               var12 = new FileAttachmentMessageAccessory(
                  var9, var0, var2, var1.getAttachmentsOpacity(), var11, var0.getUploaderId(), var0.getUploaderItemId(), null
               );
            } else {
               var12 = new AudioAttachmentMessageAccessory(
                  var9, var0, var2, var1.getAttachmentsOpacity(), var1.getAuthorId-wUX8bhU(), var1.getAudioAttachmentBackgroundColor(), var22, null
               );
            }
         } else {
            var12 = new FileAttachmentMessageAccessory(
               var9, var0, var2, var1.getAttachmentsOpacity(), var11, var0.getUploaderId(), var0.getUploaderItemId(), null
            );
         }
      } else {
         val var17: java.lang.Boolean = var1.getUseAttachmentGridLayout();
         if (var17 != null) {
            var7 = var17;
         } else {
            var7 = false;
         }

         val var18: java.lang.Boolean = var1.getUseAttachmentUploadPreview();
         var var23: Boolean;
         if (var18 != null) {
            var23 = var18;
         } else {
            var23 = false;
         }

         if (var23 && var0.getProgress() != null) {
            var23 = true;
         } else {
            var23 = false;
         }

         var12 = new VideoAttachmentMessageAccessory(var9, var2, var0, var1.getAttachmentsOpacity(), var3, var4, var11, var7, var23, null);
      }
   } else {
      val var19: java.lang.Boolean = var1.getUseAttachmentGridLayout();
      if (var19 != null) {
         var7 = var19;
      }

      var12 = new ImageAttachmentMessageAccessory(var9, var0, var2, var1.getAttachmentsOpacity(), var3, var4, var11, var7, null);
   }

   return (MessageAttachmentAccessory)var12;
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
