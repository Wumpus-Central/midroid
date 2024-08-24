package com.discord.primitives

public enum class MessageFlag(value: Long) {
   CROSSPOSTED(1L),
   EPHEMERAL(64L),
   FAILED_TO_MENTION_SOME_ROLES_IN_THREAD(256L),
   HAS_SNAPSHOT(16384L),
   HAS_THREAD(32L),
   IS_CROSSPOST(2L),
   IS_UIKIT_COMPONENTS(32768L),
   IS_VOICE_MESSAGE(8192L),
   LOADING(128L),
   SHOULD_SHOW_LINK_NOT_DISCORD_WARNING(1024L),
   SOURCE_MESSAGE_DELETED(8L),
   SUPPRESS_EMBEDS(4L),
   SUPPRESS_NOTIFICATIONS(4096L),
   URGENT(16L)
   public final val value: Long
   @JvmStatic
   private MessageFlag[] $VALUES = $values();

   init {
      this.value = var3;
   }
}
