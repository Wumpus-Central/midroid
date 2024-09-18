package com.discord.utils

import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress
import java.util.ArrayList
import java.util.Comparator
import kh.p
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
import nh.a
import xl.l

public class OkHttpDNSSelector(mode: com.discord.utils.OkHttpDNSSelector.IPvMode) : l {
   private final val mode: com.discord.utils.OkHttpDNSSelector.IPvMode

   init {
      q.h(var1, "mode");
      super();
      this.mode = var1;
   }

   public open fun lookup(hostname: String): List<InetAddress> {
      q.h(var1, "hostname");
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
            var5 = i.I0((java.lang.Iterable)var5, new Comparator() {
               @Override
               public final int compare(T var1, T var2) {
                  return a.d(Inet6Address.class.isInstance(var1 as InetAddress), Inet6Address.class.isInstance(var2 as InetAddress));
               }
            });
         }
      } else {
         var5 = i.I0((java.lang.Iterable)var5, new Comparator() {
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
      private EnumEntries $ENTRIES;
      @JvmStatic
      private OkHttpDNSSelector.IPvMode[] $VALUES;

      @JvmStatic
      fun {
         val var0: Array<OkHttpDNSSelector.IPvMode> = $values();
         $VALUES = var0;
         $ENTRIES = rh.a.a(var0);
      }

      init {
         this.code = var3;
      }

      @JvmStatic
      fun getEntries(): EnumEntries {
         return $ENTRIES;
      }
   }
}
