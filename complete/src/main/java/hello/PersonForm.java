package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    // add street address and email, years of experience, and a long
    // add more data labels & fields
    // append these to the text file

    /*
    1) Please fork this repo:
    https://github.com/payne/gs-validating-form-input  
    Background reading is at https://spring.io/guides/gs/validating-form-input/ 
    2) run it.   I like: `gradle bootRun`
    3) Add some fields and validations
    4) Write a method: savePerson(String fileName, PersonForm person) to append a CSV line to a file -- the data in the line should be from one instance of PersonForm
    5) call savePerson just before checkPersonInfo return results

    Send me a pull request with your changes.   Thanks! --Matt Payne
    */

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
