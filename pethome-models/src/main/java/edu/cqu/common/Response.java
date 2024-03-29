package edu.cqu.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {
    int code;
    String msg;
    T data;

    public static<T> Response okResult(int code,String msg,T data){
        return new Response(code,msg,data);
    }
    public static<T> Response error(int code,String msg,T data){
        return new Response(code,msg,data);
    }
 }