package com.discord.resource_usage.utils

import java.io.File
import oh.j
import ol.c

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
      val var1: Long = this.totalTime;
      val var3: Long = this.rssPages;
      val var5: StringBuilder = new StringBuilder();
      var5.append("ProcfsStats(totalTime=");
      var5.append(var1);
      var5.append(", rssPages=");
      var5.append(var3);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      private final val statFile: File
         private final get() {
            return ProcfsStats.access$getStatFile$delegate$cp().getValue() as File;
         }


      private fun File.parsePidStats(): ProcfsStats? {
         var var9: ProcfsStats = null;

         var var2: Boolean;
         label27: {
            label26: {
               try {
                  if (!var1.exists()) {
                     return var9;
                  }

                  var13 = j.d(var1, null, 1, null);
                  if (var13.length() > 0) {
                     break label26;
                  }
               } catch (var12: Exception) {
                  return null;
               }

               var2 = false;
               break label27;
            }

            var2 = true;
         }

         var9 = null;
         if (var2) {
            try {
               val var14: java.util.List = f.z0(var13, new char[]{' '}, false, 0, 6, null);
               var9 = new ProcfsStats(
                  c.T(var14.get(13) as java.lang.String, 0L) + c.T(var14.get(14) as java.lang.String, 0L), c.T(var14.get(23) as java.lang.String, 0L)
               );
            } catch (var11: Exception) {
               var9 = null;
            }
         }

         return var9;
      }

      public fun readStatFile(): ProcfsStats? {
         return this.parsePidStats(this.getStatFile());
      }
   }
}
