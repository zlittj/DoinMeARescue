@file:JvmName("ViewGroupExtensionsUtils")
package com.jzachlittle.doinmearescue.Extensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


fun ViewGroup.inflate(layoutId: Int) : View {
    return LayoutInflater.from(context).inflate(layoutId, this, false)
}