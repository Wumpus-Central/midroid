package com.discord.misc.utilities.kotlin

import kotlin.jvm.internal.q

@JvmSynthetic
public inline fun <reified T> Any.castOrNull(): T? {
   q.h(var0, "<this>");
   q.m(2, "T");
   return (T)var0;
}
