package com.mufid.yazidmufid.data

import kotlinx.parcelize.Parcelize
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

@Parcelize
data class ProfileResponse(

    @field:SerializedName("address")
    val address: String? = null,

    @field:SerializedName("ambition")
    val ambition: String? = null,

    @field:SerializedName("born")
    val born: String? = null,

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("educations")
    val educations: List<EducationsItem>? = null,

    @field:SerializedName("experiences")
    val experiences: List<ExperiencesItem>? = null,

    @field:SerializedName("hobby")
    val hobby: List<HobbyItem>? = null
) : Parcelable

@Parcelize
data class ExperiencesItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
) : Parcelable

@Parcelize
data class EducationsItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
) : Parcelable

@Parcelize
data class HobbyItem(

    @field:SerializedName("name")
    val name: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
) : Parcelable