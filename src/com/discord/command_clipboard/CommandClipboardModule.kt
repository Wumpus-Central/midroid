package com.discord.command_clipboard

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.content.ClipData.Item
import androidx.core.content.a
import com.discord.codegen.NativeCommandClipboardModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q

public class CommandClipboardModule(reactContext: ReactApplicationContext) : NativeCommandClipboardModuleSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun setItem(item: String?, type: String?, text: String?) {
      val var4: ClipboardManager = a.i(this.getReactApplicationContext().getApplicationContext(), ClipboardManager.class) as ClipboardManager;
      if (var4 != null && var1 != null && var2 != null && var3 != null) {
         val var5: Intent = new Intent();
         var5.putExtra("data", var1);
         var5.setType(var2);
         val var7: ClipData = new ClipData(var3, new java.lang.String[]{var2}, new Item(var5));
         var7.addItem(new Item(var3));
         var4.setPrimaryClip(var7);
      }
   }
}
