package com.discord.app_database

import java.util.Arrays
import kotlin.jvm.internal.h0
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import uk.f
import uk.n
import xk.f0
import xk.v1
import xk.f0.a

@f
public data class DatabaseVersions(vararg guildVersions: Any, vararg nonGuildVersions: Any) {
   public final val guildVersions: Array<GuildVersion>
   public final val nonGuildVersions: Array<NonGuildVersion>

   init {
      r.h(var1, "guildVersions");
      r.h(var2, "nonGuildVersions");
      super();
      this.guildVersions = var1;
      this.nonGuildVersions = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: DatabaseVersions, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, new v1(h0.b(GuildVersion.class), GuildVersion.$serializer.INSTANCE), var0.guildVersions);
      var1.y(var2, 1, new v1(h0.b(NonGuildVersion.class), NonGuildVersion.$serializer.INSTANCE), var0.nonGuildVersions);
   }

   public operator fun component1(): Array<GuildVersion> {
      return this.guildVersions;
   }

   public operator fun component2(): Array<NonGuildVersion> {
      return this.nonGuildVersions;
   }

   public fun copy(guildVersions: Array<GuildVersion> = var0.guildVersions, nonGuildVersions: Array<NonGuildVersion> = var0.nonGuildVersions): DatabaseVersions {
      r.h(var1, "guildVersions");
      r.h(var2, "nonGuildVersions");
      return new DatabaseVersions(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DatabaseVersions) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.guildVersions, var1.guildVersions)) {
            return false;
         } else {
            return r.c(this.nonGuildVersions, var1.nonGuildVersions);
         }
      }
   }

   public override fun hashCode(): Int {
      return Arrays.hashCode((Object[])this.guildVersions) * 31 + Arrays.hashCode((Object[])this.nonGuildVersions);
   }

   public override fun toString(): String {
      val var2: java.lang.String = Arrays.toString((Object[])this.guildVersions);
      val var3: java.lang.String = Arrays.toString((Object[])this.nonGuildVersions);
      val var1: StringBuilder = new StringBuilder();
      var1.append("DatabaseVersions(guildVersions=");
      var1.append(var2);
      var1.append(", nonGuildVersions=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<DatabaseVersions> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: DatabaseVersions.$serializer = new DatabaseVersions.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.app_database.DatabaseVersions", var0, 2);
         var1.l("guildVersions", false);
         var1.l("nonGuildVersions", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            new v1(h0.b(GuildVersion.class), GuildVersion.$serializer.INSTANCE), new v1(h0.b(NonGuildVersion.class), NonGuildVersion.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): DatabaseVersions {
         r.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.b(var6);
         var var2: Int;
         var var5: Any;
         var var8: Any;
         if (var7.p()) {
            var8 = var7.y(var6, 0, new v1(h0.b(GuildVersion.class), GuildVersion.$serializer.INSTANCE), null);
            var5 = var7.y(var6, 1, new v1(h0.b(NonGuildVersion.class), NonGuildVersion.$serializer.INSTANCE), null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var5 = null;

            while (var3) {
               val var4: Int = var7.o(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var5 = var7.y(var6, 1, new v1(h0.b(NonGuildVersion.class), NonGuildVersion.$serializer.INSTANCE), var5);
                     var2 |= 2;
                  } else {
                     var8 = var7.y(var6, 0, new v1(h0.b(GuildVersion.class), GuildVersion.$serializer.INSTANCE), var8);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var7.c(var6);
         return new DatabaseVersions(var2, var8 as Array<GuildVersion>, var5 as Array<NonGuildVersion>, null);
      }

      public open fun serialize(encoder: Encoder, value: DatabaseVersions) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         DatabaseVersions.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
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
