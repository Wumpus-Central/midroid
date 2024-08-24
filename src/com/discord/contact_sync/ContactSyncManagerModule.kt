package com.discord.contact_sync

import com.discord.contact_sync.react.ContactSyncSerializerKt
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class ContactSyncManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   @ReactMethod
   public fun getImageForContactId(deviceContactId: String, callback: Callback) {
      r.h(var1, "deviceContactId");
      r.h(var2, "callback");
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var3, "reactApplicationContext");
      ContactSyncSerializerKt.serializeGetImageForContactIdResult(var3, var1, var2);
   }

   public open fun getName(): String {
      return "DCDContactSyncManager";
   }

   @ReactMethod
   public fun hasContactsPermissions(promise: Promise) {
      r.h(var1, "promise");
      val var2: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var2, "reactApplicationContext");
      ContactSyncSerializerKt.serializeHasContactPermissionsResult(var2, var1);
   }

   @ReactMethod
   public fun syncContacts(blob: String?, phone: String, callback: Callback) {
      r.h(var2, "phone");
      r.h(var3, "callback");
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      r.g(var4, "reactApplicationContext");
      ContactSyncSerializerKt.serializeSyncContactResult(var4, var3);
   }
}
