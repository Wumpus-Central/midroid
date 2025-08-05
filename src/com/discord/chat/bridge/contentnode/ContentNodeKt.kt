package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.H
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      H.b(ContentNode.class),
      new KClass[]{
         H.b(AttachmentLinkContentNode.class),
         H.b(BlockQuoteContentNode.class),
         H.b(BulletListContentNode.class),
         H.b(ChannelMentionContentNode.class),
         H.b(ChannelNameContentNode.class),
         H.b(CodeBlockContentNode.class),
         H.b(CommandMentionContentNode.class),
         H.b(GameMentionContentNode.class),
         H.b(CustomEmojiContentNode.class),
         H.b(EmojiContentNode.class),
         H.b(EmphasisContentNode.class),
         H.b(GuildNameContentNode.class),
         H.b(HeadingContentNode.class),
         H.b(InlineCodeContentNode.class),
         H.b(LineBreakContentNode.class),
         H.b(LinkContentNode.class),
         H.b(LHeadingContentNode.class),
         H.b(MentionContentNode.class),
         H.b(NewLineContentNode.class),
         H.b(ParagraphContentNode.class),
         H.b(SoundmojiContentNode.class),
         H.b(SpoilerContentNode.class),
         H.b(StaticChannelMentionContentNode.class),
         H.b(StrikethroughContentNode.class),
         H.b(StrongContentNode.class),
         H.b(SubtextContentNode.class),
         H.b(TextContentNode.class),
         H.b(TimestampContentNode.class),
         H.b(UnderlineContentNode.class),
         H.b(UnicodeEmojiContentNode.class),
         H.b(UserOrRoleMentionContentNode.class)
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
