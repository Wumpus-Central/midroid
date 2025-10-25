package com.discord.portals.utils

import xa.e

public fun getCurrentStacktraceString(): String {
   return e.b(new java.lang.Throwable());
}
