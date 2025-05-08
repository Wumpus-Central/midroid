package com.discord.chat.presentation.list

import X9.K
import X9.d0
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.MessageAccessoriesAdapter
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import java.util.ArrayList
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlinx.coroutines.CoroutineScope
import o8.s

private final val accessoriesToCreate: Map<Int, Int>
private final val recycledViewPoolSizes: Map<out Class<out BaseChatListItemDelegate<out ChatListItem, *>>, Int>

@JvmSynthetic
fun `access$getAccessoriesToCreate$p`(): java.util.Map {
   return accessoriesToCreate;
}

@JvmSynthetic
fun `access$getRecycledViewPoolSizes$p`(): java.util.Map {
   return recycledViewPoolSizes;
}

public fun fillAccessories(recycler: RecyclerView, accessoriesAdapter: MessageAccessoriesAdapter, accessoriesViewPool: RecycledViewPool) {
   q.h(var0, "recycler");
   q.h(var1, "accessoriesAdapter");
   q.h(var2, "accessoriesViewPool");
   X9.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2(var1, var0, var2, null) {
      final MessageAccessoriesAdapter $accessoriesAdapter;
      final RecyclerView.RecycledViewPool $accessoriesViewPool;
      final RecyclerView $recycler;
      int I$0;
      int I$1;
      int I$2;
      Object L$0;
      Object L$1;
      Object L$2;
      Object L$3;
      Object L$4;
      int label;

      {
         super(2, var4);
         this.$accessoriesAdapter = var1;
         this.$recycler = var2x;
         this.$accessoriesViewPool = var3;
      }

      public final Continuation create(Object var1, Continuation var2) {
         return new <anonymous constructor>(this.$accessoriesAdapter, this.$recycler, this.$accessoriesViewPool, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      public final Object invokeSuspend(Object var1) {
         val var10: Any = v8.b.e();
         var var3: Int;
         var var4: Int;
         var var5: RecyclerView;
         val var6: MessageAccessoriesAdapter;
         val var7: java.util.Iterator;
         var var8: Any;
         var var15: Int;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var15 = this.I$2;
            var3 = this.I$1;
            var4 = this.I$0;
            var8 = this.L$4 as java.util.List;
            var7 = this.L$3 as java.util.Iterator;
            val var9: RecyclerView.RecycledViewPool = this.L$2 as RecyclerView.RecycledViewPool;
            var5 = this.L$1 as RecyclerView;
            var6 = this.L$0 as MessageAccessoriesAdapter;
            s.b(var1);
            var1 = var9;
            var15++;
         } else {
            s.b(var1);
            val var19: java.util.Map = ChatListViewFactoryKt.access$getAccessoriesToCreate$p();
            var6 = this.$accessoriesAdapter;
            val var13: RecyclerView = this.$recycler;
            val var17: RecyclerView.RecycledViewPool = this.$accessoriesViewPool;
            var7 = var19.entrySet().iterator();
            if (!var7.hasNext()) {
               return Unit.a;
            }

            var8 = var7.next() as Entry;
            var4 = (var8.getKey() as java.lang.Number).intValue();
            var3 = (var8.getValue() as java.lang.Number).intValue();
            var8 = new ArrayList();
            var15 = 0;
            var5 = var13;
            var1 = var17;
         }

         while (true) {
            while (var15 >= var3) {
               if (!var7.hasNext()) {
                  return Unit.a;
               }

               var8 = var7.next() as Entry;
               var4 = (var8.getKey() as java.lang.Number).intValue();
               var3 = (var8.getValue() as java.lang.Number).intValue();
               var8 = new ArrayList();
               var15 = 0;
               var5 = var5;
               var1 = var1;
            }

            val var25: RecyclerView.ViewHolder = var6.createViewHolder(var5, var4);
            q.g(var25, "createViewHolder(...)");
            val var11: MessagePartViewHolder = var25 as MessagePartViewHolder;
            val var26: View = (var25 as MessagePartViewHolder).itemView;
            q.g((var25 as MessagePartViewHolder).itemView, "itemView");
            if (var26 is FactoryCreatable) {
               (var26 as FactoryCreatable).onFactoryCreate();
            }

            val var27: d0 = K.c();
            val var28: Function2 = new Function2(var1, var11, null) {
               final RecyclerView.RecycledViewPool $accessoriesViewPool;
               final MessagePartViewHolder $viewHolder;
               int label;

               {
                  super(2, var3x);
                  this.$accessoriesViewPool = var1;
                  this.$viewHolder = var2x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$accessoriesViewPool, this.$viewHolder, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  v8.b.e();
                  if (this.label == 0) {
                     s.b(var1);
                     this.$accessoriesViewPool.putRecycledView(this.$viewHolder);
                     return Unit.a;
                  } else {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }
               }
            };
            this.L$0 = var6;
            this.L$1 = var5;
            this.L$2 = var1;
            this.L$3 = var7;
            this.L$4 = var8;
            this.I$0 = var4;
            this.I$1 = var3;
            this.I$2 = var15;
            this.label = 1;
            if (X9.f.g(var27, var28, this) === var10) {
               return var10;
            }

            var15++;
         }
      }
   }, 2, null);
}

public fun fillChatList(
   recycler: RecyclerView,
   chatListAdapter: BaseChatListAdapter,
   delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>,
   chatListViewPool: RecycledViewPool
) {
   q.h(var0, "recycler");
   q.h(var1, "chatListAdapter");
   q.h(var2, "delegateViewTypes");
   q.h(var3, "chatListViewPool");
   X9.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2(var2, var1, var0, var3, null) {
      final BaseChatListAdapter $chatListAdapter;
      final RecyclerView.RecycledViewPool $chatListViewPool;
      final java.util.Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> $delegateViewTypes;
      final RecyclerView $recycler;
      int I$0;
      int I$1;
      int I$2;
      Object L$0;
      Object L$1;
      Object L$2;
      Object L$3;
      Object L$4;
      Object L$5;
      int label;

      {
         super(2, var5);
         this.$delegateViewTypes = var1;
         this.$chatListAdapter = var2x;
         this.$recycler = var3;
         this.$chatListViewPool = var4;
      }

      public final Continuation create(Object var1, Continuation var2) {
         return new <anonymous constructor>(this.$delegateViewTypes, this.$chatListAdapter, this.$recycler, this.$chatListViewPool, var2);
      }

      public final Object invoke(CoroutineScope var1, Continuation var2x) {
         return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
      }

      // $VF: Irreducible bytecode was duplicated to produce valid code
      public final Object invokeSuspend(Object var1) {
         val var12: Any = v8.b.e();
         var var3: Int;
         var var4: Int;
         var var5: RecyclerView;
         var var6: BaseChatListAdapter;
         var var7: java.util.Map;
         val var8: java.util.Iterator;
         var var9: Any;
         var var16: Int;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var16 = this.I$2;
            var3 = this.I$1;
            var4 = this.I$0;
            var9 = this.L$5 as java.util.List;
            var8 = this.L$4 as java.util.Iterator;
            val var10: RecyclerView.RecycledViewPool = this.L$3 as RecyclerView.RecycledViewPool;
            var5 = this.L$2 as RecyclerView;
            var6 = this.L$1 as BaseChatListAdapter;
            var7 = this.L$0 as java.util.Map;
            s.b(var1);
            var1 = var10;
            var16++;
         } else {
            s.b(var1);
            val var24: java.util.Map = ChatListViewFactoryKt.access$getRecycledViewPoolSizes$p();
            val var14: java.util.Map = this.$delegateViewTypes;
            val var18: BaseChatListAdapter = this.$chatListAdapter;
            val var20: RecyclerView = this.$recycler;
            val var22: RecyclerView.RecycledViewPool = this.$chatListViewPool;
            var8 = var24.entrySet().iterator();
            if (!var8.hasNext()) {
               return Unit.a;
            }

            val var32: Entry = var8.next() as Entry;
            var9 = var32.getKey() as Class;
            var4 = (var32.getValue() as java.lang.Number).intValue();
            var9 = var14.get(var9);
            q.e(var9);
            var3 = (var9 as java.lang.Number).intValue();
            val var11: ArrayList = new ArrayList();
            var16 = 0;
            var7 = var14;
            var1 = var22;
            var9 = var11;
            var5 = var20;
            var6 = var18;
         }

         while (true) {
            while (var16 >= var4) {
               if (!var8.hasNext()) {
                  return Unit.a;
               }

               val var35: Entry = var8.next() as Entry;
               var9 = var35.getKey() as Class;
               var4 = (var35.getValue() as java.lang.Number).intValue();
               var9 = var7.get(var9);
               q.e(var9);
               var3 = (var9 as java.lang.Number).intValue();
               val var39: ArrayList = new ArrayList();
               var16 = 0;
               var7 = var7;
               var1 = var1;
               var9 = var39;
               var5 = var5;
               var6 = var6;
            }

            val var40: RecyclerView.ViewHolder = var6.createViewHolder(var5, var3);
            q.g(var40, "createViewHolder(...)");
            val var37: View = var40.itemView;
            q.g(var40.itemView, "itemView");
            if (var37 is FactoryCreatable) {
               (var37 as FactoryCreatable).onFactoryCreate();
            }

            val var38: d0 = K.c();
            val var41: Function2 = new Function2(var1, var40, null) {
               final RecyclerView.RecycledViewPool $chatListViewPool;
               final RecyclerView.ViewHolder $viewHolder;
               int label;

               {
                  super(2, var3x);
                  this.$chatListViewPool = var1;
                  this.$viewHolder = var2x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$chatListViewPool, this.$viewHolder, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  v8.b.e();
                  if (this.label == 0) {
                     s.b(var1);
                     this.$chatListViewPool.putRecycledView(this.$viewHolder);
                     return Unit.a;
                  } else {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }
               }
            };
            this.L$0 = var7;
            this.L$1 = var6;
            this.L$2 = var5;
            this.L$3 = var1;
            this.L$4 = var8;
            this.L$5 = var9;
            this.I$0 = var4;
            this.I$1 = var3;
            this.I$2 = var16;
            this.label = 1;
            if (X9.f.g(var38, var41, this) === var12) {
               return var12;
            }

            var16++;
         }
      }
   }, 2, null);
}
