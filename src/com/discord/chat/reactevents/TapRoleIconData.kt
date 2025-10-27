package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kc.m
import kotlinx.serialization.KSerializer

@m
public data class TapRoleIconData(roleName: String, roleIconSource: String) : ReactEvent {
   public final val roleName: String
   public final val roleIconSource: String

   init {
      super();
      this.roleName = var1;
      this.roleIconSource = var2;
   }

   public operator fun component1(): String {
      return this.roleName;
   }

   public operator fun component2(): String {
      return this.roleIconSource;
   }

   public fun copy(roleName: String = var0.roleName, roleIconSource: String = var0.roleIconSource): TapRoleIconData {
      return new TapRoleIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapRoleIconData) {
         return false;
      } else {
         var1 = var1;
         if (!(this.roleName == var1.roleName)) {
            return false;
         } else {
            return this.roleIconSource == var1.roleIconSource;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.roleName.hashCode() * 31 + this.roleIconSource.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.roleName;
      val var2: java.lang.String = this.roleIconSource;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapRoleIconData(roleName=");
      var3.append(var1);
      var3.append(", roleIconSource=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapRoleIconData> {
         return TapRoleIconData.$serializer.INSTANCE;
      }
   }
}
