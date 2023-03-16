package io.wispforest.owo.config.annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * Applied to a non-primitive field, allowing it to be null.
 * {@code @Nullable} will be generated instead of NotNull
 */
@Target(ElementType.FIELD)
public @interface Nullable {}
