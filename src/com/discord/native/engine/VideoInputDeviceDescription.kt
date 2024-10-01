package com.discord.native.engine

import kotlin.jvm.internal.q

public data class VideoInputDeviceDescription(name: String, guid: String, facing: VideoInputDeviceFacing) {
   public final val facing: VideoInputDeviceFacing
   public final val guid: String
   public final val name: String

   init {
      q.h(var1, "name");
      q.h(var2, "guid");
      q.h(var3, "facing");
      super();
      this.name = var1;
      this.guid = var2;
      this.facing = var3;
   }

   public operator fun component1(): String {
      return this.name;
   }

   public operator fun component2(): String {
      return this.guid;
   }

   public operator fun component3(): VideoInputDeviceFacing {
      return this.facing;
   }

   public fun copy(name: String = var0.name, guid: String = var0.guid, facing: VideoInputDeviceFacing = var0.facing): VideoInputDeviceDescription {
      q.h(var1, "name");
      q.h(var2, "guid");
      q.h(var3, "facing");
      return new VideoInputDeviceDescription(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VideoInputDeviceDescription) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.name, var1.name)) {
            return false;
         } else if (!q.c(this.guid, var1.guid)) {
            return false;
         } else {
            return this.facing === var1.facing;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.name.hashCode() * 31 + this.guid.hashCode()) * 31 + this.facing.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.name;
      val var2: java.lang.String = this.guid;
      val var1: VideoInputDeviceFacing = this.facing;
      val var3: StringBuilder = new StringBuilder();
      var3.append("VideoInputDeviceDescription(name=");
      var3.append(var4);
      var3.append(", guid=");
      var3.append(var2);
      var3.append(", facing=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
