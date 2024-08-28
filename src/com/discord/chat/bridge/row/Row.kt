package com.discord.chat.bridge.row

import com.discord.chat.bridge.ChangeType
import dn.f
import kotlinx.serialization.KSerializer

@f(with = RowSerializer::class)
public sealed class Row protected constructor() {
   public abstract val changeType: ChangeType
   public abstract val index: Int

   public companion object {
      public fun serializer(): KSerializer<Row> {
         return RowSerializer.INSTANCE;
      }
   }
}
