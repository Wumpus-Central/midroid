package com.discord.chat.presentation.message.messagepart.polls

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import kotlin.jvm.internal.r

public fun List<Attachment>.getFirstImage(): Attachment? {
   r.h(var0, "<this>");
   val var2: java.util.Iterator = var0.iterator();

   val var1: Boolean;
   do {
      if (!var2.hasNext()) {
         var3 = null;
         break;
      }

      var3 = var2.next();
      if ((var3 as Attachment).type() === AttachmentType.Image) {
         var1 = true;
      } else {
         var1 = false;
      }
   } while (!var1);

   return var3 as Attachment;
}
