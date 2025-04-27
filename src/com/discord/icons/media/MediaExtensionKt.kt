package com.discord.icons.media

private final val ANIMATED_IMAGE_EXTENSION: String
private final val STATIC_IMAGE_EXTENSION: String

internal fun getMediaExtension(allowAnimation: Boolean): String {
   val var1: java.lang.String;
   if (var0) {
      var1 = ANIMATED_IMAGE_EXTENSION;
   } else {
      var1 = STATIC_IMAGE_EXTENSION;
   }

   return var1;
}

internal fun isImageHashAnimated(imageHash: String?): Boolean {
   return var0 == null || h.J(var0, "a_", false, 2, null);
}
