package com.discord.chat.presentation.message.system

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.core.view.h0
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import androidx.lifecycle.Lifecycle.State
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.Message
import com.discord.chat.databinding.CallSystemMessageViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.chat.presentation.message.AddSystemMessageCardStyleKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.coroutines.AttachedViewCoroutineScope
import com.discord.misc.utilities.coroutines.CoroutineViewUtilsKt
import com.discord.misc.utilities.time.IntervalFlowKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import gu.m0
import java.util.ArrayList
import java.util.Arrays
import kotlin.coroutines.Continuation
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlin.time.Duration
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector
import org.jetbrains.annotations.NotNull

@SourceDebugExtension(["SMAP\nCallSystemMessageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n1557#2:159\n1628#2,3:160\n*S KotlinDebug\n*F\n+ 1 CallSystemMessageView.kt\ncom/discord/chat/presentation/message/system/CallSystemMessageView\n*L\n120#1:159\n120#1:160,3\n*E\n"])
public class CallSystemMessageView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout(var1, var2) {
   private final val greenIconColor: Int = ColorUtilsKt.getColorCompat(this, R.color.green_360)
   private final val redIconColor: Int = ColorUtilsKt.getColorCompat(this, R.color.red_400)
   private final val grayIconColor: Int
   private final val binding: CallSystemMessageViewBinding

   fun CallSystemMessageView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.grayIconColor = ThemeManagerKt.getTheme().getInteractiveNormal();
      val var3: CallSystemMessageViewBinding = CallSystemMessageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      AddSystemMessageCardStyleKt.addSystemMessageCardStyle(this);
      val var5: TextView = var3.message;
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var5.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      val var4: TextView = var3.info;
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   @JvmStatic
   fun `setMessage$lambda$3`(var0: ChatEventHandler, var1: Message, var2: View) {
      var0.onTapCall-pfaIj0E(var1.getId-3Eiw7ao(), var1.getChannelId-o4g7jtM());
   }

   public fun setMessage(message: Message, eventHandler: ChatEventHandler) {
      val var8: SimpleDraweeView = this.binding.icon;
      val var6: java.lang.Boolean = var1.getMissed();
      val var7: java.lang.Boolean = java.lang.Boolean.TRUE;
      val var11: ReactAsset;
      if (var6 == java.lang.Boolean.TRUE) {
         var11 = ReactAsset.CallDisconnect;
      } else {
         var11 = ReactAsset.CallConnect;
      }

      ReactAssetUtilsKt.setReactAsset(var8, var11);
      val var12: SimpleDraweeView = this.binding.icon;
      val var3: Int;
      if (var1.isCallActive() == var7) {
         var3 = this.greenIconColor;
      } else if (var1.getMissed() == var7) {
         var3 = this.redIconColor;
      } else {
         var3 = this.grayIconColor;
      }

      ColorUtilsKt.setTintColor(var12, var3);
      this.binding.message.setText(var1.getTitle());
      val var13: AttachedViewCoroutineScope = CoroutineViewUtilsKt.getAttachedScope(this);
      val var20: java.lang.String = CallSystemMessageView.class.getSimpleName();
      val var9: StringBuilder = new StringBuilder();
      var9.append("Binding ");
      var9.append(var20);
      AttachedViewCoroutineScope.cancelAllWork$default(var13, var9.toString(), null, 2, null);
      if (var1.isCallActive() == var7) {
         val var14: java.lang.Long = var1.getRawMilliseconds();
         gu.g.d(
            CoroutineViewUtilsKt.getAttachedScope(this),
            null,
            null,
            new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this, var14, var1, null) {
               final Message $message;
               final long $start;
               int label;
               final CallSystemMessageView this$0;

               {
                  super(2, var5);
                  this.this$0 = var1;
                  this.$start = var2x;
                  this.$message = var4;
               }

               public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                  return new <anonymous constructor>(this.this$0, this.$start, this.$message, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               public final Object invokeSuspend(Object var1) {
                  val var3: Any = ot.b.f();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     kotlin.c.b(var1);
                  } else {
                     kotlin.c.b(var1);
                     var1 = this.this$0;
                     val var4: State = State.t;
                     val var5: Function2 = new Function2<CoroutineScope, Continuation<? super Unit>, Object>(this.$start, this.this$0, this.$message, null) {
                        final Message $message;
                        final long $start;
                        int label;
                        final CallSystemMessageView this$0;

                        {
                           super(2, var5x);
                           this.$start = var1;
                           this.this$0 = var3x;
                           this.$message = var4x;
                        }

                        public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                           return new <anonymous constructor>(this.$start, this.this$0, this.$message, var2);
                        }

                        public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                           return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
                        }

                        public final Object invokeSuspend(Object var1) {
                           val var3: Any = ot.b.f();
                           if (this.label != 0) {
                              if (this.label != 1) {
                                 throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                              }

                              kotlin.c.b(var1);
                           } else {
                              kotlin.c.b(var1);
                              var1 = Duration.e;
                              val var4: Flow = ju.g.x(
                                 new Flow(IntervalFlowKt.intervalFlow-QTBD994(kotlin.time.b.s(1, eu.b.u), Duration.e.c()), this.$start) {
                                    final long $start$inlined;
                                    final Flow $this_unsafeTransform$inlined;

                                    {
                                       this.$this_unsafeTransform$inlined = var1;
                                       this.$start$inlined = var2x;
                                    }

                                    public Object collect(@NotNull FlowCollector var1, @NotNull Continuation var2x) {
                                       val var3x: Any = this.$this_unsafeTransform$inlined
                                          .collect(
                                             new FlowCollector(var1, this.$start$inlined) {
                                                final long $start$inlined;
                                                final FlowCollector $this_unsafeFlow;

                                                {
                                                   this.$this_unsafeFlow = var1;
                                                   this.$start$inlined = var2x;
                                                }

                                                public final Object emit(Object var1, @NotNull Continuation var2x) {
                                                   label23: {
                                                      if (var2x is <unrepresentable>) {
                                                         val var4x: <unrepresentable> = var2x as <unrepresentable>;
                                                         if (((var2x as <unrepresentable>).label and Integer.MIN_VALUE) != 0) {
                                                            var4x.label = (var2x as <unrepresentable>).label + Integer.MIN_VALUE;
                                                            var9 = var4x;
                                                            break label23;
                                                         }
                                                      }

                                                      var9 = new kotlin.coroutines.jvm.internal.d(this, var2x) {
                                                         Object L$0;
                                                         int label;
                                                         Object result;
                                                         final <unrepresentable> this$0;

                                                         {
                                                            super(var2x);
                                                            this.this$0 = var1;
                                                         }

                                                         public final Object invokeSuspend(@NotNull Object var1) {
                                                            this.result = var1;
                                                            this.label |= Integer.MIN_VALUE;
                                                            return this.this$0.emit(null, this);
                                                         }
                                                      };
                                                   }

                                                   var var5: Any = ((<unrepresentable>)var9).result;
                                                   val var11: Any = ot.b.f();
                                                   if (((<unrepresentable>)var9).label != 0) {
                                                      if (((<unrepresentable>)var9).label != 1) {
                                                         throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                      }

                                                      kotlin.c.b(var5);
                                                   } else {
                                                      kotlin.c.b(var5);
                                                      var5 = this.$this_unsafeFlow;
                                                      var1 = var1;
                                                      val var7: kotlin.time.Duration.a = Duration.e;
                                                      val var8: java.lang.Comparable = kotlin.ranges.e.g(
                                                         Duration.h(kotlin.time.b.t(System.currentTimeMillis() - this.$start$inlined, eu.b.t)),
                                                         Duration.h(Duration.e.c())
                                                      );
                                                      ((<unrepresentable>)var9).label = 1;
                                                      if (var5.emit(var8, (Continuation)var9) === var11) {
                                                         return var11;
                                                      }
                                                   }

                                                   return Unit.a;
                                                }
                                             },
                                             var2x
                                          );
                                       return if (var3x === ot.b.f()) var3x else Unit.a;
                                    }
                                 },
                                 m0.a()
                              );
                              val var6: FlowCollector = new FlowCollector(this.this$0, this.$message) {
                                 final Message $message;
                                 final CallSystemMessageView this$0;

                                 {
                                    this.this$0 = var1;
                                    this.$message = var2x;
                                 }

                                 public final Object emit_VtjQ1oo/* $VF was: emit-VtjQ1oo*/(long var1, Continuation<? super Unit> var3x) {
                                    val var9: CallSystemMessageView = this.this$0;
                                    val var8: Message = this.$message;
                                    val var6x: Long = Duration.s(var1);
                                    val var5: Int = Duration.w(var1);
                                    val var4x: Int = Duration.y(var1);
                                    Duration.x(var1);
                                    val var10: TextView = CallSystemMessageView.access$getBinding$p(var9).info;
                                    val var11: java.lang.String = java.lang.String.format(
                                       "%02d:%02d:%02d%s",
                                       Arrays.copyOf(
                                          new Object[]{
                                             kotlin.coroutines.jvm.internal.b.f(var6x),
                                             kotlin.coroutines.jvm.internal.b.e(var5),
                                             kotlin.coroutines.jvm.internal.b.e(var4x),
                                             var8.getDescription()
                                          },
                                          4
                                       )
                                    );
                                    var10.setText(var11);
                                    return Unit.a;
                                 }
                              };
                              this.label = 1;
                              if (var4.collect(var6, this) === var3) {
                                 return var3;
                              }
                           }

                           return Unit.a;
                        }
                     };
                     this.label = 1;
                     if (CoroutineViewUtilsKt.repeatOnLifecycleOwner(var1, var4, var5, this) === var3) {
                        return var3;
                     }
                  }

                  return Unit.a;
               }
            },
            3,
            null
         );
      } else {
         this.binding.info.setText(var1.getDescription());
      }

      val var21: OverlappingCirclesView = this.binding.participants;
      val var17: java.util.List = var1.getAvatarURLs();
      var var15: java.util.List = var17;
      if (var17 == null) {
         var15 = CollectionsKt.l();
      }

      val var16: ArrayList = new ArrayList(CollectionsKt.w(var15, 10));
      val var19: java.util.Iterator = var15.iterator();

      while (var19.hasNext()) {
         var16.add(new OverlappingItem(var19.next() as java.lang.String));
      }

      var21.setItems(var16);
      val var10: com.discord.chat.presentation.message.system.d = new com.discord.chat.presentation.message.system.d(var2, var1);
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested(this, true, var10);
      h0.n0(this, new androidx.core.view.a(this, var10) {
         final OnClickListener $onClickListener;
         final CallSystemMessageView this$0;

         {
            this.this$0 = var1;
            this.$onClickListener = var2;
         }

         public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
            super.onInitializeAccessibilityNodeInfo(var1, var2);
            val var3: Context = this.this$0.getContext();
            var2.T0(I18nUtilsKt.i18nFormat$default(var3, I18nMessage.A11Y_ROLE_BUTTON, null, 2, null));
         }

         public boolean performAccessibilityAction(View var1, int var2, Bundle var3) {
            if (var2 == 16) {
               this.$onClickListener.onClick(var1);
            }

            return super.performAccessibilityAction(var1, var2, var3);
         }
      });
   }
}
