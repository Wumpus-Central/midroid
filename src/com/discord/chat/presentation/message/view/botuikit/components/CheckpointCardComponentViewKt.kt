package com.discord.chat.presentation.message.view.botuikit.components

import android.view.View
import androidx.core.view.h0
import com.discord.chat.bridge.botuikit.CheckpointCardClickable
import com.discord.chat.bridge.botuikit.CheckpointDataV2025
import com.discord.chat.presentation.message.view.botuikit.ComponentContext
import com.discord.primitives.UserId

@JvmSynthetic
fun a(var0: ComponentContext, var1: CheckpointDataV2025, var2: View) {
   applyClickable$lambda$0(var0, var1, var2);
}

@JvmSynthetic
fun `access$applyClickable`(var0: View, var1: ComponentContext, var2: CheckpointDataV2025, var3: CheckpointCardClickable) {
   applyClickable(var0, var1, var2, var3);
}

private fun View.applyClickable(componentContext: ComponentContext, checkpointData: CheckpointDataV2025, clickable: CheckpointCardClickable?) {
   if (var3 == null) {
      var0.setOnClickListener(null);
   } else {
      var0.setContentDescription(var3.getAriaDescription());
      var0.setOnClickListener(new com.discord.chat.presentation.message.view.botuikit.components.e(var1, var2));
   }

   val var4: Boolean;
   if (var3 != null) {
      var4 = true;
   } else {
      var4 = false;
   }

   h0.G0(var0, var4);
   var0.setClickable(var4);
}

fun `applyClickable$lambda$0`(var0: ComponentContext, var1: CheckpointDataV2025, var2: View) {
   var0.getComponentActionEventHandlers().getOnTapCheckpointCard().invoke(UserId.box-impl(var1.getAuthorId-re6GcUE()));
}
