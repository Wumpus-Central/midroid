package com.discord.kvstorage;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

public class KvStorageBridge {
   public static final KvStorageBridge instance = new KvStorageBridge();

   private native void activateNative(long var1, CallInvokerHolderImpl var3, String var4);

   public void activate(ReactContext var1) {
      JavaScriptContextHolder var2 = var1.getJavaScriptContextHolder();
      CallInvokerHolderImpl var3 = (CallInvokerHolderImpl)var1.getCatalystInstance().getJSCallInvokerHolder();
      String var4 = var1.getFilesDir().getAbsolutePath();
      this.activateNative(var2.get(), var3, var4);
   }
}
