package com.discord.kvstorage.discordapp;

import java.util.ArrayList;
import java.util.HashMap;

public final class DiscordMobileApi {
   public static native HashMap<String, ArrayList<String>> getGuildEmojis(String var0);

   public static native String getGuildVersions(String var0, String var1);

   public static void initialize(String var0) {
      System.loadLibrary("kv_storage");
      nativeInitialize(var0);
   }

   private static native void nativeInitialize(String var0);

   public static native void openAsync(String var0);

   public static native void putMessage(String var0, String var1, String var2, String var3, String var4);
}
