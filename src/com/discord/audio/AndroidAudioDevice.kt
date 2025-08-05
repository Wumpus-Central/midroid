package com.discord.audio

import B9.s
import android.media.AudioDeviceInfo
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer

@ub.g
public class AndroidAudioDevice {
   public final var deviceType: Int
      internal set

   public final var simpleDeviceType: SimpleDeviceType
      internal set

   public final var deviceId: Int
      internal set

   public final var deviceName: String
      internal set

   init {
      this.simpleDeviceType = SimpleDeviceType.INVALID;
      this.deviceId = -1;
      this.deviceName = "";
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         s.a("deviceType", this.deviceType),
         s.a("simpleDeviceType", this.simpleDeviceType.name()),
         s.a("deviceId", this.deviceId),
         s.a("deviceName", this.deviceName)
      );
   }

   public companion object {
      public fun fromAudioDeviceInfo(deviceInfo: AudioDeviceInfo): AndroidAudioDevice {
         r.h(var1, "deviceInfo");
         val var4: AndroidAudioDevice = new AndroidAudioDevice();
         var4.setDeviceName(var1.getProductName().toString());
         var4.setDeviceType(var1.getType());
         val var3: SimpleDeviceType = AndroidAudioDeviceKt.getAudioDeviceTypeToSimpleMapping().get(var4.getDeviceType());
         var var2: SimpleDeviceType = var3;
         if (var3 == null) {
            var2 = SimpleDeviceType.INVALID;
         }

         var4.setSimpleDeviceType(var2);
         var4.setDeviceId(var1.getId());
         return var4;
      }

      public fun fromReadableMap(map: ReadableMap): AndroidAudioDevice {
         r.h(var1, "map");
         val var4: AndroidAudioDevice = new AndroidAudioDevice();
         val var3: java.lang.String = var1.getString("deviceName");
         var var2: java.lang.String = var3;
         if (var3 == null) {
            var2 = "";
         }

         var4.setDeviceName(var2);
         if (var1.hasKey("deviceId")) {
            var4.setDeviceId(var1.getInt("deviceId"));
         }

         val var9: SimpleDeviceType = SimpleDeviceType.INVALID;

         label27: {
            var var5: java.lang.String;
            try {
               var5 = var1.getString("simpleDeviceType");
            } catch (var7: Exception) {
               var8 = SimpleDeviceType.INVALID;
               break label27;
            }

            var8 = var9;
            if (var5 != null) {
               try {
                  var8 = SimpleDeviceType.valueOf(var5);
               } catch (var6: Exception) {
                  var8 = var9;
               }
            }
         }

         var4.setSimpleDeviceType(var8);
         if (var1.hasKey("deviceType")) {
            var4.setDeviceType(var1.getInt("deviceType"));
         }

         return var4;
      }

      public fun fromSimpleDeviceType(deviceType: SimpleDeviceType): AndroidAudioDevice {
         r.h(var1, "deviceType");
         val var2: AndroidAudioDevice = new AndroidAudioDevice();
         var2.setSimpleDeviceType(var1);
         var2.setDeviceId(var1.ordinal());
         return var2;
      }

      public fun serializer(): KSerializer<AndroidAudioDevice> {
         return AndroidAudioDevice.$serializer.INSTANCE;
      }
   }
}
