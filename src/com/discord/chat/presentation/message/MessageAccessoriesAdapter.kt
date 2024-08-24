package com.discord.chat.presentation.message

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Point
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
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
import com.discord.chat.presentation.message.viewholder.VoiceMessageViewHolder
import com.discord.chat.presentation.message.viewholder.WelcomeStickerViewHolder
import com.discord.chat.presentation.root.ChatView
import com.discord.chat.presentation.stickers.WelcomeStickerView
import com.discord.chat.presentation.uploadprogress.UploadProgressView
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.misc.utilities.kotlin.ForceExhaustiveKt
import com.discord.misc.utilities.view.ViewLocationUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.GuildId
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionsView
import com.discord.reactions.ReactionView.Reaction
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

public class MessageAccessoriesAdapter(measureAndLayout: () -> Unit) : Adapter<MessagePartViewHolder> {
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

   init {
      kotlin.jvm.internal.r.h(var1, "measureAndLayout");
      super();
      this.measureAndLayout = var1;
      this.items = kotlin.collections.h.i();
      this.onTapSpoiler = new Function1<MessagePartViewHolder, Unit>(this) {
         final MessageAccessoriesAdapter this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(MessagePartViewHolder var1) {
            kotlin.jvm.internal.r.h(var1, "holder");
            this.this$0.notifyItemChanged(var1.getBindingAdapterPosition());
            MessageAccessoriesAdapter.access$getMeasureAndLayout$p(this.this$0).invoke();
         }
      };
      this.setHasStableIds(true);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$2`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var4, var3, null, null, 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$3`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      var4.onTapReaction-u7_MRrM(var3, null, java.lang.Boolean.TRUE);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$4`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onTapFollowForumPost-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$5`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var6: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var6 = null;
      }

      val var7: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      val var2: Long = var7.unbox-impl();
      val var5: GuildId = var0.guildId;
      kotlin.jvm.internal.r.e(var0.guildId);
      var6.onTapShareForumPost-mgk6anA(var2, var5.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$6`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var3: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var4, var3, null, null, 4, null);
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$7`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      var var4: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var4 = null;
      }

      val var5: java.lang.String = var0.messageId;
      kotlin.jvm.internal.r.e(var0.messageId);
      val var3: ChannelId = var0.channelId;
      kotlin.jvm.internal.r.e(var0.channelId);
      var4.onTapReactionOverflow-pfaIj0E(var5, var3.unbox-impl());
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$9`(var0: MessageAccessoriesAdapter, var1: View) {
      kotlin.jvm.internal.r.h(var0, "this$0");
      if (var0.messageId != null) {
         var var3: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
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
         kotlin.jvm.internal.r.y("eventHandler");
         var10 = null;
      }

      var10.onTapImage-JR3bP6M(var2, var6, var3, var1.getWidth(), var1.getHeight(), var12.x, var12.y, var4, var5, var7, var8, var9);
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun clear() {
      this.items = kotlin.collections.h.i();
      this.messageId = null;
      this.channelId = null;
      this.guildId = null;
      this.notifyDataSetChanged();
   }

   public open fun getItemCount(): Int {
      return this.items.size();
   }

   public open fun getItemId(position: Int): Long {
      return this.items.get(var1).getItemId();
   }

   public open fun getItemViewType(position: Int): Int {
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
                        throw new eh.p();
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
                  throw new eh.p();
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

                  throw new eh.p();
               }

               throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
            }

            var4 = 44;
         }
      }

      return var4;
   }

   public open fun onBindViewHolder(holder: MessagePartViewHolder, position: Int) {
      kotlin.jvm.internal.r.h(var1, "holder");
      var var8: ChatEventHandler = this.eventHandler;
      if (this.eventHandler == null) {
         kotlin.jvm.internal.r.y("eventHandler");
         var8 = null;
      }

      val var49: Function6 = var8.getOnMessageLongPressed();
      val var50: Function4;
      if (var49 != null) {
         var50 = new Function4<MediaType, Integer, java.lang.String, Integer, Unit>(var49, this) {
            final Function6<MessageId, ChannelId, Integer, MediaType, java.lang.String, Integer, Unit> $onLongClick;
            final MessageAccessoriesAdapter this$0;

            {
               super(4);
               this.$onLongClick = var1;
               this.this$0 = var2;
            }

            public final void invoke(MediaType var1, Integer var2, java.lang.String var3, Integer var4) {
               kotlin.jvm.internal.r.h(var1, "mediaType");
               val var6: Function6 = this.$onLongClick;
               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.r.e(var5);
               val var8: MessageId;
               if (var5 != null) {
                  var8 = MessageId.box-impl(var5);
               } else {
                  var8 = null;
               }

               val var7: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
               kotlin.jvm.internal.r.e(var7);
               var6.invoke(var8, var7, var2, var1, var3, var4);
            }
         };
      } else {
         var50 = null;
      }

      val var10: MessageAccessory = this.items.get(var2);
      if (var10 is EmbedMessageAccessory) {
         val var11: EmbedViewHolder = var1 as EmbedViewHolder;
         var2 = var1.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_max_height);
         val var93: EmbedMessageAccessory = var10 as EmbedMessageAccessory;
         val var5: Int = (var10 as EmbedMessageAccessory).getRadiusPx();
         val var12: OnLongClickListener = (var10 as EmbedMessageAccessory).getOnLongClick();
         val var51: SpoilerAttributes = var93.getSpoilerAttributes();
         val var52: SpoilerConfig;
         if (var51 != null) {
            var52 = var51.configure(new Function0<Unit>(this, var1) {
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
            var52 = null;
         }

         var11.bind(var93, var2, var5, new Function0<Unit>(this, var1) {
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
         }, var52, new Function2<java.lang.Double, Integer, Unit>(var1, var10, this) {
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
               val var5: View = this.$holder.itemView;
               val var4: java.lang.String = this.$part.getMessageId-3Eiw7ao();
               val var3: Int = (this.$part as EmbedMessageAccessory).getIndex();
               val var6: ViewResizeMode = ViewResizeMode.Fill;
               val var7: MessageAccessoriesAdapter = this.this$0;
               kotlin.jvm.internal.r.g(var5, "itemView");
               MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(var7, var5, var4, "embed", var6, var1, var3, var2, null, null);
            }
         }, var12, var93.getPortal());
      } else if (var10 is InfoLinkMessageAccessory) {
         (var1 as InfoLinkViewHolder)
            .bind(
               (var10 as InfoLinkMessageAccessory).getText(),
               (var10 as InfoLinkMessageAccessory).getIcon(),
               new Function0<Unit>(this, var10) {
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
                        kotlin.jvm.internal.r.y("eventHandler");
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
         val var94: GiftViewHolder = var1 as GiftViewHolder;
         val var54: GiftMessageAccessory = var10 as GiftMessageAccessory;
         var var24: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var24 = null;
         }

         var94.bind(var54, new Function1<java.lang.String, Unit>(var24) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapGiftCodeEmbed", "onTapGiftCodeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapGiftCodeEmbed(var1);
            }
         }, new Function1<java.lang.String, Unit>(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "giftCode");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var2 = null;
               }

               var2.onTapGiftCodeAccept-NU4t8f8(var1, this.$part.getMessageId-3Eiw7ao());
            }
         });
      } else if (var10 is MessageContentAccessory) {
         val var143: MessageContentViewHolder = var1 as MessageContentViewHolder;
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var152: Function2 = new Function2<MessageId, LinkContentNode, Unit>(var8) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var13: Function1 = new Function1<LinkContentNode, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onLinkLongClicked", "onLinkLongClicked(Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V", 0);
            }

            public final void invoke(LinkContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLinkLongClicked(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var14: Function3 = new Function3<java.lang.String, java.lang.String, java.lang.String, Unit>(var8) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapChannel(var1, var2, var3);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var15: Function4 = new Function4<java.lang.String, java.lang.String, java.lang.String, java.lang.String, Unit>(var8) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressChannel(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var16: Function1 = new Function1<java.lang.String, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapAttachmentLink", "onTapAttachmentLink(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAttachmentLink(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var17: Function2 = new Function2<java.lang.String, java.lang.String, Unit>(var8) {
            {
               super(2, var1, ChatEventHandler::class.java, "onLongPressAttachmentLink", "onLongPressAttachmentLink(Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onLongPressAttachmentLink(var1, var2);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var18: Function4 = new Function4<java.lang.String, java.lang.String, java.lang.String, java.lang.String, Unit>(var8) {
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
               kotlin.jvm.internal.r.h(var2, "p1");
               (super.receiver as ChatEventHandler).onTapMention(var1, var2, var3, var4);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var19: Function1 = new Function1<CommandMentionContentNode, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapCommand", "onTapCommand(Lcom/discord/chat/bridge/contentnode/CommandMentionContentNode;)V", 0);
            }

            public final void invoke(CommandMentionContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var20: Function1 = new Function1<CommandMentionContentNode, Unit>(var8) {
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
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onLongPressCommand(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var21: Function1 = new Function1<java.lang.String, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapTimestamp", "onTapTimestamp(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapTimestamp(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var22: Function1 = new Function1<EmojiContentNode, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapEmoji", "onTapEmoji(Lcom/discord/chat/bridge/contentnode/EmojiContentNode;)V", 0);
            }

            public final void invoke(EmojiContentNode var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapEmoji(var1);
            }
         };
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         var143.bind(var10 as MessageContentAccessory, var152, var13, var14, var15, var16, var17, var18, var19, var20, new Function0<Unit>(this, var1) {
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
         }, var21, var22, new Function1<MessageId, Unit>(var8) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSeeMore", "onTapSeeMore-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSeeMore-1xi1bu0(var1);
            }
         });
      } else if (var10 is MediaMosaicAttachmentMessageAccessory) {
         val var158: AttachmentMediaMosaicViewHolder = var1 as AttachmentMediaMosaicViewHolder;
         val var153: java.lang.String = this.messageId;
         kotlin.jvm.internal.r.e(this.messageId);
         val var144: MediaMosaicAttachmentMessageAccessory = var10 as MediaMosaicAttachmentMessageAccessory;
         val var107: java.util.List = (var10 as MediaMosaicAttachmentMessageAccessory).getAttachments();
         var2 = (var10 as MediaMosaicAttachmentMessageAccessory).getConstrainedWidth();
         val var160: Function3 = new Function3<Integer, MessageAccessory, MessagePartViewHolder, Unit>(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(3);
               this.this$0 = var1;
            }

            public final void invoke(int var1, MessageAccessory var2, MessagePartViewHolder var3) {
               kotlin.jvm.internal.r.h(var2, "attachment");
               kotlin.jvm.internal.r.h(var3, "attachmentViewHolder");
               val var4: View = var3.itemView;
               val var8: java.lang.String = var2.getMessageId-3Eiw7ao();
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
               kotlin.jvm.internal.r.g(var4, "itemView");
               MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(var5, var4, var8, "attachment", var6, var7, var1, null, null, null);
            }
         };
         val var68: Function1;
         if (var50 != null) {
            var68 = new Function1<Integer, Unit>(var50) {
               final Function4<MediaType, Integer, java.lang.String, Integer, Unit> $onLongClick;

               {
                  super(1);
                  this.$onLongClick = var1;
               }

               public final void invoke(int var1) {
                  this.$onLongClick.invoke(MediaType.Attachment, var1, null, null);
               }
            };
         } else {
            var68 = null;
         }

         var158.bind-JR3bP6M(var153, var107, var2, var160, var68, new Function0<Unit>(this, var1) {
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
         }, new Function0<Unit>(this, var10) {
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
                  kotlin.jvm.internal.r.y("eventHandler");
                  var3 = null;
               }

               val var1: Long = (this.$part as MediaMosaicAttachmentMessageAccessory).getChannelId-o4g7jtM();
               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.r.e(var5);
               var3.onTapInlineForward-JjTCmh4(var1, var5, "media", null);
            }
         }, var144.isForwardedContent(), var144.isShowingInlineForward(), var144.getMessageState(), var144.getShouldAutoPlayGif(), var144.getUseOldForwardIcon());
      } else if (var10 is UploadProgressMessageAccessory) {
         val var108: UploadProgressViewHolder = var1 as UploadProgressViewHolder;
         val var127: UploadProgress = (var10 as UploadProgressMessageAccessory).getUploadProgress();
         var var25: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var25 = null;
         }

         var108.bind(var127, var25);
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
               new c(this),
               new d(this),
               new Function1<Reaction, Unit>(this) {
                  final MessageAccessoriesAdapter this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(Reaction var1) {
                     kotlin.jvm.internal.r.h(var1, "reaction");
                     val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                     var var2: ChatEventHandler = var3;
                     if (var3 == null) {
                        kotlin.jvm.internal.r.y("eventHandler");
                        var2 = null;
                     }

                     val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
                     kotlin.jvm.internal.r.e(var4);
                     ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var2, var4, var1, null, 4, null);
                  }
               },
               new Function1<Reaction, Unit>(this) {
                  final MessageAccessoriesAdapter this$0;

                  {
                     super(1);
                     this.this$0 = var1;
                  }

                  public final void invoke(Reaction var1) {
                     kotlin.jvm.internal.r.h(var1, "reaction");
                     val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
                     var var2: ChatEventHandler = var3;
                     if (var3 == null) {
                        kotlin.jvm.internal.r.y("eventHandler");
                        var2 = null;
                     }

                     val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
                     kotlin.jvm.internal.r.e(var4);
                     val var5: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
                     kotlin.jvm.internal.r.e(var5);
                     var2.onLongPressReaction-Eqy5D80(var4, var5.unbox-impl(), var1);
                  }
               },
               (var10 as ReactionsMessageAccessory).getTheme()
            );
      } else if (var10 is StickerMessageAccessory) {
         (var1 as StickerPartViewHolder).bind((var10 as StickerMessageAccessory).getSticker(), new Function1<Sticker, Unit>(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(Sticker var1) {
               kotlin.jvm.internal.r.h(var1, "it");
               val var2: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var2;
               if (var2 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var3 = null;
               }

               var3.onStickerClicked-Ayv7vGE((this.$part as StickerMessageAccessory).getSticker(), this.$part.getMessageId-3Eiw7ao());
            }
         }, new Function1<Sticker, Unit>(this, var10) {
            final MessageAccessory $part;
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
               this.$part = var2;
            }

            public final void invoke(Sticker var1) {
               kotlin.jvm.internal.r.h(var1, "it");
               val var2: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var2;
               if (var2 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
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
         val var110: ThreadEmbedViewHolder = var1 as ThreadEmbedViewHolder;
         val var128: ThreadEmbedMessageAccessory = var10 as ThreadEmbedMessageAccessory;
         var var27: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var27 = null;
         }

         var110.bind(var128, new Function1<MessageId, Unit>(var27) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapThreadEmbed", "onTapThreadEmbed-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapThreadEmbed-1xi1bu0(var1);
            }
         });
      } else if (var10 is ForumPostActionBar) {
         val var111: ForumPostActionBarViewHolder = var1 as ForumPostActionBarViewHolder;
         val var145: ForumPostActionBar = var10 as ForumPostActionBar;
         val var164: ReactionsTheme = (var10 as ForumPostActionBar).getReactionsTheme();
         val var159: e = new e(this);
         val var163: f = new f(this);
         val var162: g = new g(this);
         val var129: h = new h(this);
         val var165: Function1 = new Function1<Reaction, Unit>(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(Reaction var1) {
               kotlin.jvm.internal.r.h(var1, "reaction");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var2 = null;
               }

               val var4: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.r.e(var4);
               ChatEventHandler.DefaultImpls.onTapReaction-u7_MRrM$default(var2, var4, var1, null, 4, null);
            }
         };
         val var161: Function1 = new Function1<Reaction, Unit>(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(1);
               this.this$0 = var1;
            }

            public final void invoke(Reaction var1) {
               kotlin.jvm.internal.r.h(var1, "reaction");
               val var3: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var2 = null;
               }

               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.r.e(var5);
               val var4: ChannelId = MessageAccessoriesAdapter.access$getChannelId$p(this.this$0);
               kotlin.jvm.internal.r.e(var4);
               var2.onLongPressReaction-Eqy5D80(var5, var4.unbox-impl(), var1);
            }
         };
         val var154: i = new i(this);
         var var28: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var28 = null;
         }

         var111.bind(
            var145,
            var164,
            var159,
            var163,
            var162,
            var129,
            var165,
            var161,
            var154,
            new Function2<MessageId, LinkContentNode, Unit>(var28) {
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
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
               }
            }
         );
      } else if (var10 is FileAttachmentMessageAccessory) {
         val var73: FileAttachmentViewHolder = var1 as FileAttachmentViewHolder;
         val var130: FileAttachmentMessageAccessory = var10 as FileAttachmentMessageAccessory;
         val var112: Function2 = new Function2<java.lang.String, java.lang.String, Unit>(this) {
            final MessageAccessoriesAdapter this$0;

            {
               super(2);
               this.this$0 = var1;
            }

            public final void invoke(java.lang.String var1, java.lang.String var2) {
               kotlin.jvm.internal.r.h(var1, "url");
               kotlin.jvm.internal.r.h(var2, "filename");
               val var4: ChatEventHandler = MessageAccessoriesAdapter.access$getEventHandler$p(this.this$0);
               var var3: ChatEventHandler = var4;
               if (var4 == null) {
                  kotlin.jvm.internal.r.y("eventHandler");
                  var3 = null;
               }

               val var5: java.lang.String = MessageAccessoriesAdapter.access$getMessageId$p(this.this$0);
               kotlin.jvm.internal.r.e(var5);
               var3.onLinkClicked-u7_MRrM(var5, var1, var2);
            }
         };
         val var146: SpoilerAttributes = var130.getSpoilerAttributes();
         val var29: SpoilerConfig;
         if (var146 != null) {
            var29 = var146.configure(new Function0<Unit>(this, var1) {
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

         var73.bind(var130, var112, var29);
      } else if (var10 is MessageComponentsAccessory) {
         val var155: MessageComponentsViewHolder = var1 as MessageComponentsViewHolder;
         var var113: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var113 = null;
         }

         val var74: Function2;
         if (var50 != null) {
            var74 = new Function2<java.lang.String, Integer, Unit>(var50) {
               final Function4<MediaType, Integer, java.lang.String, Integer, Unit> $onLongClicked;

               {
                  super(2);
                  this.$onLongClicked = var1;
               }

               public final void invoke(java.lang.String var1, Integer var2) {
                  kotlin.jvm.internal.r.h(var1, "componentId");
                  this.$onLongClicked.invoke(MediaType.Component, null, var1, var2);
               }
            };
         } else {
            var74 = null;
         }

         var155.bind(
            var10 as MessageComponentsAccessory,
            this.botComponentProvider,
            new Function4<View, java.lang.String, Integer, java.lang.Double, Unit>(var10, this) {
               final MessageAccessory $part;
               final MessageAccessoriesAdapter this$0;

               {
                  super(4);
                  this.$part = var1;
                  this.this$0 = var2;
               }

               public final void invoke(View var1, java.lang.String var2, Integer var3, java.lang.Double var4) {
                  kotlin.jvm.internal.r.h(var1, "view");
                  kotlin.jvm.internal.r.h(var2, "componentId");
                  MessageAccessoriesAdapter.access$onMediaClicked-mdVZsaY(
                     this.this$0, var1, this.$part.getMessageId-3Eiw7ao(), "component", ViewResizeMode.Fill, var4, 0, null, var2, var3
                  );
               }
            },
            var74,
            new Function0<Unit>(this, var1) {
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
            var113
         );
      } else if (var10 is FlaggedMessageEmbedAccessory) {
         (var1 as FlaggedMessageEmbedViewHolder).bind(var10 as FlaggedMessageEmbedAccessory);
      } else if (var10 is FlaggedMessageActionBarAccessory) {
         val var114: FlaggedMessageActionBarViewHolder = var1 as FlaggedMessageActionBarViewHolder;
         val var131: FlaggedMessageActionBarAccessory = var10 as FlaggedMessageActionBarAccessory;
         var var30: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var30 = null;
         }

         val var148: Function2 = new Function2<MessageId, ChannelId, Unit>(var30) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var31: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var31 = null;
         }

         var114.bind(var131, var148, new Function2<MessageId, ChannelId, Unit>(var31) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is AutoModerationNotificationEmbedAccessory) {
         val var115: AutoModerationNotificationEmbedViewHolder = var1 as AutoModerationNotificationEmbedViewHolder;
         val var132: AutoModerationNotificationEmbedAccessory = var10 as AutoModerationNotificationEmbedAccessory;
         var var32: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var32 = null;
         }

         val var149: Function2 = new Function2<MessageId, ChannelId, Unit>(var32) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationActions", "onTapAutoModerationActions-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationActions-pfaIj0E(var1, var2);
            }
         };
         var var33: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var33 = null;
         }

         var115.bind(var132, var149, new Function2<MessageId, ChannelId, Unit>(var33) {
            {
               super(2, var1, ChatEventHandler::class.java, "onTapAutoModerationFeedback", "onTapAutoModerationFeedback-pfaIj0E(Ljava/lang/String;J)V", 0);
            }

            public final void invoke_pfaIj0E/* $VF was: invoke-pfaIj0E*/(java.lang.String var1, long var2) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapAutoModerationFeedback-pfaIj0E(var1, var2);
            }
         });
      } else if (var10 is TimestampMessageAccessory) {
         (var1 as TimestampViewHolder).bind(var10 as TimestampMessageAccessory);
      } else if (var10 is WelcomeStickerAccessory) {
         (var1 as WelcomeStickerViewHolder).bind(var10 as WelcomeStickerAccessory);
      } else if (var10 is ActivityInviteEmbedMessageAccessory) {
         val var116: ActivityInviteEmbedViewHolder = var1 as ActivityInviteEmbedViewHolder;
         val var133: ActivityInviteEmbedMessageAccessory = var10 as ActivityInviteEmbedMessageAccessory;
         var var34: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var34 = null;
         }

         var116.bind(var133, new Function1<MessageId, Unit>(var34) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapJoinActivity", "onTapJoinActivity-1xi1bu0(Ljava/lang/String;)V", 0);
            }

            public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
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
         val var117: VoiceMessageViewHolder = var1 as VoiceMessageViewHolder;
         val var134: AudioAttachmentMessageAccessory = var10 as AudioAttachmentMessageAccessory;
         var var36: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var36 = null;
         }

         var117.bind(var134, var36);
      } else if (var10 is PostPreviewEmbedMessageAccessory) {
         val var150: PostPreviewEmbedViewHolder = var1 as PostPreviewEmbedViewHolder;
         val var156: PostPreviewEmbedMessageAccessory = var10 as PostPreviewEmbedMessageAccessory;
         val var135: PostPreviewEmbed = (var10 as PostPreviewEmbedMessageAccessory).getPostPreviewEmbed();
         var8 = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var8 = null;
         }

         val var83: Function4 = new Function4<GuildId, ChannelId, ChannelId, MessageId, Unit>(var8) {
            {
               super(4, var1, ChatEventHandler::class.java, "onTapPostPreviewEmbed", "onTapPostPreviewEmbed-kUTrp-s(JJJLjava/lang/String;)V", 0);
            }

            public final void invoke_kUTrp_s/* $VF was: invoke-kUTrp-s*/(long var1, long var3, long var5, java.lang.String var7) {
               kotlin.jvm.internal.r.h(var7, "p3");
               (super.receiver as ChatEventHandler).onTapPostPreviewEmbed-kUTrp-s(var1, var3, var5, var7);
            }
         };
         val var119: SpoilerAttributes = var156.getSpoilerAttributes();
         val var37: SpoilerConfig;
         if (var119 != null) {
            var37 = var119.configure(new Function0<Unit>(this, var1) {
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

         var150.bind(var135, var83, var37);
      } else if (var10 is ChannelPromptActionsAccessory) {
         val var120: ChannelPromptActionsViewHolder = var1 as ChannelPromptActionsViewHolder;
         val var136: ChannelPromptActionsAccessory = var10 as ChannelPromptActionsAccessory;
         var var38: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var38 = null;
         }

         var120.bind(
            var136,
            new Function3<MessageId, ChannelId, java.lang.String, Unit>(var38) {
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
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var4, "p2");
                  (super.receiver as ChatEventHandler).onTapChannelPromptButton-Eqy5D80(var1, var2, var4);
               }
            }
         );
      } else if (var10 is SafetyPolicyNoticeMessageAccessory) {
         val var121: SafetyPolicyNoticeViewHolder = var1 as SafetyPolicyNoticeViewHolder;
         val var137: SafetyPolicyNoticeMessageAccessory = var10 as SafetyPolicyNoticeMessageAccessory;
         var var39: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var39 = null;
         }

         var121.bind(var137, new Function1<java.lang.String, Unit>(var39) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapSafetyPolicyNoticeEmbed", "onTapSafetyPolicyNoticeEmbed(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               kotlin.jvm.internal.r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapSafetyPolicyNoticeEmbed(var1);
            }
         });
      } else if (var10 is SafetySystemNotificationMessageAccessory) {
         val var122: SafetySystemNotificationViewHolder = var1 as SafetySystemNotificationViewHolder;
         val var138: SafetySystemNotificationEmbed = (var10 as SafetySystemNotificationMessageAccessory).getSafetySystemNotificationEmbed();
         var var40: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var40 = null;
         }

         var122.bind(
            var138,
            new Function2<java.lang.String, java.lang.String, Unit>(var40) {
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
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onTapSafetySystemNotificationCta(var1, var2);
               }
            }
         );
      } else if (var10 is PollMessageAccessory) {
         val var123: PollViewHolder = var1 as PollViewHolder;
         val var139: PollMessageAccessory = var10 as PollMessageAccessory;
         var var41: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var41 = null;
         }

         val var151: Function3 = new Function3<ChannelId, MessageId, java.lang.String, Unit>(var41) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAnswer", "onTapPollAnswer-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAnswer-sekaTiM(var1, var3, var4);
            }
         };
         var var42: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var42 = null;
         }

         val var157: Function3 = new Function3<ChannelId, MessageId, java.lang.String, Unit>(var42) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapPollAction", "onTapPollAction-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapPollAction-sekaTiM(var1, var3, var4);
            }
         };
         var var43: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var43 = null;
         }

         var123.bind(
            var139,
            var151,
            var157,
            new Function8<ChannelId, MessageId, java.lang.String, Integer, Integer, Integer, Integer, ViewResizeMode, Unit>(var43) {
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
                  kotlin.jvm.internal.r.h(var3, "p1");
                  kotlin.jvm.internal.r.h(var4, "p2");
                  kotlin.jvm.internal.r.h(var9, "p7");
                  (super.receiver as ChatEventHandler).onLongPressPollImage-YVExdug(var1, var3, var4, var5, var6, var7, var8, var9);
               }
            }
         );
      } else if (var10 is CtaButtonMessageAccessory) {
         val var90: CtaButtonViewHolder = var1 as CtaButtonViewHolder;
         val var6: Long = (var10 as CtaButtonMessageAccessory).getChannelId-o4g7jtM();
         val var124: java.lang.String = var10.getMessageId-3Eiw7ao();
         val var140: CtaButton = (var10 as CtaButtonMessageAccessory).getCtaButton();
         var var44: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var44 = null;
         }

         var90.bind-JjTCmh4(var6, var124, var140, new Function3<ChannelId, MessageId, java.lang.String, Unit>(var44) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapCtaButton", "onTapCtaButton-sekaTiM(JLjava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke_sekaTiM/* $VF was: invoke-sekaTiM*/(long var1, java.lang.String var3, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var3, "p1");
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapCtaButton-sekaTiM(var1, var3, var4);
            }
         });
      } else if (var10 is VoiceInviteMessageAccessory) {
         val var125: VoiceInviteEmbedViewHolder = var1 as VoiceInviteEmbedViewHolder;
         val var141: VoiceInviteEmbed = (var10 as VoiceInviteMessageAccessory).getEmbed();
         var var45: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var45 = null;
         }

         var125.bind(var141, new Function3<java.lang.String, java.lang.String, java.lang.String, Unit>(var45) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapChannel", "onTapChannel(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1, java.lang.String var2, java.lang.String var3) {
               kotlin.jvm.internal.r.h(var1, "p0");
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

               throw new eh.p();
            }

            throw new IllegalArgumentException("No longer allowed. Use MediaMosaicAttachmentMessageAccessory");
         }

         val var126: ForwardBreadcrumbViewHolder = var1 as ForwardBreadcrumbViewHolder;
         val var142: ForwardBreadcrumbMessageAccessory = var10 as ForwardBreadcrumbMessageAccessory;
         var var46: ChatEventHandler = this.eventHandler;
         if (this.eventHandler == null) {
            kotlin.jvm.internal.r.y("eventHandler");
            var46 = null;
         }

         var126.bind(var142, new Function3<Integer, ChannelId, MessageId, Unit>(var46) {
            {
               super(3, var1, ChatEventHandler::class.java, "onTapForwardFooter", "onTapForwardFooter-SHRpUJI(IJLjava/lang/String;)V", 0);
            }

            public final void invoke_SHRpUJI/* $VF was: invoke-SHRpUJI*/(int var1, long var2, java.lang.String var4) {
               kotlin.jvm.internal.r.h(var4, "p2");
               (super.receiver as ChatEventHandler).onTapForwardFooter-SHRpUJI(var1, var2, var4);
            }
         });
      }

      ForceExhaustiveKt.forceExhaustive(Unit.a);
   }

   public open fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagePartViewHolder {
      kotlin.jvm.internal.r.h(var1, "parent");
      var var19: Any;
      switch (var2) {
         case 0:
            val var77: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var77, "parent.context");
            var19 = new MessageContentViewHolder(new MessageContentView(var77, null, 0, 6, null));
            break;
         case 1:
            val var75: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var75, "parent.context");
            val var91: EmbedView = new EmbedView(var75, null, 2, null);
            var var76: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var76 = null;
            }

            var19 = new EmbedViewHolder(var91, var76);
            break;
         case 2:
         case 10:
         default:
            val var74: StringBuilder = new StringBuilder();
            var74.append("Unknown view type: ");
            var74.append(var2);
            throw new IllegalArgumentException(var74.toString());
         case 3:
            val var73: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var73, "parent.context");
            var19 = new UploadProgressViewHolder(new UploadProgressView(var73, null, 2, null));
            break;
         case 4:
            val var72: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var72, "parent.context");
            var19 = new ReactionsViewHolder(new ReactionsView(var72, null, 2, null));
            break;
         case 5:
            val var70: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var70, "parent.context");
            val var90: GuildInviteView = new GuildInviteView(var70, null, 0, 6, null);
            var var71: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var71 = null;
            }

            var19 = new GuildInviteViewHolder(var90, var71);
            break;
         case 6:
            val var69: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var69, "parent.context");
            var19 = new StickerPngViewHolder(new StickerView(var69, null, 0, 6, null));
            break;
         case 7:
            val var68: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var68, "parent.context");
            var19 = new StickerApngViewHolder(new StickerView(var68, null, 0, 6, null));
            break;
         case 8:
            val var67: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var67, "parent.context");
            var19 = new StickerLottieViewHolder(new StickerView(var67, null, 0, 6, null));
            break;
         case 9:
            val var66: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var66, "parent.context");
            var19 = new ThreadEmbedViewHolder(new ThreadEmbedView(var66, null, 0, 6, null));
            break;
         case 11:
            val var64: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var64, "parent.context");
            val var89: FileAttachmentView = new FileAttachmentView(var64, null, 2, null);
            var var65: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var65 = null;
            }

            var19 = new FileAttachmentViewHolder(var89, var65);
            break;
         case 12:
            val var62: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var62, "parent.context");
            val var88: MessageComponentsView = new MessageComponentsView(var62, null, 0, 6, null);
            var var63: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var63 = null;
            }

            var19 = new MessageComponentsViewHolder(var88, var63);
            break;
         case 13:
            val var61: TextView = TimestampViewBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false).getRoot();
            kotlin.jvm.internal.r.g(var61, "inflate(\n               …                   ).root");
            var19 = new TimestampViewHolder(var61);
            break;
         case 14:
            val var59: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var59, "parent.context");
            val var87: WelcomeStickerView = new WelcomeStickerView(var59, null, 2, null);
            var var60: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var60 = null;
            }

            var19 = new WelcomeStickerViewHolder(
               var87,
               new Function2<Sticker, MessageId, Unit>(var60) {
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
                     kotlin.jvm.internal.r.h(var1, "p0");
                     kotlin.jvm.internal.r.h(var2, "p1");
                     (super.receiver as ChatEventHandler).onWelcomeReplyClicked-Ayv7vGE(var1, var2);
                  }
               }
            );
            break;
         case 15:
            val var57: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var57, "parent.context");
            val var86: GuildEventInviteView = new GuildEventInviteView(var57, null, 0, 6, null);
            var var58: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var58 = null;
            }

            var19 = new GuildEventInviteViewHolder(var86, var58, new Function1<MessagePartViewHolder, Unit>(this) {
               final MessageAccessoriesAdapter this$0;

               {
                  super(1);
                  this.this$0 = var1;
               }

               public final void invoke(MessagePartViewHolder var1) {
                  kotlin.jvm.internal.r.h(var1, "holder");
                  MessageAccessoriesAdapter.access$getOnTapSpoiler$p(this.this$0).invoke(var1);
               }
            });
            break;
         case 16:
            val var56: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var56, "parent.context");
            var19 = new GiftViewHolder(new GiftView(var56, null, 2, null));
            break;
         case 17:
            val var55: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var55, "parent.context");
            var19 = new ActivityInviteEmbedViewHolder(new ActivityInviteEmbedView(var55, null, 0, 6, null));
            break;
         case 18:
            val var53: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var53, "parent.context");
            val var85: EphemeralIndicationView = new EphemeralIndicationView(var53, null, 0, 6, null);
            var var54: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var54 = null;
            }

            var19 = new EphemeralIndicationViewHolder(var85, var54);
            break;
         case 19:
            val var52: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var52, "parent.context");
            var19 = new InteractionStatusViewHolder(new InteractionStatusView(var52, null, 2, null));
            break;
         case 20:
            val var51: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var51, "parent.context");
            var19 = new ForumPostActionBarViewHolder(new ForumPostActionBarView(var51, null, 0, 6, null));
            break;
         case 21:
            val var49: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var49, "parent.context");
            val var84: FlaggedMessageEmbedView = new FlaggedMessageEmbedView(var49, null, 2, null);
            var var50: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var50 = null;
            }

            var19 = new FlaggedMessageEmbedViewHolder(var84, var50);
            break;
         case 22:
            val var48: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var48, "parent.context");
            var19 = new FlaggedMessageActionBarViewHolder(new FlaggedMessageActionBarView(var48, null, 0, 6, null));
            break;
         case 23:
            val var47: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var47, "parent.context");
            var19 = new RoleSubscriptionPurchaseViewHolder(new RoleSubscriptionPurchaseView(var47, null, 0, 6, null));
            break;
         case 24:
            val var45: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var45, "parent.context");
            val var83: SurveyIndicationView = new SurveyIndicationView(var45, null, 0, 6, null);
            var var46: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var46 = null;
            }

            var19 = new SurveyIndicationViewHolder(var83, var46);
            break;
         case 25:
            val var43: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var43, "parent.context");
            val var82: GuildInviteDisabledView = new GuildInviteDisabledView(var43, null, 0, 6, null);
            var var44: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var44 = null;
            }

            var19 = new GuildInviteDisabledViewHolder(var82, var44);
            break;
         case 26:
            val var41: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var41, "parent.context");
            val var81: AttachmentMediaMosaicContainerView = new AttachmentMediaMosaicContainerView(var41, null, 2, null);
            var var42: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var42 = null;
            }

            var19 = new AttachmentMediaMosaicViewHolder(var81, var42);
            break;
         case 27:
            val var40: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var40, "parent.context");
            var19 = new StickerGifViewHolder(new StickerView(var40, null, 0, 6, null));
            break;
         case 28:
            val var38: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var38, "parent.context");
            val var80: InviteToSpeakView = new InviteToSpeakView(var38, null, 2, null);
            var var39: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var39 = null;
            }

            var19 = new InviteToSpeakViewHolder(var80, new Function1<MessageId, Unit>(var39) {
               {
                  super(1, var1, ChatEventHandler::class.java, "onTapInviteToSpeak", "onTapInviteToSpeak-1xi1bu0(Ljava/lang/String;)V", 0);
               }

               public final void invoke_1xi1bu0/* $VF was: invoke-1xi1bu0*/(java.lang.String var1) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  (super.receiver as ChatEventHandler).onTapInviteToSpeak-1xi1bu0(var1);
               }
            });
            break;
         case 29:
            val var37: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var37, "parent.context");
            var19 = new VoiceMessageViewHolder(new AudioPlayerView(var37, null, 0, 6, null));
            break;
         case 30:
            val var35: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var35, "parent.context");
            val var92: ActivityBookmarkView = new ActivityBookmarkView(var35, null, 0, 6, null);
            var var36: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var36 = null;
            }

            var19 = new ActivityBookmarkViewHolder(var92, var36);
            break;
         case 31:
            val var33: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var33, "parent.context");
            val var79: EmbeddedActivityInviteView = new EmbeddedActivityInviteView(var33, null, 0, 6, null);
            var var34: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var34 = null;
            }

            var19 = new EmbeddedActivityInviteViewHolder(var79, var34);
            break;
         case 32:
            val var32: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var32, "parent.context");
            var19 = new PostPreviewEmbedViewHolder(new PostPreviewEmbedView(var32, null, 0, 6, null));
            break;
         case 33:
            val var31: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var31, "parent.context");
            var19 = new AutoModerationNotificationEmbedViewHolder(new AutoModerationNotificationEmbedView(var31, null, 2, null));
            break;
         case 34:
            val var30: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var30, "parent.context");
            var19 = new ChannelPromptActionsViewHolder(new ChannelPromptActionsView(var30, null, 2, null));
            break;
         case 35:
            val var29: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var29, "parent.context");
            var19 = new InfoLinkViewHolder(new InfoLinkView(var29, null, 2, null));
            break;
         case 36:
            val var28: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var28, "parent.context");
            var19 = new SafetyPolicyNoticeViewHolder(new SafetyPolicyNoticeView(var28, null, 2, null));
            break;
         case 37:
            val var27: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var27, "parent.context");
            var19 = new PollViewHolder(new PollTextAndImageView(var27, null, 0, 6, null));
            break;
         case 38:
            val var26: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var26, "parent.context");
            var19 = new PollViewHolder(new PollImageOnlyView(var26, null, 0, 6, null));
            break;
         case 39:
            val var25: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var25, "parent.context");
            var19 = new SafetySystemNotificationViewHolder(new SafetySystemNotificationView(var25, null, 2, null));
            break;
         case 40:
            val var23: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var23, "parent.context");
            val var78: ActivityInstanceEmbedView = new ActivityInstanceEmbedView(var23, null, 0, 6, null);
            var var24: ChatEventHandler = this.eventHandler;
            if (this.eventHandler == null) {
               kotlin.jvm.internal.r.y("eventHandler");
               var24 = null;
            }

            var19 = new ActivityInstanceEmbedViewHolder(var78, var24);
            break;
         case 41:
            val var22: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var22, "parent.context");
            var19 = new CtaButtonViewHolder(new CtaButtonView(var22, null, 2, null));
            break;
         case 42:
            val var21: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var21, "parent.context");
            var19 = new VoiceInviteEmbedViewHolder(new VoiceInviteEmbedView(var21, null, 2, null));
            break;
         case 43:
            val var20: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var20, "parent.context");
            var19 = new ForwardHeaderViewHolder(new ForwardHeaderView(var20, null, 2, null));
            break;
         case 44:
            val var18: Context = var1.getContext();
            kotlin.jvm.internal.r.g(var18, "parent.context");
            var19 = new ForwardBreadcrumbViewHolder(new ForwardBreadcrumbView(var18, null, 2, null));
      }

      return (MessagePartViewHolder)var19;
   }

   public open fun onViewAttachedToWindow(holder: MessagePartViewHolder) {
      kotlin.jvm.internal.r.h(var1, "holder");
      super.onViewAttachedToWindow(var1);
      if (var1 is MessageContentViewHolder) {
         var var2: MessageAccessoriesAdapter.MessageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
         if (this.messageContentViewLifecycleListener == null) {
            kotlin.jvm.internal.r.y("messageContentViewLifecycleListener");
            var2 = null;
         }

         var2.onAttachedToWindow((var1 as MessageContentViewHolder).getMessageContentView());
      }
   }

   public open fun onViewDetachedFromWindow(holder: MessagePartViewHolder) {
      kotlin.jvm.internal.r.h(var1, "holder");
      super.onViewDetachedFromWindow(var1);
      if (var1 is MessageContentViewHolder) {
         var var3: MessageAccessoriesAdapter.MessageContentViewLifecycleListener = this.messageContentViewLifecycleListener;
         if (this.messageContentViewLifecycleListener == null) {
            kotlin.jvm.internal.r.y("messageContentViewLifecycleListener");
            var3 = null;
         }

         var3.onDetachedFromWindow();
      }
   }

   public fun setComponentProvider(botComponentProvider: ComponentProvider?) {
      this.botComponentProvider = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.r.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   @SuppressLint(["NotifyDataSetChanged"])
   public fun setItems(messageId: MessageId, channelId: ChannelId, guildId: GuildId?, items: List<MessageAccessory>) {
      kotlin.jvm.internal.r.h(var1, "messageId");
      kotlin.jvm.internal.r.h(var5, "items");
      this.messageId = var1;
      this.channelId = ChannelId.box-impl(var2);
      this.guildId = var4;
      if (ChatView.Companion.getAreChatAnimationsEnabled()) {
         val var6: java.util.List = this.items;
         val var8: ArrayList = new ArrayList(var5);
         this.items = var8;
         val var7: androidx.recyclerview.widget.c.e = androidx.recyclerview.widget.c.b(new ItemDiffer(var6, var8), true);
         kotlin.jvm.internal.r.g(var7, "calculateDiff(differ, true)");
         var7.c(this);
      } else {
         this.items = var5;
         this.notifyDataSetChanged();
      }
   }

   public fun setMessageContentViewLifecycleListener(
      listener: com.discord.chat.presentation.message.MessageAccessoriesAdapter.MessageContentViewLifecycleListener
   ) {
      kotlin.jvm.internal.r.h(var1, "listener");
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
