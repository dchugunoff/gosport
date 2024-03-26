package com.gosport.core.presentation.extensions

import android.net.Uri
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDirections
import androidx.navigation.NavOptions
import com.gosport.gosporttechnicaltask.core.presentation.R

fun NavController.safeNavigation(@IdRes actionId: Int) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId) }
}

fun NavController.safeNavigation(url: String) {
    navigate(url.toUri(), navOptionsBuilder())
}

fun NavController.safeNavigation(url: String, navOptions: NavOptions) {
    navigate(url.toUri(), navOptions)
}

fun NavController.safeNavigation(url: Uri) {
    navigate(url, navOptionsBuilder())
}

fun NavController.safeNavigation(url: Uri, navOptions: NavOptions) {
    navigate(url, navOptions)
}

fun NavController.safeNavigation(
    @IdRes actionId: Int,
    args: Bundle? = null,
    navOptionsBuilder: () -> NavOptions,
) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId, args, navOptionsBuilder()) }
}

fun NavController.safeNavigation(
    @IdRes actionId: Int,
    args: Bundle,
) {
    currentDestination?.getAction(actionId)?.let { navigate(actionId, args) }
}

fun NavController.safeNavigation(
    @IdRes actionId: Int,
    navOptions: NavOptions
) {
    currentDestination?.getAction(actionId)
        ?.let {
            navigate(actionId, null, navOptions = navOptions)
        }
}

fun navOptionsBuilder(builder: (NavOptions.Builder) -> NavOptions.Builder = { it }) =
    builder(
        NavOptions.Builder()
            .setEnterAnim(R.anim.scale_in)
            .setExitAnim(R.anim.scale_out)
            .setPopEnterAnim(R.anim.scale_in)
            .setPopExitAnim(R.anim.scale_out)
    ).build()

fun NavController.directionsSafeNavigation(directions: NavDirections) {
    currentDestination?.getAction(directions.actionId)?.let { navigate(directions) }
}

fun NavController.directionsSafeNavigation(
    directions: NavDirections,
    actionBeforeNavigation: () -> Unit
) {
    currentDestination?.getAction(directions.actionId)
        ?.let {
            navigate(directions)
            actionBeforeNavigation()
        }
}