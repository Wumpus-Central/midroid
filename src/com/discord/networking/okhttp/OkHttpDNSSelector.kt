package com.discord.networking.okhttp

import Ca.p
import Fa.a
import Kc.l
import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress
import java.util.ArrayList
import java.util.Comparator
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOkHttpDNSSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1053#2:36\n1053#2:37\n774#2:38\n865#2,2:39\n774#2:41\n865#2,2:42\n*S KotlinDebug\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n*L\n25#1:36\n26#1:37\n27#1:38\n27#1:39,2\n28#1:41\n28#1:42,2\n*E\n"])
internal class OkHttpDNSSelector(mode: com.discord.networking.okhttp.OkHttpDNSSelector.IPvMode) : l {
   private final val mode: com.discord.networking.okhttp.OkHttpDNSSelector.IPvMode

   init {
      this.mode = var1;
   }

   public open fun lookup(hostname: String): List<InetAddress> {
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
            var5 = CollectionsKt.M0((java.lang.Iterable)var5, new Comparator() {
               @Override
               public final int compare(T var1, T var2) {
                  return a.d(Inet6Address.class.isInstance(var1 as InetAddress), Inet6Address.class.isInstance(var2 as InetAddress));
               }
            });
         }
      } else {
         var5 = CollectionsKt.M0((java.lang.Iterable)var5, new Comparator() {
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
         $ENTRIES = Ia.a.a(var0);
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
