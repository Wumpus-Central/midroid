package com.discord.misc.utilities.kotlin

import kotlin.jvm.internal.r

@JvmSynthetic
public inline fun <reified T> Any.castOrNull(): T? {
   r.h(var0, "<this>");
   r.m(2, "T");
   return (T)var0;
}
