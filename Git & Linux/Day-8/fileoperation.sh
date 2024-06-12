#!/bin/bash

file()
{
if [ -e $1 ]
then
 echo "$1 file exists"
 lines=$(wc -l < $1)
 echo "The number of lines in file are $lines"
 words=$(wc -w < $1)
 echo "The number of words in the file are $words"
else
 echo "File doesnt exist"
fi
}

file variable.sh
file demo.txt
