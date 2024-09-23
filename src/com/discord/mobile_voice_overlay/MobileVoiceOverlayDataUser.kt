package com.discord.mobile_voice_overlay

import al.b2
import al.g0
import al.h
import al.n0
import al.o1
import com.discord.primitives.UserId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import xk.f
import xk.n

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
         o1.b(var1, 15, MobileVoiceOverlayDataUser.$serializer.INSTANCE.getDescriptor());
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
      val var3: java.lang.String = UserId.toString-impl(this.userId);
      val var5: java.lang.String = this.avatar;
      val var2: Boolean = this.speaking;
      val var1: Int = this.discriminator;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MobileVoiceOverlayDataUser(userId=");
      var4.append(var3);
      var4.append(", avatar=");
      var4.append(var5);
      var4.append(", speaking=");
      var4.append(var2);
      var4.append(", discriminator=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{UserId.$serializer.INSTANCE, yk.a.u(b2.a), h.a, n0.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayDataUser {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.c(var8);
         var var3: Int;
         var var4: Int;
         val var5: Int;
         var var7: UserId;
         var var10: java.lang.String;
         if (var9.y()) {
            var7 = var9.m(var8, 0, UserId.$serializer.INSTANCE, null) as UserId;
            var10 = var9.v(var8, 1, b2.a, null) as java.lang.String;
            var5 = var9.s(var8, 2);
            val var2: Int = var9.k(var8, 3);
            var3 = 15;
            var4 = var2;
         } else {
            var var13: Boolean = true;
            var4 = 0;
            var var11: Int = 0;
            var7 = null;
            var10 = null;
            var3 = 0;

            while (var13) {
               val var6: Int = var9.x(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var4 = var9.k(var8, 3);
                           var11 |= 8;
                        } else {
                           var3 = var9.s(var8, 2);
                           var11 |= 4;
                        }
                     } else {
                        var10 = var9.v(var8, 1, b2.a, var10) as java.lang.String;
                        var11 |= 2;
                     }
                  } else {
                     var7 = var9.m(var8, 0, UserId.$serializer.INSTANCE, var7) as UserId;
                     var11 |= 1;
                  }
               } else {
                  var13 = false;
               }
            }

            var5 = var3;
            var3 = var11;
         }

         var9.b(var8);
         return new MobileVoiceOverlayDataUser(var3, var7, var10, (boolean)var5, var4, null, null);
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
         return al.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayDataUser> {
         return MobileVoiceOverlayDataUser.$serializer.INSTANCE;
      }
   }
}
