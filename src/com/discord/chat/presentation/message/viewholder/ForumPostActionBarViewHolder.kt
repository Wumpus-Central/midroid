package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.bridge.forums.ForumPostActions
import com.discord.chat.bridge.reaction.ReactionsTheme
import com.discord.chat.presentation.message.messagepart.ForumPostActionBar
import com.discord.chat.presentation.message.view.ForumPostActionBarView
import com.discord.primitives.MessageId
import com.discord.reactions.ReactionView.Reaction

public class ForumPostActionBarViewHolder(forumPostActionBarView: ForumPostActionBarView) : MessagePartViewHolder {
   private final val forumPostActionBarView: ForumPostActionBarView

   init {
      kotlin.jvm.internal.q.h(var1, "forumPostActionBarView");
      super(var1, null);
      this.forumPostActionBarView = var1;
   }

   public fun bind(
      forumPostActionBar: ForumPostActionBar,
      reactionsTheme: ReactionsTheme?,
      onTapFollowForumPost: OnClickListener,
      onTapShareForumPost: OnClickListener,
      onAddReactionClick: OnClickListener,
      onTapReactionOverflow: OnClickListener,
      onReactionClick: (Reaction) -> Unit,
      onReactionLongPress: (Reaction) -> Unit,
      onTapDismissMediaPostSharePrompt: OnClickListener,
      onLinkClicked: (MessageId, LinkContentNode) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var1, "forumPostActionBar");
      kotlin.jvm.internal.q.h(var3, "onTapFollowForumPost");
      kotlin.jvm.internal.q.h(var4, "onTapShareForumPost");
      kotlin.jvm.internal.q.h(var5, "onAddReactionClick");
      kotlin.jvm.internal.q.h(var6, "onTapReactionOverflow");
      kotlin.jvm.internal.q.h(var7, "onReactionClick");
      kotlin.jvm.internal.q.h(var8, "onReactionLongPress");
      kotlin.jvm.internal.q.h(var9, "onTapDismissMediaPostSharePrompt");
      kotlin.jvm.internal.q.h(var10, "onLinkClicked");
      val var11: ForumPostActions = var1.getPostActions();
      this.forumPostActionBarView
         .configure-CgeVRR0(
            var1.getMessageId-3Eiw7ao(),
            var11.getNumDisplayedReactions(),
            var11.isFollowing(),
            var11.getFollowIcon(),
            var11.getFollowLabel(),
            var11.getShareIcon(),
            var11.getShareLabel(),
            var1.getReactions(),
            var11.getDefaultReaction(),
            var1.getCanAddNewReactions(),
            var1.getAddNewReactionAccessibilityLabel(),
            var2,
            var5,
            var7,
            var8,
            var3,
            var4,
            var6,
            var11.getSharePrompt(),
            var9,
            var10
         );
   }
}
