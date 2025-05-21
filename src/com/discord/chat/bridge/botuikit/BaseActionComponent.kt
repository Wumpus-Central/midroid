package com.discord.chat.bridge.botuikit

public sealed class BaseActionComponent protected constructor() : Component() {
   public abstract val state: ActionComponentState
   public abstract val customId: String?
}
