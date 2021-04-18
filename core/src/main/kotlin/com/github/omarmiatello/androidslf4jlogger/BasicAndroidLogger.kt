package com.github.omarmiatello.androidslf4jlogger

import android.util.Log
import org.slf4j.helpers.MarkerIgnoringBase
import org.slf4j.helpers.MessageFormatter

@Suppress("TooManyFunctions")
public abstract class BasicAndroidLogger(
    internal val levelMin: Int = Log.DEBUG,
) : MarkerIgnoringBase() {

    public abstract fun logV(msg: String, tr: Throwable? = null)

    public abstract fun logD(msg: String, tr: Throwable? = null)

    public abstract fun logI(msg: String, tr: Throwable? = null)

    public abstract fun logW(msg: String, tr: Throwable? = null)

    public abstract fun logE(msg: String, tr: Throwable? = null)

    override fun isTraceEnabled(): Boolean = levelMin >= Log.VERBOSE

    override fun isDebugEnabled(): Boolean = levelMin >= Log.DEBUG

    override fun isInfoEnabled(): Boolean = levelMin >= Log.INFO

    override fun isWarnEnabled(): Boolean = levelMin >= Log.WARN

    override fun isErrorEnabled(): Boolean = levelMin >= Log.ERROR

    override fun trace(msg: String): Unit = logV(msg)

    override fun trace(format: String, arg: Any): Unit =
        logV(MessageFormatter.format(format, arg).message)

    override fun trace(format: String, arg1: Any, arg2: Any): Unit =
        logV(MessageFormatter.format(format, arg1, arg2).message)

    override fun trace(format: String, vararg arguments: Any): Unit =
        logV(MessageFormatter.format(format, arguments).message)

    override fun trace(msg: String, t: Throwable): Unit =
        logV(msg, t)

    override fun debug(msg: String): Unit = logD(msg)

    override fun debug(format: String, arg: Any): Unit =
        logD(MessageFormatter.format(format, arg).message)

    override fun debug(format: String, arg1: Any, arg2: Any): Unit =
        logD(MessageFormatter.format(format, arg1, arg2).message)

    override fun debug(format: String, vararg arguments: Any): Unit =
        logD(MessageFormatter.format(format, arguments).message)

    override fun debug(msg: String, t: Throwable): Unit =
        logD(msg, t)

    override fun info(msg: String): Unit = logI(msg)

    override fun info(format: String, arg: Any): Unit =
        logI(MessageFormatter.format(format, arg).message)

    override fun info(format: String, arg1: Any, arg2: Any): Unit =
        logI(MessageFormatter.format(format, arg1, arg2).message)

    override fun info(format: String, vararg arguments: Any): Unit =
        logI(MessageFormatter.format(format, arguments).message)

    override fun info(msg: String, t: Throwable): Unit =
        logI(msg, t)

    override fun warn(msg: String): Unit = logW(msg)

    override fun warn(format: String, arg: Any): Unit =
        logW(MessageFormatter.format(format, arg).message)

    override fun warn(format: String, arg1: Any, arg2: Any): Unit =
        logW(MessageFormatter.format(format, arg1, arg2).message)

    override fun warn(format: String, vararg arguments: Any): Unit =
        logW(MessageFormatter.format(format, arguments).message)

    override fun warn(msg: String, t: Throwable): Unit =
        logW(msg, t)

    override fun error(msg: String): Unit = logE(msg)

    override fun error(format: String, arg: Any): Unit =
        logE(MessageFormatter.format(format, arg).message)

    override fun error(format: String, arg1: Any, arg2: Any): Unit =
        logE(MessageFormatter.format(format, arg1, arg2).message)

    override fun error(format: String, vararg arguments: Any): Unit =
        logE(MessageFormatter.format(format, arguments).message)

    override fun error(msg: String, t: Throwable): Unit =
        logE(msg, t)
}
