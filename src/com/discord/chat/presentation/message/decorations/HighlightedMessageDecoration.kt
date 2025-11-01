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
      // 01d: istore 5
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
      // 033: istore 6
      // 035: bipush 0
      // 036: istore 4
      // 038: iload 4
      // 03a: iload 6
      // 03c: if_icmpge 0f2
      // 03f: aload 2
      // 040: iload 4
      // 042: invokevirtual android/view/ViewGroup.getChildAt (I)Landroid/view/View;
      // 045: astore 8
      // 047: aload 2
      // 048: aload 8
      // 04a: invokevirtual androidx/recyclerview/widget/RecyclerView.getChildAdapterPosition (Landroid/view/View;)I
      // 04d: istore 7
      // 04f: iload 7
      // 051: iflt 0ec
      // 054: iload 7
      // 056: aload 3
      // 057: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItems ()Ljava/util/List; 1
      // 05c: invokeinterface java/util/List.size ()I 1
      // 061: if_icmplt 067
      // 064: goto 0ec
      // 067: aload 3
      // 068: iload 7
      // 06a: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItem (I)Lcom/discord/chat/presentation/list/item/ChatListItem; 2
      // 06f: astore 9
      // 071: aload 9
      // 073: ifnonnull 0b7
      // 076: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 079: astore 8
      // 07b: aload 1
      // 07c: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 07f: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 082: astore 2
      // 083: aload 2
      // 084: ldc "getSimpleName(...)"
      // 086: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 089: new java/lang/StringBuilder
      // 08c: astore 3
      // 08d: aload 3
      // 08e: invokespecial java/lang/StringBuilder.<init> ()V
      // 091: aload 3
      // 092: ldc "Missing item in position "
      // 094: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 097: pop
      // 098: aload 3
      // 099: iload 7
      // 09b: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 09e: pop
      // 09f: aload 8
      // 0a1: aload 2
      // 0a2: aload 3
      // 0a3: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // 0a6: aconst_null
      // 0a7: bipush 4
      // 0a8: aconst_null
      // 0a9: invokestatic com/discord/logging/Log.e$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // 0ac: aload 1
      // 0ad: iload 5
      // 0af: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0b2: return
      // 0b3: astore 2
      // 0b4: goto 0f9
      // 0b7: aload 0
      // 0b8: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0bb: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.getShouldRenderHighlight ()Lkotlin/jvm/functions/Function1;
      // 0be: aload 9
      // 0c0: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // 0c5: checkcast java/lang/Boolean
      // 0c8: invokevirtual java/lang/Boolean.booleanValue ()Z
      // 0cb: ifeq 0ec
      // 0ce: aload 0
      // 0cf: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0d2: aload 9
      // 0d4: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.setPaintStyles (Lcom/discord/chat/presentation/list/item/ChatListItem;)V
      // 0d7: aload 0
      // 0d8: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // 0db: astore 9
      // 0dd: aload 8
      // 0df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 0e2: aload 9
      // 0e4: aload 1
      // 0e5: aload 8
      // 0e7: bipush 0
      // 0e8: bipush 0
      // 0e9: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.drawHighlight (Landroid/graphics/Canvas;Landroid/view/View;II)V
      // 0ec: iinc 4 1
      // 0ef: goto 038
      // 0f2: aload 1
      // 0f3: iload 5
      // 0f5: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0f8: return
      // 0f9: aload 1
      // 0fa: iload 5
      // 0fc: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // 0ff: aload 2
      // 100: athrow
   }
}
