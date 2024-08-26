package com.discord.utils

import eh.p
import hh.a
import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress
import java.util.ArrayList
import java.util.Comparator
import kotlin.jvm.internal.r
import nl.l

public class OkHttpDNSSelector(mode: com.discord.utils.OkHttpDNSSelector.IPvMode) : l {
   private final val mode: com.discord.utils.OkHttpDNSSelector.IPvMode

   init {
      r.h(var1, "mode");
      super();
      this.mode = var1;
   }

   public open fun lookup(hostname: String): List<InetAddress> {
      r.h(var1, "hostname");
      var var5: Any = l.a.lookup(var1);
      val var2: Int = OkHttpDNSSelector.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  if (var2 != 5) {
                     throw new p();
                  }
               } else {
                  val var8: ArrayList = new ArrayList();
                  val var4: java.util.Iterator = var5.iterator();

                  while (true) {
                     var5 = var8;
                     if (!var4.hasNext()) {
                        break;
                     }

                     var5 = var4.next();
                     if (Inet4Address.class.isInstance(var5 as InetAddress)) {
                        var8.add(var5);
                     }
                  }
               }
            } else {
               val var9: ArrayList = new ArrayList();
               val var10: java.util.Iterator = var5.iterator();

               while (true) {
                  var5 = var9;
                  if (!var10.hasNext()) {
                     break;
                  }

                  var5 = var10.next();
                  if (Inet6Address.class.isInstance(var5 as InetAddress)) {
                     var9.add(var5);
                  }
               }
            }
         } else {
            var5 = h.E0((java.lang.Iterable)var5, new Comparator() {
               @Override
               public final int compare(T var1, T var2) {
                  return a.d(Inet6Address.class.isInstance(var1 as InetAddress), Inet6Address.class.isInstance(var2 as InetAddress));
               }
            });
         }
      } else {
         var5 = h.E0((java.lang.Iterable)var5, new Comparator() {
            @Override
            public final int compare(T var1, T var2) {
               return a.d(Inet4Address.class.isInstance(var1 as InetAddress), Inet4Address.class.isInstance(var2 as InetAddress));
            }
         });
      }

      return (java.util.List<InetAddress>)var5;
   }

   public enum class IPvMode(code: String) {
      IPV4_FIRST("ipv4"),
      IPV4_ONLY("ipv4only"),
      IPV6_FIRST("ipv6"),
      IPV6_ONLY("ipv6only"),
      SYSTEM("system")
      public final val code: String
      @JvmStatic
      private OkHttpDNSSelector.IPvMode[] $VALUES = $values();

      init {
         this.code = var3;
      }
   }

   // $VF: Class flags could not be determined
   internal class WhenMappings {
      @JvmStatic
      public int[] $EnumSwitchMapping$0;

      @JvmStatic
      fun {
         val var0: IntArray = new int[OkHttpDNSSelector.IPvMode.values().length];

         try {
            var0[OkHttpDNSSelector.IPvMode.IPV6_FIRST.ordinal()] = 1;
         } catch (var6: NoSuchFieldError) {
         }

         try {
            var0[OkHttpDNSSelector.IPvMode.IPV4_FIRST.ordinal()] = 2;
         } catch (var5: NoSuchFieldError) {
         }

         try {
            var0[OkHttpDNSSelector.IPvMode.IPV6_ONLY.ordinal()] = 3;
         } catch (var4: NoSuchFieldError) {
         }

         try {
            var0[OkHttpDNSSelector.IPvMode.IPV4_ONLY.ordinal()] = 4;
         } catch (var3: NoSuchFieldError) {
         }

         try {
            var0[OkHttpDNSSelector.IPvMode.SYSTEM.ordinal()] = 5;
         } catch (var2: NoSuchFieldError) {
         }

         $EnumSwitchMapping$0 = var0;
      }
   }
}
