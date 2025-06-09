package com.discord.chat.reactevents

import Xa.f
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class TapRoleIconData(roleName: String, roleIconSource: String) : ReactEvent {
   public final val roleName: String
   public final val roleIconSource: String

   init {
      q.h(var1, "roleName");
      q.h(var2, "roleIconSource");
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
      q.h(var1, "roleName");
      q.h(var2, "roleIconSource");
      return new TapRoleIconData(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapRoleIconData) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.roleName, var1.roleName)) {
            return false;
         } else {
            return q.c(this.roleIconSource, var1.roleIconSource);
         }
      }
   }

   public override fun hashCode(): Int {
      return this.roleName.hashCode() * 31 + this.roleIconSource.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.roleName;
      val var1: java.lang.String = this.roleIconSource;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapRoleIconData(roleName=");
      var2.append(var3);
      var2.append(", roleIconSource=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<TapRoleIconData> {
         return TapRoleIconData.$serializer.INSTANCE;
      }
   }
}
