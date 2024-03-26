package com.gosport.core.presentation.foundation


interface DiffModel<T> {
    val id: T?
    override fun equals(other: Any?): Boolean
}