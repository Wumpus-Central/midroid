package com.discord.contact_sync.react

import com.discord.contact_sync.ContactSyncBlobEntry
import com.discord.contact_sync.ContactSyncPayloadEntry
import com.discord.contact_sync.ContactSyncProvider
import com.discord.permissions.NativePermissionManagerModule
import com.discord.permissions.NativePermissionStatus
import com.discord.react.utilities.PromiseWrapper
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactContext
import java.util.ArrayList
import java.util.Locale
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import xk.a2
import xk.f
import xk.r0

@JvmSynthetic
fun `access$mapResultToContactSyncPermission`(var0: java.lang.String): Int {
   return mapResultToContactSyncPermission(var0);
}

private fun String.mapResultToContactSyncPermission(): Int {
   var var3: java.lang.String = NativePermissionStatus.AUTHORIZED.name();
   val var2: Locale = Locale.ROOT;
   var3 = var3.toLowerCase(Locale.ROOT);
   r.g(var3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
   val var1: Byte;
   if (r.c(var0, var3)) {
      var1 = 1;
   } else {
      val var4: java.lang.String = NativePermissionStatus.DENIED.name().toLowerCase(var2);
      r.g(var4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
      r.c(var0, var4);
      var1 = 0;
   }

   return var1;
}

internal fun ReactContext.serializeGetImageForContactIdResult(deviceContactId: String, callback: Callback) {
   r.h(var0, "<this>");
   r.h(var1, "deviceContactId");
   r.h(var2, "callback");

   try {
      var2.invoke(new Object[]{null, ContactSyncProvider.INSTANCE.getImageForContactId(var0, var1)});
   } catch (var3: SecurityException) {
      var2.invoke(new Object[]{mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name()), null});
   }
}

internal fun ReactContext.serializeHasContactPermissionsResult(promise: Promise): Unit? {
   r.h(var0, "<this>");
   r.h(var1, "promise");
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
   r.h(var0, "<this>");
   r.h(var1, "callback");

   var var6: java.util.Iterator;
   var var11: java.lang.String;
   var var12: ArrayList;
   try {
      val var3: java.util.Map = ContactSyncProvider.INSTANCE.getContactsMap(var0);
      var10 = Json.d;
      Json.d.a();
      var11 = var10.c(new r0<>(a2.a, ContactSyncBlobEntry.$serializer.INSTANCE), var3);
      val var4: java.util.Collection = var3.values();
      var12 = new ArrayList(h.t(var4, 10));
      var6 = var4.iterator();
   } catch (var8: SecurityException) {
      var1.invoke(new Object[]{mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name()), null, null});
      return;
   }

   while (true) {
      try {
         if (!var6.hasNext()) {
            break;
         }

         var12.add(new ContactSyncPayloadEntry((var6.next() as ContactSyncBlobEntry).getPhone()));
      } catch (var9: SecurityException) {
         var1.invoke(new Object[]{mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name()), null, null});
         return;
      }
   }

   try {
      var10.a();
      var1.invoke(new Object[]{null, var11, var10.c(new f<>(ContactSyncPayloadEntry.$serializer.INSTANCE), var12)});
   } catch (var7: SecurityException) {
      var1.invoke(new Object[]{mapResultToContactSyncPermission(NativePermissionStatus.DENIED.name()), null, null});
   }
}
