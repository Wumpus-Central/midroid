package com.discord.native.engine

import kotlin.jvm.internal.q

public data class AudioInputDeviceDescription(name: String, guid: String) {
   public final val guid: String
   public final val name: String

   init {
      q.h(var1, "name");
      q.h(var2, "guid");
      super();
      this.name = var1;
      this.guid = var2;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public operator fun component2(): String {
      return this.guid;
   }

   public fun copy(name: String = var0.name, guid: String = var0.guid): AudioInputDeviceDescription {
      q.h(var1, "name");
      q.h(var2, "guid");
      return new AudioInputDeviceDescription(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioInputDeviceDescription) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.name, var1.name)) {
            return false;
         } else {
            return q.c(this.guid, var1.guid);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.name.hashCode() * 31 + this.guid.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.name;
      val var2: java.lang.String = this.guid;
      val var3: StringBuilder = new StringBuilder();
      var3.append("AudioInputDeviceDescription(name=");
      var3.append(var1);
      var3.append(", guid=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
