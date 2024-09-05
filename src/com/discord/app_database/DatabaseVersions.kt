package com.discord.app_database

import java.util.Arrays
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.g0
import qn.g0.a

@f
public data class DatabaseVersions(vararg guildVersions: Any, vararg nonGuildVersions: Any) {
   public final val guildVersions: Array<GuildVersion>
   public final val nonGuildVersions: Array<NonGuildVersion>

   init {
      q.h(var1, "guildVersions");
      q.h(var2, "nonGuildVersions");
      super();
      this.guildVersions = var1;
      this.nonGuildVersions = var2;
   }

   public operator fun component1(): Array<GuildVersion> {
      return this.guildVersions;
   }

   public operator fun component2(): Array<NonGuildVersion> {
      return this.nonGuildVersions;
   }

   public fun copy(guildVersions: Array<GuildVersion> = var0.guildVersions, nonGuildVersions: Array<NonGuildVersion> = var0.nonGuildVersions): DatabaseVersions {
      q.h(var1, "guildVersions");
      q.h(var2, "nonGuildVersions");
      return new DatabaseVersions(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DatabaseVersions) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.guildVersions, var1.guildVersions)) {
            return false;
         } else {
            return q.c(this.nonGuildVersions, var1.nonGuildVersions);
         }
      }
   }

   public override fun hashCode(): Int {
      return Arrays.hashCode((Object[])this.guildVersions) * 31 + Arrays.hashCode((Object[])this.nonGuildVersions);
   }

   public override fun toString(): String {
      val var3: java.lang.String = Arrays.toString((Object[])this.guildVersions);
      val var1: java.lang.String = Arrays.toString((Object[])this.nonGuildVersions);
      val var2: StringBuilder = new StringBuilder();
      var2.append("DatabaseVersions(guildVersions=");
      var2.append(var3);
      var2.append(", nonGuildVersions=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: DatabaseVersions.$serializer = new DatabaseVersions.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.DatabaseVersions", var0, 2);
         var1.c("guildVersions", false);
         var1.c("nonGuildVersions", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: Array<KSerializer> = DatabaseVersions.access$get$childSerializers$cp();
         return new KSerializer[]{var1[0], var1[1]};
      }

      public open fun deserialize(decoder: Decoder): DatabaseVersions {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         val var8: Array<KSerializer> = DatabaseVersions.access$get$childSerializers$cp();
         var var2: Int;
         var var5: Array<NonGuildVersion>;
         var var9: Array<GuildVersion>;
         if (var7.p()) {
            var9 = var7.y(var6, 0, var8[0], null) as Array<GuildVersion>;
            var5 = var7.y(var6, 1, var8[1], null) as Array<NonGuildVersion>;
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = null;
            var9 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.y(var6, 1, var8[1], var5) as Array<NonGuildVersion>;
                     var2 |= 2;
                  } else {
                     var9 = var7.y(var6, 0, var8[0], var9) as Array<GuildVersion>;
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new DatabaseVersions(var2, var9, var5, null);
      }

      public open fun serialize(encoder: Encoder, value: DatabaseVersions) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DatabaseVersions.write$Self$app_database_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public final val EMPTY: DatabaseVersions

      public fun serializer(): KSerializer<DatabaseVersions> {
         return DatabaseVersions.$serializer.INSTANCE;
      }
   }
}
