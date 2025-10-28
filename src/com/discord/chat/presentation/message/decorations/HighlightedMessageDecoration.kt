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
      // 00: aload 1
      // 01: ldc "canvas"
      // 03: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 06: aload 2
      // 07: ldc "parent"
      // 09: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 0c: aload 3
      // 0d: ldc "state"
      // 0f: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
      // 12: aload 0
      // 13: aload 1
      // 14: aload 2
      // 15: aload 3
      // 16: invokespecial androidx/recyclerview/widget/RecyclerView$ItemDecoration.onDraw (Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V
      // 19: aload 1
      // 1a: invokevirtual android/graphics/Canvas.save ()I
      // 1d: istore 5
      // 1f: aload 2
      // 20: invokevirtual androidx/recyclerview/widget/RecyclerView.getAdapter ()Landroidx/recyclerview/widget/RecyclerView$Adapter;
      // 23: astore 3
      // 24: aload 3
      // 25: ldc "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter"
      // 27: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 2a: aload 3
      // 2b: checkcast com/discord/chat/presentation/list/ChatListAdapter
      // 2e: astore 8
      // 30: aload 2
      // 31: invokevirtual android/view/ViewGroup.getChildCount ()I
      // 34: istore 6
      // 36: bipush 0
      // 37: istore 4
      // 39: iload 4
      // 3b: iload 6
      // 3d: if_icmpge f1
      // 40: aload 2
      // 41: iload 4
      // 43: invokevirtual android/view/ViewGroup.getChildAt (I)Landroid/view/View;
      // 46: astore 3
      // 47: aload 2
      // 48: aload 3
      // 49: invokevirtual androidx/recyclerview/widget/RecyclerView.getChildAdapterPosition (Landroid/view/View;)I
      // 4c: istore 7
      // 4e: iload 7
      // 50: iflt eb
      // 53: iload 7
      // 55: aload 8
      // 57: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItems ()Ljava/util/List; 1
      // 5c: invokeinterface java/util/List.size ()I 1
      // 61: if_icmplt 67
      // 64: goto eb
      // 67: aload 8
      // 69: iload 7
      // 6b: invokeinterface com/discord/chat/presentation/list/ChatListAdapter.getChatListItem (I)Lcom/discord/chat/presentation/list/item/ChatListItem; 2
      // 70: astore 9
      // 72: aload 9
      // 74: ifnonnull b8
      // 77: getstatic com/discord/logging/Log.INSTANCE Lcom/discord/logging/Log;
      // 7a: astore 8
      // 7c: aload 1
      // 7d: invokevirtual java/lang/Object.getClass ()Ljava/lang/Class;
      // 80: invokevirtual java/lang/Class.getSimpleName ()Ljava/lang/String;
      // 83: astore 2
      // 84: aload 2
      // 85: ldc "getSimpleName(...)"
      // 87: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 8a: new java/lang/StringBuilder
      // 8d: astore 3
      // 8e: aload 3
      // 8f: invokespecial java/lang/StringBuilder.<init> ()V
      // 92: aload 3
      // 93: ldc "Missing item in position "
      // 95: invokevirtual java/lang/StringBuilder.append (Ljava/lang/String;)Ljava/lang/StringBuilder;
      // 98: pop
      // 99: aload 3
      // 9a: iload 7
      // 9c: invokevirtual java/lang/StringBuilder.append (I)Ljava/lang/StringBuilder;
      // 9f: pop
      // a0: aload 8
      // a2: aload 2
      // a3: aload 3
      // a4: invokevirtual java/lang/StringBuilder.toString ()Ljava/lang/String;
      // a7: aconst_null
      // a8: bipush 4
      // a9: aconst_null
      // aa: invokestatic com/discord/logging/Log.e$default (Lcom/discord/logging/Log;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
      // ad: aload 1
      // ae: iload 5
      // b0: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // b3: return
      // b4: astore 2
      // b5: goto f8
      // b8: aload 0
      // b9: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // bc: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.getShouldRenderHighlight ()Lkotlin/jvm/functions/Function1;
      // bf: aload 9
      // c1: invokeinterface kotlin/jvm/functions/Function1.invoke (Ljava/lang/Object;)Ljava/lang/Object; 2
      // c6: checkcast java/lang/Boolean
      // c9: invokevirtual java/lang/Boolean.booleanValue ()Z
      // cc: ifeq eb
      // cf: aload 0
      // d0: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // d3: aload 9
      // d5: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.setPaintStyles (Lcom/discord/chat/presentation/list/item/ChatListItem;)V
      // d8: aload 0
      // d9: getfield com/discord/chat/presentation/message/decorations/HighlightedMessageDecoration.drawer Lcom/discord/chat/presentation/message/decorations/HighlightedMessageDrawer;
      // dc: astore 9
      // de: aload 3
      // df: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // e2: aload 9
      // e4: aload 1
      // e5: aload 3
      // e6: bipush 0
      // e7: bipush 0
      // e8: invokevirtual com/discord/chat/presentation/message/decorations/HighlightedMessageDrawer.drawHighlight (Landroid/graphics/Canvas;Landroid/view/View;II)V
      // eb: iinc 4 1
      // ee: goto 39
      // f1: aload 1
      // f2: iload 5
      // f4: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // f7: return
      // f8: aload 1
      // f9: iload 5
      // fb: invokevirtual android/graphics/Canvas.restoreToCount (I)V
      // fe: aload 2
      // ff: athrow
   }
}
