package com.discord.contact_sync

import com.discord.contact_sync.react.ContactSyncSerializerKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.q

public class ContactSyncManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod
   public fun getImageForContactId(deviceContactId: String, callback: Callback) {
      q.h(var1, "deviceContactId");
      q.h(var2, "callback");
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      ContactSyncSerializerKt.serializeGetImageForContactIdResult(var3, var1, var2);
   }

   public open fun getName(): String {
      return "DCDContactSyncManager";
   }

   @ReactMethod
   public fun hasContactsPermissions(promise: Promise) {
      q.h(var1, "promise");
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var2, "getReactApplicationContext(...)");
      ContactSyncSerializerKt.serializeHasContactPermissionsResult(var2, var1);
   }

   @ReactMethod
   public fun syncContacts(blob: String?, phone: String, callback: Callback) {
      q.h(var2, "phone");
      q.h(var3, "callback");
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var4, "getReactApplicationContext(...)");
      ContactSyncSerializerKt.serializeSyncContactResult(var4, var3);
   }
}
