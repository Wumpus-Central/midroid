package com.discord.chat.presentation.message.view.voicemessages

internal final val abs: Byte
   internal final get() {
      var var1: Byte;
      if (var0 == -128) {
         var1 = 127;
      } else {
         var var2: Boolean = false;
         if (-127 <= var0) {
            var2 = false;
            if (var0 < 1) {
               var2 = true;
            }
         }

         var1 = var0;
         if (var2) {
            var1 = (byte)(-var0);
         }
      }

      return var1;
   }

