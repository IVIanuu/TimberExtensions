/*
 * Copyright 2017 Manuel Wrage
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

package com.ivianuu.timberextensions

import timber.log.Timber

/** Invokes the function only if there are timber trees */
inline fun ifPlanted(func: () -> Unit) {
    if (Timber.treeCount() != 0) {
        func()
    }
}

/** Calls the timber v method if there are timber trees */
inline fun v(message: () -> String) = ifPlanted { Timber.v(message()) }

/** Calls the timber v method if there are timber trees */
inline fun v(t: Throwable, message: () -> String) = ifPlanted { Timber.v(t, message()) }

/** Calls the timber v method if there are timber trees */
fun v(t: Throwable) = Timber.v(t)

/** Calls the timber d method if there are timber trees */
inline fun d(message: () -> String) = ifPlanted { Timber.d(message()) }

/** Calls the timber d method if there are timber trees */
inline fun d(t: Throwable, message: () -> String) = ifPlanted { Timber.d(t, message()) }

/** Calls the timber d method if there are timber trees */
fun d(t: Throwable) = Timber.d(t)

/** Calls the timber i method if there are timber trees */
inline fun i(message: () -> String) = ifPlanted { Timber.i(message()) }

/** Calls the timber í method if there are timber trees */
inline fun i(t: Throwable, message: () -> String) = ifPlanted { Timber.i(t, message()) }

/** Calls the timber i method if there are timber trees */
fun i(t: Throwable) = Timber.i(t)

/** Calls the timber w method if there are timber trees */
inline fun w(message: () -> String) = ifPlanted { Timber.w(message()) }

/** Calls the timber w method if there are timber trees */
inline fun w(t: Throwable, message: () -> String) = ifPlanted { Timber.w(t, message()) }

/** Calls the timber w method if there are timber trees */
fun w(t: Throwable) = Timber.w(t)

/** Calls the timber e method if there are timber trees */
inline fun e(message: () -> String) = ifPlanted { Timber.e(message()) }

/** Calls the timber e method if there are timber trees */
inline fun e(t: Throwable, message: () -> String) = ifPlanted { Timber.e(t, message()) }

/** Calls the timber e method if there are timber trees */
fun e(t: Throwable) = Timber.e(t)

/** Calls the timber wtf method if there are timber trees */
inline fun wtf(message: () -> String) = ifPlanted { Timber.wtf(message()) }

/** Calls the timber wtf method if there are timber trees */
inline fun wtf(t: Throwable, message: () -> String) = ifPlanted { Timber.wtf(t, message()) }

/** Calls the timber wtf method if there are timber trees */
fun wtf(t: Throwable) = Timber.wtf(t)

/** Calls the timber log method if there are timber trees */
inline fun log(priority: Int, t: Throwable, message: () -> String) = ifPlanted { Timber.log(priority, t, message()) }

/** Calls the timber log method if there are timber trees */
inline fun log(priority: Int, message: () -> String) = ifPlanted { Timber.log(priority, message()) }

/** Calls the timber log method if there are timber trees */
fun log(priority: Int, throwable: Throwable) = Timber.log(priority, throwable)