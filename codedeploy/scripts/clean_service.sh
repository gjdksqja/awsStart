#!/bin/sh


# war ���� ���� ���� �� �� ��ġ
DEPLOYFILE='/home/tomcat/webapps/apps.war'

if [ -f "$DEPLOYFILE" ]; then

	rm -f $DEPLOYFILE

fi