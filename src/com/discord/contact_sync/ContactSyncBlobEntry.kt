package com.discord.contact_sync

import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.h

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
      r.h(var1, "phone");
      r.h(var2, "unencryptedName");
      r.h(var4, "deviceContactId");
      r.h(var5, "givenName");
      r.h(var6, "familyName");
      super();
      this.phone = var1;
      this.unencryptedName = var2;
      this.hasImageData = var3;
      this.deviceContactId = var4;
      this.givenName = var5;
      this.familyName = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: ContactSyncBlobEntry, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.phone);
      var1.z(var2, 1, var0.unencryptedName);
      var1.x(var2, 2, var0.hasImageData);
      var1.z(var2, 3, var0.deviceContactId);
      var1.z(var2, 4, var0.givenName);
      var1.z(var2, 5, var0.familyName);
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
      r.h(var1, "phone");
      r.h(var2, "unencryptedName");
      r.h(var4, "deviceContactId");
      r.h(var5, "givenName");
      r.h(var6, "familyName");
      return new ContactSyncBlobEntry(var1, var2, var3, var4, var5, var6);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ContactSyncBlobEntry) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.phone, var1.phone)) {
            return false;
         } else if (!r.c(this.unencryptedName, var1.unencryptedName)) {
            return false;
         } else if (this.hasImageData != var1.hasImageData) {
            return false;
         } else if (!r.c(this.deviceContactId, var1.deviceContactId)) {
            return false;
         } else if (!r.c(this.givenName, var1.givenName)) {
            return false;
         } else {
            return r.c(this.familyName, var1.familyName);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.phone.hashCode();
      val var4: Int = this.unencryptedName.hashCode();
      var var1: Byte = this.hasImageData;
      if (this.hasImageData != 0) {
         var1 = 1;
      }

      return ((((var3 * 31 + var4) * 31 + var1) * 31 + this.deviceContactId.hashCode()) * 31 + this.givenName.hashCode()) * 31 + this.familyName.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.phone;
      val var4: java.lang.String = this.unencryptedName;
      val var1: Boolean = this.hasImageData;
      val var6: java.lang.String = this.deviceContactId;
      val var7: java.lang.String = this.givenName;
      val var5: java.lang.String = this.familyName;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ContactSyncBlobEntry(phone=");
      var3.append(var2);
      var3.append(", unencryptedName=");
      var3.append(var4);
      var3.append(", hasImageData=");
      var3.append(var1);
      var3.append(", deviceContactId=");
      var3.append(var6);
      var3.append(", givenName=");
      var3.append(var7);
      var3.append(", familyName=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : f0<ContactSyncBlobEntry> {
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

      public override fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{a2.a, a2.a, h.a, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): ContactSyncBlobEntry {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Int;
         var var5: Boolean;
         var var8: java.lang.String;
         var var9: java.lang.String;
         val var10: java.lang.String;
         val var14: java.lang.String;
         var var16: java.lang.String;
         if (var13.p()) {
            var8 = var13.m(var12, 0);
            var9 = var13.m(var12, 1);
            var5 = var13.C(var12, 2);
            var16 = var13.m(var12, 3);
            val var7: java.lang.String = var13.m(var12, 4);
            var14 = var13.m(var12, 5);
            var2 = 63;
            var10 = var16;
            var16 = var7;
         } else {
            var8 = null;
            var9 = null;
            var16 = null;
            var var18: java.lang.String = null;
            var var15: java.lang.String = null;
            var var3: Boolean = true;
            var5 = false;
            var2 = 0;

            while (var3) {
               val var4: Int = var13.o(var12);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var8 = var13.m(var12, 0);
                     var2 |= 1;
                     break;
                  case 1:
                     var15 = var13.m(var12, 1);
                     var2 |= 2;
                     break;
                  case 2:
                     var5 = var13.C(var12, 2);
                     var2 |= 4;
                     break;
                  case 3:
                     var16 = var13.m(var12, 3);
                     var2 |= 8;
                     break;
                  case 4:
                     var18 = var13.m(var12, 4);
                     var2 |= 16;
                     break;
                  case 5:
                     var9 = var13.m(var12, 5);
                     var2 |= 32;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var10 = var16;
            var14 = var9;
            var16 = var18;
            var9 = var15;
         }

         var13.c(var12);
         return new ContactSyncBlobEntry(var2, var8, var9, var5, var10, var16, var14, null);
      }

      public open fun serialize(encoder: Encoder, value: ContactSyncBlobEntry) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         ContactSyncBlobEntry.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      override fun typeParametersSerializers(): Array<KSerializer<?>> {
         return f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ContactSyncBlobEntry> {
         return ContactSyncBlobEntry.$serializer.INSTANCE;
      }
   }
}
