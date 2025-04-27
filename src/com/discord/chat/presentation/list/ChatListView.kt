package com.discord.chat.presentation.list

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnLayoutChangeListener
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ChatListUpdate
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SeparatorChatListItem
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.crash_reporting.CrashReporting
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.measure.ViewMeasureExtensionsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.threading.ThreadUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.recycler_view.scroller.Scroller
import com.discord.recycler_view.scroller.Scroller.TargetAlignment
import f8.s
import java.lang.reflect.Field
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q
import kotlin.jvm.internal.Ref.BooleanRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

public class ChatListView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RecyclerView {
   private final val chatListAdapter: ChannelChatListAdapter
   private final val componentProvider: ComponentProvider
   private final var currentChangesetUpdateId: Int
   private final lateinit var dataSource: com.discord.chat.presentation.list.ChatListView.DataSource
   private final lateinit var eventHandler: ChatEventHandler
   private final var isFirstLayout: Boolean
   private final val linearLayoutManager: TransitionResilientLinearLayoutManager
   private final val scrollStateObserver: ChatScrollStateObserver
   private final val scroller: Scroller
   private final var updateSubscriptionJob: Job?
   private final val verticalSpacingItemDecoration: VerticalSpacingItemDecoration

   fun ChatListView(var1: Context) {
      q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ChatListView(var1: Context, var2: AttributeSet) {
      q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      q.h(var1, "context");
      super(var1, var2, var3);
      val var6: ChannelChatListAdapter = new ChannelChatListAdapter(new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            ChatListView.access$measureAndLayout(this.this$0);
         }
      }, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ChatEventHandler invoke() {
            val var2: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
            var var1: ChatEventHandler = var2;
            if (var2 == null) {
               q.y("eventHandler");
               var1 = null;
            }

            return var1;
         }
      }, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final ComponentProvider invoke() {
            return ChatListView.access$getComponentProvider$p(this.this$0);
         }
      });
      this.chatListAdapter = var6;
      this.componentProvider = new ComponentProvider(var1, true);
      this.scroller = new Scroller(this);
      val var5: TransitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(var1, 0, false, 6, null);
      this.linearLayoutManager = var5;
      val var4: VerticalSpacingItemDecoration = new VerticalSpacingItemDecoration(
         SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(30), false, 8, null
      );
      this.verticalSpacingItemDecoration = var4;
      this.scrollStateObserver = new ChatScrollStateObserver(new Function1(this) {
         final ChatListView this$0;

         {
            super(1);
            this.this$0 = var1;
         }

         public final void invoke(ScrollState var1) {
            q.h(var1, "scrollState");
            if (ChatListView.access$getEventHandler$p(this.this$0) != null) {
               val var3: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
               var var2: ChatEventHandler = var3;
               if (var3 == null) {
                  q.y("eventHandler");
                  var2 = null;
               }

               var2.onScrollStateChanged(var1, ChatListView.access$getCurrentChangesetUpdateId$p(this.this$0));
            }
         }
      });
      this.isFirstLayout = true;
      this.setRecycledViewPool(sharedPool);
      ChatListUtilsKt.configureMessageRecyclerView(this, var1, var4);
      this.setLayoutManager(var5);
      this.setAdapter(var6);
      this.addScrollStateListener();
      var6.configureRecycledViewPoolSizes();
      var6.fillAdapter(this);
      this.setItemAnimator(null);
      new ChatListItemTouchHelper(new SwipeHelper(var1, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            this.this$0.setClipToPadding(false);
         }
      }, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            this.this$0.setClipToPadding(true);
         }
      })).attachToRecyclerView(this);
      this.setClipChildren(false);
   }

   private fun addScrollStateListener() {
      this.addOnScrollListener(this.scrollStateObserver);
   }

   private fun measureAndLayout() {
      try {
         q.f(this, "null cannot be cast to non-null type android.view.View");
         ViewMeasureExtensionsKt.measureAndLayout(this);
      } catch (var6: IllegalArgumentException) {
         val var2: Field = RecyclerView.class.getDeclaredField("mState");
         var2.setAccessible(true);
         val var7: Any = var2.get(this);
         val var3: CrashReporting = CrashReporting.INSTANCE;
         val var5: ChatListAdapterUpdateLog = ChatListAdapterUpdateLog.INSTANCE;
         val var4: StringBuilder = new StringBuilder();
         var4.append("About to crash because of ChatList, dumping update log:\n");
         var4.append(var5);
         var4.append("\n Recycler State: ");
         var4.append(var7);
         CrashReporting.addBreadcrumb$default(var3, var4.toString(), null, null, 6, null);
         throw var6;
      }
   }

   private fun onChatListUpdate(update: ChatListUpdate) {
      if (ThreadUtilsKt.isOnMainThread()) {
         if (var1.getAction() is ChatListAction.Clear) {
            access$setFirstLayout$p(this, true);
         }

         access$setCurrentChangesetUpdateId$p(this, var1.getChangesetUpdateId());
         val var4: BooleanRef = new BooleanRef();
         ChannelChatListAdapter.setItems$default(
            access$getChatListAdapter$p(this),
            var1.getItems(),
            var1.getListOperations(),
            new Function1(var4, this, var1) {
               final ChatListUpdate $update;
               final BooleanRef $wasAtBottom;
               final ChatListView this$0;

               {
                  super(1);
                  this.$wasAtBottom = var1;
                  this.this$0 = var2;
                  this.$update = var3;
               }

               public final void invoke(boolean var1) {
                  val var4: BooleanRef = this.$wasAtBottom;
                  val var5: ScrollState = ChatListView.access$getScrollStateObserver$p(this.this$0).getScrollState();
                  var var2: Boolean = false;
                  if (var5 != null) {
                     var2 = false;
                     if (var5.isAtBottom()) {
                        var2 = true;
                     }
                  }

                  var4.j = var2;
                  if (this.$update.getAction() is ChatListAction.Clear) {
                     ChatListView.access$getScrollStateObserver$p(this.this$0).stopWatching();
                     if (!var1) {
                        this.this$0.removeAllViews();
                     }
                  }
               }
            },
            new Function0(var1, this, var4) {
               final ChatListUpdate $update;
               final BooleanRef $wasAtBottom;
               final ChatListView this$0;

               {
                  super(0);
                  this.$update = var1;
                  this.this$0 = var2;
                  this.$wasAtBottom = var3;
               }

               public final void invoke() {
                  if (this.$update.getAction() !is ChatListAction.Clear) {
                     ChatListView.access$getScrollStateObserver$p(this.this$0).startWatching(this.this$0, ChatScrollStateObserver.EmitMode.NO);
                     ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .updateFirstAndLastMessageVisibilityData(this.this$0);
                     val var1: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePosition();
                     val var6: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePercentVisible();
                     val var2: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePosition();
                     val var7: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePercentVisible();
                     if (ChatListView.access$isFirstLayout$p(this.this$0) && var1 >= 0 && var2 >= 0) {
                        ChatListView.access$setFirstLayout$p(this.this$0, false);
                        val var3: Boolean = ChatListView.access$getLinearLayoutManager$p(this.this$0).getReverseLayout();
                        var var4: ChatEventHandler = null;
                        if (var3) {
                           var4 = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var4 == null) {
                              q.y("eventHandler");
                              var4 = null;
                           }

                           var4.onFirstLayout(var2, var7, var1, var6);
                        } else {
                           val var12: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var12 == null) {
                              q.y("eventHandler");
                           } else {
                              var4 = var12;
                           }

                           var4.onFirstLayout(var1, var6, var2, var7);
                        }
                     }
                  }

                  var var9: ChatListAction = this.$update.getAction();
                  if (var9 is ChatListAction.ScrollTo) {
                     val var10: ChatListItem = i.i0(this.$update.getItems(), (this.$update.getAction() as ChatListAction.ScrollTo).getPosition()) as ChatListItem;
                     if (var10 is SeparatorChatListItem) {
                        var9 = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
                     } else if (var10 is SummarySeparatorChatListItem) {
                        if ((var10 as SummarySeparatorChatListItem).isBeforeContent()) {
                           var9 = new Scroller.TargetAlignment.Top(SizeUtilsKt.getDpToPx(4));
                        } else {
                           var9 = Scroller.TargetAlignment.Center.INSTANCE;
                        }
                     } else {
                        var9 = new Scroller.TargetAlignment.Top(ChatListView.Companion.getMESSAGE_TOP_SCROLL_OFFSET_PX());
                     }

                     this.this$0
                        .scrollToPosition(
                           (this.$update.getAction() as ChatListAction.ScrollTo).getPosition(),
                           var9,
                           (this.$update.getAction() as ChatListAction.ScrollTo).getAnimate(),
                           (this.$update.getAction() as ChatListAction.ScrollTo).getHighlight()
                        );
                  } else if (var9 is ChatListAction.StickToBottomIfAtBottom) {
                     if (this.$wasAtBottom.j) {
                        this.this$0.scrollToPosition(0, Scroller.TargetAlignment.Anywhere.INSTANCE, false, false);
                     }
                  } else if (var9 !is ChatListAction.Clear && var9 is ChatListAction.Noop) {
                     ChatListView.access$getScrollStateObserver$p(this.this$0).startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
                  }
               }
            },
            null,
            16,
            null
         );
      } else {
         val var3: Thread = Thread.currentThread();
         val var2: StringBuilder = new StringBuilder();
         var2.append("Expected to be on android main thread. Current: ");
         var2.append(var3);
         throw new IllegalStateException(var2.toString().toString());
      }
   }

   private fun removeScrollStateListener() {
      this.removeOnScrollListener(this.scrollStateObserver);
   }

   private fun sync() {
      if (this.updateSubscriptionJob != null) {
         kotlinx.coroutines.Job.a.a(this.updateSubscriptionJob, null, 1, null);
      }

      this.updateSubscriptionJob = O9.f.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new Function2(this, null) {
         int label;
         final ChatListView this$0;

         {
            super(2, var2x);
            this.this$0 = var1;
         }

         public final Continuation create(Object var1, Continuation var2) {
            return new <anonymous constructor>(this.this$0, var2);
         }

         public final Object invoke(CoroutineScope var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            val var4: Any = l8.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               s.b(var1);
            } else {
               s.b(var1);
               val var5: BooleanRef = new BooleanRef();
               var5.j = true;
               val var3: ChatListView.DataSource = ChatListView.access$getDataSource$p(this.this$0);
               var1 = var3;
               if (var3 == null) {
                  q.y("dataSource");
                  var1 = null;
               }

               val var7: Flow = var1.getUpdatesFlow();
               val var8: FlowCollector = new FlowCollector(var5, this.this$0) {
                  final BooleanRef $isFirstUpdate;
                  final ChatListView this$0;

                  {
                     this.$isFirstUpdate = var1;
                     this.this$0 = var2x;
                  }

                  public final Object emit(ChatListUpdate var1, Continuation var2x) {
                     if (this.$isFirstUpdate.j) {
                        ChatListView.access$onChatListUpdate(this.this$0, ChatListUpdate.copy$default(var1, null, null, null, 0, 11, null));
                        this.$isFirstUpdate.j = false;
                     } else {
                        ChatListView.access$onChatListUpdate(this.this$0, var1);
                     }

                     return Unit.a;
                  }
               };
               this.label = 1;
               if (var7.collect(var8, this) === var4) {
                  return var4;
               }
            }

            return Unit.a;
         }
      }, 3, null);
   }

   public fun cleanup() {
      this.removeScrollStateListener();
      this.stopScroll();
   }

   protected override fun onAttachedToWindow() {
      super.onAttachedToWindow();
      this.sync();
      this.addOnLayoutChangeListener(new OnLayoutChangeListener(this) {
         final ChatListView this$0;

         {
            this.this$0 = var1;
         }

         public void onLayoutChange(View var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
            var1.removeOnLayoutChangeListener(this);
            val var10: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
            var var11: ChatEventHandler = var10;
            if (var10 == null) {
               q.y("eventHandler");
               var11 = null;
            }

            var11.onCompleteFirstLayout();
         }
      });
   }

   protected override fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.chatListAdapter.onHostDetached();
   }

   public fun scrollToPosition(position: Int, targetAlignment: TargetAlignment, animate: Boolean, highlight: Boolean) {
      q.h(var2, "targetAlignment");
      this.scroller.scrollToPosition(var1, var2, var3, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            ChatListView.access$getScrollStateObserver$p(this.this$0).stopWatching();
         }
      }, new Function0(this, var4, var1) {
         final boolean $highlight;
         final int $position;
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
            this.$highlight = var2;
            this.$position = var3;
         }

         public final void invoke() {
            ChatListView.access$getScrollStateObserver$p(this.this$0).startWatching(this.this$0, ChatScrollStateObserver.EmitMode.YES);
            if (this.$highlight) {
               ChatListHighlightItemAtPositionKt.chatListHighlightItemAtPosition$default(this.this$0, this.$position, 0L, 2, null);
               val var1: RecyclerView.LayoutManager = this.this$0.getLayoutManager();
               if (var1 != null) {
                  val var2: View = var1.findViewByPosition(this.$position);
                  if (var2 != null) {
                     var2.sendAccessibilityEvent(8);
                  }
               }
            }
         }
      }, new Function0(this) {
         final ChatListView this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            ChatListView.access$measureAndLayout(this.this$0);
         }
      });
   }

   public fun setDataSource(dataSource: com.discord.chat.presentation.list.ChatListView.DataSource) {
      q.h(var1, "dataSource");
      this.dataSource = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      q.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   public fun setInverted(inverted: Boolean) {
      this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(var1);
      this.linearLayoutManager.setReverseLayout(var1);
   }

   public fun setPortalView(portalView: View, measuredDimensions: Pair<Int, Int>?) {
      q.h(var1, "portalView");
      this.chatListAdapter.setPortalView(var1, var2);
   }

   public companion object {
      public final val MESSAGE_TOP_SCROLL_OFFSET_PX: Int
      public final val sharedPool: RecycledViewPool
   }

   public interface DataSource {
      public val updatesFlow: Flow<ChatListUpdate>
   }
}
