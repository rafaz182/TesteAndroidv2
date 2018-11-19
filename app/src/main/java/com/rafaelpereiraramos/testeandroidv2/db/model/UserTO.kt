package com.rafaelpereiraramos.testeandroidv2.db.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

/**
 * Created by Rafael P. Ramos on 17/11/2018.
 */
@Entity
data class UserTO(
    @SerializedName("agency") val agency: String? = "",
    @SerializedName("balance") val balance: Float = 0.0f,
    @SerializedName("bankAccount") val bankAccount: String? = "",
    @PrimaryKey @SerializedName("userId") val id: Int = 0,
    @SerializedName("name") val name: String? = "user",
    val password: String? = "",
    val userName: String? = ""
)