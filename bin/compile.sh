#!/bin/sh
rm -rf target/WEB-INF/classes
mkdir -p target/WEB-INF/classes
javac -d target/WEB-INF/classes -classpath lib/servlet-api-3.1.jar src/main/java/me/kuk/game/card/blackjack/*.java
cd target
jar cvf Blackjack.war WEB-INF image
cp Blackjack.war $HOME/jetty-distribution-9.3.6.v20151106/webapps

