#!/bin/bash

FILE=/home/ec2-user/maven_proj
if [ -d "${FILE}/target" ]; then
	rm -rf "${FILE}/target"
	rm -rf "${FILE}/Dockerfile"
fi

conFlag=`docker images was -q`

if [ "$conFlag" ]; then
    echo "docker image delete...."
    docker rm -f was-app
    docker rmi was
fi
