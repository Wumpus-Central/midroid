package com.discord.native.engine

import kotlin.jvm.internal.r

public data class AudioOutputDeviceDescription(name: String, guid: String) {
   public final val guid: String
   public final val name: String

   init {
      r.h(var1, "name");
      r.h(var2, "guid");
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

   public fun copy(name: String = var0.name, guid: String = var0.guid): AudioOutputDeviceDescription {
      r.h(var1, "name");
      r.h(var2, "guid");
      return new AudioOutputDeviceDescription(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioOutputDeviceDescription) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.name, var1.name)) {
            return false;
         } else {
            return r.c(this.guid, var1.guid);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.name.hashCode() * 31 + this.guid.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.name;
      val var2: java.lang.String = this.guid;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AudioOutputDeviceDescription(name=");
      var1.append(var3);
      var1.append(", guid=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
