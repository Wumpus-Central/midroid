package com.discord.mobile_voice_overlay

import com.discord.primitives.UserId
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
import xk.h
import xk.m0
import xk.n1

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
         n1.b(var1, 15, MobileVoiceOverlayDataUser.$serializer.INSTANCE.getDescriptor());
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

   @JvmStatic
   public fun `write$Self`(self: MobileVoiceOverlayDataUser, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.userId));
      var1.m(var2, 1, a2.a, var0.avatar);
      var1.x(var2, 2, var0.speaking);
      var1.w(var2, 3, var0.discriminator);
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
         } else if (!r.c(this.avatar, var1.avatar)) {
            return false;
         } else if (this.speaking != var1.speaking) {
            return false;
         } else {
            return this.discriminator == var1.discriminator;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = UserId.hashCode-impl(this.userId);
      val var1: Int;
      if (this.avatar == null) {
         var1 = 0;
      } else {
         var1 = this.avatar.hashCode();
      }

      var var2: Byte = this.speaking;
      if (this.speaking != 0) {
         var2 = 1;
      }

      return ((var4 * 31 + var1) * 31 + var2) * 31 + Integer.hashCode(this.discriminator);
   }

   public override fun toString(): String {
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var3: java.lang.String = this.avatar;
      val var2: Boolean = this.speaking;
      val var1: Int = this.discriminator;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MobileVoiceOverlayDataUser(userId=");
      var4.append(var5);
      var4.append(", avatar=");
      var4.append(var3);
      var4.append(", speaking=");
      var4.append(var2);
      var4.append(", discriminator=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<MobileVoiceOverlayDataUser> {
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
         return new KSerializer[]{com.discord.primitives.UserId..serializer.INSTANCE, vk.a.u(a2.a), h.a, m0.a};
      }

      public open fun deserialize(decoder: Decoder): MobileVoiceOverlayDataUser {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var3: Int;
         var var4: Int;
         var var7: Any;
         var var10: Any;
         if (var9.p()) {
            var10 = var9.y(var8, 0, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var7 = var9.n(var8, 1, a2.a, null);
            var3 = var9.C(var8, 2);
            var4 = var9.i(var8, 3);
            var2 = 15;
         } else {
            var var5: Boolean = true;
            var4 = 0;
            var2 = 0;
            var10 = null;
            var7 = null;
            var3 = 0;

            while (var5) {
               val var6: Int = var9.o(var8);
               if (var6 != -1) {
                  if (var6 != 0) {
                     if (var6 != 1) {
                        if (var6 != 2) {
                           if (var6 != 3) {
                              throw new n(var6);
                           }

                           var4 = var9.i(var8, 3);
                           var2 |= 8;
                        } else {
                           var3 = var9.C(var8, 2);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var9.n(var8, 1, a2.a, var7);
                        var2 |= 2;
                     }
                  } else {
                     var10 = var9.y(var8, 0, com.discord.primitives.UserId..serializer.INSTANCE, var10);
                     var2 |= 1;
                  }
               } else {
                  var5 = false;
               }
            }
         }

         var9.c(var8);
         return new MobileVoiceOverlayDataUser(var2, var10 as UserId, var7 as java.lang.String, (boolean)var3, var4, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MobileVoiceOverlayDataUser) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MobileVoiceOverlayDataUser.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MobileVoiceOverlayDataUser> {
         return MobileVoiceOverlayDataUser.$serializer.INSTANCE;
      }
   }
}
