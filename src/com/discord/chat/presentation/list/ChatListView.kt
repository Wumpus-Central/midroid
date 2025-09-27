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
import com.discord.recycler_view.utils.TransitionResilientLinearLayoutManager
import java.lang.reflect.Field
import java.util.Map.Entry
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.jvm.internal.Ref.BooleanRef
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

@SourceDebugExtension(["SMAP\nChatListView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatListView.kt\ncom/discord/chat/presentation/list/ChatListView\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,407:1\n14#2,5:408\n37#3,2:413\n55#3:415\n216#4,2:416\n*S KotlinDebug\n*F\n+ 1 ChatListView.kt\ncom/discord/chat/presentation/list/ChatListView\n*L\n118#1:408,5\n236#1:413,2\n236#1:415\n349#1:416,2\n*E\n"])
public class ChatListView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : RecyclerView(var1, var2, var3) {
   private final lateinit var dataSource: com.discord.chat.presentation.list.ChatListView.DataSource
   private final var chatListAdapter: ChannelChatListAdapter = new ChannelChatListAdapter(new o(this), new p(this), new q(this))
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
      this(var1, null, 0, 6, null);
   }

   fun ChatListView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      this.componentProvider = new ComponentProvider(var1, true);
      this.scroller = new Scroller(this);
      val var4: TransitionResilientLinearLayoutManager = new TransitionResilientLinearLayoutManager(var1, 0, false, null, 14, null);
      this.linearLayoutManager = var4;
      val var5: VerticalSpacingItemDecoration = new VerticalSpacingItemDecoration(
         SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(16), SizeUtilsKt.getDpToPx(30), false, 8, null
      );
      this.verticalSpacingItemDecoration = var5;
      this.scrollStateObserver = new ChatScrollStateObserver(new r(this));
      this.isFirstLayout = true;
      ChatListUtilsKt.configureMessageRecyclerView(this, var1, var5);
      this.setLayoutManager(var4);
      this.setAdapter(this.chatListAdapter);
      this.addScrollStateListener();
      this.configureRecycledViewPoolSizes();
      this.chatListAdapter.fillAdapter(this);
      this.setItemAnimator(null);
      new ChatListItemTouchHelper(new SwipeHelper(var1, new com.discord.chat.presentation.list.h(this), new com.discord.chat.presentation.list.i(this)))
         .attachToRecyclerView(this);
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
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `chatListAdapter$lambda$2`(var0: ChatListView): ComponentProvider {
      return var0.componentProvider;
   }

   private fun configureRecycledViewPoolSizes() {
      val var3: Pair = B9.s.a(RegularMessageDelegate.class, 50);
      var var4: Int = 25;

      for (Entry var7 : L.l(new Pair[]{var3, B9.s.a(SystemMessageDelegate.class, var4), B9.s.a(SeparatorDelegate.class, var4)}).entrySet()) {
         val var5: Class = var7.getKey() as Class;
         val var2: Int = (var7.getValue() as java.lang.Number).intValue();
         var4 = this.chatListAdapter.getDelegateViewTypes().get(var5);
         this.getRecycledViewPool().setMaxRecycledViews(var4.intValue(), var2);
      }
   }

   private fun forceRecreateAllViewHolders() {
      this.chatListAdapter.onHostDetached();
      this.setAdapter(null);
      this.setItemViewCacheSize(0);
      this.setRecycledViewPool(new RecyclerView.RecycledViewPool());
      this.chatListAdapter = new ChannelChatListAdapter(new g(this), new j(this), new k(this));
      this.configureRecycledViewPoolSizes();
      this.setItemViewCacheSize(5);
      this.setAdapter(this.chatListAdapter);
   }

   @JvmStatic
   fun `forceRecreateAllViewHolders$lambda$12`(var0: ChatListView): Unit {
      var0.measureAndLayout();
      return Unit.a;
   }

   @JvmStatic
   fun `forceRecreateAllViewHolders$lambda$13`(var0: ChatListView): ChatEventHandler {
      var var2: ChatEventHandler = var0.eventHandler;
      if (var0.eventHandler == null) {
         Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
         var2 = null;
      }

      return var2;
   }

   @JvmStatic
   fun `forceRecreateAllViewHolders$lambda$14`(var0: ChatListView): ComponentProvider {
      return var0.componentProvider;
   }

   private fun measureAndLayout() {
      try {
         ViewMeasureExtensionsKt.measureAndLayout(this);
      } catch (var6: IllegalArgumentException) {
         val var2: Field = RecyclerView.class.getDeclaredField("mState");
         var2.setAccessible(true);
         val var7: Any = var2.get(this);
         val var4: CrashReporting = CrashReporting.INSTANCE;
         val var5: ChatListAdapterUpdateLog = ChatListAdapterUpdateLog.INSTANCE;
         val var3: StringBuilder = new StringBuilder();
         var3.append("About to crash because of ChatList, dumping update log:\n");
         var3.append(var5);
         var3.append("\n Recycler State: ");
         var3.append(var7);
         CrashReporting.addBreadcrumb$default(var4, var3.toString(), null, null, null, 14, null);
         throw var6;
      }
   }

   private fun onChatListUpdate(update: ChatListUpdate) {
      if (ThreadUtilsKt.isOnMainThread()) {
         if (var1.getForceReload() == java.lang.Boolean.TRUE) {
            access$forceRecreateAllViewHolders(this);
         }

         if (var1.getAction() is ChatListAction.Clear) {
            access$setFirstLayout$p(this, true);
         }

         access$setCurrentChangesetUpdateId$p(this, var1.getChangesetUpdateId());
         val var4: BooleanRef = new BooleanRef();
         ChannelChatListAdapter.setItems$default(
            access$getChatListAdapter$p(this),
            var1.getItems(),
            var1.getListOperations(),
            new Function1<java.lang.Boolean, Unit>(var4, this, var1) {
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

                  var4.element = var2;
                  if (this.$update.getAction() is ChatListAction.Clear) {
                     ChatListView.access$getScrollStateObserver$p(this.this$0).stopWatching();
                     if (!var1) {
                        this.this$0.removeAllViews();
                     }
                  }
               }
            },
            new Function0<Unit>(var1, this, var4) {
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
                     val var1: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePosition();
                     val var7: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getFirstMessagePercentVisible();
                     val var2: Int = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePosition();
                     val var6: java.lang.Double = ChatListView.access$getScrollStateObserver$p(this.this$0)
                        .getChatListVisibilityCalculator$chat_release()
                        .getLastMessagePercentVisible();
                     if (ChatListView.access$isFirstLayout$p(this.this$0) && var1 >= 0 && var2 >= 0) {
                        ChatListView.access$setFirstLayout$p(this.this$0, false);
                        val var3: Boolean = ChatListView.access$getLinearLayoutManager$p(this.this$0).getReverseLayout();
                        var var4: ChatEventHandler = null;
                        if (var3) {
                           val var12: ChatEventHandler = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var12 == null) {
                              Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                           } else {
                              var4 = var12;
                           }

                           var4.onFirstLayout(var2, var6, var1, var7);
                        } else {
                           var4 = ChatListView.access$getEventHandler$p(this.this$0);
                           if (var4 == null) {
                              Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
                              var4 = null;
                           }

                           var4.onFirstLayout(var1, var7, var2, var6);
                        }
                     }
                  }

                  var var9: ChatListAction = this.$update.getAction();
                  if (var9 is ChatListAction.ScrollTo) {
                     val var10: ChatListItem = CollectionsKt.j0(this.$update.getItems(), (this.$update.getAction() as ChatListAction.ScrollTo).getPosition()) as ChatListItem;
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
                     if (this.$wasAtBottom.element) {
                        this.this$0.scrollToPosition(0, Scroller.TargetAlignment.Anywhere.INSTANCE, false, false);
                     }
                  } else if (var9 !is ChatListAction.Clear) {
                     if (var9 !is ChatListAction.Noop) {
                        throw new B9.n();
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
         val var2: Thread = Thread.currentThread();
         val var3: StringBuilder = new StringBuilder();
         var3.append("Expected to be on android main thread. Current: ");
         var3.append(var2);
         throw new IllegalStateException(var3.toString().toString());
      }
   }

   private fun removeScrollStateListener() {
      this.removeOnScrollListener(this.scrollStateObserver);
   }

   @JvmStatic
   fun `scrollStateObserver$lambda$3`(var0: ChatListView, var1: ScrollState): Unit {
      if (var0.eventHandler != null) {
         var var2: ChatEventHandler = var0.eventHandler;
         if (var0.eventHandler == null) {
            Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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

      this.updateSubscriptionJob = db.f.d(
         CoroutineViewUtilsKt.attachedScope(this, true), null, null, new Function2<CoroutineScope, Continuation, Object>(this, null) {
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
               val var4: Any = G9.b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  kotlin.c.b(var1);
               } else {
                  kotlin.c.b(var1);
                  val var5: BooleanRef = new BooleanRef();
                  var5.element = true;
                  val var3: ChatListView.DataSource = ChatListView.access$getDataSource$p(this.this$0);
                  var1 = var3;
                  if (var3 == null) {
                     Intrinsics.throwUninitializedPropertyAccessException("dataSource");
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
                        if (this.$isFirstUpdate.element) {
                           ChatListView.access$onChatListUpdate(this.this$0, ChatListUpdate.copy$default(var1, null, null, null, 0, null, 27, null));
                           this.$isFirstUpdate.element = false;
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
         }, 3, null
      );
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
               Intrinsics.throwUninitializedPropertyAccessException("eventHandler");
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
      this.scroller.scrollToPosition(var1, var2, var3, new l(this), new m(this, var4, var1), new n(this));
   }

   public fun setDataSource(dataSource: com.discord.chat.presentation.list.ChatListView.DataSource) {
      this.dataSource = var1;
   }

   public fun setEventHandler(eventHandler: ChatEventHandler) {
      this.eventHandler = var1;
   }

   public fun setInverted(inverted: Boolean) {
      this.verticalSpacingItemDecoration.setRecyclerLayoutReversed(var1);
      this.linearLayoutManager.setReverseLayout(var1);
   }

   public fun setPortalView(portalView: View, measuredDimensions: Pair<Int, Int>?) {
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
