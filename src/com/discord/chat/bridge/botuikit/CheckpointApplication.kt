package com.discord.chat.bridge.botuikit

import com.discord.primitives.ApplicationId
import kotlinx.serialization.KSerializer
import xu.m

@m
public data class CheckpointApplication(applicationId: ApplicationId, applicationImageId: String? = ..., applicationName: String) : CheckpointApplication(
      var1, var3, var4
   ) {
   public final val applicationId: ApplicationId
   public final val applicationImageId: String?
   public final val applicationName: String

   fun CheckpointApplication(var1: Long, var3: java.lang.String, var4: java.lang.String) {
      super();
      this.applicationId = var1;
      this.applicationImageId = var3;
      this.applicationName = var4;
   }

   public operator fun component1(): ApplicationId {
      return this.applicationId;
   }

   public operator fun component2(): String? {
      return this.applicationImageId;
   }

   public operator fun component3(): String {
      return this.applicationName;
   }

   public fun copy(applicationId: ApplicationId = ..., applicationImageId: String? = ..., applicationName: String = ...): CheckpointApplication {
      return new CheckpointApplication(var1, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CheckpointApplication) {
         return false;
      } else {
         var1 = var1;
         if (!ApplicationId.equals-impl0(this.applicationId, var1.applicationId)) {
            return false;
         } else if (!(this.applicationImageId == var1.applicationImageId)) {
            return false;
         } else {
            return this.applicationName == var1.applicationName;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = ApplicationId.hashCode-impl(this.applicationId);
      val var1: Int;
      if (this.applicationImageId == null) {
         var1 = 0;
      } else {
         var1 = this.applicationImageId.hashCode();
      }

      return (var2 * 31 + var1) * 31 + this.applicationName.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = ApplicationId.toString-impl(this.applicationId);
      val var2: java.lang.String = this.applicationImageId;
      val var3: java.lang.String = this.applicationName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("CheckpointApplication(applicationId=");
      var4.append(var1);
      var4.append(", applicationImageId=");
      var4.append(var2);
      var4.append(", applicationName=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<CheckpointApplication> {
         return CheckpointApplication.$serializer.INSTANCE;
      }
   }
}
