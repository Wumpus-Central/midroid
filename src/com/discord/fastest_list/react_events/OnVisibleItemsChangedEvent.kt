package com.discord.fastest_list.react_events

import com.discord.react.utilities.NativeMapExtensionsKt
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import eh.w
import kotlin.jvm.internal.r

internal class OnVisibleItemsChangedEvent private constructor(data: WritableMap) : ReactEvent {
   private final val data: WritableMap

   init {
      this.data = var1;
   }

   public constructor(sectionsId: String, sectionStart: Int, sectionEnd: Int, itemStart: Int, itemEnd: Int) : r.h(var1, "sectionsId") {
      this(
         NativeMapExtensionsKt.nativeMapOf(
            new Pair[]{w.a("sectionsId", var1), w.a("sectionStart", var2), w.a("sectionEnd", var3), w.a("itemStart", var4), w.a("itemEnd", var5)}
         )
      );
   }

   public open fun serialize(): WritableMap {
      return this.data;
   }
}
