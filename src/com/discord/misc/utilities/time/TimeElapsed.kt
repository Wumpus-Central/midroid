package com.discord.misc.utilities.time

import g9.j
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import kotlin.jvm.internal.q

public data class TimeElapsed(startTime: Long = System.currentTimeMillis()) {
   private final val startTime: Long

   public final val durationMillis: Long
      public final get() {
         return (this.durationMillis$delegate.getValue() as java.lang.Number).longValue();
      }


   public final val duration: String
      public final get() {
         val var1: Any = this.duration$delegate.getValue();
         q.g(var1, "getValue(...)");
         return var1 as java.lang.String;
      }


   fun TimeElapsed() {
      this(0L, 1, null);
   }

   init {
      this.startTime = var1;
      this.durationMillis$delegate = j.b(new a(this));
      this.duration$delegate = j.b(new b(this));
   }

   private operator fun component1(): Long {
      return this.startTime;
   }

   @JvmStatic
   fun `durationMillis_delegate$lambda$0`(var0: TimeElapsed): Long {
      return System.currentTimeMillis() - var0.startTime;
   }

   @JvmStatic
   fun `duration_delegate$lambda$1`(var0: TimeElapsed): java.lang.String {
      return new SimpleDateFormat("mm:ss:SSS", Locale.getDefault()).format(new Date(var0.getDurationMillis()));
   }

   public fun copy(startTime: Long = var0.startTime): TimeElapsed {
      return new TimeElapsed(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TimeElapsed) {
         return false;
      } else {
         return this.startTime == (var1 as TimeElapsed).startTime;
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Long.hashCode(this.startTime);
   }

   public override fun toString(): String {
      val var1: Long = this.startTime;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TimeElapsed(startTime=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
