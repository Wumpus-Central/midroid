package com.discord.chat.presentation.list.delegate

import androidx.recyclerview.widget.RecyclerView.LayoutParams
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView
import com.discord.misc.utilities.size.SizeUtilsKt

@JvmSynthetic
fun `access$setupLayout`(var0: BlockedMessageGroupView) {
   setupLayout(var0);
}

private fun BlockedMessageGroupView.setupLayout() {
   val var2: LayoutParams = new LayoutParams(-1, -2);
   val var1: Int = SizeUtilsKt.getDpToPx(8);
   var2.setMargins(var1, 0, var1, 0);
   var0.setLayoutParams(var2);
}
