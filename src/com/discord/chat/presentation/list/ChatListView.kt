package com.discord.chat.presentation.list

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.View.OnLayoutChangeListener
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.listmanager.ChatListAction
import com.discord.chat.listmanager.ChatListUpdate
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate
import com.discord.chat.presentation.list.delegate.SeparatorDelegate
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate
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
import java.lang.reflect.Field
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Ref.BooleanRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

public class ChatListView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RecyclerView {
   private final lateinit var dataSource: com.discord.chat.presentation.list.ChatListView.DataSource
   private final val chatListAdapter: ChannelChatListAdapter
   private final lateinit var eventHandler: ChatEventHandler
   private final val componentProvider: ComponentProvider
   private final val scroller: Scroller
   private final val linearLayoutManager: TransitionResilientLinearLayoutManager
   private final val verticalSpacingItemDecoration: VerticalSpacingItemDecoration
   private final var currentChangesetUpdateId: Int
   private final val scrollStateObserver: ChatScrollStateObserver
   private final var isFirstLayout: Boolean
   private final var updateSubscriptionJob: Job?

   fun ChatListView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ChatListView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var4: ChannelChatListAdapter = new ChannelChatListAdapter(new j(this), new k(this), new l(this));
      this.chatListAdapter = var4;
      this.componentProvider = new ComponentProvider(var1, true);
      this.scroller = new Scroller(this);
      val var6: TransitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(var1, 0, false, 6, null);
      this.linearLayoutManager = var6;
      val var5: VerticalSpacingItemDecoration = new VerticalSpacingItemDecoration(
         SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(30), false, 8, null
      );
      this.verticalSpacingItemDecoration = var5;
      this.scrollStateObserver = new ChatScrollStateObserver(new m(this));
      this.isFirstLayout = true;
      ChatListUtilsKt.configureMessageRecyclerView(this, var1, var5);
      this.setLayoutManager(var6);
      this.setAdapter(var4);
      this.addScrollStateListener();
      this.configureRecycledViewPoolSizes();
      var4.fillAdapter(this);
      this.setItemAnimator(null);
      new ChatListItemTouchHelper(new SwipeHelper(var1, new n(this), new o(this))).attachToRecyclerView(this);
      this.setClipChildren(false);
   }

   @JvmStatic
   fun `_init_$lambda$4`(var0: ChatListView): Unit {
      var0.setClipToPadding(false);
      return Unit.a;
   }

   @JvmStatic
   fun `_init_$lambda$5`(var0: ChatListView): Unit {
      var0.setClipToPadding(true);
      return Unit.a;
   }

   private fun addScrollStateListener() {
      this.addOnScrollListener(this.scrollStateObserver);
   }

   @JvmStatic
   fun `chatListAdapter$lambda$0`(var0: ChatListView): Unit {
      var0.measureAndLayout();
      return Unit.a;
   }

   @JvmStatic
   fun `chatListAdapter$lambda$1`(var0: ChatListView): ChatEventHandler {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         kotlin.jvm.internal.q.y("eventHandler");
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `chatListAdapter$lambda$2`(var0: ChatListView): ComponentProvider {
      return var0.componentProvider;
   }

   private fun configureRecycledViewPoolSizes() {
      var var4: Pair = t9.s.a(RegularMessageDelegate.class, 50);
      val var3: Int = 25;

      for (Entry var5 : u9.q.l(new Pair[]{var4, t9.s.a(SystemMessageDelegate.class, var3), t9.s.a(SeparatorDelegate.class, var3)}).entrySet()) {
         val var7: Class = var5.getKey() as Class;
         val var2: Int = (var5.getValue() as java.lang.Number).intValue();
         var4 = this.chatListAdapter.getDelegateViewTypes().get(var7);
         kotlin.jvm.internal.q.e(var4);
         this.getRecycledViewPool().setMaxRecycledViews((var4 as java.lang.Number).intValue(), var2);
      }
   }

   private fun measureAndLayout() {
      try {
         kotlin.jvm.internal.q.f(this, "null cannot be cast to non-null type android.view.View");
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
                     val var2: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePosition();
                     val var6: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePercentVisible();
                     val var1: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePosition();
                     val var7: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePercentVisible();
                     if (ChatListView.access$isFirstLayout$p(this.this$0) && var2 >= 0 && var1 >= 0) {
                        ChatListView.access$setFirstLayout$p(this.this$0, false);
                        val var3: Boolean = ChatListView.access$getLinearLayoutManager$p(this.this$0).getReverseLayout();
                        var var4: ChatEventHandler = null;
                        if (var3) {
                           var4 = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var4 == null) {
                              kotlin.jvm.internal.q.y("eventHandler");
                              var4 = null;
                           }

                           var4.onFirstLayout(var1, var7, var2, var6);
                        } else {
                           val var12: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var12 == null) {
                              kotlin.jvm.internal.q.y("eventHandler");
                           } else {
                              var4 = var12;
                           }

                           var4.onFirstLayout(var2, var6, var1, var7);
                        }
                     }
                  }

                  var var9: ChatListAction = this.$update.getAction();
                  if (var9 is ChatListAction.ScrollTo) {
                     val var10: ChatListItem = kotlin.collections.i.i0(
                        this.$update.getItems(), (this.$update.getAction() as ChatListAction.ScrollTo).getPosition()
                     ) as ChatListItem;
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
                  } else if (var9 !is ChatListAction.Clear) {
                     if (var9 !is ChatListAction.Noop) {
                        throw new t9.n();
                     }

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

   @JvmStatic
   fun `scrollStateObserver$lambda$3`(var0: ChatListView, var1: ScrollState): Unit {
      kotlin.jvm.internal.q.h(var1, "scrollState");
      if (var0.eventHandler != null) {
         var var2: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            kotlin.jvm.internal.q.y("eventHandler");
            var2 = null;
         }

         var2.onScrollStateChanged(var1, var0.currentChangesetUpdateId);
      }

      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$10`(var0: ChatListView): Unit {
      var0.measureAndLayout();
      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$8`(var0: ChatListView): Unit {
      var0.scrollStateObserver.stopWatching();
      return Unit.a;
   }

   @JvmStatic
   fun `scrollToPosition$lambda$9`(var0: ChatListView, var1: Boolean, var2: Int): Unit {
      var0.scrollStateObserver.startWatching(var0, ChatScrollStateObserver.EmitMode.YES);
      if (var1) {
         ChatListHighlightItemAtPositionKt.chatListHighlightItemAtPosition$default(var0, var2, 0L, 2, null);
         val var3: RecyclerView.LayoutManager = var0.getLayoutManager();
         if (var3 != null) {
            val var4: View = var3.findViewByPosition(var2);
            if (var4 != null) {
               var4.sendAccessibilityEvent(8);
            }
         }
      }

      return Unit.a;
   }

   private fun sync() {
      if (this.updateSubscriptionJob != null) {
         kotlinx.coroutines.Job.a.a(this.updateSubscriptionJob, null, 1, null);
      }

      this.updateSubscriptionJob = cb.f.d(CoroutineViewUtilsKt.attachedScope(this, true), null, null, new Function2(this, null) {
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
            val var4: Any = A9.b.e();
            if (this.label != 0) {
               if (this.label != 1) {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }

               kotlin.c.b(var1);
            } else {
               kotlin.c.b(var1);
               val var5: BooleanRef = new BooleanRef();
               var5.j = true;
               val var3: ChatListView.DataSource = ChatListView.access$getDataSource$p(this.this$0);
               var1 = var3;
               if (var3 == null) {
                  kotlin.jvm.internal.q.y("dataSource");
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

   public open fun endViewTransition(view: View?) {
      super.endViewTransition(var1);
      this.linearLayoutManager.disableRecycling(false);
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
               kotlin.jvm.internal.q.y("eventHandler");
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
      kotlin.jvm.internal.q.h(var2, "targetAlignment");
      this.scroller
         .scrollToPosition(
            var1, var2, var3, new g(this), new com.discord.chat.presentation.list.h(this, var4, var1), new com.discord.chat.presentation.list.i(this)
         );
   }

   public fun setDataSource(dataSource: com.discord.chat.presentation.list.ChatListView.DataSource) {
      kotlin.jvm.internal.q.h(var1, "dataSource");
      this.dataSource = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "eventHandler");
      this.eventHandler = var1;
   }

   public fun setInverted(inverted: Boolean) {
      this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(var1);
      this.linearLayoutManager.setReverseLayout(var1);
   }

   public fun setPortalView(portalView: View, measuredDimensions: Pair<Int, Int>?) {
      kotlin.jvm.internal.q.h(var1, "portalView");
      this.chatListAdapter.setPortalView(var1, var2);
   }

   public open fun startViewTransition(view: View?) {
      this.linearLayoutManager.disableRecycling(true);
      super.startViewTransition(var1);
   }

   public companion object {
      public final val MESSAGE_TOP_SCROLL_OFFSET_PX: Int
   }

   public interface DataSource {
      public val updatesFlow: Flow<ChatListUpdate>
   }
}
