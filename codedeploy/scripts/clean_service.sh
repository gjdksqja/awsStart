#!/bin/sh


# war ���� ���� ���� �� �� ��ġ
DEPLOYFILE='/var/www/html/webapp/awsStart.war'

if [ -f "$DEPLOYFILE" ]; then

	rm -f $DEPLOYFILE

fi