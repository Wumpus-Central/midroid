package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
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
import vk.a
import xk.a2
import xk.f0
import xk.m0
import xk.n1

@f
public data class UserNameOnClick(action: String, userId: UserId, messageChannelId: ChannelId? = ..., linkColor: Int? = ...) : UserNameOnClick(
      var1, var2, var4, var5
   ) {
   public final val action: String
   public final val linkColor: Int?
   public final val messageChannelId: ChannelId?
   public final val userId: UserId

   fun UserNameOnClick(var1: Int, var2: java.lang.String, var3: UserId, var4: ChannelId, var5: Int, var6: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, UserNameOnClick.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.action = var2;
      this.userId = var3.unbox-impl();
      if ((var1 and 4) == 0) {
         this.messageChannelId = null;
      } else {
         this.messageChannelId = var4;
      }

      if ((var1 and 8) == 0) {
         this.linkColor = null;
      } else {
         this.linkColor = var5;
      }
   }

   fun UserNameOnClick(var1: java.lang.String, var2: Long, var4: ChannelId, var5: Int) {
      super();
      this.action = var1;
      this.userId = var2;
      this.messageChannelId = var4;
      this.linkColor = var5;
   }

   @JvmStatic
   public fun `write$Self`(self: UserNameOnClick, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.z(var2, 0, var0.action);
      var1.y(var2, 1, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.userId));
      var var3: Boolean;
      if (!var1.A(var2, 2) && var0.messageChannelId == null) {
         var3 = false;
      } else {
         var3 = true;
      }

      if (var3) {
         var1.m(var2, 2, com.discord.primitives.ChannelId..serializer.INSTANCE, var0.messageChannelId);
      }

      label24: {
         if (!var1.A(var2, 3)) {
            var3 = false;
            if (var0.linkColor == null) {
               break label24;
            }
         }

         var3 = true;
      }

      if (var3) {
         var1.m(var2, 3, m0.a, var0.linkColor);
      }
   }

   public operator fun component1(): String {
      return this.action;
   }

   public operator fun component2(): UserId {
      return this.userId;
   }

   public operator fun component3(): ChannelId? {
      return this.messageChannelId;
   }

   public operator fun component4(): Int? {
      return this.linkColor;
   }

   public fun copy(action: String = ..., userId: UserId = ..., messageChannelId: ChannelId? = ..., linkColor: Int? = ...): UserNameOnClick {
      r.h(var1, "action");
      return new UserNameOnClick(var1, var2, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserNameOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.action, var1.action)) {
            return false;
         } else if (!UserId.equals-impl0(this.userId, var1.userId)) {
            return false;
         } else if (!r.c(this.messageChannelId, var1.messageChannelId)) {
            return false;
         } else {
            return r.c(this.linkColor, var1.linkColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = this.action.hashCode();
      val var3: Int = UserId.hashCode-impl(this.userId);
      var var2: Int = 0;
      val var1: Int;
      if (this.messageChannelId == null) {
         var1 = 0;
      } else {
         var1 = ChannelId.hashCode-impl(this.messageChannelId.unbox-impl());
      }

      if (this.linkColor != null) {
         var2 = this.linkColor.hashCode();
      }

      return ((var4 * 31 + var3) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.action;
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var3: ChannelId = this.messageChannelId;
      val var2: Int = this.linkColor;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UserNameOnClick(action=");
      var4.append(var1);
      var4.append(", userId=");
      var4.append(var5);
      var4.append(", messageChannelId=");
      var4.append(var3);
      var4.append(", linkColor=");
      var4.append(var2);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<UserNameOnClick> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: UserNameOnClick.$serializer = new UserNameOnClick.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.UserNameOnClick", var0, 4);
         var1.l("action", false);
         var1.l("userId", false);
         var1.l("messageChannelId", true);
         var1.l("linkColor", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            a2.a, com.discord.primitives.UserId..serializer.INSTANCE, a.u(com.discord.primitives.ChannelId..serializer.INSTANCE), a.u(m0.a)
         };
      }

      public open fun deserialize(decoder: Decoder): UserNameOnClick {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         val var5: Boolean = var11.p();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: Any;
         var var7: Any;
         val var9: Any;
         if (var5) {
            val var12: java.lang.String = var11.m(var10, 0);
            var7 = var11.y(var10, 1, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var9 = var11.n(var10, 2, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var6 = var11.n(var10, 3, m0.a, null);
            var2 = 15;
            var8 = var12;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var13 = var11.n(var10, 3, m0.a, var13);
                           var2 |= 8;
                        } else {
                           var6 = var11.n(var10, 2, com.discord.primitives.ChannelId..serializer.INSTANCE, var6);
                           var2 |= 4;
                        }
                     } else {
                        var7 = var11.y(var10, 1, com.discord.primitives.UserId..serializer.INSTANCE, var7);
                        var2 |= 2;
                     }
                  } else {
                     var8 = var11.m(var10, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var9 = var6;
            var6 = var13;
         }

         var11.c(var10);
         return new UserNameOnClick(var2, var8, var7 as UserId, var9 as ChannelId, var6 as Int, null, null);
      }

      public open fun serialize(encoder: Encoder, value: UserNameOnClick) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         UserNameOnClick.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserNameOnClick> {
         return UserNameOnClick.$serializer.INSTANCE;
      }
   }
}
