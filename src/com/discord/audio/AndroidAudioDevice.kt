package com.discord.audio

import android.media.AudioDeviceInfo
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.n
import qn.b2
import qn.g0
import qn.n0
import vj.w

@nn.f
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
         new Pair[]{
            w.a("deviceType", this.deviceType),
            w.a("simpleDeviceType", this.simpleDeviceType.name()),
            w.a("deviceId", this.deviceId),
            w.a("deviceName", this.deviceName)
         }
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
         var1.c("deviceType", true);
         var1.c("simpleDeviceType", true);
         var1.c("deviceId", true);
         var1.c("deviceName", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{n0.a, AndroidAudioDevice.access$get$childSerializers$cp()[1], n0.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): AndroidAudioDevice {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: kotlinx.serialization.encoding.c = var1.b(var9);
         val var8: Array<KSerializer> = AndroidAudioDevice.access$get$childSerializers$cp();
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: SimpleDeviceType;
         var var12: java.lang.String;
         if (var10.p()) {
            var4 = var10.i(var9, 0);
            val var11: SimpleDeviceType = var10.y(var9, 1, var8[1], null) as SimpleDeviceType;
            var3 = var10.i(var9, 2);
            val var13: java.lang.String = var10.m(var9, 3);
            var2 = 15;
            var7 = var11;
            var12 = var13;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var7 = null;
            var12 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var10.o(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var12 = var10.m(var9, 3);
                           var2 |= 8;
                        } else {
                           var3 = var10.i(var9, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.y(var9, 1, var8[1], var7) as SimpleDeviceType;
                        var2 |= 2;
                     }
                  } else {
                     var4 = var10.i(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var10.c(var9);
         return new AndroidAudioDevice(var2, var4, var7, var3, var12, null);
      }

      public open fun serialize(encoder: Encoder, value: AndroidAudioDevice) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AndroidAudioDevice.write$Self$audio_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
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
