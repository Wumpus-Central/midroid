package com.discord.mobile_voice_overlay

import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import xk.a2
import xk.f0
import xk.n1

@f
public data class MobileVoiceOverlaySelectorResult(guildId: GuildId, channelId: ChannelId, channelName: String, guildName: String, categoryName: String) : MobileVoiceOverlaySelectorResult(
      var1, var3, var5, var6, var7
   ) {
   public final val categoryName: String
   public final val channelId: ChannelId
   public final val channelName: String
   public final val guildId: GuildId
   public final val guildName: String

   fun MobileVoiceOverlaySelectorResult(
      var1: Int, var2: GuildId, var3: ChannelId, var4: java.lang.String, var5: java.lang.String, var6: java.lang.String, var7: SerializationConstructorMarker
   ) {
      if (31 != (var1 and 31)) {
         n1.b(var1, 31, MobileVoiceOverlaySelectorResult.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.guildId = var2.unbox-impl();
      this.channelId = var3.unbox-impl();
      this.channelName = var4;
      this.guildName = var5;
      this.categoryName = var6;
   }

   fun MobileVoiceOverlaySelectorResult(var1: Long, var3: Long, var5: java.lang.String, var6: java.lang.String, var7: java.lang.String) {
      super();
      this.guildId = var1;
      this.channelId = var3;
      this.channelName = var5;
      this.guildName = var6;
      this.categoryName = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: MobileVoiceOverlaySelectorResult, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, GuildId.$serializer.INSTANCE, GuildId.box-impl(var0.guildId));
      var1.y(var2, 1, ChannelId.$serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.z(var2, 2, var0.channelName);
      var1.z(var2, 3, var0.guildName);
      var1.z(var2, 4, var0.categoryName);
   }

   public operator fun component1(): GuildId {
      return this.guildId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String {
      return this.channelName;
   }

   public operator fun component4(): String {
      return this.guildName;
   }

   public operator fun component5(): String {
      return this.categoryName;
   }

   public fun copy(guildId: GuildId = ..., channelId: ChannelId = ..., channelName: String = ..., guildName: String = ..., categoryName: String = ...): MobileVoiceOverlaySelectorResult {
      r.h(var5, "channelName");
      r.h(var6, "guildName");
      r.h(var7, "categoryName");
      return new MobileVoiceOverlaySelectorResult(var1, var3, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlaySelectorResult) {
         return false;
      } else {
         var1 = var1;
         if (!GuildId.equals-impl0(this.guildId, var1.guildId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!r.c(this.channelName, var1.channelName)) {
            return false;
         } else if (!r.c(this.guildName, var1.guildName)) {
            return false;
         } else {
            return r.c(this.categoryName, var1.categoryName);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               ((GuildId.hashCode-impl(this.guildId) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31 + this.channelName.hashCode()) * 31
                  + this.guildName.hashCode()
            )
            * 31
         + this.categoryName.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = GuildId.toString-impl(this.guildId);
      val var2: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.channelName;
      val var6: java.lang.String = this.guildName;
      val var5: java.lang.String = this.categoryName;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MobileVoiceOverlaySelectorResult(guildId=");
      var4.append(var1);
      var4.append(", channelId=");
      var4.append(var2);
      var4.append(", channelName=");
      var4.append(var3);
      var4.append(", guildName=");
      var4.append(var6);
      var4.append(", categoryName=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MobileVoiceOverlaySelectorResult> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MobileVoiceOverlaySelectorResult.$serializer = new MobileVoiceOverlaySelectorResult.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult", var0, 5
         );
         var1.l("guildId", false);
         var1.l("channelId", false);
         var1.l("channelName", false);
         var1.l("guildName", false);
         var1.l("categoryName", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{GuildId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, a2.a, a2.a, a2.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlaySelectorResult {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         val var5: Boolean = var12.p();
         var var9: Any = null;
         var var2: Int;
         var var6: java.lang.String;
         var var7: java.lang.String;
         var var8: Any;
         val var13: java.lang.String;
         if (var5) {
            var9 = var12.y(var11, 0, GuildId.$serializer.INSTANCE, null);
            var8 = var12.y(var11, 1, ChannelId.$serializer.INSTANCE, null);
            var7 = var12.m(var11, 2);
            var13 = var12.m(var11, 3);
            var6 = var12.m(var11, 4);
            var2 = 31;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var8 = null;
            var7 = null;
            var6 = null;
            var var14: java.lang.String = null;

            while (var3) {
               val var4: Int = var12.o(var11);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              if (var4 != 4) {
                                 throw new n(var4);
                              }

                              var14 = var12.m(var11, 4);
                              var2 |= 16;
                           } else {
                              var6 = var12.m(var11, 3);
                              var2 |= 8;
                           }
                        } else {
                           var7 = var12.m(var11, 2);
                           var2 |= 4;
                        }
                     } else {
                        var8 = var12.y(var11, 1, ChannelId.$serializer.INSTANCE, var8);
                        var2 |= 2;
                     }
                  } else {
                     var9 = var12.y(var11, 0, GuildId.$serializer.INSTANCE, var9);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var14;
            var13 = var6;
         }

         var12.c(var11);
         return new MobileVoiceOverlaySelectorResult(var2, var9 as GuildId, var8 as ChannelId, var7, var13, var6, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlaySelectorResult) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MobileVoiceOverlaySelectorResult.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlaySelectorResult> {
         return MobileVoiceOverlaySelectorResult.$serializer.INSTANCE;
      }
   }
}
