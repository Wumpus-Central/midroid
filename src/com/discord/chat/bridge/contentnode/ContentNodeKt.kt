package com.discord.chat.bridge.contentnode

import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      ContentNode::class,
      new KClass[]{
         AttachmentLinkContentNode::class,
         BlockQuoteContentNode::class,
         BulletListContentNode::class,
         ChannelMentionContentNode::class,
         ChannelNameContentNode::class,
         CodeBlockContentNode::class,
         CommandMentionContentNode::class,
         GameMentionContentNode::class,
         CustomEmojiContentNode::class,
         EmojiContentNode::class,
         EmphasisContentNode::class,
         GuildNameContentNode::class,
         HeadingContentNode::class,
         InlineCodeContentNode::class,
         LineBreakContentNode::class,
         LinkContentNode::class,
         LHeadingContentNode::class,
         MentionContentNode::class,
         NewLineContentNode::class,
         ParagraphContentNode::class,
         SoundmojiContentNode::class,
         SpoilerContentNode::class,
         StaticChannelMentionContentNode::class,
         StrikethroughContentNode::class,
         StrongContentNode::class,
         SubtextContentNode::class,
         TextContentNode::class,
         TimestampContentNode::class,
         UnderlineContentNode::class,
         UnicodeEmojiContentNode::class,
         UserOrRoleMentionContentNode::class
      },
      new KSerializer[]{
         AttachmentLinkContentNode.Companion.serializer(),
         BlockQuoteContentNode.Companion.serializer(),
         BulletListContentNode.Companion.serializer(),
         ChannelMentionContentNode.Companion.serializer(),
         ChannelNameContentNode.Companion.serializer(),
         CodeBlockContentNode.Companion.serializer(),
         CommandMentionContentNode.Companion.serializer(),
         GameMentionContentNode.Companion.serializer(),
         CustomEmojiContentNode.Companion.serializer(),
         EmojiContentNode.Companion.serializer(),
         EmphasisContentNode.Companion.serializer(),
         GuildNameContentNode.Companion.serializer(),
         HeadingContentNode.Companion.serializer(),
         InlineCodeContentNode.Companion.serializer(),
         LineBreakContentNode.Companion.serializer(),
         LinkContentNode.Companion.serializer(),
         LHeadingContentNode.Companion.serializer(),
         MentionContentNode.Companion.serializer(),
         NewLineContentNode.Companion.serializer(),
         ParagraphContentNode.Companion.serializer(),
         SoundmojiContentNode.Companion.serializer(),
         SpoilerContentNode.Companion.serializer(),
         StaticChannelMentionContentNode.Companion.serializer(),
         StrikethroughContentNode.Companion.serializer(),
         StrongContentNode.Companion.serializer(),
         SubtextContentNode.Companion.serializer(),
         TextContentNode.Companion.serializer(),
         TimestampContentNode.Companion.serializer(),
         UnderlineContentNode.Companion.serializer(),
         UnicodeEmojiContentNode.Companion.serializer(),
         UserOrRoleMentionContentNode.Companion.serializer()
      }
   )

@JvmSynthetic
fun `access$getSealedClassSerializer$p`(): SealedClassSerializer {
   return sealedClassSerializer;
}
