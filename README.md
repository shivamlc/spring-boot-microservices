# spring-boot-microservices

## Notes

**When to specify `driver-class-name`**

If you are using Spring Boot with JPA, you do not need to explicitly specify `driver-class-name`: `org.h2.Driver` in most cases. Spring Boot can automatically detect the correct driver based on the JDBC URL.

**Why?**

Spring Boot’s auto-configuration handles this automatically when you include the H2 and JPA dependencies in pom.xml.


**How Spring Boot Handles It ?**
When Spring Boot detects H2 and Spring Data JPA, it:

Selects org.h2.Driver automatically.

Configures an embedded H2 database (jdbc:h2:mem:testdb by default).

Enables the H2 console (/h2-console) if spring.h2.console.enabled=true.

**Recommended application.properties for H2 + JPA**
```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

```

**When Should You Manually Set driver-class-name?**
If you're using manual JDBC configuration instead of relying on Spring Boot.

If you're working with multiple databases and need explicit driver configuration.
