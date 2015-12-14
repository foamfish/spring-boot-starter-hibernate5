Spring Boot Starter Hibernate5
=============================================
在Spring Boot下整合Hibernate5,方便客户端使用.

### 如何使用

* 在Spring Boot项目的pom.xml中添加以下依赖:

          <dependency>
                 <groupId>org.mvnsearch.spring.boot</groupId>
                 <artifactId>spring-boot-starter-hibernate5</artifactId>
                 <version>1.0.0-SNAPSHOT</version>
          </dependency>
          <dependency>
                 <groupId>org.hibernate</groupId>
                 <artifactId>hibernate-core</artifactId>
                 <version>${hibernate.version}</version>
          </dependency>
          <dependency>
                 <groupId>org.hibernate</groupId>
                 <artifactId>hibernate-entitymanager</artifactId>
                 <version>${hibernate.version}</version>
                 <exclusions>
                     <exclusion>
                          <groupId>org.jboss.spec.javax.transaction</groupId>
                          <artifactId>jboss-transaction-api_1.2_spec</artifactId>
                     </exclusion>
                 </exclusions>
          </dependency>

* 在Spring Boot的application.properties文件中添加http client的一些相关配置,当然也可以不需要配置如下:
                    
          spring.hibernate.config=/hibernate.cfg.xml

* 接下来在你的代码中直接应用cacheManager，然后就可以啦。
        
            @Autowired
            private HibernateTemplate hibernateTemplate;

### spring-boot-start-hibernate5提供的服务

* org.hibernate.SessionFactory: hibernate session factory
* org.springframework.orm.hibernate5.HibernateTemplate: hibernate 5 template


### 参考文档

* Hibernate: http://hibernate.org/