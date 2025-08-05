package com.discord.foreground_service

import com.discord.foreground_service.service.ServiceNotificationConfiguration
import kotlin.jvm.internal.r

internal sealed class ForegroundServiceOperation protected constructor() {
   public data class CreateOrUpdate(serviceConfigurations: List<ServiceNotificationConfiguration>) : ForegroundServiceOperation {
      public final val serviceConfigurations: List<ServiceNotificationConfiguration>

      init {
         r.h(var1, "serviceConfigurations");
         super(null);
         this.serviceConfigurations = var1;
      }

      public operator fun component1(): List<ServiceNotificationConfiguration> {
         return this.serviceConfigurations;
      }

      public fun copy(serviceConfigurations: List<ServiceNotificationConfiguration> = var0.serviceConfigurations): com.discord.foreground_service.ForegroundServiceOperation.CreateOrUpdate {
         r.h(var1, "serviceConfigurations");
         return new ForegroundServiceOperation.CreateOrUpdate(var1);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is ForegroundServiceOperation.CreateOrUpdate) {
            return false;
         } else {
            return r.c(this.serviceConfigurations, (var1 as ForegroundServiceOperation.CreateOrUpdate).serviceConfigurations);
         }
      }

      public override fun hashCode(): Int {
         return this.serviceConfigurations.hashCode();
      }

      public override fun toString(): String {
         val var1: java.util.List = this.serviceConfigurations;
         val var2: StringBuilder = new StringBuilder();
         var2.append("CreateOrUpdate(serviceConfigurations=");
         var2.append(var1);
         var2.append(")");
         return var2.toString();
      }
   }

   public data object Destroy : ForegroundServiceOperation() {
      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else {
            return var1 is ForegroundServiceOperation.Destroy;
         }
      }

      public override fun hashCode(): Int {
         return 109303815;
      }

      public override fun toString(): String {
         return "Destroy";
      }
   }
}
