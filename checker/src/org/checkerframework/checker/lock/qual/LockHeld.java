package org.checkerframework.checker.lock.qual;

import org.checkerframework.framework.qual.InvisibleQualifier;
import org.checkerframework.framework.qual.SubtypeOf;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that an expression is used as a lock and the lock
 * is known to be held on the current thread.
 * <p>
 *
 * This annotation may not be written in source code; it is an
 * implementation detail of the checker.
 *
 * @see LockPossiblyHeld
 * @checker_framework.manual #lock-checker Lock Checker
 */
@SubtypeOf(LockPossiblyHeld.class) // This is the bottom type in this hierarchy
@InvisibleQualifier
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE_USE, ElementType.TYPE_PARAMETER })
public @interface LockHeld {}
