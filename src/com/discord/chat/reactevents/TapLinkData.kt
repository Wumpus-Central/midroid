package com.discord.chat.reactevents

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.LinkContextData
import com.discord.chat.bridge.contentnode.LinkContextData.BindDismissMessage
import com.discord.chat.bridge.contentnode.LinkContextData.BindGuildMenu
import com.discord.chat.bridge.contentnode.LinkContextData.BindInsertText
import com.discord.chat.bridge.contentnode.LinkContextData.BindJumpToMessage
import com.discord.chat.bridge.contentnode.LinkContextData.BindOpenGdmCustomizeActionSheet
import com.discord.chat.bridge.contentnode.LinkContextData.BindOpenPins
import com.discord.chat.bridge.contentnode.LinkContextData.BindOpenRoleSubscriptionOverview
import com.discord.chat.bridge.contentnode.LinkContextData.BindOpenThreadChannel
import com.discord.chat.bridge.contentnode.LinkContextData.BindOpenUrl
import com.discord.chat.bridge.contentnode.LinkContextData.BindTapCommandName
import com.discord.chat.bridge.contentnode.LinkContextData.BindUserMenu
import com.discord.chat.bridge.contentnode.LinkContextData.BindUserSurvey
import com.discord.chat.bridge.contentnode.LinkContextData.LinkUrl
import com.discord.chat.bridge.contentnode.LinkContextData.BindGuildMenu.MessageReference
import com.discord.logging.Log
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
import ht.v
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nTapLinkData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapLinkData.kt\ncom/discord/chat/reactevents/TapLinkData\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"])
public data class TapLinkData(messageId: MessageId? = ..., title: String? = ..., target: LinkContextData? = ..., content: String = ...) : TapLinkData(
         var1, var2, var3, var4
      ),
   ReactEvent {
   public final val messageId: MessageId?
   public final val title: String?
   public final val target: LinkContextData?
   public final val content: String

   fun TapLinkData(var1: java.lang.String, var2: LinkContentNode) {
      val var4: LinkContextData = var2.getTarget();
      val var3: java.lang.String = var2.getTextContent();
      var var5: java.lang.String = var3;
      if (var3 == null) {
         var5 = "";
      }

      this(var1, null, var4, var5, 2, null);
   }

   fun TapLinkData(var1: java.lang.String, var2: java.lang.String, var3: LinkContextData, var4: java.lang.String) {
      this.messageId = var1;
      this.title = var2;
      this.target = var3;
      this.content = var4;
   }

   private fun LinkContextData.toMap(): WritableNativeMap {
      val var5: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf();
      val var2: LinkContextData = this.target;
      if (this.target is LinkUrl) {
         NativeMapExtensionsKt.put(var5, "url", (this.target as LinkUrl).getUrl());
         return var5;
      } else if (this.target is BindOpenThreadChannel) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as BindOpenThreadChannel).getAction());
         NativeMapExtensionsKt.put(var5, "threadId", ChannelId.toString-impl((this.target as BindOpenThreadChannel).getThreadId-o4g7jtM()));
         return var5;
      } else {
         if (this.target is BindUserMenu) {
            NativeMapExtensionsKt.put(var5, "action", (this.target as BindUserMenu).getAction());
            NativeMapExtensionsKt.put(var5, "userId", UserId.toString-impl((this.target as BindUserMenu).getUserId-re6GcUE()));
            val var6: ChannelId = (this.target as BindUserMenu).getMessageChannelId-qMVnFVQ();
            if (var6 != null) {
               NativeMapExtensionsKt.put(var5, "messageChannelId", ChannelId.toString-impl(var6.unbox-impl()));
               return var5;
            }
         } else {
            if (this.target is BindTapCommandName) {
               NativeMapExtensionsKt.put(var5, "action", (this.target as BindTapCommandName).getAction());
               NativeMapExtensionsKt.put(var5, "userId", UserId.toString-impl((this.target as BindTapCommandName).getUserId-re6GcUE()));
               NativeMapExtensionsKt.put(var5, "messageType", (this.target as BindTapCommandName).getMessageType().getSerialNumber());
               NativeMapExtensionsKt.put(var5, "messageId", MessageId.toString-impl((this.target as BindTapCommandName).getMessageId-3Eiw7ao()));
               NativeMapExtensionsKt.put(var5, "applicationUserId", UserId.toString-impl((this.target as BindTapCommandName).getApplicationUserId-re6GcUE()));
               NativeMapExtensionsKt.put(var5, "messageChannelId", ChannelId.toString-impl((this.target as BindTapCommandName).getMessageChannelId-o4g7jtM()));
               return var5;
            }

            if (this.target is BindOpenPins) {
               NativeMapExtensionsKt.put(var5, "action", (this.target as BindOpenPins).getAction());
               NativeMapExtensionsKt.put(var5, "messageChannelId", ChannelId.toString-impl((this.target as BindOpenPins).getMessageChannelId-o4g7jtM()));
               return var5;
            }

            if (this.target is BindGuildMenu) {
               NativeMapExtensionsKt.put(var5, "action", (this.target as BindGuildMenu).getAction());
               val var3: MessageReference = (this.target as BindGuildMenu).getMessageReference();
               if (var3 != null) {
                  val var7: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf();
                  NativeMapExtensionsKt.put(var7, "channel_id", ChannelId.toString-impl(var3.getChannelId-o4g7jtM()));
                  val var9: GuildId = var3.getGuildId-qOKuAAo();
                  if (var9 != null) {
                     var9.unbox-impl();
                     NativeMapExtensionsKt.put(var7, "guild_id", (this.target as BindGuildMenu).toString());
                  }

                  NativeMapExtensionsKt.put(var5, "messageReference", var7);
                  return var5;
               }
            } else {
               if (this.target is BindDismissMessage) {
                  NativeMapExtensionsKt.put(var5, "action", (this.target as BindDismissMessage).getAction());
                  NativeMapExtensionsKt.put(
                     var5,
                     "message",
                     NativeMapExtensionsKt.nativeMapOf(
                        v.a("id", (this.target as BindDismissMessage).getMessage().getId-3Eiw7ao()),
                        v.a("channel_id", ChannelId.toString-impl((this.target as BindDismissMessage).getMessage().getChannelId-o4g7jtM())),
                        v.a("loggingName", (this.target as BindDismissMessage).getMessage().getLoggingName()),
                        v.a(
                           "author",
                           NativeMapExtensionsKt.nativeMapOf(v.a("username", (this.target as BindDismissMessage).getMessage().getAuthor().getUsername()))
                        )
                     )
                  );
                  return var5;
               }

               if (this.target is BindOpenRoleSubscriptionOverview) {
                  NativeMapExtensionsKt.put(var5, "action", (this.target as BindOpenRoleSubscriptionOverview).getAction());
                  NativeMapExtensionsKt.put(var5, "guildId", (this.target as BindOpenRoleSubscriptionOverview).getGuildId());
                  NativeMapExtensionsKt.put(var5, "channelId", (this.target as BindOpenRoleSubscriptionOverview).getChannelId());
                  NativeMapExtensionsKt.put(var5, "messageId", (this.target as BindOpenRoleSubscriptionOverview).getMessageId());
                  NativeMapExtensionsKt.put(var5, "roleSubscriptionListingId", (this.target as BindOpenRoleSubscriptionOverview).getRoleSubscriptionListingId());
                  return var5;
               }

               if (this.target is BindUserSurvey) {
                  NativeMapExtensionsKt.put(var5, "action", (this.target as BindUserSurvey).getAction());
                  NativeMapExtensionsKt.put(
                     var5,
                     "message",
                     NativeMapExtensionsKt.nativeMapOf(
                        v.a("id", (this.target as BindUserSurvey).getMessage().getId-3Eiw7ao()),
                        v.a("channel_id", ChannelId.toString-impl((this.target as BindUserSurvey).getMessage().getChannelId-o4g7jtM())),
                        v.a("loggingName", (this.target as BindUserSurvey).getMessage().getLoggingName())
                     )
                  );
                  NativeMapExtensionsKt.put(var5, "notificationType", (this.target as BindUserSurvey).getNotificationType());
                  return var5;
               }

               if (this.target is BindJumpToMessage) {
                  NativeMapExtensionsKt.put(var5, "action", (this.target as BindJumpToMessage).getAction());
                  NativeMapExtensionsKt.put(var5, "targetChannelId", (this.target as BindJumpToMessage).getTargetChannelId());
                  NativeMapExtensionsKt.put(var5, "targetMessageId", (this.target as BindJumpToMessage).getTargetMessageId());
                  return var5;
               }

               if (this.target is BindOpenUrl) {
                  NativeMapExtensionsKt.put(var5, "url", (this.target as BindOpenUrl).getUrl());
                  NativeMapExtensionsKt.put(var5, "linkColor", (this.target as BindOpenUrl).getLinkColor());
                  return var5;
               }

               if (this.target is BindOpenGdmCustomizeActionSheet) {
                  NativeMapExtensionsKt.put(var5, "action", (this.target as BindOpenGdmCustomizeActionSheet).getAction());
                  NativeMapExtensionsKt.put(var5, "messageChannelId", (this.target as BindOpenGdmCustomizeActionSheet).getMessageChannelId());
                  NativeMapExtensionsKt.put(var5, "linkColor", (this.target as BindOpenGdmCustomizeActionSheet).getLinkColor());
                  return var5;
               }

               if (this.target !is BindInsertText) {
                  val var11: Log = Log.INSTANCE;
                  val var4: StringBuilder = new StringBuilder();
                  var4.append("Missing target type data: ");
                  var4.append(var2);
                  Log.e$default(var11, "TapLink", var4.toString(), null, 4, null);
                  return var5;
               }

               NativeMapExtensionsKt.put(var5, "action", (this.target as BindInsertText).getAction());
               NativeMapExtensionsKt.put(var5, "text", (this.target as BindInsertText).getText());
               val var8: java.lang.Boolean = (this.target as BindInsertText).getAddSpace();
               if (var8 != null) {
                  NativeMapExtensionsKt.put(var5, "addSpace", var8);
               }
            }
         }

         return var5;
      }
   }

   public operator fun component1(): MessageId? {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.title;
   }

   public operator fun component3(): LinkContextData? {
      return this.target;
   }

   public operator fun component4(): String {
      return this.content;
   }

   public fun copy(messageId: MessageId? = ..., title: String? = ..., target: LinkContextData? = ..., content: String = ...): TapLinkData {
      return new TapLinkData(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapLinkData) {
         return false;
      } else {
         var var2: Boolean;
         label37: {
            var1 = var1;
            if (this.messageId == null) {
               if (var1.messageId == null) {
                  var2 = true;
                  break label37;
               }
            } else if (var1.messageId != null) {
               var2 = MessageId.equals-impl0(this.messageId, var1.messageId);
               break label37;
            }

            var2 = false;
         }

         if (!var2) {
            return false;
         } else if (!(this.title == var1.title)) {
            return false;
         } else if (!(this.target == var1.target)) {
            return false;
         } else {
            return this.content == var1.content;
         }
      }
   }

   public override fun hashCode(): Int {
      var var3: Int = 0;
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

      if (this.target != null) {
         var3 = this.target.hashCode();
      }

      return ((var1 * 31 + var2) * 31 + var3) * 31 + this.content.hashCode();
   }

   public override fun serialize(): WritableMap {
      if (this.target != null) {
         val var2: WritableNativeMap = this.toMap(this.target);
         if (var2 != null) {
            return NativeMapExtensionsKt.nativeMapOf(v.a("data", var2));
         }
      }

      val var5: java.lang.String;
      if (this.messageId == null) {
         var5 = "null";
      } else {
         var5 = MessageId.toString-impl(this.messageId);
      }

      return NativeMapExtensionsKt.nativeMapOf(
         v.a(
            "data",
            NativeMapExtensionsKt.nativeMapOf(
               v.a("messageId", var5),
               v.a("url", this.target),
               v.a("node", NativeMapExtensionsKt.nativeMapOf(v.a("title", this.title), v.a("target", this.target), v.a("content", this.content)))
            )
         )
      );
   }

   public override fun toString(): String {
      val var6: java.lang.String;
      if (this.messageId == null) {
         var6 = "null";
      } else {
         var6 = MessageId.toString-impl(this.messageId);
      }

      val var3: java.lang.String = this.title;
      val var4: LinkContextData = this.target;
      val var5: java.lang.String = this.content;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapLinkData(messageId=");
      var2.append(var6);
      var2.append(", title=");
      var2.append(var3);
      var2.append(", target=");
      var2.append(var4);
      var2.append(", content=");
      var2.append(var5);
      var2.append(")");
      return var2.toString();
   }
}
