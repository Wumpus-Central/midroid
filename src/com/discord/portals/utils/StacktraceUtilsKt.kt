package com.discord.portals.utils

import ht.e

public fun getCurrentStacktraceString(): String {
   return e.b(new java.lang.Throwable());
}
