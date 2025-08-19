package com.discord.misc.utilities.kotlin

import kotlin.jvm.internal.Intrinsics

@JvmSynthetic
public inline fun <reified T> Any.castOrNull(): T? {
   Intrinsics.reifiedOperationMarker(2, "T");
   return (T)var0;
}
