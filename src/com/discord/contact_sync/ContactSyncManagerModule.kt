package com.discord.contact_sync

import com.discord.contact_sync.react.ContactSyncSerializerKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

public class ContactSyncManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @ReactMethod
   public fun getImageForContactId(deviceContactId: String, callback: Callback) {
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      ContactSyncSerializerKt.serializeGetImageForContactIdResult(var3, var1, var2);
   }

   public override fun getName(): String {
      return "DCDContactSyncManager";
   }

   @ReactMethod
   public fun hasContactsPermissions(promise: Promise) {
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      ContactSyncSerializerKt.serializeHasContactPermissionsResult(var2, var1);
   }

   @ReactMethod
   public fun syncContacts(blob: String?, phone: String, callback: Callback) {
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      ContactSyncSerializerKt.serializeSyncContactResult(var4, var3);
   }
}
