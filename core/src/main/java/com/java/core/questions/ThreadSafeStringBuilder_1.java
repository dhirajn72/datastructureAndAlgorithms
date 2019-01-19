package com.java.core.questions;

/**
 * @author Dhiraj
 * @date 17/01/19
 */
public class ThreadSafeStringBuilder_1 {
    private static  final ThreadLocal<StringBuilder> STRING_BUILDER_THREAD_LOCAL= new ThreadLocal<StringBuilder>(){
        @Override
        protected StringBuilder initialValue() {
            return new StringBuilder();
        }
    };
    public  static StringBuilder getInstance(){
        return STRING_BUILDER_THREAD_LOCAL.get();
    }
}

