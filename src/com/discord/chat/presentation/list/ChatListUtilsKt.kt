@file:SourceDebugExtension(["SMAP\nChatListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListUtils.kt\ncom/discord/chat/presentation/list/ChatListUtilsKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,34:1\n13409#2,2:35\n*S KotlinDebug\n*F\n+ 1 ChatListUtils.kt\ncom/discord/chat/presentation/list/ChatListUtilsKt\n*L\n18#1:35,2\n*E\n"])

package com.discord.chat.presentation.list

import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import com.discord.chat.presentation.message.decorations.BackgroundHighlightDecoration
import kotlin.jvm.internal.SourceDebugExtension

public fun RecyclerView.configureMessageRecyclerView(context: Context, vararg decorations: ItemDecoration) {
   var0.addItemDecoration(new BackgroundHighlightDecoration(var1));
   var0.setItemViewCacheSize(5);
   val var4: Int = var2.length;

   for (int var3 = 0; var3 < var4; var3++) {
      var0.addItemDecoration(var2[var3]);
   }

   var0.setItemAnimator(null);
}
