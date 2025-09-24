package com.discord.chat.presentation.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import cb.K
import cb.d0
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
   cb.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2<CoroutineScope, Continuation, Object>(var1, var0, var2, null) {
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
         val var9: Any = F9.b.e();
         val var5: RecyclerView;
         val var6: RecyclerView.RecycledViewPool;
         val var7: MessageAccessoriesAdapter;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            val var8: java.util.Iterator = this.L$3 as java.util.Iterator;
            var6 = this.L$2 as RecyclerView.RecycledViewPool;
            var5 = this.L$1 as RecyclerView;
            var7 = this.L$0 as MessageAccessoriesAdapter;
            kotlin.c.b(var1);
            var1 = var8;
         } else {
            kotlin.c.b(var1);
            val var13: java.util.Map = ChatListViewFactoryKt.access$getAccessoriesToCreate$p();
            var7 = this.$accessoriesAdapter;
            var5 = this.$recycler;
            var6 = this.$accessoriesViewPool;
            var1 = var13.entrySet().iterator();
         }

         while (var1.hasNext()) {
            val var15: Entry = var1.next() as Entry;
            val var4: Int = (var15.getKey() as java.lang.Number).intValue();
            val var3: Int = (var15.getValue() as java.lang.Number).intValue();
            val var16: ArrayList = new ArrayList();

            for (int var14 = 0; var14 < var3; var14++) {
               val var10: RecyclerView.ViewHolder = var7.createViewHolder(var5, var4);
               val var18: MessagePartViewHolder = var10 as MessagePartViewHolder;
               val var11: View = (var10 as MessagePartViewHolder).itemView;
               if (var11 is FactoryCreatable) {
                  (var11 as FactoryCreatable).onFactoryCreate();
               }

               var16.add(var18);
            }

            val var19: d0 = K.c();
            val var17: Function2 = new Function2<CoroutineScope, Continuation, Object>(var16, var6, null) {
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
                  val var3: Any = F9.b.e();
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

                     val var6: d0 = K.c();
                     val var8: Function2 = new Function2<CoroutineScope, Continuation, Object>(null) {
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
                           F9.b.e();
                           if (this.label == 0) {
                              kotlin.c.b(var1);
                              return Unit.a;
                           } else {
                              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                           }
                        }
                     };
                     this.label = 1;
                     if (cb.f.g(var6, var8, this) === var3) {
                        return var3;
                     }
                  }

                  return Unit.a;
               }
            };
            this.L$0 = var7;
            this.L$1 = var5;
            this.L$2 = var6;
            this.L$3 = var1;
            this.label = 1;
            if (cb.f.g(var19, var17, this) === var9) {
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
   cb.f.d(CoroutineViewUtilsKt.attachedScope(var0, false), K.a(), null, new Function2<CoroutineScope, Continuation, Object>(var2, var1, var0, var3, null) {
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
         val var10: Any = F9.b.e();
         val var5: java.util.Iterator;
         val var6: RecyclerView.RecycledViewPool;
         val var7: java.util.Map;
         val var8: RecyclerView;
         if (this.label != 0) {
            if (this.label != 1) {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            var5 = this.L$4 as java.util.Iterator;
            var6 = this.L$3 as RecyclerView.RecycledViewPool;
            var8 = this.L$2 as RecyclerView;
            val var9: BaseChatListAdapter = this.L$1 as BaseChatListAdapter;
            var7 = this.L$0 as java.util.Map;
            kotlin.c.b(var1);
            var1 = var9;
         } else {
            kotlin.c.b(var1);
            val var15: java.util.Map = ChatListViewFactoryKt.access$getRecycledViewPoolSizes$p();
            var7 = this.$delegateViewTypes;
            var1 = this.$chatListAdapter;
            var8 = this.$recycler;
            var6 = this.$chatListViewPool;
            var5 = var15.entrySet().iterator();
         }

         while (var5.hasNext()) {
            val var11: Entry = var5.next() as Entry;
            var var16: Class = var11.getKey() as Class;
            val var4: Int = (var11.getValue() as java.lang.Number).intValue();
            var16 = (Class)var7.get(var16);
            val var3: Int = (var16 as java.lang.Number).intValue();
            val var18: ArrayList = new ArrayList();

            for (int var14 = 0; var14 < var4; var14++) {
               val var20: RecyclerView.ViewHolder = var1.createViewHolder(var8, var3);
               val var12: View = var20.itemView;
               if (var12 is FactoryCreatable) {
                  (var12 as FactoryCreatable).onFactoryCreate();
               }

               var18.add(var20);
            }

            val var21: d0 = K.c();
            val var19: Function2 = new Function2<CoroutineScope, Continuation, Object>(var18, var6, null) {
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
                  F9.b.e();
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
            this.L$0 = var7;
            this.L$1 = var1;
            this.L$2 = var8;
            this.L$3 = var6;
            this.L$4 = var5;
            this.label = 1;
            if (cb.f.g(var21, var19, this) === var10) {
               return var10;
            }
         }

         return Unit.a;
      }
   }, 2, null);
}
