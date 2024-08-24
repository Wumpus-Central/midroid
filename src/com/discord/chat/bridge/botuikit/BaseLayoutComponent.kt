package com.discord.chat.bridge.botuikit

public sealed class BaseLayoutComponent protected constructor() : Component() {
   public abstract val errorText: String?
}
