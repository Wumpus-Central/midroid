package com.discord.user_search_worker

import B9.n
import java.text.Normalizer
import java.text.Normalizer.Form
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Locale
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonBuilder

@SourceDebugExtension(["SMAP\nUserSearchWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSearchWorker.kt\ncom/discord/user_search_worker/UserSearchWorker\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,283:1\n123#2:284\n1863#3,2:285\n216#4,2:287\n*S KotlinDebug\n*F\n+ 1 UserSearchWorker.kt\ncom/discord/user_search_worker/UserSearchWorker\n*L\n26#1:284\n47#1:285,2\n70#1:287,2\n*E\n"])
internal class UserSearchWorker(onResults: (List<UserSearchWorkerResult>, String, String) -> Unit) {
   public final val onResults: (List<UserSearchWorkerResult>, String, String) -> Unit
   private final val json: Json
   private final val users: MutableMap<String, UserSearchTransformedUser>
   private final val queries: MutableMap<String, UserSearchQuerySetPayload>

   init {
      this.onResults = var1;
      this.json = kotlinx.serialization.json.b.b(null, new a(), 1, null);
      this.users = new LinkedHashMap<>();
      this.queries = new LinkedHashMap<>();
   }

   private fun calculateScore(score: Double, booster: Double, boosterFallback: Double): Double {
      var var7: Double = var3;
      if (var3 == 0.0) {
         var7 = var5;
      }

      return var1 * var7;
   }

   private fun clearQuery(data: UserSearchQueryClearData) {
      this.queries.remove(var1.getUuid());
   }

   private fun fuzzySearch(needleBase: String, haystackBase: String): Boolean {
      val var9: Locale = Locale.ROOT;
      var1 = var1.toLowerCase(Locale.ROOT);
      var2 = var2.toLowerCase(var9);
      val var6: Int = var2.length();
      val var3: Int = var1.length();
      if (var3 > var6) {
         return false;
      } else if (var3 == var6) {
         return var1 == var2;
      } else {
         val var7: Int = var1.length();
         var var5: Int = 0;

         for (int var12 = 0; var5 < var7; var5++) {
            val var8: Char = var1.charAt(var5);
            var var4: Int = var12;

            while (true) {
               var12 = var4;
               if (var4 >= var6) {
                  break;
               }

               var12 = var4 + 1;
               if (var2.charAt(var4) == var8) {
                  break;
               }

               var4 = var12;
            }

            if (var12 == var6) {
               return false;
            }
         }

         return true;
      }
   }

   private fun isValid(id: String, user: UserSearchTransformedUser, payload: UserSearchQuerySetPayload): Boolean {
      if (var3.getBlacklist() != null && var3.getBlacklist().contains(var1)) {
         return false;
      } else if (var3.getWhitelist() != null && var3.getWhitelist().contains(var1)) {
         return true;
      } else {
         val var6: UserSearchQuerySetFilters = var3.getFilters();
         if (var6 != null) {
            val var8: java.lang.Boolean = var6.getFriends();
            val var4: Boolean;
            if (var8 != null) {
               var4 = var8;
            } else {
               var4 = false;
            }

            val var9: java.lang.Boolean = var2.isFriend();
            val var5: Boolean;
            if (var9 != null) {
               var5 = var9;
            } else {
               var5 = false;
            }

            var1 = var6.getGuild();
            if (var4 && var5) {
               return true;
            } else {
               return var2.getNicknames().containsKey(var1);
            }
         } else {
            return true;
         }
      }
   }

   @JvmStatic
   fun `json$lambda$0`(var0: JsonBuilder): Unit {
      var0.c(true);
      return Unit.a;
   }

   private fun mergeUsers(data: UserSearchUpdateUsersData) {
      val var8: LinkedHashSet = new LinkedHashSet();
      val var9: java.util.Iterator = var1.getPayload().iterator();
      var var2: Boolean = false;

      while (var9.hasNext()) {
         val var6: UserSearchTransformedUser = var9.next() as UserSearchTransformedUser;
         val var11: java.lang.String = var6.getId();
         val var10: UserSearchTransformedUser = this.users.get(var11);
         var var14: UserSearchTransformedUser = var6;
         if (var10 != null) {
            val var13: java.lang.String = var6.getId();
            val var12: java.lang.String = var6.getUsername();
            var var3: java.lang.Boolean = var6.isBot();
            var var15: java.lang.Boolean = var3;
            if (var3 == null) {
               var15 = var10.isBot();
            }

            val var4: java.lang.Boolean = var6.isFriend();
            var3 = var4;
            if (var4 == null) {
               var3 = var10.isFriend();
            }

            var var5: java.lang.String = var6.getFriendNickname();
            var var21: java.lang.String = var5;
            if (var5 == null) {
               var21 = var10.getFriendNickname();
            }

            val var7: java.lang.String = var6.getGlobalName();
            var5 = var7;
            if (var7 == null) {
               var5 = var10.getGlobalName();
            }

            var14 = var10.copy(var13, var12, var15, var3, var21, var5, L.p(var10.getNicknames(), var6.getNicknames()));
            if (var14 == null) {
               var14 = var6;
            }
         }

         this.users.put(var11, var14);
         if (!this.queries.isEmpty()) {
            val var26: java.lang.Boolean = var14.isFriend();
            val var18: java.lang.Boolean;
            if (var10 != null) {
               var18 = var10.isFriend();
            } else {
               var18 = null;
            }

            label68: {
               if (var26 == var18) {
                  val var27: java.lang.String = var14.getFriendNickname();
                  var var19: java.lang.String = null;
                  if (var10 != null) {
                     var19 = var10.getFriendNickname();
                  }

                  if (var27 == var19) {
                     break label68;
                  }
               }

               var2 = true;
            }

            var8.addAll(var14.getNicknames().keySet());
         }
      }

      for (Entry var23 : this.queries.entrySet()) {
         val var16: java.lang.String = var23.getKey() as java.lang.String;
         val var28: UserSearchQuerySetPayload = var23.getValue() as UserSearchQuerySetPayload;
         val var24: UserSearchQuerySetFilters = var28.getFilters();
         if (var24 == null || var24.getFriends() == var2 || var24.getGuild() != null && var8.contains(var24.getGuild())) {
            this.searchUsers(var16, var28);
         }
      }
   }

   private fun searchUsers(uuid: String, payload: UserSearchQuerySetPayload) {
      var var7: Boolean;
      var var12: java.lang.String;
      label88: {
         var12 = var2.getQuery();
         val var8: UserSearchQuerySetFilters = var2.getFilters();
         if (var8 != null) {
            val var21: java.lang.Boolean = var8.getStrict();
            if (var21 != null) {
               var7 = var21;
               break label88;
            }
         }

         var7 = false;
      }

      val var13: ArrayList = new ArrayList();
      if (var12.length() == 0) {
         this.onResults.invoke(var13, var12, var1);
      } else {
         val var22: java.lang.String = Regex.e.c(var12);
         val var9: StringBuilder = new StringBuilder();
         var9.append("^");
         var9.append(var22);
         var var10: java.lang.String = var9.toString();
         val var24: f = f.i;
         val var14: Regex = new Regex(var10, f.i);
         val var23: Regex = new Regex(var22, var24);

         for (Entry var25 : this.users.entrySet()) {
            val var16: java.lang.String = var25.getKey() as java.lang.String;
            val var26: UserSearchTransformedUser = var25.getValue() as UserSearchTransformedUser;
            val var17: java.lang.String = var26.getUsername();
            if (this.isValid(var16, var26, var2)) {
               val var31: java.lang.Double = var2.getBoosters().get(var16);
               val var3: Double;
               if (var31 != null) {
                  var3 = var31;
               } else {
                  var3 = 0.0;
               }

               val var5: Double = var2.getBoosterFallback();
               var var30: UserSearchWorkerResult;
               if (var16 == var12) {
                  var30 = new UserSearchWorkerResult(var16, var17, var16, this.calculateScore(10.0, var3, var5));
               } else {
                  val var29: java.util.List;
                  if (var7) {
                     val var18: java.lang.String = var26.getUsername();
                     val var11: java.lang.String = var26.getGlobalName();
                     var10 = var26.getFriendNickname();
                     val var19: java.util.Map = var26.getNicknames();
                     val var27: UserSearchQuerySetFilters = var2.getFilters();
                     val var28: java.lang.String;
                     if (var27 != null) {
                        var28 = var27.getGuild();
                     } else {
                        var28 = null;
                     }

                     var29 = CollectionsKt.n(new java.lang.String[]{var18, var11, var10, (java.lang.String)var19.get(var28)});
                  } else {
                     if (var7) {
                        throw new n();
                     }

                     var29 = CollectionsKt.A0(
                        CollectionsKt.n(new java.lang.String[]{var26.getUsername(), var26.getGlobalName(), var26.getFriendNickname()}),
                        var26.getNicknames().values()
                     );
                  }

                  val var36: java.util.Iterator = CollectionsKt.e0(var29).iterator();
                  var30 = null;

                  while (var36.hasNext()) {
                     var10 = var36.next() as java.lang.String;
                     val var34: UserSearchWorker.Companion.LocalResult;
                     if (var14.a(var10)) {
                        var34 = new UserSearchWorker.Companion.LocalResult(var10, this.calculateScore(10.0, var3, var5));
                     } else if (var23.a(var10)) {
                        var34 = new UserSearchWorker.Companion.LocalResult(var10, this.calculateScore(5.0, var3, var5));
                     } else if (this.fuzzySearch(var12, UserSearchWorker.Companion.access$strippedOfDiacritics(Companion, var10))) {
                        var34 = new UserSearchWorker.Companion.LocalResult(var10, this.calculateScore(1.0, var3, var5));
                     } else {
                        var34 = null;
                     }

                     var var35: UserSearchWorkerResult;
                     var35 = var30;
                     label77:
                     if (var34 != null) {
                        if (var30 != null) {
                           var35 = var30;
                           if (!(var30.getScore() < var34.getScore())) {
                              break label77;
                           }
                        }

                        var35 = new UserSearchWorkerResult(var16, var17, var34.getComparator(), var34.getScore());
                     }

                     var30 = var35;
                  }
               }

               if (var30 != null) {
                  var13.add(var30);
               }
            }
         }

         this.onResults.invoke(CollectionsKt.M0(CollectionsKt.K0(var13, E9.a.b(new Function1[]{new b(), new c()})), var2.getLimit()), var12, var1);
      }
   }

   @JvmStatic
   fun `searchUsers$lambda$3`(var0: UserSearchWorkerResult): java.lang.Comparable {
      return -var0.getScore();
   }

   @JvmStatic
   fun `searchUsers$lambda$4`(var0: UserSearchWorkerResult): java.lang.Comparable {
      return var0.getComparator();
   }

   private fun setNewQuery(data: UserSearchQuerySetData) {
      this.queries.put(var1.getUuid(), var1.getPayload());
      this.searchUsers(var1.getUuid(), var1.getPayload());
   }

   public fun onMessage(dataJSON: String) {
      val var2: Json = this.json;
      this.json.a();
      val var3: UserSearchData = var2.b(UserSearchData.Companion.serializer(), var1) as UserSearchData;
      if (var3 is UserSearchUpdateUsersData) {
         this.mergeUsers(var3 as UserSearchUpdateUsersData);
      } else if (var3 is UserSearchQuerySetData) {
         this.setNewQuery(var3 as UserSearchQuerySetData);
      } else {
         if (var3 !is UserSearchQueryClearData) {
            throw new n();
         }

         this.clearQuery(var3 as UserSearchQueryClearData);
      }
   }

   public fun terminate() {
      this.users.clear();
      this.queries.clear();
   }

   public companion object {
      private const val EXACT_MATCH_VALUE: Double
      private const val CONTAIN_MATCH_VALUE: Double
      private const val FUZZY_MATCH_VALUE: Double
      private final val STRIP_DIACRITICS_REGEX_PATTERN: Regex

      private fun String.strippedOfDiacritics(): String {
         var1 = Normalizer.normalize(var1, Form.NFD);
         return UserSearchWorker.access$getSTRIP_DIACRITICS_REGEX_PATTERN$cp().replace(var1, "");
      }

      private data class LocalResult(comparator: String, score: Double) {
         public final val comparator: String
         public final val score: Double

         init {
            this.comparator = var1;
            this.score = var2;
         }

         public operator fun component1(): String {
            return this.comparator;
         }

         public operator fun component2(): Double {
            return this.score;
         }

         public fun copy(comparator: String = var0.comparator, score: Double = var0.score): com.discord.user_search_worker.UserSearchWorker.Companion.LocalResult {
            return new UserSearchWorker.Companion.LocalResult(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is UserSearchWorker.Companion.LocalResult) {
               return false;
            } else {
               var1 = var1;
               if (!(this.comparator == var1.comparator)) {
                  return false;
               } else {
                  return java.lang.Double.compare(this.score, var1.score) == 0;
               }
            }
         }

         public override fun hashCode(): Int {
            return this.comparator.hashCode() * 31 + java.lang.Double.hashCode(this.score);
         }

         public override fun toString(): String {
            val var4: java.lang.String = this.comparator;
            val var1: Double = this.score;
            val var3: StringBuilder = new StringBuilder();
            var3.append("LocalResult(comparator=");
            var3.append(var4);
            var3.append(", score=");
            var3.append(var1);
            var3.append(")");
            return var3.toString();
         }
      }
   }
}
