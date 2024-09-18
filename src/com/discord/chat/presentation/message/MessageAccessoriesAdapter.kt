package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Point
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.activity_invites.ActivityInviteEmbedView
import com.discord.chat.R
import com.discord.chat.bridge.MediaType
import com.discord.chat.bridge.UploadProgress
import com.discord.chat.bridge.contentnode.CommandMentionContentNode
import com.discord.chat.bridge.contentnode.EmojiContentNode
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.chat.bridge.postpreviewembed.PostPreviewEmbed
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.bridge.safetysystemnotification.SafetySystemNotificationEmbed
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.sticker.Sticker
import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.chat.databinding.TimestampViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.invitetospeak.InviteToSpeakView
import com.discord.chat.presentation.list.AccessoriesViewPool
import com.discord.chat.presentation.message.messagepart.ActivityBookmarkMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInstanceEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ActivityInviteEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.AudioAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.AutoModerationNotificationEmbedAccessory
import com.discord.chat.presentation.message.messagepart.ChannelPromptActionsAccessory
import com.discord.chat.presentation.message.messagepart.CtaButtonMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.EmbeddedActivityInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.FileAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageActionBarAccessory
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar
import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.messagepart.ForwardHeaderMessageAccessory
import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildEventInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteDisabledMessageAccessory
import com.discord.chat.presentation.message.messagepart.GuildInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.InfoLinkMessageAccessory
import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.messagepart.InviteToSpeakAccessory
import com.discord.chat.presentation.message.messagepart.MediaMosaicAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageComponentsAccessory
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.messagepart.PostPreviewEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.ReactionsMessageAccessory
import com.discord.chat.presentation.message.messagepart.RoleSubscriptionPurchaseAccessory
import com.discord.chat.presentation.message.messagepart.SafetyPolicyNoticeMessageAccessory
import com.discord.chat.presentation.message.messagepart.SafetySystemNotificationMessageAccessory
import com.discord.chat.presentation.message.messagepart.StickerMessageAccessory
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.messagepart.ThreadEmbedMessageAccessory
import com.discord.chat.presentation.message.messagepart.TimestampMessageAccessory
import com.discord.chat.presentation.message.messagepart.UploadProgressMessageAccessory
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.messagepart.VoiceInviteMessageAccessory
import com.discord.chat.presentation.message.messagepart.WelcomeStickerAccessory
import com.discord.chat.presentation.message.view.ActivityBookmarkView
import com.discord.chat.presentation.message.view.ActivityInstanceEmbedView
import com.discord.chat.presentation.message.view.AutoModerationNotificationEmbedView
import com.discord.chat.presentation.message.view.ChannelPromptActionsView
import com.discord.chat.presentation.message.view.CtaButtonView
import com.discord.chat.presentation.message.view.EmbedView
import com.discord.chat.presentation.message.view.EmbeddedActivityInviteView
import com.discord.chat.presentation.message.view.EphemeralIndicationView
import com.discord.chat.presentation.message.view.FileAttachmentView
import com.discord.chat.presentation.message.view.FlaggedMessageActionBarView
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView
import com.discord.chat.presentation.message.view.ForumPostActionBarView
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView
import com.discord.chat.presentation.message.view.ForwardHeaderView
import com.discord.chat.presentation.message.view.GiftView
import com.discord.chat.presentation.message.view.GuildEventInviteView
import com.discord.chat.presentation.message.view.GuildInviteDisabledView
import com.discord.chat.presentation.message.view.GuildInviteView
import com.discord.chat.presentation.message.view.InfoLinkView
import com.discord.chat.presentation.message.view.InteractionStatusView
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.MessageContentView
import com.discord.chat.presentation.message.view.PostPreviewEmbedView
import com.discord.chat.presentation.message.view.RoleSubscriptionPurchaseView
import com.discord.chat.presentation.message.view.SafetyPolicyNoticeView
import com.discord.chat.presentation.message.view.SafetySystemNotificationView
import com.discord.chat.presentation.message.view.SurveyIndicationView
import com.discord.chat.presentation.message.view.ThreadEmbedView
import com.discord.chat.presentation.message.view.VoiceInviteEmbedView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.message.view.botuikit.MessageComponentsView
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView
import com.discord.chat.presentation.message.view.polls.PollImageOnlyView
import com.discord.chat.presentation.message.view.polls.PollTextAndImageView
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerView
import com.discord.chat.presentation.message.viewholder.ActivityBookmarkViewHolder
import com.discord.chat.presentation.message.viewholder.ActivityInstanceEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ActivityInviteEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.AttachmentMediaMosaicViewHolder
import com.discord.chat.presentation.message.viewholder.AudioPlayerViewHolder
import com.discord.chat.presentation.message.viewholder.AutoModerationNotificationEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ChannelPromptActionsViewHolder
import com.discord.chat.presentation.message.viewholder.CtaButtonViewHolder
import com.discord.chat.presentation.message.viewholder.EmbedViewHolder
import com.discord.chat.presentation.message.viewholder.EmbeddedActivityInviteViewHolder
import com.discord.chat.presentation.message.viewholder.EphemeralIndicationViewHolder
import com.discord.chat.presentation.message.viewholder.FileAttachmentViewHolder
import com.discord.chat.presentation.message.viewholder.FlaggedMessageActionBarViewHolder
import com.discord.chat.presentation.message.viewholder.FlaggedMessageEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ForumPostActionBarViewHolder
import com.discord.chat.presentation.message.viewholder.ForwardBreadcrumbViewHolder
import com.discord.chat.presentation.message.viewholder.ForwardHeaderViewHolder
import com.discord.chat.presentation.message.viewholder.GiftViewHolder
import com.discord.chat.presentation.message.viewholder.GuildEventInviteViewHolder
import com.discord.chat.presentation.message.viewholder.GuildInviteDisabledViewHolder
import com.discord.chat.presentation.message.viewholder.GuildInviteViewHolder
import com.discord.chat.presentation.message.viewholder.InfoLinkViewHolder
import com.discord.chat.presentation.message.viewholder.InteractionStatusViewHolder
import com.discord.chat.presentation.message.viewholder.InviteToSpeakViewHolder
import com.discord.chat.presentation.message.viewholder.MessageComponentsViewHolder
import com.discord.chat.presentation.message.viewholder.MessageContentViewHolder
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.chat.presentation.message.viewholder.PollViewHolder
import com.discord.chat.presentation.message.viewholder.PostPreviewEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.ReactionsViewHolder
import com.discord.chat.presentation.message.viewholder.RoleSubscriptionPurchaseViewHolder
import com.discord.chat.presentation.message.viewholder.SafetyPolicyNoticeViewHolder
import com.discord.chat.presentation.message.viewholder.SafetySystemNotificationViewHolder
import com.discord.chat.presentation.message.viewholder.StickerApngViewHolder
import com.discord.chat.presentation.message.viewholder.StickerGifViewHolder
import com.discord.chat.presentation.message.viewholder.StickerLottieViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPartViewHolder
import com.discord.chat.presentation.message.viewholder.StickerPngViewHolder
import com.discord.chat.presentation.message.viewholder.SurveyIndicationViewHolder
import com.discord.chat.presentation.message.viewholder.ThreadEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.TimestampViewHolder
import com.discord.chat.presentation.message.viewholder.UploadProgressViewHolder
import com.discord.chat.presentation.message.viewholder.VoiceInviteEmbedViewHolder
import com.discord.chat.presentation.message.viewholder.WelcomeStickerViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentImageViewHolder
import com.discord.chat.presentation.message.viewholder.mosaicitem.attachments.MosaicItemMessageAttachmentVideoViewHolder
import com.discord.chat.presentation.root.ChatView
import com.discord.chat.presentation.stickers.WelcomeStickerView
import com.discord.chat.presentation.uploadprogress.UploadProgressView
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt
import com.discord.misc.utilities.view.ViewLocationUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionView
import com.discord.reactions.ReactionsView
import com.discord.recycler_view.utils.ItemDiffer
import com.discord.sticker.StickerView
import java.util.ArrayList
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function3
import kotlin.jvm.functions.Function4
import kotlin.jvm.functions.Function6
import kotlin.jvm.functions.Function8

public class MessageAccessoriesAdapter(measureAndLayout: () -> Unit = <unrepresentable>.INSTANCE) : RecyclerView.Adapter {
   private final val measureAndLayout: () -> Unit
   private final lateinit var eventHandler: ChatEventHandler
   private final var botComponentProvider: ComponentProvider?
   private final var recyclerViewPool: RecycledViewPool?
   private final var items: List<MessageAccessory>
   private final var messageId: MessageId?
   private final var channelId: ChannelId?
   private final var guildId: GuildId?
   private final lateinit var messageContentViewLifecycleListener: com.discord.chat.presentation.message.MessageAccessoriesAdapter.MessageContentViewLifecycleListener
   private final var onTapSpoiler: (MessagePartViewHolder) -> Unit

   fun MessageAccessoriesAdapter() {
      this(null, 1, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "measureAndLayout");
      super();
      this.measureAndLayout = var1;
      this.items = kotlin.collections.i.j();
      this.onTapSpoiler = new Function1(this) {
         final MessageAccessoriesAdapter this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(MessagePartViewHolder var1) {
            kotlin.jvm.internal.q.h(var1, "holder");
            this.this$0.notifyItemChanged(var1.getBindingAdapterPosition());
            MessageAccessoriesAdapter.access$getMeasureAndLayout$p(this.this$0).invoke();
         }
      };
      this.setHasStableIds(true);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.q.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var4, var3, null, null, 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.q.e(var0.messageId);
      var4.onTapReaction-u7_MRrM(var3, null, java.lang.Boolean.TRUE);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.q.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.q.e(var0.channelId);
      var4.onTapFollowForumPost-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$5`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var6: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var6 = null;
      }

      val var7: ChannelId = var0.channelId;
      kotlin.jvm.internal.q.e(var0.channelId);
      val var2: Long = var7.unbox-impl();
      val var5: GuildId = var0.guildId;
      kotlin.jvm.internal.q.e(var0.guildId);
      var6.onTapShareForumPost-mgk6anA(var2, var5.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$6`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.q.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var4, var3, null, null, 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$7`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.q.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.q.e(var0.channelId);
      var4.onTapReactionOverflow-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$9`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      if (var0.messageId != null) {
         var var3: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var3 = null;
         }

         var3.onTapDismissMediaPostSharePrompt-1xi1bu0(var0.messageId);
      }
   }

   private fun View.onMediaClicked(
      messageId: MessageId,
      type: String,
      viewResizeMode: ViewResizeMode,
      portal: Double?,
      attachmentIndex: Int,
      embedIndex: Int?,
      componentId: String?,
      componentMediaIndex: Int?
   ) {
      val var12: Point = ViewLocationUtilsKt.getLocationInWindow(var1);
      var var10: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var10 = null;
      }

      var10.onTapImage-JR3bP6M(var2, var6, var3, var1.getWidth(), var1.getHeight(), var12.x, var12.y, var4, var5, var7, var8, var9);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun clear() {
      this.items = kotlin.collections.i.j();
      this.messageId = null;
      this.channelId = null;
      this.guildId = null;
      this.notifyDataSetChanged();
   }

   public override fun getItemCount(): Int {
      return this.items.size();
   }

   public override fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public override fun getItemViewType(position: Int): Int {
      val var3: MessageAccessory = this.items.get(var1);
      val var2: Boolean = var3 is EmbedMessageAccessory;
      var var4: Int = 1;
      if (!var2) {
         if (var3 is GiftMessageAccessory) {
            var4 = 16;
         } else if (var3 is MessageContentAccessory) {
            var4 = 0;
         } else if (var3 is UploadProgressMessageAccessory) {
            var4 = 3;
         } else if (var3 is GuildInviteMessageAccessory) {
            var4 = 5;
         } else if (var3 is ActivityBookmarkMessageAccessory) {
            var4 = 30;
         } else if (var3 is ActivityInstanceEmbedMessageAccessory) {
            var4 = 40;
         } else if (var3 is EmbeddedActivityInviteMessageAccessory) {
            var4 = 31;
         } else if (var3 is GuildInviteDisabledMessageAccessory) {
            var4 = 25;
         } else if (var3 is GuildEventInviteMessageAccessory) {
            var4 = 15;
         } else if (var3 is ReactionsMessageAccessory) {
            var4 = 4;
         } else if (var3 is StickerMessageAccessory) {
            var4 = MessageAccessoriesAdapter.WhenMappings.$EnumSwitchMapping$0[(var3 as StickerMessageAccessory).getSticker().getFormatType().ordinal()];
            if (var4 != 1) {
               if (var4 != 2) {
                  if (var4 != 3) {
                     if (var4 != 4) {
                        throw new ch.p();
                     }

                     var4 = 27;
                  } else {
                     var4 = 8;
                  }
               } else {
                  var4 = 7;
               }
            } else {
               var4 = 6;
            }
         } else if (var3 is ThreadEmbedMessageAccessory) {
            var4 = 9;
         } else if (var3 is FileAttachmentMessageAccessory) {
            var4 = 11;
         } else if (var3 is MessageComponentsAccessory) {
            var4 = 12;
         } else if (var3 is TimestampMessageAccessory) {
            var4 = 13;
         } else if (var3 is WelcomeStickerAccessory) {
            var4 = 14;
         } else if (var3 is ActivityInviteEmbedMessageAccessory) {
            var4 = 17;
         } else if (var3 is EphemeralIndicationMessageAccessory) {
            var4 = 18;
         } else if (var3 is SurveyIndicationMessageAccessory) {
            var4 = 24;
         } else if (var3 is InteractionStatusMessageAccessory) {
            var4 = 19;
         } else if (var3 is ForumPostActionBar) {
            var4 = 20;
         } else if (var3 is FlaggedMessageEmbedAccessory) {
            var4 = 21;
         } else if (var3 is FlaggedMessageActionBarAccessory) {
            var4 = 22;
         } else if (var3 is AutoModerationNotificationEmbedAccessory) {
            var4 = 33;
         } else if (var3 is RoleSubscriptionPurchaseAccessory) {
            var4 = 23;
         } else if (var3 is MediaMosaicAttachmentMessageAccessory) {
            var4 = 26;
         } else if (var3 is InviteToSpeakAccessory) {
            var4 = 28;
         } else if (var3 is AudioAttachmentMessageAccessory) {
            var4 = 29;
         } else if (var3 is PostPreviewEmbedMessageAccessory) {
            var4 = 32;
         } else if (var3 is ChannelPromptActionsAccessory) {
            var4 = 34;
         } else if (var3 is InfoLinkMessageAccessory) {
            var4 = 35;
         } else if (var3 is SafetyPolicyNoticeMessageAccessory) {
            var4 = 36;
         } else if (var3 is SafetySystemNotificationMessageAccessory) {
            var4 = 39;
         } else if (var3 is PollMessageAccessory) {
            var4 = MessageAccessoriesAdapter.WhenMappings.$EnumSwitchMapping$1[(var3 as PollMessageAccessory).getData().getLayoutType().ordinal()];
            if (var4 == 1) {
               throw new IllegalStateException("UNKNOWN Layouts should not be presented".toString());
            }

            if (var4 != 2) {
               if (var4 != 3) {
                  throw new ch.p();
               }

               var4 = 38;
            } else {
               var4 = 37;
            }
         } else if (var3 is CtaButtonMessageAccessory) {
            var4 = 41;
         } else if (var3 is VoiceInviteMessageAccessory) {
            var4 = 42;
         } else if (var3 is ForwardHeaderMessageAccessory) {
            var4 = 43;
         } else {
            if (var3 !is ForwardBreadcrumbMessageAccessory) {
               if (var3 !is ImageAttachmentMessageAccessory) {
                  if (var3 is VideoAttachmentMessageAccessory) {
                     throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
                  }

                  throw new ch.p();
               }

               throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
            }

            var4 = 44;
         }
      }

      return var4;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      kotlin.jvm.internal.q.h(var1, "holder");
      var var8: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var8 = null;
      }

      val var48: Function6 = var8.getOnMessageLongPressed();
      val var49: Function4;
      if (var48 != null) {
         var49 = new Function4(var48, this) {
            final Function6 $onLongClick;
            final MessageAccessoriesAdapter this$0;

            {
               super(4);
               this.$onLongClick = var1;
               this.this$0 = var2;
            }

            public final void invoke(MediaType var1, Integer var2, java.lang.String var3, Integer var4) {
               kotlin.jvm.internal.q.h(var1, "mediaType");
               val var6: Function6 = this.$onLongClick;
               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.q.e(var5);
               val var8: MessageId;
               if (var5 != null) {
                  var8 = MessageId.box-impl(var5);
               } else {
                  var8 = null;
               }

               val var7: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
               kotlin.jvm.internal.q.e(var7);
               var6.invoke(var8, var7, var2, var1, var3, var4);
            }
         };
      } else {
         var49 = null;
      }

      val var10: MessageAccessory = this.items.get(var2);
      if (var10 is EmbedMessageAccessory) {
         val var11: EmbedViewHolder = var1 as EmbedViewHolder;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         var2 = var1.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
         val var13: EmbedMessageAccessory = var10 as EmbedMessageAccessory;
         val var5: Int = (var10 as EmbedMessageAccessory).getRadiusPx();
         val var12: OnLongClickListener = (var10 as EmbedMessageAccessory).getOnLongClick();
         val var91: SpoilerAttributes = var13.getSpoilerAttributes();
         val var92: SpoilerConfig;
         if (var91 != null) {
            var92 = var91.configure(new Function0(this, var1) {
               final MessagePartViewHolder $holder;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$holder = var2;
               }

               public final void invoke() {
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
               }
            });
         } else {
            var92 = null;
         }

         var11.bind(var8, var13, var2, var5, new Function0(this, var1) {
            final MessagePartViewHolder $holder;
            final MessageAccessoriesAdapter this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$holder = var2;
            }

            public final void invoke() {
               MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
            }
         }, var92, new Function2(var1, var10, this) {
            final MessagePartViewHolder $holder;
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(2);
               this.$holder = var1;
               this.$part = var2;
               this.this$0 = var3;
            }

            public final void invoke(java.lang.Double var1, Integer var2) {
               val var4: View = this.$holder.itemView;
               val var5: java.lang.String = this.$part.getMessageId-3Eiw7ao();
               val var3: Int = (this.$part as EmbedMessageAccessory).getIndex();
               val var6: ViewResizeMode = ViewResizeMode.Fill;
               val var7: MessageAccessoriesAdapter = this.this$0;
               kotlin.jvm.internal.q.e(var4);
               MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(var7, var4, var5, "embed", var6, var1, var3, var2, null, null);
            }
         }, var12, var13.getPortal());
      } else if (var10 is InfoLinkMessageAccessory) {
         (var1 as InfoLinkViewHolder)
            .bind(
               (var10 as InfoLinkMessageAccessory).getText(),
               (var10 as InfoLinkMessageAccessory).getIcon(),
               new Function0(this, var10) {
                  final MessageAccessory $part;
                  final MessageAccessoriesAdapter this$0;

                  {
                     super(0);
                     this.this$0 = var1;
                     this.$part = var2;
                  }

                  public final void invoke() {
                     val var2: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                     var var1: ChatEventHandler = var2;
                     if (var2 == null) {
                        kotlin.jvm.internal.q.y("eventHandler");
                        var1 = null;
                     }

                     var1.onTapObscuredMediaLearnMore-8a0ehIg(
                        this.$part.getMessageId-3Eiw7ao(),
                        (this.$part as InfoLinkMessageAccessory).getChannelId-o4g7jtM(),
                        (this.$part as InfoLinkMessageAccessory).getAttachmentId(),
                        (this.$part as InfoLinkMessageAccessory).getEmbedId()
                     );
                  }
               }
            );
      } else if (var10 is GiftMessageAccessory) {
         val var52: GiftViewHolder = var1 as GiftViewHolder;
         val var93: GiftMessageAccessory = var10 as GiftMessageAccessory;
         var var24: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var24 = null;
         }

         var52.bind(var93, new Function1(var24) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapGiftCodeEmbed", "onTapGiftCodeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapGiftCodeEmbed(var1);
            }
         }, new Function1(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "giftCode");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var2 = null;
               }

               var2.onTapGiftCodeAccept-NU4t8f8(var1, this.$part.getMessageId-3Eiw7ao());
            }
         });
      } else if (var10 is MessageContentAccessory) {
         val var142: MessageContentViewHolder = var1 as MessageContentViewHolder;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var152: Function2 = new Function2(var8) {
            {
               super(
                  2,
                  var1,
                  ChatEventHandler::class.java,
                  "onLinkClicked",
                  "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                  0
               );
            }

            public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var158: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var14: Function3 = new Function3(var8) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var15: Function4 = new Function4(var8) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressChannel",
                  "onLongPressChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var16: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var17: Function2 = new Function2(var8) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var18: Function4 = new Function4(var8) {
            {
               super(
                  4,
                  var1,
                  ChatEventHandler::class.java,
                  "onTapMention",
                  "onTapMention(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
                  0
               );
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var2, "p1");
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var19: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var20: Function1 = new Function1(var8) {
            {
               super(
                  1,
                  var1,
                  ChatEventHandler::class.java,
                  "onLongPressCommand",
                  "onLongPressCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V",
                  0
               );
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var21: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var22: Function1 = new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         var142.bind(var10 as MessageContentAccessory, var152, var158, var14, var15, var16, var17, var18, var19, var20, new Function0(this, var1) {
            final MessagePartViewHolder $holder;
            final MessageAccessoriesAdapter this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$holder = var2;
            }

            public final void invoke() {
               MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
            }
         }, var21, var22, new Function1(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         });
      } else if (var10 is MediaMosaicAttachmentMessageAccessory) {
         val var143: AttachmentMediaMosaicViewHolder = var1 as AttachmentMediaMosaicViewHolder;
         var var106: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var106 = null;
         }

         val var159: MediaMosaicAttachmentMessageAccessory = var10 as MediaMosaicAttachmentMessageAccessory;
         val var161: java.util.List = (var10 as MediaMosaicAttachmentMessageAccessory).getAttachments();
         val var153: Function3 = new Function3(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(3);
               this.this$0 = var1;
            }

            public final void invoke(int var1, MessageAccessory var2, MessagePartViewHolder var3) {
               kotlin.jvm.internal.q.h(var2, "attachment");
               kotlin.jvm.internal.q.h(var3, "attachmentViewHolder");
               val var8: View = var3.itemView;
               val var4: java.lang.String = var2.getMessageId-3Eiw7ao();
               val var7: java.lang.Double;
               if (var2 is ImageAttachmentMessageAccessory) {
                  var7 = null;
               } else {
                  if (var2 !is VideoAttachmentMessageAccessory) {
                     val var9: StringBuilder = new StringBuilder();
                     var9.append("Unsupported accessory: ");
                     var9.append(var2);
                     throw new IllegalStateException(var9.toString().toString());
                  }

                  var7 = (var2 as VideoAttachmentMessageAccessory).getPortal();
               }

               val var6: ViewResizeMode = ViewResizeMode.Cover;
               val var5: MessageAccessoriesAdapter = this.this$0;
               kotlin.jvm.internal.q.e(var8);
               MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(var5, var8, var4, "attachment", var6, var7, var1, null, null, null);
            }
         };
         val var66: Function1;
         if (var49 != null) {
            var66 = new Function1(var49) {
               final Function4 $onLongClick;

               {
                  super(1);
                  this.$onLongClick = var1;
               }

               public final void invoke(int var1) {
                  this.$onLongClick.invoke(MediaType.Attachment, var1, null, null);
               }
            };
         } else {
            var66 = null;
         }

         var143.bind(
            var106,
            var161,
            var153,
            var66,
            new Function0(this, var1) {
               final MessagePartViewHolder $holder;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$holder = var2;
               }

               public final void invoke() {
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
               }
            },
            new Function0(this, var10) {
               final MessageAccessory $part;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$part = var2;
               }

               public final void invoke() {
                  val var4: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                  var var3: ChatEventHandler = var4;
                  if (var4 == null) {
                     kotlin.jvm.internal.q.y("eventHandler");
                     var3 = null;
                  }

                  val var1: Long = (this.$part as MediaMosaicAttachmentMessageAccessory).getChannelId-o4g7jtM();
                  val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
                  kotlin.jvm.internal.q.e(var5);
                  var3.onTapInlineForward-JjTCmh4(var1, var5, "media", null);
               }
            },
            var159.isShowingInlineForward(),
            var159.isForwardedContent(),
            var159.getMessageState(),
            var159.getShouldAutoPlayGif(),
            var159.getUseOldForwardIcon(),
            var159.getConstrainedWidth()
         );
      } else if (var10 is UploadProgressMessageAccessory) {
         val var107: UploadProgressViewHolder = var1 as UploadProgressViewHolder;
         val var126: UploadProgress = (var10 as UploadProgressMessageAccessory).getUploadProgress();
         var var25: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var25 = null;
         }

         var107.bind(var126, var25);
      } else if (var10 is ReactionsMessageAccessory) {
         (var1 as ReactionsViewHolder)
            .bind-JJXpD5M(
               var10.getMessageId-3Eiw7ao(),
               (var10 as ReactionsMessageAccessory).getReactions(),
               (var10 as ReactionsMessageAccessory).getCanAddNewReactions(),
               (var10 as ReactionsMessageAccessory).getCanAddNewBurstReactions(),
               (var10 as ReactionsMessageAccessory).getAddReactionLabel(),
               (var10 as ReactionsMessageAccessory).getAddNewReactionAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getAddNewBurstReactionAccessibilityLabel(),
               (var10 as ReactionsMessageAccessory).getReactionsTheme(),
               new d(this),
               new e(this),
               new Function1(this) {
                  final MessageAccessoriesAdapter this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(ReactionView.Reaction var1) {
                     kotlin.jvm.internal.q.h(var1, "reaction");
                     val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                     var var2: ChatEventHandler = var3;
                     if (var3 == null) {
                        kotlin.jvm.internal.q.y("eventHandler");
                        var2 = null;
                     }

                     val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
                     kotlin.jvm.internal.q.e(var4);
                     ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var2, var4, var1, null, 4, null);
                  }
               },
               new Function1(this) {
                  final MessageAccessoriesAdapter this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(ReactionView.Reaction var1) {
                     kotlin.jvm.internal.q.h(var1, "reaction");
                     val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                     var var2: ChatEventHandler = var3;
                     if (var3 == null) {
                        kotlin.jvm.internal.q.y("eventHandler");
                        var2 = null;
                     }

                     val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
                     kotlin.jvm.internal.q.e(var4);
                     val var5: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
                     kotlin.jvm.internal.q.e(var5);
                     var2.onLongPressReaction-Eqy5D80(var4, var5.unbox-impl(), var1);
                  }
               },
               (var10 as ReactionsMessageAccessory).getTheme()
            );
      } else if (var10 is StickerMessageAccessory) {
         (var1 as StickerPartViewHolder).bind((var10 as StickerMessageAccessory).getSticker(), new Function1(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(Sticker var1) {
               kotlin.jvm.internal.q.h(var1, "it");
               val var2: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var2;
               if (var2 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var3 = null;
               }

               var3.onStickerClicked-Ayv7vGE((this.$part as StickerMessageAccessory).getSticker(), this.$part.getMessageId-3Eiw7ao());
            }
         }, new Function1(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(Sticker var1) {
               kotlin.jvm.internal.q.h(var1, "it");
               val var2: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var2;
               if (var2 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var3 = null;
               }

               var3.onStickerLongClicked-Ayv7vGE((this.$part as StickerMessageAccessory).getSticker(), this.$part.getMessageId-3Eiw7ao());
            }
         }, 160, 160);
      } else if (var10 is GuildInviteMessageAccessory) {
         (var1 as GuildInviteViewHolder).bind(var10 as GuildInviteMessageAccessory);
      } else if (var10 is ActivityBookmarkMessageAccessory) {
         (var1 as ActivityBookmarkViewHolder).bind(var10 as ActivityBookmarkMessageAccessory);
      } else if (var10 is ActivityInstanceEmbedMessageAccessory) {
         (var1 as ActivityInstanceEmbedViewHolder).bind(var10 as ActivityInstanceEmbedMessageAccessory);
      } else if (var10 is EmbeddedActivityInviteMessageAccessory) {
         (var1 as EmbeddedActivityInviteViewHolder).bind(var10 as EmbeddedActivityInviteMessageAccessory);
      } else if (var10 is GuildInviteDisabledMessageAccessory) {
         (var1 as GuildInviteDisabledViewHolder).bind(var10 as GuildInviteDisabledMessageAccessory);
      } else if (var10 is GuildEventInviteMessageAccessory) {
         (var1 as GuildEventInviteViewHolder).bind(var10 as GuildEventInviteMessageAccessory);
      } else if (var10 is ThreadEmbedMessageAccessory) {
         val var109: ThreadEmbedViewHolder = var1 as ThreadEmbedViewHolder;
         val var127: ThreadEmbedMessageAccessory = var10 as ThreadEmbedMessageAccessory;
         var var27: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var27 = null;
         }

         var109.bind(var127, new Function1(var27) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapThreadEmbed-1xi1bu0(var1);
            }
         });
      } else if (var10 is ForumPostActionBar) {
         val var110: ForumPostActionBarViewHolder = var1 as ForumPostActionBarViewHolder;
         val var166: ForumPostActionBar = var10 as ForumPostActionBar;
         val var162: ReactionsTheme = (var10 as ForumPostActionBar).getReactionsTheme();
         val var163: f = new f(this);
         val var165: g = new g(this);
         val var128: h = new h(this);
         val var154: i = new i(this);
         val var164: Function1 = new Function1(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(ReactionView.Reaction var1) {
               kotlin.jvm.internal.q.h(var1, "reaction");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var2 = null;
               }

               val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.q.e(var4);
               ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var2, var4, var1, null, 4, null);
            }
         };
         val var144: Function1 = new Function1(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(ReactionView.Reaction var1) {
               kotlin.jvm.internal.q.h(var1, "reaction");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var2 = null;
               }

               val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.q.e(var4);
               val var5: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
               kotlin.jvm.internal.q.e(var5);
               var2.onLongPressReaction-Eqy5D80(var4, var5.unbox-impl(), var1);
            }
         };
         val var160: j = new j(this);
         var var28: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var28 = null;
         }

         var110.bind(
            var166,
            var162,
            var163,
            var165,
            var128,
            var154,
            var164,
            var144,
            var160,
            new Function2(var28) {
               {
                  super(
                     2,
                     var1,
                     ChatEventHandler::class.java,
                     "onLinkClicked",
                     "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                     0
                  );
               }

               public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  kotlin.jvm.internal.q.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
               }
            }
         );
      } else if (var10 is FileAttachmentMessageAccessory) {
         val var71: FileAttachmentViewHolder = var1 as FileAttachmentViewHolder;
         val var129: FileAttachmentMessageAccessory = var10 as FileAttachmentMessageAccessory;
         val var111: Function2 = new Function2(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.q.h(var1, "url");
               kotlin.jvm.internal.q.h(var2, "filename");
               val var4: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var4;
               if (var4 == null) {
                  kotlin.jvm.internal.q.y("eventHandler");
                  var3 = null;
               }

               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.q.e(var5);
               var3.onLinkClicked-u7_MRrM(var5, var1, var2);
            }
         };
         val var145: SpoilerAttributes = var129.getSpoilerAttributes();
         val var29: SpoilerConfig;
         if (var145 != null) {
            var29 = var145.configure(new Function0(this, var1) {
               final MessagePartViewHolder $holder;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$holder = var2;
               }

               public final void invoke() {
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
               }
            });
         } else {
            var29 = null;
         }

         var71.bind(var129, var111, var29);
      } else if (var10 is MessageComponentsAccessory) {
         val var146: MessageComponentsViewHolder = var1 as MessageComponentsViewHolder;
         var var112: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var112 = null;
         }

         val var72: Function2;
         if (var49 != null) {
            var72 = new Function2(var49) {
               final Function4 $onLongClicked;

               {
                  super(2);
                  this.$onLongClicked = var1;
               }

               public final void invoke(java.lang.String var1, Integer var2) {
                  kotlin.jvm.internal.q.h(var1, "componentId");
                  this.$onLongClicked.invoke(MediaType.Component, null, var1, var2);
               }
            };
         } else {
            var72 = null;
         }

         var146.bind(
            var10 as MessageComponentsAccessory,
            this.botComponentProvider,
            new Function4(var10, this) {
               final MessageAccessory $part;
               final MessageAccessoriesAdapter this$0;

               {
                  super(4);
                  this.$part = var1;
                  this.this$0 = var2;
               }

               public final void invoke(View var1, java.lang.String var2, Integer var3, java.lang.Double var4) {
                  kotlin.jvm.internal.q.h(var1, "view");
                  kotlin.jvm.internal.q.h(var2, "componentId");
                  MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(
                     this.this$0, var1, this.$part.getMessageId-3Eiw7ao(), "component", ViewResizeMode.Fill, var4, 0, null, var2, var3
                  );
               }
            },
            var72,
            new Function0(this, var1) {
               final MessagePartViewHolder $holder;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$holder = var2;
               }

               public final void invoke() {
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
               }
            },
            var112
         );
      } else if (var10 is FlaggedMessageEmbedAccessory) {
         (var1 as FlaggedMessageEmbedViewHolder).bind(var10 as FlaggedMessageEmbedAccessory);
      } else if (var10 is FlaggedMessageActionBarAccessory) {
         val var113: FlaggedMessageActionBarViewHolder = var1 as FlaggedMessageActionBarViewHolder;
         val var130: FlaggedMessageActionBarAccessory = var10 as FlaggedMessageActionBarAccessory;
         var var30: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var30 = null;
         }

         val var147: Function2 = new Function2(var30) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var31: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var31 = null;
         }

         var113.bind(var130, var147, new Function2(var31) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is AutoModerationNotificationEmbedAccessory) {
         val var114: AutoModerationNotificationEmbedViewHolder = var1 as AutoModerationNotificationEmbedViewHolder;
         val var131: AutoModerationNotificationEmbedAccessory = var10 as AutoModerationNotificationEmbedAccessory;
         var var32: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var32 = null;
         }

         val var148: Function2 = new Function2(var32) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var33: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var33 = null;
         }

         var114.bind(var131, var148, new Function2(var33) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is TimestampMessageAccessory) {
         (var1 as TimestampViewHolder).bind(var10 as TimestampMessageAccessory);
      } else if (var10 is WelcomeStickerAccessory) {
         (var1 as WelcomeStickerViewHolder).bind(var10 as WelcomeStickerAccessory);
      } else if (var10 is ActivityInviteEmbedMessageAccessory) {
         val var115: ActivityInviteEmbedViewHolder = var1 as ActivityInviteEmbedViewHolder;
         val var132: ActivityInviteEmbedMessageAccessory = var10 as ActivityInviteEmbedMessageAccessory;
         var var34: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var34 = null;
         }

         var115.bind(var132, new Function1(var34) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapJoinActivity", "onTapJoinActivity-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapJoinActivity-1xi1bu0(var1);
            }
         });
      } else if (var10 is EphemeralIndicationMessageAccessory) {
         (var1 as EphemeralIndicationViewHolder).bind(var10 as EphemeralIndicationMessageAccessory);
      } else if (var10 is SurveyIndicationMessageAccessory) {
         (var1 as SurveyIndicationViewHolder).bind(var10 as SurveyIndicationMessageAccessory);
      } else if (var10 is InteractionStatusMessageAccessory) {
         (var1 as InteractionStatusViewHolder).bind(var10 as InteractionStatusMessageAccessory);
      } else if (var10 is RoleSubscriptionPurchaseAccessory) {
         (var1 as RoleSubscriptionPurchaseViewHolder)
            .bind(
               var10 as RoleSubscriptionPurchaseAccessory,
               MessageAccessoriesView.Companion
                  .getWidth(
                     (var10 as RoleSubscriptionPurchaseAccessory).getConstrainedWidth(),
                     (var10 as RoleSubscriptionPurchaseAccessory).isForwardedContent(),
                     false
                  )
            );
      } else if (var10 is InviteToSpeakAccessory) {
         (var1 as InviteToSpeakViewHolder).bind(var10 as InviteToSpeakAccessory);
      } else if (var10 is AudioAttachmentMessageAccessory) {
         val var149: AudioPlayerViewHolder = var1 as AudioPlayerViewHolder;
         val var133: AudioAttachmentMessageAccessory = var10 as AudioAttachmentMessageAccessory;
         var var36: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var36 = null;
         }

         val var79: Function2;
         if (var49 != null) {
            var79 = new Function2(var49) {
               final Function4 $onLongClicked;

               {
                  super(2);
                  this.$onLongClicked = var1;
               }

               public final void invoke(java.lang.String var1, Integer var2) {
                  kotlin.jvm.internal.q.h(var1, "componentId");
                  this.$onLongClicked.invoke(MediaType.Attachment, null, var1, var2);
               }
            };
         } else {
            var79 = null;
         }

         var149.bind(var133, var36, var79);
      } else if (var10 is PostPreviewEmbedMessageAccessory) {
         val var150: PostPreviewEmbedViewHolder = var1 as PostPreviewEmbedViewHolder;
         val var156: PostPreviewEmbedMessageAccessory = var10 as PostPreviewEmbedMessageAccessory;
         val var134: PostPreviewEmbed = (var10 as PostPreviewEmbedMessageAccessory).getPostPreviewEmbed();
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var8 = null;
         }

         val var81: Function4 = new Function4(var8) {
            {
               super(4, var1, ChatEventHandler::class.java, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
            }

            public final void invoke_kUTrp_s/* $VF was: invoke-kUTrp-s*/(long var1, long var3, long var5, java.lang.String var7) {
               kotlin.jvm.internal.q.h(var7, "p3");
               (super.receiver as ChatEventHandler).onTapPostPreviewEmbed-kUTrp-s(var1, var3, var5, var7);
            }
         };
         val var118: SpoilerAttributes = var156.getSpoilerAttributes();
         val var37: SpoilerConfig;
         if (var118 != null) {
            var37 = var118.configure(new Function0(this, var1) {
               final MessagePartViewHolder $holder;
               final MessageAccessoriesAdapter this$0;

               {
                  super(0);
                  this.this$0 = var1;
                  this.$holder = var2;
               }

               public final void invoke() {
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(this.$holder);
               }
            });
         } else {
            var37 = null;
         }

         var150.bind(var134, var81, var37);
      } else if (var10 is ChannelPromptActionsAccessory) {
         val var119: ChannelPromptActionsViewHolder = var1 as ChannelPromptActionsViewHolder;
         val var135: ChannelPromptActionsAccessory = var10 as ChannelPromptActionsAccessory;
         var var38: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var38 = null;
         }

         var119.bind(
            var135,
            new Function3(var38) {
               {
                  super(
                     3,
                     var1,
                     ChatEventHandler::class.java,
                     "onTapChannelPromptButton",
                     "onTapChannelPromptButton-Eqy5D80(Ljava/lang/String;JLjava/lang/String;)V",
                     0
                  );
               }

               public final void invoke_Eqy5D80/* $VF was: invoke-Eqy5D80*/(java.lang.String var1, long var2, java.lang.String var4) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  kotlin.jvm.internal.q.h(var4, "p2");
                  (super.receiver as ChatEventHandler).onTapChannelPromptButton-Eqy5D80(var1, var2, var4);
               }
            }
         );
      } else if (var10 is SafetyPolicyNoticeMessageAccessory) {
         val var120: SafetyPolicyNoticeViewHolder = var1 as SafetyPolicyNoticeViewHolder;
         val var136: SafetyPolicyNoticeMessageAccessory = var10 as SafetyPolicyNoticeMessageAccessory;
         var var39: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var39 = null;
         }

         var120.bind(var136, new Function1(var39) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSafetyPolicyNoticeEmbed", "onTapSafetyPolicyNoticeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSafetyPolicyNoticeEmbed(var1);
            }
         });
      } else if (var10 is SafetySystemNotificationMessageAccessory) {
         val var121: SafetySystemNotificationViewHolder = var1 as SafetySystemNotificationViewHolder;
         val var137: SafetySystemNotificationEmbed = (var10 as SafetySystemNotificationMessageAccessory).getSafetySystemNotificationEmbed();
         var var40: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var40 = null;
         }

         var121.bind(
            var137,
            new Function2(var40) {
               {
                  super(
                     2,
                     var1,
                     ChatEventHandler::class.java,
                     "onTapSafetySystemNotificationCta",
                     "onTapSafetySystemNotificationCta(Ljava/lang/String;Ljava/lang/String;)V",
                     0
                  );
               }

               public final void invoke(java.lang.String var1, java.lang.String var2) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  kotlin.jvm.internal.q.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onTapSafetySystemNotificationCta(var1, var2);
               }
            }
         );
      } else if (var10 is PollMessageAccessory) {
         val var122: PollViewHolder = var1 as PollViewHolder;
         val var138: PollMessageAccessory = var10 as PollMessageAccessory;
         var var41: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var41 = null;
         }

         val var151: Function3 = new Function3(var41) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var3, "p1");
               kotlin.jvm.internal.q.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAnswer-sekaTiM(var1, var3, var4);
            }
         };
         var var42: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var42 = null;
         }

         val var157: Function3 = new Function3(var42) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAction", "onTapPollAction-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var3, "p1");
               kotlin.jvm.internal.q.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAction-sekaTiM(var1, var3, var4);
            }
         };
         var var43: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var43 = null;
         }

         var122.bind(
            var138,
            var151,
            var157,
            new Function8(var43) {
               {
                  super(
                     8,
                     var1,
                     ChatEventHandler::class.java,
                     "onLongPressPollImage",
                     "onLongPressPollImage-YVExdug(JLjava/lang/String;Ljava/lang/String;IIIILcom/discord/chat/reactevents/ViewResizeMode;)V",
                     0
                  );
               }

               public final void invoke_YVExdug/* $VF was: invoke-YVExdug*/(
                  long var1, java.lang.String var3, java.lang.String var4, int var5, int var6, int var7, int var8, ViewResizeMode var9
               ) {
                  kotlin.jvm.internal.q.h(var3, "p1");
                  kotlin.jvm.internal.q.h(var4, "p2");
                  kotlin.jvm.internal.q.h(var9, "p7");
                  (super.receiver as ChatEventHandler).onLongPressPollImage-YVExdug(var1, var3, var4, var5, var6, var7, var8, var9);
               }
            }
         );
      } else if (var10 is CtaButtonMessageAccessory) {
         val var88: CtaButtonViewHolder = var1 as CtaButtonViewHolder;
         val var6: Long = (var10 as CtaButtonMessageAccessory).getChannelId-o4g7jtM();
         val var123: java.lang.String = var10.getMessageId-3Eiw7ao();
         val var139: CtaButton = (var10 as CtaButtonMessageAccessory).getCtaButton();
         var var44: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var44 = null;
         }

         var88.bind-JjTCmh4(var6, var123, var139, new Function3(var44) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapCtaButton", "onTapCtaButton-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var3, "p1");
               kotlin.jvm.internal.q.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapCtaButton-sekaTiM(var1, var3, var4);
            }
         });
      } else if (var10 is VoiceInviteMessageAccessory) {
         val var124: VoiceInviteEmbedViewHolder = var1 as VoiceInviteEmbedViewHolder;
         val var140: VoiceInviteEmbed = (var10 as VoiceInviteMessageAccessory).getEmbed();
         var var45: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var45 = null;
         }

         var124.bind(var140, new Function3(var45) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         });
      } else if (var10 is ForwardHeaderMessageAccessory) {
         (var1 as ForwardHeaderViewHolder).bind((var10 as ForwardHeaderMessageAccessory).getUseOldIcon());
      } else {
         if (var10 !is ForwardBreadcrumbMessageAccessory) {
            if (var10 !is ImageAttachmentMessageAccessory) {
               if (var10 is VideoAttachmentMessageAccessory) {
                  throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
               }

               throw new ch.p();
            }

            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
         }

         val var125: ForwardBreadcrumbViewHolder = var1 as ForwardBreadcrumbViewHolder;
         val var141: ForwardBreadcrumbMessageAccessory = var10 as ForwardBreadcrumbMessageAccessory;
         var var46: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var46 = null;
         }

         var125.bind(var141, new Function3(var46) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapForwardFooter", "onTapForwardFooter-SHRpUJI(IJLjava/lang/String;)V", 0);
            }

            public final void invoke_SHRpUJI/* $VF was: invoke-SHRpUJI*/(int var1, long var2, java.lang.String var4) {
               kotlin.jvm.internal.q.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapForwardFooter-SHRpUJI(var1, var2, var4);
            }
         });
      }

      ForceExhaustiveKt.forceExhaustive(Unit.a);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      kotlin.jvm.internal.q.h(var1, "parent");
      var var17: Any;
      switch (var2) {
         case 0:
            val var76: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var76, "getContext(...)");
            var17 = new MessageContentViewHolder(new MessageContentView(var76, null, 0, 6, null));
            break;
         case 1:
            val var75: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var75, "getContext(...)");
            var17 = new EmbedViewHolder(new EmbedView(var75, null, 2, null));
            break;
         case 2:
         case 10:
         case 45:
         case 46:
         case 47:
         case 48:
         default:
            val var74: StringBuilder = new StringBuilder();
            var74.append("Unknown view type: ");
            var74.append(var2);
            throw new IllegalArgumentException(var74.toString());
         case 3:
            val var73: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var73, "getContext(...)");
            var17 = new UploadProgressViewHolder(new UploadProgressView(var73, null, 2, null));
            break;
         case 4:
            var var71: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var71, "getContext(...)");
            val var91: ReactionsView = new ReactionsView(var71, null, 2, null);
            var71 = this.recyclerViewPool;
            if (this.recyclerViewPool == null) {
               var71 = new AccessoriesViewPool();
            }

            var17 = new ReactionsViewHolder(var91, var71);
            break;
         case 5:
            val var69: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var69, "getContext(...)");
            val var90: GuildInviteView = new GuildInviteView(var69, null, 0, 6, null);
            var var70: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var70 = null;
            }

            var17 = new GuildInviteViewHolder(var90, var70);
            break;
         case 6:
            val var68: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var68, "getContext(...)");
            var17 = new StickerPngViewHolder(new StickerView(var68, null, 0, 6, null));
            break;
         case 7:
            val var67: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var67, "getContext(...)");
            var17 = new StickerApngViewHolder(new StickerView(var67, null, 0, 6, null));
            break;
         case 8:
            val var66: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var66, "getContext(...)");
            var17 = new StickerLottieViewHolder(new StickerView(var66, null, 0, 6, null));
            break;
         case 9:
            val var65: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var65, "getContext(...)");
            var17 = new ThreadEmbedViewHolder(new ThreadEmbedView(var65, null, 0, 6, null));
            break;
         case 11:
            val var63: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var63, "getContext(...)");
            val var88: FileAttachmentView = new FileAttachmentView(var63, null, 2, null);
            var var64: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var64 = null;
            }

            var17 = new FileAttachmentViewHolder(var88, var64);
            break;
         case 12:
            val var61: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var61, "getContext(...)");
            val var87: MessageComponentsView = new MessageComponentsView(var61, null, 0, 6, null);
            var var62: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var62 = null;
            }

            var17 = new MessageComponentsViewHolder(var87, var62);
            break;
         case 13:
            val var60: TextView = TimestampViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false).getRoot();
            kotlin.jvm.internal.q.g(var60, "getRoot(...)");
            var17 = new TimestampViewHolder(var60);
            break;
         case 14:
            val var58: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var58, "getContext(...)");
            val var86: WelcomeStickerView = new WelcomeStickerView(var58, null, 2, null);
            var var59: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var59 = null;
            }

            var17 = new WelcomeStickerViewHolder(
               var86,
               new Function2(var59) {
                  {
                     super(
                        2,
                        var1,
                        ChatEventHandler::class.java,
                        "onWelcomeReplyClicked",
                        "onWelcomeReplyClicked-Ayv7vGE(Lcom/discord/chat/bridge/sticker/Sticker;Ljava/lang/String;)V",
                        0
                     );
                  }

                  public final void invoke_Ayv7vGE/* $VF was: invoke-Ayv7vGE*/(Sticker var1, java.lang.String var2) {
                     kotlin.jvm.internal.q.h(var1, "p0");
                     kotlin.jvm.internal.q.h(var2, "p1");
                     (super.receiver as ChatEventHandler).onWelcomeReplyClicked-Ayv7vGE(var1, var2);
                  }
               }
            );
            break;
         case 15:
            val var56: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var56, "getContext(...)");
            val var85: GuildEventInviteView = new GuildEventInviteView(var56, null, 0, 6, null);
            var var57: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var57 = null;
            }

            var17 = new GuildEventInviteViewHolder(var85, var57, new Function1(this) {
               final MessageAccessoriesAdapter this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(MessagePartViewHolder var1) {
                  kotlin.jvm.internal.q.h(var1, "holder");
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(var1);
               }
            });
            break;
         case 16:
            val var55: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var55, "getContext(...)");
            var17 = new GiftViewHolder(new GiftView(var55, null, 2, null));
            break;
         case 17:
            val var54: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var54, "getContext(...)");
            var17 = new ActivityInviteEmbedViewHolder(new ActivityInviteEmbedView(var54, null, 0, 6, null));
            break;
         case 18:
            val var52: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var52, "getContext(...)");
            val var84: EphemeralIndicationView = new EphemeralIndicationView(var52, null, 0, 6, null);
            var var53: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var53 = null;
            }

            var17 = new EphemeralIndicationViewHolder(var84, var53);
            break;
         case 19:
            val var51: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var51, "getContext(...)");
            var17 = new InteractionStatusViewHolder(new InteractionStatusView(var51, null, 2, null));
            break;
         case 20:
            val var50: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var50, "getContext(...)");
            var17 = new ForumPostActionBarViewHolder(new ForumPostActionBarView(var50, null, 0, 6, null));
            break;
         case 21:
            val var48: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var48, "getContext(...)");
            val var83: FlaggedMessageEmbedView = new FlaggedMessageEmbedView(var48, null, 2, null);
            var var49: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var49 = null;
            }

            var17 = new FlaggedMessageEmbedViewHolder(var83, var49);
            break;
         case 22:
            val var47: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var47, "getContext(...)");
            var17 = new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(var47, null, 0, 6, null));
            break;
         case 23:
            val var46: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var46, "getContext(...)");
            var17 = new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(var46, null, 0, 6, null));
            break;
         case 24:
            val var44: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var44, "getContext(...)");
            val var82: SurveyIndicationView = new SurveyIndicationView(var44, null, 0, 6, null);
            var var45: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var45 = null;
            }

            var17 = new SurveyIndicationViewHolder(var82, var45);
            break;
         case 25:
            val var42: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var42, "getContext(...)");
            val var81: GuildInviteDisabledView = new GuildInviteDisabledView(var42, null, 0, 6, null);
            var var43: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var43 = null;
            }

            var17 = new GuildInviteDisabledViewHolder(var81, var43);
            break;
         case 26:
            val var41: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var41, "getContext(...)");
            var17 = new AttachmentMediaMosaicViewHolder(new AttachmentMediaMosaicContainerView(var41, null, 2, null));
            break;
         case 27:
            val var40: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var40, "getContext(...)");
            var17 = new StickerGifViewHolder(new StickerView(var40, null, 0, 6, null));
            break;
         case 28:
            val var38: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var38, "getContext(...)");
            val var80: InviteToSpeakView = new InviteToSpeakView(var38, null, 2, null);
            var var39: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var39 = null;
            }

            var17 = new InviteToSpeakViewHolder(var80, new Function1(var39) {
               {
                  super(1, var1, ChatEventHandler::class.java, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
               }

               public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                  kotlin.jvm.internal.q.h(var1, "p0");
                  (super.receiver as ChatEventHandler).onTapInviteToSpeak-1xi1bu0(var1);
               }
            });
            break;
         case 29:
            val var37: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var37, "getContext(...)");
            var17 = new AudioPlayerViewHolder(new AudioPlayerView(var37, null, 0, 6, null));
            break;
         case 30:
            val var35: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var35, "getContext(...)");
            val var79: ActivityBookmarkView = new ActivityBookmarkView(var35, null, 0, 6, null);
            var var36: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var36 = null;
            }

            var17 = new ActivityBookmarkViewHolder(var79, var36);
            break;
         case 31:
            val var33: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var33, "getContext(...)");
            val var78: EmbeddedActivityInviteView = new EmbeddedActivityInviteView(var33, null, 0, 6, null);
            var var34: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var34 = null;
            }

            var17 = new EmbeddedActivityInviteViewHolder(var78, var34);
            break;
         case 32:
            val var32: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var32, "getContext(...)");
            var17 = new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(var32, null, 0, 6, null));
            break;
         case 33:
            val var31: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var31, "getContext(...)");
            var17 = new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(var31, null, 2, null));
            break;
         case 34:
            val var30: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var30, "getContext(...)");
            var17 = new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(var30, null, 2, null));
            break;
         case 35:
            val var29: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var29, "getContext(...)");
            var17 = new InfoLinkViewHolder(new InfoLinkView(var29, null, 2, null));
            break;
         case 36:
            val var28: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var28, "getContext(...)");
            var17 = new SafetyPolicyNoticeViewHolder(new SafetyPolicyNoticeView(var28, null, 2, null));
            break;
         case 37:
            val var27: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var27, "getContext(...)");
            var17 = new PollViewHolder(new PollTextAndImageView(var27, null, 0, 6, null));
            break;
         case 38:
            val var26: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var26, "getContext(...)");
            var17 = new PollViewHolder(new PollImageOnlyView(var26, null, 0, 6, null));
            break;
         case 39:
            val var25: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var25, "getContext(...)");
            var17 = new SafetySystemNotificationViewHolder(new SafetySystemNotificationView(var25, null, 2, null));
            break;
         case 40:
            val var23: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var23, "getContext(...)");
            val var77: ActivityInstanceEmbedView = new ActivityInstanceEmbedView(var23, null, 0, 6, null);
            var var24: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.q.y("eventHandler");
               var24 = null;
            }

            var17 = new ActivityInstanceEmbedViewHolder(var77, var24);
            break;
         case 41:
            val var22: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var22, "getContext(...)");
            var17 = new CtaButtonViewHolder(new CtaButtonView(var22, null, 2, null));
            break;
         case 42:
            val var21: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var21, "getContext(...)");
            var17 = new VoiceInviteEmbedViewHolder(new VoiceInviteEmbedView(var21, null, 2, null));
            break;
         case 43:
            val var20: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var20, "getContext(...)");
            var17 = new ForwardHeaderViewHolder(new ForwardHeaderView(var20, null, 2, null));
            break;
         case 44:
            val var19: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var19, "getContext(...)");
            var17 = new ForwardBreadcrumbViewHolder(new ForwardBreadcrumbView(var19, null, 2, null));
            break;
         case 49:
            val var18: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var18, "getContext(...)");
            var17 = new MosaicItemMessageAttachmentImageViewHolder(new MediaImageView(var18, null, 2, null));
            break;
         case 50:
            val var16: Context = var1.getContext();
            kotlin.jvm.internal.q.g(var16, "getContext(...)");
            var17 = new MosaicItemMessageAttachmentVideoViewHolder(new MediaVideoView(var16, null, 2, null));
      }

      return (MessagePartViewHolder)var17;
   }

   public open fun onViewAttachedToWindow(holder: MessagePartViewHolder) {
      kotlin.jvm.internal.q.h(var1, "holder");
      super.onViewAttachedToWindow(var1);
      if (var1 is MessageContentViewHolder) {
         var var2: MessageAccessoriesAdapter.MessageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
         if (this.messageContentViewLifecycleListener == null) {
            kotlin.jvm.internal.q.y("messageContentViewLifecycleListener");
            var2 = null;
         }

         var2.onAttachedToWindow((var1 as MessageContentViewHolder).getMessageContentView());
      }
   }

   public open fun onViewDetachedFromWindow(holder: MessagePartViewHolder) {
      kotlin.jvm.internal.q.h(var1, "holder");
      super.onViewDetachedFromWindow(var1);
      if (var1 is MessageContentViewHolder) {
         var var3: MessageAccessoriesAdapter.MessageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
         if (this.messageContentViewLifecycleListener == null) {
            kotlin.jvm.internal.q.y("messageContentViewLifecycleListener");
            var3 = null;
         }

         var3.onDetachedFromWindow();
      }
   }

   public fun setComponentProvider(botComponentProvider: ComponentProvider?) {
      this.botComponentProvider = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setItems(messageId: MessageId, channelId: ChannelId, guildId: GuildId?, items: List<MessageAccessory>) {
      kotlin.jvm.internal.q.h(var1, "messageId");
      kotlin.jvm.internal.q.h(var5, "items");
      this.messageId = var1;
      this.channelId = ChannelId.box-impl(var2);
      this.guildId = var4;
      if (ChatView.Companion.getAreChatAnimationsEnabled()) {
         val var6: java.util.List = this.items;
         val var8: ArrayList = new ArrayList(var5);
         this.items = var8;
         val var7: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var6, var8), true);
         kotlin.jvm.internal.q.g(var7, "calculateDiff(...)");
         var7.c(this);
      } else {
         this.items = var5;
         this.notifyDataSetChanged();
      }
   }

   public fun setMessageContentViewLifecycleListener(
      listener: com.discord.chat.presentation.message.MessageAccessoriesAdapter.MessageContentViewLifecycleListener
   ) {
      kotlin.jvm.internal.q.h(var1, "listener");
      this.messageContentViewLifecycleListener = var1;
   }

   public fun setNestedAccessoriesRecycledViewPool(recyclerViewPool: RecycledViewPool?) {
      this.recyclerViewPool = var1;
   }

   public interface MessageContentViewLifecycleListener {
      public abstract fun onAttachedToWindow(messageContentView: MessageContentView) {
      }

      public abstract fun onDetachedFromWindow() {
      }
   }
}
