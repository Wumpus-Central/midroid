package com.discord.chat

import A9.s
import B9.q
import H9.b
import android.content.Context
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.chat.bridge.row.MessageRow
import com.discord.chat.bridge.row.Row
import com.discord.chat.bridge.scroll.ChatScrollData
import com.discord.chat.listmanager.ChatListManager
import com.discord.chatreplay.logger.ReleaseRowLogger
import com.discord.chatreplay.logger.RowLogger
import com.discord.client_info.ClientInfo
import com.discord.codegen.NativeChatModuleSpec
import com.discord.crash_reporting.CrashReporting
import com.discord.logging.PIIKt
import com.discord.serialization.SerializerUtils
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReactApplicationContext
import java.util.LinkedHashMap
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import jb.T
import jb.k0
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.g
import kotlinx.coroutines.v
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import org.json.JSONArray
import org.json.JSONObject
import wb.f

public class ChatModule(reactContext: ReactApplicationContext) : NativeChatModuleSpec {
   private final val reactContext: ReactApplicationContext

   @JvmStatic
   fun {
      val var1: CompletableJob = k0.b(null, 1, null);
      val var0: ExecutorService = Executors.newSingleThreadExecutor();
      r.g(var0, "newSingleThreadExecutor(...)");
      moduleScope = g.a(var1.T(T.b(var0)));
   }

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      r.h(var0, "$this$Json");
      var0.c(true);
      return Unit.a;
   }

   public override fun clearRows(tagValue: Double, changesetUpdateIdValue: Double) {
      ChatModule.Companion.access$withChatManager(Companion, (int)var1, new Function2(this, (int)var1, (int)var3, null) {
         final int $changesetUpdateId;
         final int $tag;
         Object L$0;
         int label;
         final ChatModule this$0;

         {
            super(2, var4);
            this.this$0 = var1;
            this.$tag = var2x;
            this.$changesetUpdateId = var3x;
         }

         public final Continuation create(Object var1, Continuation var2) {
            val var3: Function2 = new <anonymous constructor>(this.this$0, this.$tag, this.$changesetUpdateId, var2);
            var3.L$0 = var1;
            return var3;
         }

         public final Object invoke(ChatListManager var1, Continuation var2x) {
            return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
         }

         public final Object invokeSuspend(Object var1) {
            b.e();
            if (this.label == 0) {
               c.b(var1);
               var1 = this.L$0 as ChatListManager;
               ChatModule.Companion.access$rowUpdateLoggerFor(ChatModule.Companion, ChatModule.access$getReactContext$p(this.this$0), this.$tag).logRowsClear();
               var1.clearRows(this.$changesetUpdateId);
               return Unit.a;
            } else {
               throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
         }
      });
   }

   public open fun invalidate() {
      super.invalidate();
      ChatModule.Companion.access$cancelCoroutineChildren(Companion);
   }

   public override fun updateRows(
      tagValue: Double,
      rowsJSON: String,
      isLoadingAtTop: Boolean,
      scrollDataJSON: String?,
      changesetUpdateIdValue: Double,
      HACK_iOSForceAnimations: Boolean
   ) {
      r.h(var3, "rowsJSON");
      val var10: Int = (int)var1;
      val var9: Int = (int)var6;
      TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Start", 0L, null, false, 14, null);
      ChatModule.Companion.access$withChatManager(
         Companion,
         var10,
         new Function2(this, var10, var3, var5, var9, null) {
            final int $changesetUpdateId;
            final java.lang.String $rowsJSON;
            final java.lang.String $scrollDataJSON;
            final int $tag;
            Object L$0;
            int label;
            final ChatModule this$0;

            {
               super(2, var6);
               this.this$0 = var1;
               this.$tag = var2x;
               this.$rowsJSON = var3x;
               this.$scrollDataJSON = var4;
               this.$changesetUpdateId = var5;
            }

            public final Continuation create(Object var1, Continuation var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$tag, this.$rowsJSON, this.$scrollDataJSON, this.$changesetUpdateId, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(ChatListManager var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            public final Object invokeSuspend(Object var1) {
               b.e();
               if (this.label == 0) {
                  c.b(var1);
                  val var3x: ChatListManager = this.L$0 as ChatListManager;
                  ChatModule.Companion.access$rowUpdateLoggerFor(ChatModule.Companion, ChatModule.access$getReactContext$p(this.this$0), this.$tag)
                     .logRowsUpdate(this.$rowsJSON);

                  label131: {
                     var var64: java.util.List;
                     label118: {
                        try {
                           var var52: Json = ChatModule.access$getJson$cp();
                           var1 = this.$rowsJSON;
                           var52.a();
                           var64 = var52.b(new f(Row.Companion.serializer()), var1) as java.util.List;
                           if (this.$scrollDataJSON != null) {
                              var52 = ChatModule.access$getJson$cp();
                              var1 = this.$scrollDataJSON;
                              var52.a();
                              var1 = var52.b(ChatScrollData.Companion.serializer(), var1) as ChatScrollData;
                              break label118;
                           }
                        } catch (var19: Exception) {
                           val var20: CrashReporting = CrashReporting.INSTANCE;
                           CrashReporting.addBreadcrumb$default(
                              CrashReporting.INSTANCE,
                              "Bad row update",
                              q.l(
                                 new Pair[]{
                                    s.a("tag", java.lang.String.valueOf(this.$tag)),
                                    s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                    s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                    s.a(
                                       "previousTagRowSize",
                                       java.lang.String.valueOf(
                                          ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                       )
                                    )
                                 }
                              ),
                              null,
                              4,
                              null
                           );
                           CrashReporting.captureException$default(var20, new Exception("Failed to update rows", var19), false, 2, null);
                           var1 = this.$rowsJSON;
                           val var4: java.lang.String = var19.getMessage();
                           r.e(var4);
                           var3x.handleError(var1, var4, this.$changesetUpdateId);
                           break label131;
                        }

                        var1 = null;
                     }

                     var var55: java.lang.String;
                     try {
                        var3x.updateRows(var64, var1, this.$changesetUpdateId);
                        if (ClientInfo.INSTANCE.isProdBuild()) {
                           break label131;
                        }

                        var55 = this.$rowsJSON;
                        var65 = var64.iterator();
                     } catch (var18: Exception) {
                        val var25: CrashReporting = CrashReporting.INSTANCE;
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "Bad row update",
                           q.l(
                              new Pair[]{
                                 s.a("tag", java.lang.String.valueOf(this.$tag)),
                                 s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                 s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                 s.a(
                                    "previousTagRowSize",
                                    java.lang.String.valueOf(
                                       ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                    )
                                 )
                              }
                           ),
                           null,
                           4,
                           null
                        );
                        CrashReporting.captureException$default(var25, new Exception("Failed to update rows", var18), false, 2, null);
                        var1 = this.$rowsJSON;
                        var55 = var18.getMessage();
                        r.e(var55);
                        var3x.handleError(var1, var55, this.$changesetUpdateId);
                        break label131;
                     }

                     var var2x: Int = 0;

                     label104:
                     while (true) {
                        label127: {
                           try {
                              if (!var65.hasNext()) {
                                 break;
                              }

                              var1 = var65.next();
                           } catch (var11: Exception) {
                              val var27: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 q.l(
                                    new Pair[]{
                                       s.a("tag", java.lang.String.valueOf(this.$tag)),
                                       s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       s.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 4,
                                 null
                              );
                              CrashReporting.captureException$default(var27, new Exception("Failed to update rows", var11), false, 2, null);
                              var1 = this.$rowsJSON;
                              var55 = var11.getMessage();
                              r.e(var55);
                              var3x.handleError(var1, var55, this.$changesetUpdateId);
                              break;
                           }

                           if (var2x < 0) {
                              try {
                                 i.u();
                              } catch (var10: Exception) {
                                 val var30: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    q.l(
                                       new Pair[]{
                                          s.a("tag", java.lang.String.valueOf(this.$tag)),
                                          s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          s.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    4,
                                    null
                                 );
                                 CrashReporting.captureException$default(var30, new Exception("Failed to update rows", var10), false, 2, null);
                                 var1 = this.$rowsJSON;
                                 var55 = var10.getMessage();
                                 r.e(var55);
                                 var3x.handleError(var1, var55, this.$changesetUpdateId);
                                 break;
                              }
                           }

                           label79: {
                              try {
                                 val var34: Row = var1 as Row;
                                 if (var1 as Row is MessageRow) {
                                    var1 = var34 as MessageRow;
                                    break label79;
                                 }
                              } catch (var15: Exception) {
                                 val var32: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    q.l(
                                       new Pair[]{
                                          s.a("tag", java.lang.String.valueOf(this.$tag)),
                                          s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          s.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    4,
                                    null
                                 );
                                 CrashReporting.captureException$default(var32, new Exception("Failed to update rows", var15), false, 2, null);
                                 val var33: java.lang.String = this.$rowsJSON;
                                 var55 = var15.getMessage();
                                 r.e(var55);
                                 var3x.handleError(var33, var55, this.$changesetUpdateId);
                                 break;
                              }

                              var1 = null;
                           }

                           val var38: MessageBase;
                           if (var1 != null) {
                              try {
                                 var38 = var1.getMessage();
                              } catch (var14: Exception) {
                                 val var36: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    q.l(
                                       new Pair[]{
                                          s.a("tag", java.lang.String.valueOf(this.$tag)),
                                          s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          s.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    4,
                                    null
                                 );
                                 CrashReporting.captureException$default(var36, new Exception("Failed to update rows", var14), false, 2, null);
                                 val var37: java.lang.String = this.$rowsJSON;
                                 var55 = var14.getMessage();
                                 r.e(var55);
                                 var3x.handleError(var37, var55, this.$changesetUpdateId);
                                 break;
                              }
                           } else {
                              var38 = null;
                           }

                           var var7: java.util.List;
                           var var9: java.util.Iterator;
                           var var67: LinkedHashMap;
                           try {
                              if (var38 !is ErrorMessage) {
                                 break label127;
                              }

                              val var6: JSONObject = new JSONArray(var55).getJSONObject(var2x);
                              val var42: SerializerUtils = SerializerUtils.INSTANCE;
                              val var66: java.lang.String = var6.toString();
                              r.g(var66, "toString(...)");
                              var1 = var42.findErroringFields(var66, H.b(Message.class));
                              var7 = PIIKt.getPIIFieldNames(H.b(Message.class));
                              var67 = new LinkedHashMap();
                              if (var1 !is SerializerUtils.SerializerError.Data) {
                                 break label127;
                              }

                              var9 = (var1 as SerializerUtils.SerializerError.Data).getData().entrySet().iterator();
                           } catch (var16: Exception) {
                              val var39: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 q.l(
                                    new Pair[]{
                                       s.a("tag", java.lang.String.valueOf(this.$tag)),
                                       s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       s.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 4,
                                 null
                              );
                              CrashReporting.captureException$default(var39, new Exception("Failed to update rows", var16), false, 2, null);
                              val var40: java.lang.String = this.$rowsJSON;
                              var55 = var16.getMessage();
                              r.e(var55);
                              var3x.handleError(var40, var55, this.$changesetUpdateId);
                              break;
                           }

                           while (true) {
                              var var8: Entry;
                              try {
                                 if (!var9.hasNext()) {
                                    break;
                                 }

                                 var8 = var9.next() as Entry;
                                 if (var7.contains(var8.getKey())) {
                                    var67.put(var8.getKey(), "<REDACTED>");
                                    continue;
                                 }
                              } catch (var17: Exception) {
                                 val var44: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    q.l(
                                       new Pair[]{
                                          s.a("tag", java.lang.String.valueOf(this.$tag)),
                                          s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          s.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    4,
                                    null
                                 );
                                 CrashReporting.captureException$default(var44, new Exception("Failed to update rows", var17), false, 2, null);
                                 val var45: java.lang.String = this.$rowsJSON;
                                 var55 = var17.getMessage();
                                 r.e(var55);
                                 var3x.handleError(var45, var55, this.$changesetUpdateId);
                                 break label104;
                              }

                              try {
                                 var67.put(var8.getKey(), var8.getValue());
                              } catch (var13: Exception) {
                                 val var46: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    q.l(
                                       new Pair[]{
                                          s.a("tag", java.lang.String.valueOf(this.$tag)),
                                          s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          s.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    4,
                                    null
                                 );
                                 CrashReporting.captureException$default(var46, new Exception("Failed to update rows", var13), false, 2, null);
                                 val var47: java.lang.String = this.$rowsJSON;
                                 var55 = var13.getMessage();
                                 r.e(var55);
                                 var3x.handleError(var47, var55, this.$changesetUpdateId);
                                 break label104;
                              }
                           }

                           try {
                              val var69: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Message Deserialization Error", var67, null, 4, null);
                              val var50: java.lang.String = i.q0(
                                 (var1 as SerializerUtils.SerializerError.Data).getData().keySet(), ",", null, null, 0, null, null, 62, null
                              );
                              val var70: StringBuilder = new StringBuilder();
                              var70.append("Could not deserialize message. Bad Fields: ");
                              var70.append(var50);
                              CrashReporting.captureException$default(var69, new Exception(var70.toString()), false, 2, null);
                           } catch (var12: Exception) {
                              val var48: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 q.l(
                                    new Pair[]{
                                       s.a("tag", java.lang.String.valueOf(this.$tag)),
                                       s.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       s.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       s.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 4,
                                 null
                              );
                              CrashReporting.captureException$default(var48, new Exception("Failed to update rows", var12), false, 2, null);
                              val var49: java.lang.String = this.$rowsJSON;
                              var55 = var12.getMessage();
                              r.e(var55);
                              var3x.handleError(var49, var55, this.$changesetUpdateId);
                              break;
                           }
                        }

                        var2x++;
                     }
                  }

                  TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
                  val var51: ChatModule.Companion = ChatModule.Companion;
                  ChatModule.access$setPreviousRowUpdateTag$cp(this.$tag);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         }
      );
   }

   public companion object {
      private final val json: Json
      private final val moduleScope: CoroutineScope
      private final val listManagers: MutableMap<Int, ChatListManager>
      private final var previousRowUpdateTag: Int
      private final val rowUpdateLoggers: MutableMap<Int, RowLogger>

      private fun cancelCoroutineChildren() {
         val var2: CoroutineContext = ChatModule.access$getModuleScope$cp().getCoroutineContext();
         val var1: java.lang.String = H.b(ChatModule.class).b();
         val var3: StringBuilder = new StringBuilder();
         var3.append(var1);
         var3.append(" invalidate()");
         v.g(var2, new CancellationException(var3.toString()));
      }

      private fun rowUpdateLoggerFor(context: Context, tag: Int): RowLogger {
         val var5: java.util.Map = ChatModule.access$getRowUpdateLoggers$cp();
         val var4: Int = var2;
         val var3: Any = var5.get(var4);
         var var6: Any = var3;
         if (var3 == null) {
            var6 = new ReleaseRowLogger();
            var5.put(var4, var6);
         }

         return var6 as RowLogger;
      }

      private fun withChatManager(tag: Int, block: (ChatListManager, Continuation<Unit>) -> Any?) {
         jb.f.d(ChatModule.access$getModuleScope$cp(), null, null, new Function2(var2, this.getChatListManager(var1), null) {
            final Function2 $block;
            final ChatListManager $manager;
            int label;

            {
               super(2, var3);
               this.$block = var1;
               this.$manager = var2x;
            }

            public final Continuation create(Object var1, Continuation var2) {
               return new <anonymous constructor>(this.$block, this.$manager, var2);
            }

            public final Object invoke(CoroutineScope var1, Continuation var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            public final Object invokeSuspend(Object var1) {
               val var3: Any = b.e();
               if (this.label != 0) {
                  if (this.label != 1) {
                     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                  }

                  c.b(var1);
               } else {
                  c.b(var1);
                  val var4: Function2 = this.$block;
                  var1 = this.$manager;
                  this.label = 1;
                  if (var4.invoke(var1, this) === var3) {
                     return var3;
                  }
               }

               return Unit.a;
            }
         }, 3, null);
      }

      public fun getChatListManager(tag: Int): ChatListManager {
         // $VF: Couldn't be decompiled
         // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
         // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
         //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
         //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
         //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
         //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
         //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.verifyFinallyEx(FinallyProcessor.java:572)
         //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:90)
         //
         // Bytecode:
         // 00: aload 0
         // 01: monitorenter
         // 02: invokestatic com/discord/chat/ChatModule.access$getListManagers$cp ()Ljava/util/Map;
         // 05: astore 4
         // 07: iload 1
         // 08: invokestatic java/lang/Integer.valueOf (I)Ljava/lang/Integer;
         // 0b: astore 5
         // 0d: aload 4
         // 0f: aload 5
         // 11: invokeinterface java/util/Map.get (Ljava/lang/Object;)Ljava/lang/Object; 2
         // 16: astore 3
         // 17: aload 3
         // 18: astore 2
         // 19: aload 3
         // 1a: ifnonnull 3a
         // 1d: new com/discord/chat/listmanager/ChatListManager
         // 20: astore 2
         // 21: aload 2
         // 22: invokestatic com/discord/chat/ChatModule.access$getModuleScope$cp ()Lkotlinx/coroutines/CoroutineScope;
         // 25: invokespecial com/discord/chat/listmanager/ChatListManager.<init> (Lkotlinx/coroutines/CoroutineScope;)V
         // 28: aload 4
         // 2a: aload 5
         // 2c: aload 2
         // 2d: invokeinterface java/util/Map.put (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; 3
         // 32: pop
         // 33: goto 3a
         // 36: astore 2
         // 37: goto 43
         // 3a: aload 2
         // 3b: checkcast com/discord/chat/listmanager/ChatListManager
         // 3e: astore 2
         // 3f: aload 0
         // 40: monitorexit
         // 41: aload 2
         // 42: areturn
         // 43: aload 0
         // 44: monitorexit
         // 45: aload 2
         // 46: athrow
      }
   }
}
