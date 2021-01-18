package com.ratih.restaurantfinder.utils

import com.ratih.restaurantfinder.model.ModelMain


interface OnItemClickCallback {
    fun onItemMainClicked(modelMainHorizontal: ModelMain?)
}