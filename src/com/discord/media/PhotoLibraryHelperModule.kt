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
import fm.v
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPhotoLibraryHelperModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhotoLibraryHelperModule.kt\ncom/discord/media/PhotoLibraryHelperModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,107:1\n29#2:108\n*S KotlinDebug\n*F\n+ 1 PhotoLibraryHelperModule.kt\ncom/discord/media/PhotoLibraryHelperModule\n*L\n90#1:108\n*E\n"])
public class PhotoLibraryHelperModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   private final val reactContext: ReactApplicationContext
   private final val reactEvents: ReactEvents
   private final val listener: <unrepresentable>

   init {
      this.reactContext = var1;
      this.reactEvents = new ReactEvents(v.a("photoLibraryChanged", PhotoLibraryChangedEvent::class));
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
      if (var1 == "photoLibraryChanged") {
         this.register();
      }
   }

   @ReactMethod
   public fun doesAttachmentExist(uri: String, promise: Promise) {
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

   public override fun getName(): String {
      return "PhotoLibraryHelper";
   }

   @ReactMethod
   public fun registerEventListener(type: String) {
      if (var1 == "photoLibraryChanged") {
         this.register();
      }
   }

   @ReactMethod
   public fun removeEventListener(type: String) {
      if (var1 == "photoLibraryChanged") {
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
