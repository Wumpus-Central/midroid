package com.discord.icons.media

private const val ANIMATED_IMAGE_EXTENSION: String = "gif"
private final val STATIC_IMAGE_EXTENSION: String

internal fun getMediaExtension(allowAnimation: Boolean, imageHash: String? = null): String {
   if (var0 && isImageHashAnimated(var1)) {
      var1 = "gif";
   } else {
      var1 = STATIC_IMAGE_EXTENSION;
   }

   return var1;
}

@JvmSynthetic
fun `getMediaExtension$default`(var0: Boolean, var1: java.lang.String, var2: Int, var3: Any): java.lang.String {
   if ((var2 and 2) != 0) {
      var1 = null;
   }

   return getMediaExtension(var0, var1);
}

private fun isImageHashAnimated(imageHash: String?): Boolean {
   return var0 == null || h.H(var0, "a_", false, 2, null);
}
