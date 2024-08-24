package com.discord.media

import android.database.ContentObserver
import android.database.Cursor
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.os.Build.VERSION
import android.provider.MediaStore.Files
import android.provider.MediaStore.Images.Media
import com.discord.media.react.events.PhotoLibraryChangedEvent
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import eh.w
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r

public class PhotoLibraryHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val listener: <unrepresentable>
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(new Pair[]{w.a("photoLibraryChanged", h0.b(PhotoLibraryChangedEvent.class))});
      this.listener = new ContentObserver(this, new Handler(Looper.getMainLooper())) {
         final PhotoLibraryHelperModule this$0;

         {
            super(var2);
            this.this$0 = var1;
         }

         public void onChange(boolean var1, Uri var2) {
            super.onChange(var1, var2);
            PhotoLibraryHelperModule.access$getReactEvents$p(this.this$0)
               .emitModuleEvent(PhotoLibraryHelperModule.access$getReactContext$p(this.this$0), new PhotoLibraryChangedEvent());
         }
      };
   }

   private fun register() {
      if (VERSION.SDK_INT >= 29) {
         this.reactContext.getContentResolver().registerContentObserver(Files.getContentUri("external"), true, this.listener);
      } else {
         this.reactContext.getContentResolver().registerContentObserver(Media.EXTERNAL_CONTENT_URI, true, this.listener);
         this.reactContext.getContentResolver().registerContentObserver(android.provider.MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, this.listener);
      }
   }

   private fun unregister() {
      this.reactContext.getContentResolver().unregisterContentObserver(this.listener);
   }

   @ReactMethod
   public fun addListener(type: String) {
      r.h(var1, "type");
      if (r.c(var1, "photoLibraryChanged")) {
         this.register();
      }
   }

   @ReactMethod
   public fun doesAttachmentExist(uri: String, promise: Promise) {
      r.h(var1, "uri");
      r.h(var2, "promise");
      val var5: Cursor = this.reactContext.getContentResolver().query(Uri.parse(var1), new java.lang.String[]{"_id"}, null, null, null, null);
      var var4: Boolean = false;
      val var3: Int;
      if (var5 != null) {
         var3 = var5.getCount();
      } else {
         var3 = 0;
      }

      if (var3 > 0) {
         var4 = true;
      }

      var2.resolve(var4);
      if (var5 != null) {
         var5.close();
      }
   }

   public open fun getName(): String {
      return "PhotoLibraryHelper";
   }

   @ReactMethod
   public fun registerEventListener(type: String) {
      r.h(var1, "type");
      if (r.c(var1, "photoLibraryChanged")) {
         this.register();
      }
   }

   @ReactMethod
   public fun removeEventListener(type: String) {
      r.h(var1, "type");
      if (r.c(var1, "photoLibraryChanged")) {
         this.unregister();
      }
   }

   @ReactMethod
   public fun removeListeners(count: Int) {
      this.removeEventListener("photoLibraryChanged");
   }

   public companion object {
      public const val PHOTO_LIBRARY_CHANGED: String
   }
}
