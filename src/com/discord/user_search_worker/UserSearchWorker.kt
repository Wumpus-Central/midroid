package com.discord.user_search_worker

import eh.p
import fh.s
import hh.a
import ik.f
import java.text.Normalizer
import java.text.Normalizer.Form
import java.util.ArrayList
import java.util.LinkedHashMap
import java.util.LinkedHashSet
import java.util.Locale
import java.util.Map.Entry
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.r
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.l

internal class UserSearchWorker(onResults: (List<UserSearchWorkerResult>, String, String) -> Unit) {
   public final val onResults: (List<UserSearchWorkerResult>, String, String) -> Unit
   private final val json: Json
   private final val users: MutableMap<String, UserSearchTransformedUser>
   private final val queries: MutableMap<String, UserSearchQuerySetPayload>

   init {
      r.h(var1, "onResults");
      super();
      this.onResults = var1;
      this.json = l.b(null, <unrepresentable>.INSTANCE, 1, null);
      this.users = new LinkedHashMap<>();
      this.queries = new LinkedHashMap<>();
   }

   private fun calculateScore(score: Double, booster: Double): Double {
      val var5: Boolean;
      if (var3 == 0.0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         var3 = 1.0;
      }

      return var1 * var3;
   }

   private fun clearQuery(data: UserSearchQueryClearData) {
      this.queries.remove(var1.getUuid());
   }

   private fun fuzzySearch(needleBase: String, haystackBase: String): Boolean {
      val var9: Locale = Locale.ROOT;
      var1 = var1.toLowerCase(Locale.ROOT);
      r.g(var1, "this as java.lang.String).toLowerCase(Locale.ROOT)");
      var2 = var2.toLowerCase(var9);
      r.g(var2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
      val var6: Int = var2.length();
      var var3: Int = var1.length();
      if (var3 > var6) {
         return false;
      } else if (var3 == var6) {
         return r.c(var1, var2);
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

            var14 = var10.copy(var12, var13, var15, var3, var21, var5, s.p(var10.getNicknames(), var6.getNicknames()));
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
               if (r.c(var26, var18)) {
                  val var27: java.lang.String = var14.getFriendNickname();
                  var var19: java.lang.String = null;
                  if (var10 != null) {
                     var19 = var10.getFriendNickname();
                  }

                  if (r.c(var27, var19)) {
                     break label68;
                  }
               }

               var2 = true;
            }

            var8.addAll(var14.getNicknames().keySet());
         }
      }

      for (Entry var23 : this.queries.entrySet()) {
         val var20: java.lang.String = var23.getKey() as java.lang.String;
         val var28: UserSearchQuerySetPayload = var23.getValue() as UserSearchQuerySetPayload;
         val var24: UserSearchQuerySetFilters = var28.getFilters();
         if (var24 == null || r.c(var24.getFriends(), var2) || var24.getGuild() != null && var8.contains(var24.getGuild())) {
            this.searchUsers(var20, var28);
         }
      }
   }

   private fun searchUsers(uuid: String, payload: UserSearchQuerySetPayload) {
      var var6: Boolean;
      var var14: java.lang.String;
      label90: {
         var14 = var2.getQuery();
         val var8: UserSearchQuerySetFilters = var2.getFilters();
         if (var8 != null) {
            val var21: java.lang.Boolean = var8.getStrict();
            if (var21 != null) {
               var6 = var21;
               break label90;
            }
         }

         var6 = false;
      }

      val var11: ArrayList = new ArrayList();
      val var5: Boolean;
      if (var14.length() == 0) {
         var5 = true;
      } else {
         var5 = false;
      }

      if (var5) {
         this.onResults.invoke(var11, var14, var1);
      } else {
         var var9: java.lang.String = Regex.k.c(var14);
         val var22: StringBuilder = new StringBuilder();
         var22.append("^");
         var22.append(var9);
         val var23: java.lang.String = var22.toString();
         val var10: f = f.l;
         var var24: Regex = new Regex(var23, f.l);
         val var15: Regex = new Regex(var9, var10);

         for (Entry var27 : this.users.entrySet()) {
            val var17: java.lang.String = var27.getKey() as java.lang.String;
            val var28: UserSearchTransformedUser = var27.getValue() as UserSearchTransformedUser;
            val var18: java.lang.String = var28.getUsername();
            if (this.isValid(var17, var28, var2)) {
               val var33: java.lang.Double = var2.getBoosters().get(var17);
               val var3: Double;
               if (var33 != null) {
                  var3 = var33;
               } else {
                  var3 = 0.0;
               }

               val var37: UserSearchWorkerResult;
               if (r.c(var17, var14)) {
                  var37 = new UserSearchWorkerResult(var17, var18, var17, this.calculateScore(10.0, var3));
               } else {
                  val var31: java.util.List;
                  if (var6) {
                     val var13: java.lang.String = var28.getUsername();
                     val var34: java.lang.String = var28.getGlobalName();
                     val var12: java.lang.String = var28.getFriendNickname();
                     val var19: java.util.Map = var28.getNicknames();
                     val var29: UserSearchQuerySetFilters = var2.getFilters();
                     if (var29 != null) {
                        var9 = var29.getGuild();
                     } else {
                        var9 = null;
                     }

                     var31 = h.l(new java.lang.String[]{var13, var34, var12, var19.get(var9) as java.lang.String});
                  } else {
                     if (var6) {
                        throw new p();
                     }

                     var31 = h.v0(
                        h.l(new java.lang.String[]{var28.getUsername(), var28.getGlobalName(), var28.getFriendNickname()}), var28.getNicknames().values()
                     );
                  }

                  val var36: java.util.Iterator = h.X(var31).iterator();
                  var var35: UserSearchWorkerResult = null;
                  val var32: Regex = var24;
                  val var7: Boolean = var6;

                  while (true) {
                     var6 = var7;
                     var24 = var32;
                     var37 = var35;
                     if (!var36.hasNext()) {
                        break;
                     }

                     val var25: java.lang.String = var36.next() as java.lang.String;
                     val var26: UserSearchWorker.Companion.LocalResult;
                     if (var32.a(var25)) {
                        var26 = new UserSearchWorker.Companion.LocalResult(var25, this.calculateScore(10.0, var3));
                     } else if (var15.a(var25)) {
                        var26 = new UserSearchWorker.Companion.LocalResult(var25, this.calculateScore(5.0, var3));
                     } else if (this.fuzzySearch(var14, UserSearchWorker.Companion.access$strippedOfDiacritics(Companion, var25))) {
                        var26 = new UserSearchWorker.Companion.LocalResult(var25, this.calculateScore(1.0, var3));
                     } else {
                        var26 = null;
                     }

                     if (var26 != null && (var35 == null || var35.getScore() < var26.getScore())) {
                        var35 = new UserSearchWorkerResult(var17, var18, var26.getComparator(), var26.getScore());
                     }
                  }
               }

               if (var37 != null) {
                  var11.add(var37);
               }
            }
         }

         this.onResults.invoke(h.G0(h.E0(var11, a.b(new Function1[]{<unrepresentable>.INSTANCE, <unrepresentable>.INSTANCE})), var2.getLimit()), var14, var1);
      }
   }

   private fun setNewQuery(data: UserSearchQuerySetData) {
      this.queries.put(var1.getUuid(), var1.getPayload());
      this.searchUsers(var1.getUuid(), var1.getPayload());
   }

   public fun onMessage(dataJSON: String) {
      r.h(var1, "dataJSON");
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
         r.g(var1, "nfdNormalized");
         return UserSearchWorker.access$getSTRIP_DIACRITICS_REGEX_PATTERN$cp().h(var1, "");
      }

      private data class LocalResult(comparator: String, score: Double) {
         public final val comparator: String
         public final val score: Double

         init {
            r.h(var1, "comparator");
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
            r.h(var1, "comparator");
            return new UserSearchWorker.Companion.LocalResult(var1, var2);
         }

         public override operator fun equals(other: Any?): Boolean {
            if (this === var1) {
               return true;
            } else if (var1 !is UserSearchWorker.Companion.LocalResult) {
               return false;
            } else {
               var1 = var1;
               if (!r.c(this.comparator, var1.comparator)) {
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
