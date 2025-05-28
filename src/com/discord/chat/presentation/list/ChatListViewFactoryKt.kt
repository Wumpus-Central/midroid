package com.discord.chat.presentation.list

import Aa.K
import Aa.d0
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
import kotlinx.coroutines.CoroutineScope

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
   kotlin.jvm.internal.q.h(var0, "recycler");
   kotlin.jvm.internal.q.h(var1, "accessoriesAdapter");
   kotlin.jvm.internal.q.h(var2, "accessoriesViewPool");
   Aa.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2(var1, var0, var2, null) {
      final MessageAccessoriesAdapter $accessoriesAdapter;
      final RecyclerView.RecycledViewPool $accessoriesViewPool;
      final RecyclerView $recycler;
      Object L$0;
      Object L$1;
      Object L$2;
      Object L$3;
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

      public final Object invokeSuspend(Object var1) {
         val var9: Any = Y8.b.e();
         val var5: java.util.Iterator;
         val var6: RecyclerView;
         val var7: MessageAccessoriesAdapter;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var5 = this.L$3 as java.util.Iterator;
            val var8: RecyclerView.RecycledViewPool = this.L$2 as RecyclerView.RecycledViewPool;
            var6 = this.L$1 as RecyclerView;
            var7 = this.L$0 as MessageAccessoriesAdapter;
            kotlin.c.b(var1);
            var1 = var8;
         } else {
            kotlin.c.b(var1);
            val var14: java.util.Map = ChatListViewFactoryKt.access$getAccessoriesToCreate$p();
            var7 = this.$accessoriesAdapter;
            var6 = this.$recycler;
            var1 = this.$accessoriesViewPool;
            var5 = var14.entrySet().iterator();
         }

         while (var5.hasNext()) {
            val var15: Entry = var5.next() as Entry;
            val var3: Int = (var15.getKey() as java.lang.Number).intValue();
            val var4: Int = (var15.getValue() as java.lang.Number).intValue();
            val var16: ArrayList = new ArrayList();

            for (int var13 = 0; var13 < var4; var13++) {
               val var10: RecyclerView.ViewHolder = var7.createViewHolder(var6, var3);
               kotlin.jvm.internal.q.g(var10, "createViewHolder(...)");
               val var11: MessagePartViewHolder = var10 as MessagePartViewHolder;
               val var18: View = (var10 as MessagePartViewHolder).itemView;
               kotlin.jvm.internal.q.g((var10 as MessagePartViewHolder).itemView, "itemView");
               if (var18 is FactoryCreatable) {
                  (var18 as FactoryCreatable).onFactoryCreate();
               }

               var16.add(var11);
            }

            val var19: d0 = K.c();
            val var17: Function2 = new Function2(var16, var1, null) {
               final RecyclerView.RecycledViewPool $accessoriesViewPool;
               final java.util.List<RecyclerView.ViewHolder> $items;
               int label;

               {
                  super(2, var3x);
                  this.$items = var1;
                  this.$accessoriesViewPool = var2x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$items, this.$accessoriesViewPool, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  val var3: Any = Y8.b.e();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var1);
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.$accessoriesViewPool;
                     val var7: java.util.Iterator = this.$items.iterator();

                     while (var7.hasNext()) {
                        var1.putRecycledView(var7.next() as RecyclerView.ViewHolder);
                     }

                     val var8: d0 = K.c();
                     val var6: Function2 = new Function2(null) {
                        int label;

                        {
                           super(2, var1);
                        }

                        public final Continuation create(Object var1, Continuation var2) {
                           return new <anonymous constructor>(var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           Y8.b.e();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.label = 1;
                     if (Aa.f.g(var8, var6, this) === var3) {
                        return var3;
                     }
                  }

                  return Unit.a;
               }
            };
            this.L$0 = var7;
            this.L$1 = var6;
            this.L$2 = var1;
            this.L$3 = var5;
            this.label = 1;
            if (Aa.f.g(var19, var17, this) === var9) {
               return var9;
            }
         }

         return Unit.a;
      }
   }, 2, null);
}

public fun fillChatList(
   recycler: RecyclerView,
   chatListAdapter: BaseChatListAdapter,
   delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>,
   chatListViewPool: RecycledViewPool
) {
   kotlin.jvm.internal.q.h(var0, "recycler");
   kotlin.jvm.internal.q.h(var1, "chatListAdapter");
   kotlin.jvm.internal.q.h(var2, "delegateViewTypes");
   kotlin.jvm.internal.q.h(var3, "chatListViewPool");
   Aa.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2(var2, var1, var0, var3, null) {
      final BaseChatListAdapter $chatListAdapter;
      final RecyclerView.RecycledViewPool $chatListViewPool;
      final java.util.Map<Class<? extends BaseChatListItemDelegate<? extends ChatListItem, ? extends View>>, Integer> $delegateViewTypes;
      final RecyclerView $recycler;
      Object L$0;
      Object L$1;
      Object L$2;
      Object L$3;
      Object L$4;
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

      public final Object invokeSuspend(Object var1) {
         val var10: Any = Y8.b.e();
         val var5: java.util.Map;
         val var6: RecyclerView;
         val var7: RecyclerView.RecycledViewPool;
         val var8: BaseChatListAdapter;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            val var9: java.util.Iterator = this.L$4 as java.util.Iterator;
            var7 = this.L$3 as RecyclerView.RecycledViewPool;
            var6 = this.L$2 as RecyclerView;
            var8 = this.L$1 as BaseChatListAdapter;
            var5 = this.L$0 as java.util.Map;
            kotlin.c.b(var1);
            var1 = var9;
         } else {
            kotlin.c.b(var1);
            val var14: java.util.Map = ChatListViewFactoryKt.access$getRecycledViewPoolSizes$p();
            var5 = this.$delegateViewTypes;
            var8 = this.$chatListAdapter;
            var6 = this.$recycler;
            var7 = this.$chatListViewPool;
            var1 = var14.entrySet().iterator();
         }

         while (var1.hasNext()) {
            val var16: Entry = var1.next() as Entry;
            val var11: Class = var16.getKey() as Class;
            val var4: Int = (var16.getValue() as java.lang.Number).intValue();
            var var17: java.util.List = (java.util.List)var5.get(var11);
            kotlin.jvm.internal.q.e(var17);
            val var3: Int = (var17 as java.lang.Number).intValue();
            var17 = new ArrayList();

            for (int var15 = 0; var15 < var4; var15++) {
               val var20: RecyclerView.ViewHolder = var8.createViewHolder(var6, var3);
               val var12: View = var20.itemView;
               kotlin.jvm.internal.q.g(var20.itemView, "itemView");
               if (var12 is FactoryCreatable) {
                  (var12 as FactoryCreatable).onFactoryCreate();
               }

               var17.add(var20);
            }

            val var21: d0 = K.c();
            val var19: Function2 = new Function2(var17, var7, null) {
               final RecyclerView.RecycledViewPool $chatListViewPool;
               final java.util.List<RecyclerView.ViewHolder> $items;
               int label;

               {
                  super(2, var3x);
                  this.$items = var1;
                  this.$chatListViewPool = var2x;
               }

               public final Continuation create(Object var1, Continuation var2) {
                  return new <anonymous constructor>(this.$items, this.$chatListViewPool, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  Y8.b.e();
                  if (this.label != 0) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.$chatListViewPool;
                     val var4: java.util.Iterator = this.$items.iterator();

                     while (var4.hasNext()) {
                        var1.putRecycledView(var4.next() as RecyclerView.ViewHolder);
                     }

                     return Unit.a;
                  }
               }
            };
            this.L$0 = var5;
            this.L$1 = var8;
            this.L$2 = var6;
            this.L$3 = var7;
            this.L$4 = var1;
            this.label = 1;
            if (Aa.f.g(var21, var19, this) === var10) {
               return var10;
            }
         }

         return Unit.a;
      }
   }, 2, null);
}
