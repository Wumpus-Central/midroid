package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.h0
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      h0.b(ContentNode.class),
      new KClass[]{
         h0.b(AttachmentLinkContentNode.class),
         h0.b(BlockQuoteContentNode.class),
         h0.b(BulletListContentNode.class),
         h0.b(ChannelMentionContentNode.class),
         h0.b(ChannelNameContentNode.class),
         h0.b(CodeBlockContentNode.class),
         h0.b(CommandMentionContentNode.class),
         h0.b(CustomEmojiContentNode.class),
         h0.b(EmojiContentNode.class),
         h0.b(EmphasisContentNode.class),
         h0.b(GuildNameContentNode.class),
         h0.b(HeadingContentNode.class),
         h0.b(InlineCodeContentNode.class),
         h0.b(LineBreakContentNode.class),
         h0.b(LinkContentNode.class),
         h0.b(LHeadingContentNode.class),
         h0.b(MentionContentNode.class),
         h0.b(NewLineContentNode.class),
         h0.b(ParagraphContentNode.class),
         h0.b(SoundmojiContentNode.class),
         h0.b(SpoilerContentNode.class),
         h0.b(StaticChannelMentionContentNode.class),
         h0.b(StrikethroughContentNode.class),
         h0.b(StrongContentNode.class),
         h0.b(SubtextContentNode.class),
         h0.b(TextContentNode.class),
         h0.b(TimestampContentNode.class),
         h0.b(UnderlineContentNode.class),
         h0.b(UnicodeEmojiContentNode.class),
         h0.b(UserOrRoleMentionContentNode.class)
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
