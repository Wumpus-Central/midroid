package com.discord.media.engine.types

import com.discord.native.engine.AudioInputDeviceDescription
import com.discord.native.engine.AudioOutputDeviceDescription
import com.discord.native.engine.ConnectionInfo
import com.discord.native.engine.VideoInputDeviceDescription
import com.discord.native.engine.VideoInputDeviceFacing
import eh.w
import fh.s
import java.util.ArrayList
import kotlin.jvm.internal.r

internal fun Array<AudioInputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList(var0.length);
   val var3: Int = var0.length;
   var var2: Int = 0;

   for (int var1 = 0; var2 < var3; var1++) {
      var5.add(s.l(new Pair[]{w.a("name", var0[var2].getName()), w.a("guid", var0[var2].getGuid()), w.a("index", var1)}));
      var2++;
   }

   return var5;
}

internal fun Array<AudioOutputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var4: ArrayList = new ArrayList(var0.length);
   val var3: Int = var0.length;
   var var2: Int = 0;

   for (int var1 = 0; var2 < var3; var1++) {
      var4.add(s.l(new Pair[]{w.a("name", var0[var2].getName()), w.a("guid", var0[var2].getGuid()), w.a("index", var1)}));
      var2++;
   }

   return var4;
}

internal fun Array<VideoInputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList();
   var var4: ArrayList = new ArrayList();
   val var3: Int = var0.length;
   var var1: Int = 0;

   while (true) {
      var var2: Int = 1;
      if (var1 >= var3) {
         val var14: Pair = new Pair(var5, var4);
         val var8: java.util.List = h.X(
            h.l(
               new VideoInputDeviceDescription[]{
                  h.c0(var14.a() as java.util.List) as VideoInputDeviceDescription, h.c0(var14.b() as java.util.List) as VideoInputDeviceDescription
               }
            )
         );
         var4 = new ArrayList(h.t(var8, 10));
         val var17: java.util.Iterator = var8.iterator();

         for (int var12 = 0; var17.hasNext(); var12++) {
            var var9: Any = var17.next();
            if (var12 < 0) {
               h.s();
            }

            val var18: VideoInputDeviceDescription = var9 as VideoInputDeviceDescription;
            var2 = NativeTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[(var9 as VideoInputDeviceDescription).getFacing().ordinal()];
            if (var2 != 1) {
               if (var2 != 2) {
                  var9 = "unknown";
               } else {
                  var9 = "back";
               }
            } else {
               var9 = "front";
            }

            var4.add(s.l(new Pair[]{w.a("name", var18.getName()), w.a("guid", var18.getGuid()), w.a("facing", var9), w.a("index", var12)}));
         }

         return var4;
      }

      val var6: VideoInputDeviceDescription = var0[var1];
      if (var0[var1].getFacing() != VideoInputDeviceFacing.Front) {
         var2 = 0;
      }

      if (var2) {
         var5.add(var6);
      } else {
         var4.add(var6);
      }

      var1++;
   }
}

internal fun ConnectionInfo.toMap(): Map<String, Any> {
   r.h(var0, "<this>");
   return s.l(new Pair[]{w.a("protocol", var0.getProtocol()), w.a("address", var0.getLocalAddress()), w.a("port", var0.getLocalPort())});
}
// $VF: Class flags could not be determined
@JvmSynthetic
internal class WhenMappings {
   @JvmStatic
   public int[] $EnumSwitchMapping$0;

   @JvmStatic
   fun {
      val var0: IntArray = new int[VideoInputDeviceFacing.values().length];

      try {
         var0[VideoInputDeviceFacing.Front.ordinal()] = 1;
      } catch (var3: NoSuchFieldError) {
      }

      try {
         var0[VideoInputDeviceFacing.Back.ordinal()] = 2;
      } catch (var2: NoSuchFieldError) {
      }

      $EnumSwitchMapping$0 = var0;
   }
}
