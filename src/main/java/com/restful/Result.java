package com.restful;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

public class Result extends ResponseEntity<Object> {

    /**--------------- CONTINUE -----------------*/

    public static Result CONTINUE(){
        return Result.CONTINUE(null,null);
    }

    public static Result CONTINUE(Object body){
        return Result.CONTINUE(body,null);
    }

    public static Result CONTINUE(HttpHeaders headers){
        return Result.CONTINUE(null,headers);
    }

    public static Result CONTINUE(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.CONTINUE);
    }

    /**--------------- SWITCHING_PROTOCOLS -----------------*/

    public static Result SWITCHING_PROTOCOLS(){
        return Result.SWITCHING_PROTOCOLS(null,null);
    }

    public static Result SWITCHING_PROTOCOLS(Object body){
        return Result.SWITCHING_PROTOCOLS(body,null);
    }

    public static Result SWITCHING_PROTOCOLS(HttpHeaders headers){
        return Result.SWITCHING_PROTOCOLS(null,headers);
    }

    public static Result SWITCHING_PROTOCOLS(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.SWITCHING_PROTOCOLS);
    }

    /**--------------- PROCESSING -----------------*/

    public static Result PROCESSING(){
        return Result.PROCESSING(null,null);
    }

    public static Result PROCESSING(Object body){
        return Result.PROCESSING(body,null);
    }

    public static Result PROCESSING(HttpHeaders headers){
        return Result.PROCESSING(null,headers);
    }

    public static Result PROCESSING(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.PROCESSING);
    }

    /**--------------- CHECKPOINT -----------------*/

    public static Result CHECKPOINT(){
        return Result.CHECKPOINT(null,null);
    }

    public static Result CHECKPOINT(Object body){
        return Result.CHECKPOINT(body,null);
    }

    public static Result CHECKPOINT(HttpHeaders headers){
        return Result.CHECKPOINT(null,headers);
    }

    public static Result CHECKPOINT(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.CHECKPOINT);
    }

    /**--------------- OK -----------------*/

    public static Result OK(){
        return Result.OK(null,null);
    }

    public static Result OK(Object body){
        return Result.OK(body,null);
    }

    public static Result OK(HttpHeaders headers){
        return Result.OK(null,headers);
    }

    public static Result OK(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.OK);
    }

    /**--------------- CREATED -----------------*/

    public static Result CREATED(){
        return Result.CREATED(null,null);
    }

    public static Result CREATED(Object body){
        return Result.CREATED(body,null);
    }

    public static Result CREATED(HttpHeaders headers){
        return Result.CREATED(null,headers);
    }

    public static Result CREATED(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.CREATED);
    }

    /**--------------- ACCEPTED -----------------*/

    public static Result ACCEPTED(){
        return Result.ACCEPTED(null,null);
    }

    public static Result ACCEPTED(Object body){
        return Result.ACCEPTED(body,null);
    }

    public static Result ACCEPTED(HttpHeaders headers){
        return Result.ACCEPTED(null,headers);
    }

    public static Result ACCEPTED(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.ACCEPTED);
    }

    /**--------------- NON_AUTHORITATIVE_INFORMATION -----------------*/

    public static Result NON_AUTHORITATIVE_INFORMATION(){
        return Result.ACCEPTED(null,null);
    }

    public static Result NON_AUTHORITATIVE_INFORMATION(Object body){
        return Result.ACCEPTED(body,null);
    }

    public static Result NON_AUTHORITATIVE_INFORMATION(HttpHeaders headers){
        return Result.ACCEPTED(null,headers);
    }

    public static Result NON_AUTHORITATIVE_INFORMATION(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.NON_AUTHORITATIVE_INFORMATION);
    }

    /**--------------- NO_CONTENT -----------------*/

    public static Result NO_CONTENT(){
        return Result.NO_CONTENT(null,null);
    }

    public static Result NO_CONTENT(Object body){
        return Result.NO_CONTENT(body,null);
    }

    public static Result NO_CONTENT(HttpHeaders headers){
        return Result.NO_CONTENT(null,headers);
    }

    public static Result NO_CONTENT(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.NO_CONTENT);
    }

    /**--------------- RESET_CONTENT -----------------*/

    public static Result RESET_CONTENT(){
        return Result.RESET_CONTENT(null,null);
    }

    public static Result RESET_CONTENT(Object body){
        return Result.RESET_CONTENT(body,null);
    }

    public static Result RESET_CONTENT(HttpHeaders headers){
        return Result.RESET_CONTENT(null,headers);
    }

    public static Result RESET_CONTENT(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.RESET_CONTENT);
    }

    /**--------------- PARTIAL_CONTENT -----------------*/

    public static Result PARTIAL_CONTENT(){
        return Result.PARTIAL_CONTENT(null,null);
    }

    public static Result PARTIAL_CONTENT(Object body){
        return Result.PARTIAL_CONTENT(body,null);
    }

    public static Result PARTIAL_CONTENT(HttpHeaders headers){
        return Result.RESET_CONTENT(null,headers);
    }

    public static Result PARTIAL_CONTENT(Object body, HttpHeaders headers){
        return new Result(body,headers,HttpStatus.PARTIAL_CONTENT);
    }

    public Result(HttpStatus status) {
        super(status);
    }

    public Result(Object body, HttpStatus status) {
        super(body, status);
    }

    public Result(MultiValueMap<String, String> headers, HttpStatus status) {
        super(headers, status);
    }

    public Result(Object body, MultiValueMap<String, String> headers, HttpStatus status) {
        super(body, headers, status);
    }
}
