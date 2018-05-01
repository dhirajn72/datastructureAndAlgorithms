package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 01/05/18
 */
public class ThreadSafeStringBuilder {

    private static final ThreadLocal<StringBuilder> STRING_BUILDER_THREAD_LOCAL= new ThreadLocal<StringBuilder>(){
        @Override
        protected StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public static StringBuilder getInstance(){
        return STRING_BUILDER_THREAD_LOCAL.get();
    }
}
