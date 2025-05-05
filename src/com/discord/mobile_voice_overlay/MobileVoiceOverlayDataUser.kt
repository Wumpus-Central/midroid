package com.discord.mobile_voice_overlay

import aa.f
import aa.n
import com.discord.primitives.UserId
import da.C0
import da.G
import da.N
import da.h
import da.p0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

@f
public data class MobileVoiceOverlayDataUser(userId: UserId, avatar: String?, speaking: Boolean, discriminator: Int) : MobileVoiceOverlayDataUser(
      var1, var3, var4, var5
   ) {
   public final val avatar: String?
   public final val discriminator: Int
   public final val speaking: Boolean
   public final val userId: UserId

   fun MobileVoiceOverlayDataUser(var1: Int, var2: UserId, var3: java.lang.String, var4: Boolean, var5: Int, var6: SerializationConstructorMarker) {
      if (15 != (var1 and 15)) {
         p0.b(var1, 15, MobileVoiceOverlayDataUser.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.userId = var2.unbox-impl();
      this.avatar = var3;
      this.speaking = var4;
      this.discriminator = var5;
   }

   fun MobileVoiceOverlayDataUser(var1: Long, var3: java.lang.String, var4: Boolean, var5: Int) {
      super();
      this.userId = var1;
      this.avatar = var3;
      this.speaking = var4;
      this.discriminator = var5;
   }

   public operator fun component1(): UserId {
      return this.userId;
   }

   public operator fun component2(): String? {
      return this.avatar;
   }

   public operator fun component3(): Boolean {
      return this.speaking;
   }

   public operator fun component4(): Int {
      return this.discriminator;
   }

   public fun copy(userId: UserId = ..., avatar: String? = ..., speaking: Boolean = ..., discriminator: Int = ...): MobileVoiceOverlayDataUser {
      return new MobileVoiceOverlayDataUser(var1, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MobileVoiceOverlayDataUser) {
         return false;
      } else {
         var1 = var1;
         if (!UserId.equals-impl0(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.avatar, var1.avatar)) {
            return false;
         } else if (this.speaking != var1.speaking) {
            return false;
         } else {
            return this.discriminator == var1.discriminator;
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = UserId.hashCode-impl(this.userId);
      val var1: Int;
      if (this.avatar == null) {
         var1 = 0;
      } else {
         var1 = this.avatar.hashCode();
      }

      return ((var2 * 31 + var1) * 31 + java.lang.Boolean.hashCode(this.speaking)) * 31 + Integer.hashCode(this.discriminator);
   }

   public override fun toString(): String {
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var4: java.lang.String = this.avatar;
      val var2: Boolean = this.speaking;
      val var1: Int = this.discriminator;
      val var3: StringBuilder = new StringBuilder();
      var3.append("MobileVoiceOverlayDataUser(userId=");
      var3.append(var5);
      var3.append(", avatar=");
      var3.append(var4);
      var3.append(", speaking=");
      var3.append(var2);
      var3.append(", discriminator=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MobileVoiceOverlayDataUser.$serializer = new MobileVoiceOverlayDataUser.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.mobile_voice_overlay.MobileVoiceOverlayDataUser", var0, 4);
         var1.l("userId", false);
         var1.l("avatar", false);
         var1.l("speaking", false);
         var1.l("discriminator", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{UserId.$serializer.INSTANCE, ba.a.u(C0.a), h.a, N.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayDataUser {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         val var8: UserId;
         var var12: java.lang.String;
         if (var10.y()) {
            val var11: UserId = var10.m(var9, 0, UserId.$serializer.INSTANCE, null) as UserId;
            val var7: java.lang.String = var10.v(var9, 1, C0.a, null) as java.lang.String;
            var4 = var10.s(var9, 2);
            val var2: Int = var10.k(var9, 3);
            var3 = 15;
            var8 = var11;
            var12 = var7;
            var5 = var2;
         } else {
            var var16: Boolean = true;
            var4 = 0;
            var var13: Int = 0;
            var var17: UserId = null;
            var12 = null;
            var3 = 0;

            while (var16) {
               val var6: Int = var10.x(var9);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var4 = var10.k(var9, 3);
                           var13 |= 8;
                        } else {
                           var3 = var10.s(var9, 2);
                           var13 |= 4;
                        }
                     } else {
                        var12 = var10.v(var9, 1, C0.a, var12) as java.lang.String;
                        var13 |= 2;
                     }
                  } else {
                     var17 = var10.m(var9, 0, UserId.$serializer.INSTANCE, var17) as UserId;
                     var13 |= 1;
                  }
               } else {
                  var16 = false;
               }
            }

            var5 = var4;
            var4 = var3;
            var8 = var17;
            var3 = var13;
         }

         var10.b(var9);
         return new MobileVoiceOverlayDataUser(var3, var8, var12, (boolean)var4, var5, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayDataUser) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MobileVoiceOverlayDataUser.write$Self$mobile_voice_overlay_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return da.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayDataUser> {
         return MobileVoiceOverlayDataUser.$serializer.INSTANCE;
      }
   }
}
