package com.discord.native.engine

public data class AudioInputInitializationInfo(description: AudioInputDeviceDescription, timeToInitializedNanos: Long) {
   public final val description: AudioInputDeviceDescription
   public final val timeToInitializedNanos: Long

   init {
      this.description = var1;
      this.timeToInitializedNanos = var2;
   }

   public operator fun component1(): AudioInputDeviceDescription {
      return this.description;
   }

   public operator fun component2(): Long {
      return this.timeToInitializedNanos;
   }

   public fun copy(description: AudioInputDeviceDescription = var0.description, timeToInitializedNanos: Long = var0.timeToInitializedNanos): AudioInputInitializationInfo {
      return new AudioInputInitializationInfo(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioInputInitializationInfo) {
         return false;
      } else {
         var1 = var1;
         if (!(this.description == var1.description)) {
            return false;
         } else {
            return this.timeToInitializedNanos == var1.timeToInitializedNanos;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.description.hashCode() * 31 + java.lang.Long.hashCode(this.timeToInitializedNanos);
   }

   public override fun toString(): String {
      val var4: AudioInputDeviceDescription = this.description;
      val var1: Long = this.timeToInitializedNanos;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioInputInitializationInfo(description=");
      var3.append(var4);
      var3.append(", timeToInitializedNanos=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
