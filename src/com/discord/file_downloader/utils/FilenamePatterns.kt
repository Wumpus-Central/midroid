package com.discord.file_downloader.utils

private object FilenamePatterns {
   public final val INVALID_FILENAME_CHARS: Regex = new Regex("[<>:\"/\\\\|?*@]")

   public fun atSeparatorPattern(atPattern: String): Regex {
      val var2: StringBuilder = new StringBuilder();
      var2.append("(.+)");
      var2.append(var1);
      var2.append("([a-zA-Z0-9]+)$");
      return new Regex(var2.toString());
   }

   public fun binExtensionFixPattern(atPattern: String): Regex {
      val var2: StringBuilder = new StringBuilder();
      var2.append("(.+)");
      var2.append(var1);
      var2.append("([a-zA-Z0-9]+)\\.bin$");
      return new Regex(var2.toString());
   }

   public fun sizeModifierPattern(colonPattern: String): Regex {
      val var2: StringBuilder = new StringBuilder();
      var2.append("(\\.[a-zA-Z0-9]+)");
      var2.append(var1);
      var2.append(".+$");
      return new Regex(var2.toString());
   }
}
