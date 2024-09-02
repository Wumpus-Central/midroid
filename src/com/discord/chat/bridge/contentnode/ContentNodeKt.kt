package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.g0
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      g0.b(ContentNode.class),
      new KClass[]{
         g0.b(AttachmentLinkContentNode.class),
         g0.b(BlockQuoteContentNode.class),
         g0.b(BulletListContentNode.class),
         g0.b(ChannelMentionContentNode.class),
         g0.b(ChannelNameContentNode.class),
         g0.b(CodeBlockContentNode.class),
         g0.b(CommandMentionContentNode.class),
         g0.b(CustomEmojiContentNode.class),
         g0.b(EmojiContentNode.class),
         g0.b(EmphasisContentNode.class),
         g0.b(GuildNameContentNode.class),
         g0.b(HeadingContentNode.class),
         g0.b(InlineCodeContentNode.class),
         g0.b(LineBreakContentNode.class),
         g0.b(LinkContentNode.class),
         g0.b(LHeadingContentNode.class),
         g0.b(MentionContentNode.class),
         g0.b(NewLineContentNode.class),
         g0.b(ParagraphContentNode.class),
         g0.b(SoundmojiContentNode.class),
         g0.b(SpoilerContentNode.class),
         g0.b(StaticChannelMentionContentNode.class),
         g0.b(StrikethroughContentNode.class),
         g0.b(StrongContentNode.class),
         g0.b(SubtextContentNode.class),
         g0.b(TextContentNode.class),
         g0.b(TimestampContentNode.class),
         g0.b(UnderlineContentNode.class),
         g0.b(UnicodeEmojiContentNode.class),
         g0.b(UserOrRoleMentionContentNode.class)
      },
      new KSerializer[]{
         AttachmentLinkContentNode.Companion.serializer(),
         BlockQuoteContentNode.Companion.serializer(),
         BulletListContentNode.Companion.serializer(),
         ChannelMentionContentNode.Companion.serializer(),
         ChannelNameContentNode.Companion.serializer(),
         CodeBlockContentNode.Companion.serializer(),
         CommandMentionContentNode.Companion.serializer(),
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
