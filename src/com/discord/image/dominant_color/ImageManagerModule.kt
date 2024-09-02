package com.discord.image.dominant_color

import android.graphics.Bitmap
import android.graphics.Bitmap.CompressFormat
import android.util.Base64
import com.discord.image.DominantColor
import com.discord.image.fresco.FrescoFetchDecodedImageKt
import com.discord.react.utilities.NativeArrayExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import java.io.ByteArrayOutputStream
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

public class ImageManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   private fun getDominantColors(uri: String?, promise: Promise) {
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      FrescoFetchDecodedImageKt.fetchDecodedImage$default(var3, var1, null, new Function1(var2) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Bitmap var1) {
            if (var1 != null) {
               val var4: java.util.List = DominantColor.INSTANCE.getRepresentativeColors(var1);
               if (var4 != null) {
                  val var5: ArrayList = new ArrayList(i.u(var4, 10));
                  val var6: java.util.Iterator = var4.iterator();

                  while (var6.hasNext()) {
                     val var2: Int = (var6.next() as java.lang.Number).intValue();
                     var5.add(NativeArrayExtensionsKt.nativeArrayOf(new Object[]{var2 shr 16 and 255, var2 shr 8 and 255, var2 and 255}));
                  }

                  this.$promise.resolve(NativeArrayExtensionsKt.toNativeArray(var5));
               } else {
                  this.$promise.reject(new Exception("Unable get representative color."));
               }
            } else {
               this.$promise.reject(new Exception("Unable to decode image source."));
            }
         }
      }, 2, null);
   }

   @ReactMethod
   public fun getAvatarBase64(imageSource: ReadableMap, promise: Promise) {
      q.h(var1, "imageSource");
      q.h(var2, "promise");
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      q.g(var3, "getReactApplicationContext(...)");
      FrescoFetchDecodedImageKt.fetchDecodedImage$default(var3, var1.getString("uri"), null, new Function1(var2) {
         final Promise $promise;

         {
            super(1);
            this.$promise = var1;
         }

         public final void invoke(Bitmap var1) {
            if (var1 != null) {
               val var2: ByteArrayOutputStream = new ByteArrayOutputStream();
               var1.compress(CompressFormat.PNG, 90, var2);
               this.$promise.resolve(Base64.encodeToString(var2.toByteArray(), 0));
            } else {
               this.$promise.reject(new Exception("Unable to decode image source."));
            }
         }
      }, 2, null);
   }

   @ReactMethod
   public fun getDominantColors(imageSource: ReadableMap, promise: Promise) {
      q.h(var1, "imageSource");
      q.h(var2, "promise");
      this.getDominantColors(var1.getString("uri"), var2);
   }

   @ReactMethod
   public fun getDominantColorsLocalAsset(imageSource: ReadableMap, promise: Promise) {
      q.h(var1, "imageSource");
      q.h(var2, "promise");
      this.getDominantColors(var1.getString("uri"), var2);
   }

   public open fun getName(): String {
      return "ImageManager";
   }
}
