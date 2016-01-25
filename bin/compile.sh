#!/bin/sh

mkdir -p target/classes
javac -d target/classes -classpath src/main/java/me/kuk/game/card/blackjack:lib/servlet-api-3.1.jar src/main/java/me/kuk/game/card/blackjack/*.java
mv src/main/java/me/kuk/card/blackjack/*.class target/classes
jar cvf target/Blackjack.war target/WEB-INF
cp target/Blackjack.war $HOME/jetty-distribution-9.3.6.v20151106/webapps

