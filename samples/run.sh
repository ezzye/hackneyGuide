#!/usr/bin/env bash

# Change the sig check on prod
cd /Users/ellioe03/workspace/hackneyGuideJava/samples
mvn exec:java -Dexec.executable="java" -DdisableRequestSignatureCheck=true -Dexec.args=$@
# -Djavax.net.debug=ssl
