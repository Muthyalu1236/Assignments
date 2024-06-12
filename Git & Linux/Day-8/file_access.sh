#!/bin/bash

read -p"Enter the file name: " filename

if [ -e $filename ]
then
 echo "file exists"
else
 echo "file does not exist"
fi


echo "Checking file read permission"

if [ -r $filename ]
then 
 echo "file has read permission"
else
 echo "file does not have read permission"
fi
