package com.discord.contact_sync

import bl.b2
import bl.g0
import bl.h
import bl.g0.a
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import yk.f
import yk.n

@f
public data class ContactSyncBlobEntry(phone: String,
   unencryptedName: String,
   hasImageData: Boolean,
   deviceContactId: String,
   givenName: String,
   familyName: String
) {
   public final val deviceContactId: String
   public final val familyName: String
   public final val givenName: String
   public final val hasImageData: Boolean
   public final val phone: String
   public final val unencryptedName: String

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
      val var6: java.lang.String = this.phone;
      val var2: java.lang.String = this.unencryptedName;
      val var1: Boolean = this.hasImageData;
      val var3: java.lang.String = this.deviceContactId;
      val var5: java.lang.String = this.givenName;
      val var7: java.lang.String = this.familyName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("ContactSyncBlobEntry(phone=");
      var4.append(var6);
      var4.append(", unencryptedName=");
      var4.append(var2);
      var4.append(", hasImageData=");
      var4.append(var1);
      var4.append(", deviceContactId=");
      var4.append(var3);
      var4.append(", givenName=");
      var4.append(var5);
      var4.append(", familyName=");
      var4.append(var7);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ContactSyncBlobEntry.$serializer = new ContactSyncBlobEntry.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.contact_sync.ContactSyncBlobEntry", var0, 6);
         var1.l("phone", false);
         var1.l("unencryptedName", false);
         var1.l("hasImageData", false);
         var1.l("deviceContactId", false);
         var1.l("givenName", false);
         var1.l("familyName", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, h.a, b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): ContactSyncBlobEntry {
         q.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.c(var11);
         var var2: Int;
         var var5: Boolean;
         var var8: java.lang.String;
         var var9: java.lang.String;
         val var10: java.lang.String;
         val var13: java.lang.String;
         var var15: java.lang.String;
         if (var12.y()) {
            var9 = var12.t(var11, 0);
            var8 = var12.t(var11, 1);
            var5 = var12.s(var11, 2);
            var15 = var12.t(var11, 3);
            val var7: java.lang.String = var12.t(var11, 4);
            var13 = var12.t(var11, 5);
            var2 = 63;
            var10 = var15;
            var15 = var7;
         } else {
            var9 = null;
            var8 = null;
            var var16: java.lang.String = null;
            var15 = null;
            var var14: java.lang.String = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var12.x(var11);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var9 = var12.t(var11, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var14 = var12.t(var11, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var12.s(var11, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var16 = var12.t(var11, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var15 = var12.t(var11, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var8 = var12.t(var11, 5);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var8 = var14;
            var13 = var8;
            var10 = var16;
         }

         var12.b(var11);
         return new ContactSyncBlobEntry(var2, var9, var8, var5, var10, var15, var13, null);
      }

      public open fun serialize(encoder: Encoder, value: ContactSyncBlobEntry) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ContactSyncBlobEntry.write$Self$contact_sync_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContactSyncBlobEntry> {
         return ContactSyncBlobEntry.$serializer.INSTANCE;
      }
   }
}
