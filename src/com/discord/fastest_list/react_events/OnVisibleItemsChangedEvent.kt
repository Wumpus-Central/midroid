package com.discord.fastest_list.react_events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import ht.v

internal class OnVisibleItemsChangedEvent private constructor(data: WritableMap) : ReactEvent {
   private final val data: WritableMap

   init {
      this.data = var1;
   }

   public constructor(sectionsId: String, sectionStart: Int, sectionEnd: Int, itemStart: Int, itemEnd: Int) : this(
         NativeMapExtensionsKt.nativeMapOf(
            v.a("sectionsId", var1), v.a("sectionStart", var2), v.a("sectionEnd", var3), v.a("itemStart", var4), v.a("itemEnd", var5)
         )
      )
   public override fun serialize(): WritableMap {
      return this.data;
   }
}
