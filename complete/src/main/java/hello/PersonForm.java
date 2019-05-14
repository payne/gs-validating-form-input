package hello;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Long;

public class PersonForm {

    @NotNull
    @Size(min=2, max=30)
    private String name;

    @NotNull
    @Min(18)
    private Integer age;

    @NotNull
    @Min(2)
    private Integer yearsExperience;

    // @NotNull would not prevent successful submission when leaving email blank
    @NotEmpty
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty
    @Min(-9223372036854775808)
    @Max(9223372036854775807)
    // This does nto work.  Min and Max are Integers, these are too large.
    private Long exampleLong;
    // source: https://www.baeldung.com/javax-validation

    // add street address and email, years of experience, and a long
    // add more data labels & fields
    // append these to the text file

    /*
    open it
    output to it (write data to the file)
    close it

    writer the class printWriter is a favorite
    reader the class lineNumberReader is a favorite

    create hello.txt
    write "Hello World" to the file
    close the file

    */

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

    public Integer getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(Integer yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getLong() {
        return this.exampleLong;
    }

    public void setLong(Long exampleLong) {
        return this.exampleLong;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}
