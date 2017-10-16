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

/** Log a verbose message with optional format args.  */
fun verbose(message: String, vararg args: Any) = Timber.v(message, *args)

/** Log a verbose exception and a message with optional format args.  */
fun verbose(t: Throwable, message: String, vararg args: Any) = Timber.v(t, message, *args)

/** Log a verbose exception.  */
fun verbose(t: Throwable) = Timber.v(t)

/** Log a debug message with optional format args.  */
fun debug(message: String, vararg args: Any) = Timber.d(message, *args)

/** Log a debug exception and a message with optional format args.  */
fun debug(t: Throwable, message: String, vararg args: Any) = Timber.d(t, message, *args)

/** Log a debug exception.  */
fun debug(t: Throwable) = Timber.d(t)

/** Log an info message with optional format args.  */
fun info(message: String, vararg args: Any) = Timber.i(message, *args)

/** Log an info exception and a message with optional format args.  */
fun info(t: Throwable, message: String, vararg args: Any) = Timber.i(t, message, *args)

/** Log an info exception.  */
fun info(t: Throwable) = Timber.i(t)

/** Log a warning message with optional format args.  */
fun warn(message: String, vararg args: Any) = Timber.w(message, *args)

/** Log a warning exception and a message with optional format args.  */
fun warn(t: Throwable, message: String, vararg args: Any) = Timber.w(t, message, *args)

/** Log a warning exception.  */
fun warn(t: Throwable) = Timber.w(t)

/** Log an error message with optional format args.  */
fun error(message: String, vararg args: Any) = Timber.e(message, *args)

/** Log an error exception and a message with optional format args.  */
fun error(t: Throwable, message: String, vararg args: Any) = Timber.e(t, message, *args)

/** Log an error exception.  */
fun error(t: Throwable) = Timber.e(t)

/** Log an assert message with optional format args.  */
fun wtf(message: String, vararg args: Any) = Timber.wtf(message, *args)

/** Log an assert exception and a message with optional format args.  */
fun wtf(t: Throwable, message: String, vararg args: Any) = Timber.wtf(t, message, *args)

/** Log an assert exception.  */
fun wtf(t: Throwable) = Timber.wtf(t)

/** Log at `priority` a message with optional format args.  */
fun log(priority: Int, message: String, vararg args: Any) = Timber.log(priority, message, *args)

/** Log at `priority` an exception and a message with optional format args.  */
fun log(priority: Int, t: Throwable, message: String, vararg args: Any) = Timber.log(priority, t, message)

/** Log at `priority` an exception.  */
fun log(priority: Int, t: Throwable) = Timber.log(priority, t)

/** Set a one-time tag for use on the next logging call.  */
fun tag(tag: String) = Timber.tag(tag)