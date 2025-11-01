@file:SourceDebugExtension(["SMAP\nContactSyncSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactSyncSerializer.kt\ncom/discord/contact_sync/react/ContactSyncSerializerKt\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n113#2:77\n113#2:82\n1557#3:78\n1628#3,3:79\n*S KotlinDebug\n*F\n+ 1 ContactSyncSerializer.kt\ncom/discord/contact_sync/react/ContactSyncSerializerKt\n*L\n34#1:77\n35#1:82\n36#1:78\n36#1:79,3\n*E\n"])

package com.discord.contact_sync.react

import av.f
import av.n2
import av.u0
import com.discord.contact_sync.ContactSyncBlobEntry
import com.discord.contact_sync.ContactSyncPayloadEntry
import com.discord.contact_sync.ContactSyncProvider
import com.discord.permissions.NativePermissionManagerModule
import com.discord.react.utilities.PromiseWrapper
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactContext
import java.util.ArrayList
import java.util.Locale
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import n8.a

@JvmSynthetic
fun a(var0: Any): Any {
   return serializeHasContactPermissionsResult$lambda$0(var0);
}

private fun String.mapResultToContactSyncPermission(): Int {
   val var2: Locale = Locale.ROOT;
   var var1: java.lang.String = "AUTHORIZED".toLowerCase(Locale.ROOT);
   if (var0 == var1) {
      return 1;
   } else {
      var1 = "DENIED".toLowerCase(var2);
      var0 == var1;
      return 0;
   }
}

internal fun ReactContext.serializeGetImageForContactIdResult(deviceContactId: String, callback: Callback) {
   try {
      var2.invoke(null, ContactSyncProvider.INSTANCE.getImageForContactId(var0, var1));
   } catch (var3: SecurityException) {
      var2.invoke(mapResultToContactSyncPermission("DENIED"), null);
   }
}

internal fun ReactContext.serializeHasContactPermissionsResult(promise: Promise): Unit? {
   val var2: NativePermissionManagerModule = var0.getNativeModule(NativePermissionManagerModule.class);
   if (var2 != null) {
      var2.hasContactAuthorization(new PromiseWrapper(var1, new a(), null, 4, null));
      return Unit.a;
   } else {
      return null;
   }
}

fun `serializeHasContactPermissionsResult$lambda$0`(var0: Any): Any {
   if (var0 is java.lang.String) {
      var0 = var0;
   } else {
      var0 = null;
   }

   return if (var0 != null) mapResultToContactSyncPermission(var0) else null;
}

internal fun ReactContext.serializeSyncContactResult(callback: Callback) {
   var var6: java.util.Iterator;
   var var11: java.lang.String;
   var var12: ArrayList;
   try {
      val var3: java.util.Map = ContactSyncProvider.INSTANCE.getContactsMap(var0);
      var10 = Json.d;
      Json.d.a();
      var11 = var10.c(new u0(n2.a, ContactSyncBlobEntry.Companion.serializer()), var3);
      val var4: java.lang.Iterable = var3.values();
      var12 = new ArrayList(CollectionsKt.w(var4, 10));
      var6 = var4.iterator();
   } catch (var8: SecurityException) {
      var1.invoke(mapResultToContactSyncPermission("DENIED"), null, null);
      return;
   }

   while (true) {
      try {
         if (!var6.hasNext()) {
            break;
         }

         var12.add(new ContactSyncPayloadEntry((var6.next() as ContactSyncBlobEntry).getPhone()));
      } catch (var9: SecurityException) {
         var1.invoke(mapResultToContactSyncPermission("DENIED"), null, null);
         return;
      }
   }

   try {
      var10.a();
      var1.invoke(null, var11, var10.c(new f(ContactSyncPayloadEntry.Companion.serializer()), var12));
   } catch (var7: SecurityException) {
      var1.invoke(mapResultToContactSyncPermission("DENIED"), null, null);
   }
}
