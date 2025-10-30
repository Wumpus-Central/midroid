package com.discord.chat.presentation.message.view.voicemessages

internal final val abs: Byte
   internal final get() {
      if (var0 == -128) {
         return 127;
      } else {
         var var1: Byte = var0;
         if (-127 <= var0) {
            var1 = var0;
            if (var0 < 1) {
               var1 = (byte)(-var0);
            }
         }

         return var1;
      }
   }

