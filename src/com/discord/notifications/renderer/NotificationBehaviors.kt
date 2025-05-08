package com.discord.notifications.renderer

public data class NotificationBehaviors(soundsEnabled: Boolean, vibrationsEnabled: Boolean, lightsEnabled: Boolean) {
   public final val lightsEnabled: Boolean
   public final val soundsEnabled: Boolean
   public final val vibrationsEnabled: Boolean

   init {
      this.soundsEnabled = var1;
      this.vibrationsEnabled = var2;
      this.lightsEnabled = var3;
   }

   public operator fun component1(): Boolean {
      return this.soundsEnabled;
   }

   public operator fun component2(): Boolean {
      return this.vibrationsEnabled;
   }

   public operator fun component3(): Boolean {
      return this.lightsEnabled;
   }

   public fun copy(
      soundsEnabled: Boolean = var0.soundsEnabled,
      vibrationsEnabled: Boolean = var0.vibrationsEnabled,
      lightsEnabled: Boolean = var0.lightsEnabled
   ): NotificationBehaviors {
      return new NotificationBehaviors(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is NotificationBehaviors) {
         return false;
      } else {
         var1 = var1;
         if (this.soundsEnabled != var1.soundsEnabled) {
            return false;
         } else if (this.vibrationsEnabled != var1.vibrationsEnabled) {
            return false;
         } else {
            return this.lightsEnabled == var1.lightsEnabled;
         }
      }
   }

   public override fun hashCode(): Int {
      return (java.lang.Boolean.hashCode(this.soundsEnabled) * 31 + java.lang.Boolean.hashCode(this.vibrationsEnabled)) * 31
         + java.lang.Boolean.hashCode(this.lightsEnabled);
   }

   public override fun toString(): String {
      val var2: Boolean = this.soundsEnabled;
      val var3: Boolean = this.vibrationsEnabled;
      val var1: Boolean = this.lightsEnabled;
      val var4: StringBuilder = new StringBuilder();
      var4.append("NotificationBehaviors(soundsEnabled=");
      var4.append(var2);
      var4.append(", vibrationsEnabled=");
      var4.append(var3);
      var4.append(", lightsEnabled=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
