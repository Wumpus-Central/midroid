package com.discord.chat.presentation.media

import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.primitives.MessageId

public interface PortalUiModel {
   public val index: Int
   public val messageId: MessageId

   public open val portal: Double
      public open get() {
      }


   // $VF: Class flags could not be determined
   internal class DefaultImpls {
      @JvmStatic
      fun getPortal(var0: PortalUiModel): Double {
         val var2: java.lang.String = MessageId.toString-impl(var0.getMessageId-3Eiw7ao());
         val var3: java.lang.String = var0.getClass().getSimpleName();
         val var1: Int = var0.getIndex();
         val var4: StringBuilder = new StringBuilder();
         var4.append(var2);
         var4.append("_");
         var4.append(var3);
         var4.append("_");
         var4.append(var1);
         return IdUtilsKt.convertToId(var4.toString());
      }
   }
}
