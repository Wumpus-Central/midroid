package com.discord.icons.media

private final val ANIMATED_IMAGE_EXTENSION: String
private final val STATIC_IMAGE_EXTENSION: String

internal fun getMediaExtension(allowAnimation: Boolean): String {
   return if (var0) ANIMATED_IMAGE_EXTENSION else STATIC_IMAGE_EXTENSION;
}

internal fun isImageHashAnimated(imageHash: String?): Boolean {
   return var0 == null || StringsKt.I(var0, "a_", false, 2, null);
}
