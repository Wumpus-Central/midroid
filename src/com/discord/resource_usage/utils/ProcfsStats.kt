package com.discord.resource_usage.utils

import bm.c
import java.io.File
import yh.j

internal data class ProcfsStats(totalTime: Long, rssPages: Long) {
   public final val rssPages: Long
   public final val totalTime: Long

   init {
      this.totalTime = var1;
      this.rssPages = var3;
   }

   public operator fun component1(): Long {
      return this.totalTime;
   }

   public operator fun component2(): Long {
      return this.rssPages;
   }

   public fun copy(totalTime: Long = var0.totalTime, rssPages: Long = var0.rssPages): ProcfsStats {
      return new ProcfsStats(var1, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ProcfsStats) {
         return false;
      } else {
         var1 = var1;
         if (this.totalTime != var1.totalTime) {
            return false;
         } else {
            return this.rssPages == var1.rssPages;
         }
      }
   }

   public override fun hashCode(): Int {
      return java.lang.Long.hashCode(this.totalTime) * 31 + java.lang.Long.hashCode(this.rssPages);
   }

   public override fun toString(): String {
      val var3: Long = this.totalTime;
      val var1: Long = this.rssPages;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ProcfsStats(totalTime=");
      var5.append(var3);
      var5.append(", rssPages=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      private final val statFile: File
         private final get() {
            return ProcfsStats.access$getStatFile$delegate$cp().getValue() as File;
         }


      private fun File.parsePidStats(): ProcfsStats? {
         var var8: ProcfsStats = null;

         try {
            if (!var1.exists()) {
               return var8;
            }

            var12 = j.d(var1, null, 1, null);
         } catch (var11: Exception) {
            return null;
         }

         var8 = null;

         try {
            if (var12.length() > 0) {
               val var13: java.util.List = h.y0(var12, new char[]{' '}, false, 0, 6, null);
               var8 = new ProcfsStats(
                  c.T(var13.get(13) as java.lang.String, 0L) + c.T(var13.get(14) as java.lang.String, 0L), c.T(var13.get(23) as java.lang.String, 0L)
               );
            }
         } catch (var10: Exception) {
            var8 = null;
         }

         return var8;
      }

      public fun readStatFile(): ProcfsStats? {
         return this.parsePidStats(this.getStatFile());
      }
   }
}
