package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.q
import kotlinx.serialization.DeserializationStrategy
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import on.a
import qn.g0

@f
public data class LinkContext(usernameOnClick: UserNameOnClick? = null,
   otherUsernameOnClick: UserNameOnClick? = null,
   commandNameOnClick: CommandOnClick? = null,
   actorHook: ActorHook? = null,
   threadOnClick: ThreadOnClick? = null,
   pinsOnClick: PinsOnClick? = null,
   webhookNameOnClick: WebhookNameOnClick? = null,
   handleDelete: HandleDelete? = null,
   roleSubscriptionOnClick: RoleSubscriptionOnClick? = null,
   handleMessage: HandleMessage? = null,
   titleOnClick: TitleOnClick? = null
) {
   public final val actorHook: ActorHook?
   public final val commandNameOnClick: CommandOnClick?
   public final val handleDelete: HandleDelete?
   public final val handleMessage: HandleMessage?
   public final val otherUsernameOnClick: UserNameOnClick?
   public final val pinsOnClick: PinsOnClick?
   public final val roleSubscriptionOnClick: RoleSubscriptionOnClick?
   public final val threadOnClick: ThreadOnClick?
   public final val titleOnClick: TitleOnClick?
   public final val usernameOnClick: UserNameOnClick?
   public final val webhookNameOnClick: WebhookNameOnClick?

   fun LinkContext() {
      this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
   }

   init {
      this.usernameOnClick = var1;
      this.otherUsernameOnClick = var2;
      this.commandNameOnClick = var3;
      this.actorHook = var4;
      this.threadOnClick = var5;
      this.pinsOnClick = var6;
      this.webhookNameOnClick = var7;
      this.handleDelete = var8;
      this.roleSubscriptionOnClick = var9;
      this.handleMessage = var10;
      this.titleOnClick = var11;
   }

   public operator fun component1(): UserNameOnClick? {
      return this.usernameOnClick;
   }

   public operator fun component10(): HandleMessage? {
      return this.handleMessage;
   }

   public operator fun component11(): TitleOnClick? {
      return this.titleOnClick;
   }

   public operator fun component2(): UserNameOnClick? {
      return this.otherUsernameOnClick;
   }

   public operator fun component3(): CommandOnClick? {
      return this.commandNameOnClick;
   }

   public operator fun component4(): ActorHook? {
      return this.actorHook;
   }

   public operator fun component5(): ThreadOnClick? {
      return this.threadOnClick;
   }

   public operator fun component6(): PinsOnClick? {
      return this.pinsOnClick;
   }

   public operator fun component7(): WebhookNameOnClick? {
      return this.webhookNameOnClick;
   }

   public operator fun component8(): HandleDelete? {
      return this.handleDelete;
   }

   public operator fun component9(): RoleSubscriptionOnClick? {
      return this.roleSubscriptionOnClick;
   }

   public fun copy(
      usernameOnClick: UserNameOnClick? = var0.usernameOnClick,
      otherUsernameOnClick: UserNameOnClick? = var0.otherUsernameOnClick,
      commandNameOnClick: CommandOnClick? = var0.commandNameOnClick,
      actorHook: ActorHook? = var0.actorHook,
      threadOnClick: ThreadOnClick? = var0.threadOnClick,
      pinsOnClick: PinsOnClick? = var0.pinsOnClick,
      webhookNameOnClick: WebhookNameOnClick? = var0.webhookNameOnClick,
      handleDelete: HandleDelete? = var0.handleDelete,
      roleSubscriptionOnClick: RoleSubscriptionOnClick? = var0.roleSubscriptionOnClick,
      handleMessage: HandleMessage? = var0.handleMessage,
      titleOnClick: TitleOnClick? = var0.titleOnClick
   ): LinkContext {
      return new LinkContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is LinkContext) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.usernameOnClick, var1.usernameOnClick)) {
            return false;
         } else if (!q.c(this.otherUsernameOnClick, var1.otherUsernameOnClick)) {
            return false;
         } else if (!q.c(this.commandNameOnClick, var1.commandNameOnClick)) {
            return false;
         } else if (!q.c(this.actorHook, var1.actorHook)) {
            return false;
         } else if (!q.c(this.threadOnClick, var1.threadOnClick)) {
            return false;
         } else if (!q.c(this.pinsOnClick, var1.pinsOnClick)) {
            return false;
         } else if (!q.c(this.webhookNameOnClick, var1.webhookNameOnClick)) {
            return false;
         } else if (!q.c(this.handleDelete, var1.handleDelete)) {
            return false;
         } else if (!q.c(this.roleSubscriptionOnClick, var1.roleSubscriptionOnClick)) {
            return false;
         } else if (!q.c(this.handleMessage, var1.handleMessage)) {
            return false;
         } else {
            return q.c(this.titleOnClick, var1.titleOnClick);
         }
      }
   }

   public override fun hashCode(): Int {
      var var11: Int = 0;
      val var1: Int;
      if (this.usernameOnClick == null) {
         var1 = 0;
      } else {
         var1 = this.usernameOnClick.hashCode();
      }

      val var2: Int;
      if (this.otherUsernameOnClick == null) {
         var2 = 0;
      } else {
         var2 = this.otherUsernameOnClick.hashCode();
      }

      val var3: Int;
      if (this.commandNameOnClick == null) {
         var3 = 0;
      } else {
         var3 = this.commandNameOnClick.hashCode();
      }

      val var4: Int;
      if (this.actorHook == null) {
         var4 = 0;
      } else {
         var4 = this.actorHook.hashCode();
      }

      val var5: Int;
      if (this.threadOnClick == null) {
         var5 = 0;
      } else {
         var5 = this.threadOnClick.hashCode();
      }

      val var6: Int;
      if (this.pinsOnClick == null) {
         var6 = 0;
      } else {
         var6 = this.pinsOnClick.hashCode();
      }

      val var7: Int;
      if (this.webhookNameOnClick == null) {
         var7 = 0;
      } else {
         var7 = this.webhookNameOnClick.hashCode();
      }

      val var8: Int;
      if (this.handleDelete == null) {
         var8 = 0;
      } else {
         var8 = this.handleDelete.hashCode();
      }

      val var9: Int;
      if (this.roleSubscriptionOnClick == null) {
         var9 = 0;
      } else {
         var9 = this.roleSubscriptionOnClick.hashCode();
      }

      val var10: Int;
      if (this.handleMessage == null) {
         var10 = 0;
      } else {
         var10 = this.handleMessage.hashCode();
      }

      if (this.titleOnClick != null) {
         var11 = this.titleOnClick.hashCode();
      }

      return (((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var9) * 31 + var10) * 31 + var11;
   }

   public override fun toString(): String {
      val var11: UserNameOnClick = this.usernameOnClick;
      val var5: UserNameOnClick = this.otherUsernameOnClick;
      val var8: CommandOnClick = this.commandNameOnClick;
      val var9: ActorHook = this.actorHook;
      val var3: ThreadOnClick = this.threadOnClick;
      val var12: PinsOnClick = this.pinsOnClick;
      val var4: WebhookNameOnClick = this.webhookNameOnClick;
      val var1: HandleDelete = this.handleDelete;
      val var10: RoleSubscriptionOnClick = this.roleSubscriptionOnClick;
      val var2: HandleMessage = this.handleMessage;
      val var7: TitleOnClick = this.titleOnClick;
      val var6: StringBuilder = new StringBuilder();
      var6.append("LinkContext(usernameOnClick=");
      var6.append(var11);
      var6.append(", otherUsernameOnClick=");
      var6.append(var5);
      var6.append(", commandNameOnClick=");
      var6.append(var8);
      var6.append(", actorHook=");
      var6.append(var9);
      var6.append(", threadOnClick=");
      var6.append(var3);
      var6.append(", pinsOnClick=");
      var6.append(var12);
      var6.append(", webhookNameOnClick=");
      var6.append(var4);
      var6.append(", handleDelete=");
      var6.append(var1);
      var6.append(", roleSubscriptionOnClick=");
      var6.append(var10);
      var6.append(", handleMessage=");
      var6.append(var2);
      var6.append(", titleOnClick=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: LinkContext.$serializer = new LinkContext.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.LinkContext", var0, 11);
         var1.c("usernameOnClick", true);
         var1.c("otherUsernameOnClick", true);
         var1.c("commandNameOnClick", true);
         var1.c("actorHook", true);
         var1.c("threadOnClick", true);
         var1.c("pinsOnClick", true);
         var1.c("webhookNameOnClick", true);
         var1.c("handleDelete", true);
         var1.c("roleSubscriptionOnClick", true);
         var1.c("handleMessage", true);
         var1.c("titleOnClick", true);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         val var1: UserNameOnClick.$serializer = UserNameOnClick.$serializer.INSTANCE;
         return new KSerializer[]{
            a.u(UserNameOnClick.$serializer.INSTANCE),
            a.u(var1),
            a.u(CommandOnClick.$serializer.INSTANCE),
            a.u(ActorHook.$serializer.INSTANCE),
            a.u(ThreadOnClick.$serializer.INSTANCE),
            a.u(PinsOnClick.$serializer.INSTANCE),
            a.u(WebhookNameOnClick.$serializer.INSTANCE),
            a.u(HandleDelete.$serializer.INSTANCE),
            a.u(RoleSubscriptionOnClick.$serializer.INSTANCE),
            a.u(HandleMessage.$serializer.INSTANCE),
            a.u(TitleOnClick.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): LinkContext {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.b(var20);
         val var6: Boolean = var21.p();
         var var4: Byte = 10;
         var var7: UserNameOnClick = null;
         var var2: Int;
         var var9: Any;
         var var10: RoleSubscriptionOnClick;
         var var12: Any;
         val var14: UserNameOnClick;
         var var15: Any;
         var var16: HandleMessage;
         val var17: Any;
         val var18: Any;
         var var23: Any;
         var var29: Any;
         var var31: Any;
         if (var6) {
            var23 = UserNameOnClick.$serializer.INSTANCE;
            var14 = var21.n(var20, 0, UserNameOnClick.$serializer.INSTANCE, null) as UserNameOnClick;
            var29 = var21.n(var20, 1, (DeserializationStrategy)var23, null) as UserNameOnClick;
            var17 = var21.n(var20, 2, CommandOnClick.$serializer.INSTANCE, null) as CommandOnClick;
            var31 = var21.n(var20, 3, ActorHook.$serializer.INSTANCE, null) as ActorHook;
            var18 = var21.n(var20, 4, ThreadOnClick.$serializer.INSTANCE, null) as ThreadOnClick;
            var12 = var21.n(var20, 5, PinsOnClick.$serializer.INSTANCE, null) as PinsOnClick;
            var9 = var21.n(var20, 6, WebhookNameOnClick.$serializer.INSTANCE, null) as WebhookNameOnClick;
            val var8: HandleDelete = var21.n(var20, 7, HandleDelete.$serializer.INSTANCE, null) as HandleDelete;
            var10 = var21.n(var20, 8, RoleSubscriptionOnClick.$serializer.INSTANCE, null) as RoleSubscriptionOnClick;
            val var25: HandleMessage = var21.n(var20, 9, HandleMessage.$serializer.INSTANCE, null) as HandleMessage;
            var23 = var21.n(var20, 10, TitleOnClick.$serializer.INSTANCE, null) as TitleOnClick;
            var2 = 2047;
            var15 = var29;
            var29 = var31;
            var31 = var8;
            var16 = var25;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var16 = null;
            var var32: RoleSubscriptionOnClick = null;
            var31 = null;
            var12 = null;
            var15 = null;
            var29 = null;
            var10 = null;
            var9 = null;
            var var26: Any = null;
            var23 = null;

            while (var3) {
               val var5: Int = var21.o(var20);
               switch (var5) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var7 = var21.n(var20, 0, UserNameOnClick.$serializer.INSTANCE, var7) as UserNameOnClick;
                     var2 |= 1;
                     break;
                  case 1:
                     var23 = var21.n(var20, 1, UserNameOnClick.$serializer.INSTANCE, var23) as UserNameOnClick;
                     var2 |= 2;
                     break;
                  case 2:
                     var26 = var21.n(var20, 2, CommandOnClick.$serializer.INSTANCE, var26) as CommandOnClick;
                     var2 |= 4;
                     break;
                  case 3:
                     var9 = var21.n(var20, 3, ActorHook.$serializer.INSTANCE, var9) as ActorHook;
                     var2 |= 8;
                     break;
                  case 4:
                     var10 = var21.n(var20, 4, ThreadOnClick.$serializer.INSTANCE, var10) as ThreadOnClick;
                     var2 |= 16;
                     break;
                  case 5:
                     var12 = var21.n(var20, 5, PinsOnClick.$serializer.INSTANCE, var12) as PinsOnClick;
                     var2 |= 32;
                     break;
                  case 6:
                     var29 = var21.n(var20, 6, WebhookNameOnClick.$serializer.INSTANCE, var29) as WebhookNameOnClick;
                     var2 |= 64;
                     break;
                  case 7:
                     var31 = var21.n(var20, 7, HandleDelete.$serializer.INSTANCE, var31) as HandleDelete;
                     var2 |= 128;
                     break;
                  case 8:
                     var32 = var21.n(var20, 8, RoleSubscriptionOnClick.$serializer.INSTANCE, var32) as RoleSubscriptionOnClick;
                     var2 |= 256;
                     break;
                  case 9:
                     var16 = var21.n(var20, 9, HandleMessage.$serializer.INSTANCE, var16) as HandleMessage;
                     var2 |= 512;
                     var4 = 10;
                     continue;
                  case 10:
                     var15 = var21.n(var20, var4, TitleOnClick.$serializer.INSTANCE, var15) as TitleOnClick;
                     var2 |= 1024;
                     continue;
                  default:
                     throw new n(var5);
               }

               var4 = 10;
            }

            var29 = var9;
            var23 = var15;
            var10 = var32;
            var9 = var29;
            var18 = var10;
            var17 = var26;
            var15 = var23;
            var14 = var7;
         }

         var21.c(var20);
         return new LinkContext(
            var2,
            var14,
            (UserNameOnClick)var15,
            (CommandOnClick)var17,
            (ActorHook)var29,
            (ThreadOnClick)var18,
            (PinsOnClick)var12,
            (WebhookNameOnClick)var9,
            (HandleDelete)var31,
            var10,
            var16,
            (TitleOnClick)var23,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: LinkContext) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         LinkContext.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContext> {
         return LinkContext.$serializer.INSTANCE;
      }
   }
}
