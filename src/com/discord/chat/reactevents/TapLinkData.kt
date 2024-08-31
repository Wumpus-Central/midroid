package com.discord.chat.reactevents

import com.discord.chat.bridge.MessageType
import com.discord.chat.bridge.contentnode.ActorHook
import com.discord.chat.bridge.contentnode.CommandOnClick
import com.discord.chat.bridge.contentnode.HandleDelete
import com.discord.chat.bridge.contentnode.HandleMessage
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.LinkContext
import com.discord.chat.bridge.contentnode.MessageReference
import com.discord.chat.bridge.contentnode.PinsOnClick
import com.discord.chat.bridge.contentnode.RoleSubscriptionOnClick
import com.discord.chat.bridge.contentnode.ThreadOnClick
import com.discord.chat.bridge.contentnode.TitleOnClick
import com.discord.chat.bridge.contentnode.UserNameOnClick
import com.discord.chat.bridge.contentnode.WebhookNameOnClick
import com.discord.logging.Log
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import kotlin.jvm.internal.q
import lj.w

public data class TapLinkData(messageId: MessageId? = ..., title: String? = ..., target: String? = ..., content: String = ..., context: LinkContext? = ...) : TapLinkData(
         var1, var2, var3, var4, var5
      ),
   ReactEvent {
   public final val content: String
   public final val context: LinkContext?
   public final val messageId: MessageId?
   public final val target: String?
   public final val title: String?

   fun TapLinkData(var1: java.lang.String, var2: LinkContentNode) {
      q.h(var1, "messageId");
      q.h(var2, "node");
      this(var1, null, var2.getTarget(), var2.getTextContent(), var2.getContext(), 2, null);
   }

   fun TapLinkData(var1: java.lang.String, var2: java.lang.String, var3: java.lang.String, var4: java.lang.String, var5: LinkContext) {
      q.h(var4, "content");
      super();
      this.messageId = var1;
      this.title = var2;
      this.target = var3;
      this.content = var4;
      this.context = var5;
   }

   private fun LinkContext.toMap(): WritableNativeMap {
      val var2: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
      val var3: java.lang.String = this.target;
      if (this.target != null) {
         switch (this.target.hashCode()) {
            case -1732468237:
               if (var3.equals("handleDelete")) {
                  val var21: HandleDelete = var1.getHandleDelete();
                  if (var21 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var21.getAction());
                     NativeMapExtensionsKt.put(
                        var2,
                        "message",
                        NativeMapExtensionsKt.nativeMapOf(
                           new Pair[]{
                              w.a("id", var21.getMessage().getId-3Eiw7ao()),
                              w.a("channel_id", ChannelId.toString-impl(var21.getMessage().getChannelId-o4g7jtM())),
                              w.a("loggingName", var21.getMessage().getLoggingName()),
                              w.a("author", NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("username", var21.getMessage().getAuthor().getUsername())}))
                           }
                        )
                     );
                  }

                  return var2;
               }
               break;
            case -1226627713:
               if (var3.equals("threadOnClick")) {
                  val var19: ThreadOnClick = var1.getThreadOnClick();
                  if (var19 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var19.getAction());
                     NativeMapExtensionsKt.put(var2, "threadId", var19.getThreadId());
                  }

                  return var2;
               }
               break;
            case -1138120985:
               if (var3.equals("webhookNameOnClick")) {
                  val var17: WebhookNameOnClick = var1.getWebhookNameOnClick();
                  if (var17 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var17.getAction());
                     val var23: MessageReference = var17.getMessageReference();
                     if (var23 != null) {
                        val var18: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf(new Pair[0]);
                        NativeMapExtensionsKt.put(var18, "channel_id", ChannelId.toString-impl(var23.getChannelId-o4g7jtM()));
                        val var24: GuildId = var23.getGuildId-qOKuAAo();
                        if (var24 != null) {
                           NativeMapExtensionsKt.put(var18, "guild_id", GuildId.toString-impl(var24.unbox-impl()));
                        }

                        NativeMapExtensionsKt.put(var2, "messageReference", var18);
                        return var2;
                     }
                  }

                  return var2;
               }
               break;
            case -933189749:
               if (var3.equals("pinsOnClick")) {
                  val var16: PinsOnClick = var1.getPinsOnClick();
                  if (var16 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var16.getAction());
                     NativeMapExtensionsKt.put(var2, "messageChannelId", ChannelId.toString-impl(var16.getMessageChannelId-o4g7jtM()));
                  }

                  return var2;
               }
               break;
            case -932369101:
               if (var3.equals("usernameOnClick")) {
                  val var14: UserNameOnClick = var1.getUsernameOnClick();
                  if (var14 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var14.getAction());
                     NativeMapExtensionsKt.put(var2, "userId", UserId.toString-impl(var14.getUserId-re6GcUE()));
                     val var15: ChannelId = var14.getMessageChannelId-qMVnFVQ();
                     if (var15 != null) {
                        NativeMapExtensionsKt.put(var2, "messageChannelId", ChannelId.toString-impl(var15.unbox-impl()));
                        return var2;
                     }
                  }

                  return var2;
               }
               break;
            case -621986447:
               if (var3.equals("titleOnClick")) {
                  val var13: TitleOnClick = var1.getTitleOnClick();
                  if (var13 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var13.getAction());
                     NativeMapExtensionsKt.put(var2, "targetChannelId", var13.getTargetChannelId());
                     NativeMapExtensionsKt.put(var2, "targetMessageId", var13.getTargetMessageId());
                  }

                  return var2;
               }
               break;
            case -86972746:
               if (var3.equals("roleSubscriptionOnClick")) {
                  val var12: RoleSubscriptionOnClick = var1.getRoleSubscriptionOnClick();
                  if (var12 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var12.getAction());
                     NativeMapExtensionsKt.put(var2, "guildId", var12.getGuildId());
                     NativeMapExtensionsKt.put(var2, "channelId", var12.getChannelId());
                     NativeMapExtensionsKt.put(var2, "messageId", var12.getMessageId());
                     NativeMapExtensionsKt.put(var2, "roleSubscriptionListingId", var12.getRoleSubscriptionListingId());
                  }

                  return var2;
               }
               break;
            case 371724472:
               if (var3.equals("actorHook")) {
                  val var11: ActorHook = var1.getActorHook();
                  if (var11 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var11.getAction());
                     NativeMapExtensionsKt.put(var2, "userId", UserId.toString-impl(var11.getUserId-re6GcUE()));
                  }

                  return var2;
               }
               break;
            case 1318937603:
               if (var3.equals("otherUsernameOnClick")) {
                  val var9: UserNameOnClick = var1.getOtherUsernameOnClick();
                  if (var9 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var9.getAction());
                     NativeMapExtensionsKt.put(var2, "userId", UserId.toString-impl(var9.getUserId-re6GcUE()));
                     val var10: ChannelId = var9.getMessageChannelId-qMVnFVQ();
                     if (var10 != null) {
                        NativeMapExtensionsKt.put(var2, "messageChannelId", ChannelId.toString-impl(var10.unbox-impl()));
                        return var2;
                     }
                  }

                  return var2;
               }
               break;
            case 1532521663:
               if (var3.equals("handleMessage")) {
                  val var8: HandleMessage = var1.getHandleMessage();
                  if (var8 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var8.getAction());
                     NativeMapExtensionsKt.put(
                        var2,
                        "message",
                        NativeMapExtensionsKt.nativeMapOf(
                           new Pair[]{
                              w.a("id", var8.getMessage().getId-3Eiw7ao()),
                              w.a("channel_id", ChannelId.toString-impl(var8.getMessage().getChannelId-o4g7jtM())),
                              w.a("loggingName", var8.getMessage().getLoggingName())
                           }
                        )
                     );
                     NativeMapExtensionsKt.put(var2, "notificationType", var8.getNotificationType());
                  }

                  return var2;
               }
               break;
            case 2071245203:
               if (var3.equals("commandNameOnClick")) {
                  val var22: CommandOnClick = var1.getCommandNameOnClick();
                  if (var22 != null) {
                     NativeMapExtensionsKt.put(var2, "action", var22.getAction());
                     NativeMapExtensionsKt.put(var2, "userId", java.lang.String.valueOf(var22.getUserId-wUX8bhU()));
                     val var5: MessageType = var22.getMessageType();
                     if (var5 != null) {
                        NativeMapExtensionsKt.put(var2, "messageType", var5.getSerialNumber());
                     }

                     val var6: java.lang.String = var22.getMessageId-N_6c4I0();
                     val var7: java.lang.String;
                     if (var6 == null) {
                        var7 = "null";
                     } else {
                        var7 = MessageId.toString-impl(var6);
                     }

                     NativeMapExtensionsKt.put(var2, "messageId", var7);
                     NativeMapExtensionsKt.put(var2, "applicationUserId", java.lang.String.valueOf(var22.getApplicationUserId-wUX8bhU()));
                     NativeMapExtensionsKt.put(var2, "messageChannelId", java.lang.String.valueOf(var22.getMessageChannelId-qMVnFVQ()));
                  }

                  return var2;
               }
            default:
         }
      }

      val var4: Log = Log.INSTANCE;
      val var20: java.lang.String = this.target;
      val var26: StringBuilder = new StringBuilder();
      var26.append("Missing target type in context: ");
      var26.append(var20);
      Log.e$default(var4, "TapLink", var26.toString(), null, 4, null);
      return var2;
   }

   public operator fun component1(): MessageId? {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.title;
   }

   public operator fun component3(): String? {
      return this.target;
   }

   public operator fun component4(): String {
      return this.content;
   }

   public operator fun component5(): LinkContext? {
      return this.context;
   }

   public fun copy(messageId: MessageId? = ..., title: String? = ..., target: String? = ..., content: String = ..., context: LinkContext? = ...): TapLinkData {
      q.h(var4, "content");
      return new TapLinkData(var1, var2, var3, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapLinkData) {
         return false;
      } else {
         var1 = var1;
         if (if (this.messageId == null) var1.messageId == null else var1.messageId != null && MessageId.equals-impl0(this.messageId, var1.messageId)) {
            if (!q.c(this.title, var1.title)) {
               return false;
            } else if (!q.c(this.target, var1.target)) {
               return false;
            } else if (!q.c(this.content, var1.content)) {
               return false;
            } else {
               return q.c(this.context, var1.context);
            }
         } else {
            return false;
         }
      }
   }

   public override fun hashCode(): Int {
      var var4: Int = 0;
      val var1: Int;
      if (this.messageId == null) {
         var1 = 0;
      } else {
         var1 = MessageId.hashCode-impl(this.messageId);
      }

      val var2: Int;
      if (this.title == null) {
         var2 = 0;
      } else {
         var2 = this.title.hashCode();
      }

      val var3: Int;
      if (this.target == null) {
         var3 = 0;
      } else {
         var3 = this.target.hashCode();
      }

      val var5: Int = this.content.hashCode();
      if (this.context != null) {
         var4 = this.context.hashCode();
      }

      return (((var1 * 31 + var2) * 31 + var3) * 31 + var5) * 31 + var4;
   }

   public open fun serialize(): WritableMap {
      if (this.context != null) {
         val var2: WritableNativeMap = this.toMap(this.context);
         if (var2 != null) {
            return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("data", var2)});
         }
      }

      val var5: java.lang.String;
      if (this.messageId == null) {
         var5 = "null";
      } else {
         var5 = MessageId.toString-impl(this.messageId);
      }

      return NativeMapExtensionsKt.nativeMapOf(
         new Pair[]{
            w.a(
               "data",
               NativeMapExtensionsKt.nativeMapOf(
                  new Pair[]{
                     w.a("messageId", var5),
                     w.a("url", this.target),
                     w.a(
                        "node",
                        NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("title", this.title), w.a("target", this.target), w.a("content", this.content)})
                     )
                  }
               )
            )
         }
      );
   }

   public override fun toString(): String {
      val var7: java.lang.String;
      if (this.messageId == null) {
         var7 = "null";
      } else {
         var7 = MessageId.toString-impl(this.messageId);
      }

      val var3: java.lang.String = this.title;
      val var2: java.lang.String = this.target;
      val var5: java.lang.String = this.content;
      val var6: LinkContext = this.context;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapLinkData(messageId=");
      var4.append(var7);
      var4.append(", title=");
      var4.append(var3);
      var4.append(", target=");
      var4.append(var2);
      var4.append(", content=");
      var4.append(var5);
      var4.append(", context=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }
}
