package com.discord.crash_reporting

import java.util.ArrayList

public class PackageProcessTimings {
   public final val modules: MutableList<String> = new ArrayList()

   public final var endTime: Long
      internal set
}
