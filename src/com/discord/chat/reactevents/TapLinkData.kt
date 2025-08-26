package com.discord.chat.reactevents

import B9.s
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.contentnode.LinkContextData
import com.discord.logging.Log
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import com.facebook.react.bridge.WritableNativeMap
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
      val var4: LinkContextData = this.target;
      if (this.target is LinkContextData.LinkUrl) {
         NativeMapExtensionsKt.put(var5, "url", (this.target as LinkContextData.LinkUrl).getUrl());
      } else if (this.target is LinkContextData.BindOpenThreadChannel) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindOpenThreadChannel).getAction());
         NativeMapExtensionsKt.put(var5, "threadId", ChannelId.toString-impl((this.target as LinkContextData.BindOpenThreadChannel).getThreadId-o4g7jtM()));
      } else if (this.target is LinkContextData.BindUserMenu) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindUserMenu).getAction());
         NativeMapExtensionsKt.put(var5, "userId", UserId.toString-impl((this.target as LinkContextData.BindUserMenu).getUserId-re6GcUE()));
         val var2: ChannelId = (this.target as LinkContextData.BindUserMenu).getMessageChannelId-qMVnFVQ();
         if (var2 != null) {
            NativeMapExtensionsKt.put(var5, "messageChannelId", ChannelId.toString-impl(var2.unbox-impl()));
         }
      } else if (this.target is LinkContextData.BindTapCommandName) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindTapCommandName).getAction());
         NativeMapExtensionsKt.put(var5, "userId", UserId.toString-impl((this.target as LinkContextData.BindTapCommandName).getUserId-re6GcUE()));
         NativeMapExtensionsKt.put(var5, "messageType", (this.target as LinkContextData.BindTapCommandName).getMessageType().getSerialNumber());
         NativeMapExtensionsKt.put(var5, "messageId", MessageId.toString-impl((this.target as LinkContextData.BindTapCommandName).getMessageId-3Eiw7ao()));
         NativeMapExtensionsKt.put(
            var5, "applicationUserId", UserId.toString-impl((this.target as LinkContextData.BindTapCommandName).getApplicationUserId-re6GcUE())
         );
         NativeMapExtensionsKt.put(
            var5, "messageChannelId", ChannelId.toString-impl((this.target as LinkContextData.BindTapCommandName).getMessageChannelId-o4g7jtM())
         );
      } else if (this.target is LinkContextData.BindOpenPins) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindOpenPins).getAction());
         NativeMapExtensionsKt.put(
            var5, "messageChannelId", ChannelId.toString-impl((this.target as LinkContextData.BindOpenPins).getMessageChannelId-o4g7jtM())
         );
      } else if (this.target is LinkContextData.BindGuildMenu) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindGuildMenu).getAction());
         val var3: LinkContextData.BindGuildMenu.MessageReference = (this.target as LinkContextData.BindGuildMenu).getMessageReference();
         if (var3 != null) {
            val var6: WritableNativeMap = NativeMapExtensionsKt.nativeMapOf();
            NativeMapExtensionsKt.put(var6, "channel_id", ChannelId.toString-impl(var3.getChannelId-o4g7jtM()));
            val var9: GuildId = var3.getGuildId-qOKuAAo();
            if (var9 != null) {
               var9.unbox-impl();
               NativeMapExtensionsKt.put(var6, "guild_id", (this.target as LinkContextData.BindGuildMenu).toString());
            }

            NativeMapExtensionsKt.put(var5, "messageReference", var6);
         }
      } else if (this.target is LinkContextData.BindDismissMessage) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindDismissMessage).getAction());
         NativeMapExtensionsKt.put(
            var5,
            "message",
            NativeMapExtensionsKt.nativeMapOf(
               s.a("id", (this.target as LinkContextData.BindDismissMessage).getMessage().getId-3Eiw7ao()),
               s.a("channel_id", ChannelId.toString-impl((this.target as LinkContextData.BindDismissMessage).getMessage().getChannelId-o4g7jtM())),
               s.a("loggingName", (this.target as LinkContextData.BindDismissMessage).getMessage().getLoggingName()),
               s.a(
                  "author",
                  NativeMapExtensionsKt.nativeMapOf(s.a("username", (this.target as LinkContextData.BindDismissMessage).getMessage().getAuthor().getUsername()))
               )
            )
         );
      } else if (this.target is LinkContextData.BindOpenRoleSubscriptionOverview) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindOpenRoleSubscriptionOverview).getAction());
         NativeMapExtensionsKt.put(var5, "guildId", (this.target as LinkContextData.BindOpenRoleSubscriptionOverview).getGuildId());
         NativeMapExtensionsKt.put(var5, "channelId", (this.target as LinkContextData.BindOpenRoleSubscriptionOverview).getChannelId());
         NativeMapExtensionsKt.put(var5, "messageId", (this.target as LinkContextData.BindOpenRoleSubscriptionOverview).getMessageId());
         NativeMapExtensionsKt.put(
            var5, "roleSubscriptionListingId", (this.target as LinkContextData.BindOpenRoleSubscriptionOverview).getRoleSubscriptionListingId()
         );
      } else if (this.target is LinkContextData.BindUserSurvey) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindUserSurvey).getAction());
         NativeMapExtensionsKt.put(
            var5,
            "message",
            NativeMapExtensionsKt.nativeMapOf(
               s.a("id", (this.target as LinkContextData.BindUserSurvey).getMessage().getId-3Eiw7ao()),
               s.a("channel_id", ChannelId.toString-impl((this.target as LinkContextData.BindUserSurvey).getMessage().getChannelId-o4g7jtM())),
               s.a("loggingName", (this.target as LinkContextData.BindUserSurvey).getMessage().getLoggingName())
            )
         );
         NativeMapExtensionsKt.put(var5, "notificationType", (this.target as LinkContextData.BindUserSurvey).getNotificationType());
      } else if (this.target is LinkContextData.BindJumpToMessage) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindJumpToMessage).getAction());
         NativeMapExtensionsKt.put(var5, "targetChannelId", (this.target as LinkContextData.BindJumpToMessage).getTargetChannelId());
         NativeMapExtensionsKt.put(var5, "targetMessageId", (this.target as LinkContextData.BindJumpToMessage).getTargetMessageId());
      } else if (this.target is LinkContextData.BindOpenUrl) {
         NativeMapExtensionsKt.put(var5, "url", (this.target as LinkContextData.BindOpenUrl).getUrl());
         NativeMapExtensionsKt.put(var5, "linkColor", (this.target as LinkContextData.BindOpenUrl).getLinkColor());
      } else if (this.target is LinkContextData.BindOpenGdmCustomizeActionSheet) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindOpenGdmCustomizeActionSheet).getAction());
         NativeMapExtensionsKt.put(var5, "messageChannelId", (this.target as LinkContextData.BindOpenGdmCustomizeActionSheet).getMessageChannelId());
         NativeMapExtensionsKt.put(var5, "linkColor", (this.target as LinkContextData.BindOpenGdmCustomizeActionSheet).getLinkColor());
      } else if (this.target is LinkContextData.BindInsertText) {
         NativeMapExtensionsKt.put(var5, "action", (this.target as LinkContextData.BindInsertText).getAction());
         NativeMapExtensionsKt.put(var5, "text", (this.target as LinkContextData.BindInsertText).getText());
         val var7: java.lang.Boolean = (this.target as LinkContextData.BindInsertText).getAddSpace();
         if (var7 != null) {
            NativeMapExtensionsKt.put(var5, "addSpace", var7);
         }
      } else {
         val var8: Log = Log.INSTANCE;
         val var11: StringBuilder = new StringBuilder();
         var11.append("Missing target type data: ");
         var11.append(var4);
         Log.e$default(var8, "TapLink", var11.toString(), null, 4, null);
      }

      return var5;
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
         var var3: TapLinkData;
         label37: {
            var3 = var1 as TapLinkData;
            if (this.messageId == null) {
               if (var3.messageId == null) {
                  var2 = true;
                  break label37;
               }
            } else if (var3.messageId != null) {
               var2 = MessageId.equals-impl0(this.messageId, var3.messageId);
               break label37;
            }

            var2 = false;
         }

         if (!var2) {
            return false;
         } else if (!(this.title == var3.title)) {
            return false;
         } else if (!(this.target == var3.target)) {
            return false;
         } else {
            return this.content == var3.content;
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
            return NativeMapExtensionsKt.nativeMapOf(s.a("data", var2));
         }
      }

      val var5: java.lang.String;
      if (this.messageId == null) {
         var5 = "null";
      } else {
         var5 = MessageId.toString-impl(this.messageId);
      }

      return NativeMapExtensionsKt.nativeMapOf(
         s.a(
            "data",
            NativeMapExtensionsKt.nativeMapOf(
               s.a("messageId", var5),
               s.a("url", this.target),
               s.a("node", NativeMapExtensionsKt.nativeMapOf(s.a("title", this.title), s.a("target", this.target), s.a("content", this.content)))
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

      val var2: java.lang.String = this.title;
      val var4: LinkContextData = this.target;
      val var5: java.lang.String = this.content;
      val var3: StringBuilder = new StringBuilder();
      var3.append("TapLinkData(messageId=");
      var3.append(var6);
      var3.append(", title=");
      var3.append(var2);
      var3.append(", target=");
      var3.append(var4);
      var3.append(", content=");
      var3.append(var5);
      var3.append(")");
      return var3.toString();
   }
}
