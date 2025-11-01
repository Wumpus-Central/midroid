package com.discord.chat.presentation.message.system

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import androidx.core.view.h0
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.R.dimen
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.bridge.MessageType
import com.discord.chat.bridge.embed.Embed
import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.chat.bridge.policynotice.SafetyPolicyNoticeEmbed
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.bridge.threads.ThreadEmbed
import com.discord.chat.databinding.SystemMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.chat.presentation.message.MessageViewAccessibilityDelegate
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.fonts.DiscordFont
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import ht.v
import java.util.ArrayList
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageView.kt\ncom/discord/chat/presentation/message/system/SystemMessageView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,354:1\n257#2,2:355\n1872#3,3:357\n*S KotlinDebug\n*F\n+ 1 SystemMessageView.kt\ncom/discord/chat/presentation/message/system/SystemMessageView\n*L\n121#1:355,2\n223#1:357,3\n*E\n"])
public class SystemMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout(var1, var2), SpineParentMessage {
   private final val normalIconColor: Int = ThemeManagerKt.getTheme().getInteractiveNormal()
   private final val greenIconColor: Int
   private final val redIconColor: Int
   private final val warnIconColor: Int
   private final val pinkIconColor: Int
   private final val mutedIconColor: Int
   private final val binding: SystemMessageViewBinding

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.icon;
         return var1;
      }


   private final var accessories: ArrayList<MessageAccessory>

   fun SystemMessageView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.greenIconColor = ColorUtilsKt.getColorCompat(this, R.color.green_360);
      this.redIconColor = ColorUtilsKt.getColorCompat(this, R.color.red_400);
      this.warnIconColor = ColorUtilsKt.getColorCompat(this, R.color.yellow_300);
      this.pinkIconColor = ColorUtilsKt.getColorCompat(this, R.color.guild_boosting_pink);
      this.mutedIconColor = ThemeManagerKt.getTheme().getTextMuted();
      val var3: SystemMessageViewBinding = SystemMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      this.accessories = new ArrayList<>(2);
   }

   private fun generateMessageAccessories(message: Message, context: MessageContext): List<MessageAccessory> {
      this.accessories.clear();
      var var13: Int = var1.getConstrainedWidth();
      val var3: Int;
      if (var13 != null) {
         var3 = var13;
      } else {
         var3 = this.getResources().getDisplayMetrics().widthPixels;
      }

      var var4: Boolean;
      if (var1.getTimestamp() != null && var1.getType() != MessageType.IN_GAME_MESSAGE_NUX) {
         var4 = 1;
      } else {
         var4 = 0;
      }

      val var15: StructurableText = var1.getContent();
      if (var15 != null) {
         val var29: ArrayList = this.accessories;
         val var14: java.lang.String = var1.getId-3Eiw7ao();
         val var12: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var11: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var9: Boolean = var1.getShouldShowRoleDot();
         val var10: Boolean = var1.getShouldShowRoleOnName();
         val var5: Int;
         if (var4) {
            var5 = 0;
         } else {
            var5 = this.getResources().getDimensionPixelSize(dimen.message_accessories_vertical_spacing);
         }

         var var16: Int = var1.getLinkColor();
         val var6: Int;
         if (var16 != null) {
            var6 = var16;
         } else {
            var6 = ThemeManagerKt.getTheme().getTextNormal();
         }

         var16 = var1.getTextColor();
         val var7: Int;
         if (var16 != null) {
            var7 = var16;
         } else {
            var7 = ThemeManagerKt.getTheme().getTextNormal();
         }

         var29.add(
            new MessageContentAccessory(
               var14,
               var15,
               var12,
               var11,
               var9,
               var10,
               var5,
               var6,
               var7,
               DiscordFont.PrimaryNormal,
               16,
               true,
               var3,
               null,
               var1.getEditedColor(),
               false,
               null,
               null,
               196608,
               null
            )
         );
      }

      if (var4) {
         val var30: java.lang.String = var1.getTimestamp();
         if (var30 != null) {
            this.accessories
               .add(new TimestampMessageAccessory(var1.getId-3Eiw7ao(), var30, ThemeManagerKt.getTheme().getTextMuted(), DiscordFont.PrimaryMedium, null));
         }
      }

      var13 = var1.getTotalMonthsSubscribed();
      if (var13 != null && var13.intValue() <= 1) {
         val var44: ArrayList = this.accessories;
         val var40: java.lang.String = var1.getId-3Eiw7ao();
         val var32: java.lang.String = var1.getUsername();
         val var37: Context = this.binding.getRoot().getContext();
         var44.add(new RoleSubscriptionPurchaseAccessory(var40, var32, MessageKt.avatarUrl(var1, var37), var3, false, null));
      }

      val var33: Sticker = var1.getSticker();
      if (var33 != null) {
         this.accessories.add(new WelcomeStickerAccessory(var1, var33));
      }

      if (var1.getType() === MessageType.STAGE_RAISE_HAND && var1.getShowInviteToSpeakButton() == java.lang.Boolean.TRUE) {
         this.accessories.add(new InviteToSpeakAccessory(var1));
      }

      var var21: Boolean;
      if (var1.getType() != MessageType.GUILD_DEADCHAT_REVIVE_PROMPT && var1.getType() != MessageType.GUILD_GAMING_STATS_PROMPT) {
         var21 = true;
      } else {
         val var34: java.util.List = var1.getEmbeds();
         var4 = (boolean)1;
         if (var34 != null) {
            val var35: java.util.Iterator = var34.iterator();
            var4 = 0;
            val var25: Int = var3;
            var21 = true;

            while (true) {
               val var27: Int = var4;
               var4 = var21;
               if (!var35.hasNext()) {
                  break;
               }

               val var38: Any = var35.next();
               var4 += 1;
               if (var27 < 0) {
                  CollectionsKt.v();
               }

               this.accessories
                  .add(
                     new EmbedMessageAccessory(
                        var1.getId-3Eiw7ao(),
                        var27,
                        var1.getChannelId-o4g7jtM(),
                        var25,
                        16,
                        var38 as Embed,
                        false,
                        false,
                        false,
                        false,
                        false,
                        null,
                        null,
                        false,
                        null
                     )
                  );
            }
         }

         var21 = var4;
         this.accessories.add(new ChannelPromptActionsAccessory(var1));
      }

      val var36: java.util.List = var1.getReactions();
      if (var36 != null && (var36.isEmpty() xor true) == var21) {
         this.accessories
            .add(
               new ReactionsMessageAccessory(
                  var1.getId-3Eiw7ao(),
                  var1.getReactions(),
                  var2.getCanAddNewReactions(),
                  var2.getAddReactionLabel(),
                  var2.getAddNewReactionAccessibilityLabel(),
                  var2.getReactionsTheme(),
                  null,
                  null,
                  null,
                  384,
                  null
               )
            );
      }

      val var17: ThreadEmbed = var1.getThreadEmbed();
      if (var17 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var17, null));
      }

      val var18: EphemeralIndication = var1.getEphemeralIndication();
      if (var18 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var18, null));
      }

      val var19: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var19 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var19, null));
      }

      return this.accessories;
   }

   private fun getIconAndColor(messageType: MessageType): Pair<ReactAsset, Int> {
      switch (SystemMessageView.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            return v.a(ReactAsset.ArrowForward, this.greenIconColor);
         case 9:
         case 10:
            return v.a(ReactAsset.ArrowBack, this.redIconColor);
         case 11:
         case 12:
         case 13:
         case 14:
            return v.a(ReactAsset.Pencil, this.normalIconColor);
         case 15:
            return v.a(ReactAsset.AddReaction, this.normalIconColor);
         case 16:
            return v.a(ReactAsset.Pin, this.normalIconColor);
         case 17:
            return v.a(ReactAsset.Ticket, this.normalIconColor);
         case 18:
         case 19:
         case 20:
         case 21:
            return v.a(ReactAsset.MemberListBadge, this.pinkIconColor);
         case 22:
            return v.a(ReactAsset.AnnouncementThread, this.normalIconColor);
         case 23:
            return v.a(ReactAsset.Close, this.redIconColor);
         case 24:
            return v.a(ReactAsset.Check, this.greenIconColor);
         case 25:
         case 26:
            return v.a(ReactAsset.Alert, this.warnIconColor);
         case 27:
         case 28:
            return v.a(ReactAsset.Thread, this.normalIconColor);
         case 29:
            return v.a(ReactAsset.StageChannel, this.greenIconColor);
         case 30:
         case 31:
            return v.a(ReactAsset.StageChannel, this.normalIconColor);
         case 32:
            return v.a(ReactAsset.MoveToSpeaker, this.normalIconColor);
         case 33:
            return v.a(ReactAsset.RaisedHand, this.normalIconColor);
         case 34:
            return v.a(ReactAsset.LockClosed, this.normalIconColor);
         case 35:
            return v.a(ReactAsset.LockOpen, this.normalIconColor);
         case 36:
            return v.a(ReactAsset.PollsIcon, this.normalIconColor);
         case 37:
            return v.a(ReactAsset.Refresh, this.greenIconColor);
         case 38:
            return v.a(ReactAsset.GameController, this.mutedIconColor);
         case 39:
            return v.a(ReactAsset.Check, this.greenIconColor);
         case 40:
            return v.a(ReactAsset.Close, this.redIconColor);
         case 41:
            return v.a(ReactAsset.ArrowBack, this.normalIconColor);
         default:
            val var2: StringBuilder = new StringBuilder();
            var2.append("Unhandled message type: ");
            var2.append(var1);
            throw new IllegalArgumentException(var2.toString());
      }
   }

   @JvmStatic
   fun `setMessage$lambda$0`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      if (MessageKt.isEphemeral(var0)) {
         return false;
      } else {
         val var3: Function6 = var1.getOnMessageLongPressed();
         if (var3 != null) {
            var3.invoke(MessageId.box-impl(var0.getId-3Eiw7ao()), ChannelId.box-impl(var0.getChannelId-o4g7jtM()), null, null, null, null);
         }

         return true;
      }
   }

   @JvmStatic
   fun `setMessage$lambda$2$lambda$1`(var0: Function2, var1: Message, var2: View) {
      var0.invoke(MessageId.box-impl(var1.getId-3Eiw7ao()), ChannelId.box-impl(var1.getChannelId-o4g7jtM()));
   }

   @JvmStatic
   fun `setMessage$lambda$3`(var0: View) {
   }

   public fun setAccessoriesRecycledViewPool(recycledViewPool: RecycledViewPool) {
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(message: Message, context: MessageContext, eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE) {
      val var7: e = new e(var1, var3);
      val var8: Function2 = var3.getOnMessageDoubleTapped();
      var var5: f = null;
      if (var8 != null) {
         if (MessageKt.isEphemeral(var1)) {
            var5 = null;
         } else {
            var5 = new f(var8, var1);
         }
      }

      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var7);
      NestedScrollOnTouchUtilsKt.setOnDoubleClickListenerNested(this, true, var5);
      val var14: Pair = this.getIconAndColor(var1.getType());
      val var11: ReactAsset = var14.a() as ReactAsset;
      val var4: Int = (var14.b() as java.lang.Number).intValue();
      val var15: SimpleDraweeView = this.binding.icon;
      ReactAssetUtilsKt.setReactAsset(var15, var11);
      val var12: SimpleDraweeView = this.binding.icon;
      ColorUtilsKt.setTintColor(var12, var4);
      val var13: java.util.List = this.generateMessageAccessories(var1, var2);
      this.binding
         .accessoriesView
         .setAccessories-mFdI1tY(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getGuildId-qOKuAAo(), var13, var3, null, var2, false, false);
      val var9: MessageAccessoriesView = this.binding.accessoriesView;
      val var10: Byte;
      if (!var13.isEmpty()) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var9.setVisibility(var10);
      h0.n0(this, new MessageViewAccessibilityDelegate(var1, new g(), var7));
   }
}
