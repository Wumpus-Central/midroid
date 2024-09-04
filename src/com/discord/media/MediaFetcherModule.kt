package com.discord.media

import com.discord.media.react.GetPhotosData
import com.discord.media.utils.ContentResolverMedia
import com.discord.media.utils.ContentResolverMedia.QueryType
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import hh.a
import java.util.Comparator
import kotlin.jvm.internal.r

public class MediaFetcherModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   private fun getQueryType(filter: String?): QueryType {
      if (var1 != null) {
         val var2: Int = var1.hashCode();
         if (var2 != -989034367) {
            if (var2 != -816678056) {
               if (var2 == 65921 && var1.equals("All")) {
                  return ContentResolverMedia.QueryType.ALL;
               }
            } else if (var1.equals("videos")) {
               return ContentResolverMedia.QueryType.VIDEO;
            }
         } else if (var1.equals("photos")) {
            return ContentResolverMedia.QueryType.IMAGE;
         }
      }

      val var3: StringBuilder = new StringBuilder();
      var3.append("Unknown filter type: ");
      var3.append(var1);
      throw new IllegalArgumentException(var3.toString());
   }

   public open fun getName(): String {
      return "CameraRollUtils";
   }

   @ReactMethod
   public fun getPhotos(params: ReadableMap, promise: Promise) {
      r.h(var1, "params");
      r.h(var2, "promise");
      val var4: Int = var1.getInt("first");
      val var5: Int;
      if (var1.hasKey("offset")) {
         var5 = var1.getInt("offset");
      } else {
         var5 = null;
      }

      val var6: ContentResolverMedia.QueryType = this.getQueryType(var1.getString("assetType"));

      var var3: Int;
      try {
         val var12: ContentResolverMedia.Companion = ContentResolverMedia.Companion;
         val var7: ReactApplicationContext = this.getReactApplicationContext();
         r.g(var7, "reactApplicationContext");
         var16 = h.G0(h.E0(var12.getMedia(var7, var6, var4, var5), new Comparator() {
            @Override
            public final int compare(T var1, T var2) {
               return a.d((var2 as ContentResolverMedia).getDateAdded(), (var1 as ContentResolverMedia).getDateAdded());
            }
         }), var4);
         var3 = var16.size();
      } catch (var11: Exception) {
         var2.reject("E_UNABLE_TO_LOAD", var11);
         return;
      }

      val var14: WritableNativeMap;
      if (var3 == var4) {
         try {
            var14 = NativeMapExtensionsKt.nativeMapOf(
               new Pair[]{
                  w.a("start_cursor", java.lang.String.valueOf((h.a0(var16) as ContentResolverMedia).getUri())),
                  w.a("end_cursor", java.lang.String.valueOf((h.m0(var16) as ContentResolverMedia).getUri())),
                  w.a("has_next_page", java.lang.Boolean.TRUE)
               }
            );
         } catch (var10: Exception) {
            var2.reject("E_UNABLE_TO_LOAD", var10);
            return;
         }
      } else {
         try {
            var14 = NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("has_next_page", java.lang.Boolean.FALSE)});
         } catch (var9: Exception) {
            var2.reject("E_UNABLE_TO_LOAD", var9);
            return;
         }
      }

      try {
         val var17: WritableNativeMap = new GetPhotosData(var16).toNativeMap();
         var17.putMap("page_info", var14);
         var2.resolve(var17);
      } catch (var8: Exception) {
         var2.reject("E_UNABLE_TO_LOAD", var8);
      }
   }
}
