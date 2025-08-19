package com.discord.image.dominant_color

import M1.a
import M1.b
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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nImageManagerModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageManagerModule.kt\ncom/discord/image/dominant_color/ImageManagerModule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Color.kt\nandroidx/core/graphics/ColorKt\n*L\n1#1,64:1\n1557#2:65\n1628#2,2:66\n1630#2:87\n105#3,19:68\n*S KotlinDebug\n*F\n+ 1 ImageManagerModule.kt\ncom/discord/image/dominant_color/ImageManagerModule\n*L\n52#1:65\n52#1:66,2\n52#1:87\n52#1:68,19\n*E\n"])
public class ImageManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(var1) {
   @JvmStatic
   fun `getAvatarBase64$lambda$0`(var0: Promise, var1: Bitmap): Unit {
      if (var1 != null) {
         val var2: ByteArrayOutputStream = new ByteArrayOutputStream();
         var1.compress(CompressFormat.PNG, 90, var2);
         var0.resolve(Base64.encodeToString(var2.toByteArray(), 0));
      } else {
         var0.reject(new Exception("Unable to decode image source."));
      }

      return Unit.a;
   }

   private fun getDominantColors(uri: String?, promise: Promise) {
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      FrescoFetchDecodedImageKt.fetchDecodedImage$default(var3, var1, null, new a(var2), 2, null);
   }

   @JvmStatic
   fun `getDominantColors$lambda$2`(var0: Promise, var1: Bitmap): Unit {
      if (var1 != null) {
         val var3: java.util.List = DominantColor.INSTANCE.getRepresentativeColors(var1);
         if (var3 != null) {
            val var4: ArrayList = new ArrayList(CollectionsKt.v(var3, 10));
            val var5: java.util.Iterator = var3.iterator();

            while (var5.hasNext()) {
               val var2: Int = (var5.next() as java.lang.Number).intValue();
               var4.add(NativeArrayExtensionsKt.nativeArrayOf(var2 shr 16 and 255, var2 shr 8 and 255, var2 and 255));
            }

            var0.resolve(NativeArrayExtensionsKt.toNativeArray$default(var4, null, 1, null));
         } else {
            var0.reject(new Exception("Unable get representative color."));
         }
      } else {
         var0.reject(new Exception("Unable to decode image source."));
      }

      return Unit.a;
   }

   @ReactMethod
   public fun getAvatarBase64(imageSource: ReadableMap, promise: Promise) {
      val var3: ReactApplicationContext = this.getReactApplicationContext();
      FrescoFetchDecodedImageKt.fetchDecodedImage$default(var3, var1.getString("uri"), null, new b(var2), 2, null);
   }

   @ReactMethod
   public fun getDominantColors(imageSource: ReadableMap, promise: Promise) {
      this.getDominantColors(var1.getString("uri"), var2);
   }

   @ReactMethod
   public fun getDominantColorsLocalAsset(imageSource: ReadableMap, promise: Promise) {
      this.getDominantColors(var1.getString("uri"), var2);
   }

   public open fun getName(): String {
      return "ImageManager";
   }
}
