package com.discord.audio

import android.media.AudioDeviceInfo
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReadableMap
import com.facebook.react.bridge.WritableNativeMap
import eh.w
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.a2
import xk.c0
import xk.f0
import xk.m0

@f
public class AndroidAudioDevice {
   public final var deviceId: Int
      internal set

   public final var deviceName: String
      internal set

   public final var deviceType: Int
      internal set

   public final var simpleDeviceType: SimpleDeviceType = SimpleDeviceType.INVALID
      internal set

   init {
      this.deviceId = -1;
      this.deviceName = "";
   }

   @JvmStatic
   public fun `write$Self`(self: AndroidAudioDevice, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var var3: Boolean;
      if (!var1.A(var2, 0) && var0.deviceType == 0) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.w(var2, 0, var0.deviceType);
      }

      if (!var1.A(var2, 1) && var0.simpleDeviceType === SimpleDeviceType.INVALID) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.y(var2, 1, c0.b("com.discord.audio.SimpleDeviceType", SimpleDeviceType.values()), var0.simpleDeviceType);
      }

      if (!var1.A(var2, 2) && var0.deviceId == -1) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.w(var2, 2, var0.deviceId);
      }

      label40: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (r.c(var0.deviceName, "")) {
               break label40;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.z(var2, 3, var0.deviceName);
      }
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

   public object `$serializer` : f0<AndroidAudioDevice> {
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
         val var1: m0 = m0.a;
         return new KSerializer[]{m0.a, c0.b("com.discord.audio.SimpleDeviceType", SimpleDeviceType.values()), var1, a2.a};
      }

      public open fun deserialize(decoder: Decoder): AndroidAudioDevice {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: kotlinx.serialization.encoding.c = var1.b(var8);
         var var4: Int;
         val var5: Int;
         var var7: Any;
         var var10: java.lang.String;
         var var11: Int;
         if (var9.p()) {
            var11 = var9.i(var8, 0);
            var7 = var9.y(var8, 1, c0.b("com.discord.audio.SimpleDeviceType", SimpleDeviceType.values()), null);
            val var3: Int = var9.i(var8, 2);
            var10 = var9.m(var8, 3);
            var4 = 15;
            var5 = var11;
            var11 = var3;
         } else {
            var var16: Boolean = true;
            var4 = 0;
            var11 = 0;
            var7 = null;
            var10 = null;
            var var13: Int = 0;

            while (var16) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var10 = var9.m(var8, 3);
                           var11 |= 8;
                        } else {
                           var13 = var9.i(var8, 2);
                           var11 |= 4;
                        }
                     } else {
                        var7 = var9.y(var8, 1, c0.b("com.discord.audio.SimpleDeviceType", SimpleDeviceType.values()), var7);
                        var11 |= 2;
                     }
                  } else {
                     var4 = var9.i(var8, 0);
                     var11 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var11 = var13;
            var5 = var4;
            var4 = var11;
         }

         var9.c(var8);
         return new AndroidAudioDevice(var4, var5, var7 as SimpleDeviceType, var11, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: AndroidAudioDevice) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AndroidAudioDevice.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
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
