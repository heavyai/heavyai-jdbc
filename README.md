[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.omnisci/omnisci-jdbc/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.omnisci/omnisci-jdbc)

## Specifying Maven Dependency

```xml
<dependency>
  <groupId>com.omnisci</groupId>
  <artifactId>omnisci-jdbc</artifactId>
  <version>4.8.0</version>
</dependency>
```

### Before 4.8.0

```xml
<dependency>
  <groupId>com.omnisci</groupId>
  <artifactId>jdbc</artifactId>
  <version>4.7.0</version>
</dependency>
```

## Basic testing
From the top level directory run:
```shell
set +H
mvn test -DskipTests=false -Dtest=!com.omnisci.jdbc.OmniSciConnectionTest#tst1b_binary_encrypted_default+tst1c_binary_encrypted_supplied_truststore_pkiauth_valid+tst1e_binary_encrypted_supplied_truststore_pkiauth_invalid+tst3a_https_encrypted_without_server_validation_default_truststore+tst3b_https_encrypted_without_server_validation_supplied_truststore+tst3c_https_encrypted_server_validation_default_truststore+tst3d_https_encrypted_with_server_validation_supplied_truststore+tst3e_https_insecure_encrypted_supplied_truststore_pkiauth_valid+tst4_https_encrypted_with_server_validation+tst5_properties_connection
```
*Note: the unit tests assume that local heavydb is running and default user and database exist*

## Bulding jar with dependencies
To build jar with dependencies use the `fatjar` maven profile. For example: `mvn clean install -Pfatjar`.
