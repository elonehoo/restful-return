# Getting Started

## Overview

restful-return is a result powered by springBoot.

You can learn more project in the [Why restful-return](./why) section.

## Adding restful-return to your Project

:::: code-group
::: code-group-item maven
```xml:no-line-numbers
<dependency>
  <groupId>io.github.xiaoxunyao</groupId>
  <artifactId>restful-return</artifactId>
  <version>0.0.3</version>
</dependency>
```
:::
::: code-group-item gradle
```xml:no-line-numbers
implementation 'io.github.xiaoxunyao:restful-return:0.0.3'
```
:::
::::

## Examples

:::: code-group
::: code-group-item base API
```java:no-line-numbers
@GetMapping("/demo")
public Result demo(){
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 10; i++){
		list.add(String.valueOf(i));
	}
	return Result.internalServerError(list);
}
```
:::
::: code-group-item builder API
```java
@GetMapping("/demo1")
public Result demo1(){
	List<String> list = new ArrayList<>();
	for (int i = 0; i < 10; i++) {
		list.add(String.valueOf(i));
	}
	return Result.status(HttpStatus.CONTINUE).body(list);
}
```
:::
::::

## Using Unreleased Commits

If you can't wait for a new release to test the latest features, you will need to clone the [restful-return repo](https://github.com/xiaoxunyao/restful-return) to your local machine and then build and link it yourself ([maven](https://maven.apache.org/) is required):

```bash
git clone git@github.com:xiaoxunyao/restful-return.git
cd restful-return
maven install
```
