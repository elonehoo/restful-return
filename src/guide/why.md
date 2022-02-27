# Why restful-return

::: tip
This guide assumes that you are familiar with restful. A good way to start learning more is to read the [What is REST](https://restfulapi.net/).
:::

When using SpringBoot, many students will create a `Result` class for RESTful return value, but the return value accepted by the browser needs to have the real `state code` in `response.body`. reasonable. So I created this project to change the `state code` of `Response` to what we want.

## How is restful-return Different from X?

You can check out the [this blog](https://blog.elonehoo.xyz/posts/building-restful-web.html) for more details on how restful-return differs from other similar result-tools.
