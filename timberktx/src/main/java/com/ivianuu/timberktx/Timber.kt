/*
 * Copyright 2018 Manuel Wrage
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("NOTHING_TO_INLINE")

package com.ivianuu.timberktx

import timber.log.Timber

/** Invokes [Timber.v] if [Timber.treeCount] is > 0 */
inline fun v(t: Throwable? = null, message: () -> String) {
    log { Timber.v(t, message()) }
}

/** Invokes [Timber.v] if [Timber.treeCount] is > 0 */
inline fun v(t: Throwable?) {
    log { Timber.v(t) }
}

/** Invokes [Timber.d] if [Timber.treeCount] is > 0 */
inline fun d(t: Throwable? = null, message: () -> String) {
    log { Timber.d(t, message()) }
}

/** Invokes [Timber.d] if [Timber.treeCount] is > 0 */
inline fun d(t: Throwable?) {
    log { Timber.d(t) }
}

/** Invokes [Timber.i] if [Timber.treeCount] is > 0 */
inline fun i(t: Throwable? = null, message: () -> String) {
    log { Timber.i(t, message()) }
}

/** Invokes [Timber.i] if [Timber.treeCount] is > 0 */
inline fun i(t: Throwable?) {
    log { Timber.i(t) }
}

/** Invokes [Timber.w] if [Timber.treeCount] is > 0 */
inline fun w(t: Throwable? = null, message: () -> String) {
    log { Timber.w(t, message()) }
}

/** Invokes [Timber.w] if [Timber.treeCount] is > 0 */
inline fun w(t: Throwable?) {
    log { Timber.w(t) }
}

/** Invokes [Timber.e] if [Timber.treeCount] is > 0 */
inline fun e(t: Throwable? = null, message: () -> String) =
    log { Timber.e(t, message()) }

/** Invokes [Timber.e] if [Timber.treeCount] is > 0 */
inline fun e(t: Throwable?) {
    log { Timber.e(t) }
}

/** Invokes [Timber.wtf] if [Timber.treeCount] is > 0 */
inline fun wtf(t: Throwable? = null, message: () -> String) {
    log { Timber.wtf(t, message()) }
}

/** Invokes [Timber.wtf] if [Timber.treeCount] is > 0 */
inline fun wtf(t: Throwable?) {
    log { Timber.wtf(t) }
}

@PublishedApi
internal inline fun log(block: () -> Unit) {
    if (Timber.treeCount() > 0) block()
}