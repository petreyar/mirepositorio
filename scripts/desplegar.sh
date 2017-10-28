#!/bin/bash

mvn compile -f /home/ec2-user/desarrollo/com.basic.example/pom.xml

java -jar /home/ec2-user/desarrollo/com.basic.example/target/com.basic.example-0.0.1-SNAPSHOT.jar