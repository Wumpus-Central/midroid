package com.discord.chat.presentation.message.decorations

import android.graphics.Canvas
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ItemDecoration
import androidx.recyclerview.widget.RecyclerView.State
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nHighlightedMessageDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,39:1\n27#2,7:40\n*S KotlinDebug\n*F\n+ 1 HighlightedMessageDecoration.kt\ncom/discord/chat/presentation/message/decorations/HighlightedMessageDecoration\n*L\n15#1:40,7\n*E\n"])
public abstract class HighlightedMessageDecoration : ItemDecoration {
   private final val drawer: HighlightedMessageDrawer

   open fun HighlightedMessageDecoration(var1: HighlightedMessageDrawer) {
      this.drawer = var1;
   }

   public open fun onDraw(canvas: Canvas, parent: RecyclerView, state: State) {
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
      // 01d: istore 6
      // 01f: aload 2
      // 020: invokevirtual androidx/recyclerview/widget/RecyclerView.getAdapter ()Landroidx/recyclerview/widget/RecyclerView$Adapter;
      // 023: astore 3
      // 024: aload 3
      // 025: ldc "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter"
      // 027: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 02a: aload 3
      // 02b: checkcast com/discord/chat/presentation/list/ChatListAdapter
      // 02e: astore 3
      // 02f: aload 2
      // 030: invokevirtual android/view/ViewGroup.getChildCount ()I
      // 033: istore 5
      // 035: bipush 0
      // 036: istore 4
      // 038: iload 4
      // 03a: iload 5
      // 03c: if_icmpge 0f5
      // 03f: aload 2
      // 040: iload 4
      // 042: invokevirtual android/view/ViewGroup.getChildAt (I)Landroid/view/View;
      // 045: astore 8
      // 047: aload 2
      // 048: aload 8
      // 04a: invokevirtual androidx/recyclerview/widget/RecyclerView.getChildAdapterPosition (Landroid/view/View;)I
      // 04d: istore 7
      // 04f: iload 7
      // 051: iflt 0ef
      // 054: iload 7
      // 056: aload 3
      // 057: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItems ()Ljava/util/List; 1
      // 05c: invokeinterface java/util/List.size ()I 1
      // 061: if_icmplt 067
      // 064: goto 0ef
      // 067: aload 3
      // 068: iload 7
      // 06a: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItem (I)Lcom/discord/chat/presentation/list/item/ChatListItem; 2
      // 06f: astore 9
      // 071: aload 9
      // 073: ifnonnull 0ba
      // 076: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 079: astore 3
      // 07a: aload 1
      // 07b: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07e: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 081: astore 2
      // 082: aload 2
      // 083: ldc "getSimpleName(...)"
      // 085: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 088: new java/lang/StringBuilder
      // 08b: astore 8
      // 08d: aload 8
      // 08f: invokespecial java/lang/StringBuilder.<init> ()V
      // 092: aload 8
      // 094: ldc "Missing item in position "
      // 096: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 099: pop
      // 09a: aload 8
      // 09c: iload 7
      // 09e: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 0a1: pop
      // 0a2: aload 3
      // 0a3: aload 2
      // 0a4: aload 8
      // 0a6: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a9: aconst_null
      // 0aa: bipush 4
      // 0ab: aconst_null
      // 0ac: invokestatic com/discord/logging/Log.e$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0af: aload 1
      // 0b0: iload 6
      // 0b2: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0b5: return
      // 0b6: astore 2
      // 0b7: goto 0fc
      // 0ba: aload 0
      // 0bb: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0be: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.getShouldRenderHighlight ()Lkotlin/jvm/functions/Function1;
      // 0c1: aload 9
      // 0c3: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c8: checkcast java/lang/Boolean
      // 0cb: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0ce: ifeq 0ef
      // 0d1: aload 0
      // 0d2: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0d5: aload 9
      // 0d7: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.setPaintStyles (Lcom/discord/chat/presentation/list/item/ChatListItem;)V
      // 0da: aload 0
      // 0db: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0de: astore 9
      // 0e0: aload 8
      // 0e2: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0e5: aload 9
      // 0e7: aload 1
      // 0e8: aload 8
      // 0ea: bipush 0
      // 0eb: bipush 0
      // 0ec: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.drawHighlight (Landroid/graphics/Canvas;Landroid/view/View;II)V
      // 0ef: iinc 4 1
      // 0f2: goto 038
      // 0f5: aload 1
      // 0f6: iload 6
      // 0f8: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0fb: return
      // 0fc: aload 1
      // 0fd: iload 6
      // 0ff: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 102: aload 2
      // 103: athrow
   }
}
