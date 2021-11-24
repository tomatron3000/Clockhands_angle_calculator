# Clockhands_angle_calculator
A Java Program that calculates the angle between the hands on the clock

The code works by taking a users input with a scanner and then inputting it into calculation that first takes the first two charcters for the hour and the 3rd and 4th for the 
minutes, i then turn both into floats. after some validations which check if the hours are correct and or the minutes are within the range.

After i just change the hours from 24 to 12 hour clock i check whether the minute hand is ahead of the hour hand so i know which way to calculate the angle 
(if the minute hand is ahead ill take use minute angle - hours to get the difference and then vice versa for the hour ahead of minute hand)
to calculate i just divided the clock into equal angles for each hour and minute and then added them up.
then i check to see if its the smallest angle between each one and then return that and it prints 

In the main class i just make a input and take it, i run a try catch exception to catch errors so the code can repeat in the even of an error and then i run that within a loop
