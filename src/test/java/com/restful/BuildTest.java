package com.restful;


import com.restful.header.HttpHeaders;
import com.restful.http.HttpStatus;

public class BuildTest {
	public static void main(String[] args) {
		Result.status(HttpStatus.BAD_GATEWAY).headers(HttpHeaders.EMPTY).body("1");
		Result.status(200).headers(HttpHeaders.EMPTY).body("1");
	}

}
