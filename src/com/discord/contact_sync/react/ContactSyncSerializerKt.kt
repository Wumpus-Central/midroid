package com.discord.contact_sync.react

import com.discord.contact_sync.ContactSyncBlobEntry
import com.discord.contact_sync.ContactSyncPayloadEntry
import com.discord.contact_sync.ContactSyncProvider
import com.discord.permissions.NativePermissionManagerModule
import com.discord.react.utilities.PromiseWrapper
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactContext
import fl.b2
import fl.f
import fl.s0
import java.util.ArrayList
import java.util.Locale
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json

@JvmSynthetic
fun `access$mapResultToContactSyncPermission`(var0: java.lang.String): Int {
   return mapResultToContactSyncPermission(var0);
}

private fun String.mapResultToContactSyncPermission(): Int {
   val var2: Locale = Locale.ROOT;
   val var3: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
   q.g(var3, "toLowerCase(...)");
   val var1: Byte;
   if (q.c(var0, var3)) {
      var1 = 1;
   } else {
      val var4: java.lang.String = "DENIED".toLowerCase(var2);
      q.g(var4, "toLowerCase(...)");
      q.c(var0, var4);
      var1 = 0;
   }

   return var1;
}

internal fun ReactContext.serializeGetImageForContactIdResult(deviceContactId: String, callback: Callback) {
   q.h(var0, "<this>");
   q.h(var1, "deviceContactId");
   q.h(var2, "callback");

   try {
      var2.invoke(new Object[]{null, ContactSyncProvider.INSTANCE.getImageForContactId(var0, var1)});
   } catch (var3: SecurityException) {
      var2.invoke(new Object[]{mapResultToContactSyncPermission("DENIED"), null});
   }
}

internal fun ReactContext.serializeHasContactPermissionsResult(promise: Promise): Unit? {
   q.h(var0, "<this>");
   q.h(var1, "promise");
   val var2: NativePermissionManagerModule = var0.getNativeModule(NativePermissionManagerModule.class) as NativePermissionManagerModule;
   val var3: Unit;
   if (var2 != null) {
      var2.hasContactAuthorization(new PromiseWrapper(var1, <unrepresentable>.INSTANCE, null, 4, null));
      var3 = Unit.a;
   } else {
      var3 = null;
   }

   return var3;
}

internal fun ReactContext.serializeSyncContactResult(callback: Callback) {
   q.h(var0, "<this>");
   q.h(var1, "callback");

   var var6: java.util.Iterator;
   var var11: java.lang.String;
   var var12: ArrayList;
   try {
      val var3: java.util.Map = ContactSyncProvider.INSTANCE.getContactsMap(var0);
      var10 = Json.d;
      Json.d.a();
      var11 = var10.c(new s0(b2.a, ContactSyncBlobEntry.Companion.serializer()), var3);
      val var4: java.util.Collection = var3.values();
      var12 = new ArrayList(i.v(var4, 10));
      var6 = var4.iterator();
   } catch (var8: SecurityException) {
      var1.invoke(new Object[]{mapResultToContactSyncPermission("DENIED"), null, null});
      return;
   }

   while (true) {
      try {
         if (!var6.hasNext()) {
            break;
         }

         var12.add(new ContactSyncPayloadEntry((var6.next() as ContactSyncBlobEntry).getPhone()));
      } catch (var9: SecurityException) {
         var1.invoke(new Object[]{mapResultToContactSyncPermission("DENIED"), null, null});
         return;
      }
   }

   try {
      var10.a();
      var1.invoke(new Object[]{null, var11, var10.c(new f(ContactSyncPayloadEntry.Companion.serializer()), var12)});
   } catch (var7: SecurityException) {
      var1.invoke(new Object[]{mapResultToContactSyncPermission("DENIED"), null, null});
   }
}
