package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// this project belongs to https://github.com/noobshubham

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)