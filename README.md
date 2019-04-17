# robot-prototype

ROBOT APPLICATION


#OBJECTIVE

•	Extensible – easily adaptable to future enhancements
•	Highly cohesive and loosely coupled
•	Good use of OOPS concepts
•	Make use of design pattern wherever possible
•	Code should be clean. Avoid code smells.
•	Can easily be unit tested. If possible, write unit tests

A company working in artificial intelligence domain is planning to create a Robot. But before they do heavy investment in Robot research and development, they requested their technical team to do a small prototype and create a Robot with some basic features. 

Technical team decided to introduce following features in the Robot prototype:

#Power Operated:
1.	Robot works on battery and can walk for 5 km per charge. 
2.	If remaining battery is less than 15%, a red light on Robot head should lit up indicating low battery.

#Handling physical objects:
3.	Robot can carry any object not weighing more than 10 Kg.
4.	For every Kilogram carried by Robot, 2% extra [in addition to walking discharge] battery will be consumed.
5.	If the weight of the object is more than 10 Kg, Robot display [LED display on chest] will show message “Overweight”.

#Scanning:
6.	Robot can scan any bar code and display it's price on Robot Display.
7.	In case bar code is not clear enough for scanning, Robot display will show “Scan Failure”.

Technical team handed over these details to IT team to build a software for Robot. Please create a Robot application in Java for automating all the features listed above. 

Create Junits to test these functionalities. Also, please provide out of how much battery is remaining in following scenarios:

Robot walks for 3.5 KM	
Robot walks for 2 Km carrying 3 Kg weight	
Robot carries 12 Kg weight.	

Following are acceptable assumptions:
1.	Display Message can be programmed as System.out.println.
2.	There is no need for creating bar code scanning functionality. We can assume that we already have an api which does that for us.


#Solution:

Designed the robot prototype application by following OOP and SOLID principles.
1. Abstract class is used for default behaviors of a proto-type robot such as power check, put charging, can Carry etc..
2. Robot capabilities (like Walk,Carry,WalkandCarry) can be implemented using interfaces.
3. Constatnts class used access properties.
4. Charge class provides the calaculations.

#Assumptions:
1. If the scanned value is even number it will display the price otherwise prints "Scan Failure"
   have used the random integer generation as scanner API has to be assumed.
2. 100% charge is taken as full charge
3. robot will allow integer weighs
4. robot upfront checks the reuired task for the given task, it fails if required charge greater than available charge.

#Calculation:
1. Robot can walk for 5KM per charge, so 50M per 1% charge.

