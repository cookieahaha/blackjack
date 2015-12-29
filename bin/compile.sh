#!/bin/sh

mkdir -p target/classes
javac -d target/classes -classpath lib/servlet-api-3.1.jar src/main/java/me/kuk/game/card/blackjack/*.java

