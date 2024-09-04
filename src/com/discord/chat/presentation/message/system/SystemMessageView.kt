package com.discord.chat.presentation.message.system

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnLongClickListener
import androidx.core.view.f1
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.R
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
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.root.MessageContext
import com.discord.chat.presentation.spine.SpineParentMessage
import com.discord.fonts.DiscordFont
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import eh.w
import java.util.ArrayList
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.r

public class SystemMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout, SpineParentMessage {
   private final var accessories: ArrayList<MessageAccessory>
   private final val binding: SystemMessageViewBinding
   private final val greenIconColor: Int
   private final val normalIconColor: Int
   private final val pinkIconColor: Int
   private final val redIconColor: Int

   public open val spineOriginView: View
      public open get() {
         val var1: SimpleDraweeView = this.binding.icon;
         r.g(this.binding.icon, "binding.icon");
         return var1;
      }


   private final val warnIconColor: Int

   fun SystemMessageView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      this.normalIconColor = ThemeManagerKt.getTheme().getInteractiveNormal();
      this.greenIconColor = ColorUtilsKt.getColorCompat(this, color.green_360);
      this.redIconColor = ColorUtilsKt.getColorCompat(this, color.red_400);
      this.warnIconColor = ColorUtilsKt.getColorCompat(this, color.yellow_300);
      this.pinkIconColor = ColorUtilsKt.getColorCompat(this, color.guild_boosting_pink);
      val var3: SystemMessageViewBinding = SystemMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      RippleUtilsKt.addRipple$default(this, false, 0, 3, null);
      this.accessories = new ArrayList<>(2);
   }

   private fun generateMessageAccessories(message: Message, context: MessageContext): List<MessageAccessory> {
      this.accessories.clear();
      var var12: Int = var1.getConstrainedWidth();
      val var3: Int;
      if (var12 != null) {
         var3 = var12;
      } else {
         var3 = this.getResources().getDisplayMetrics().widthPixels;
      }

      val var14: StructurableText = var1.getContent();
      if (var14 != null) {
         val var13: ArrayList = this.accessories;
         val var21: java.lang.String = var1.getId-3Eiw7ao();
         val var8: Boolean = MessageKt.shouldAnimateEmoji(var1);
         val var9: Boolean = MessageKt.shouldShowLinkDecorations(var1);
         val var11: Boolean = var1.getShouldShowRoleDot();
         val var10: Boolean = var1.getShouldShowRoleOnName();
         val var4: Int;
         if (var1.getTimestamp() != null) {
            var4 = 0;
         } else {
            var4 = this.getResources().getDimensionPixelSize(R.dimen.message_accessories_vertical_spacing);
         }

         var var15: Int = var1.getLinkColor();
         val var5: Int;
         if (var15 != null) {
            var5 = var15;
         } else {
            var5 = ThemeManagerKt.getTheme().getTextNormal();
         }

         var15 = var1.getTextColor();
         val var6: Int;
         if (var15 != null) {
            var6 = var15;
         } else {
            var6 = ThemeManagerKt.getTheme().getTextNormal();
         }

         var13.add(
            new MessageContentAccessory(
               var21,
               var14,
               var8,
               var9,
               var11,
               var10,
               var4,
               var5,
               var6,
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

      val var22: java.lang.String = var1.getTimestamp();
      if (var22 != null) {
         this.accessories
            .add(new TimestampMessageAccessory(var1.getId-3Eiw7ao(), var22, ThemeManagerKt.getTheme().getTextMuted(), DiscordFont.PrimaryMedium, null));
      }

      var12 = var1.getTotalMonthsSubscribed();
      if (var12 != null && var12.intValue() <= 1) {
         val var34: ArrayList = this.accessories;
         val var32: java.lang.String = var1.getId-3Eiw7ao();
         val var24: java.lang.String = var1.getUsername();
         val var29: Context = this.binding.getRoot().getContext();
         r.g(var29, "binding.root.context");
         var34.add(new RoleSubscriptionPurchaseAccessory(var32, var24, MessageKt.avatarUrl(var1, var29), var3, false, null));
      }

      val var25: Sticker = var1.getSticker();
      if (var25 != null) {
         this.accessories.add(new WelcomeStickerAccessory(var1, var25));
      }

      if (var1.getType() === MessageType.STAGE_RAISE_HAND && r.c(var1.getShowInviteToSpeakButton(), java.lang.Boolean.TRUE)) {
         this.accessories.add(new InviteToSpeakAccessory(var1));
      }

      if (var1.getType() === MessageType.GUILD_DEADCHAT_REVIVE_PROMPT || var1.getType() === MessageType.GUILD_GAMING_STATS_PROMPT) {
         val var26: java.util.List = var1.getEmbeds();
         if (var26 != null) {
            val var27: java.util.Iterator = var26.iterator();

            for (int var20 = 0; var27.hasNext(); var20++) {
               val var30: Any = var27.next();
               if (var20 < 0) {
                  h.s();
               }

               this.accessories
                  .add(
                     new EmbedMessageAccessory(
                        var1.getId-3Eiw7ao(),
                        var20,
                        var1.getChannelId-o4g7jtM(),
                        var3,
                        16,
                        var30 as Embed,
                        false,
                        false,
                        false,
                        false,
                        false,
                        null,
                        null,
                        false,
                        false,
                        false,
                        null
                     )
                  );
            }
         }

         this.accessories.add(new ChannelPromptActionsAccessory(var1));
      }

      val var28: java.util.List = var1.getReactions();
      var var19: Boolean = false;
      if (var28 != null) {
         var19 = false;
         if (var28.isEmpty() xor true) {
            var19 = true;
         }
      }

      if (var19) {
         this.accessories
            .add(
               new ReactionsMessageAccessory(
                  var1.getId-3Eiw7ao(),
                  var1.getReactions(),
                  var2.getCanAddNewReactions(),
                  var2.getUseAddBurstReaction(),
                  var2.getAddReactionLabel(),
                  var2.getAddNewReactionAccessibilityLabel(),
                  var2.getAddNewBurstReactionAccessibilityLabel(),
                  var2.getReactionsTheme(),
                  null,
                  null
               )
            );
      }

      val var16: ThreadEmbed = var1.getThreadEmbed();
      if (var16 != null) {
         this.accessories.add(new ThreadEmbedMessageAccessory(var1.getId-3Eiw7ao(), var16, null));
      }

      val var17: EphemeralIndication = var1.getEphemeralIndication();
      if (var17 != null) {
         this.accessories.add(new EphemeralIndicationMessageAccessory(var1.getId-3Eiw7ao(), var17, null));
      }

      val var18: SafetyPolicyNoticeEmbed = var1.getSafetyPolicyNoticeEmbed();
      if (var18 != null) {
         this.accessories.add(new SafetyPolicyNoticeMessageAccessory(var1.getId-3Eiw7ao(), var18, null));
      }

      return this.accessories;
   }

   private fun getIconAndColor(messageType: MessageType): Pair<ReactAsset, Int> {
      var var3: Pair;
      switch (SystemMessageView.WhenMappings.$EnumSwitchMapping$0[var1.ordinal()]) {
         case 1:
         case 2:
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
            var3 = w.a(ReactAsset.ArrowForward, this.greenIconColor);
            break;
         case 9:
         case 10:
            var3 = w.a(ReactAsset.ArrowBack, this.redIconColor);
            break;
         case 11:
         case 12:
            var3 = w.a(ReactAsset.Pencil, this.normalIconColor);
            break;
         case 13:
            var3 = w.a(ReactAsset.Pin, this.normalIconColor);
            break;
         case 14:
            var3 = w.a(ReactAsset.Ticket, this.normalIconColor);
            break;
         case 15:
         case 16:
         case 17:
         case 18:
            var3 = w.a(ReactAsset.MemberListBadge, this.pinkIconColor);
            break;
         case 19:
            var3 = w.a(ReactAsset.AnnouncementThread, this.normalIconColor);
            break;
         case 20:
            var3 = w.a(ReactAsset.Close, this.redIconColor);
            break;
         case 21:
            var3 = w.a(ReactAsset.Check, this.greenIconColor);
            break;
         case 22:
         case 23:
            var3 = w.a(ReactAsset.Alert, this.warnIconColor);
            break;
         case 24:
         case 25:
            var3 = w.a(ReactAsset.Thread, this.normalIconColor);
            break;
         case 26:
            var3 = w.a(ReactAsset.StageChannel, this.greenIconColor);
            break;
         case 27:
         case 28:
            var3 = w.a(ReactAsset.StageChannel, this.normalIconColor);
            break;
         case 29:
            var3 = w.a(ReactAsset.MoveToSpeaker, this.normalIconColor);
            break;
         case 30:
            var3 = w.a(ReactAsset.RaisedHand, this.normalIconColor);
            break;
         case 31:
            var3 = w.a(ReactAsset.LockClosed, this.normalIconColor);
            break;
         case 32:
            var3 = w.a(ReactAsset.LockOpen, this.normalIconColor);
            break;
         case 33:
            var3 = w.a(ReactAsset.PollsIcon, this.normalIconColor);
            break;
         default:
            val var2: StringBuilder = new StringBuilder();
            var2.append("Unhandled message type: ");
            var2.append(var1);
            throw new IllegalArgumentException(var2.toString());
      }

      return var3;
   }

   @JvmStatic
   fun `setMessage$lambda$0`(var0: Message, var1: ChatEventHandler, var2: View): Boolean {
      r.h(var0, "$message");
      r.h(var1, "$eventHandler");
      val var3: Boolean;
      if (MessageKt.isEphemeral(var0)) {
         var3 = false;
      } else {
         val var4: Function6 = var1.getOnMessageLongPressed();
         if (var4 != null) {
            var4.invoke(MessageId.box-impl(var0.getId-3Eiw7ao()), ChannelId.box-impl(var0.getChannelId-o4g7jtM()), null, null, null, null);
         }

         var3 = true;
      }

      return var3;
   }

   public fun setAccessoriesRecycledViewPool(recycledViewPool: RecycledViewPool) {
      r.h(var1, "recycledViewPool");
      this.binding.accessoriesView.setRecycledViewPool(var1);
   }

   public fun setMessage(message: Message, context: MessageContext, eventHandler: ChatEventHandler = ChatEventHandler.Empty.INSTANCE) {
      r.h(var1, "message");
      r.h(var2, "context");
      r.h(var3, "eventHandler");
      val var5: b = new b(var1, var3);
      NestedScrollOnTouchUtilsKt.setOnLongClickListenerNested(this, true, var5);
      val var7: Pair = this.getIconAndColor(var1.getType());
      val var6: ReactAsset = var7.a() as ReactAsset;
      val var4: Int = (var7.b() as java.lang.Number).intValue();
      val var12: SimpleDraweeView = this.binding.icon;
      r.g(this.binding.icon, "binding.icon");
      ReactAssetUtilsKt.setReactAsset(var12, var6);
      val var11: SimpleDraweeView = this.binding.icon;
      r.g(this.binding.icon, "binding.icon");
      ColorUtilsKt.setTintColor(var11, var4);
      val var8: java.util.List = this.generateMessageAccessories(var1, var2);
      this.binding
         .accessoriesView
         .setAccessories-MNg-vQI(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM(), var1.getGuildId-qOKuAAo(), var8, var3, null, false);
      val var9: MessageAccessoriesView = this.binding.accessoriesView;
      r.g(this.binding.accessoriesView, "binding.accessoriesView");
      val var10: Byte;
      if (var8.isEmpty() xor true) {
         var10 = 0;
      } else {
         var10 = 8;
      }

      var9.setVisibility(var10);
      this.binding.accessoriesView.setOnCurrentContentViewChanged(new Function1<MessageContentView, Unit>(this, var1, var5) {
         final Message $message;
         final OnLongClickListener $onLongClick;
         final SystemMessageView this$0;

         {
            super(1);
            this.this$0 = var1;
            this.$message = var2;
            this.$onLongClick = var3;
         }

         private static final void invoke$lambda$0(View var0) {
         }

         public final void invoke(MessageContentView var1) {
            r.h(var1, "it");
            f1.q0(this.this$0, new MessageViewAccessibilityDelegate(this.$message, var1, new c(), this.$onLongClick));
         }
      });
   }
}
