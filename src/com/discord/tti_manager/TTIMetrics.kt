package com.discord.tti_manager

import java.util.ArrayList
import kotlin.jvm.internal.q

public object TTIMetrics {
   public final var loggedTTI: Boolean
      public final get() {
         label13: {
            synchronized (this){} // $VF: monitorenter 

            try {
               val var1: Boolean = loggedTTI;
            } catch (var3: java.lang.Throwable) {
               // $VF: monitorexit
            }

            // $VF: monitorexit
         }
      }

      public final set(<set-?>) {
         label13: {
            synchronized (this){} // $VF: monitorenter 

            try {
               loggedTTI = var1;
            } catch (var3: java.lang.Throwable) {
               // $VF: monitorexit
            }

            // $VF: monitorexit
         }
      }


   private final val timings: MutableList<com.discord.tti_manager.TTIMetrics.Timing> = new ArrayList()

   public fun getTimings(): ArrayList<com.discord.tti_manager.TTIMetrics.Timing> {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            new ArrayList<>(timings);
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun record(label: String, timestamp: Long = System.currentTimeMillis(), tag: String? = null, autoGenerated: Boolean = false) {
      label13: {
         synchronized (this){} // $VF: monitorenter 

         try {
            q.h(var1, "label");
            timings.add(new TTIMetrics.Timing(var1, var2, var4, var5));
         } catch (var8: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public data class Timing(label: String, timestamp: Long, tag: String?, autoGenerated: Boolean) {
      public final val autoGenerated: Boolean
      public final val label: String
      public final val tag: String?
      public final val timestamp: Long

      init {
         q.h(var1, "label");
         super();
         this.label = var1;
         this.timestamp = var2;
         this.tag = var4;
         this.autoGenerated = var5;
      }

      public operator fun component1(): String {
         return this.label;
      }

      public operator fun component2(): Long {
         return this.timestamp;
      }

      public operator fun component3(): String? {
         return this.tag;
      }

      public operator fun component4(): Boolean {
         return this.autoGenerated;
      }

      public fun copy(label: String = var0.label, timestamp: Long = var0.timestamp, tag: String? = var0.tag, autoGenerated: Boolean = var0.autoGenerated): com.discord.tti_manager.TTIMetrics.Timing {
         q.h(var1, "label");
         return new TTIMetrics.Timing(var1, var2, var4, var5);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is TTIMetrics.Timing) {
            return false;
         } else {
            var1 = var1;
            if (!q.c(this.label, var1.label)) {
               return false;
            } else if (this.timestamp != var1.timestamp) {
               return false;
            } else if (!q.c(this.tag, var1.tag)) {
               return false;
            } else {
               return this.autoGenerated == var1.autoGenerated;
            }
         }
      }

      public override fun hashCode(): Int {
         val var2: Int = this.label.hashCode();
         val var3: Int = java.lang.Long.hashCode(this.timestamp);
         val var1: Int;
         if (this.tag == null) {
            var1 = 0;
         } else {
            var1 = this.tag.hashCode();
         }

         return ((var2 * 31 + var3) * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.autoGenerated);
      }

      public override fun toString(): String {
         val var6: java.lang.String = this.label;
         val var1: Long = this.timestamp;
         val var4: java.lang.String = this.tag;
         val var3: Boolean = this.autoGenerated;
         val var5: StringBuilder = new StringBuilder();
         var5.append("Timing(label=");
         var5.append(var6);
         var5.append(", timestamp=");
         var5.append(var1);
         var5.append(", tag=");
         var5.append(var4);
         var5.append(", autoGenerated=");
         var5.append(var3);
         var5.append(")");
         return var5.toString();
      }
   }
}
