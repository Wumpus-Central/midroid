package com.discord.chat.bridge.contentnode

import kotlin.jvm.internal.E
import kotlin.reflect.KClass
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SealedClassSerializer

private final val sealedClassSerializer: SealedClassSerializer<ContentNode> =
   new SealedClassSerializer(
      "ContentNode",
      E.b(ContentNode.class),
      new KClass[]{
         E.b(AttachmentLinkContentNode.class),
         E.b(BlockQuoteContentNode.class),
         E.b(BulletListContentNode.class),
         E.b(ChannelMentionContentNode.class),
         E.b(ChannelNameContentNode.class),
         E.b(CodeBlockContentNode.class),
         E.b(CommandMentionContentNode.class),
         E.b(CustomEmojiContentNode.class),
         E.b(EmojiContentNode.class),
         E.b(EmphasisContentNode.class),
         E.b(GuildNameContentNode.class),
         E.b(HeadingContentNode.class),
         E.b(InlineCodeContentNode.class),
         E.b(LineBreakContentNode.class),
         E.b(LinkContentNode.class),
         E.b(LHeadingContentNode.class),
         E.b(MentionContentNode.class),
         E.b(NewLineContentNode.class),
         E.b(ParagraphContentNode.class),
         E.b(SoundmojiContentNode.class),
         E.b(SpoilerContentNode.class),
         E.b(StaticChannelMentionContentNode.class),
         E.b(StrikethroughContentNode.class),
         E.b(StrongContentNode.class),
         E.b(SubtextContentNode.class),
         E.b(TextContentNode.class),
         E.b(TimestampContentNode.class),
         E.b(UnderlineContentNode.class),
         E.b(UnicodeEmojiContentNode.class),
         E.b(UserOrRoleMentionContentNode.class)
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
