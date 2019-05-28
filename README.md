## Basic testing
From the top level directory run:
```shell
set +h
mvn test -DskipTests=false -Dtest=!com.omnisci.jdbc.OmniSciConnectionTest#tst1a_binary_encrypted+tst2_http_unencrypted+tst3_https_encrypted+tst4_https_encrypted_with_server_validation
```
*Note: the unit tests assume that local omniscidb is running and default user and database exist*
