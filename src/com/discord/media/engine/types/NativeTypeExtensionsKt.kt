package com.discord.media.engine.types

import A9.q
import com.discord.native.engine.AudioInputDeviceDescription
import com.discord.native.engine.AudioOutputDeviceDescription
import com.discord.native.engine.ConnectionInfo
import com.discord.native.engine.VideoInputDeviceDescription
import com.discord.native.engine.VideoInputDeviceFacing
import java.util.ArrayList
import kotlin.jvm.internal.r
import z9.s

internal fun Array<AudioInputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList(var0.length);
   val var3: Int = var0.length;
   var var2: Int = 0;

   for (int var1 = 0; var2 < var3; var1++) {
      var5.add(q.l(new Pair[]{s.a("name", var0[var2].getName()), s.a("guid", var0[var2].getGuid()), s.a("index", var1)}));
      var2++;
   }

   return var5;
}

internal fun Array<AudioOutputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList(var0.length);
   val var3: Int = var0.length;
   var var2: Int = 0;

   for (int var1 = 0; var2 < var3; var1++) {
      var5.add(q.l(new Pair[]{s.a("name", var0[var2].getName()), s.a("guid", var0[var2].getGuid()), s.a("index", var1)}));
      var2++;
   }

   return var5;
}

internal fun Array<VideoInputDeviceDescription>.toListOfMaps(): List<Map<String, Any>> {
   r.h(var0, "<this>");
   val var5: ArrayList = new ArrayList();
   val var6: ArrayList = new ArrayList();
   val var3: Int = var0.length;

   for (int var1 = 0; var1 < var3; var1++) {
      val var4: VideoInputDeviceDescription = var0[var1];
      if (var0[var1].getFacing() === VideoInputDeviceFacing.Front) {
         var5.add(var4);
      } else {
         var6.add(var4);
      }
   }

   val var14: Pair = new Pair(var5, var6);
   val var8: java.util.List = i.e0(
      i.n(
         new VideoInputDeviceDescription[]{
            (VideoInputDeviceDescription)i.j0(var14.a() as java.util.List), (VideoInputDeviceDescription)i.j0(var14.b() as java.util.List)
         }
      )
   );
   val var16: ArrayList = new ArrayList(i.v(var8, 10));
   val var17: java.util.Iterator = var8.iterator();

   for (int var12 = 0; var17.hasNext(); var12++) {
      var var9: Any = var17.next();
      if (var12 < 0) {
         i.u();
      }

      val var18: VideoInputDeviceDescription = var9 as VideoInputDeviceDescription;
      val var13: Int = NativeTypeExtensionsKt.WhenMappings.$EnumSwitchMapping$0[(var9 as VideoInputDeviceDescription).getFacing().ordinal()];
      if (var13 != 1) {
         if (var13 != 2) {
            var9 = "unknown";
         } else {
            var9 = "back";
         }
      } else {
         var9 = "front";
      }

      var16.add(q.l(new Pair[]{s.a("name", var18.getName()), s.a("guid", var18.getGuid()), s.a("facing", var9), s.a("index", var12)}));
   }

   return var16;
}

internal fun AudioInputDeviceDescription.toMap(): Map<String, Any> {
   r.h(var0, "<this>");
   return q.l(new Pair[]{s.a("name", var0.getName()), s.a("guid", var0.getGuid())});
}

internal fun ConnectionInfo.toMap(): Map<String, Any> {
   r.h(var0, "<this>");
   return q.l(new Pair[]{s.a("protocol", var0.getProtocol()), s.a("address", var0.getLocalAddress()), s.a("port", var0.getLocalPort())});
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
