package com.discord.user_search_worker

import B9.s
import java.util.ArrayList
import java.util.Map.Entry
import kotlin.jvm.internal.SourceDebugExtension
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import nb.g
import pb.e.i
import rb.e

@g(with = UserSearchTransformedUser.Serializer::class)
internal data class UserSearchTransformedUser(id: String,
   username: String,
   isBot: Boolean? = null,
   isFriend: Boolean? = null,
   friendNickname: String? = null,
   globalName: String? = null,
   nicknames: Map<String, String?>
) {
   public final val id: String
   public final val username: String
   public final val isBot: Boolean?
   public final val isFriend: Boolean?
   public final val friendNickname: String?
   public final val globalName: String?
   public final val nicknames: Map<String, String?>

   init {
      this.id = var1;
      this.username = var2;
      this.isBot = var3;
      this.isFriend = var4;
      this.friendNickname = var5;
      this.globalName = var6;
      this.nicknames = var7;
   }

   public operator fun component1(): String {
      return this.id;
   }

   public operator fun component2(): String {
      return this.username;
   }

   public operator fun component3(): Boolean? {
      return this.isBot;
   }

   public operator fun component4(): Boolean? {
      return this.isFriend;
   }

   public operator fun component5(): String? {
      return this.friendNickname;
   }

   public operator fun component6(): String? {
      return this.globalName;
   }

   public operator fun component7(): Map<String, String?> {
      return this.nicknames;
   }

   public fun copy(
      id: String = var0.id,
      username: String = var0.username,
      isBot: Boolean? = var0.isBot,
      isFriend: Boolean? = var0.isFriend,
      friendNickname: String? = var0.friendNickname,
      globalName: String? = var0.globalName,
      nicknames: Map<String, String?> = var0.nicknames
   ): UserSearchTransformedUser {
      return new UserSearchTransformedUser(var1, var2, var3, var4, var5, var6, var7);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is UserSearchTransformedUser) {
         return false;
      } else {
         var1 = var1;
         if (!(this.id == var1.id)) {
            return false;
         } else if (!(this.username == var1.username)) {
            return false;
         } else if (!(this.isBot == var1.isBot)) {
            return false;
         } else if (!(this.isFriend == var1.isFriend)) {
            return false;
         } else if (!(this.friendNickname == var1.friendNickname)) {
            return false;
         } else if (!(this.globalName == var1.globalName)) {
            return false;
         } else {
            return this.nicknames == var1.nicknames;
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = this.id.hashCode();
      val var5: Int = this.username.hashCode();
      var var4: Int = 0;
      val var1: Int;
      if (this.isBot == null) {
         var1 = 0;
      } else {
         var1 = this.isBot.hashCode();
      }

      val var2: Int;
      if (this.isFriend == null) {
         var2 = 0;
      } else {
         var2 = this.isFriend.hashCode();
      }

      val var3: Int;
      if (this.friendNickname == null) {
         var3 = 0;
      } else {
         var3 = this.friendNickname.hashCode();
      }

      if (this.globalName != null) {
         var4 = this.globalName.hashCode();
      }

      return (((((var6 * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4) * 31 + this.nicknames.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = this.id;
      val var6: java.lang.String = this.username;
      val var8: java.lang.Boolean = this.isBot;
      val var5: java.lang.Boolean = this.isFriend;
      val var2: java.lang.String = this.friendNickname;
      val var7: java.lang.String = this.globalName;
      val var3: java.util.Map = this.nicknames;
      val var4: StringBuilder = new StringBuilder();
      var4.append("UserSearchTransformedUser(id=");
      var4.append(var1);
      var4.append(", username=");
      var4.append(var6);
      var4.append(", isBot=");
      var4.append(var8);
      var4.append(", isFriend=");
      var4.append(var5);
      var4.append(", friendNickname=");
      var4.append(var2);
      var4.append(", globalName=");
      var4.append(var7);
      var4.append(", nicknames=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<UserSearchTransformedUser> {
         return UserSearchTransformedUser.Serializer.INSTANCE;
      }
   }

   @SourceDebugExtension(["SMAP\nUserSearchTransformedUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserSearchTransformedUser.kt\ncom/discord/user_search_worker/UserSearchTransformedUser$Serializer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,67:1\n126#2:68\n153#2,3:69\n*S KotlinDebug\n*F\n+ 1 UserSearchTransformedUser.kt\ncom/discord/user_search_worker/UserSearchTransformedUser$Serializer\n*L\n38#1:68\n38#1:69,3\n*E\n"])
   internal object Serializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return pb.g.a("UserSearchTransformedUser", i.a);
         }


      public open fun deserialize(decoder: Decoder): UserSearchTransformedUser {
         var var5: JsonObject;
         var var26: java.util.Map;
         label73: {
            val var10: JsonElement = (var1 as e).g();
            var5 = var10 as JsonObject;
            val var11: JsonElement = (var10 as JsonObject).get("nicknames") as JsonElement;
            if (var11 != null) {
               val var16: java.util.Map;
               if (var11 !is JsonObject) {
                  var16 = L.h();
               } else {
                  val var12: java.util.Map = var11 as java.util.Map;
                  val var2: ArrayList = new ArrayList((var11 as java.util.Map).size());

                  for (Entry var13 : var12.entrySet()) {
                     val var3: java.lang.String = var13.getKey() as java.lang.String;
                     val var14: JsonElement = var13.getValue() as JsonElement;
                     val var15: java.lang.String;
                     if (rb.g.p(var14).g()) {
                        var15 = rb.g.p(var14).a();
                     } else {
                        var15 = null;
                     }

                     var2.add(s.a(var3, var15));
                  }

                  var16 = L.t(var2);
               }

               var26 = var16;
               if (var16 != null) {
                  break label73;
               }
            }

            var26 = L.h();
         }

         var var7: java.lang.String;
         var var8: java.lang.String;
         var var27: java.lang.Boolean;
         label58: {
            var var17: Any = var5.get("id");
            var7 = rb.g.p(var17 as JsonElement).a();
            var17 = var5.get("username");
            var8 = rb.g.p(var17 as JsonElement).a();
            var17 = var5.get("isBot") as JsonElement;
            if (var17 != null) {
               var17 = rb.g.p((JsonElement)var17);
               if (var17 != null) {
                  var27 = rb.g.f((JsonPrimitive)var17);
                  break label58;
               }
            }

            var27 = null;
         }

         var var28: java.lang.Boolean;
         label53: {
            val var21: JsonElement = var5.get("isFriend") as JsonElement;
            if (var21 != null) {
               val var22: JsonPrimitive = rb.g.p(var21);
               if (var22 != null) {
                  var28 = rb.g.f(var22);
                  break label53;
               }
            }

            var28 = null;
         }

         label48: {
            val var23: JsonElement = var5.get("friendNickname") as JsonElement;
            if (var23 != null) {
               val var24: JsonPrimitive = rb.g.p(var23);
               if (var24 != null) {
                  if (var24.g()) {
                     var25 = var24.a();
                  } else {
                     var25 = null;
                  }
                  break label48;
               }
            }

            var25 = null;
         }

         val var9: JsonElement = var5.get("globalName") as JsonElement;
         var var29: java.lang.String = null;
         if (var9 != null) {
            val var30: JsonPrimitive = rb.g.p(var9);
            var29 = null;
            if (var30 != null) {
               var29 = null;
               if (var30.g()) {
                  var29 = var30.a();
               }
            }
         }

         return new UserSearchTransformedUser(var7, var8, var27, var28, var25, var29, var26);
      }

      public open fun serialize(encoder: Encoder, value: UserSearchTransformedUser) {
         throw new UnsupportedOperationException();
      }
   }
}
