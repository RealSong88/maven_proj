#!/bin/bash
echo `pwd` > /home/ec2-user/new.log
whoami
it

cd /home/ec2-user
docker build -t maven_p_was .

docker run -itd -p 8080:8080 --name maven_was-app maven_p_was
