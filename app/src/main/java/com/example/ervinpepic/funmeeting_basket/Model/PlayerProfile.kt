package com.example.ervinpepic.funmeeting_basket.Model

import android.os.Parcel
import android.os.Parcelable

class PlayerProfile (var league: String, var skill: String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

        parcel.writeString(league)
        parcel.writeString(skill)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PlayerProfile> {
        override fun createFromParcel(parcel: Parcel): PlayerProfile {
            return PlayerProfile(parcel)
        }

        override fun newArray(size: Int): Array<PlayerProfile?> {
            return arrayOfNulls(size)
        }
    }

}