package com.discord.chat.presentation.message.messagepart.polls

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.attachment.AttachmentType
import kotlin.jvm.internal.q

public fun List<Attachment>.getFirstImage(): Attachment? {
   q.h(var0, "<this>");
   val var1: java.util.Iterator = var0.iterator();

   do {
      if (!var1.hasNext()) {
         var2 = null;
         break;
      }

      var2 = var1.next();
   } while (((Attachment)var2).type() != AttachmentType.Image);

   return var2 as Attachment;
}
