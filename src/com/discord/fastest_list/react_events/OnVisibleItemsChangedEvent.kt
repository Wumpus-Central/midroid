package com.discord.fastest_list.react_events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import e9.s
import kotlin.jvm.internal.q

internal class OnVisibleItemsChangedEvent private constructor(data: WritableMap) : ReactEvent {
   private final val data: WritableMap

   init {
      this.data = var1;
   }

   public constructor(sectionsId: String, sectionStart: Int, sectionEnd: Int, itemStart: Int, itemEnd: Int) : q.h(var1, "sectionsId") {
      this(
         NativeMapExtensionsKt.nativeMapOf(
            s.a("sectionsId", var1), s.a("sectionStart", var2), s.a("sectionEnd", var3), s.a("itemStart", var4), s.a("itemEnd", var5)
         )
      );
   }

   public override fun serialize(): WritableMap {
      return this.data;
   }
}
