package com.discord.chat.presentation.list

import android.content.Context
import android.view.View
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.tti_measurement_view.TTIMeasurementView
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.uimanager.ViewGroupManager
import com.facebook.react.viewmanagers.DCDChatListManagerDelegate
import com.facebook.react.viewmanagers.DCDChatListManagerInterface
import java.lang.ref.WeakReference
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension

@ReactModule(name = "DCDChatList")
@SourceDebugExtension(["SMAP\nChatListViewManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListViewManager.kt\ncom/discord/chat/presentation/list/ChatListViewManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1#2:73\n*E\n"])
public class ChatListViewManager : ViewGroupManager<ChatListView>, DCDChatListManagerInterface<ChatListView> {
   private final val mDelegate: DCDChatListManagerDelegate<ChatListView, ChatListViewManager> = new DCDChatListManagerDelegate(this)
   private final var weakProvider: Pair<WeakReference<Context>, ComponentProvider>?
   private final val lock: Any

   @JvmStatic
   fun `addView$lambda$3`(var0: TTIMeasurementView, var1: ChatListView): Unit {
      val var2: Function2 = var0.getMeasurementListener();
      if (var2 != null) {
         var2.invoke(var0, (double)System.currentTimeMillis());
      }

      var1.setOnFirstDrawDoneCallback(new w());
      return Unit.a;
   }

   @JvmStatic
   fun `addView$lambda$3$lambda$2`(): Unit {
      return Unit.a;
   }

   private fun getExistingProvider(context: Context): ComponentProvider? {
      val var4: Pair = this.weakProvider;
      var var2: ComponentProvider = null;
      if (this.weakProvider != null) {
         val var6: WeakReference = this.weakProvider.a() as WeakReference;
         val var7: ComponentProvider = var4.b() as ComponentProvider;
         val var5: Context = var6.get() as Context;
         var2 = null;
         if (var5 != null) {
            var2 = null;
            if (var5 === var1) {
               var2 = var7;
            }
         }
      }

      return var2;
   }

   private fun getOrCreateComponentProvider(context: Context): ComponentProvider {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1064)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:565)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
      //
      // Bytecode:
      // 00: aload 0
      // 01: aload 1
      // 02: invokespecial com/discord/chat/presentation/list/ChatListViewManager.getExistingProvider (Landroid/content/Context;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;
      // 05: astore 2
      // 06: aload 2
      // 07: ifnull 0c
      // 0a: aload 2
      // 0b: areturn
      // 0c: aload 0
      // 0d: getfield com/discord/chat/presentation/list/ChatListViewManager.lock Ljava/lang/Object;
      // 10: astore 2
      // 11: aload 2
      // 12: monitorenter
      // 13: aload 0
      // 14: aload 1
      // 15: invokespecial com/discord/chat/presentation/list/ChatListViewManager.getExistingProvider (Landroid/content/Context;)Lcom/discord/chat/presentation/message/view/botuikit/ComponentProvider;
      // 18: astore 3
      // 19: aload 3
      // 1a: ifnull 21
      // 1d: aload 2
      // 1e: monitorexit
      // 1f: aload 3
      // 20: areturn
      // 21: new com/discord/chat/presentation/message/view/botuikit/ComponentProvider
      // 24: astore 4
      // 26: aload 4
      // 28: aload 1
      // 29: bipush 1
      // 2a: invokespecial com/discord/chat/presentation/message/view/botuikit/ComponentProvider.<init> (Landroid/content/Context;Z)V
      // 2d: new java/lang/ref/WeakReference
      // 30: astore 3
      // 31: aload 3
      // 32: aload 1
      // 33: invokespecial java/lang/ref/WeakReference.<init> (Ljava/lang/Object;)V
      // 36: aload 0
      // 37: aload 3
      // 38: aload 4
      // 3a: invokestatic xa/v.a (Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
      // 3d: putfield com/discord/chat/presentation/list/ChatListViewManager.weakProvider Lkotlin/Pair;
      // 40: aload 2
      // 41: monitorexit
      // 42: aload 4
      // 44: areturn
      // 45: astore 1
      // 46: aload 2
      // 47: monitorexit
      // 48: aload 1
      // 49: athrow
   }

   public open fun addView(parent: ChatListView, child: View, index: Int) {
      val var4: Boolean = var2 is TTIMeasurementView;
      val var5: TTIMeasurementView = var2 as TTIMeasurementView;
      (var2 as TTIMeasurementView).setMeasurementSent(true);
      var1.setOnFirstDrawDoneCallback(new v(var5, var1));
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): ChatListView {
      return new ChatListView(var1, this.getOrCreateComponentProvider(var1));
   }

   protected open fun getDelegate(): DCDChatListManagerDelegate<ChatListView, ChatListViewManager> {
      return this.mDelegate;
   }

   public open fun getName(): String {
      return "DCDChatList";
   }

   public open fun onDropViewInstance(view: ChatListView) {
      var1.cleanup();
      super.onDropViewInstance(var1);
   }

   public companion object {
      public const val NAME: String
   }
}
