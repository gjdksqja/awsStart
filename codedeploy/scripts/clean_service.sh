#!/bin/sh


# war 기존 파일 삭제 및 재 설치
DEPLOYFILE='/var/www/html/webapp/awsStart.war'

if [ -f "$DEPLOYFILE" ]; then

	rm -f $DEPLOYFILE

fi