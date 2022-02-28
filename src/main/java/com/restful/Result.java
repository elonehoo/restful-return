package com.restful;

import org.springframework.http.*;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;
import org.springframework.util.MultiValueMap;

import java.net.URI;
import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Extension of {@link HttpEntity} that adds a {@link HttpStatus} status code.
 * Used in {@code RestTemplate} as well {@code @Controller} methods.
 *
 * <p>Can also be used in Spring Boot, as the return value from a @RestController method:
 * <pre class="code">
 * &#64;GetMapping("/demo")
 * public Result demo(){
 *  List<String> list = new ArrayList<>();
 *  for (int i = 0; i < 10; i++){
 *    list.add(String.valueOf(i));
 *  }
 *  HttpHeaders headers = new HttpHeaders();
 *  headers.add("token", "foo");
 *  return Result.success(list,headers);*
 * }
 * </pre>
 */
public class Result extends ResponseEntity<Object> {

	/**--------------- CONTINUE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONTINUE CONTINUE}.
	 * @return {@link Result}
	 */
	public static Result continues(){
		return Result.continues(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONTINUE CONTINUE}.
	 * @return {@link Result}
	 */
	public static Result continues(Object body){
		return Result.continues(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONTINUE CONTINUE}.
	 * @return {@link Result}
	 */
	public static Result continues(HttpHeaders headers){
		return Result.continues(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONTINUE CONTINUE}.
	 * @return {@link Result}
	 */
	public static Result continues(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.CONTINUE);
	}

	/**--------------- SWITCHING_PROTOCOLS -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SWITCHING_PROTOCOLS SWITCHING_PROTOCOLS}.
	 * @return {@link Result}
	 */
	public static Result switchingProtocols(){
		return Result.switchingProtocols(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SWITCHING_PROTOCOLS SWITCHING_PROTOCOLS}.
	 * @return {@link Result}
	 */
	public static Result switchingProtocols(Object body){
		return Result.switchingProtocols(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SWITCHING_PROTOCOLS SWITCHING_PROTOCOLS}.
	 * @return {@link Result}
	 */
	public static Result switchingProtocols(HttpHeaders headers){
		return Result.switchingProtocols(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SWITCHING_PROTOCOLS SWITCHING_PROTOCOLS}.
	 * @return {@link Result}
	 */
	public static Result switchingProtocols(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.SWITCHING_PROTOCOLS);
	}

	/**--------------- PROCESSING -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROCESSING PROCESSING}.
	 * @return {@link Result}
	 */
	public static Result processing(){
		return Result.processing(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROCESSING PROCESSING}.
	 * @return {@link Result}
	 */
	public static Result processing(Object body){
		return Result.processing(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROCESSING PROCESSING}.
	 * @return {@link Result}
	 */
	public static Result processing(HttpHeaders headers){
		return Result.processing(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROCESSING PROCESSING}.
	 * @return {@link Result}
	 */
	public static Result processing(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PROCESSING);
	}

	/**--------------- CHECKPOINT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CHECKPOINT CHECKPOINT}.
	 * @return {@link Result}
	 */
	public static Result checkpoint(){
		return Result.checkpoint(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CHECKPOINT CHECKPOINT}.
	 * @return {@link Result}
	 */
	public static Result checkpoint(Object body){
		return Result.checkpoint(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CHECKPOINT CHECKPOINT}.
	 * @return {@link Result}
	 */
	public static Result checkpoint(HttpHeaders headers){
		return Result.checkpoint(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CHECKPOINT CHECKPOINT}.
	 * @return {@link Result}
	 */
	public static Result checkpoint(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.CHECKPOINT);
	}

	/**--------------- OK -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#OK OK}.
	 * @return {@link Result}
	 */
	public static Result success(){
		return Result.success(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#OK OK}.
	 * @return {@link Result}
	 */
	public static Result success(Object body){
		return Result.success(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#OK OK}.
	 * @return {@link Result}
	 */
	public static Result success(HttpHeaders headers){
		return Result.success(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#OK OK}.
	 * @return {@link Result}
	 */
	public static Result success(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.OK);
	}

	/**--------------- CREATED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CREATED CREATED}.
	 * @return {@link Result}
	 */
	public static Result created(){
		return Result.created(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CREATED CREATED}.
	 * @return {@link Result}
	 */
	public static Result created(Object body){
		return Result.created(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CREATED CREATED}.
	 * @return {@link Result}
	 */
	public static Result created(HttpHeaders headers){
		return Result.created(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CREATED CREATED}.
	 * @return {@link Result}
	 */
	public static Result created(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.CREATED);
	}

	/**--------------- ACCEPTED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ACCEPTED ACCEPTED}.
	 * @return {@link Result}
	 */
	public static Result acceptably(){
		return Result.acceptably(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ACCEPTED ACCEPTED}.
	 * @return {@link Result}
	 */
	public static Result acceptably(Object body){
		return Result.acceptably(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ACCEPTED ACCEPTED}.
	 * @return {@link Result}
	 */
	public static Result acceptably(HttpHeaders headers){
		return Result.acceptably(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ACCEPTED ACCEPTED}.
	 * @return {@link Result}
	 */
	public static Result acceptably(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.ACCEPTED);
	}

	/**--------------- NON_AUTHORITATIVE_INFORMATION -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NON_AUTHORITATIVE_INFORMATION NON_AUTHORITATIVE_INFORMATION}.
	 * @return {@link Result}
	 */
	public static Result nonAuthoritativeInformation(){
		return Result.nonAuthoritativeInformation(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NON_AUTHORITATIVE_INFORMATION NON_AUTHORITATIVE_INFORMATION}.
	 * @return {@link Result}
	 */
	public static Result nonAuthoritativeInformation(Object body){
		return Result.nonAuthoritativeInformation(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NON_AUTHORITATIVE_INFORMATION NON_AUTHORITATIVE_INFORMATION}.
	 * @return {@link Result}
	 */
	public static Result nonAuthoritativeInformation(HttpHeaders headers){
		return Result.nonAuthoritativeInformation(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NON_AUTHORITATIVE_INFORMATION NON_AUTHORITATIVE_INFORMATION}.
	 * @return {@link Result}
	 */
	public static Result nonAuthoritativeInformation(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NON_AUTHORITATIVE_INFORMATION);
	}


	/**--------------- NO_CONTENT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NO_CONTENT NO_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result noContents(){
		return Result.noContents(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NO_CONTENT NO_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result noContents(Object body){
		return Result.noContents(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NO_CONTENT NO_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result noContents(HttpHeaders headers){
		return Result.noContents(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NO_CONTENT NO_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result noContents(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NO_CONTENT);
	}

	/**--------------- RESET_CONTENT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#RESET_CONTENT RESET_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result resetContent(){
		return Result.resetContent(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#RESET_CONTENT RESET_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result resetContent(Object body){
		return Result.resetContent(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#RESET_CONTENT RESET_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result resetContent(HttpHeaders headers){
		return Result.resetContent(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#RESET_CONTENT RESET_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result resetContent(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.RESET_CONTENT);
	}

	/**--------------- PARTIAL_CONTENT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PARTIAL_CONTENT PARTIAL_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result partialContent(){
		return Result.partialContent(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PARTIAL_CONTENT PARTIAL_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result partialContent(Object body){
		return Result.partialContent(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PARTIAL_CONTENT PARTIAL_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result partialContent(HttpHeaders headers){
		return Result.partialContent(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PARTIAL_CONTENT PARTIAL_CONTENT}.
	 * @return {@link Result}
	 */
	public static Result partialContent(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PARTIAL_CONTENT);
	}

	/**--------------- MULTI_STATUS -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTI_STATUS MULTI_STATUS}.
	 * @return {@link Result}
	 */
	public static Result multiStatus(){
		return Result.multiStatus(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTI_STATUS MULTI_STATUS}.
	 * @return {@link Result}
	 */
	public static Result multiStatus(Object body){
		return Result.multiStatus(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTI_STATUS MULTI_STATUS}.
	 * @return {@link Result}
	 */
	public static Result multiStatus(HttpHeaders headers){
		return Result.multiStatus(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTI_STATUS MULTI_STATUS}.
	 * @return {@link Result}
	 */
	public static Result multiStatus(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.MULTI_STATUS);
	}

	/**--------------- ALREADY_REPORTED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ALREADY_REPORTED ALREADY_REPORTED}.
	 * @return {@link Result}
	 */
	public static Result alreadyReported(){
		return Result.alreadyReported(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ALREADY_REPORTED ALREADY_REPORTED}.
	 * @return {@link Result}
	 */
	public static Result alreadyReported(Object body){
		return Result.alreadyReported(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ALREADY_REPORTED ALREADY_REPORTED}.
	 * @return {@link Result}
	 */
	public static Result alreadyReported(HttpHeaders headers){
		return Result.alreadyReported(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#ALREADY_REPORTED ALREADY_REPORTED}.
	 * @return {@link Result}
	 */
	public static Result alreadyReported(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.ALREADY_REPORTED);
	}

	/**--------------- IM_USED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#IM_USED IM_USED}.
	 * @return {@link Result}
	 */
	public static Result imUsed(){
		return Result.imUsed(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#IM_USED IM_USED}.
	 * @return {@link Result}
	 */
	public static Result imUsed(Object body){
		return Result.imUsed(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#IM_USED IM_USED}.
	 * @return {@link Result}
	 */
	public static Result imUsed(HttpHeaders headers){
		return Result.imUsed(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#IM_USED IM_USED}.
	 * @return {@link Result}
	 */
	public static Result imUsed(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.IM_USED);
	}

	/**--------------- MULTIPLE_CHOICES -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTIPLE_CHOICES MULTIPLE_CHOICES}.
	 * @return {@link Result}
	 */
	public static Result multipleChoices(){
		return Result.multipleChoices(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTIPLE_CHOICES MULTIPLE_CHOICES}.
	 * @return {@link Result}
	 */
	public static Result multipleChoices(Object body){
		return Result.multipleChoices(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTIPLE_CHOICES MULTIPLE_CHOICES}.
	 * @return {@link Result}
	 */
	public static Result multipleChoices(HttpHeaders headers){
		return Result.multipleChoices(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MULTIPLE_CHOICES MULTIPLE_CHOICES}.
	 * @return {@link Result}
	 */
	public static Result multipleChoices(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.MULTIPLE_CHOICES);
	}

	/**--------------- MOVED_PERMANENTLY -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MOVED_PERMANENTLY MOVED_PERMANENTLY}.
	 * @return {@link Result}
	 */
	public static Result movedPermanently(){
		return Result.movedPermanently(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MOVED_PERMANENTLY MOVED_PERMANENTLY}.
	 * @return {@link Result}
	 */
	public static Result movedPermanently(Object body){
		return Result.movedPermanently(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MOVED_PERMANENTLY MOVED_PERMANENTLY}.
	 * @return {@link Result}
	 */
	public static Result movedPermanently(HttpHeaders headers){
		return Result.movedPermanently(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#MOVED_PERMANENTLY MOVED_PERMANENTLY}.
	 * @return {@link Result}
	 */
	public static Result movedPermanently(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.MOVED_PERMANENTLY);
	}

	/**--------------- FOUND -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FOUND FOUND}.
	 * @return {@link Result}
	 */
	public static Result found(){
		return Result.found(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FOUND FOUND}.
	 * @return {@link Result}
	 */
	public static Result found(Object body){
		return Result.found(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FOUND FOUND}.
	 * @return {@link Result}
	 */
	public static Result found(HttpHeaders headers){
		return Result.found(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FOUND FOUND}.
	 * @return {@link Result}
	 */
	public static Result found(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.FOUND);
	}

	/**--------------- SEE_OTHER -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SEE_OTHER SEE_OTHER}.
	 * @return {@link Result}
	 */
	public static Result seeOther(){
		return Result.seeOther(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SEE_OTHER SEE_OTHER}.
	 * @return {@link Result}
	 */
	public static Result seeOther(Object body){
		return Result.seeOther(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SEE_OTHER SEE_OTHER}.
	 * @return {@link Result}
	 */
	public static Result seeOther(HttpHeaders headers){
		return Result.seeOther(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SEE_OTHER SEE_OTHER}.
	 * @return {@link Result}
	 */
	public static Result seeOther(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.SEE_OTHER);
	}

	/**--------------- NOT_MODIFIED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_MODIFIED NOT_MODIFIED}.
	 * @return {@link Result}
	 */
	public static Result notModified(){
		return Result.notModified(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_MODIFIED NOT_MODIFIED}.
	 * @return {@link Result}
	 */
	public static Result notModified(Object body){
		return Result.notModified(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_MODIFIED NOT_MODIFIED}.
	 * @return {@link Result}
	 */
	public static Result notModified(HttpHeaders headers){
		return Result.notModified(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_MODIFIED NOT_MODIFIED}.
	 * @return {@link Result}
	 */
	public static Result notModified(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NOT_MODIFIED);
	}

	/**--------------- TEMPORARY_REDIRECT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TEMPORARY_REDIRECT TEMPORARY_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result temporaryRedirect(){
		return Result.temporaryRedirect(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TEMPORARY_REDIRECT TEMPORARY_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result temporaryRedirect(Object body){
		return Result.temporaryRedirect(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TEMPORARY_REDIRECT TEMPORARY_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result temporaryRedirect(HttpHeaders headers){
		return Result.temporaryRedirect(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TEMPORARY_REDIRECT TEMPORARY_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result temporaryRedirect(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.TEMPORARY_REDIRECT);
	}

	/**--------------- PERMANENT_REDIRECT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PERMANENT_REDIRECT PERMANENT_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result permanentRedirect(){
		return Result.permanentRedirect(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PERMANENT_REDIRECT PERMANENT_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result permanentRedirect(Object body){
		return Result.permanentRedirect(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PERMANENT_REDIRECT PERMANENT_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result permanentRedirect(HttpHeaders headers){
		return Result.permanentRedirect(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PERMANENT_REDIRECT PERMANENT_REDIRECT}.
	 * @return {@link Result}
	 */
	public static Result permanentRedirect(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PERMANENT_REDIRECT);
	}

	/**--------------- BAD_REQUEST -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_REQUEST BAD_REQUEST}.
	 * @return {@link Result}
	 */
	public static Result badRequests(){
		return Result.badRequests(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_REQUEST BAD_REQUEST}.
	 * @return {@link Result}
	 */
	public static Result badRequests(Object body){
		return Result.badRequests(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_REQUEST BAD_REQUEST}.
	 * @return {@link Result}
	 */
	public static Result badRequests(HttpHeaders headers){
		return Result.badRequests(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_REQUEST BAD_REQUEST}.
	 * @return {@link Result}
	 */
	public static Result badRequests(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.BAD_REQUEST);
	}

	/**--------------- UNAUTHORIZED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAUTHORIZED UNAUTHORIZED}.
	 * @return {@link Result}
	 */
	public static Result unauthorized(){
		return Result.unauthorized(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAUTHORIZED UNAUTHORIZED}.
	 * @return {@link Result}
	 */
	public static Result unauthorized(Object body){
		return Result.unauthorized(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAUTHORIZED UNAUTHORIZED}.
	 * @return {@link Result}
	 */
	public static Result unauthorized(HttpHeaders headers){
		return Result.unauthorized(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAUTHORIZED UNAUTHORIZED}.
	 * @return {@link Result}
	 */
	public static Result unauthorized(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.UNAUTHORIZED);
	}

	/**--------------- PAYMENT_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYMENT_REQUIRED PAYMENT_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result paymentRequired(){
		return Result.paymentRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYMENT_REQUIRED PAYMENT_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result paymentRequired(Object body){
		return Result.paymentRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYMENT_REQUIRED PAYMENT_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result paymentRequired(HttpHeaders headers){
		return Result.paymentRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYMENT_REQUIRED PAYMENT_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result paymentRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PAYMENT_REQUIRED);
	}

	/**--------------- FORBIDDEN -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FORBIDDEN FORBIDDEN}.
	 * @return {@link Result}
	 */
	public static Result forbidden(){
		return Result.forbidden(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FORBIDDEN FORBIDDEN}.
	 * @return {@link Result}
	 */
	public static Result forbidden(Object body){
		return Result.forbidden(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FORBIDDEN FORBIDDEN}.
	 * @return {@link Result}
	 */
	public static Result forbidden(HttpHeaders headers){
		return Result.forbidden(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FORBIDDEN FORBIDDEN}.
	 * @return {@link Result}
	 */
	public static Result forbidden(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.FORBIDDEN);
	}

	/**--------------- NOT_FOUND -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_FOUND NOT_FOUND}.
	 * @return {@link Result}
	 */
	public static Result notFounds(){
		return Result.notFounds(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_FOUND NOT_FOUND}.
	 * @return {@link Result}
	 */
	public static Result notFounds(Object body){
		return Result.notFounds(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_FOUND NOT_FOUND}.
	 * @return {@link Result}
	 */
	public static Result notFounds(HttpHeaders headers){
		return Result.notFounds(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_FOUND NOT_FOUND}.
	 * @return {@link Result}
	 */
	public static Result notFounds(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NOT_FOUND);
	}

	/**--------------- METHOD_NOT_ALLOWED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#METHOD_NOT_ALLOWED METHOD_NOT_ALLOWED}.
	 * @return {@link Result}
	 */
	public static Result methodNotAllowed(){
		return Result.methodNotAllowed(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#METHOD_NOT_ALLOWED METHOD_NOT_ALLOWED}.
	 * @return {@link Result}
	 */
	public static Result methodNotAllowed(Object body){
		return Result.methodNotAllowed(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#METHOD_NOT_ALLOWED METHOD_NOT_ALLOWED}.
	 * @return {@link Result}
	 */
	public static Result methodNotAllowed(HttpHeaders headers){
		return Result.methodNotAllowed(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#METHOD_NOT_ALLOWED METHOD_NOT_ALLOWED}.
	 * @return {@link Result}
	 */
	public static Result methodNotAllowed(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.METHOD_NOT_ALLOWED);
	}

	/**--------------- NOT_ACCEPTABLE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_ACCEPTABLE NOT_ACCEPTABLE}.
	 * @return {@link Result}
	 */
	public static Result notAcceptable(){
		return Result.notAcceptable(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_ACCEPTABLE NOT_ACCEPTABLE}.
	 * @return {@link Result}
	 */
	public static Result notAcceptable(Object body){
		return Result.notAcceptable(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_ACCEPTABLE NOT_ACCEPTABLE}.
	 * @return {@link Result}
	 */
	public static Result notAcceptable(HttpHeaders headers){
		return Result.notAcceptable(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_ACCEPTABLE NOT_ACCEPTABLE}.
	 * @return {@link Result}
	 */
	public static Result notAcceptable(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NOT_ACCEPTABLE);
	}

	/**--------------- PROXY_AUTHENTICATION_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROXY_AUTHENTICATION_REQUIRED PROXY_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result proxyAuthenticationRequired(){
		return Result.proxyAuthenticationRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROXY_AUTHENTICATION_REQUIRED PROXY_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result proxyAuthenticationRequired(Object body){
		return Result.proxyAuthenticationRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROXY_AUTHENTICATION_REQUIRED PROXY_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result proxyAuthenticationRequired(HttpHeaders headers){
		return Result.proxyAuthenticationRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PROXY_AUTHENTICATION_REQUIRED PROXY_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result proxyAuthenticationRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PROXY_AUTHENTICATION_REQUIRED);
	}

	/**--------------- REQUEST_TIMEOUT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_TIMEOUT REQUEST_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result requestTimeout(){
		return Result.requestTimeout(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_TIMEOUT REQUEST_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result requestTimeout(Object body){
		return Result.requestTimeout(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_TIMEOUT REQUEST_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result requestTimeout(HttpHeaders headers){
		return Result.requestTimeout(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_TIMEOUT REQUEST_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result requestTimeout(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.REQUEST_TIMEOUT);
	}

	/**--------------- CONFLICT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONFLICT CONFLICT}.
	 * @return {@link Result}
	 */
	public static Result conflict(){
		return Result.conflict(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONFLICT CONFLICT}.
	 * @return {@link Result}
	 */
	public static Result conflict(Object body){
		return Result.conflict(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONFLICT CONFLICT}.
	 * @return {@link Result}
	 */
	public static Result conflict(HttpHeaders headers){
		return Result.conflict(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#CONFLICT CONFLICT}.
	 * @return {@link Result}
	 */
	public static Result conflict(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.CONFLICT);
	}

	/**--------------- GONE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GONE GONE}.
	 * @return {@link Result}
	 */
	public static Result gone(){
		return Result.gone(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GONE GONE}.
	 * @return {@link Result}
	 */
	public static Result gone(Object body){
		return Result.gone(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GONE GONE}.
	 * @return {@link Result}
	 */
	public static Result gone(HttpHeaders headers){
		return Result.gone(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GONE GONE}.
	 * @return {@link Result}
	 */
	public static Result gone(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.GONE);
	}

	/**--------------- LENGTH_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LENGTH_REQUIRED LENGTH_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result lengthRequired(){
		return Result.lengthRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LENGTH_REQUIRED LENGTH_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result lengthRequired(Object body){
		return Result.lengthRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LENGTH_REQUIRED LENGTH_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result lengthRequired(HttpHeaders headers){
		return Result.lengthRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LENGTH_REQUIRED LENGTH_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result lengthRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.LENGTH_REQUIRED);
	}

	/**--------------- PRECONDITION_FAILED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_FAILED PRECONDITION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result preconditionFailed(){
		return Result.preconditionFailed(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_FAILED PRECONDITION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result preconditionFailed(Object body){
		return Result.preconditionFailed(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_FAILED PRECONDITION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result preconditionFailed(HttpHeaders headers){
		return Result.preconditionFailed(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_FAILED PRECONDITION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result preconditionFailed(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PRECONDITION_FAILED);
	}

	/**--------------- PAYLOAD_TOO_LARGE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYLOAD_TOO_LARGE PAYLOAD_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result payloadTooLarge(){
		return Result.payloadTooLarge(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYLOAD_TOO_LARGE PAYLOAD_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result payloadTooLarge(Object body){
		return Result.payloadTooLarge(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYLOAD_TOO_LARGE PAYLOAD_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result payloadTooLarge(HttpHeaders headers){
		return Result.payloadTooLarge(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PAYLOAD_TOO_LARGE PAYLOAD_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result payloadTooLarge(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PAYLOAD_TOO_LARGE);
	}

	/**--------------- URI_TOO_LONG -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#URI_TOO_LONG URI_TOO_LONG}.
	 * @return {@link Result}
	 */
	public static Result uriTooLong(){
		return Result.uriTooLong(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#URI_TOO_LONG URI_TOO_LONG}.
	 * @return {@link Result}
	 */
	public static Result uriTooLong(Object body){
		return Result.uriTooLong(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#URI_TOO_LONG URI_TOO_LONG}.
	 * @return {@link Result}
	 */
	public static Result uriTooLong(HttpHeaders headers){
		return Result.uriTooLong(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#URI_TOO_LONG URI_TOO_LONG}.
	 * @return {@link Result}
	 */
	public static Result uriTooLong(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.URI_TOO_LONG);
	}

	/**--------------- UNSUPPORTED_MEDIA_TYPE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNSUPPORTED_MEDIA_TYPE UNSUPPORTED_MEDIA_TYPE}.
	 * @return {@link Result}
	 */
	public static Result unsupportedMediaType(){
		return Result.unsupportedMediaType(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNSUPPORTED_MEDIA_TYPE UNSUPPORTED_MEDIA_TYPE}.
	 * @return {@link Result}
	 */
	public static Result unsupportedMediaType(Object body){
		return Result.unsupportedMediaType(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNSUPPORTED_MEDIA_TYPE UNSUPPORTED_MEDIA_TYPE}.
	 * @return {@link Result}
	 */
	public static Result unsupportedMediaType(HttpHeaders headers){
		return Result.unsupportedMediaType(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNSUPPORTED_MEDIA_TYPE UNSUPPORTED_MEDIA_TYPE}.
	 * @return {@link Result}
	 */
	public static Result unsupportedMediaType(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.UNSUPPORTED_MEDIA_TYPE);
	}

	/**--------------- REQUESTED_RANGE_NOT_SATISFIABLE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUESTED_RANGE_NOT_SATISFIABLE REQUESTED_RANGE_NOT_SATISFIABLE}.
	 * @return {@link Result}
	 */
	public static Result requestedRangeNotSatisfiable(){
		return Result.requestedRangeNotSatisfiable(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUESTED_RANGE_NOT_SATISFIABLE REQUESTED_RANGE_NOT_SATISFIABLE}.
	 * @return {@link Result}
	 */
	public static Result requestedRangeNotSatisfiable(Object body){
		return Result.requestedRangeNotSatisfiable(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUESTED_RANGE_NOT_SATISFIABLE REQUESTED_RANGE_NOT_SATISFIABLE}.
	 * @return {@link Result}
	 */
	public static Result requestedRangeNotSatisfiable(HttpHeaders headers){
		return Result.requestedRangeNotSatisfiable(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUESTED_RANGE_NOT_SATISFIABLE REQUESTED_RANGE_NOT_SATISFIABLE}.
	 * @return {@link Result}
	 */
	public static Result requestedRangeNotSatisfiable(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.REQUESTED_RANGE_NOT_SATISFIABLE);
	}

	/**--------------- EXPECTATION_FAILED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#EXPECTATION_FAILED EXPECTATION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result expectationFailed(){
		return Result.expectationFailed(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#EXPECTATION_FAILED EXPECTATION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result expectationFailed(Object body){
		return Result.expectationFailed(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#EXPECTATION_FAILED EXPECTATION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result expectationFailed(HttpHeaders headers){
		return Result.expectationFailed(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#EXPECTATION_FAILED EXPECTATION_FAILED}.
	 * @return {@link Result}
	 */
	public static Result expectationFailed(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.EXPECTATION_FAILED);
	}

	/**--------------- I_AM_A_TEAPOT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#I_AM_A_TEAPOT I_AM_A_TEAPOT}.
	 * @return {@link Result}
	 */
	public static Result iAmATeapot(){
		return Result.iAmATeapot(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#I_AM_A_TEAPOT I_AM_A_TEAPOT}.
	 * @return {@link Result}
	 */
	public static Result iAmATeapot(Object body){
		return Result.iAmATeapot(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#I_AM_A_TEAPOT I_AM_A_TEAPOT}.
	 * @return {@link Result}
	 */
	public static Result iAmATeapot(HttpHeaders headers){
		return Result.iAmATeapot(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#I_AM_A_TEAPOT I_AM_A_TEAPOT}.
	 * @return {@link Result}
	 */
	public static Result iAmATeapot(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.I_AM_A_TEAPOT);
	}

	/**--------------- UNPROCESSABLE_ENTITY -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNPROCESSABLE_ENTITY UNPROCESSABLE_ENTITY}.
	 * @return {@link Result}
	 */
	public static Result unprocessableSubstance(){
		return Result.unprocessableSubstance(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNPROCESSABLE_ENTITY UNPROCESSABLE_ENTITY}.
	 * @return {@link Result}
	 */
	public static Result unprocessableSubstance(Object body){
		return Result.unprocessableSubstance(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNPROCESSABLE_ENTITY UNPROCESSABLE_ENTITY}.
	 * @return {@link Result}
	 */
	public static Result unprocessableSubstance(HttpHeaders headers){
		return Result.unprocessableSubstance(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNPROCESSABLE_ENTITY UNPROCESSABLE_ENTITY}.
	 * @return {@link Result}
	 */
	public static Result unprocessableSubstance(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.UNPROCESSABLE_ENTITY);
	}

	/**--------------- LOCKED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOCKED LOCKED}.
	 * @return {@link Result}
	 */
	public static Result locked(){
		return Result.locked(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOCKED LOCKED}.
	 * @return {@link Result}
	 */
	public static Result locked(Object body){
		return Result.locked(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOCKED LOCKED}.
	 * @return {@link Result}
	 */
	public static Result locked(HttpHeaders headers){
		return Result.locked(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOCKED LOCKED}.
	 * @return {@link Result}
	 */
	public static Result locked(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.LOCKED);
	}

	/**--------------- FAILED_DEPENDENCY -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FAILED_DEPENDENCY FAILED_DEPENDENCY}.
	 * @return {@link Result}
	 */
	public static Result failedDependency(){
		return Result.failedDependency(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FAILED_DEPENDENCY FAILED_DEPENDENCY}.
	 * @return {@link Result}
	 */
	public static Result failedDependency(Object body){
		return Result.failedDependency(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FAILED_DEPENDENCY FAILED_DEPENDENCY}.
	 * @return {@link Result}
	 */
	public static Result failedDependency(HttpHeaders headers){
		return Result.failedDependency(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#FAILED_DEPENDENCY FAILED_DEPENDENCY}.
	 * @return {@link Result}
	 */
	public static Result failedDependency(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.FAILED_DEPENDENCY);
	}

	/**--------------- UPGRADE_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UPGRADE_REQUIRED UPGRADE_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result upgradeRequired(){
		return Result.upgradeRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UPGRADE_REQUIRED UPGRADE_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result upgradeRequired(Object body){
		return Result.upgradeRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UPGRADE_REQUIRED UPGRADE_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result upgradeRequired(HttpHeaders headers){
		return Result.upgradeRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UPGRADE_REQUIRED UPGRADE_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result upgradeRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.UPGRADE_REQUIRED);
	}

	/**--------------- PRECONDITION_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_REQUIRED PRECONDITION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result preconditionRequired(){
		return Result.preconditionRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_REQUIRED PRECONDITION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result preconditionRequired(Object body){
		return Result.preconditionRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_REQUIRED PRECONDITION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result preconditionRequired(HttpHeaders headers){
		return Result.preconditionRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#PRECONDITION_REQUIRED PRECONDITION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result preconditionRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.PRECONDITION_REQUIRED);
	}

	/**--------------- TOO_MANY_REQUESTS -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TOO_MANY_REQUESTS TOO_MANY_REQUESTS}.
	 * @return {@link Result}
	 */
	public static Result tooManyRequests(){
		return Result.tooManyRequests(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TOO_MANY_REQUESTS TOO_MANY_REQUESTS}.
	 * @return {@link Result}
	 */
	public static Result tooManyRequests(Object body){
		return Result.tooManyRequests(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TOO_MANY_REQUESTS TOO_MANY_REQUESTS}.
	 * @return {@link Result}
	 */
	public static Result tooManyRequests(HttpHeaders headers){
		return Result.tooManyRequests(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#TOO_MANY_REQUESTS TOO_MANY_REQUESTS}.
	 * @return {@link Result}
	 */
	public static Result tooManyRequests(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.TOO_MANY_REQUESTS);
	}

	/**--------------- REQUEST_HEADER_FIELDS_TOO_LARGE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_HEADER_FIELDS_TOO_LARGE REQUEST_HEADER_FIELDS_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result requestHeaderFieldsTooLarge(){
		return Result.requestHeaderFieldsTooLarge(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_HEADER_FIELDS_TOO_LARGE REQUEST_HEADER_FIELDS_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result requestHeaderFieldsTooLarge(Object body){
		return Result.requestHeaderFieldsTooLarge(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_HEADER_FIELDS_TOO_LARGE REQUEST_HEADER_FIELDS_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result requestHeaderFieldsTooLarge(HttpHeaders headers){
		return Result.requestHeaderFieldsTooLarge(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#REQUEST_HEADER_FIELDS_TOO_LARGE REQUEST_HEADER_FIELDS_TOO_LARGE}.
	 * @return {@link Result}
	 */
	public static Result requestHeaderFieldsTooLarge(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.REQUEST_HEADER_FIELDS_TOO_LARGE);
	}

	/**--------------- UNAVAILABLE_FOR_LEGAL_REASONS -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAVAILABLE_FOR_LEGAL_REASONS UNAVAILABLE_FOR_LEGAL_REASONS}.
	 * @return {@link Result}
	 */
	public static Result unavailableForLegalReasons(){
		return Result.unavailableForLegalReasons(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAVAILABLE_FOR_LEGAL_REASONS UNAVAILABLE_FOR_LEGAL_REASONS}.
	 * @return {@link Result}
	 */
	public static Result unavailableForLegalReasons(Object body){
		return Result.unavailableForLegalReasons(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAVAILABLE_FOR_LEGAL_REASONS UNAVAILABLE_FOR_LEGAL_REASONS}.
	 * @return {@link Result}
	 */
	public static Result unavailableForLegalReasons(HttpHeaders headers){
		return Result.unavailableForLegalReasons(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#UNAVAILABLE_FOR_LEGAL_REASONS UNAVAILABLE_FOR_LEGAL_REASONS}.
	 * @return {@link Result}
	 */
	public static Result unavailableForLegalReasons(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.UNAVAILABLE_FOR_LEGAL_REASONS);
	}

	/**--------------- INTERNAL_SERVER_ERROR -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INTERNAL_SERVER_ERROR INTERNAL_SERVER_ERROR}.
	 * @return {@link Result}
	 */
	public static Result internalServerError(){
		return Result.internalServerError(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INTERNAL_SERVER_ERROR INTERNAL_SERVER_ERROR}.
	 * @return {@link Result}
	 */
	public static Result internalServerError(Object body){
		return Result.internalServerError(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INTERNAL_SERVER_ERROR INTERNAL_SERVER_ERROR}.
	 * @return {@link Result}
	 */
	public static Result internalServerError(HttpHeaders headers){
		return Result.internalServerError(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INTERNAL_SERVER_ERROR INTERNAL_SERVER_ERROR}.
	 * @return {@link Result}
	 */
	public static Result internalServerError(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.INTERNAL_SERVER_ERROR);
	}

	/**--------------- NOT_IMPLEMENTED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_IMPLEMENTED NOT_IMPLEMENTED}.
	 * @return {@link Result}
	 */
	public static Result notImplemented(){
		return Result.notImplemented(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_IMPLEMENTED NOT_IMPLEMENTED}.
	 * @return {@link Result}
	 */
	public static Result notImplemented(Object body){
		return Result.notImplemented(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_IMPLEMENTED NOT_IMPLEMENTED}.
	 * @return {@link Result}
	 */
	public static Result notImplemented(HttpHeaders headers){
		return Result.notImplemented(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_IMPLEMENTED NOT_IMPLEMENTED}.
	 * @return {@link Result}
	 */
	public static Result notImplemented(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NOT_IMPLEMENTED);
	}

	/**--------------- BAD_GATEWAY -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_GATEWAY BAD_GATEWAY}.
	 * @return {@link Result}
	 */
	public static Result badGateway(){
		return Result.badGateway(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_GATEWAY BAD_GATEWAY}.
	 * @return {@link Result}
	 */
	public static Result badGateway(Object body){
		return Result.badGateway(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_GATEWAY BAD_GATEWAY}.
	 * @return {@link Result}
	 */
	public static Result badGateway(HttpHeaders headers){
		return Result.badGateway(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BAD_GATEWAY BAD_GATEWAY}.
	 * @return {@link Result}
	 */
	public static Result badGateway(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.BAD_GATEWAY);
	}

	/**--------------- SERVICE_UNAVAILABLE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SERVICE_UNAVAILABLE SERVICE_UNAVAILABLE}.
	 * @return {@link Result}
	 */
	public static Result serviceUnavailable(){
		return Result.serviceUnavailable(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SERVICE_UNAVAILABLE SERVICE_UNAVAILABLE}.
	 * @return {@link Result}
	 */
	public static Result serviceUnavailable(Object body){
		return Result.serviceUnavailable(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SERVICE_UNAVAILABLE SERVICE_UNAVAILABLE}.
	 * @return {@link Result}
	 */
	public static Result serviceUnavailable(HttpHeaders headers){
		return Result.serviceUnavailable(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#SERVICE_UNAVAILABLE SERVICE_UNAVAILABLE}.
	 * @return {@link Result}
	 */
	public static Result serviceUnavailable(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.SERVICE_UNAVAILABLE);
	}

	/**--------------- GATEWAY_TIMEOUT -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GATEWAY_TIMEOUT GATEWAY_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result gatewayTimeout(){
		return Result.gatewayTimeout(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GATEWAY_TIMEOUT GATEWAY_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result gatewayTimeout(Object body){
		return Result.gatewayTimeout(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GATEWAY_TIMEOUT GATEWAY_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result gatewayTimeout(HttpHeaders headers){
		return Result.gatewayTimeout(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#GATEWAY_TIMEOUT GATEWAY_TIMEOUT}.
	 * @return {@link Result}
	 */
	public static Result gatewayTimeout(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.GATEWAY_TIMEOUT);
	}

	/**--------------- HTTP_VERSION_NOT_SUPPORTED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#HTTP_VERSION_NOT_SUPPORTED HTTP_VERSION_NOT_SUPPORTED}.
	 * @return {@link Result}
	 */
	public static Result httpVersionNotSupported(){
		return Result.httpVersionNotSupported(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#HTTP_VERSION_NOT_SUPPORTED HTTP_VERSION_NOT_SUPPORTED}.
	 * @return {@link Result}
	 */
	public static Result httpVersionNotSupported(Object body){
		return Result.httpVersionNotSupported(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#HTTP_VERSION_NOT_SUPPORTED HTTP_VERSION_NOT_SUPPORTED}.
	 * @return {@link Result}
	 */
	public static Result httpVersionNotSupported(HttpHeaders headers){
		return Result.httpVersionNotSupported(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#HTTP_VERSION_NOT_SUPPORTED HTTP_VERSION_NOT_SUPPORTED}.
	 * @return {@link Result}
	 */
	public static Result httpVersionNotSupported(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.HTTP_VERSION_NOT_SUPPORTED);
	}

	/**--------------- VARIANT_ALSO_NEGOTIATES -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#VARIANT_ALSO_NEGOTIATES VARIANT_ALSO_NEGOTIATES}.
	 * @return {@link Result}
	 */
	public static Result variantAlsoNegotiates(){
		return Result.variantAlsoNegotiates(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#VARIANT_ALSO_NEGOTIATES VARIANT_ALSO_NEGOTIATES}.
	 * @return {@link Result}
	 */
	public static Result variantAlsoNegotiates(Object body){
		return Result.variantAlsoNegotiates(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#VARIANT_ALSO_NEGOTIATES VARIANT_ALSO_NEGOTIATES}.
	 * @return {@link Result}
	 */
	public static Result variantAlsoNegotiates(HttpHeaders headers){
		return Result.variantAlsoNegotiates(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#VARIANT_ALSO_NEGOTIATES VARIANT_ALSO_NEGOTIATES}.
	 * @return {@link Result}
	 */
	public static Result variantAlsoNegotiates(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.VARIANT_ALSO_NEGOTIATES);
	}

	/**--------------- INSUFFICIENT_STORAGE -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INSUFFICIENT_STORAGE INSUFFICIENT_STORAGE}.
	 * @return {@link Result}
	 */
	public static Result insufficientStorage(){
		return Result.insufficientStorage(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INSUFFICIENT_STORAGE INSUFFICIENT_STORAGE}.
	 * @return {@link Result}
	 */
	public static Result insufficientStorage(Object body){
		return Result.insufficientStorage(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INSUFFICIENT_STORAGE INSUFFICIENT_STORAGE}.
	 * @return {@link Result}
	 */
	public static Result insufficientStorage(HttpHeaders headers){
		return Result.insufficientStorage(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#INSUFFICIENT_STORAGE INSUFFICIENT_STORAGE}.
	 * @return {@link Result}
	 */
	public static Result insufficientStorage(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.INSUFFICIENT_STORAGE);
	}

	/**--------------- LOOP_DETECTED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOOP_DETECTED LOOP_DETECTED}.
	 * @return {@link Result}
	 */
	public static Result loopDetected(){
		return Result.loopDetected(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOOP_DETECTED LOOP_DETECTED}.
	 * @return {@link Result}
	 */
	public static Result loopDetected(Object body){
		return Result.loopDetected(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOOP_DETECTED LOOP_DETECTED}.
	 * @return {@link Result}
	 */
	public static Result loopDetected(HttpHeaders headers){
		return Result.loopDetected(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#LOOP_DETECTED LOOP_DETECTED}.
	 * @return {@link Result}
	 */
	public static Result loopDetected(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.LOOP_DETECTED);
	}

	/**--------------- BANDWIDTH_LIMIT_EXCEEDED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BANDWIDTH_LIMIT_EXCEEDED BANDWIDTH_LIMIT_EXCEEDED}.
	 * @return {@link Result}
	 */
	public static Result bandwidthLimitExceeded(){
		return Result.bandwidthLimitExceeded(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BANDWIDTH_LIMIT_EXCEEDED BANDWIDTH_LIMIT_EXCEEDED}.
	 * @return {@link Result}
	 */
	public static Result bandwidthLimitExceeded(Object body){
		return Result.bandwidthLimitExceeded(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BANDWIDTH_LIMIT_EXCEEDED BANDWIDTH_LIMIT_EXCEEDED}.
	 * @return {@link Result}
	 */
	public static Result bandwidthLimitExceeded(HttpHeaders headers){
		return Result.bandwidthLimitExceeded(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#BANDWIDTH_LIMIT_EXCEEDED BANDWIDTH_LIMIT_EXCEEDED}.
	 * @return {@link Result}
	 */
	public static Result bandwidthLimitExceeded(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
	}

	/**--------------- NOT_EXTENDED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_EXTENDED NOT_EXTENDED}.
	 * @return {@link Result}
	 */
	public static Result notExtended(){
		return Result.notExtended(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_EXTENDED NOT_EXTENDED}.
	 * @return {@link Result}
	 */
	public static Result notExtended(Object body){
		return Result.notExtended(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_EXTENDED NOT_EXTENDED}.
	 * @return {@link Result}
	 */
	public static Result notExtended(HttpHeaders headers){
		return Result.notExtended(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NOT_EXTENDED NOT_EXTENDED}.
	 * @return {@link Result}
	 */
	public static Result notExtended(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NOT_EXTENDED);
	}

	/**--------------- NETWORK_AUTHENTICATION_REQUIRED -----------------*/

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NETWORK_AUTHENTICATION_REQUIRED NETWORK_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result networkAuthenticationRequired(){
		return Result.networkAuthenticationRequired(null,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NETWORK_AUTHENTICATION_REQUIRED NETWORK_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result networkAuthenticationRequired(Object body){
		return Result.networkAuthenticationRequired(body,null);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NETWORK_AUTHENTICATION_REQUIRED NETWORK_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result networkAuthenticationRequired(HttpHeaders headers){
		return Result.networkAuthenticationRequired(null,headers);
	}

	/**
	 * Create a builder with the status set to {@linkplain HttpStatus#NETWORK_AUTHENTICATION_REQUIRED NETWORK_AUTHENTICATION_REQUIRED}.
	 * @return {@link Result}
	 */
	public static Result networkAuthenticationRequired(Object body, HttpHeaders headers){
		return new Result(body,headers,HttpStatus.NETWORK_AUTHENTICATION_REQUIRED);
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

	/**--------------- builder mode -----------------*/

	public static BodyBuilder status(HttpStatus status) {
		Assert.notNull(status, "HttpStatus must not be null");
		return new DefaultBuilder(status);
	}

	/**
	 * Defines a builder that adds a body to the response entity.
	 */
	public interface BodyBuilder extends ResponseEntity.BodyBuilder {

		/**
		 * Set the length of the body in bytes, as specified by the
		 * {@code Content-Length} header.
		 * @param contentLength the content length
		 * @return this builder
		 * @see HttpHeaders#setContentLength(long)
		 */
		BodyBuilder contentLength(long contentLength);

		/**
		 * Set the {@linkplain MediaType media type} of the body, as specified by the
		 * {@code Content-Type} header.
		 * @param contentType the content type
		 * @return this builder
		 * @see HttpHeaders#setContentType(MediaType)
		 */
		BodyBuilder contentType(MediaType contentType);

		/**
		 * Set the body of the response entity and returns it.
		 * @param body the body of the response entity
		 * @return the built response entity
		 */
		Result body(@Nullable Object body);
	}

	private static class DefaultBuilder implements BodyBuilder {

		private final HttpStatus statusCode;

		private final HttpHeaders headers = new HttpHeaders();

		public DefaultBuilder(HttpStatus statusCode) {
			this.statusCode = statusCode;
		}

		@Override
		public BodyBuilder header(String headerName, String... headerValues) {
			for (String headerValue : headerValues) {
				this.headers.add(headerName, headerValue);
			}
			return this;
		}

		@Override
		public BodyBuilder headers(@Nullable HttpHeaders headers) {
			if (headers != null) {
				this.headers.putAll(headers);
			}
			return this;
		}

		@Override
		public BodyBuilder allow(HttpMethod... allowedMethods) {
			this.headers.setAllow(new LinkedHashSet<>(Arrays.asList(allowedMethods)));
			return this;
		}

		@Override
		public BodyBuilder contentLength(long contentLength) {
			this.headers.setContentLength(contentLength);
			return this;
		}

		@Override
		public BodyBuilder contentType(MediaType contentType) {
			this.headers.setContentType(contentType);
			return this;
		}

		@Override
		public BodyBuilder eTag(String etag) {
			if (!etag.startsWith("\"") && !etag.startsWith("W/\"")) {
				etag = "\"" + etag;
			}
			if (!etag.endsWith("\"")) {
				etag = etag + "\"";
			}
			this.headers.setETag(etag);
			return this;
		}

		@Override
		public BodyBuilder lastModified(long date) {
			this.headers.setLastModified(date);
			return this;
		}

		@Override
		public BodyBuilder location(URI location) {
			this.headers.setLocation(location);
			return this;
		}

		@Override
		public BodyBuilder cacheControl(CacheControl cacheControl) {
			String ccValue = cacheControl.getHeaderValue();
			if (ccValue != null) {
				this.headers.setCacheControl(cacheControl.getHeaderValue());
			}
			return this;
		}

		@Override
		public BodyBuilder varyBy(String... requestHeaders) {
			this.headers.setVary(Arrays.asList(requestHeaders));
			return this;
		}

		@Override
		public Result build() {
			return body(null);
		}

		@Override
		public Result body(@Nullable Object body) {
			return new Result(body,this.headers,this.statusCode);
		}
	}
}
