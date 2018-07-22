package com.yangc.sharing_platform.utils;


/**
 * 返回结果包装类
 *
 * @param <T> 返回信息类型
 */
public final class Result<T> {

    /**
     * 返回码  0表示正常
     */
    private int rc;

    /**
     * 返回信息
     */
    private T ret;

    private Result() {

    }

    /**
     * 执行完毕，返回信息
     *
     * @param ret 返回的信息
     * @param <T> 返回信息类型
     * @return result
     */
    public static <T> Result<T> result(T ret) {

        Result<T> result = new Result<>();
        result.rc = 0;
        result.ret = ret;
        return result;
    }

    /**
     * 执行完毕，正常返回（无返回信息）
     */
    public static <T> Result<T> success() {

        Result<T> result = new Result<>();
        result.rc = 0;
        return result;
    }

    /**
     * 执行失败，返回错误信息
     *
     * @param rc       异常码
     * @param errorMsg 错误信息
     * @return result
     */
    public static Result<String> error(int rc, String errorMsg) {

        Result<String> result = new Result<>();
        result.rc = rc;
        result.ret = errorMsg;
        return result;
    }

    /**
     * 执行失败，返回异常
     *
     * @param rc  异常码
     * @param e   异常对象
     * @param <T> 异常类型
     * @return result
     */
    public static <T> Result<T> error(int rc, T e) {

        Result<T> result = new Result<>();
        result.rc = rc;
        result.ret = e;
        return result;
    }

}
