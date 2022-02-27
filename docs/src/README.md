---
home: true
title: Home
heroImage: logo/logo.svg
actions:
  - text: Get Started
    link: /guide/getting-started.html
    type: primary
  - text: Introduction
    link: /guide/
    type: secondary
footer: MIT Licensed | Copyright © 2022-present Elone Hoo
---

### As easy as counting.

:::: code-group
::: code-group-item install
```xml:no-line-numbers
<dependency>
  <groupId>io.github.xiaoxunyao</groupId>
  <artifactId>restful-return</artifactId>
  <version>0.0.1</version>
</dependency>
```
:::
::: code-group-item using
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
::::
