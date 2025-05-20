package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.G
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      G.b(ContentNode.class),
      new KClass[]{
         G.b(AttachmentLinkContentNode.class),
         G.b(BlockQuoteContentNode.class),
         G.b(BulletListContentNode.class),
         G.b(ChannelMentionContentNode.class),
         G.b(ChannelNameContentNode.class),
         G.b(CodeBlockContentNode.class),
         G.b(CommandMentionContentNode.class),
         G.b(CustomEmojiContentNode.class),
         G.b(EmojiContentNode.class),
         G.b(EmphasisContentNode.class),
         G.b(GuildNameContentNode.class),
         G.b(HeadingContentNode.class),
         G.b(InlineCodeContentNode.class),
         G.b(LineBreakContentNode.class),
         G.b(LinkContentNode.class),
         G.b(LHeadingContentNode.class),
         G.b(MentionContentNode.class),
         G.b(NewLineContentNode.class),
         G.b(ParagraphContentNode.class),
         G.b(SoundmojiContentNode.class),
         G.b(SpoilerContentNode.class),
         G.b(StaticChannelMentionContentNode.class),
         G.b(StrikethroughContentNode.class),
         G.b(StrongContentNode.class),
         G.b(SubtextContentNode.class),
         G.b(TextContentNode.class),
         G.b(TimestampContentNode.class),
         G.b(UnderlineContentNode.class),
         G.b(UnicodeEmojiContentNode.class),
         G.b(UserOrRoleMentionContentNode.class)
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
