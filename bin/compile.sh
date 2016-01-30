#!/bin/sh

mkdir -p target/classes
javac -d target/classes -classpath src/main/java/me/kuk/game/card/blackjack:lib/servlet-api-3.1.jar src/main/java/me/kuk/game/card/blackjack/*.java
mv src/main/java/me/kuk/card/blackjack/*.class target/classes
cd target
jar cvf Blackjack.war WEB-INF
cp Blackjack.war $HOME/jetty-distribution-9.3.6.v20151106/webapps

