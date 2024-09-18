package com.discord.audio

import android.media.AudioDeviceInfo
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import dh.w
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import vk.n
import yk.b2
import yk.g0
import yk.n0

@vk.f
public class AndroidAudioDevice {
   public final var deviceId: Int
      internal set

   public final var deviceName: String
      internal set

   public final var deviceType: Int
      internal set

   public final var simpleDeviceType: SimpleDeviceType
      internal set

   init {
      this.simpleDeviceType = SimpleDeviceType.INVALID;
      this.deviceId = -1;
      this.deviceName = "";
   }

   public fun toNativeMap(): WritableNativeMap {
      return NativeMapExtensionsKt.nativeMapOf(
         w.a("deviceType", this.deviceType),
         w.a("simpleDeviceType", this.simpleDeviceType.name()),
         w.a("deviceId", this.deviceId),
         w.a("deviceName", this.deviceName)
      );
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AndroidAudioDevice.$serializer = new AndroidAudioDevice.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.audio.AndroidAudioDevice", var0, 4);
         var1.l("deviceType", true);
         var1.l("simpleDeviceType", true);
         var1.l("deviceId", true);
         var1.l("deviceName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, AndroidAudioDevice.access$get$childSerializers$cp()[1], n0.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): AndroidAudioDevice {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: kotlinx.serialization.encoding.c = var1.c(var8);
         val var10: Array<KSerializer> = AndroidAudioDevice.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: SimpleDeviceType;
         var var11: java.lang.String;
         if (var9.y()) {
            var4 = var9.k(var8, 0);
            var7 = var9.m(var8, 1, var10[1], null) as SimpleDeviceType;
            var3 = var9.k(var8, 2);
            var11 = var9.t(var8, 3);
            var2 = 15;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var7 = null;
            var11 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var11 = var9.t(var8, 3);
                           var2 |= 8;
                        } else {
                           var3 = var9.k(var8, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var9.m(var8, 1, var10[1], var7) as SimpleDeviceType;
                        var2 |= 2;
                     }
                  } else {
                     var4 = var9.k(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var9.b(var8);
         return new AndroidAudioDevice(var2, var4, var7, var3, var11, null);
      }

      public open fun serialize(encoder: Encoder, value: AndroidAudioDevice) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         AndroidAudioDevice.write$Self$audio_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return yk.g0.a.a(this);
      }
   }

   public companion object {
      public fun fromAudioDeviceInfo(deviceInfo: AudioDeviceInfo): AndroidAudioDevice {
         q.h(var1, "deviceInfo");
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
         q.h(var1, "map");
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
         q.h(var1, "deviceType");
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
