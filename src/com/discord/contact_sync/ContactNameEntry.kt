package com.discord.contact_sync

import kotlin.jvm.internal.r

public data class ContactNameEntry(givenName: String?, familyName: String?) {
   public final val familyName: String?
   public final val givenName: String?

   init {
      this.givenName = var1;
      this.familyName = var2;
   }

   public operator fun component1(): String? {
      return this.givenName;
   }

   public operator fun component2(): String? {
      return this.familyName;
   }

   public fun copy(givenName: String? = var0.givenName, familyName: String? = var0.familyName): ContactNameEntry {
      return new ContactNameEntry(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContactNameEntry) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.givenName, var1.givenName)) {
            return false;
         } else {
            return r.c(this.familyName, var1.familyName);
         }
      }
   }

   public override fun hashCode(): Int {
      var var2: Int = 0;
      val var1: Int;
      if (this.givenName == null) {
         var1 = 0;
      } else {
         var1 = this.givenName.hashCode();
      }

      if (this.familyName != null) {
         var2 = this.familyName.hashCode();
      }

      return var1 * 31 + var2;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.givenName;
      val var3: java.lang.String = this.familyName;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ContactNameEntry(givenName=");
      var1.append(var2);
      var1.append(", familyName=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
