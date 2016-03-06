# Shouter

> A simple Clojure web app, using ring, composure and hiccup. Short text messages called "shouts" can be entered and the last 100 shouts are shown on the page.
>
> Shout text strings are stored in a postgres database

Clojure 练手项目，根据[Building a Database-Backed Clojure Web Application](https://devcenter.heroku.com/articles/clojure-web-application#src-shouter-models-migration-clj)步骤开发完成，感谢[原作者](https://github.com/technomancy/shouter)

# 依赖项

- org.clojure/clojure "1.8.0"
- org.clojure/java.jdbc "0.3.7"
- mysql/mysql-connector-java "5.1.25"
- ring/ring-jetty-adapter "1.4.0"
- compojure "1.4.0"
- ring/ring-defaults "0.1.2"
- hiccup "1.0.5"
- korma "0.4.2"

# 我的收获

1. 巩固了 Clojure 基本语法
2. 加深了函数式编程的思想
3. 学会了 使用 Leiningen 构建项目
4. 熟悉了基于 ring + compojure + hiccup 的 web 应用开发流程和框架结构
5. 学会了使用 Clojure 操作数据库
6. 学会了发布 web 应用
