package com.discord.networking.okhttp

import fm.p
import im.a
import java.net.Inet4Address
import java.net.Inet6Address
import java.net.InetAddress
import java.util.ArrayList
import java.util.Comparator
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.SourceDebugExtension
import oq.l

@SourceDebugExtension(["SMAP\nOkHttpDNSSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1053#2:36\n1053#2:37\n774#2:38\n865#2,2:39\n774#2:41\n865#2,2:42\n*S KotlinDebug\n*F\n+ 1 OkHttpDNSSelector.kt\ncom/discord/networking/okhttp/OkHttpDNSSelector\n*L\n25#1:36\n26#1:37\n27#1:38\n27#1:39,2\n28#1:41\n28#1:42,2\n*E\n"])
internal class OkHttpDNSSelector(mode: com.discord.networking.okhttp.OkHttpDNSSelector.IPvMode) : l {
   private final val mode: com.discord.networking.okhttp.OkHttpDNSSelector.IPvMode

   init {
      this.mode = var1;
   }

   public open fun lookup(hostname: String): List<InetAddress> {
      val var3: java.util.List = l.a.lookup(var1);
      val var2: Int = OkHttpDNSSelector.WhenMappings.$EnumSwitchMapping$0[this.mode.ordinal()];
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  if (var2 == 5) {
                     return var3;
                  } else {
                     throw new p();
                  }
               } else {
                  val var7: ArrayList = new ArrayList();

                  for (Object var9 : var3) {
                     if (Inet4Address.class.isInstance(var9 as InetAddress)) {
                        var7.add(var9);
                     }
                  }

                  return var7;
               }
            } else {
               val var6: ArrayList = new ArrayList();

               for (Object var8 : var3) {
                  if (Inet6Address.class.isInstance(var8 as InetAddress)) {
                     var6.add(var8);
                  }
               }

               return var6;
            }
         } else {
            return CollectionsKt.M0(var3, new Comparator() {
               @Override
               public final int compare(T var1, T var2) {
                  return a.d(Inet6Address.class.isInstance(var1 as InetAddress), Inet6Address.class.isInstance(var2 as InetAddress));
               }
            });
         }
      } else {
         return CollectionsKt.M0(var3, new Comparator() {
            @Override
            public final int compare(T var1, T var2) {
               return a.d(Inet4Address.class.isInstance(var1 as InetAddress), Inet4Address.class.isInstance(var2 as InetAddress));
            }
         });
      }
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
         $ENTRIES = lm.a.a(var0);
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
