package com.discord.chat.bridge.contentnode

import cl.f
import cl.n
import dl.a
import fl.g0
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor

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
   titleOnClick: TitleOnClick? = null,
   urlOnClick: UrlOnClick? = null
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
   public final val urlOnClick: UrlOnClick?
   public final val usernameOnClick: UserNameOnClick?
   public final val webhookNameOnClick: WebhookNameOnClick?

   fun LinkContext() {
      this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
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
      this.urlOnClick = var12;
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

   public operator fun component12(): UrlOnClick? {
      return this.urlOnClick;
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
      titleOnClick: TitleOnClick? = var0.titleOnClick,
      urlOnClick: UrlOnClick? = var0.urlOnClick
   ): LinkContext {
      return new LinkContext(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
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
         } else if (!q.c(this.titleOnClick, var1.titleOnClick)) {
            return false;
         } else {
            return q.c(this.urlOnClick, var1.urlOnClick);
         }
      }
   }

   public override fun hashCode(): Int {
      var var12: Int = 0;
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

      val var11: Int;
      if (this.titleOnClick == null) {
         var11 = 0;
      } else {
         var11 = this.titleOnClick.hashCode();
      }

      if (this.urlOnClick != null) {
         var12 = this.urlOnClick.hashCode();
      }

      return ((((((((((var1 * 31 + var2) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var6) * 31 + var7) * 31 + var8) * 31 + var9) * 31 + var10) * 31 + var11)
            * 31
         + var12;
   }

   public override fun toString(): String {
      val var1: UserNameOnClick = this.usernameOnClick;
      val var8: UserNameOnClick = this.otherUsernameOnClick;
      val var4: CommandOnClick = this.commandNameOnClick;
      val var13: ActorHook = this.actorHook;
      val var6: ThreadOnClick = this.threadOnClick;
      val var9: PinsOnClick = this.pinsOnClick;
      val var11: WebhookNameOnClick = this.webhookNameOnClick;
      val var10: HandleDelete = this.handleDelete;
      val var7: RoleSubscriptionOnClick = this.roleSubscriptionOnClick;
      val var5: HandleMessage = this.handleMessage;
      val var2: TitleOnClick = this.titleOnClick;
      val var3: UrlOnClick = this.urlOnClick;
      val var12: StringBuilder = new StringBuilder();
      var12.append("LinkContext(usernameOnClick=");
      var12.append(var1);
      var12.append(", otherUsernameOnClick=");
      var12.append(var8);
      var12.append(", commandNameOnClick=");
      var12.append(var4);
      var12.append(", actorHook=");
      var12.append(var13);
      var12.append(", threadOnClick=");
      var12.append(var6);
      var12.append(", pinsOnClick=");
      var12.append(var9);
      var12.append(", webhookNameOnClick=");
      var12.append(var11);
      var12.append(", handleDelete=");
      var12.append(var10);
      var12.append(", roleSubscriptionOnClick=");
      var12.append(var7);
      var12.append(", handleMessage=");
      var12.append(var5);
      var12.append(", titleOnClick=");
      var12.append(var2);
      var12.append(", urlOnClick=");
      var12.append(var3);
      var12.append(")");
      return var12.toString();
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
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.LinkContext", var0, 12);
         var1.l("usernameOnClick", true);
         var1.l("otherUsernameOnClick", true);
         var1.l("commandNameOnClick", true);
         var1.l("actorHook", true);
         var1.l("threadOnClick", true);
         var1.l("pinsOnClick", true);
         var1.l("webhookNameOnClick", true);
         var1.l("handleDelete", true);
         var1.l("roleSubscriptionOnClick", true);
         var1.l("handleMessage", true);
         var1.l("titleOnClick", true);
         var1.l("urlOnClick", true);
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
            a.u(TitleOnClick.$serializer.INSTANCE),
            a.u(UrlOnClick.$serializer.INSTANCE)
         };
      }

      public open fun deserialize(decoder: Decoder): LinkContext {
         q.h(var1, "decoder");
         val var20: SerialDescriptor = this.getDescriptor();
         val var21: c = var1.c(var20);
         val var5: Boolean = var21.y();
         var var6: UserNameOnClick = null;
         var var2: Int;
         var var7: Any;
         var var8: Any;
         var var11: Any;
         var var12: Any;
         var var13: Any;
         var var14: Any;
         var var15: Any;
         val var16: UserNameOnClick;
         val var18: TitleOnClick;
         var var23: UrlOnClick;
         var var27: Any;
         var var35: Any;
         if (var5) {
            val var22: UserNameOnClick.$serializer = UserNameOnClick.$serializer.INSTANCE;
            var16 = var21.v(var20, 0, UserNameOnClick.$serializer.INSTANCE, null) as UserNameOnClick;
            var27 = var21.v(var20, 1, var22, null) as UserNameOnClick;
            var35 = var21.v(var20, 2, CommandOnClick.$serializer.INSTANCE, null) as CommandOnClick;
            var14 = var21.v(var20, 3, ActorHook.$serializer.INSTANCE, null) as ActorHook;
            var12 = var21.v(var20, 4, ThreadOnClick.$serializer.INSTANCE, null) as ThreadOnClick;
            var13 = var21.v(var20, 5, PinsOnClick.$serializer.INSTANCE, null) as PinsOnClick;
            val var10: WebhookNameOnClick = var21.v(var20, 6, WebhookNameOnClick.$serializer.INSTANCE, null) as WebhookNameOnClick;
            var8 = var21.v(var20, 7, HandleDelete.$serializer.INSTANCE, null) as HandleDelete;
            var15 = var21.v(var20, 8, RoleSubscriptionOnClick.$serializer.INSTANCE, null) as RoleSubscriptionOnClick;
            var7 = var21.v(var20, 9, HandleMessage.$serializer.INSTANCE, null) as HandleMessage;
            val var24: TitleOnClick = var21.v(var20, 10, TitleOnClick.$serializer.INSTANCE, null) as TitleOnClick;
            var23 = var21.v(var20, 11, UrlOnClick.$serializer.INSTANCE, null) as UrlOnClick;
            var2 = 4095;
            var11 = var27;
            var27 = var35;
            var35 = var10;
            var18 = var24;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var23 = null;
            var var34: TitleOnClick = null;
            var15 = null;
            var14 = null;
            var13 = null;
            var12 = null;
            var11 = null;
            var var29: Any = null;
            var27 = null;
            var8 = null;
            var7 = null;

            while (var3) {
               val var4: Int = var21.x(var20);
               switch (var4) {
                  case -1:
                     var3 = false;
                     break;
                  case 0:
                     var6 = var21.v(var20, 0, UserNameOnClick.$serializer.INSTANCE, var6) as UserNameOnClick;
                     var2 |= 1;
                     break;
                  case 1:
                     var7 = var21.v(var20, 1, UserNameOnClick.$serializer.INSTANCE, var7) as UserNameOnClick;
                     var2 |= 2;
                     break;
                  case 2:
                     var8 = var21.v(var20, 2, CommandOnClick.$serializer.INSTANCE, var8) as CommandOnClick;
                     var2 |= 4;
                     break;
                  case 3:
                     var27 = var21.v(var20, 3, ActorHook.$serializer.INSTANCE, var27) as ActorHook;
                     var2 |= 8;
                     break;
                  case 4:
                     var12 = var21.v(var20, 4, ThreadOnClick.$serializer.INSTANCE, var12) as ThreadOnClick;
                     var2 |= 16;
                     break;
                  case 5:
                     var29 = var21.v(var20, 5, PinsOnClick.$serializer.INSTANCE, var29) as PinsOnClick;
                     var2 |= 32;
                     break;
                  case 6:
                     var13 = var21.v(var20, 6, WebhookNameOnClick.$serializer.INSTANCE, var13) as WebhookNameOnClick;
                     var2 |= 64;
                     break;
                  case 7:
                     var14 = var21.v(var20, 7, HandleDelete.$serializer.INSTANCE, var14) as HandleDelete;
                     var2 |= 128;
                     break;
                  case 8:
                     var15 = var21.v(var20, 8, RoleSubscriptionOnClick.$serializer.INSTANCE, var15) as RoleSubscriptionOnClick;
                     var2 |= 256;
                     break;
                  case 9:
                     var11 = var21.v(var20, 9, HandleMessage.$serializer.INSTANCE, var11) as HandleMessage;
                     var2 |= 512;
                     break;
                  case 10:
                     var34 = var21.v(var20, 10, TitleOnClick.$serializer.INSTANCE, var34) as TitleOnClick;
                     var2 |= 1024;
                     break;
                  case 11:
                     var23 = var21.v(var20, 11, UrlOnClick.$serializer.INSTANCE, var23) as UrlOnClick;
                     var2 |= 2048;
                     break;
                  default:
                     throw new n(var4);
               }
            }

            var11 = var7;
            var18 = var34;
            var7 = var11;
            var8 = var14;
            var35 = var13;
            var13 = var29;
            var14 = var27;
            var27 = var8;
            var16 = var6;
         }

         var21.b(var20);
         return new LinkContext(
            var2,
            var16,
            (UserNameOnClick)var11,
            (CommandOnClick)var27,
            (ActorHook)var14,
            (ThreadOnClick)var12,
            (PinsOnClick)var13,
            (WebhookNameOnClick)var35,
            (HandleDelete)var8,
            (RoleSubscriptionOnClick)var15,
            (HandleMessage)var7,
            var18,
            var23,
            null
         );
      }

      public open fun serialize(encoder: Encoder, value: LinkContext) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         LinkContext.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<LinkContext> {
         return LinkContext.$serializer.INSTANCE;
      }
   }
}
