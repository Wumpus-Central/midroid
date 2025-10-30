package com.discord.chat.presentation.message.decorations

import android.graphics.Canvas
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nHighlightedMessageDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,39:1\n27#2,7:40\n*S KotlinDebug\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n*L\n15#1:40,7\n*E\n"])
public abstract class HighlightedMessageDecoration : RecyclerView.ItemDecoration {
   private final val drawer: HighlightedMessageDrawer

   open fun HighlightedMessageDecoration(var1: HighlightedMessageDrawer) {
      this.drawer = var1;
   }

   public override fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 000: aload 1
      // 001: ldc "canvas"
      // 003: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 006: aload 2
      // 007: ldc "parent"
      // 009: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 00c: aload 3
      // 00d: ldc "state"
      // 00f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 012: aload 0
      // 013: aload 1
      // 014: aload 2
      // 015: aload 3
      // 016: invokespecial androidx/recyclerview/widget/RecyclerView$ItemDecoration.onDraw (Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
      // 019: aload 1
      // 01a: invokevirtual android/graphics/Canvas.save ()I
      // 01d: istore 5
      // 01f: aload 2
      // 020: invokevirtual androidx/recyclerview/widget/RecyclerView.getAdapter ()Landroidx/recyclerview/widget/RecyclerView$Adapter;
      // 023: astore 3
      // 024: aload 3
      // 025: ldc "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter"
      // 027: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 02a: aload 3
      // 02b: checkcast com/discord/chat/presentation/list/ChatListAdapter
      // 02e: astore 8
      // 030: aload 2
      // 031: invokevirtual android/view/ViewGroup.getChildCount ()I
      // 034: istore 6
      // 036: bipush 0
      // 037: istore 4
      // 039: iload 4
      // 03b: iload 6
      // 03d: if_icmpge 0f4
      // 040: aload 2
      // 041: iload 4
      // 043: invokevirtual android/view/ViewGroup.getChildAt (I)Landroid/view/View;
      // 046: astore 3
      // 047: aload 2
      // 048: aload 3
      // 049: invokevirtual androidx/recyclerview/widget/RecyclerView.getChildAdapterPosition (Landroid/view/View;)I
      // 04c: istore 7
      // 04e: iload 7
      // 050: iflt 0ee
      // 053: iload 7
      // 055: aload 8
      // 057: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItems ()Ljava/util/List; 1
      // 05c: invokeinterface java/util/List.size ()I 1
      // 061: if_icmplt 067
      // 064: goto 0ee
      // 067: aload 8
      // 069: iload 7
      // 06b: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItem (I)Lcom/discord/chat/presentation/list/item/ChatListItem; 2
      // 070: astore 9
      // 072: aload 9
      // 074: ifnonnull 0bb
      // 077: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 07a: astore 3
      // 07b: aload 1
      // 07c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07f: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 082: astore 2
      // 083: aload 2
      // 084: ldc "getSimpleName(...)"
      // 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 089: new java/lang/StringBuilder
      // 08c: astore 8
      // 08e: aload 8
      // 090: invokespecial java/lang/StringBuilder.<init> ()V
      // 093: aload 8
      // 095: ldc "Missing item in position "
      // 097: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 09a: pop
      // 09b: aload 8
      // 09d: iload 7
      // 09f: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a2: pop
      // 0a3: aload 3
      // 0a4: aload 2
      // 0a5: aload 8
      // 0a7: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0aa: aconst_null
      // 0ab: bipush 4
      // 0ac: aconst_null
      // 0ad: invokestatic com/discord/logging/Log.e$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0b0: aload 1
      // 0b1: iload 5
      // 0b3: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0b6: return
      // 0b7: astore 2
      // 0b8: goto 0fb
      // 0bb: aload 0
      // 0bc: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0bf: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.getShouldRenderHighlight ()Lkotlin/jvm/functions/Function1;
      // 0c2: aload 9
      // 0c4: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c9: checkcast java/lang/Boolean
      // 0cc: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cf: ifeq 0ee
      // 0d2: aload 0
      // 0d3: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0d6: aload 9
      // 0d8: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.setPaintStyles (Lcom/discord/chat/presentation/list/item/ChatListItem;)V
      // 0db: aload 0
      // 0dc: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0df: astore 9
      // 0e1: aload 3
      // 0e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0e5: aload 9
      // 0e7: aload 1
      // 0e8: aload 3
      // 0e9: bipush 0
      // 0ea: bipush 0
      // 0eb: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.drawHighlight (Landroid/graphics/Canvas;Landroid/view/View;II)V
      // 0ee: iinc 4 1
      // 0f1: goto 039
      // 0f4: aload 1
      // 0f5: iload 5
      // 0f7: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0fa: return
      // 0fb: aload 1
      // 0fc: iload 5
      // 0fe: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 101: aload 2
      // 102: athrow
   }
}
