package com.discord.user_search_worker

import gh.p
import hh.r
import java.text.Normalizer
import java.text.Normalizer.Form
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Locale
import java.util.Map.Entry
import jh.a
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.b
import mk.d

internal class UserSearchWorker(onResults: (List<UserSearchWorkerResult>, String, String) -> Unit) {
   public final val onResults: (List<UserSearchWorkerResult>, String, String) -> Unit
   private final val json: Json
   private final val users: MutableMap<String, UserSearchTransformedUser>
   private final val queries: MutableMap<String, UserSearchQuerySetPayload>

   init {
      q.h(var1, "onResults");
      super();
      this.onResults = var1;
      this.json = b.b(null, <unrepresentable>.INSTANCE, 1, null);
      this.users = new LinkedHashMap<>();
      this.queries = new LinkedHashMap<>();
   }

   private fun calculateScore(score: Double, booster: Double): Double {
      var var5: Double = var3;
      if (var3 == 0.0) {
         var5 = 1.0;
      }

      return var1 * var5;
   }

   private fun clearQuery(data: UserSearchQueryClearData) {
      this.queries.remove(var1.getUuid());
   }

   private fun fuzzySearch(needleBase: String, haystackBase: String): Boolean {
      val var9: Locale = Locale.ROOT;
      var1 = var1.toLowerCase(Locale.ROOT);
      q.g(var1, "toLowerCase(...)");
      var2 = var2.toLowerCase(var9);
      q.g(var2, "toLowerCase(...)");
      val var6: Int = var2.length();
      var var3: Int = var1.length();
      if (var3 > var6) {
         return false;
      } else if (var3 == var6) {
         return q.c(var1, var2);
      } else {
         val var7: Int = var1.length();
         var var5: Int = 0;
         var3 = 0;

         while (var5 < var7) {
            val var8: Char = var1.charAt(var5);

            var var4: Int;
            while (true) {
               var4 = var3;
               if (var3 >= var6) {
                  break;
               }

               var4 = var3 + 1;
               if (var2.charAt(var3) == var8) {
                  break;
               }

               var3 = var4;
            }

            if (var4 == var6) {
               return false;
            }

            var5++;
            var3 = var4;
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
            val var12: java.lang.String = var6.getId();
            val var13: java.lang.String = var6.getUsername();
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

            var14 = var10.copy(var12, var13, var15, var3, var21, var5, r.p(var10.getNicknames(), var6.getNicknames()));
            if (var14 == null) {
               var14 = var6;
            }
         }

         this.users.put(var11, var14);
         if (this.queries.isEmpty() xor true) {
            val var26: java.lang.Boolean = var14.isFriend();
            val var18: java.lang.Boolean;
            if (var10 != null) {
               var18 = var10.isFriend();
            } else {
               var18 = null;
            }

            label68: {
               if (q.c(var26, var18)) {
                  val var27: java.lang.String = var14.getFriendNickname();
                  var var19: java.lang.String = null;
                  if (var10 != null) {
                     var19 = var10.getFriendNickname();
                  }

                  if (q.c(var27, var19)) {
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
         if (var24 == null || q.c(var24.getFriends(), var2) || var24.getGuild() != null && var8.contains(var24.getGuild())) {
            this.searchUsers(var16, var28);
         }
      }
   }

   private fun searchUsers(uuid: String, payload: UserSearchQuerySetPayload) {
      var var5: Boolean;
      var var11: java.lang.String;
      label90: {
         var11 = var2.getQuery();
         val var6: UserSearchQuerySetFilters = var2.getFilters();
         if (var6 != null) {
            val var19: java.lang.Boolean = var6.getStrict();
            if (var19 != null) {
               var5 = var19;
               break label90;
            }
         }

         var5 = false;
      }

      val var10: ArrayList = new ArrayList();
      if (var11.length() == 0) {
         this.onResults.invoke(var10, var11, var1);
      } else {
         var var20: java.lang.String = Regex.k.c(var11);
         val var7: StringBuilder = new StringBuilder();
         var7.append("^");
         var7.append(var20);
         val var24: java.lang.String = var7.toString();
         val var8: d = d.l;
         val var25: Regex = new Regex(var24, d.l);
         val var12: Regex = new Regex(var20, var8);
         var var21: java.util.Iterator = this.users.entrySet().iterator();

         while (var21.hasNext()) {
            val var26: Entry = var21.next() as Entry;
            val var13: java.lang.String = var26.getKey() as java.lang.String;
            val var27: UserSearchTransformedUser = var26.getValue() as UserSearchTransformedUser;
            val var14: java.lang.String = var27.getUsername();
            if (this.isValid(var13, var27, var2)) {
               val var9: java.lang.Double = var2.getBoosters().get(var13);
               val var3: Double;
               if (var9 != null) {
                  var3 = var9;
               } else {
                  var3 = 0.0;
               }

               var var31: UserSearchWorkerResult;
               if (q.c(var13, var11)) {
                  var31 = new UserSearchWorkerResult(var13, var14, var13, this.calculateScore(10.0, var3));
               } else {
                  val var30: java.util.List;
                  if (var5) {
                     val var16: java.lang.String = var27.getUsername();
                     val var15: java.lang.String = var27.getGlobalName();
                     val var32: java.lang.String = var27.getFriendNickname();
                     val var17: java.util.Map = var27.getNicknames();
                     val var28: UserSearchQuerySetFilters = var2.getFilters();
                     val var29: java.lang.String;
                     if (var28 != null) {
                        var29 = var28.getGuild();
                     } else {
                        var29 = null;
                     }

                     var30 = i.m(new java.lang.String[]{var16, var15, var32, (java.lang.String)var17.get(var29)});
                  } else {
                     if (var5) {
                        throw new p();
                     }

                     var30 = i.y0(
                        i.m(new java.lang.String[]{var27.getUsername(), var27.getGlobalName(), var27.getFriendNickname()}), var27.getNicknames().values()
                     );
                  }

                  val var34: java.util.Iterator = i.a0(var30).iterator();
                  var31 = null;

                  while (var34.hasNext()) {
                     var20 = var34.next() as java.lang.String;
                     val var23: UserSearchWorker.Companion.LocalResult;
                     if (var25.a(var20)) {
                        var23 = new UserSearchWorker.Companion.LocalResult(var20, this.calculateScore(10.0, var3));
                     } else if (var12.a(var20)) {
                        var23 = new UserSearchWorker.Companion.LocalResult(var20, this.calculateScore(5.0, var3));
                     } else if (this.fuzzySearch(var11, UserSearchWorker.Companion.access$strippedOfDiacritics(Companion, var20))) {
                        var23 = new UserSearchWorker.Companion.LocalResult(var20, this.calculateScore(1.0, var3));
                     } else {
                        var23 = null;
                     }

                     if (var23 != null && (var31 == null || var31.getScore() < var23.getScore())) {
                        var31 = new UserSearchWorkerResult(var13, var14, var23.getComparator(), var23.getScore());
                     }
                  }

                  var21 = var21;
               }

               if (var31 != null) {
                  var10.add(var31);
               }
            }
         }

         this.onResults.invoke(i.J0(i.H0(var10, a.b(new Function1[]{<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE})), var2.getLimit()), var11, var1);
      }
   }

   private fun setNewQuery(data: UserSearchQuerySetData) {
      this.queries.put(var1.getUuid(), var1.getPayload());
      this.searchUsers(var1.getUuid(), var1.getPayload());
   }

   public fun onMessage(dataJSON: String) {
      q.h(var1, "dataJSON");
      val var2: Json = this.json;
      this.json.a();
      val var3: UserSearchData = var2.b(UserSearchData.Companion.serializer(), var1) as UserSearchData;
      if (var3 is UserSearchUpdateUsersData) {
         this.mergeUsers(var3 as UserSearchUpdateUsersData);
      } else if (var3 is UserSearchQuerySetData) {
         this.setNewQuery(var3 as UserSearchQuerySetData);
      } else if (var3 is UserSearchQueryClearData) {
         this.clearQuery(var3 as UserSearchQueryClearData);
      }
   }

   public fun terminate() {
      this.users.clear();
      this.queries.clear();
   }

   public companion object {
      private const val CONTAIN_MATCH_VALUE: Double
      private const val EXACT_MATCH_VALUE: Double
      private const val FUZZY_MATCH_VALUE: Double
      private final val STRIP_DIACRITICS_REGEX_PATTERN: Regex

      private fun String.strippedOfDiacritics(): String {
         var1 = Normalizer.normalize(var1, Form.NFD);
         q.e(var1);
         return UserSearchWorker.access$getSTRIP_DIACRITICS_REGEX_PATTERN$cp().h(var1, "");
      }

      private data class LocalResult(comparator: String, score: Double) {
         public final val comparator: String
         public final val score: Double

         init {
            q.h(var1, "comparator");
            super();
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
            q.h(var1, "comparator");
            return new UserSearchWorker.Companion.LocalResult(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is UserSearchWorker.Companion.LocalResult) {
               return false;
            } else {
               var1 = var1;
               if (!q.c(this.comparator, var1.comparator)) {
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
            val var3: java.lang.String = this.comparator;
            val var1: Double = this.score;
            val var4: StringBuilder = new StringBuilder();
            var4.append("LocalResult(comparator=");
            var4.append(var3);
            var4.append(", score=");
            var4.append(var1);
            var4.append(")");
            return var4.toString();
         }
      }
   }
}
