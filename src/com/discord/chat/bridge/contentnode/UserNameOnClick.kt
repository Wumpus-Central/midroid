package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import com.discord.primitives.ChannelId
import com.discord.primitives.UserId
import dl.a
import fl.b2
import fl.g0
import fl.n0
import fl.o1
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
public data class UserNameOnClick(action: String, userId: UserId, messageChannelId: ChannelId? = ..., linkColor: Int? = ...) : UserNameOnClick(
      var1, var2, var4, var5
   ) {
   public final val action: String
   public final val linkColor: Int?
   public final val messageChannelId: ChannelId?
   public final val userId: UserId

   fun UserNameOnClick(var1: Int, var2: java.lang.String, var3: UserId, var4: ChannelId, var5: Int, var6: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, UserNameOnClick.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "action");
      super();
      this.action = var1;
      this.userId = var2;
      this.messageChannelId = var4;
      this.linkColor = var5;
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
      q.h(var1, "action");
      return new UserNameOnClick(var1, var2, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserNameOnClick) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.action, var1.action)) {
            return false;
         } else if (!UserId.equals-impl0(this.userId, var1.userId)) {
            return false;
         } else if (!q.c(this.messageChannelId, var1.messageChannelId)) {
            return false;
         } else {
            return q.c(this.linkColor, var1.linkColor);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.action.hashCode();
      val var4: Int = UserId.hashCode-impl(this.userId);
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

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   public override fun toString(): String {
      val var2: java.lang.String = this.action;
      val var5: java.lang.String = UserId.toString-impl(this.userId);
      val var4: ChannelId = this.messageChannelId;
      val var3: Int = this.linkColor;
      val var1: StringBuilder = new StringBuilder();
      var1.append("UserNameOnClick(action=");
      var1.append(var2);
      var1.append(", userId=");
      var1.append(var5);
      var1.append(", messageChannelId=");
      var1.append(var4);
      var1.append(", linkColor=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{b2.a, UserId.$serializer.INSTANCE, a.u(ChannelId.$serializer.INSTANCE), a.u(n0.a)};
      }

      public open fun deserialize(decoder: Decoder): UserNameOnClick {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         val var5: Boolean = var10.y();
         var var8: java.lang.String = null;
         var var2: Int;
         var var6: ChannelId;
         var var7: UserId;
         var var11: Any;
         if (var5) {
            var8 = var10.t(var9, 0);
            var7 = var10.m(var9, 1, UserId.$serializer.INSTANCE, null) as UserId;
            var6 = var10.v(var9, 2, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var11 = var10.v(var9, 3, n0.a, null) as Int;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var11 = var10.v(var9, 3, n0.a, var11) as Int;
                           var2 |= 8;
                        } else {
                           var6 = var10.v(var9, 2, ChannelId.$serializer.INSTANCE, var6) as ChannelId;
                           var2 |= 4;
                        }
                     } else {
                        var7 = var10.m(var9, 1, UserId.$serializer.INSTANCE, var7) as UserId;
                        var2 |= 2;
                     }
                  } else {
                     var8 = var10.t(var9, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var10.b(var9);
         return new UserNameOnClick(var2, var8, var7, var6, (Integer)var11, null, null);
      }

      public open fun serialize(encoder: Encoder, value: UserNameOnClick) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         UserNameOnClick.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<UserNameOnClick> {
         return UserNameOnClick.$serializer.INSTANCE;
      }
   }
}
