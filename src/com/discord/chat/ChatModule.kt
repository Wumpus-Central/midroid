package com.discord.chat

import android.content.Context
import av.f
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
import com.discord.serialization.SerializerUtils.SerializerError.Data
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReactApplicationContext
import gu.g
import gu.j1
import gu.u0
import ht.v
import java.util.LinkedHashMap
import java.util.Map.Entry
import java.util.concurrent.CancellationException
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.coroutines.CompletableJob
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.i
import kotlinx.coroutines.z
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder
import org.json.JSONArray
import org.json.JSONObject

public class ChatModule(reactContext: ReactApplicationContext) : NativeChatModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   @JvmStatic
   fun {
      val var1: CompletableJob = j1.b(null, 1, null);
      val var0: ExecutorService = Executors.newSingleThreadExecutor();
      moduleScope = i.a(var1.Q0(u0.c(var0)));
   }

   init {
      this.reactContext = var1;
   }

   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      var0.c(true);
      return Unit.a;
   }

   public open fun clearRows(tagValue: Double, changesetUpdateIdValue: Double) {
      ChatModule.Companion.access$withChatManager(
         Companion,
         (int)var1,
         new Function2<ChatListManager, Continuation<? super Unit>, Object>(this, (int)var1, (int)var3, null) {
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

            @Override
            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               val var3: Function2 = new <anonymous constructor>(this.this$0, this.$tag, this.$changesetUpdateId, var2);
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(ChatListManager var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            @Override
            public final Object invokeSuspend(Object var1) {
               ot.b.f();
               if (this.label == 0) {
                  c.b(var1);
                  var1 = this.L$0 as ChatListManager;
                  ChatModule.Companion.access$rowUpdateLoggerFor(ChatModule.Companion, ChatModule.access$getReactContext$p(this.this$0), this.$tag)
                     .logRowsClear();
                  var1.clearRows(this.$changesetUpdateId);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         }
      );
   }

   public open fun invalidate() {
      super.invalidate();
      ChatModule.Companion.access$cancelCoroutineChildren(Companion);
   }

   public open fun updateRows(
      tagValue: Double,
      rowsJSON: String,
      isLoadingAtTop: Boolean,
      scrollDataJSON: String?,
      changesetUpdateIdValue: Double,
      HACK_iOSForceAnimations: Boolean,
      forceReload: Boolean
   ) {
      val var11: Int = (int)var1;
      val var10: Int = (int)var6;
      TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Start", 0L, null, false, 14, null);
      ChatModule.Companion.access$withChatManager(
         Companion,
         var11,
         new Function2<ChatListManager, Continuation<? super Unit>, Object>(this, var11, var3, var5, var10, var9, null) {
            final int $changesetUpdateId;
            final boolean $forceReload;
            final java.lang.String $rowsJSON;
            final java.lang.String $scrollDataJSON;
            final int $tag;
            Object L$0;
            int label;
            final ChatModule this$0;

            {
               super(2, var7);
               this.this$0 = var1;
               this.$tag = var2x;
               this.$rowsJSON = var3x;
               this.$scrollDataJSON = var4;
               this.$changesetUpdateId = var5;
               this.$forceReload = var6;
            }

            @Override
            public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
               val var3: Function2 = new <anonymous constructor>(
                  this.this$0, this.$tag, this.$rowsJSON, this.$scrollDataJSON, this.$changesetUpdateId, this.$forceReload, var2
               );
               var3.L$0 = var1;
               return var3;
            }

            public final Object invoke(ChatListManager var1, Continuation<? super Unit> var2x) {
               return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
            }

            // $VF: Duplicated exception handlers to handle obfuscated exceptions
            @Override
            public final Object invokeSuspend(Object var1) {
               ot.b.f();
               if (this.label == 0) {
                  c.b(var1);
                  val var3x: ChatListManager = this.L$0 as ChatListManager;
                  ChatModule.Companion.access$rowUpdateLoggerFor(ChatModule.Companion, ChatModule.access$getReactContext$p(this.this$0), this.$tag)
                     .logRowsUpdate(this.$rowsJSON);

                  label131: {
                     var var54: java.util.List;
                     label118: {
                        try {
                           var var5: Json = ChatModule.access$getJson$cp();
                           val var53: java.lang.String = this.$rowsJSON;
                           var5.a();
                           var54 = var5.b(new f(Row.Companion.serializer()), var53) as java.util.List;
                           if (this.$scrollDataJSON != null) {
                              var5 = ChatModule.access$getJson$cp();
                              var1 = this.$scrollDataJSON;
                              var5.a();
                              var1 = var5.b(ChatScrollData.Companion.serializer(), var1) as ChatScrollData;
                              break label118;
                           }
                        } catch (var19: Exception) {
                           val var20: CrashReporting = CrashReporting.INSTANCE;
                           CrashReporting.addBreadcrumb$default(
                              CrashReporting.INSTANCE,
                              "Bad row update",
                              s0.m(
                                 new Pair[]{
                                    v.a("tag", java.lang.String.valueOf(this.$tag)),
                                    v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                    v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                    v.a(
                                       "previousTagRowSize",
                                       java.lang.String.valueOf(
                                          ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                       )
                                    )
                                 }
                              ),
                              null,
                              null,
                              12,
                              null
                           );
                           CrashReporting.captureException$default(var20, new Exception("Failed to update rows", var19), false, 2, null);
                           var1 = this.$rowsJSON;
                           val var4: java.lang.String = var19.getMessage();
                           var3x.handleError(var1, var4, this.$changesetUpdateId);
                           break label131;
                        }

                        var1 = null;
                     }

                     var var66: java.util.Iterator;
                     try {
                        var3x.updateRows(var54, var1, this.$changesetUpdateId, this.$forceReload);
                        if (ClientInfo.INSTANCE.isProdBuild()) {
                           break label131;
                        }

                        val var27: java.lang.Iterable = var54;
                        var56 = this.$rowsJSON;
                        var66 = var27.iterator();
                     } catch (var18: Exception) {
                        val var25: CrashReporting = CrashReporting.INSTANCE;
                        CrashReporting.addBreadcrumb$default(
                           CrashReporting.INSTANCE,
                           "Bad row update",
                           s0.m(
                              new Pair[]{
                                 v.a("tag", java.lang.String.valueOf(this.$tag)),
                                 v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                 v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                 v.a(
                                    "previousTagRowSize",
                                    java.lang.String.valueOf(
                                       ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                    )
                                 )
                              }
                           ),
                           null,
                           null,
                           12,
                           null
                        );
                        CrashReporting.captureException$default(var25, new Exception("Failed to update rows", var18), false, 2, null);
                        var1 = this.$rowsJSON;
                        val var55: java.lang.String = var18.getMessage();
                        var3x.handleError(var1, var55, this.$changesetUpdateId);
                        break label131;
                     }

                     var var2x: Int = 0;

                     label104:
                     while (true) {
                        label127: {
                           try {
                              if (!var66.hasNext()) {
                                 break;
                              }

                              var1 = var66.next();
                           } catch (var11: Exception) {
                              val var28: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 s0.m(
                                    new Pair[]{
                                       v.a("tag", java.lang.String.valueOf(this.$tag)),
                                       v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       v.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 null,
                                 12,
                                 null
                              );
                              CrashReporting.captureException$default(var28, new Exception("Failed to update rows", var11), false, 2, null);
                              var1 = this.$rowsJSON;
                              val var57: java.lang.String = var11.getMessage();
                              var3x.handleError(var1, var57, this.$changesetUpdateId);
                              break;
                           }

                           if (var2x < 0) {
                              try {
                                 CollectionsKt.v();
                              } catch (var10: Exception) {
                                 val var31: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    s0.m(
                                       new Pair[]{
                                          v.a("tag", java.lang.String.valueOf(this.$tag)),
                                          v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          v.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                                 CrashReporting.captureException$default(var31, new Exception("Failed to update rows", var10), false, 2, null);
                                 var1 = this.$rowsJSON;
                                 val var58: java.lang.String = var10.getMessage();
                                 var3x.handleError(var1, var58, this.$changesetUpdateId);
                                 break;
                              }
                           }

                           label79: {
                              try {
                                 val var35: Row = var1 as Row;
                                 if (var1 as Row is MessageRow) {
                                    var1 = var35 as MessageRow;
                                    break label79;
                                 }
                              } catch (var15: Exception) {
                                 val var33: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    s0.m(
                                       new Pair[]{
                                          v.a("tag", java.lang.String.valueOf(this.$tag)),
                                          v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          v.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                                 CrashReporting.captureException$default(var33, new Exception("Failed to update rows", var15), false, 2, null);
                                 val var34: java.lang.String = this.$rowsJSON;
                                 val var59: java.lang.String = var15.getMessage();
                                 var3x.handleError(var34, var59, this.$changesetUpdateId);
                                 break;
                              }

                              var1 = null;
                           }

                           val var39: MessageBase;
                           if (var1 != null) {
                              try {
                                 var39 = var1.getMessage();
                              } catch (var14: Exception) {
                                 val var37: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    s0.m(
                                       new Pair[]{
                                          v.a("tag", java.lang.String.valueOf(this.$tag)),
                                          v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          v.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                                 CrashReporting.captureException$default(var37, new Exception("Failed to update rows", var14), false, 2, null);
                                 val var38: java.lang.String = this.$rowsJSON;
                                 val var60: java.lang.String = var14.getMessage();
                                 var3x.handleError(var38, var60, this.$changesetUpdateId);
                                 break;
                              }
                           } else {
                              var39 = null;
                           }

                           var var7: LinkedHashMap;
                           var var8: java.util.Iterator;
                           var var68: java.util.List;
                           try {
                              if (var39 !is ErrorMessage) {
                                 break label127;
                              }

                              val var6: JSONObject = new JSONArray(var56).getJSONObject(var2x);
                              val var43: SerializerUtils = SerializerUtils.INSTANCE;
                              val var67: java.lang.String = var6.toString();
                              var1 = var43.findErroringFields(var67, Message::class);
                              var68 = PIIKt.getPIIFieldNames(Message::class);
                              var7 = new LinkedHashMap();
                              if (var1 !is Data) {
                                 break label127;
                              }

                              var8 = (var1 as Data).getData().entrySet().iterator();
                           } catch (var16: Exception) {
                              val var40: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 s0.m(
                                    new Pair[]{
                                       v.a("tag", java.lang.String.valueOf(this.$tag)),
                                       v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       v.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 null,
                                 12,
                                 null
                              );
                              CrashReporting.captureException$default(var40, new Exception("Failed to update rows", var16), false, 2, null);
                              val var41: java.lang.String = this.$rowsJSON;
                              val var61: java.lang.String = var16.getMessage();
                              var3x.handleError(var41, var61, this.$changesetUpdateId);
                              break;
                           }

                           while (true) {
                              var var9: Entry;
                              try {
                                 if (!var8.hasNext()) {
                                    break;
                                 }

                                 var9 = var8.next() as Entry;
                                 if (var68.contains(var9.getKey())) {
                                    var7.put(var9.getKey(), "<REDACTED>");
                                    continue;
                                 }
                              } catch (var17: Exception) {
                                 val var45: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    s0.m(
                                       new Pair[]{
                                          v.a("tag", java.lang.String.valueOf(this.$tag)),
                                          v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          v.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                                 CrashReporting.captureException$default(var45, new Exception("Failed to update rows", var17), false, 2, null);
                                 val var46: java.lang.String = this.$rowsJSON;
                                 val var62: java.lang.String = var17.getMessage();
                                 var3x.handleError(var46, var62, this.$changesetUpdateId);
                                 break label104;
                              }

                              try {
                                 var7.put(var9.getKey(), var9.getValue());
                              } catch (var13: Exception) {
                                 val var47: CrashReporting = CrashReporting.INSTANCE;
                                 CrashReporting.addBreadcrumb$default(
                                    CrashReporting.INSTANCE,
                                    "Bad row update",
                                    s0.m(
                                       new Pair[]{
                                          v.a("tag", java.lang.String.valueOf(this.$tag)),
                                          v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                          v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                          v.a(
                                             "previousTagRowSize",
                                             java.lang.String.valueOf(
                                                ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                             )
                                          )
                                       }
                                    ),
                                    null,
                                    null,
                                    12,
                                    null
                                 );
                                 CrashReporting.captureException$default(var47, new Exception("Failed to update rows", var13), false, 2, null);
                                 val var48: java.lang.String = this.$rowsJSON;
                                 val var63: java.lang.String = var13.getMessage();
                                 var3x.handleError(var48, var63, this.$changesetUpdateId);
                                 break label104;
                              }
                           }

                           try {
                              val var69: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Message Deserialization Error", var7, null, null, 12, null);
                              val var71: java.lang.String = CollectionsKt.x0((var1 as Data).getData().keySet(), ",", null, null, 0, null, null, 62, null);
                              val var51: StringBuilder = new StringBuilder();
                              var51.append("Could not deserialize message. Bad Fields: ");
                              var51.append(var71);
                              CrashReporting.captureException$default(var69, new Exception(var51.toString()), false, 2, null);
                           } catch (var12: Exception) {
                              val var49: CrashReporting = CrashReporting.INSTANCE;
                              CrashReporting.addBreadcrumb$default(
                                 CrashReporting.INSTANCE,
                                 "Bad row update",
                                 s0.m(
                                    new Pair[]{
                                       v.a("tag", java.lang.String.valueOf(this.$tag)),
                                       v.a("tagRowSize", java.lang.String.valueOf(var3x.getRowCount())),
                                       v.a("previousTag", java.lang.String.valueOf(ChatModule.access$getPreviousRowUpdateTag$cp())),
                                       v.a(
                                          "previousTagRowSize",
                                          java.lang.String.valueOf(
                                             ChatModule.Companion.getChatListManager(ChatModule.access$getPreviousRowUpdateTag$cp()).getRowCount()
                                          )
                                       )
                                    }
                                 ),
                                 null,
                                 null,
                                 12,
                                 null
                              );
                              CrashReporting.captureException$default(var49, new Exception("Failed to update rows", var12), false, 2, null);
                              val var50: java.lang.String = this.$rowsJSON;
                              val var64: java.lang.String = var12.getMessage();
                              var3x.handleError(var50, var64, this.$changesetUpdateId);
                              break;
                           }
                        }

                        var2x++;
                     }
                  }

                  TTIMetrics.record$default(TTIMetrics.INSTANCE, "ChatModule.updateRows() Finish", 0L, null, false, 14, null);
                  val var52: ChatModule.Companion = ChatModule.Companion;
                  ChatModule.access$setPreviousRowUpdateTag$cp(this.$tag);
                  return Unit.a;
               } else {
                  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
               }
            }
         }
      );
   }

   @SourceDebugExtension(["SMAP\nChatModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$Companion\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,193:1\n381#2,7:194\n381#2,7:201\n*S KotlinDebug\n*F\n+ 1 ChatModule.kt\ncom/discord/chat/ChatModule$Companion\n*L\n158#1:194,7\n172#1:201,7\n*E\n"])
   public companion object {
      private final val json: Json
      private final val moduleScope: CoroutineScope
      private final val listManagers: MutableMap<Int, ChatListManager>
      private final var previousRowUpdateTag: Int
      private final val rowUpdateLoggers: MutableMap<Int, RowLogger>

      private fun cancelCoroutineChildren() {
         val var1: CoroutineContext = ChatModule.access$getModuleScope$cp().getCoroutineContext();
         val var2: java.lang.String = (ChatModule::class).getSimpleName();
         val var3: StringBuilder = new StringBuilder();
         var3.append(var2);
         var3.append(" invalidate()");
         z.g(var1, new CancellationException(var3.toString()));
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
         g.d(
            ChatModule.access$getModuleScope$cp(),
            null,
            null,
            new Function2<CoroutineScope, Continuation<? super Unit>, Object>(var2, this.getChatListManager(var1), null) {
               final Function2<ChatListManager, Continuation<? super Unit>, Object> $block;
               final ChatListManager $manager;
               int label;

               {
                  super(2, var3);
                  this.$block = var1;
                  this.$manager = var2x;
               }

               @Override
               public final Continuation<Unit> create(Object var1, Continuation<?> var2) {
                  return new <anonymous constructor>(this.$block, this.$manager, var2);
               }

               public final Object invoke(CoroutineScope var1, Continuation<? super Unit> var2x) {
                  return (this.create(var1, var2x) as <unrepresentable>).invokeSuspend(Unit.a);
               }

               @Override
               public final Object invokeSuspend(Object var1) {
                  val var3: Any = ot.b.f();
                  if (this.label != 0) {
                     if (this.label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                     }

                     c.b(var1);
                  } else {
                     c.b(var1);
                     var1 = this.$block;
                     val var4: ChatListManager = this.$manager;
                     this.label = 1;
                     if (var1.invoke(var4, this) === var3) {
                        return var3;
                     }
                  }

                  return Unit.a;
               }
            },
            3,
            null
         );
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
