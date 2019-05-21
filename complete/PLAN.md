Comments from PersonForm.java

add street address and email, years of experience, and a long
add more data labels & fields
append these to the text file

open it
output to it (write data to the file)
close it

writer the class printWriter is a favorite
reader the class lineNumberReader is a favorite

create hello.txt
write "Hello World" to the file
close the file
    
1) Please fork this repo:
https://github.com/payne/gs-validating-form-input  
Background reading is at https://spring.io/guides/gs/validating-form-input/ 
2) run it.   I like: `gradle bootRun`
3) Add some fields and validations
4) Write a method: savePerson(String fileName, PersonForm person) to append a CSV line to a file -- the data in the line should be from one instance of PersonForm
5) call savePerson just before checkPersonInfo return results

Send me a pull request with your changes.   Thanks! --Matt Payne

Unsuccessful adding a Long (or long?) field/value.  Instead using a 5 digit zip code.  The range is 00501 - 99950

Source:
From the United States Postal Service website: “The lowest ZIP Code is 00501, a unique ZIP Code for the Internal Revenue Service in Holtsville, NY.” “The highest ZIP Code is 99950 in Ketchikan, AK.”Sep 23, 2018
What is the lowest Zip Code and what is the highest Zip Code in ...
https://www.quora.com/What-is-the-lowest-Zip-Code-and-what-is-the-highest-Zip-Code-...

Notes for attempting to add a long to the form:
source: https://www.baeldung.com/javax-validation

See line 29 in PersonForm.java.  A value of 1000 will pass the validation for the minimum valid US 5 digit zip code.
https://stackoverflow.com/questions/48330611/min-annotation-not-working

WebController.java line 25:
Matts comment:
OH! I see now. You're calling this as if it's a static method. But it's a normal method.
You want: personForm.savePerson("data.txt", personForm); later we can talk about making this more elegant. For now please try this and tell me what happens?

I've forgotten (if I ever really understood) the difference between calling a method in a static way and a normal way.  I wish to discuss please.