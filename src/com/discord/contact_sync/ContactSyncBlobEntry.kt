package com.discord.contact_sync

import Ka.f
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class ContactSyncBlobEntry(phone: String,
   unencryptedName: String,
   hasImageData: Boolean,
   deviceContactId: String,
   givenName: String,
   familyName: String
) {
   public final val phone: String
   public final val unencryptedName: String
   public final val hasImageData: Boolean
   public final val deviceContactId: String
   public final val givenName: String
   public final val familyName: String

   init {
      q.h(var1, "phone");
      q.h(var2, "unencryptedName");
      q.h(var4, "deviceContactId");
      q.h(var5, "givenName");
      q.h(var6, "familyName");
      super();
      this.phone = var1;
      this.unencryptedName = var2;
      this.hasImageData = var3;
      this.deviceContactId = var4;
      this.givenName = var5;
      this.familyName = var6;
   }

   public operator fun component1(): String {
      return this.phone;
   }

   public operator fun component2(): String {
      return this.unencryptedName;
   }

   public operator fun component3(): Boolean {
      return this.hasImageData;
   }

   public operator fun component4(): String {
      return this.deviceContactId;
   }

   public operator fun component5(): String {
      return this.givenName;
   }

   public operator fun component6(): String {
      return this.familyName;
   }

   public fun copy(
      phone: String = var0.phone,
      unencryptedName: String = var0.unencryptedName,
      hasImageData: Boolean = var0.hasImageData,
      deviceContactId: String = var0.deviceContactId,
      givenName: String = var0.givenName,
      familyName: String = var0.familyName
   ): ContactSyncBlobEntry {
      q.h(var1, "phone");
      q.h(var2, "unencryptedName");
      q.h(var4, "deviceContactId");
      q.h(var5, "givenName");
      q.h(var6, "familyName");
      return new ContactSyncBlobEntry(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContactSyncBlobEntry) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.phone, var1.phone)) {
            return false;
         } else if (!q.c(this.unencryptedName, var1.unencryptedName)) {
            return false;
         } else if (this.hasImageData != var1.hasImageData) {
            return false;
         } else if (!q.c(this.deviceContactId, var1.deviceContactId)) {
            return false;
         } else if (!q.c(this.givenName, var1.givenName)) {
            return false;
         } else {
            return q.c(this.familyName, var1.familyName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        ((this.phone.hashCode() * 31 + this.unencryptedName.hashCode()) * 31 + java.lang.Boolean.hashCode(this.hasImageData)) * 31
                           + this.deviceContactId.hashCode()
                     )
                     * 31
                  + this.givenName.hashCode()
            )
            * 31
         + this.familyName.hashCode();
   }

   public override fun toString(): String {
      val var4: java.lang.String = this.phone;
      val var7: java.lang.String = this.unencryptedName;
      val var1: Boolean = this.hasImageData;
      val var6: java.lang.String = this.deviceContactId;
      val var2: java.lang.String = this.givenName;
      val var5: java.lang.String = this.familyName;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ContactSyncBlobEntry(phone=");
      var3.append(var4);
      var3.append(", unencryptedName=");
      var3.append(var7);
      var3.append(", hasImageData=");
      var3.append(var1);
      var3.append(", deviceContactId=");
      var3.append(var6);
      var3.append(", givenName=");
      var3.append(var2);
      var3.append(", familyName=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<ContactSyncBlobEntry> {
         return ContactSyncBlobEntry.$serializer.INSTANCE;
      }
   }
}
