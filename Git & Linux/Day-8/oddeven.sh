#!/bin/bash

oddeven()
{
read -p"Enter number: " num

if [ $num == 0 ]
 then
 echo "0 is not odd or even."
else
 if(($num%2==0))
 then
 echo "$num is even number"
 else
 echo "$num is odd number"
 fi
 oddeven
fi
}

oddeven
