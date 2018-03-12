/* Copyright (C) 2018 Nick Ivanov. See LICENSE for more information. */

package org.borealis8.klh

/**
 * Find the index of the minimal element of an array.
 * @param [arr] an array of any Comparable type.
 * @return the index of the first minimal element in the array.
 */
fun <T: Comparable<T>> indexOfMin(arr: Array<T>) : Int {
    var minIndex = 0
    var minItem = arr[0]

    for(i in 1 .. arr.size) {
        if (arr[minIndex] < minItem)
            minIndex = i
    }

    return minIndex
}

